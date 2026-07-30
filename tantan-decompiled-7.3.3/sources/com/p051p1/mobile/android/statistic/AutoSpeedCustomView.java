package com.p051p1.mobile.android.statistic;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p153l.af60;

/* JADX INFO: loaded from: classes8.dex */
public class AutoSpeedCustomView extends View {

    /* JADX INFO: renamed from: a */
    public boolean f16357a;

    /* JADX INFO: renamed from: b */
    public Context f16358b;

    public AutoSpeedCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16357a = false;
        m21811a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m21811a(Context context) {
        this.f16358b = context;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16357a) {
            return;
        }
        if (this.f16358b instanceof Activity) {
            af60.m97310e().m97320k((Activity) this.f16358b);
        }
        this.f16357a = true;
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
