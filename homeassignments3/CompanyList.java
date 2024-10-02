package homeassingments3;
import java.util.ArrayList;
import java.util.List;

public class CompanyList {

    public static void main(String[] args) {
        // Declare a String array and add values
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Add the array to a List
        List<String> companyList = new ArrayList<>();
        for (String company : companies) {
            companyList.add(company);
        }

        // Iterate the List in reverse order to print the required output
        for (int i = companyList.size() - 1; i >= 0; i--) {
            if (i == 1) {
                System.out.println(companyList.get(i)); // Wipro
            } else if (i == 0) {
                System.out.println(companyList.get(i)); // HCL
            } else if (i == 3) {
                System.out.println(companyList.get(i)); // CTS
            } else if (i == 2) {
                System.out.println(companyList.get(i)); // Aspire Systems
            }
        }
    }
}
