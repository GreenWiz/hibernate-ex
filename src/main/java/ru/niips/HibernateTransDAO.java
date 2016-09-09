package ru.niips;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.niips.dto.*;

import java.util.List;

@Repository
@Transactional
public class HibernateTransDAO {

    Logger logger = LoggerFactory.getLogger(HibernateTransDAO.class);

    @Autowired
    SessionFactory sessionFactory;

    public User getSpitterById(long id) {
        User user = sessionFactory.getCurrentSession().get(User.class, id);
        logger.debug(user.getCar().getId()+"");
        return user;
    }

    public App getAppById(AppId id) {
        return sessionFactory.getCurrentSession().get(App.class, id);
    }
    public DataFile getDataFileById(long id) {
        return sessionFactory.getCurrentSession().get(DataFile.class, id);
    }

    public AppWithEmbedded getAppWithEmbeddedById(AppId id) {
        return sessionFactory.getCurrentSession().get(AppWithEmbedded.class, id);
    }
}
