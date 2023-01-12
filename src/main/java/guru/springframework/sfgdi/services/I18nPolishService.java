package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PL")
@Service("i18nService")
public class I18nPolishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Witaj Świecie - Polski";
    }
}
