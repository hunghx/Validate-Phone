package bkap.validate;

public class Validate {
    public static final String PHONE_PATTERN= "^0[0-9]{8,10}$";
    public static final String PHONEHANOI_PATTERN= "^043[0-9]{6}$";

    public static boolean checkPhone(String phone){
        return phone.matches(PHONE_PATTERN);
    }
    public static boolean checkPhoneHaNoi(String phone){
        return phone.matches(PHONEHANOI_PATTERN);
    }
}
