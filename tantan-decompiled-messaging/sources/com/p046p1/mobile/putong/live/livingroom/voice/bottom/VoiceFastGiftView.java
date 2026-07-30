package com.p046p1.mobile.putong.live.livingroom.voice.bottom;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.eqh0;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.w5n0;
import p149l.xdl0;
import p149l.xxj;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceFastGiftView extends ConstraintLayout implements RedDot {

    /* JADX INFO: renamed from: d */
    public VoiceFastGiftView f52914d;

    /* JADX INFO: renamed from: e */
    public VText f52915e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f52916f;

    /* JADX INFO: renamed from: g */
    public FastGiftCountDownView f52917g;

    /* JADX INFO: renamed from: h */
    public VText f52918h;

    /* JADX INFO: renamed from: i */
    public View f52919i;

    public VoiceFastGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m77770j0() {
        xdl0.m208345M0(this.f52915e, false);
    }

    /* JADX INFO: renamed from: r */
    private void m77771r() {
        this.f52917g.setOnCountDownListener(new FastGiftCountDownView.InterfaceC12806b() { // from class: l.v5n0
            @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView.InterfaceC12806b
            /* JADX INFO: renamed from: a */
            public final void mo73775a() {
                this.f180100a.m77770j0();
            }
        });
        xxj.m211503d(this.f52915e);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f52919i, z);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m77772i0(View view) {
        w5n0.m201659a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public void m77773k0(int i) {
        this.f52917g.m73774i();
        this.f52915e.setText("×" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        xdl0.m208345M0(this.f52915e, true);
        ((ObjectAnimator) bt0.m103739l(this.f52915e, bt0.f77162i, 0L, 300L, bt0.f77154a, 1.4f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m77774l0(@Nullable BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (bLiveData != null && (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) != null) {
            boolean z = bLiveFirstChargeCampaign.hasConsumedGift;
        }
        xdl0.m208344M(this.f52918h, false);
    }

    /* JADX INFO: renamed from: m0 */
    public void m77775m0() {
        xdl0.m208344M(this.f52914d, false);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public void m77776n0(BLiveGiftItem bLiveGiftItem, String str) {
        xdl0.m208345M0(this.f52914d, true);
        VDraweeView vDraweeView = this.f52916f;
        String str2 = bLiveGiftItem.url;
        int i = t100.f167275x;
        hxs.m133408u("context_livingAct", vDraweeView, str2, i, i);
        this.f52917g.setCountdownTime(bLiveGiftItem.combosDuration);
    }

    /* JADX INFO: renamed from: o0 */
    public void m77777o0() {
        this.f52915e.setTypeface(eqh0.m117752c(3), 1);
        this.f52915e.setTextSize(1, 14.0f);
        this.f52917g.setBorderWidth(3);
        this.f52917g.m73773h(getContext().getResources().getColor(h1c0.f105394p0), getContext().getResources().getColor(h1c0.f105394p0));
        this.f52918h.setBackgroundResource(i3c0.f110846R7);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77772i0(this);
        m77771r();
    }

    public void setIcon(String str) {
        hxs.m133407t("context_livingAct", this.f52916f, str, t100.f167273v);
    }

    public VoiceFastGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceFastGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f52916f.setImageResource(i);
    }
}
