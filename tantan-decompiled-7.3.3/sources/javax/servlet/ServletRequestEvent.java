package javax.servlet;

import java.util.EventObject;
import p153l.ase0;
import p153l.gse0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletRequestEvent extends EventObject {
    private final transient gse0 request;

    public ServletRequestEvent(ase0 ase0Var, gse0 gse0Var) {
        super(ase0Var);
        this.request = gse0Var;
    }

    public ase0 getServletContext() {
        return (ase0) super.getSource();
    }

    public gse0 getServletRequest() {
        return this.request;
    }
}
