// 6510405601 Teerut Srithongdee
import modals.User;
import services.RegistrationService;

public class Main {
    public static void main(String[] args) {
        RegistrationService registrationService = new RegistrationService();
        User user = new User("JohnDoe", "teerut.sr@ku.th", 20);

        registrationService.register(user);

        System.out.println("Register success");
    }
}
