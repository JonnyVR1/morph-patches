package javax.servlet;

import p153l.ase0;
import p153l.gse0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletRequestAttributeEvent extends ServletRequestEvent {
    private String name;
    private Object value;

    public ServletRequestAttributeEvent(ase0 ase0Var, gse0 gse0Var, String str, Object obj) {
        super(ase0Var, gse0Var);
        this.name = str;
        this.value = obj;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }
}
