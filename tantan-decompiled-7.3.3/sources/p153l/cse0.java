package p153l;

import java.util.EventListener;
import javax.servlet.ServletContextEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface cse0 extends EventListener {
    void contextDestroyed(ServletContextEvent servletContextEvent);

    void contextInitialized(ServletContextEvent servletContextEvent);
}
