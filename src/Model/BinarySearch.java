package Model;

public class BinarySearch {

    public static String binarySearch(EmployeeList list, int position) {
        int start = 0;
        int end = list.employeeList.size() - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (middle == position) {
                return (list.employeeList.get(middle).getName());
            }

            if (position > middle) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return "nada encontrado!";
    }
}
