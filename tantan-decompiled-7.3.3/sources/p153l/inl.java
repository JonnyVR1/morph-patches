package p153l;

import java.util.EventListener;
import javax.servlet.http.HttpSessionEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface inl extends EventListener {
    void sessionDidActivate(HttpSessionEvent httpSessionEvent);

    void sessionWillPassivate(HttpSessionEvent httpSessionEvent);
}
