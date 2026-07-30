package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VFrame;
import p149l.t100;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreCardScrollBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f23854a;

    /* JADX INFO: renamed from: b */
    public View f23855b;

    /* JADX INFO: renamed from: c */
    public float f23856c;

    public CoreCardScrollBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23856c = t100.m186890d(1.5f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f23854a = findViewById(u4c0.f174114Xa);
        this.f23855b = findViewById(u4c0.f174130Ya);
        xdl0.m208360X(this.f23854a, (int) this.f23856c);
    }

    public void setProgress(float f) {
        View view = this.f23854a;
        if (view == null || this.f23855b == null) {
            return;
        }
        int height = view.getHeight() - (this.f23855b.getHeight() - ((int) (this.f23856c * 2.0f)));
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f23855b.setTranslationY(height * f);
    }

    public CoreCardScrollBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CoreCardScrollBar(Context context) {
        this(context, null);
    }
}
