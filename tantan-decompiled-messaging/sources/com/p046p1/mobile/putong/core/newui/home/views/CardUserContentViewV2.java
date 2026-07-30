package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.newui.view.VIPShimmerTag;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.gm4;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class CardUserContentViewV2 extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f23812c;

    /* JADX INFO: renamed from: d */
    public LinearLayoutFixedLayout f23813d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f23814e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f23815f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f23816g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f23817h;

    /* JADX INFO: renamed from: i */
    public VIPShimmerTag f23818i;

    /* JADX INFO: renamed from: j */
    public VImage f23819j;

    /* JADX INFO: renamed from: k */
    public BlackDiamondTagView f23820k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f23821l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f23822m;

    /* JADX INFO: renamed from: n */
    public VText_Bold f23823n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f23824o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f23825p;

    /* JADX INFO: renamed from: q */
    public VLinear f23826q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f23827r;

    /* JADX INFO: renamed from: s */
    public VText_Medium f23828s;

    /* JADX INFO: renamed from: t */
    public VText_Medium f23829t;

    /* JADX INFO: renamed from: u */
    public VText_Medium f23830u;

    /* JADX INFO: renamed from: v */
    public boolean f23831v;

    public CardUserContentViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23831v = false;
    }

    private void setUsTagBg(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setBackgroundResource(x2c0.f189751T2);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m39137P(View view) {
        gm4.m126928a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39137P(this);
    }

    public CardUserContentViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardUserContentViewV2(Context context) {
        this(context, null);
    }
}
