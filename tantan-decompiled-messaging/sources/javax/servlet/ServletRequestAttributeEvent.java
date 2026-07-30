package javax.servlet;

import p149l.bke0;
import p149l.vje0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletRequestAttributeEvent extends ServletRequestEvent {
    private String name;
    private Object value;

    public ServletRequestAttributeEvent(vje0 vje0Var, bke0 bke0Var, String str, Object obj) {
        super(vje0Var, bke0Var);
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
