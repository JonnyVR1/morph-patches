package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import l.bwg0;
import l.f6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SuperLikeBannerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f2797d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f2798e;

    /* JADX INFO: renamed from: f */
    public VText f2799f;

    /* JADX INFO: renamed from: g */
    public View f2800g;

    public SuperLikeBannerView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m3224r() {
        if (this.f2800g != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), f6c0.Va, null);
        this.f2800g = viewInflate;
        m3225h0(viewInflate);
        addView(this.f2800g);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3225h0(View view) {
        bwg0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3224r();
        setLayerType(1, null);
    }

    public SuperLikeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuperLikeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
