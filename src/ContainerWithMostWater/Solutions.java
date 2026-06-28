package ContainerWithMostWater;

public class Solutions {
    public static void main(String[] args) {
        Solutions solution = new Solutions();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = solution.maxArea(height);
        System.out.println("Max area: " + maxArea);
    }

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            int tempLeft = height[left];
            int tempRight = height[right];
            if (height[left] < height[right]) {
                while (left < right && height[left] <= tempLeft) {
                    left++;
                }
            } else {
                while (left < right && height[right] <= tempRight) {
                    right--;
                }
            }
        }
        return max;
    }
}
