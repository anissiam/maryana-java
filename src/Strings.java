public class Strings {
    public static void main(String[] args) {

        String s1 = "anis";
        String s2 = "siam";
        System.out.println((s1 + s2).length());
       /* String re = s1.concat(s2);
        System.out.println(re.length());*/




        String name = "anis";//array of char
        String lastName = "siam";
        int age = 30;
        String name1 = "AnIs";
        String name2 = new String("anis");
        String line = "hello my name is anis";
        String st = "hello from java class java class ";
        String st1 = "hello from java class and my name is anis , anis is a good person and he is handsome , anis is a java developer ";


        System.out.println(st.startsWith("he"));//تبحث في بداية الجملة
        System.out.println(st.endsWith("class "));//تبحث في نهاية الجملة

/*
replace ,
تستبدل كلمة بكلمة
 */
       System.out.println(st1.replace("anis" , "Maryna"));
        System.out.println(st.replace("java", "C++"));
        System.out.println(st.replace("java", "C++"));
        System.out.println(st.replace(" ", ","));


        System.out.println(line.substring(3));//ترجع جزء من النص من الموقع 3
        System.out.println(line.substring(3,10));//ترجع جزء من النص من الموقع 3 الى 10 ولكن 10 ليس مدخل

        System.out.println(st.indexOf("java"));//تاخد نص وترجع موقع وجوده
        System.out.println(st.lastIndexOf("java"));//تاخد نص وترجع اخر موقع وجوده
        System.out.println(st.charAt(0));//تاخد int  وترجع الحرف في هذا الموقع


        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));//مقارنة مع تجاهل الحروف الكبيرة والصغيرة


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
