package be.com.elton.sfgpetclinic.config;

import be.com.elton.sfgpetclinic.service.VisitService;
import be.com.elton.sfgpetclinic.service.map.VisitMapService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigureBeans {

    @Bean
    VisitService visitService() {
        return new VisitMapService();
    }


}

