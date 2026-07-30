package com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.e30;
import l.hxs;
import l.kvc0;
import l.w8u;
import l.xdl0;
import p002l.i3c0;
import p002l.ums;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftWallNewGiftItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5737a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f5738b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5739c;

    /* JADX INFO: renamed from: d */
    public TextView f5740d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5741e;

    /* JADX INFO: renamed from: f */
    public LiveGiftFiveStarView f5742f;

    public LiveGiftWallNewGiftItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7189s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m7189s(View view) {
        ums.m23563a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public void m7190u(final BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, final e30<BLiveNewGiftWallGiftDetail> e30Var) {
        BLiveNewGiftWallGift bLiveNewGiftWallGift = bLiveNewGiftWallGiftDetail.gift;
        boolean z = bLiveNewGiftWallGift.isSkin;
        ConstraintLayout constraintLayout = this.f5742f;
        if (z) {
            xdl0.M(constraintLayout, false);
            setBackgroundResource(i3c0.f12835j4);
        } else {
            xdl0.M(constraintLayout, bLiveNewGiftWallGift.grade > 0);
            setBackgroundResource(i3c0.f12646T0);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.tms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveNewGiftWallGiftDetail);
            }
        });
        hxs.s("context_livingAct", this.f5739c, bLiveNewGiftWallGiftDetail.gift.icon);
        kvc0.i(this.f5739c, bLiveNewGiftWallGiftDetail.gift.grade <= 0);
        this.f5740d.setText(w8u.s(bLiveNewGiftWallGiftDetail.gift.name, 5));
        hxs.s("context_livingAct", this.f5741e, bLiveNewGiftWallGiftDetail.category.icon);
        this.f5742f.m7216j0(bLiveNewGiftWallGiftDetail.gift.grade);
    }

    public LiveGiftWallNewGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallNewGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
