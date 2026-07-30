package javax.servlet.http;

import java.util.EventObject;
import p149l.rkl;

/* JADX INFO: loaded from: classes2.dex */
public class HttpSessionEvent extends EventObject {
    public HttpSessionEvent(rkl rklVar) {
        super(rklVar);
    }

    public rkl getSession() {
        return (rkl) super.getSource();
    }
}
