package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import l.ioh;
import l.qib0;
import l.x2c0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardSendGreetView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f5213c;

    /* JADX INFO: renamed from: d */
    public VText f5214d;

    /* JADX INFO: renamed from: e */
    public VText f5215e;

    public FeedPoiCardSendGreetView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m7405r() {
        VText vText = this.f5214d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f5215e.setTypeface(typeface);
        qib0.G.Y0(this.f5213c, x2c0.L);
    }

    /* JADX INFO: renamed from: P */
    public final void m7406P(View view) {
        ioh.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7406P(this);
        m7405r();
    }

    public FeedPoiCardSendGreetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardSendGreetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
