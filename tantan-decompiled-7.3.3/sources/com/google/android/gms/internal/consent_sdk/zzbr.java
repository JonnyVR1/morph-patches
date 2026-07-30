package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import java.util.Objects;
import p153l.bxs0;
import p153l.z1t0;

/* JADX INFO: loaded from: classes6.dex */
@UiThread
public final class zzbr extends WebView {

    /* JADX INFO: renamed from: a */
    public final Handler f10275a;

    /* JADX INFO: renamed from: b */
    public final z1t0 f10276b;

    /* JADX INFO: renamed from: c */
    public boolean f10277c;

    public zzbr(bxs0 bxs0Var, Handler handler, z1t0 z1t0Var) {
        super(bxs0Var);
        this.f10277c = false;
        this.f10275a = handler;
        this.f10276b = z1t0Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ boolean m13815f(zzbr zzbrVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    /* JADX INFO: renamed from: c */
    public final void m13816c() {
        final z1t0 z1t0Var = this.f10276b;
        Objects.requireNonNull(z1t0Var);
        this.f10275a.post(new Runnable() { // from class: l.xqs0
            @Override // java.lang.Runnable
            public final void run() {
                z1t0Var.m218375b();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m13817d(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.f10275a.post(new Runnable() { // from class: l.ops0
            @Override // java.lang.Runnable
            public final void run() {
                vpt0.m202343a(this.f148496a, str3);
            }
        });
    }
}
