public class Main {
    public static void main(String[] args) {
        UserAuth userDetails = new UserAuth("TestUser", "123", "123", 100.00);
        System.out.println(userDetails.getUserName());
    }
    //team kamatis
    class UserAuth{

        //fields
        String userName;
        String userNumber;
        String userPin;
        double userBalance;

        //constructor
        public UserAuth(String userName, String userNumber, String userPin, double userBalance){
            this.userName = userName;
            this.userNumber = userNumber;
            this.userPin = userPin;
            this.userBalance = userBalance;
        }

        //getters
        public String getUserName(){
            return userName;
        }
        public String getUserNumber(){
            return userNumber;
        }
        public String getUserPin(){
            return userPin;
        }
        public double getUserBalance(){
            return userBalance;
        }

        //setter
        public void setUserName(String newName){
            this.userName = newName;
        }
        public void setUserNumber(String newNumber){
            this.userNumber = newNumber;
        }
        public void setUserPin(String newPin){
            this.userPin = newPin;
        }
        public void setUserBalance(double newBalance){
            this.userBalance = newBalance;
        }


    }

    //team kamatis eof

    //team sibuyas
    
    class LoginValidation extends UserAuth {
        public boolean validate() {
            String username = getUserName();
            String userNumber = getUserNumber();
            String pin = getUserPin();
            System.out.println(username);
            System.out.println(userNumber);
            System.out.println(pin);
            return true;
        }
    }

    //team sibuyas eof

    //team ba

    //team ba eof
}
