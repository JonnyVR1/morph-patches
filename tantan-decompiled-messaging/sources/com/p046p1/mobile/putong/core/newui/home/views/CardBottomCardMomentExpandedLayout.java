package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.CardDraweeViewOpt;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.t100;
import p149l.ug4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomCardMomentExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f23437c;

    /* JADX INFO: renamed from: d */
    public CardDraweeViewOpt f23438d;

    /* JADX INFO: renamed from: e */
    public VText f23439e;

    /* JADX INFO: renamed from: f */
    public VText f23440f;

    /* JADX INFO: renamed from: g */
    public VImage f23441g;

    /* JADX INFO: renamed from: h */
    public VImage f23442h;

    /* JADX INFO: renamed from: i */
    public VLinear f23443i;

    /* JADX INFO: renamed from: j */
    public VText f23444j;

    /* JADX INFO: renamed from: k */
    public VText f23445k;

    /* JADX INFO: renamed from: l */
    public VFrame f23446l;

    /* JADX INFO: renamed from: m */
    public IconTextView f23447m;

    /* JADX INFO: renamed from: n */
    public Pair<Integer, Integer> f23448n;

    public CardBottomCardMomentExpandedLayout(Context context) {
        super(context);
        this.f23448n = new Pair<>(0, 0);
    }

    /* JADX INFO: renamed from: P */
    public final void m38900P(View view) {
        ug4.m193479a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38900P(this);
        this.f23438d.setCurState(1);
        CardDraweeViewOpt cardDraweeViewOpt = this.f23438d;
        int i = t100.f167270s;
        cardDraweeViewOpt.m38221w(i, i, i, i);
    }

    public CardBottomCardMomentExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23448n = new Pair<>(0, 0);
    }

    public CardBottomCardMomentExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23448n = new Pair<>(0, 0);
    }
}
