package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.t100;
import l.u4c0;
import l.xdl0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreCardScrollBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f2632a;

    /* JADX INFO: renamed from: b */
    public View f2633b;

    /* JADX INFO: renamed from: c */
    public float f2634c;

    public CoreCardScrollBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2634c = t100.d(1.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f2632a = findViewById(u4c0.Xa);
        this.f2633b = findViewById(u4c0.Ya);
        xdl0.X(this.f2632a, (int) this.f2634c);
    }

    public void setProgress(float f) {
        View view = this.f2632a;
        if (view == null || this.f2633b == null) {
            return;
        }
        int height = view.getHeight() - (this.f2633b.getHeight() - ((int) (this.f2634c * 2.0f)));
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f2633b.setTranslationY(height * f);
    }

    public CoreCardScrollBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CoreCardScrollBar(Context context) {
        this(context, null);
    }
}
