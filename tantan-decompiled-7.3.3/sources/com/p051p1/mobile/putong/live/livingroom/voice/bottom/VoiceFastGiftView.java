package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.afn0;
import p153l.bnl0;
import p153l.gt0;
import p153l.izs;
import p153l.lyh0;
import p153l.n0k;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceFastGiftView extends ConstraintLayout implements RedDot {

    /* JADX INFO: renamed from: d */
    public VoiceFastGiftView f53762d;

    /* JADX INFO: renamed from: e */
    public VText f53763e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53764f;

    /* JADX INFO: renamed from: g */
    public FastGiftCountDownView f53765g;

    /* JADX INFO: renamed from: h */
    public VText f53766h;

    /* JADX INFO: renamed from: i */
    public View f53767i;

    public VoiceFastGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m78953j0() {
        bnl0.m105525M0(this.f53763e, false);
    }

    /* JADX INFO: renamed from: r */
    private void m78954r() {
        this.f53765g.setOnCountDownListener(new FastGiftCountDownView.InterfaceC12969b() { // from class: l.zen0
            @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView.InterfaceC12969b
            /* JADX INFO: renamed from: a */
            public final void mo74958a() {
                this.f204038a.m78953j0();
            }
        });
        n0k.m161007d(this.f53763e);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f53767i, z);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78955i0(View view) {
        afn0.m97521a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public void m78956k0(int i) {
        this.f53765g.m74957i();
        this.f53763e.setText("×" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        bnl0.m105525M0(this.f53763e, true);
        ((ObjectAnimator) gt0.m132166l(this.f53763e, gt0.f106354i, 0L, 300L, gt0.f106346a, 1.4f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: l0 */
    public void m78957l0(@Nullable BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (bLiveData != null && (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) != null) {
            boolean z = bLiveFirstChargeCampaign.hasConsumedGift;
        }
        bnl0.m105524M(this.f53766h, false);
    }

    /* JADX INFO: renamed from: m0 */
    public void m78958m0() {
        bnl0.m105524M(this.f53762d, false);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public void m78959n0(BLiveGiftItem bLiveGiftItem, String str) {
        bnl0.m105525M0(this.f53762d, true);
        VDraweeView vDraweeView = this.f53764f;
        String str2 = bLiveGiftItem.url;
        int i = qa00.f156337x;
        izs.m142870u("context_livingAct", vDraweeView, str2, i, i);
        this.f53765g.setCountdownTime(bLiveGiftItem.combosDuration);
    }

    /* JADX INFO: renamed from: o0 */
    public void m78960o0() {
        this.f53763e.setTypeface(lyh0.m156283c(3), 1);
        this.f53763e.setTextSize(1, 14.0f);
        this.f53765g.setBorderWidth(3);
        this.f53765g.m74956h(getContext().getResources().getColor(n9c0.f140855p0), getContext().getResources().getColor(n9c0.f140855p0));
        this.f53766h.setBackgroundResource(obc0.f146174R7);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78955i0(this);
        m78954r();
    }

    public void setIcon(String str) {
        izs.m142869t("context_livingAct", this.f53764f, str, qa00.f156335v);
    }

    public VoiceFastGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceFastGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f53764f.setImageResource(i);
    }
}
