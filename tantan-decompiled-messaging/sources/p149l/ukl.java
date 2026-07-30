package p149l;

import java.util.EventListener;
import javax.servlet.http.HttpSessionBindingEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface ukl extends EventListener {
    void valueBound(HttpSessionBindingEvent httpSessionBindingEvent);

    void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent);
}
