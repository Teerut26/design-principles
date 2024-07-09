// 6510405601 Teerut Srithongdee
package services;

import interfaces.Validator;
import modals.User;
import validators.AgeValidator;
import validators.EmailValidator;
import validators.NameValidator;

import java.util.ArrayList;
import java.util.List;

public class RegistrationService {
    public boolean register(User user) {

        List<Validator> validators = new ArrayList<Validator>();
        validators.add(new NameValidator());
        validators.add(new EmailValidator());
        validators.add(new AgeValidator());

        for (Validator validator : validators) {
            validator.validate(user);
        }

        return true;
    }
}
