package com.vivo.push.model;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.vivo.push.model.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14767b {

    /* JADX INFO: renamed from: a */
    private String f61907a;

    /* JADX INFO: renamed from: d */
    private String f61910d;

    /* JADX INFO: renamed from: b */
    private long f61908b = -1;

    /* JADX INFO: renamed from: c */
    private int f61909c = -1;

    /* JADX INFO: renamed from: e */
    private boolean f61911e = false;

    /* JADX INFO: renamed from: f */
    private boolean f61912f = false;

    public C14767b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
        }
        this.f61907a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m86090a() {
        return this.f61907a;
    }

    /* JADX INFO: renamed from: b */
    public final long m86095b() {
        return this.f61908b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86097c() {
        return this.f61911e;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m86098d() {
        return this.f61912f;
    }

    public final String toString() {
        return "PushPackageInfo{mPackageName=" + this.f61907a + ", mPushVersion=" + this.f61908b + ", mPackageVersion=" + this.f61909c + ", mInBlackList=" + this.f61911e + ", mPushEnable=" + this.f61912f + "}";
    }

    /* JADX INFO: renamed from: a */
    public final void m86092a(long j) {
        this.f61908b = j;
    }

    /* JADX INFO: renamed from: b */
    public final void m86096b(boolean z) {
        this.f61912f = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m86094a(boolean z) {
        this.f61911e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m86091a(int i) {
        this.f61909c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m86093a(String str) {
        this.f61910d = str;
    }
}
