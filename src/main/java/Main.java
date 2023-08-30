import data_structures.binary_search_tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class Main {

    public static void main(String[] args) {
        lol();
    }

    public static void lol() {
        List<Integer> ranked = List.of(295, 294, 291, 287, 287, 285, 285, 284, 283, 279, 277, 274, 274, 271, 270, 268, 268, 268, 264, 260, 259, 258, 257, 255, 252, 250, 244, 241, 240, 237, 236, 236, 231, 227, 227, 227, 226, 225, 224, 223, 216, 212, 200, 197, 196, 194, 193, 189, 188, 187, 183, 182, 178, 177, 173, 171, 169, 165, 143, 140, 137, 135, 133, 130, 130, 130, 128, 127, 122, 120, 116, 114, 113, 109, 106, 103, 99, 92, 85, 81, 69, 68, 63, 63, 63, 61, 57, 51, 47, 46, 38, 30, 28, 25, 22, 15, 14, 12, 6, 4);
        List<Integer> player = List.of(5, 5, 6, 14, 19, 20, 23, 25, 29, 29, 30, 30, 32, 37, 38, 38, 38, 41, 41, 44, 45, 45, 47, 59, 59, 62, 63, 65, 67, 69, 70, 72, 72, 76, 79, 82, 83, 90, 91, 92, 93, 98, 98, 100, 100, 102, 103, 105, 106, 107, 109, 112, 115, 118, 118, 121, 122, 122, 123, 125, 125, 125, 127, 128, 131, 131, 133, 134, 139, 140, 141, 143, 144, 144, 144, 144, 147, 150, 152, 155, 156, 160, 164, 164, 165, 165, 166, 168, 169, 170, 171, 172, 173, 174, 174, 180, 184, 187, 187, 188, 194, 197, 197, 197, 198, 201, 202, 202, 207, 208, 211, 212, 212, 214, 217, 219, 219, 220, 220, 223, 225, 227, 228, 229, 229, 233, 235, 235, 236, 242, 242, 245, 246, 252, 253, 253, 257, 257, 260, 261, 266, 266, 268, 269, 271, 271, 275, 276, 281, 282, 283, 284, 285, 287, 289, 289, 295, 296, 298, 300, 300, 301, 304, 306, 308, 309, 310, 316, 318, 318, 324, 326, 329, 329, 329, 330, 330, 332, 337, 337, 341, 341, 349, 351, 351, 354, 356, 357, 366, 369, 377, 379, 380, 382, 391, 391, 394, 396, 396, 400);

        List<Integer> answers = List.of(88,
                88,
                87,
                85,
                84,
                84,
                83,
                82,
                81,
                81,
                80,
                80,
                80,
                80,
                79,
                79,
                79,
                79,
                79,
                79,
                79,
                79,
                77,
                75,
                75,
                74,
                73,
                73,
                73,
                71,
                71,
                71,
                71,
                71,
                71,
                70,
                70,
                69,
                69,
                68,
                68,
                68,
                68,
                67,
                67,
                67,
                66,
                66,
                65,
                65,
                64,
                64,
                62,
                61,
                61,
                60,
                59,
                59,
                59,
                59,
                59,
                59,
                58,
                57,
                56,
                56,
                55,
                55,
                53,
                52,
                52,
                51,
                51,
                51,
                51,
                51,
                51,
                51,
                51,
                51,
                51,
                51,
                51,
                51,
                50,
                50,
                50,
                50,
                49,
                49,
                48,
                48,
                47,
                47,
                47,
                45,
                43,
                42,
                42,
                41,
                38,
                36,
                36,
                36,
                36,
                35,
                35,
                35,
                35,
                35,
                35,
                34,
                34,
                34,
                33,
                33,
                33,
                33,
                33,
                32,
                30,
                28,
                28,
                28,
                28,
                27,
                27,
                27,
                26,
                23,
                23,
                22,
                22,
                20,
                20,
                20,
                18,
                18,
                15,
                15,
                14,
                14,
                13,
                13,
                11,
                11,
                10,
                10,
                8,
                8,
                7,
                6,
                5,
                4,
                4,
                4,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1,
                1);

        List<Integer> places = climbingLeaderboard(ranked, player);

        for(int i = 0; i < places.size(); i++) {
            boolean same = places.get(i).intValue() == answers.get(i).intValue();

            if(!same)
            System.out.println("INDEX " + i + " PLACE " + places.get(i) + "ANSWER " + answers.get(i));

        }

    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> places = new ArrayList();
        List<Integer> rankedClean = new ArrayList();

        for (int i = 0; i < ranked.size(); i++) {
            if (ranked.size() != (i + 1)) {
                if (ranked.get(i).intValue() == ranked.get(i + 1).intValue()) {
                    continue;
                }
                rankedClean.add(ranked.get(i));
            }
        }

        rankedClean.add(ranked.get(ranked.size() - 1));


        for (int i = 0; i < player.size(); i++) {
            System.out.println(player.get(i));
            System.out.println(rankedClean);
            int place = addAndReturnPlacement(player.get(i), rankedClean);

            places.add(place);
        }

        return places;

    }

    public static int addAndReturnPlacement(Integer playerScore, List<Integer> ranked) {

        int place = binarySearch(playerScore, ranked);

        ranked.subList(max(place - 1, 0), ranked.size()).clear();

        System.out.println("PLACE: " + place);

        return place;

    }

    public static int binarySearch(int target, List<Integer> arrayToBeSearched) {
        int left = 0;
        int right = arrayToBeSearched.size();

        if(arrayToBeSearched.size() == 0) {
            return 1;
        }

        System.out.println("GET INTO THE LOOP WITH TARGET " + target + " AND ARRAY OF SIZE " + arrayToBeSearched.size());

        while (true) {
            int mid = left + (right - left) / 2;


            if (arrayToBeSearched.get(mid) == target) {
                return mid + 1;
            } else if (arrayToBeSearched.get(mid) < target) {
                int indexToTheLeft = mid - 1;

                if(indexToTheLeft < 0) {
                    return 1;
                }

                if (arrayToBeSearched.get(indexToTheLeft) > target) {
                    return indexToTheLeft;
                } else if (arrayToBeSearched.get(indexToTheLeft) == target) {
                    return indexToTheLeft + 1;
                } else {
                    right = mid + 1;
                }
            } else if (arrayToBeSearched.get(mid) > target) {
                int indexToTheRight = mid + 1;

                if(indexToTheRight >= arrayToBeSearched.size()) {
                    return arrayToBeSearched.size() + 1;
                }

                if (arrayToBeSearched.get(indexToTheRight) <= target) {
                    return indexToTheRight + 1;
                } else {
                    left = mid;
                }

            }
        }

    }

}
