package org.httpeter.repository.persistence;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author PeterH
 */
public class PersistenceAppListener implements ServletContextListener
{

    public void contextInitialized(ServletContextEvent evt)
    {
    }



    public void contextDestroyed(ServletContextEvent evt)
    {
        PersistenceManager.getInstance().closeEntityManagerFactory();
    }
}
