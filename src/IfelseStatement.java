public class IfelseStatement {
    public static void  testIf(){
        int number = 10;
        if(number<0){
            System.out.println("pwdawf");
        }
        System.out.println("SADFASFasf");
    }


    public static void  testfelse(){
        String language = "Java";
        if(language == "Java"){
            System.out.println("Java Programming");
        }
    }

    public static void testIfElse2(){
        int number = -10;
        if(number > 0 ){
            System.out.println("The number is positive");
        }
        if(number < 0){
            System.out.println("Statement outside if...else block");
        }
    }
    public static void testIfElseifElse(){
        String day = "Monday";

        if(day == "Sunday"){
            System.out.println("Sunday");
        }
        else if(day == "Monday"){
            System.out.println("Monday");
            }
        else{
            System.out.println("ERROR day");
        }
    }
    public static void nestedIfelse(){
        int age = 25;
        int weight = 48;

        if(age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligble to donate blood");
            } else {
                System.out.println("Age must be greater than 18");
            }
            } else {
            System.out.println("Age must be greater than 18");
           }
        }
    }
