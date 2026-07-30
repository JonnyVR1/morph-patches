package javax.servlet;

import java.util.EventObject;
import p153l.ase0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletContextEvent extends EventObject {
    public ServletContextEvent(ase0 ase0Var) {
        super(ase0Var);
    }

    public ase0 getServletContext() {
        return (ase0) super.getSource();
    }
}
