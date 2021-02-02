public class ProblemSet8 {

    public boolean common(int[] a, int[] b) {
        if (a == null && b == null) {
            return true;
        }
        else if (a == null || b == null) {
            return false;
        }
        else if (a[0] == b[0]) {
            return true;
        }
        else if (a[a.length -1] == b[b.length-1]) {
            return true;
        }
        else {
            return false;
        }
    }

    public int[] middleman(int[] a, int[] b) {
        if (a != null || b != null) {
            if (a.length != 0 && b.length != 0) {
                int aMidd = a.length / 2;
                int bMidd = b.length / 2;
                int[] middle = new int[2];
                middle[0] = a[aMidd];
                middle[1] = b[bMidd];
                return middle;
            }
        }
        return null;
    }

    public int[] bigger(int[] a, int[] b) {
        if (a == null && b != null) {
            return b;
        }
        else if (b == null && a != null) {
            return a;
        }
        else {
            if (a.length != 0 && b.length != 0) {
                int aSum = 0;
                int bSum = 0;
                for (int current : a) {
                    aSum += current;
                }
                for (int current : b) {
                    bSum += current;
                }
                if (aSum >= bSum) {
                    return a;
                }
                else {
                    return b;
                }

        }
        return null;
    }
    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length %2 != 0 || b.length % 2 != 0) {
            return null;
        }
        else {
            int[] middle = new int[4];
            int aFirstMiddle = (a.length/2) - 1;
            int bFirstMiddle = (b.length/2) - 1;
            middle[0] = a[aFirstMiddle];
            middle[1] = a[aFirstMiddle + 1];
            middle[2] = b[bFirstMiddle];
            middle[3] = b[bFirstMiddle + 1];
            return middle;
        }
    }

    public int[] swapMe(int[] a) {
        if(a == null) {
            return null;
        }
        else {
            int temp = a[0];
            a[0] = a[a.length -1];
            a[a.length-1] = temp;
            return a;
        }
    }

    public int[] threePoint(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 == 0) {
            return null;
        }
        else {
            int aMiddle = (a.length/2) - 1;
            int[] threeSpots = new int[3];
            threeSpots[0] = a[0];
            threeSpots[1] = a[aMiddle];
            threeSpots[2] = a[a.length - 1];
            return threeSpots;
        }
    }

    public int headHoncho(int[] a) {
        if (a == null || a.length == 0) {
            return -1;
        }
        else {
            for (int number : a) {
                if (number < 0) {
                    return -1;
                }
            }

             int max = a[0];
                for (int number : a) {
                    if (number > max) {
                        max = number;
                }
             }
            return max;
        }
    }

    public boolean tippingPoint(int[] a, int threshold) {
        if(a == null) {
            return false;
        }
        else {
            int sum = 0;
            for(int number : a) {
                sum += number;
            }
            return sum > threshold;
        }
    }

    public String halfway(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 != 0) {
            return null;
        }
        else {
            int halfMark = a.length/2;
            int firstSum = 0;
            int secondSum = 0;
            for (int i = 0; i < halfMark; i++) {
                firstSum += a[i];
            }
            for (int i = halfMark; i < a.length; i++) {
                secondSum += a[i];
            }
            if (secondSum > firstSum) {
                return "LEFT";
            }
            else {
                return "RIGHT";
            }
        }
    }

    public int[] sequential(int[] a, int[] b) {
        if (a == null || b == null || a.length + b.length < 3) {
            return null;
        }
        else {
            int[] sequential = new int[3];
            sequential[0] = a[0];
            if (a.length >= 2) {
                sequential[1] = a[1];
                if (a.length >= 3) {
                    sequential[2] = a[2];
                }
                else {
                    sequential[2] = b[0];
                }
            }
            else {
                sequential[1] = b[0];
                sequential[2] = b[1];
            }
            return sequential;
        }
    }
}
