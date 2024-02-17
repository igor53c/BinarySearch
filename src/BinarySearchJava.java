public class BinarySearchJava {
    public static Result find(int[] array, int element) {
        if (array.length == 0) {
            return new Result(0, -1); // Immediate return for empty array
        }

        int left = 0;
        int right = array.length - 1;
        int steps = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == element) {
                return new Result(steps, mid);
            } else if (array[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            steps++;
        }

        return new Result(steps, -1);
    }
}
