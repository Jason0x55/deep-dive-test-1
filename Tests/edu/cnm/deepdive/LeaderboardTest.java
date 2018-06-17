package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeaderboardTest {

  private static final int[] COMPETITION_OUPUT_ONE = {8, 6, 3, 1};
  private static final int[] COMPETITION_OUPUT_TWO = {7, 6, 3, 2};
  private static final int[] DENSE_OUTPUT_ONE = {6, 4, 2, 1};
  private static final int[] DENSE_OUTPUT_TWO = {5, 4, 3, 2};
  private static final int[] LEADERBOARD_ONE = {100, 100, 50, 40, 40, 20, 10};
  private static final int[] LEADERBOARD_TWO = {100, 90, 80, 80, 80, 20};
  private static final int[] SCORES_ONE = {5, 25, 50, 120};
  private static final int[] SCORES_TWO = {10, 50, 80, 90};

  @Test
  void getCompetitionRanking() {
    assertArrayEquals(COMPETITION_OUPUT_ONE, Leaderboard.getCompetitionRanking(LEADERBOARD_ONE, SCORES_ONE));
    assertArrayEquals(COMPETITION_OUPUT_TWO, Leaderboard.getCompetitionRanking(LEADERBOARD_TWO, SCORES_TWO));
  }

  @Test
  void getDenseRanking() {
    assertArrayEquals(DENSE_OUTPUT_ONE, Leaderboard.getDenseRanking(LEADERBOARD_ONE, SCORES_ONE));
    assertArrayEquals(DENSE_OUTPUT_TWO, Leaderboard.getDenseRanking(LEADERBOARD_TWO, SCORES_TWO));
  }
}