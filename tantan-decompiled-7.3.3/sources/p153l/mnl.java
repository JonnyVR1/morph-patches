package p153l;

import java.util.EventListener;
import javax.servlet.http.HttpSessionEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface mnl extends EventListener {
    void sessionCreated(HttpSessionEvent httpSessionEvent);

    void sessionDestroyed(HttpSessionEvent httpSessionEvent);
}
