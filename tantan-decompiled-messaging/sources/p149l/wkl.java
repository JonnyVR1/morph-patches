package p149l;

import java.util.EventListener;
import javax.servlet.http.HttpSessionEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface wkl extends EventListener {
    void sessionCreated(HttpSessionEvent httpSessionEvent);

    void sessionDestroyed(HttpSessionEvent httpSessionEvent);
}
