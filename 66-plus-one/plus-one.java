class Solution {
    public int[] plusOne(int[] digits) {

        int currentDigit = digits.length - 1;

        while (digits[currentDigit] == 9) {
            digits[currentDigit] = 0;
            currentDigit--;

            if (currentDigit < 0) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;

                return newArray;
            }
        }

        digits[currentDigit]++;
        return digits;
    }
}
