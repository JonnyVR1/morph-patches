package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p000p1.mobile.putong.newui.view.VIPShimmerTag;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import l.gm4;
import l.x2c0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardUserContentViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f2590c;

    /* JADX INFO: renamed from: d */
    public LinearLayoutFixedLayout f2591d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f2592e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f2593f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f2594g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f2595h;

    /* JADX INFO: renamed from: i */
    public VIPShimmerTag f2596i;

    /* JADX INFO: renamed from: j */
    public VImage f2597j;

    /* JADX INFO: renamed from: k */
    public BlackDiamondTagView f2598k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f2599l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f2600m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f2601n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f2602o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f2603p;

    /* JADX INFO: renamed from: q */
    public VLinear f2604q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f2605r;

    /* JADX INFO: renamed from: s */
    public VText_Medium f2606s;

    /* JADX INFO: renamed from: t */
    public VText_Medium f2607t;

    /* JADX INFO: renamed from: u */
    public VText_Medium f2608u;

    /* JADX INFO: renamed from: v */
    public boolean f2609v;

    public CardUserContentViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2609v = false;
    }

    private void setUsTagBg(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setBackgroundResource(x2c0.T2);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m3153P(View view) {
        gm4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3153P(this);
    }

    public CardUserContentViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardUserContentViewV2(Context context) {
        this(context, null);
    }
}
