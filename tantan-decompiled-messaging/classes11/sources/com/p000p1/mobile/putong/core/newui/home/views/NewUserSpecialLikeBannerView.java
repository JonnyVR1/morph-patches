package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.ai40;
import l.f6c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewUserSpecialLikeBannerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f2760d;

    /* JADX INFO: renamed from: e */
    public CardView f2761e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f2762f;

    /* JADX INFO: renamed from: g */
    public VImage f2763g;

    /* JADX INFO: renamed from: h */
    public TextView f2764h;

    /* JADX INFO: renamed from: i */
    public TextView f2765i;

    /* JADX INFO: renamed from: j */
    public View f2766j;

    public NewUserSpecialLikeBannerView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m3207r() {
        if (this.f2766j != null) {
            return;
        }
        View viewInflate = View.inflate(getContext(), f6c0.Xa, null);
        this.f2766j = viewInflate;
        m3208h0(viewInflate);
        addView(this.f2766j);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3208h0(View view) {
        ai40.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3207r();
        setLayerType(1, null);
    }

    public NewUserSpecialLikeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewUserSpecialLikeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
