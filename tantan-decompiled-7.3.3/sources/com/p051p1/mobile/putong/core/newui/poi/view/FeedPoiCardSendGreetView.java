package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.dbc0;
import p153l.uqb0;
import p153l.xph;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardSendGreetView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f27177c;

    /* JADX INFO: renamed from: d */
    public VText f27178d;

    /* JADX INFO: renamed from: e */
    public VText f27179e;

    public FeedPoiCardSendGreetView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m44200r() {
        VText vText = this.f27178d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f27179e.setTypeface(typeface);
        uqb0.f180374G.m127138Y0(this.f27177c, dbc0.f86360M);
    }

    /* JADX INFO: renamed from: P */
    public final void m44201P(View view) {
        xph.m212649a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44201P(this);
        m44200r();
    }

    public FeedPoiCardSendGreetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardSendGreetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
