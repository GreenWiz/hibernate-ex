package ru.niips;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import ru.niips.dto.App;
import ru.niips.dto.AppId;
import ru.niips.dto.AppWithEmbedded;
import ru.niips.dto.User;

public class HibernateDAO extends HibernateDaoSupport {

    public User getSpitterById(long id) {
        return getHibernateTemplate().get(User.class, id);
    }

    public App getAppById(AppId id) {
        return getHibernateTemplate().get(App.class, id);
    }

    public AppWithEmbedded getAppWithEmbeddedById(AppId id) {
        return getHibernateTemplate().get(AppWithEmbedded.class, id);
    }


}
