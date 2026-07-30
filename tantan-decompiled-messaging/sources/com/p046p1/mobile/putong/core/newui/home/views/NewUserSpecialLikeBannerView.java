package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p149l.ai40;
import p149l.f6c0;

/* JADX INFO: loaded from: classes11.dex */
public class NewUserSpecialLikeBannerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f23982d;

    /* JADX INFO: renamed from: e */
    public CardView f23983e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f23984f;

    /* JADX INFO: renamed from: g */
    public VImage f23985g;

    /* JADX INFO: renamed from: h */
    public TextView f23986h;

    /* JADX INFO: renamed from: i */
    public TextView f23987i;

    /* JADX INFO: renamed from: j */
    public View f23988j;

    public NewUserSpecialLikeBannerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m39189r() {
        if (this.f23988j != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), f6c0.f95645Xa, null);
        this.f23988j = viewInflate;
        m39190h0(viewInflate);
        addView(this.f23988j);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m39190h0(View view) {
        ai40.m96786a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39189r();
        setLayerType(1, null);
    }

    public NewUserSpecialLikeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewUserSpecialLikeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
