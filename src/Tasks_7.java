import java.util.Scanner;
import java.util.regex.Pattern;

public class Tasks_7 {
    public static void main(String[] args) {
        String phoneNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Telefon raqamingizni kiriting: ");
        phoneNumber = scanner.nextLine();

        String noSpacePhoneNumber = phoneNumber.replaceAll("\\s", "");

        char checkToPlus = noSpacePhoneNumber.charAt(0),
                countryCodeFirst = noSpacePhoneNumber.charAt(1),
                countryCodeSecond = noSpacePhoneNumber.charAt(2),
                countryCodeThird = noSpacePhoneNumber.charAt(1);

        if (checkToPlus == '+') {
            if (countryCodeFirst == '9' && countryCodeSecond == '9' && countryCodeThird == '8') {
                checkNumberToAvailabilityWithOutPlus(noSpacePhoneNumber);
            } else {
                checkNumberToAvailabilityWithPlusAndCountryCode(noSpacePhoneNumber);
            }
        } else if (countryCodeFirst == '9' && countryCodeSecond == '9' && countryCodeThird == '8') {
            checkNumberToAvailabilityWithPlus(noSpacePhoneNumber);
        } else {
          checkNumberToAvailabilityWithPlusAndCountryCode(noSpacePhoneNumber);
        }


    }

    private static void checkNumberToAvailabilityWithPlusAndCountryCode(String phoneNumber) {
        if (Pattern.compile("[0-9]").matcher(phoneNumber).find()) {
            String checkedFullNumber = phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d+)", "+$1($2)$3-$4");
            System.out.println(checkedFullNumber);
        }
    }

    private static void checkNumberToAvailabilityWithOutPlus(String phoneNumber) {
        if (Pattern.compile("[0-9]").matcher(phoneNumber).find()) {
            String checkedFullNumber = phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)$2-$3");
            System.out.println(checkedFullNumber);
        }
    }

    private static void checkNumberToAvailabilityWithPlus(String phoneNumber) {
        if (Pattern.compile("[0-9]").matcher(phoneNumber).find()) {
            String checkedFullNumber = phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d+)", "+$1($2)$3-$4");
            System.out.println(checkedFullNumber);
        }
    }


}

