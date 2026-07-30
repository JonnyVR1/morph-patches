package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import p151v.VFrame;
import p151v.VIcon;
import p153l.kec0;
import p153l.wph;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardOperationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f27174a;

    /* JADX INFO: renamed from: b */
    public VIcon f27175b;

    public FeedPoiCardOperationButton(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = View.inflate(getContext(), kec0.f125521M8, null);
        m44197p(viewInflate);
        addView(viewInflate);
    }

    /* JADX INFO: renamed from: p */
    public final void m44197p(View view) {
        wph.m207459a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m44198s(@DrawableRes int i, @DrawableRes int i2) {
        this.f27174a.setBackgroundResource(i);
        this.f27175b.setImageResource(i2);
    }

    public FeedPoiCardOperationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
