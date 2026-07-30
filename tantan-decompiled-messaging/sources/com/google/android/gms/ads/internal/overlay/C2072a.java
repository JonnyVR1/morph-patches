package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import p149l.q9t0;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.a */
/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class C2072a {

    /* JADX INFO: renamed from: a */
    public final int f9678a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup.LayoutParams f9679b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f9680c;

    /* JADX INFO: renamed from: d */
    public final Context f9681d;

    public C2072a(q9t0 q9t0Var) throws zzg {
        this.f9679b = q9t0Var.getLayoutParams();
        ViewParent parent = q9t0Var.getParent();
        this.f9681d = q9t0Var.mo13662M();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f9680c = viewGroup;
        this.f9678a = viewGroup.indexOfChild(q9t0Var.zzF());
        viewGroup.removeView(q9t0Var.zzF());
        q9t0Var.mo13721y0(true);
    }
}
