package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarGiftTab;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.mdc0;
import p153l.qa00;
import p153l.y20;
import p153l.yec0;

/* JADX INFO: loaded from: classes10.dex */
public class WeekStarChampionView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f54656d;

    /* JADX INFO: renamed from: e */
    public VText f54657e;

    /* JADX INFO: renamed from: f */
    public VText f54658f;

    /* JADX INFO: renamed from: g */
    public VLinear f54659g;

    public WeekStarChampionView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public void m79888i0(WeekStarGiftTab weekStarGiftTab, View.OnClickListener onClickListener, final y20<String> y20Var, boolean z) {
        if (weekStarGiftTab == null) {
            return;
        }
        this.f54657e.setText(weekStarGiftTab.title);
        this.f54656d.setText(weekStarGiftTab.date);
        this.f54659g.removeAllViews();
        float fM105592y0 = (bnl0.m105592y0() - qa00.m175859d(54.0f)) / 4.0f;
        for (int i = 0; i < 4; i++) {
            WeekStarChampionItemView weekStarChampionItemView = (WeekStarChampionItemView) LayoutInflater.from(getContext()).inflate(yec0.f198941U9, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) fM105592y0, qa00.m175859d(115.0f));
            if (i > 0) {
                layoutParams.leftMargin = qa00.m175859d(8.0f);
            }
            final GiftBean giftBean = weekStarGiftTab.gifts.get(i);
            weekStarChampionItemView.setOnClickListener(new View.OnClickListener() { // from class: l.nwp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y20Var.call(giftBean.f54601id);
                }
            });
            weekStarChampionItemView.m79886P(giftBean);
            this.f54659g.addView(weekStarChampionItemView, layoutParams);
        }
        VText vText = this.f54658f;
        if (!z) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105509E0(vText, onClickListener);
            bnl0.m105524M(this.f54658f, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54656d = (VText) findViewById(mdc0.f136226k8);
        this.f54657e = (VText) findViewById(mdc0.f136007N6);
        this.f54658f = (VText) findViewById(mdc0.f136216j8);
        this.f54659g = (VLinear) findViewById(mdc0.f136196h8);
    }

    public WeekStarChampionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeekStarChampionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
