package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.newui.view.VIPShimmerTag;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.dbc0;
import p153l.fn4;

/* JADX INFO: loaded from: classes11.dex */
public class CardUserContentViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f24554c;

    /* JADX INFO: renamed from: d */
    public LinearLayoutFixedLayout f24555d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f24556e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f24557f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f24558g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f24559h;

    /* JADX INFO: renamed from: i */
    public VIPShimmerTag f24560i;

    /* JADX INFO: renamed from: j */
    public VImage f24561j;

    /* JADX INFO: renamed from: k */
    public BlackDiamondTagView f24562k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f24563l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f24564m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f24565n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f24566o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f24567p;

    /* JADX INFO: renamed from: q */
    public VLinear f24568q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f24569r;

    /* JADX INFO: renamed from: s */
    public VText_Medium f24570s;

    /* JADX INFO: renamed from: t */
    public VText_Medium f24571t;

    /* JADX INFO: renamed from: u */
    public VText_Medium f24572u;

    /* JADX INFO: renamed from: v */
    public boolean f24573v;

    public CardUserContentViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24573v = false;
    }

    private void setUsTagBg(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setBackgroundResource(dbc0.f86619U2);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m40140P(View view) {
        fn4.m126356a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40140P(this);
    }

    public CardUserContentViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardUserContentViewV2(Context context) {
        this(context, null);
    }
}
