package com.p046p1.mobile.putong.live.livingroom.voice.intl.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VLinear;
import p149l.adn0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceIncomeAreaStateView extends VoiceStateView {

    /* JADX INFO: renamed from: c */
    public VLinear f53331c;

    public VoiceIncomeAreaStateView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m78340P(View view) {
        adn0.m95904a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m78341Q(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = t100.m186890d(298.0f);
            setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f53331c.getLayoutParams();
            layoutParams2.topMargin = t100.m186890d(76.0f);
            this.f53331c.setLayoutParams(layoutParams2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        layoutParams3.height = t100.m186890d(196.0f);
        setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f53331c.getLayoutParams();
        layoutParams4.topMargin = t100.m186890d(20.0f);
        this.f53331c.setLayoutParams(layoutParams4);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78340P(this);
    }

    public VoiceIncomeAreaStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceIncomeAreaStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
