package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.ioh;
import p149l.qib0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardSendGreetView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f26435c;

    /* JADX INFO: renamed from: d */
    public VText f26436d;

    /* JADX INFO: renamed from: e */
    public VText f26437e;

    public FeedPoiCardSendGreetView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m43189r() {
        VText vText = this.f26436d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f26437e.setTypeface(typeface);
        qib0.f154691G.m102354Y0(this.f26435c, x2c0.f189500L);
    }

    /* JADX INFO: renamed from: P */
    public final void m43190P(View view) {
        ioh.m137334a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43190P(this);
        m43189r();
    }

    public FeedPoiCardSendGreetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardSendGreetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
