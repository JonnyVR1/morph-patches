package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import p147v.VFrame;
import p147v.VIcon;
import p149l.f6c0;
import p149l.hoh;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardOperationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f26432a;

    /* JADX INFO: renamed from: b */
    public VIcon f26433b;

    public FeedPoiCardOperationButton(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = View.inflate(getContext(), f6c0.f95355F8, null);
        m43186p(viewInflate);
        addView(viewInflate);
    }

    /* JADX INFO: renamed from: p */
    public final void m43186p(View view) {
        hoh.m132221a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m43187s(@DrawableRes int i, @DrawableRes int i2) {
        this.f26432a.setBackgroundResource(i);
        this.f26433b.setImageResource(i2);
    }

    public FeedPoiCardOperationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
