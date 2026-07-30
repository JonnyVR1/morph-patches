package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftIconView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.g5c0;
import p149l.hxs;
import p149l.kvc0;
import p149l.t100;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceGiftWallGiftItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceCardGiftIconView f53777d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53778e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53779f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53780g;

    /* JADX INFO: renamed from: h */
    public VText f53781h;

    /* JADX INFO: renamed from: i */
    public VText f53782i;

    public VoiceGiftWallGiftItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m78687h0(GiftBean giftBean, Act act) {
        hxs.m133412y(this.f53777d, giftBean.icon);
        UserBean userBean = giftBean.top1ContributorUser;
        if (userBean == null || TextUtils.isEmpty(userBean.avatar)) {
            xdl0.m208344M(this.f53778e, false);
            this.f53777d.setClear(false);
        } else {
            hxs.m133412y(this.f53778e, giftBean.top1ContributorUser.avatar);
            xdl0.m208344M(this.f53778e, true);
            this.f53777d.setClear(true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(giftBean.label);
        VDraweeView vDraweeView = this.f53779f;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            hxs.m133402o("context_single_room", this.f53779f, giftBean.label);
        }
        this.f53781h.setText(giftBean.name);
        kvc0.m147360i(this.f53777d, !giftBean.isOwned);
        boolean zIsEmpty2 = TextUtils.isEmpty(giftBean.bgImage);
        VDraweeView vDraweeView2 = this.f53780g;
        if (zIsEmpty2) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            hxs.m133412y(this.f53780g, giftBean.bgImage);
        }
        this.f53782i.setText("×" + giftBean.receivedCount);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(yb2.m213884i(Color.parseColor("#0DD9D9D9"), 16));
        this.f53777d = (VoiceCardGiftIconView) findViewById(g5c0.f100905d2);
        this.f53778e = (VDraweeView) findViewById(g5c0.f100729K0);
        this.f53779f = (VDraweeView) findViewById(g5c0.f100857Y2);
        this.f53781h = (VText) findViewById(g5c0.f100985l2);
        this.f53780g = (VDraweeView) findViewById(g5c0.f100710I);
        this.f53782i = (VText) findViewById(g5c0.f100865Z1);
        this.f53777d.m78708u(4, t100.m186890d(9.0f));
    }

    public VoiceGiftWallGiftItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallGiftItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
