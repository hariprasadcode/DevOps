//just recallliing the conceptof java and trying to push the code in git .
class Hello{
int a=10;
//static block
static{
    System.out.println("hello developers , its the topics covered under java");
}

//non static block
{
    System.out.println("its non static block");
}

//constructor
public Hello(){
    System.out.println("its constructor");
} 
public void display(){
    System.out.println("inside a method");
}
//main method
public static void main(String[] args){
    //craeting and objectand colling method
    Hello h=new Hello();
    h.display();
}

}
