public class binary_search {
    public static int binarySearch(int[] mas, int number) {
        int low = 0;  // в переменных high & low храняться границы той части списка, в которой выполняется поиск
        int high = mas.length - 1;
        int mid,guess;
        while (low <= high) {  // пока эта часть не сократиться до одного элемента
            mid = (low + high) / 2; // проверяем средний элемент
            guess = mas[mid];
            if (guess == number)
                return mid;
            if (guess > number)
                high = mid -1;
            else
                low = mid +1;

        }
        return 0;
    }
}
