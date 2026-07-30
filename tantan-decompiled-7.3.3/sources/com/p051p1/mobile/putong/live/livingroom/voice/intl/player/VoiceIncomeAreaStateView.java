package com.p051p1.mobile.putong.live.livingroom.voice.intl.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VLinear;
import p153l.emn0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceIncomeAreaStateView extends VoiceStateView {

    /* JADX INFO: renamed from: c */
    public VLinear f54179c;

    public VoiceIncomeAreaStateView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m79523P(View view) {
        emn0.m121371a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m79524Q(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = qa00.m175859d(298.0f);
            setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f54179c.getLayoutParams();
            layoutParams2.topMargin = qa00.m175859d(76.0f);
            this.f54179c.setLayoutParams(layoutParams2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        layoutParams3.height = qa00.m175859d(196.0f);
        setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f54179c.getLayoutParams();
        layoutParams4.topMargin = qa00.m175859d(20.0f);
        this.f54179c.setLayoutParams(layoutParams4);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79523P(this);
    }

    public VoiceIncomeAreaStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceIncomeAreaStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
