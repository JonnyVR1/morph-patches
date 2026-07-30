package javax.servlet;

import java.util.EventObject;
import p149l.bke0;
import p149l.vje0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletRequestEvent extends EventObject {
    private final transient bke0 request;

    public ServletRequestEvent(vje0 vje0Var, bke0 bke0Var) {
        super(vje0Var);
        this.request = bke0Var;
    }

    public vje0 getServletContext() {
        return (vje0) super.getSource();
    }

    public bke0 getServletRequest() {
        return this.request;
    }
}
