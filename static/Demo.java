// public class Static {
//     static int num=10;
//     int x=200;
//     public static void main(String[] args) {
//         int y=300;
//         num=20;
//         System.out.println(new Static().x);
//         System.out.println(new Static().b());
//     }  
//     private static void Demo(){
//         System.out.println();
//     }  
//     private  int b(){
//         int a=10;
//         return a;
//     }
// }


public class Demo {

    int x = 10;              // non-static variable
    static int y = 20;       // static variable
    // static method
    static void staticMethod() {
        System.out.println("Static method");

        // ✅ can access static
        System.out.println(y);

        staticHelper(); // calling static method

        // ❌ cannot access non-static directly
        // System.out.println(x); ❌

        // ✅ need object
        Demo obj = new Demo();
        System.out.println(obj.x);

        // ❌ this not allowed
        // System.out.println(this.x);
    }

    // another static method
    static void staticHelper() {
        System.out.println("Another static method");
    }

    // non-static method
    void nonStaticMethod() {
        System.out.println("Non-static method");

        // ✅ can access both
        System.out.println(x);
        System.out.println(y);

        staticMethod(); // calling static method
    }

    public static void main(String[] args) {
        staticMethod(); // no object needed

        Demo obj = new Demo();
        obj.nonStaticMethod(); // object needed
    }
}