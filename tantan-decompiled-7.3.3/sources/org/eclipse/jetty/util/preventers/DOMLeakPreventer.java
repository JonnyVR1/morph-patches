package org.eclipse.jetty.util.preventers;

import javax.xml.parsers.DocumentBuilderFactory;

/* JADX INFO: loaded from: classes2.dex */
public class DOMLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        try {
            DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (Exception e) {
            AbstractLeakPreventer.LOG.warn(e);
        }
    }
}
