package javax.servlet;

import java.util.EventObject;
import p149l.vje0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletContextEvent extends EventObject {
    public ServletContextEvent(vje0 vje0Var) {
        super(vje0Var);
    }

    public vje0 getServletContext() {
        return (vje0) super.getSource();
    }
}
