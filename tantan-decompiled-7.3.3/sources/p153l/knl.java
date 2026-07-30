package p153l;

import java.util.EventListener;
import javax.servlet.http.HttpSessionBindingEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface knl extends EventListener {
    void valueBound(HttpSessionBindingEvent httpSessionBindingEvent);

    void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent);
}
