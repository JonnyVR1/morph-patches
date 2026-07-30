package org.eclipse.jetty.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AttributesMap implements Attributes {
    protected final Map<String, Object> _map;

    public AttributesMap(AttributesMap attributesMap) {
        this._map = new HashMap(attributesMap._map);
    }

    public static Enumeration<String> getAttributeNamesCopy(Attributes attributes) {
        if (attributes instanceof AttributesMap) {
            return Collections.enumeration(((AttributesMap) attributes)._map.keySet());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Collections.list(attributes.getAttributeNames()));
        return Collections.enumeration(arrayList);
    }

    public void addAll(Attributes attributes) {
        Enumeration<String> attributeNames = attributes.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String strNextElement = attributeNames.nextElement();
            setAttribute(strNextElement, attributes.getAttribute(strNextElement));
        }
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void clearAttributes() {
        this._map.clear();
    }

    @Override // org.eclipse.jetty.util.Attributes
    public Object getAttribute(String str) {
        return this._map.get(str);
    }

    public Set<Map.Entry<String, Object>> getAttributeEntrySet() {
        return this._map.entrySet();
    }

    public Set<String> getAttributeNameSet() {
        return this._map.keySet();
    }

    @Override // org.eclipse.jetty.util.Attributes
    public Enumeration<String> getAttributeNames() {
        return Collections.enumeration(this._map.keySet());
    }

    public Set<String> keySet() {
        return this._map.keySet();
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void removeAttribute(String str) {
        this._map.remove(str);
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void setAttribute(String str, Object obj) {
        Map<String, Object> map = this._map;
        if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, obj);
        }
    }

    public int size() {
        return this._map.size();
    }

    public String toString() {
        return this._map.toString();
    }

    public AttributesMap(Map<String, Object> map) {
        this._map = map;
    }

    public AttributesMap() {
        this._map = new HashMap();
    }
}
