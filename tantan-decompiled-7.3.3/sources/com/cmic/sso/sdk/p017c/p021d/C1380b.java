package com.cmic.sso.sdk.p017c.p021d;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1380b {

    /* JADX INFO: renamed from: a */
    private int f5699a;

    /* JADX INFO: renamed from: b */
    private Map<String, List<String>> f5700b;

    /* JADX INFO: renamed from: c */
    private String f5701c;

    public C1380b(int i, Map<String, List<String>> map, String str) {
        this.f5699a = i;
        this.f5700b = map;
        this.f5701c = str;
    }

    /* JADX INFO: renamed from: a */
    public int m7239a() {
        return this.f5699a;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, List<String>> m7240b() {
        Map<String, List<String>> map = this.f5700b;
        return map == null ? new HashMap() : map;
    }

    /* JADX INFO: renamed from: c */
    public String m7241c() {
        String str = this.f5701c;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: d */
    public boolean m7242d() {
        int i = this.f5699a;
        return i == 302 || i == 301;
    }
}
