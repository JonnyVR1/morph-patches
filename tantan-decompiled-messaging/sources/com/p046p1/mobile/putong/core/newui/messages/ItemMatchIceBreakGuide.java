package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p147v.VText;
import p149l.a1c0;
import p149l.l6q;
import p149l.ura;

/* JADX INFO: loaded from: classes11.dex */
public class ItemMatchIceBreakGuide extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f25233a;

    public ItemMatchIceBreakGuide(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m41664a(View view) {
        l6q.m148753a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41664a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f25233a.setTextColor(getResources().getColor(a1c0.f67155i));
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
