package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftIconView;
import com.p1.mobile.android.app.Act;
import l.g5c0;
import l.hxs;
import l.kvc0;
import l.t100;
import l.xdl0;
import l.yb2;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceGiftWallGiftItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceCardGiftIconView f7383d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7384e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7385f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f7386g;

    /* JADX INFO: renamed from: h */
    public VText f7387h;

    /* JADX INFO: renamed from: i */
    public VText f7388i;

    public VoiceGiftWallGiftItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m8903h0(GiftBean giftBean, Act act) {
        hxs.y(this.f7383d, giftBean.icon);
        UserBean userBean = giftBean.top1ContributorUser;
        if (userBean == null || TextUtils.isEmpty(userBean.avatar)) {
            xdl0.M(this.f7384e, false);
            this.f7383d.setClear(false);
        } else {
            hxs.y(this.f7384e, giftBean.top1ContributorUser.avatar);
            xdl0.M(this.f7384e, true);
            this.f7383d.setClear(true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(giftBean.label);
        VDraweeView vDraweeView = this.f7385f;
        if (zIsEmpty) {
            xdl0.M(vDraweeView, false);
        } else {
            xdl0.M(vDraweeView, true);
            hxs.o("context_single_room", this.f7385f, giftBean.label);
        }
        this.f7387h.setText(giftBean.name);
        kvc0.i(this.f7383d, !giftBean.isOwned);
        boolean zIsEmpty2 = TextUtils.isEmpty(giftBean.bgImage);
        VDraweeView vDraweeView2 = this.f7386g;
        if (zIsEmpty2) {
            xdl0.M(vDraweeView2, false);
        } else {
            xdl0.M(vDraweeView2, true);
            hxs.y(this.f7386g, giftBean.bgImage);
        }
        this.f7388i.setText("×" + giftBean.receivedCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setBackground(yb2.i(Color.parseColor("#0DD9D9D9"), 16));
        this.f7383d = (VoiceCardGiftIconView) findViewById(g5c0.d2);
        this.f7384e = findViewById(g5c0.K0);
        this.f7385f = findViewById(g5c0.Y2);
        this.f7387h = findViewById(g5c0.l2);
        this.f7386g = findViewById(g5c0.I);
        this.f7388i = findViewById(g5c0.Z1);
        this.f7383d.m8924u(4, t100.d(9.0f));
    }

    public VoiceGiftWallGiftItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallGiftItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
