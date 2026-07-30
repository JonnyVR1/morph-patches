package com.hihonor.push.sdk;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.hihonor.push.sdk.w */
/* JADX INFO: loaded from: classes7.dex */
public class C3527w {

    /* JADX INFO: renamed from: a */
    public final String f11937a;

    /* JADX INFO: renamed from: b */
    public final int f11938b;

    public C3527w(String str) {
        this.f11937a = str;
        this.f11938b = m17528a(str);
    }

    /* JADX INFO: renamed from: a */
    public static C3527w m17529a(String str) {
        return new C3527w(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3527w.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f11937a, ((C3527w) obj).f11937a);
    }

    public final int hashCode() {
        return this.f11938b;
    }

    /* JADX INFO: renamed from: a */
    public static int m17528a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
