package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VText;
import p149l.f6c0;
import p149l.kd9;

/* JADX INFO: loaded from: classes11.dex */
public class CoreLetterView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f23857d;

    /* JADX INFO: renamed from: e */
    public VText f23858e;

    /* JADX INFO: renamed from: f */
    public View f23859f;

    public CoreLetterView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m39141r() {
        if (this.f23859f != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), f6c0.f95468M9, null);
        this.f23859f = viewInflate;
        m39142h0(viewInflate);
        addView(this.f23859f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m39142h0(View view) {
        kd9.m145625a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39141r();
        setLayerType(1, null);
    }

    public CoreLetterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
