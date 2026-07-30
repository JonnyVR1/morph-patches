package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarGiftTab;
import l.e30;
import l.g5c0;
import l.t100;
import l.t6c0;
import l.xdl0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WeekStarChampionView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f7414d;

    /* JADX INFO: renamed from: e */
    public VText f7415e;

    /* JADX INFO: renamed from: f */
    public VText f7416f;

    /* JADX INFO: renamed from: g */
    public VLinear f7417g;

    public WeekStarChampionView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View, com.p1.mobile.putong.live.livingroom.voice.newgiftwall.view.WeekStarChampionItemView, v.VLinear] */
    /* JADX INFO: renamed from: i0 */
    public void m8921i0(WeekStarGiftTab weekStarGiftTab, View.OnClickListener onClickListener, final e30<String> e30Var, boolean z) {
        if (weekStarGiftTab == null) {
            return;
        }
        this.f7415e.setText(weekStarGiftTab.title);
        this.f7414d.setText(weekStarGiftTab.date);
        this.f7417g.removeAllViews();
        float fY0 = (xdl0.y0() - t100.d(54.0f)) / 4.0f;
        for (int i = 0; i < 4; i++) {
            ?? r3 = (WeekStarChampionItemView) LayoutInflater.from(getContext()).inflate(t6c0.U9, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) fY0, t100.d(115.0f));
            if (i > 0) {
                layoutParams.leftMargin = t100.d(8.0f);
            }
            final GiftBean giftBean = weekStarGiftTab.gifts.get(i);
            r3.setOnClickListener(new View.OnClickListener() { // from class: l.jnp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call(giftBean.f7359id);
                }
            });
            r3.m8919P(giftBean);
            this.f7417g.addView(r3, layoutParams);
        }
        VText vText = this.f7416f;
        if (!z) {
            xdl0.M(vText, false);
        } else {
            xdl0.E0(vText, onClickListener);
            xdl0.M(this.f7416f, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f7414d = findViewById(g5c0.k8);
        this.f7415e = findViewById(g5c0.N6);
        this.f7416f = findViewById(g5c0.j8);
        this.f7417g = findViewById(g5c0.h8);
    }

    public WeekStarChampionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeekStarChampionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
