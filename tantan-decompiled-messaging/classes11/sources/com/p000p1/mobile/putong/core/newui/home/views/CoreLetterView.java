package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.f6c0;
import l.kd9;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreLetterView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f2635d;

    /* JADX INFO: renamed from: e */
    public VText f2636e;

    /* JADX INFO: renamed from: f */
    public View f2637f;

    public CoreLetterView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m3157r() {
        if (this.f2637f != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), f6c0.M9, null);
        this.f2637f = viewInflate;
        m3158h0(viewInflate);
        addView(this.f2637f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3158h0(View view) {
        kd9.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3157r();
        setLayerType(1, null);
    }

    public CoreLetterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
