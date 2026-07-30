package com.p000p1.mobile.putong.live.livingroom.voice.intl.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.adn0;
import l.t100;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceIncomeAreaStateView extends VoiceStateView {

    /* JADX INFO: renamed from: c */
    public VLinear f6937c;

    public VoiceIncomeAreaStateView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m8537P(View view) {
        adn0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m8538Q(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = t100.d(298.0f);
            setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6937c.getLayoutParams();
            layoutParams2.topMargin = t100.d(76.0f);
            this.f6937c.setLayoutParams(layoutParams2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        layoutParams3.height = t100.d(196.0f);
        setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f6937c.getLayoutParams();
        layoutParams4.topMargin = t100.d(20.0f);
        this.f6937c.setLayoutParams(layoutParams4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8537P(this);
    }

    public VoiceIncomeAreaStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceIncomeAreaStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
