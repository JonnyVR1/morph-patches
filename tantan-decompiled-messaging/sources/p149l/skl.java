package p149l;

import java.util.EventListener;
import javax.servlet.http.HttpSessionEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface skl extends EventListener {
    void sessionDidActivate(HttpSessionEvent httpSessionEvent);

    void sessionWillPassivate(HttpSessionEvent httpSessionEvent);
}
