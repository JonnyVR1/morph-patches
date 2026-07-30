package com.tencent.cloud.p080ai.network.okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p153l.mnd0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.f */
/* JADX INFO: loaded from: classes12.dex */
public final class C13863f {

    /* JADX INFO: renamed from: a */
    public final String f57279a;

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f57280b;

    public C13863f(String str, Map<String, String> map) {
        if (str == null) {
            mnd0.m159157a("scheme == null");
            throw null;
        }
        if (map == null) {
            mnd0.m159157a("authParams == null");
            throw null;
        }
        this.f57279a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.f57280b = Collections.unmodifiableMap(linkedHashMap);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13863f)) {
            return false;
        }
        C13863f c13863f = (C13863f) obj;
        return c13863f.f57279a.equals(this.f57279a) && c13863f.f57280b.equals(this.f57280b);
    }

    public int hashCode() {
        return ((this.f57279a.hashCode() + 899) * 31) + this.f57280b.hashCode();
    }

    public String toString() {
        return this.f57279a + " authParams=" + this.f57280b;
    }
}
