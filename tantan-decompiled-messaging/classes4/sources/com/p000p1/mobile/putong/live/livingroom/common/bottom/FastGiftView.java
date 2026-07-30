package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import l.bt0;
import l.hxs;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.hig;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FastGiftView extends ConstraintLayout implements RedDot {

    /* JADX INFO: renamed from: d */
    public FastGiftView f4548d;

    /* JADX INFO: renamed from: e */
    public VText f4549e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f4550f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4551g;

    /* JADX INFO: renamed from: h */
    public NewFastGiftCountDownView f4552h;

    /* JADX INFO: renamed from: i */
    public VText f4553i;

    /* JADX INFO: renamed from: j */
    public View f4554j;

    public FastGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m5622j0() {
        xdl0.M0(this.f4549e, false);
    }

    /* JADX INFO: renamed from: r */
    private void m5623r() {
        this.f4552h.setOnCountDownListener(new NewFastGiftCountDownView.InterfaceC0399b() { // from class: l.gig
            @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView.InterfaceC0399b
            /* JADX INFO: renamed from: a */
            public final void mo7372a() {
                this.f11455a.m5622j0();
            }
        });
        this.f4549e.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4554j, z);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m5624i0(View view) {
        hig.m14388a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public void m5625k0(int i) {
        this.f4552h.m7370o();
        this.f4549e.setText("×" + i + " ");
        xdl0.M0(this.f4549e, true);
        ((ObjectAnimator) bt0.l(this.f4549e, bt0.i, 0L, 300L, bt0.a, new float[]{1.8f, 0.85f, 1.0f})).start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m5626l0(@Nullable BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        xdl0.M(this.f4553i, (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null || bLiveFirstChargeCampaign.hasConsumedGift) ? false : true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m5627m0() {
        xdl0.M(this.f4548d, false);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public void m5628n0(BLiveGiftItem bLiveGiftItem, String str) {
        xdl0.M0(this.f4548d, true);
        hxs.t("context_livingAct", this.f4551g, bLiveGiftItem.url, t100.d(32.0f));
        this.f4552h.setCountdownTime(bLiveGiftItem.combosDuration);
        this.f4553i.setText(ypv.e.getString(R$string.f3712z7, bLiveGiftItem.unitPrice + ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5624i0(this);
        m5623r();
    }

    public FastGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FastGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
