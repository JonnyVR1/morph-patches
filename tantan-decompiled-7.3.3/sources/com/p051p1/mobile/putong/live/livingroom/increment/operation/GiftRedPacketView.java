package com.p051p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketAnimationMsg;
import com.p051p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketGift;
import com.p051p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketSender;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dum;
import p153l.izs;
import p153l.l51;
import p153l.mxj;
import p153l.obc0;
import p153l.oxj;
import p153l.q260;
import p153l.qa00;
import p153l.u8n;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class GiftRedPacketView extends BasePreOperationView<mxj> {

    /* JADX INFO: renamed from: f */
    public GiftRedPacketView f51650f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51651g;

    /* JADX INFO: renamed from: h */
    public View f51652h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f51653i;

    /* JADX INFO: renamed from: j */
    public TextView f51654j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f51655k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f51656l;

    /* JADX INFO: renamed from: m */
    public TextView f51657m;

    /* JADX INFO: renamed from: n */
    public View f51658n;

    /* JADX INFO: renamed from: o */
    public TextView f51659o;

    /* JADX INFO: renamed from: p */
    public long f51660p;

    public GiftRedPacketView(@NonNull Context context) {
        super(context);
        this.f51660p = 2000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m76189v0(bnl0.C16067g c16067g) {
        mo76171k0(c16067g);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: i0 */
    public void mo76169i0(PreOperationAnimView preOperationAnimView) {
        preOperationAnimView.addView(this, new LinearLayout.LayoutParams(qa00.m175859d(262.0f), qa00.m175859d(299.0f)));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m76191u0(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: o0 */
    public void mo76175o0(q260 q260Var) {
        super.mo76175o0(q260Var);
        try {
            BLiveLotteryGiftRedPacketAnimationMsg bLiveLotteryGiftRedPacketAnimationMsg = BLiveLotteryGiftRedPacketAnimationMsg.JSON_ADAPTER.parse(q260Var.m174993e().extraData);
            this.f51660p = bLiveLotteryGiftRedPacketAnimationMsg.showMillisecond;
            BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender = bLiveLotteryGiftRedPacketAnimationMsg.sender;
            BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift = bLiveLotteryGiftRedPacketAnimationMsg.gift;
            izs.m142868s("context_single_room", this.f51653i, bLiveLotteryGiftRedPacketSender.avatarUrl);
            this.f51654j.setText(bLiveLotteryGiftRedPacketSender.name);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveLotteryGiftRedPacketGift.f45242id);
            LinearLayout linearLayout = this.f51655k;
            if (zIsEmpty) {
                bnl0.m105525M0(linearLayout, false);
            } else {
                bnl0.m105525M0(linearLayout, true);
                izs.m142868s("context_single_room", this.f51656l, bLiveLotteryGiftRedPacketGift.url);
                this.f51657m.setText(bLiveLotteryGiftRedPacketGift.name + " x" + bLiveLotteryGiftRedPacketGift.num);
            }
            this.f51659o.setText(String.valueOf(bLiveLotteryGiftRedPacketGift.amount));
            if (u8n.m195065a()) {
                izs.m142868s("context_livingAct", this.f51651g, zft.f204203K);
                this.f51658n.setBackgroundResource(obc0.f146087K1);
            } else {
                this.f51658n.setBackgroundResource(obc0.f146272a6);
                izs.m142868s("context_livingAct", this.f51651g, zft.f204229x);
            }
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76190t0(this);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: q0 */
    public void mo76177q0(final bnl0.C16067g c16067g) {
        super.mo76177q0(c16067g);
        l51.m152888H(getContext(), new Runnable() { // from class: l.nxj
            @Override // java.lang.Runnable
            public final void run() {
                this.f144134a.m76189v0(c16067g);
            }
        }, this.f51660p);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m76190t0(View view) {
        oxj.m169715a(this, view);
    }

    /* JADX INFO: renamed from: u0 */
    public View m76191u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oxj.m169716b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public mxj mo76174n0(dum dumVar) {
        return new mxj(dumVar, this);
    }

    public GiftRedPacketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51660p = 2000L;
    }
}
