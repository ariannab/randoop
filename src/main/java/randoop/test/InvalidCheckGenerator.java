package randoop.test;

import randoop.sequence.ExecutableSequence;

/** Generates invalid checks. */
public class InvalidCheckGenerator extends TestCheckGenerator {
  @Override
  public InvalidChecks generateTestChecks(ExecutableSequence eseq) {
    // this is a hack to ensure that if get here from a throws-condition that counted as param
    InvalidChecks checks = new InvalidChecks();
    checks.add(new InvalidValueCheck(eseq, eseq.sequence.size() - 1));
    return checks;
  }
}
