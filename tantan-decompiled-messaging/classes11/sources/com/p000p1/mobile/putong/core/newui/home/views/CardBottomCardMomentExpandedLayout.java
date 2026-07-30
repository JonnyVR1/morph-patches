package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.CardDraweeViewOpt;
import l.t100;
import l.ug4;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomCardMomentExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f2215c;

    /* JADX INFO: renamed from: d */
    public CardDraweeViewOpt f2216d;

    /* JADX INFO: renamed from: e */
    public VText f2217e;

    /* JADX INFO: renamed from: f */
    public VText f2218f;

    /* JADX INFO: renamed from: g */
    public VImage f2219g;

    /* JADX INFO: renamed from: h */
    public VImage f2220h;

    /* JADX INFO: renamed from: i */
    public VLinear f2221i;

    /* JADX INFO: renamed from: j */
    public VText f2222j;

    /* JADX INFO: renamed from: k */
    public VText f2223k;

    /* JADX INFO: renamed from: l */
    public VFrame f2224l;

    /* JADX INFO: renamed from: m */
    public IconTextView f2225m;

    /* JADX INFO: renamed from: n */
    public Pair<Integer, Integer> f2226n;

    public CardBottomCardMomentExpandedLayout(Context context) {
        super(context);
        this.f2226n = new Pair<>(0, 0);
    }

    /* JADX INFO: renamed from: P */
    public final void m2907P(View view) {
        ug4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2907P(this);
        this.f2216d.setCurState(1);
        CardDraweeViewOpt cardDraweeViewOpt = this.f2216d;
        int i = t100.s;
        cardDraweeViewOpt.m2199w(i, i, i, i);
    }

    public CardBottomCardMomentExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2226n = new Pair<>(0, 0);
    }

    public CardBottomCardMomentExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2226n = new Pair<>(0, 0);
    }
}
