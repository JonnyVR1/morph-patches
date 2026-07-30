package com.p051p1.mobile.putong.core.p058ui.messages.redpacket;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ReceiveRecords;
import com.p051p1.mobile.putong.core.data.RedPacket;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.RedPacketCustomizeHeaderView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.duc0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.psd0;
import p153l.qsc0;
import p153l.tsc0;
import p153l.uqb0;
import p153l.y20;
import p153l.ztc0;

/* JADX INFO: loaded from: classes4.dex */
public class RedPacketCustomizeHeaderView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f33113a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f33114b;

    /* JADX INFO: renamed from: c */
    public VText f33115c;

    /* JADX INFO: renamed from: d */
    public VImage f33116d;

    /* JADX INFO: renamed from: e */
    public VText f33117e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f33118f;

    /* JADX INFO: renamed from: g */
    public VText f33119g;

    /* JADX INFO: renamed from: h */
    public VText f33120h;

    /* JADX INFO: renamed from: i */
    public VText f33121i;

    /* JADX INFO: renamed from: j */
    public View f33122j;

    /* JADX INFO: renamed from: k */
    public VText f33123k;

    /* JADX INFO: renamed from: l */
    public View f33124l;

    public RedPacketCustomizeHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50922a(ztc0 ztc0Var, View view) {
        i4g0.m138523u("e_send_red_packet_again", ztc0Var.m221521P(), jyb.m147494Y("groupchat_id", ztc0Var.m221532y()));
        ztc0Var.act().startActivity(SendRedPacketAct.m50936a2(ztc0Var.act(), ztc0Var.m221532y()));
    }

    /* JADX INFO: renamed from: c */
    public final void m50924c(View view) {
        tsc0.m192575a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public PutongAct m50925d() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m50926e(boolean z, User user) {
        if (z) {
            uqb0.f180374G.m127140Z0(this.f33114b, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.m82486a(user)) {
            uqb0.f180374G.m127125Q0(this.f33114b, user.m61308fp().profileSmall());
        } else {
            uqb0.f180374G.m127138Y0(this.f33114b, ibc0.f113815I0);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m50927f(ReceiveRecords receiveRecords, final boolean z, RedPacket redPacket, final ztc0 ztc0Var, List<ReceiveRecords> list, qsc0 qsc0Var, long j) {
        uqb0.f180374G.m127138Y0(this.f33114b, ibc0.f113815I0);
        VText vText = this.f33119g;
        vText.setTypeface(vText.getTypeface(), 1);
        VText vText2 = this.f33120h;
        vText2.setTypeface(vText2.getTypeface(), 1);
        qsc0Var.mo68557c(m50925d(), CoreModule.f18264c.f20381e0.m116491Ma(receiveRecords.userId)).subscribe(psd0.m173596G(new y20() { // from class: l.rsc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164651a.m50926e(z, (User) obj);
            }
        }));
        this.f33115c.setText(receiveRecords.name + "的红包");
        this.f33119g.setText(receiveRecords.amount);
        this.f33117e.setText(redPacket.showInfo.title);
        bnl0.m105524M(this.f33116d, TextUtils.equals(redPacket.splitType, BLivePkCategory.random));
        if (TextUtils.isEmpty(redPacket.myInfo.amount)) {
            this.f33119g.setVisibility(8);
            this.f33120h.setVisibility(8);
        }
        if (TextUtils.equals(CoreModule.m30929H().userId(), redPacket.owner.ownerId)) {
            if (redPacket.expireTime * 1000 < uqb0.f180376H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f33121i.setText("48小时未领取完，将退回支付宝账户");
            } else if (redPacket.expireTime * 1000 > uqb0.f180376H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                i4g0.m138492A("e_send_red_packet_again", ztc0Var.m221521P(), jyb.m147494Y("groupchat_id", ztc0Var.m221532y()));
                this.f33121i.setText("继续发送此红包");
                bnl0.m105509E0(this.f33121i, new View.OnClickListener() { // from class: l.ssc0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RedPacketCustomizeHeaderView.m50922a(ztc0Var, view);
                    }
                });
            } else if (redPacket.quantity <= redPacket.assignQuantity) {
                boolean zIsEmpty = TextUtils.isEmpty(redPacket.myInfo.amount);
                VText vText3 = this.f33121i;
                if (zIsEmpty) {
                    vText3.setVisibility(8);
                } else {
                    vText3.setText("领取成功，预计24小时内到账支付宝账户");
                }
            }
            if (redPacket.expireTime * 1000 >= uqb0.f180376H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity && (TextUtils.equals(redPacket.splitType, BLivePkCategory.random) || (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity > 1))) {
                this.f33123k.setText("已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个，共" + redPacket.assignAmount + "/" + redPacket.totalAmount + "元");
            } else if (redPacket.expireTime * 1000 < uqb0.f180376H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity && (TextUtils.equals(redPacket.splitType, BLivePkCategory.random) || (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity > 1))) {
                this.f33123k.setText("红包已过期。已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个，共" + redPacket.assignAmount + "/" + redPacket.totalAmount + "元");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity == 1 && redPacket.expireTime * 1000 >= uqb0.f180376H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f33123k.setText("红包金额" + redPacket.totalAmount + "元，等待领取");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity == 1 && redPacket.expireTime * 1000 < uqb0.f180376H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f33123k.setText("红包已过期。红包金额" + redPacket.totalAmount + "元，将退回支付宝账户");
            } else if (TextUtils.equals(redPacket.splitType, BLivePkCategory.random) && redPacket.quantity <= redPacket.assignQuantity) {
                this.f33123k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元，" + duc0.m118127a(list.get(1).createTime, false, redPacket.createTime, j) + "被抢光");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.expireTime * 1000 >= uqb0.f180376H.guessedCurrentServerTime() && redPacket.quantity <= redPacket.assignQuantity) {
                this.f33123k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            } else if (!TextUtils.equals(redPacket.splitType, "average") || redPacket.expireTime * 1000 >= uqb0.f180376H.guessedCurrentServerTime() || redPacket.quantity > redPacket.assignQuantity) {
                this.f33123k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            } else {
                this.f33123k.setText("红包已过期。" + redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            }
        } else {
            if (!TextUtils.isEmpty(redPacket.myInfo.amount)) {
                this.f33121i.setText("领取成功，预计24小时内到账支付宝账户");
            }
            int i = redPacket.quantity;
            int i2 = redPacket.assignQuantity;
            VText vText4 = this.f33123k;
            if (i <= i2) {
                vText4.setText(redPacket.quantity + "个红包，" + duc0.m118127a(list.get(1).createTime, false, redPacket.createTime, j) + "被抢光");
            } else {
                vText4.setText("已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个");
            }
        }
        if (TextUtils.isEmpty(this.f33123k.getText().toString())) {
            this.f33123k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50924c(this);
    }

    public RedPacketCustomizeHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RedPacketCustomizeHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
