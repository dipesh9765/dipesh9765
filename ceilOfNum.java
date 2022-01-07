  public class CeilingArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 14, 16, 19, 24};
        double ceiled = 3.3564;
        int start = 0;
        Math.ceil(2);
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > ceiled) {
                end = mid - 1;
            } else if (arr[mid] < ceiled) {
                start = mid + 1;
            } else if (arr[mid] == ceiled) {
                System.out.println("ceiled num :  " + arr[mid]);
                System.exit(1);
            }
        }
        System.out.println("ceiled num is : " + arr[start]);
    }
}
