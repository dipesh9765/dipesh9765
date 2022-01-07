public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 14, 16, 19, 24};
        double floor = 3.36;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > floor) {
                end = mid - 1;
            } else if (arr[mid] < floor) {
                start = mid + 1;
            } else if (arr[mid] == floor) {
                System.out.println("floor num :  " + arr[mid]);
                System.exit(0);
            }
        }
        System.out.println("floor num is : " + arr[end]);
    }
}
