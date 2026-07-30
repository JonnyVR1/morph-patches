package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VText;
import p153l.kec0;
import p153l.te9;

/* JADX INFO: loaded from: classes11.dex */
public class CoreLetterView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f24599d;

    /* JADX INFO: renamed from: e */
    public VText f24600e;

    /* JADX INFO: renamed from: f */
    public View f24601f;

    public CoreLetterView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m40144r() {
        if (this.f24601f != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), kec0.f125634T9, null);
        this.f24601f = viewInflate;
        m40145h0(viewInflate);
        addView(this.f24601f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m40145h0(View view) {
        te9.m190684a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40144r();
        setLayerType(1, null);
    }

    public CoreLetterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreLetterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
