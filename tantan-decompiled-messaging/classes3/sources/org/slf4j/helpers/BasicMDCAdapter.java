package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import l.ig3;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BasicMDCAdapter implements MDCAdapter {
    private InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal();

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
        HashMap map = (HashMap) this.inheritableThreadLocal.get();
        if (map != null) {
            map.clear();
            this.inheritableThreadLocal.remove();
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        HashMap map = (HashMap) this.inheritableThreadLocal.get();
        if (map == null || str == null) {
            return null;
        }
        return (String) map.get(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public Map getCopyOfContextMap() {
        HashMap map = (HashMap) this.inheritableThreadLocal.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public Set getKeys() {
        HashMap map = (HashMap) this.inheritableThreadLocal.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(String str, String str2) {
        if (str == null) {
            ig3.a("key cannot be null");
            return;
        }
        HashMap map = (HashMap) this.inheritableThreadLocal.get();
        if (map == null) {
            map = new HashMap();
            this.inheritableThreadLocal.set(map);
        }
        map.put(str, str2);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(String str) {
        HashMap map = (HashMap) this.inheritableThreadLocal.get();
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void setContextMap(Map map) {
        HashMap map2 = (HashMap) this.inheritableThreadLocal.get();
        if (map2 != null) {
            map2.clear();
            map2.putAll(map);
        } else {
            this.inheritableThreadLocal.set(new HashMap(map));
        }
    }
}
