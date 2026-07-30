package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p153l.kec0;
import p153l.oq40;

/* JADX INFO: loaded from: classes11.dex */
public class NewUserSpecialLikeBannerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f24724d;

    /* JADX INFO: renamed from: e */
    public CardView f24725e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f24726f;

    /* JADX INFO: renamed from: g */
    public VImage f24727g;

    /* JADX INFO: renamed from: h */
    public TextView f24728h;

    /* JADX INFO: renamed from: i */
    public TextView f24729i;

    /* JADX INFO: renamed from: j */
    public View f24730j;

    public NewUserSpecialLikeBannerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m40192r() {
        if (this.f24730j != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), kec0.f125816eb, null);
        this.f24730j = viewInflate;
        m40193h0(viewInflate);
        addView(this.f24730j);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m40193h0(View view) {
        oq40.m168787a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40192r();
        setLayerType(1, null);
    }

    public NewUserSpecialLikeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewUserSpecialLikeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
