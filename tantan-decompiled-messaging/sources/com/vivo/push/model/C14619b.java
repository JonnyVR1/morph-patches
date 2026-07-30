package com.vivo.push.model;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.vivo.push.model.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14619b {

    /* JADX INFO: renamed from: a */
    private String f61060a;

    /* JADX INFO: renamed from: d */
    private String f61063d;

    /* JADX INFO: renamed from: b */
    private long f61061b = -1;

    /* JADX INFO: renamed from: c */
    private int f61062c = -1;

    /* JADX INFO: renamed from: e */
    private boolean f61064e = false;

    /* JADX INFO: renamed from: f */
    private boolean f61065f = false;

    public C14619b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
        }
        this.f61060a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m84919a() {
        return this.f61060a;
    }

    /* JADX INFO: renamed from: b */
    public final long m84924b() {
        return this.f61061b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m84926c() {
        return this.f61064e;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m84927d() {
        return this.f61065f;
    }

    public final String toString() {
        return "PushPackageInfo{mPackageName=" + this.f61060a + ", mPushVersion=" + this.f61061b + ", mPackageVersion=" + this.f61062c + ", mInBlackList=" + this.f61064e + ", mPushEnable=" + this.f61065f + "}";
    }

    /* JADX INFO: renamed from: a */
    public final void m84921a(long j) {
        this.f61061b = j;
    }

    /* JADX INFO: renamed from: b */
    public final void m84925b(boolean z) {
        this.f61065f = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m84923a(boolean z) {
        this.f61064e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m84920a(int i) {
        this.f61062c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m84922a(String str) {
        this.f61063d = str;
    }
}
