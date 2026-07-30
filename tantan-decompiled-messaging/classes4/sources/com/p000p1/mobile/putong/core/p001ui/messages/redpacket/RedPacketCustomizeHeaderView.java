package com.p000p1.mobile.putong.core.p001ui.messages.redpacket;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.redpacket.RedPacketCustomizeHeaderView;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ReceiveRecords;
import com.p1.mobile.putong.core.data.RedPacket;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.e30;
import l.j760;
import l.mkc0;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p002l.jkc0;
import p002l.slc0;
import p002l.wlc0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RedPacketCustomizeHeaderView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f87a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f88b;

    /* JADX INFO: renamed from: c */
    public VText f89c;

    /* JADX INFO: renamed from: d */
    public VImage f90d;

    /* JADX INFO: renamed from: e */
    public VText f91e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f92f;

    /* JADX INFO: renamed from: g */
    public VText f93g;

    /* JADX INFO: renamed from: h */
    public VText f94h;

    /* JADX INFO: renamed from: i */
    public VText f95i;

    /* JADX INFO: renamed from: j */
    public View f96j;

    /* JADX INFO: renamed from: k */
    public VText f97k;

    /* JADX INFO: renamed from: l */
    public View f98l;

    public RedPacketCustomizeHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m153a(slc0 slc0Var, View view) {
        zvf0.u("e_send_red_packet_again", slc0Var.m22548P(), new j760[]{vwb.Y("groupchat_id", slc0Var.m22560y())});
        slc0Var.act().startActivity(SendRedPacketAct.m169Z1(slc0Var.act(), slc0Var.m22560y()));
    }

    /* JADX INFO: renamed from: c */
    public final void m155c(View view) {
        mkc0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public PutongAct m156d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m157e(boolean z, User user) {
        if (z) {
            qib0.G.Z0(this.f88b, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.a(user)) {
            qib0.G.Q0(this.f88b, user.fp().profileSmall());
        } else {
            qib0.G.Y0(this.f88b, c3c0.I0);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m158f(ReceiveRecords receiveRecords, final boolean z, RedPacket redPacket, final slc0 slc0Var, List<ReceiveRecords> list, jkc0 jkc0Var, long j) {
        qib0.G.Y0(this.f88b, c3c0.I0);
        VText vText = this.f93g;
        vText.setTypeface(vText.getTypeface(), 1);
        VText vText2 = this.f94h;
        vText2.setTypeface(vText2.getTypeface(), 1);
        jkc0Var.c(m156d(), CoreModule.c.e0.Ma(receiveRecords.userId)).subscribe(mkd0.G(new e30() { // from class: l.kkc0
            public final void call(Object obj) {
                this.f14365a.m157e(z, (User) obj);
            }
        }));
        this.f89c.setText(receiveRecords.name + "的红包");
        this.f93g.setText(receiveRecords.amount);
        this.f91e.setText(redPacket.showInfo.title);
        xdl0.M(this.f90d, TextUtils.equals(redPacket.splitType, "random"));
        if (TextUtils.isEmpty(redPacket.myInfo.amount)) {
            this.f93g.setVisibility(8);
            this.f94h.setVisibility(8);
        }
        if (TextUtils.equals(CoreModule.H().userId(), redPacket.owner.ownerId)) {
            if (redPacket.expireTime * 1000 < qib0.H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f95i.setText("48小时未领取完，将退回支付宝账户");
            } else if (redPacket.expireTime * 1000 > qib0.H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                zvf0.A("e_send_red_packet_again", slc0Var.m22548P(), new j760[]{vwb.Y("groupchat_id", slc0Var.m22560y())});
                this.f95i.setText("继续发送此红包");
                xdl0.E0(this.f95i, new View.OnClickListener() { // from class: l.lkc0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RedPacketCustomizeHeaderView.m153a(slc0Var, view);
                    }
                });
            } else if (redPacket.quantity <= redPacket.assignQuantity) {
                boolean zIsEmpty = TextUtils.isEmpty(redPacket.myInfo.amount);
                VText vText3 = this.f95i;
                if (zIsEmpty) {
                    vText3.setVisibility(8);
                } else {
                    vText3.setText("领取成功，预计24小时内到账支付宝账户");
                }
            }
            if (redPacket.expireTime * 1000 >= qib0.H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity && (TextUtils.equals(redPacket.splitType, "random") || (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity > 1))) {
                this.f97k.setText("已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个，共" + redPacket.assignAmount + "/" + redPacket.totalAmount + "元");
            } else if (redPacket.expireTime * 1000 < qib0.H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity && (TextUtils.equals(redPacket.splitType, "random") || (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity > 1))) {
                this.f97k.setText("红包已过期。已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个，共" + redPacket.assignAmount + "/" + redPacket.totalAmount + "元");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity == 1 && redPacket.expireTime * 1000 >= qib0.H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f97k.setText("红包金额" + redPacket.totalAmount + "元，等待领取");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.quantity == 1 && redPacket.expireTime * 1000 < qib0.H.guessedCurrentServerTime() && redPacket.quantity > redPacket.assignQuantity) {
                this.f97k.setText("红包已过期。红包金额" + redPacket.totalAmount + "元，将退回支付宝账户");
            } else if (TextUtils.equals(redPacket.splitType, "random") && redPacket.quantity <= redPacket.assignQuantity) {
                this.f97k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元，" + wlc0.m24690a(list.get(1).createTime, false, redPacket.createTime, j) + "被抢光");
            } else if (TextUtils.equals(redPacket.splitType, "average") && redPacket.expireTime * 1000 >= qib0.H.guessedCurrentServerTime() && redPacket.quantity <= redPacket.assignQuantity) {
                this.f97k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            } else if (!TextUtils.equals(redPacket.splitType, "average") || redPacket.expireTime * 1000 >= qib0.H.guessedCurrentServerTime() || redPacket.quantity > redPacket.assignQuantity) {
                this.f97k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            } else {
                this.f97k.setText("红包已过期。" + redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
            }
        } else {
            if (!TextUtils.isEmpty(redPacket.myInfo.amount)) {
                this.f95i.setText("领取成功，预计24小时内到账支付宝账户");
            }
            int i = redPacket.quantity;
            int i2 = redPacket.assignQuantity;
            VText vText4 = this.f97k;
            if (i <= i2) {
                vText4.setText(redPacket.quantity + "个红包，" + wlc0.m24690a(list.get(1).createTime, false, redPacket.createTime, j) + "被抢光");
            } else {
                vText4.setText("已领取" + redPacket.assignQuantity + "/" + redPacket.quantity + "个");
            }
        }
        if (TextUtils.isEmpty(this.f97k.getText().toString())) {
            this.f97k.setText(redPacket.quantity + "个红包共" + redPacket.totalAmount + "元");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m155c(this);
    }

    public RedPacketCustomizeHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RedPacketCustomizeHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
