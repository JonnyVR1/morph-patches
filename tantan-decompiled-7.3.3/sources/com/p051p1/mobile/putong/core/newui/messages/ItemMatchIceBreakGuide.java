package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p151v.VText;
import p153l.g9c0;
import p153l.gta;
import p153l.l8q;

/* JADX INFO: loaded from: classes11.dex */
public class ItemMatchIceBreakGuide extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f25975a;

    public ItemMatchIceBreakGuide(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m42675a(View view) {
        l8q.m153297a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42675a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f25975a.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemMatchIceBreakGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMatchIceBreakGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ItemMatchIceBreakGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
