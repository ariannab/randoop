package randoop.test;

import java.util.Collections;
import java.util.Set;

/** Added to handle identification of false alarms from failed preconditions. */
public class FalseAlarmTestChecks extends InvalidChecks {

  private Check check;

  @Override
  public int count() {
    int result = 0;
    if (check != null) {
      result = 1;
    }
    return result;
  }

  @Override
  public Set<Check> checks() {
    if (check != null) {
      return Collections.singleton(check);
    } else {
      return Collections.emptySet();
    }
  }

  @Override
  public boolean hasChecks() {
    return check != null;
  }

  @Override
  public boolean hasErrorBehavior() {
    return false;
  }

  @Override
  public ExceptionCheck getExceptionCheck() {
    if (check instanceof ExceptionCheck) {
      return (ExceptionCheck) check;
    }
    return null;
  }

  @Override
  public void add(Check check) {
    this.check = check;
  }

  @Override
  public InvalidChecks commonChecks(InvalidChecks checks) {
    if (!(checks instanceof FalseAlarmTestChecks)) {
      throw new IllegalArgumentException("Must compare with an InvalidChecks object");
    }
    FalseAlarmTestChecks ic = (FalseAlarmTestChecks) checks;
    InvalidChecks common = new InvalidChecks();
    if (this.check != null && check.equals(ic.check)) {
      common.add(check);
    }
    return common;
  }

  @Override
  public boolean hasInvalidBehavior() {
    return check != null;
  }
}
