package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.izs;
import p153l.n3d0;
import p153l.obc0;
import p153l.vos;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftWallNewGiftItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50543a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50544b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50545c;

    /* JADX INFO: renamed from: d */
    public TextView f50546d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50547e;

    /* JADX INFO: renamed from: f */
    public LiveGiftFiveStarView f50548f;

    public LiveGiftWallNewGiftItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74824s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m74824s(View view) {
        vos.m202169a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m74825u(final BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, final y20<BLiveNewGiftWallGiftDetail> y20Var) {
        BLiveNewGiftWallGift bLiveNewGiftWallGift = bLiveNewGiftWallGiftDetail.gift;
        boolean z = bLiveNewGiftWallGift.isSkin;
        LiveGiftFiveStarView liveGiftFiveStarView = this.f50548f;
        if (z) {
            bnl0.m105524M(liveGiftFiveStarView, false);
            setBackgroundResource(obc0.f146378j4);
        } else {
            bnl0.m105524M(liveGiftFiveStarView, bLiveNewGiftWallGift.grade > 0);
            setBackgroundResource(obc0.f146189T0);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.uos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveNewGiftWallGiftDetail);
            }
        });
        izs.m142868s("context_livingAct", this.f50545c, bLiveNewGiftWallGiftDetail.gift.icon);
        n3d0.m161285i(this.f50545c, bLiveNewGiftWallGiftDetail.gift.grade <= 0);
        this.f50546d.setText(xau.m209909s(bLiveNewGiftWallGiftDetail.gift.name, 5));
        izs.m142868s("context_livingAct", this.f50547e, bLiveNewGiftWallGiftDetail.category.icon);
        this.f50548f.m74851j0(bLiveNewGiftWallGiftDetail.gift.grade);
    }

    public LiveGiftWallNewGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallNewGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
