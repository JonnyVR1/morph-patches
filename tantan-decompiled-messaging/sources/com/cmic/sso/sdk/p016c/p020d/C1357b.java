package com.cmic.sso.sdk.p016c.p020d;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1357b {

    /* JADX INFO: renamed from: a */
    private int f5662a;

    /* JADX INFO: renamed from: b */
    private Map<String, List<String>> f5663b;

    /* JADX INFO: renamed from: c */
    private String f5664c;

    public C1357b(int i, Map<String, List<String>> map, String str) {
        this.f5662a = i;
        this.f5663b = map;
        this.f5664c = str;
    }

    /* JADX INFO: renamed from: a */
    public int m7185a() {
        return this.f5662a;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, List<String>> m7186b() {
        Map<String, List<String>> map = this.f5663b;
        return map == null ? new HashMap() : map;
    }

    /* JADX INFO: renamed from: c */
    public String m7187c() {
        String str = this.f5664c;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: d */
    public boolean m7188d() {
        int i = this.f5662a;
        return i == 302 || i == 301;
    }
}
