package p153l;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes2.dex */
public interface hnl {
    Object getAttribute(String str);

    Enumeration<String> getAttributeNames();

    String getId();

    void invalidate();

    void removeAttribute(String str);

    void setAttribute(String str, Object obj);
}
