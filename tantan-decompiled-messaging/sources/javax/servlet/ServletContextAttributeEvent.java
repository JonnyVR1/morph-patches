package javax.servlet;

import p149l.vje0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletContextAttributeEvent extends ServletContextEvent {
    private String name;
    private Object value;

    public ServletContextAttributeEvent(vje0 vje0Var, String str, Object obj) {
        super(vje0Var);
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
