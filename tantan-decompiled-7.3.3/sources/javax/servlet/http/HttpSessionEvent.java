package javax.servlet.http;

import java.util.EventObject;
import p153l.hnl;

/* JADX INFO: loaded from: classes2.dex */
public class HttpSessionEvent extends EventObject {
    public HttpSessionEvent(hnl hnlVar) {
        super(hnlVar);
    }

    public hnl getSession() {
        return (hnl) super.getSource();
    }
}
