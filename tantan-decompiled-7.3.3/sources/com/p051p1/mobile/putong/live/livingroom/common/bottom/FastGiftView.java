package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.izs;
import p153l.qa00;
import p153l.vjg;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class FastGiftView extends ConstraintLayout implements RedDot {

    /* JADX INFO: renamed from: d */
    public FastGiftView f49354d;

    /* JADX INFO: renamed from: e */
    public VText f49355e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f49356f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49357g;

    /* JADX INFO: renamed from: h */
    public NewFastGiftCountDownView f49358h;

    /* JADX INFO: renamed from: i */
    public VText f49359i;

    /* JADX INFO: renamed from: j */
    public View f49360j;

    public FastGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m73332j0() {
        bnl0.m105525M0(this.f49355e, false);
    }

    /* JADX INFO: renamed from: r */
    private void m73333r() {
        this.f49358h.setOnCountDownListener(new NewFastGiftCountDownView.InterfaceC12973b() { // from class: l.ujg
            @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView.InterfaceC12973b
            /* JADX INFO: renamed from: a */
            public final void mo74999a() {
                this.f179218a.m73332j0();
            }
        });
        this.f49355e.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49360j, z);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m73334i0(View view) {
        vjg.m201504a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public void m73335k0(int i) {
        this.f49358h.m74997o();
        this.f49355e.setText("×" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        bnl0.m105525M0(this.f49355e, true);
        ((ObjectAnimator) gt0.m132166l(this.f49355e, gt0.f106354i, 0L, 300L, gt0.f106346a, 1.8f, 0.85f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m73336l0(@Nullable BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        bnl0.m105524M(this.f49359i, (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null || bLiveFirstChargeCampaign.hasConsumedGift) ? false : true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m73337m0() {
        bnl0.m105524M(this.f49354d, false);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public void m73338n0(BLiveGiftItem bLiveGiftItem, String str) {
        bnl0.m105525M0(this.f49354d, true);
        izs.m142869t("context_livingAct", this.f49357g, bLiveGiftItem.url, qa00.m175859d(32.0f));
        this.f49358h.setCountdownTime(bLiveGiftItem.combosDuration);
        this.f49359i.setText(zrv.f205803e.getString(R$string.f48518z7, bLiveGiftItem.unitPrice + ""));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73334i0(this);
        m73333r();
    }

    public FastGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FastGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
