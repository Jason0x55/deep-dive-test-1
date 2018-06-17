package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaircaseTest {
  private static final String[] FIVE_STEPS = {
      "    *",
      "   **",
      "  ***",
      " ****",
      "*****",
  };
  private static final String[] TWO_STEPS = {
      " *",
      "**",
  };

  @Test
  void buildLinearStaircase() {
    assertArrayEquals(TWO_STEPS, Staircase.buildLinearStaircase(2));
    assertArrayEquals(FIVE_STEPS, Staircase.buildLinearStaircase(5));
  }
}