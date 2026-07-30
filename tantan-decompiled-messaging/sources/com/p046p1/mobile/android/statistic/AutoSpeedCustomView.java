package com.p046p1.mobile.android.statistic;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p149l.u660;

/* JADX INFO: loaded from: classes8.dex */
public class AutoSpeedCustomView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f15638a;

    /* JADX INFO: renamed from: b */
    public Context f15639b;

    public AutoSpeedCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15638a = false;
        m20812a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m20812a(Context context) {
        this.f15639b = context;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15638a) {
            return;
        }
        if (this.f15639b instanceof Activity) {
            u660.m191956e().m191966k((Activity) this.f15639b);
        }
        this.f15638a = true;
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
