public class HelloWorldService {

    public String serviceName;


    public HelloWorldService(String serviceName) {
        this.serviceName = serviceName;
    }
    public String method(HelloWorldService hs){
        return "hs";
    }

    System.out.println("Service name");
}