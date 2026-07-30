package com.p003p1.mobile.android.statistic;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p007l.u660;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AutoSpeedCustomView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f1337a;

    /* JADX INFO: renamed from: b */
    public Context f1338b;

    public AutoSpeedCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1337a = false;
        m1083a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1083a(Context context) {
        this.f1338b = context;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1337a) {
            return;
        }
        if (this.f1338b instanceof Activity) {
            u660.m11183e().m11193k((Activity) this.f1338b);
        }
        this.f1337a = true;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public AutoSpeedCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoSpeedCustomView(Context context) {
        this(context, null);
    }
}
