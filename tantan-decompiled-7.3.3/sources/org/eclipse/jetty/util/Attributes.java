package org.eclipse.jetty.util;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes2.dex */
public interface Attributes {
    void clearAttributes();

    Object getAttribute(String str);

    Enumeration<String> getAttributeNames();

    void removeAttribute(String str);

    void setAttribute(String str, Object obj);
}
