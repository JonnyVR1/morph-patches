package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.Placeholder;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VText;
import p153l.b8c0;
import p153l.bnl0;
import p153l.lbv;
import p153l.mbc0;
import p153l.qa00;
import p153l.wlj;
import p153l.xlj;
import p153l.ynp0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceNewCardView extends BaseCardView {

    /* JADX INFO: renamed from: r */
    public static int[] f45592r = {mbc0.f135670b0, mbc0.f135672c0, mbc0.f135674d0, mbc0.f135676e0};

    /* JADX INFO: renamed from: d */
    public LiveVoiceNewCardView f45593d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f45594e;

    /* JADX INFO: renamed from: f */
    public ImageView f45595f;

    /* JADX INFO: renamed from: g */
    public VText f45596g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f45597h;

    /* JADX INFO: renamed from: i */
    public TextView f45598i;

    /* JADX INFO: renamed from: j */
    public Placeholder f45599j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f45600k;

    /* JADX INFO: renamed from: l */
    public VText f45601l;

    /* JADX INFO: renamed from: m */
    public TextView f45602m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f45603n;

    /* JADX INFO: renamed from: o */
    public ViewFlipper f45604o;

    /* JADX INFO: renamed from: p */
    public int[] f45605p;

    /* JADX INFO: renamed from: q */
    public int[] f45606q;

    public LiveVoiceNewCardView(Context context) {
        super(context);
        this.f45605p = new int[]{mbc0.f135678f0, mbc0.f135680g0, mbc0.f135682h0, mbc0.f135684i0};
        this.f45606q = new int[]{mbc0.f135687k, mbc0.f135689l, mbc0.f135691m, mbc0.f135693n};
    }

    /* JADX INFO: renamed from: k0 */
    private void m69962k0() {
        ViewGroup.LayoutParams layoutParams = this.f45593d.getLayoutParams();
        int iM105592y0 = (int) ((bnl0.m105592y0() - qa00.f156330q) / 2.0f);
        layoutParams.width = iM105592y0;
        int i = (int) (iM105592y0 * 0.86f);
        layoutParams.height = i;
        if (i > qa00.m175859d(145.0f)) {
            this.f45593d.setLayoutParams(layoutParams);
            bnl0.m105505C0(this.f45599j, (layoutParams.height - qa00.m175859d(145.0f)) + qa00.m175859d(25.0f));
        }
        ynp0.m216935l(this.f45593d, 0, 0, 0, 0, qa00.f156321h);
    }

    /* JADX INFO: renamed from: r */
    private void m69963r() {
        m69965i0();
        m69966j0();
        m69962k0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m69964h0(View view) {
        lbv.m153595a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m69965i0() {
        for (int i = 0; i < 6; i++) {
            VDraweeView vDraweeView = new VDraweeView(getContext());
            wlj wljVarM211638a = new xlj(getResources()).m211638a();
            RoundingParams roundingParamsM8301a = RoundingParams.m8301a();
            roundingParamsM8301a.m8315o(Color.parseColor("#ffffff"), qa00.f156314a);
            wljVarM211638a.m207045H(roundingParamsM8301a);
            vDraweeView.setHierarchy(wljVarM211638a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(24.0f), qa00.m175859d(24.0f));
            if (i != 0) {
                layoutParams.leftMargin = -qa00.m175859d(6.0f);
            }
            vDraweeView.setLayoutParams(layoutParams);
            this.f45600k.addView(vDraweeView);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m69966j0() {
        this.f45604o = new ViewFlipper(getContext());
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        this.f45604o.setLayoutParams(layoutParams);
        this.f45604o.setInAnimation(getContext(), b8c0.f75416a);
        this.f45604o.setOutAnimation(getContext(), b8c0.f75417b);
        this.f45604o.setFlipInterval(1800);
        this.f45603n.addView(this.f45604o);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69964h0(this);
        m69963r();
    }

    public LiveVoiceNewCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45605p = new int[]{mbc0.f135678f0, mbc0.f135680g0, mbc0.f135682h0, mbc0.f135684i0};
        this.f45606q = new int[]{mbc0.f135687k, mbc0.f135689l, mbc0.f135691m, mbc0.f135693n};
    }

    public LiveVoiceNewCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45605p = new int[]{mbc0.f135678f0, mbc0.f135680g0, mbc0.f135682h0, mbc0.f135684i0};
        this.f45606q = new int[]{mbc0.f135687k, mbc0.f135689l, mbc0.f135691m, mbc0.f135693n};
    }
}
