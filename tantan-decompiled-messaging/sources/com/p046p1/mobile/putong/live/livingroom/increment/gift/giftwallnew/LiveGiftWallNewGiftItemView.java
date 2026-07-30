package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.e30;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.ums;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftWallNewGiftItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49695a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49696b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49697c;

    /* JADX INFO: renamed from: d */
    public TextView f49698d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49699e;

    /* JADX INFO: renamed from: f */
    public LiveGiftFiveStarView f49700f;

    public LiveGiftWallNewGiftItemView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73641s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m73641s(View view) {
        ums.m194404a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m73642u(final BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, final e30<BLiveNewGiftWallGiftDetail> e30Var) {
        BLiveNewGiftWallGift bLiveNewGiftWallGift = bLiveNewGiftWallGiftDetail.gift;
        boolean z = bLiveNewGiftWallGift.isSkin;
        LiveGiftFiveStarView liveGiftFiveStarView = this.f49700f;
        if (z) {
            xdl0.m208344M(liveGiftFiveStarView, false);
            setBackgroundResource(i3c0.f111050j4);
        } else {
            xdl0.m208344M(liveGiftFiveStarView, bLiveNewGiftWallGift.grade > 0);
            setBackgroundResource(i3c0.f110861T0);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.tms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveNewGiftWallGiftDetail);
            }
        });
        hxs.m133406s("context_livingAct", this.f49697c, bLiveNewGiftWallGiftDetail.gift.icon);
        kvc0.m147360i(this.f49697c, bLiveNewGiftWallGiftDetail.gift.grade <= 0);
        this.f49698d.setText(w8u.m202216s(bLiveNewGiftWallGiftDetail.gift.name, 5));
        hxs.m133406s("context_livingAct", this.f49699e, bLiveNewGiftWallGiftDetail.category.icon);
        this.f49700f.m73668j0(bLiveNewGiftWallGiftDetail.gift.grade);
    }

    public LiveGiftWallNewGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallNewGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
