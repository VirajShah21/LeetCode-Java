package org.virajshah.jleetcode.problems.ClosestRoom1847;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private class RoomManager {
        private int[][] rooms;

        public RoomManager(int[][] rooms) {
            this.rooms = rooms;
        }

        public int query(int preferred, int minSize) {
            List<Integer> correctSize = new ArrayList<>();
            for (int[] room : rooms) {
                if (room[1] >= minSize) {
                    correctSize.add(room[0]);
                }
            }
            if (correctSize.size() == 0)
                return -1;
            correctSize.sort((a, b) -> Math.abs(a - preferred) - Math.abs(b - preferred));
            if (correctSize.size() > 1 && Math.abs(correctSize.get(0) - preferred) == Math
                    .abs(correctSize.get(1) - preferred))
                return Math.min(correctSize.get(0), correctSize.get(1));
            return correctSize.get(0);
        }
    }

    private class QueryThread extends Thread {
        private int[] query;
        private RoomManager rm;
        private int[] results;
        private int targetIndex;

        public QueryThread(RoomManager rm, int[] query, int[] results, int targetIndex) {
            super();
            this.query = query;
            this.rm = rm;
            this.results = results;
            this.targetIndex = targetIndex;
        }

        public void run() {
            results[targetIndex] = rm.query(query[0], query[1]);
        }
    }

    public int[] closestRoom(int[][] rooms, int[][] queries) {
        int[] results = new int[queries.length];
        RoomManager rm = new RoomManager(rooms);
        Thread[] threads = new Thread[queries.length];
        // Iterate over queries
        for (int q = 0; q < queries.length; q++) {
            // results[q] = rm.query(queries[q][0], queries[q][1]);
            threads[q] = new QueryThread(rm, queries[q], results, q);
            threads[q].start();
        }
        try {
            for (Thread t : threads)
                t.join();
        } catch (InterruptedException e) {
        }

        return results;
    }
}
