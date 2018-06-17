package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeaderboardTest {
  private static final int[] RESULT_ONE = {8, 6, 3, 1};
  private static final int[] RESULT_TWO = {7, 6, 3, 2};

  @Test
  void getCompetitionRanking() {
    assertArrayEquals(RESULT_ONE, Leaderboard.getCompetitionRanking(
        new int[] {100, 100, 50, 40, 40, 20, 10}, new int[] {5, 25, 50, 120}));
    assertArrayEquals(RESULT_TWO, Leaderboard.getCompetitionRanking(
        new int[] {100, 90, 80, 80, 80, 20}, new int[] {10, 50, 80, 90}));
  }
}