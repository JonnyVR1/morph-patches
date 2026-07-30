package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import p153l.wit0;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.a */
/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class C2095a {

    /* JADX INFO: renamed from: a */
    public final int f9715a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup.LayoutParams f9716b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f9717c;

    /* JADX INFO: renamed from: d */
    public final Context f9718d;

    public C2095a(wit0 wit0Var) throws zzg {
        this.f9716b = wit0Var.getLayoutParams();
        ViewParent parent = wit0Var.getParent();
        this.f9718d = wit0Var.mo13716M();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f9717c = viewGroup;
        this.f9715a = viewGroup.indexOfChild(wit0Var.zzF());
        viewGroup.removeView(wit0Var.zzF());
        wit0Var.mo13775y0(true);
    }
}
