package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import p149l.wrr0;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
final class zzh extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final wrr0 f9705a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public boolean f9706b;

    public zzh(Context context, String str, String str2, String str3) {
        super(context);
        wrr0 wrr0Var = new wrr0(context, str);
        this.f9705a = wrr0Var;
        wrr0Var.m205292o(str2);
        wrr0Var.m205291n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f9706b) {
            return false;
        }
        this.f9705a.m205290m(motionEvent);
        return false;
    }
}
