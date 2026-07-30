package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarGiftTab;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.g5c0;
import p149l.t100;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class WeekStarChampionView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f53808d;

    /* JADX INFO: renamed from: e */
    public VText f53809e;

    /* JADX INFO: renamed from: f */
    public VText f53810f;

    /* JADX INFO: renamed from: g */
    public VLinear f53811g;

    public WeekStarChampionView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78705i0(WeekStarGiftTab weekStarGiftTab, View.OnClickListener onClickListener, final e30<String> e30Var, boolean z) {
        if (weekStarGiftTab == null) {
            return;
        }
        this.f53809e.setText(weekStarGiftTab.title);
        this.f53808d.setText(weekStarGiftTab.date);
        this.f53811g.removeAllViews();
        float fM208412y0 = (xdl0.m208412y0() - t100.m186890d(54.0f)) / 4.0f;
        for (int i = 0; i < 4; i++) {
            WeekStarChampionItemView weekStarChampionItemView = (WeekStarChampionItemView) LayoutInflater.from(getContext()).inflate(t6c0.f168209U9, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) fM208412y0, t100.m186890d(115.0f));
            if (i > 0) {
                layoutParams.leftMargin = t100.m186890d(8.0f);
            }
            final GiftBean giftBean = weekStarGiftTab.gifts.get(i);
            weekStarChampionItemView.setOnClickListener(new View.OnClickListener() { // from class: l.jnp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e30Var.call(giftBean.f53753id);
                }
            });
            weekStarChampionItemView.m78703P(giftBean);
            this.f53811g.addView(weekStarChampionItemView, layoutParams);
        }
        VText vText = this.f53810f;
        if (!z) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208329E0(vText, onClickListener);
            xdl0.m208344M(this.f53810f, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53808d = (VText) findViewById(g5c0.f100981k8);
        this.f53809e = (VText) findViewById(g5c0.f100762N6);
        this.f53810f = (VText) findViewById(g5c0.f100971j8);
        this.f53811g = (VLinear) findViewById(g5c0.f100951h8);
    }

    public WeekStarChampionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeekStarChampionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
