package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketAnimationMsg;
import com.p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketGift;
import com.p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketSender;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.e51;
import l.hxs;
import l.t100;
import l.u6n;
import l.xdl0;
import l.ydt;
import p002l.bsm;
import p002l.i3c0;
import p002l.ku50;
import p002l.wuj;
import p002l.yuj;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftRedPacketView extends BasePreOperationView<wuj> {

    /* JADX INFO: renamed from: f */
    public GiftRedPacketView f6844f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f6845g;

    /* JADX INFO: renamed from: h */
    public View f6846h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f6847i;

    /* JADX INFO: renamed from: j */
    public TextView f6848j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f6849k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f6850l;

    /* JADX INFO: renamed from: m */
    public TextView f6851m;

    /* JADX INFO: renamed from: n */
    public View f6852n;

    /* JADX INFO: renamed from: o */
    public TextView f6853o;

    /* JADX INFO: renamed from: p */
    public long f6854p;

    public GiftRedPacketView(@NonNull Context context) {
        super(context);
        this.f6854p = 2000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m8614v0(xdl0.g gVar) {
        mo8596k0(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: i0 */
    public void mo8593i0(PreOperationAnimView preOperationAnimView) {
        preOperationAnimView.addView((View) this, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(t100.d(262.0f), t100.d(299.0f)));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8616u0(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: o0 */
    public void mo8600o0(ku50 ku50Var) {
        super.mo8600o0(ku50Var);
        try {
            BLiveLotteryGiftRedPacketAnimationMsg bLiveLotteryGiftRedPacketAnimationMsg = (BLiveLotteryGiftRedPacketAnimationMsg) BLiveLotteryGiftRedPacketAnimationMsg.JSON_ADAPTER.parse(ku50Var.m16790e().extraData);
            this.f6854p = bLiveLotteryGiftRedPacketAnimationMsg.showMillisecond;
            BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender = bLiveLotteryGiftRedPacketAnimationMsg.sender;
            BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift = bLiveLotteryGiftRedPacketAnimationMsg.gift;
            hxs.s("context_single_room", this.f6847i, bLiveLotteryGiftRedPacketSender.avatarUrl);
            this.f6848j.setText(bLiveLotteryGiftRedPacketSender.name);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveLotteryGiftRedPacketGift.id);
            LinearLayout linearLayout = this.f6849k;
            if (zIsEmpty) {
                xdl0.M0(linearLayout, false);
            } else {
                xdl0.M0(linearLayout, true);
                hxs.s("context_single_room", this.f6850l, bLiveLotteryGiftRedPacketGift.url);
                this.f6851m.setText(bLiveLotteryGiftRedPacketGift.name + " x" + bLiveLotteryGiftRedPacketGift.num);
            }
            this.f6853o.setText(String.valueOf(bLiveLotteryGiftRedPacketGift.amount));
            if (u6n.a()) {
                hxs.s("context_livingAct", this.f6845g, ydt.K);
                this.f6852n.setBackgroundResource(i3c0.f12544K1);
            } else {
                this.f6852n.setBackgroundResource(i3c0.f12729a6);
                hxs.s("context_livingAct", this.f6845g, ydt.x);
            }
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8615t0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo8602q0(final xdl0.g gVar) {
        super.mo8602q0(gVar);
        e51.H(getContext(), new Runnable() { // from class: l.xuj
            @Override // java.lang.Runnable
            public final void run() {
                this.f22473a.m8614v0(gVar);
            }
        }, this.f6854p);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m8615t0(View view) {
        yuj.m26938a(this, view);
    }

    /* JADX INFO: renamed from: u0 */
    public View m8616u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yuj.m26939b(this, layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public wuj mo8599n0(bsm bsmVar) {
        return new wuj(bsmVar, this);
    }

    public GiftRedPacketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6854p = 2000L;
    }
}
