package com.p046p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketAnimationMsg;
import com.p046p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketGift;
import com.p046p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketSender;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p147v.VDraweeView;
import p149l.bsm;
import p149l.e51;
import p149l.hxs;
import p149l.i3c0;
import p149l.ku50;
import p149l.t100;
import p149l.u6n;
import p149l.wuj;
import p149l.xdl0;
import p149l.ydt;
import p149l.yuj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftRedPacketView extends BasePreOperationView<wuj> {

    /* JADX INFO: renamed from: f */
    public GiftRedPacketView f50802f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50803g;

    /* JADX INFO: renamed from: h */
    public View f50804h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f50805i;

    /* JADX INFO: renamed from: j */
    public TextView f50806j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f50807k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f50808l;

    /* JADX INFO: renamed from: m */
    public TextView f50809m;

    /* JADX INFO: renamed from: n */
    public View f50810n;

    /* JADX INFO: renamed from: o */
    public TextView f50811o;

    /* JADX INFO: renamed from: p */
    public long f50812p;

    public GiftRedPacketView(@NonNull Context context) {
        super(context);
        this.f50812p = 2000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m75006v0(xdl0.C21104g c21104g) {
        mo74988k0(c21104g);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: i0 */
    public void mo74986i0(PreOperationAnimView preOperationAnimView) {
        preOperationAnimView.addView(this, new LinearLayout.LayoutParams(t100.m186890d(262.0f), t100.m186890d(299.0f)));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m75008u0(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: o0 */
    public void mo74992o0(ku50 ku50Var) {
        super.mo74992o0(ku50Var);
        try {
            BLiveLotteryGiftRedPacketAnimationMsg bLiveLotteryGiftRedPacketAnimationMsg = BLiveLotteryGiftRedPacketAnimationMsg.JSON_ADAPTER.parse(ku50Var.m147247e().extraData);
            this.f50812p = bLiveLotteryGiftRedPacketAnimationMsg.showMillisecond;
            BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender = bLiveLotteryGiftRedPacketAnimationMsg.sender;
            BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift = bLiveLotteryGiftRedPacketAnimationMsg.gift;
            hxs.m133406s("context_single_room", this.f50805i, bLiveLotteryGiftRedPacketSender.avatarUrl);
            this.f50806j.setText(bLiveLotteryGiftRedPacketSender.name);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveLotteryGiftRedPacketGift.f44394id);
            LinearLayout linearLayout = this.f50807k;
            if (zIsEmpty) {
                xdl0.m208345M0(linearLayout, false);
            } else {
                xdl0.m208345M0(linearLayout, true);
                hxs.m133406s("context_single_room", this.f50808l, bLiveLotteryGiftRedPacketGift.url);
                this.f50809m.setText(bLiveLotteryGiftRedPacketGift.name + " x" + bLiveLotteryGiftRedPacketGift.num);
            }
            this.f50811o.setText(String.valueOf(bLiveLotteryGiftRedPacketGift.amount));
            if (u6n.m192015a()) {
                hxs.m133406s("context_livingAct", this.f50803g, ydt.f197608K);
                this.f50810n.setBackgroundResource(i3c0.f110759K1);
            } else {
                this.f50810n.setBackgroundResource(i3c0.f110944a6);
                hxs.m133406s("context_livingAct", this.f50803g, ydt.f197634x);
            }
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75007t0(this);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo74994q0(final xdl0.C21104g c21104g) {
        super.mo74994q0(c21104g);
        e51.m114743H(getContext(), new Runnable() { // from class: l.xuj
            @Override // java.lang.Runnable
            public final void run() {
                this.f194503a.m75006v0(c21104g);
            }
        }, this.f50812p);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m75007t0(View view) {
        yuj.m216112a(this, view);
    }

    /* JADX INFO: renamed from: u0 */
    public View m75008u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yuj.m216113b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public wuj mo74991n0(bsm bsmVar) {
        return new wuj(bsmVar, this);
    }

    public GiftRedPacketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50812p = 2000L;
    }
}
