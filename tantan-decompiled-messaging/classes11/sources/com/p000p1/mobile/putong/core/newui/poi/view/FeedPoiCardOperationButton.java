package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import l.f6c0;
import l.hoh;
import v.VFrame;
import v.VIcon;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardOperationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f5210a;

    /* JADX INFO: renamed from: b */
    public VIcon f5211b;

    public FeedPoiCardOperationButton(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        View viewInflate = View.inflate(getContext(), f6c0.F8, null);
        m7401p(viewInflate);
        addView(viewInflate);
    }

    /* JADX INFO: renamed from: p */
    public final void m7401p(View view) {
        hoh.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m7402s(@DrawableRes int i, @DrawableRes int i2) {
        this.f5210a.setBackgroundResource(i);
        this.f5211b.setImageResource(i2);
    }

    public FeedPoiCardOperationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
