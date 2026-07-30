package com.p046p1.mobile.putong.live.livingroom.common.bottom;

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
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.hig;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class FastGiftView extends ConstraintLayout implements RedDot {

    /* JADX INFO: renamed from: d */
    public FastGiftView f48506d;

    /* JADX INFO: renamed from: e */
    public VText f48507e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f48508f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f48509g;

    /* JADX INFO: renamed from: h */
    public NewFastGiftCountDownView f48510h;

    /* JADX INFO: renamed from: i */
    public VText f48511i;

    /* JADX INFO: renamed from: j */
    public View f48512j;

    public FastGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m72149j0() {
        xdl0.m208345M0(this.f48507e, false);
    }

    /* JADX INFO: renamed from: r */
    private void m72150r() {
        this.f48510h.setOnCountDownListener(new NewFastGiftCountDownView.InterfaceC12810b() { // from class: l.gig
            @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.NewFastGiftCountDownView.InterfaceC12810b
            /* JADX INFO: renamed from: a */
            public final void mo73816a() {
                this.f102892a.m72149j0();
            }
        });
        this.f48507e.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48512j, z);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m72151i0(View view) {
        hig.m131253a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public void m72152k0(int i) {
        this.f48510h.m73814o();
        this.f48507e.setText("×" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        xdl0.m208345M0(this.f48507e, true);
        ((ObjectAnimator) bt0.m103739l(this.f48507e, bt0.f77162i, 0L, 300L, bt0.f77154a, 1.8f, 0.85f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m72153l0(@Nullable BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        xdl0.m208344M(this.f48511i, (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null || bLiveFirstChargeCampaign.hasConsumedGift) ? false : true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m72154m0() {
        xdl0.m208344M(this.f48506d, false);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public void m72155n0(BLiveGiftItem bLiveGiftItem, String str) {
        xdl0.m208345M0(this.f48506d, true);
        hxs.m133407t("context_livingAct", this.f48509g, bLiveGiftItem.url, t100.m186890d(32.0f));
        this.f48510h.setCountdownTime(bLiveGiftItem.combosDuration);
        this.f48511i.setText(ypv.f199497e.getString(R$string.f47670z7, bLiveGiftItem.unitPrice + ""));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72151i0(this);
        m72150r();
    }

    public FastGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FastGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
