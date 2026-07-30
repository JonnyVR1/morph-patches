package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftBean;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.UserBean;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftIconView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.fc2;
import p153l.izs;
import p153l.mdc0;
import p153l.n3d0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceGiftWallGiftItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceCardGiftIconView f54625d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54626e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54627f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54628g;

    /* JADX INFO: renamed from: h */
    public VText f54629h;

    /* JADX INFO: renamed from: i */
    public VText f54630i;

    public VoiceGiftWallGiftItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m79870h0(GiftBean giftBean, Act act) {
        izs.m142874y(this.f54625d, giftBean.icon);
        UserBean userBean = giftBean.top1ContributorUser;
        if (userBean == null || TextUtils.isEmpty(userBean.avatar)) {
            bnl0.m105524M(this.f54626e, false);
            this.f54625d.setClear(false);
        } else {
            izs.m142874y(this.f54626e, giftBean.top1ContributorUser.avatar);
            bnl0.m105524M(this.f54626e, true);
            this.f54625d.setClear(true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(giftBean.label);
        VDraweeView vDraweeView = this.f54627f;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            izs.m142864o("context_single_room", this.f54627f, giftBean.label);
        }
        this.f54629h.setText(giftBean.name);
        n3d0.m161285i(this.f54625d, !giftBean.isOwned);
        boolean zIsEmpty2 = TextUtils.isEmpty(giftBean.bgImage);
        VDraweeView vDraweeView2 = this.f54628g;
        if (zIsEmpty2) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            izs.m142874y(this.f54628g, giftBean.bgImage);
        }
        this.f54630i.setText("×" + giftBean.receivedCount);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(fc2.m124979i(Color.parseColor("#0DD9D9D9"), 16));
        this.f54625d = (VoiceCardGiftIconView) findViewById(mdc0.f136150d2);
        this.f54626e = (VDraweeView) findViewById(mdc0.f135974K0);
        this.f54627f = (VDraweeView) findViewById(mdc0.f136102Y2);
        this.f54629h = (VText) findViewById(mdc0.f136230l2);
        this.f54628g = (VDraweeView) findViewById(mdc0.f135955I);
        this.f54630i = (VText) findViewById(mdc0.f136110Z1);
        this.f54625d.m79891u(4, qa00.m175859d(9.0f));
    }

    public VoiceGiftWallGiftItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallGiftItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
