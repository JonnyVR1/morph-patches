package com.hihonor.push.sdk;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.hihonor.push.sdk.w */
/* JADX INFO: loaded from: classes7.dex */
public class C3686w {

    /* JADX INFO: renamed from: a */
    public final String f12678a;

    /* JADX INFO: renamed from: b */
    public final int f12679b;

    public C3686w(String str) {
        this.f12678a = str;
        this.f12679b = m18605a(str);
    }

    /* JADX INFO: renamed from: a */
    public static C3686w m18606a(String str) {
        return new C3686w(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3686w.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f12678a, ((C3686w) obj).f12678a);
    }

    public final int hashCode() {
        return this.f12679b;
    }

    /* JADX INFO: renamed from: a */
    public static int m18605a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
