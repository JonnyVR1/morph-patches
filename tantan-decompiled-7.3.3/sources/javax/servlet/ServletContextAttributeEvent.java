package javax.servlet;

import p153l.ase0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletContextAttributeEvent extends ServletContextEvent {
    private String name;
    private Object value;

    public ServletContextAttributeEvent(ase0 ase0Var, String str, Object obj) {
        super(ase0Var);
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
