package p149l;

import java.util.EventListener;
import javax.servlet.ServletRequestEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface dke0 extends EventListener {
    void requestDestroyed(ServletRequestEvent servletRequestEvent);

    void requestInitialized(ServletRequestEvent servletRequestEvent);
}
