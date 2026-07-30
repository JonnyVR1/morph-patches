package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import p147v.VText;
import p149l.bwg0;
import p149l.f6c0;

/* JADX INFO: loaded from: classes11.dex */
public class SuperLikeBannerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f24019d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f24020e;

    /* JADX INFO: renamed from: f */
    public VText f24021f;

    /* JADX INFO: renamed from: g */
    public View f24022g;

    public SuperLikeBannerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m39206r() {
        if (this.f24022g != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), f6c0.f95613Va, null);
        this.f24022g = viewInflate;
        m39207h0(viewInflate);
        addView(this.f24022g);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m39207h0(View view) {
        bwg0.m104156a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39206r();
        setLayerType(1, null);
    }

    public SuperLikeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuperLikeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
