package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import p151v.VText;
import p153l.j4h0;
import p153l.kec0;

/* JADX INFO: loaded from: classes11.dex */
public class SuperLikeBannerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f24761d;

    /* JADX INFO: renamed from: e */
    public GradientBgButton f24762e;

    /* JADX INFO: renamed from: f */
    public VText f24763f;

    /* JADX INFO: renamed from: g */
    public View f24764g;

    public SuperLikeBannerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m40209r() {
        if (this.f24764g != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), kec0.f125782cb, null);
        this.f24764g = viewInflate;
        m40210h0(viewInflate);
        addView(this.f24764g);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m40210h0(View view) {
        j4h0.m143425a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40209r();
        setLayerType(1, null);
    }

    public SuperLikeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SuperLikeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
