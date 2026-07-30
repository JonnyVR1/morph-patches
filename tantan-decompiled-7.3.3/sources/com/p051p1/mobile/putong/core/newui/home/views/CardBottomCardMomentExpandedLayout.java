package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.CardDraweeViewOpt;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.qa00;
import p153l.th4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomCardMomentExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f24179c;

    /* JADX INFO: renamed from: d */
    public CardDraweeViewOpt f24180d;

    /* JADX INFO: renamed from: e */
    public VText f24181e;

    /* JADX INFO: renamed from: f */
    public VText f24182f;

    /* JADX INFO: renamed from: g */
    public VImage f24183g;

    /* JADX INFO: renamed from: h */
    public VImage f24184h;

    /* JADX INFO: renamed from: i */
    public VLinear f24185i;

    /* JADX INFO: renamed from: j */
    public VText f24186j;

    /* JADX INFO: renamed from: k */
    public VText f24187k;

    /* JADX INFO: renamed from: l */
    public VFrame f24188l;

    /* JADX INFO: renamed from: m */
    public IconTextView f24189m;

    /* JADX INFO: renamed from: n */
    public Pair<Integer, Integer> f24190n;

    public CardBottomCardMomentExpandedLayout(Context context) {
        super(context);
        this.f24190n = new Pair<>(0, 0);
    }

    /* JADX INFO: renamed from: P */
    public final void m39903P(View view) {
        th4.m191217a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39903P(this);
        this.f24180d.setCurState(1);
        CardDraweeViewOpt cardDraweeViewOpt = this.f24180d;
        int i = qa00.f156332s;
        cardDraweeViewOpt.m39224w(i, i, i, i);
    }

    public CardBottomCardMomentExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24190n = new Pair<>(0, 0);
    }

    public CardBottomCardMomentExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24190n = new Pair<>(0, 0);
    }
}
