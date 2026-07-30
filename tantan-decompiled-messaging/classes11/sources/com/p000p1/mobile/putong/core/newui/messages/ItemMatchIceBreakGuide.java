package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import l.a1c0;
import l.l6q;
import l.ura;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ItemMatchIceBreakGuide extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f4011a;

    public ItemMatchIceBreakGuide(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5788a(View view) {
        l6q.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5788a(this);
        if (ura.e().d().I4()) {
            this.f4011a.setTextColor(getResources().getColor(a1c0.i));
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
