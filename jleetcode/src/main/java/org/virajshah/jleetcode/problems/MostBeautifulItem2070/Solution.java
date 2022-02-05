package org.virajshah.jleetcode.problems.MostBeautifulItem2070;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        // Price to (Maximum) Beauty map
        Map<Integer, Integer> pToB = new HashMap<>();
        pToB.put(0, 0);

        // The most maximum beauty acheived so far in sorted items
        int maxBeauty = 0;

        // Iterate through each item and assign a max beauty
        for (int[] item : items) {
            maxBeauty = Math.max(maxBeauty, item[1]);
            pToB.put(item[0], maxBeauty);
        }

        // Iterate through each query and check if is already assigned
        for (int q : queries)
            if (pToB.get(q) == null)
                pToB.put(q, -1);

        Set<Integer> keyset = pToB.keySet();
        int[] keylist = new int[keyset.size()];
        int i = 0;
        for (int n : keyset) {
            keylist[i] = n;
            i++;
        }
        Arrays.sort(keylist);

        for (i = 0; i < keylist.length; i++)
            if (pToB.get(keylist[i]) == -1)
                pToB.put(keylist[i], pToB.get(keylist[i - 1]));

        int[] res = new int[queries.length];
        for (i = 0; i < queries.length; i++) {
            res[i] = pToB.get(queries[i]);
        }

        return res;
    }
}