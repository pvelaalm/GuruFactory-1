package Button;

public class HtmlButton implements Button {
    public void render(){
        System.out.println("<button>Test Button.Button</button>");
        onClick();
    }
    public void onClick() {
        System.out.println("Click! Button.Button says - 'Hello World!'");
    }
}