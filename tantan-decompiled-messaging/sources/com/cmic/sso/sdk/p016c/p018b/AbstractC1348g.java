package com.cmic.sso.sdk.p016c.p018b;

import com.cmic.sso.sdk.p022e.C1364d;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1348g {
    /* JADX INFO: renamed from: a */
    public abstract String mo7102a();

    /* JADX INFO: renamed from: a_ */
    public abstract String mo7124a_(String str);

    /* JADX INFO: renamed from: b */
    public abstract JSONObject mo7125b();

    /* JADX INFO: renamed from: v */
    public String m7156v(String str) {
        return C1364d.m7235a(mo7124a_(str)).toLowerCase();
    }
}
