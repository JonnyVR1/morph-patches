package com.tencent.cloud.p075ai.network.okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p149l.jfd0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.f */
/* JADX INFO: loaded from: classes13.dex */
public final class C13700f {

    /* JADX INFO: renamed from: a */
    public final String f56431a;

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f56432b;

    public C13700f(String str, Map<String, String> map) {
        if (str == null) {
            jfd0.m141176a("scheme == null");
            throw null;
        }
        if (map == null) {
            jfd0.m141176a("authParams == null");
            throw null;
        }
        this.f56431a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.f56432b = Collections.unmodifiableMap(linkedHashMap);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13700f)) {
            return false;
        }
        C13700f c13700f = (C13700f) obj;
        return c13700f.f56431a.equals(this.f56431a) && c13700f.f56432b.equals(this.f56432b);
    }

    public int hashCode() {
        return ((this.f56431a.hashCode() + 899) * 31) + this.f56432b.hashCode();
    }

    public String toString() {
        return this.f56431a + " authParams=" + this.f56432b;
    }
}
