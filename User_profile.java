class UserProfile {

    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {

        UserProfile user = new UserProfile();

        user.setPhoneNumber("9876543210");

        System.out.println("Phone Number: " +
                           user.getPhoneNumber());
    }
}
