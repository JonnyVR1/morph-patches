package javax.servlet.http;

import p149l.rkl;

/* JADX INFO: loaded from: classes2.dex */
public class HttpSessionBindingEvent extends HttpSessionEvent {
    private String name;
    private Object value;

    public HttpSessionBindingEvent(rkl rklVar, String str, Object obj) {
        super(rklVar);
        this.name = str;
        this.value = obj;
    }

    public String getName() {
        return this.name;
    }

    @Override // javax.servlet.http.HttpSessionEvent
    public rkl getSession() {
        return super.getSession();
    }

    public Object getValue() {
        return this.value;
    }

    public HttpSessionBindingEvent(rkl rklVar, String str) {
        super(rklVar);
        this.name = str;
    }
}
