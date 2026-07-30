package javax.servlet.http;

import p153l.hnl;

/* JADX INFO: loaded from: classes2.dex */
public class HttpSessionBindingEvent extends HttpSessionEvent {
    private String name;
    private Object value;

    public HttpSessionBindingEvent(hnl hnlVar, String str, Object obj) {
        super(hnlVar);
        this.name = str;
        this.value = obj;
    }

    public String getName() {
        return this.name;
    }

    @Override // javax.servlet.http.HttpSessionEvent
    public hnl getSession() {
        return super.getSession();
    }

    public Object getValue() {
        return this.value;
    }

    public HttpSessionBindingEvent(hnl hnlVar, String str) {
        super(hnlVar);
        this.name = str;
    }
}
