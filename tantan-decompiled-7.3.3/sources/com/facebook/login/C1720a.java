package com.facebook.login;

import android.net.Uri;
import p153l.z0w;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.login.a */
/* JADX INFO: loaded from: classes6.dex */
public class C1720a extends z0w {

    /* JADX INFO: renamed from: n */
    public static volatile C1720a f6810n;

    /* JADX INFO: renamed from: m */
    public Uri f6811m;

    /* JADX INFO: renamed from: O */
    public static C1720a m9205O() {
        if (ztb.m221490d(C1720a.class)) {
            return null;
        }
        try {
            if (f6810n == null) {
                synchronized (C1720a.class) {
                    try {
                        if (f6810n == null) {
                            f6810n = new C1720a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f6810n;
        } catch (Throwable th2) {
            ztb.m221488b(th2, C1720a.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m9206P(Uri uri) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            this.f6811m = uri;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
