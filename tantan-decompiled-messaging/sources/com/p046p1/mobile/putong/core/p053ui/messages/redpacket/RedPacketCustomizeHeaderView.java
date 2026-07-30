package com.p046p1.mobile.putong.core.p053ui.messages.redpacket;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ReceiveRecords;
import com.p046p1.mobile.putong.core.data.RedPacket;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.RedPacketCustomizeHeaderView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.c3c0;
import p149l.e30;
import p149l.jkc0;
import p149l.mkc0;
import p149l.mkd0;
import p149l.qib0;
import p149l.slc0;
import p149l.vwb;
import p149l.wlc0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class RedPacketCustomizeHeaderView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32265a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f32266b;

    /* JADX INFO: renamed from: c */
    public VText f32267c;

    /* JADX INFO: renamed from: d */
    public VImage f32268d;

    /* JADX INFO: renamed from: e */
    public VText f32269e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f32270f;

    /* JADX INFO: renamed from: g */
    public VText f32271g;

    /* JADX INFO: renamed from: h */
    public VText f32272h;

    /* JADX INFO: renamed from: i */
    public VText f32273i;

    /* JADX INFO: renamed from: j */
    public View f32274j;

    /* JADX INFO: renamed from: k */
    public VText f32275k;

    /* JADX INFO: renamed from: l */
    public View f32276l;

    public RedPacketCustomizeHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49739a(slc0 slc0Var, View view) {
        zvf0.m220399u("e_send_red_packet_again", slc0Var.m184786P(), vwb.m200311Y("groupchat_id", slc0Var.m184797y()));
        slc0Var.act().startActivity(SendRedPacketAct.m49753Z1(slc0Var.act(), slc0Var.m184797y()));
    }

    /* JADX INFO: renamed from: c */
    public final void m49741c(View view) {
        mkc0.m154948a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public PutongAct m49742d() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49743e(boolean z, User user) {
        if (z) {
            qib0.f154691G.m102356Z0(this.f32266b, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.m81303a(user)) {
            qib0.f154691G.m102341Q0(this.f32266b, user.m60124fp().profileSmall());
        } else {
            qib0.f154691G.m102354Y0(this.f32266b, c3c0.f78540I0);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m49744f(ReceiveRecords receiveRecords, final boolean z, RedPacket redPacket, final slc0 slc0Var, List<ReceiveRecords> list, jkc0 jkc0Var, long j) {
        qib0.f154691G.m102354Y0(this.f32266b, c3c0.f78540I0);
        VText vText = this.f32271g;
        vText.setTypeface(vText.getTypeface(), 1);
        VText vText2 = this.f32272h;
        vText2.setTypeface(vText2.getTypeface(), 1);
        jkc0Var.mo67374c(m49742d(), CoreModule.f17545c.f19639e0.m169418Ma(receiveRecords.userId)).subscribe(mkd0.m154955G(new e30() { // from class: l.kkc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123541a.m49743e(z, (User) obj);
            }
        }));
        this.f32267c.setText(receiveRecords.name + "的红包");
        this.f32271g.setText(receiveRecords.amount);
        this.f32269e.setText(redPacket.showInfo.title);
        xdl0.m208344M(this.f32268d, TextUtils.equals(redPacket.splitType, BLivePkCategory.random));
        if (TextUtils.isEmpty(redPacket.myInfo.amount)) {
            this.f32271g.setVisibility(8);
            this.f32272h.setVisibility(8);
        }
        if (TextUtils.equals(CoreModule.m29931H().userId(), redPacket.owner.ownerId)) {
            if (redPacket.expireTime * 1000 < qib0.f154693H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f32273i.setText("48小时未领取完，将退回支付宝账户");
            } else if (redPacket.expireTime * 1000 > qib0.f154693H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                zvf0.m220368A("e_send_red_packet_again", slc0Var.m184786P(), vwb.m200311Y("groupchat_id", slc0Var.m184797y()));
                this.f32273i.setText("继续发送此红包");
                xdl0.m208329E0(this.f32273i, new View.OnClickListener() { // from class: l.lkc0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RedPacketCustomizeHeaderView.m49739a(slc0Var, view);
                    }
                });
            } else if (redPacket.quantity <= redPacket.assignQuantity) {
                boolean zIsEmpty = TextUtils.isEmpty(redPacket.myInfo.amount);
                VText vText3 = this.f32273i;
                if (zIsEmpty) {
                    vText3.setVisibility(8);
                } else {
                    vText3.setText("领取成功，预计24小时内到账支付宝账户");
                }
            }
            if (redPacket.expireTime * 1000 >= qib0.f154693H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity && (TextUtils.equals(redPacket.splitType, BLivePkCategory.random) || (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity > 1))) {
                this.f32275k.setText("已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个，共" + redPacket.assignAmount + "/" + redPacket.totalAmount + "元");
            } else if (redPacket.expireTime * 1000 < qib0.f154693H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity && (TextUtils.equals(redPacket.splitType, BLivePkCategory.random) || (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity > 1))) {
                this.f32275k.setText("红包已过期。已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个，共" + redPacket.assignAmount + "/" + redPacket.totalAmount + "元");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity == 1 && redPacket.expireTime * 1000 >= qib0.f154693H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f32275k.setText("红包金额" + redPacket.totalAmount + "元，等待领取");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity == 1 && redPacket.expireTime * 1000 < qib0.f154693H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f32275k.setText("红包已过期。红包金额" + redPacket.totalAmount + "元，将退回支付宝账户");
            } else if (TextUtils.equals(redPacket.splitType, BLivePkCategory.random) && redPacket.quantity <= redPacket.assignQuantity) {
                this.f32275k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元，" + wlc0.m203804a(list.get(1).createTime, false, redPacket.createTime, j) + "被抢光");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.expireTime * 1000 >= qib0.f154693H.guessedCurrentServerTime() && redPacket.quantity <= redPacket.assignQuantity) {
                this.f32275k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            } else if (!TextUtils.equals(redPacket.splitType, "average") || redPacket.expireTime * 1000 >= qib0.f154693H.guessedCurrentServerTime() || redPacket.quantity > redPacket.assignQuantity) {
                this.f32275k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            } else {
                this.f32275k.setText("红包已过期。" + redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            }
        } else {
            if (!TextUtils.isEmpty(redPacket.myInfo.amount)) {
                this.f32273i.setText("领取成功，预计24小时内到账支付宝账户");
            }
            int i = redPacket.quantity;
            int i2 = redPacket.assignQuantity;
            VText vText4 = this.f32275k;
            if (i <= i2) {
                vText4.setText(redPacket.quantity + "个红包，" + wlc0.m203804a(list.get(1).createTime, false, redPacket.createTime, j) + "被抢光");
            } else {
                vText4.setText("已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个");
            }
        }
        if (TextUtils.isEmpty(this.f32275k.getText().toString())) {
            this.f32275k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49741c(this);
    }

    public RedPacketCustomizeHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RedPacketCustomizeHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
