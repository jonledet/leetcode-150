package com.jonledet.randomizedset;

import java.util.Map;
import java.util.List;
import java.util.Random;

/*
 * 380. Insert Delete GetRandom O(1)
 *
 * Runtime:
 * 24 ms
 * Beats 80.79%
 *
 * Memory:
 * 93.58 MB
 * Beats 20.33%
 */

public class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;
    Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int lastVal = list.get(list.size() - 1);

        // Replace the element to be removed with the last element
        list.set(index, lastVal);
        map.put(lastVal, index);

        // Remove the last element from the list
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
