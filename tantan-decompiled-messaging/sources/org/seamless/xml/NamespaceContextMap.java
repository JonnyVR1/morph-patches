package org.seamless.xml;

import java.util.HashMap;
import java.util.Iterator;
import javax.xml.namespace.NamespaceContext;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NamespaceContextMap extends HashMap<String, String> implements NamespaceContext {
    public abstract String getDefaultNamespaceURI();

    @Override // javax.xml.namespace.NamespaceContext
    public String getNamespaceURI(String str) {
        if (str == null) {
            ig3.m135964a("No prefix provided!");
            return null;
        }
        if (str.equals("")) {
            return getDefaultNamespaceURI();
        }
        return get(str) != null ? get(str) : "";
    }

    @Override // javax.xml.namespace.NamespaceContext
    public String getPrefix(String str) {
        return null;
    }

    @Override // javax.xml.namespace.NamespaceContext
    public Iterator getPrefixes(String str) {
        return null;
    }
}
