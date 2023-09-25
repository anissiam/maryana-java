public class Strings {
    public static void main(String[] args) {
        String name = "anis";
        String lastName = "siam";
        int age = 30;
        String name1 = "AnIs";
        String name2 = new String("anis");
        String line = "hello my name is anis";
        String st = "hello from java class";

        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));//مقارنة مع تجاهل الحروف الكبيرة والصغيرة

        //talal  // Talal  //TALAL
        //talal


        //talal
        //talal//TALAL


        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());


        /*System.out.println("My name is " + name + " And my last name is " + lastName +
                " and my age is " + age);*/

        System.out.println("My name is ".concat(name).concat(" And my last name is " + lastName +
                " and my age is " + age));
        System.out.println(name.concat(name1)); //دمج النص

        //System.out.println("java".equals("Java"));
        System.out.println("==============================");

        System.out.println(st.contains("java")); //للبحث داخل النص

        System.out.println("==============================");
        int l = line.length();
        System.out.println(l);//ترجع طول النص

        System.out.println(name);
        System.out.println(name.trim()); //تحذف المسافات من البداية والنهاية
        String newString  = name.trim();
        System.out.println(newString);






        //System.out.println(name.equals(name1));

        /*
        == means Is equal? by ref
         */

        System.out.println(name==name2);
        System.out.println(name.equals(name2)); //by value

        //Difference between == and equals()
        //== compare by reference(address , pointer)
            //مقارنة من خلال الموقع
        //equals() compare by value
            // مقارنة من خلال ال قيمة

        //array of char
     /*   String name = "anis";
        String lastName = "siam";
        int age = 30;
        String momName = "Mona";
        System.out.println(name + " " + lastName + " " + age + " and my major is CS" +
                " and my mom name is " + momName);  //String*/

        System.out.println("anis");//new line
        System.out.print("siam");
        System.out.print("ONE");


        /*char a = 'C';

        System.out.println(a);*/
    }
}
