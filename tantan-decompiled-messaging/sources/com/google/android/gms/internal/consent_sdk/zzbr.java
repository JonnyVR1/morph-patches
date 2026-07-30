package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import java.util.Objects;
import p149l.tss0;
import p149l.vns0;

/* JADX INFO: loaded from: classes6.dex */
@UiThread
public final class zzbr extends WebView {

    /* JADX INFO: renamed from: a */
    public final Handler f10238a;

    /* JADX INFO: renamed from: b */
    public final tss0 f10239b;

    /* JADX INFO: renamed from: c */
    public boolean f10240c;

    public zzbr(vns0 vns0Var, Handler handler, tss0 tss0Var) {
        super(vns0Var);
        this.f10240c = false;
        this.f10238a = handler;
        this.f10239b = tss0Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ boolean m13761f(zzbr zzbrVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    /* JADX INFO: renamed from: c */
    public final void m13762c() {
        final tss0 tss0Var = this.f10239b;
        Objects.requireNonNull(tss0Var);
        this.f10238a.post(new Runnable() { // from class: l.rhs0
            @Override // java.lang.Runnable
            public final void run() {
                tss0Var.m190568b();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m13763d(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.f10238a.post(new Runnable() { // from class: l.igs0
            @Override // java.lang.Runnable
            public final void run() {
                pgt0.m168901a(this.f113164a, str3);
            }
        });
    }
}
