package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import p153l.c1s0;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
final class zzh extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final c1s0 f9742a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public boolean f9743b;

    public zzh(Context context, String str, String str2, String str3) {
        super(context);
        c1s0 c1s0Var = new c1s0(context, str);
        this.f9742a = c1s0Var;
        c1s0Var.m107652o(str2);
        c1s0Var.m107651n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f9743b) {
            return false;
        }
        this.f9742a.m107650m(motionEvent);
        return false;
    }
}
