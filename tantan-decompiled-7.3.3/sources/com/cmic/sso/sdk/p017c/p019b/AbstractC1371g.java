package com.cmic.sso.sdk.p017c.p019b;

import com.cmic.sso.sdk.p023e.C1387d;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1371g {
    /* JADX INFO: renamed from: a */
    public abstract String mo7156a();

    /* JADX INFO: renamed from: a_ */
    public abstract String mo7178a_(String str);

    /* JADX INFO: renamed from: b */
    public abstract JSONObject mo7179b();

    /* JADX INFO: renamed from: v */
    public String m7210v(String str) {
        return C1387d.m7289a(mo7178a_(str)).toLowerCase();
    }
}
