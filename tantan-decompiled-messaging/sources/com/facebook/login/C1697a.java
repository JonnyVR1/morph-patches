package com.facebook.login;

import android.net.Uri;
import p149l.bzv;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.login.a */
/* JADX INFO: loaded from: classes6.dex */
public class C1697a extends bzv {

    /* JADX INFO: renamed from: n */
    public static volatile C1697a f6773n;

    /* JADX INFO: renamed from: m */
    public Uri f6774m;

    /* JADX INFO: renamed from: O */
    public static C1697a m9151O() {
        if (lsb.m151554d(C1697a.class)) {
            return null;
        }
        try {
            if (f6773n == null) {
                synchronized (C1697a.class) {
                    try {
                        if (f6773n == null) {
                            f6773n = new C1697a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f6773n;
        } catch (Throwable th2) {
            lsb.m151552b(th2, C1697a.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m9152P(Uri uri) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            this.f6774m = uri;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
