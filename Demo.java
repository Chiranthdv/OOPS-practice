// // class A{
// //     int price;
// //     String name;
// //     public A(){
// //         this(0,"Unknown");
// //     }
// //     public A(int price,String name){
// //         this.price=price;
// //         this.name=name;
// //     }
// //     // public boolean equals(A o){
// //     //     return this.name==o.name && this.price==o.price;
// //     // }
// //     @Override
// //     public boolean equals(Object obj){
// //         if(obj==this)return true;
// //         if(obj==null || this.getClass()!=obj.getClass())return false;
// //         A o=(A)obj;
// //         return o.price==this.price && o.name.equals(this.name);
// //     }
// // }
// interface Computer{
//     void code();
// }
// class Laptop implements Computer{
//     public void code(){
//         System.out.println("Code run and debugging");
//     }
// }
// class Desktop implements Computer{
//     public void code(){
//         System.out.println("Code run and debugging but in faster way");
//     }
// }
// class IDE implements Computer{
//     public void code(){
//         System.out.println("Code run debug in the IDE");
//     }
// }
// class Developer{
//     Computer computer;
//     public Developer(Computer computer){
//         this.computer=computer;
//     }
    
//     public void developApp(){
//        computer.code();
//     }
// }
// class Demo {
//     public static void main(String[] args){
        
//         Developer d1=new Developer(new Laptop());
//         d1.developApp();
//         Developer d2=new Developer(new Desktop());
//         d2.developApp();
//         Developer d3=new Developer(new IDE());
//         d3.developApp();
//     }
// }

class A{
    void a(){
        show();
    }
    public static  void show(){
        System.out.println("In A");
       //a();
    }
}
class B extends A{
    public static void show(){
        System.out.println("In B");
    }
}
class Demo{
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
    }    
}