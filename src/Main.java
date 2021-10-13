public class Main  {
    public static void main(String[] args) {
        ValidateClass validateClass=new ValidateClass();
        String[] strings=new String[]{"C0318G","M0318G","P0323A"};
        for(String name: strings){
            boolean isClass= validateClass.validate(name);
            System.out.println("name of class "+name+" is valid: "+isClass );
        }
    }
}
