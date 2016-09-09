package ru.niips;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.niips.dto.*;

@Controller
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);


    @Autowired
//    HibernateDAO dao;
    HibernateTransDAO dao;

    @RequestMapping("/")
    ModelAndView main() {
        logger.debug("lol");
        User user = dao.getSpitterById(1);
        App app = dao.getAppById(new AppId(1L, "cherno"));
        AppWithEmbedded appWithEmbedded = dao.getAppWithEmbeddedById(new AppId(2L, "sovetsk"));
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user", user);
        modelAndView.addObject("app", app);
        modelAndView.addObject("appWithEmbedded", appWithEmbedded);
        return modelAndView;
    }

    @RequestMapping("/lazy")
    ModelAndView lazy() {
        User user = dao.getSpitterById(1);
//        Car car = user.getCar();
//        logger.debug(car.getPlate());
        return new ModelAndView("lazy");
    }
}
