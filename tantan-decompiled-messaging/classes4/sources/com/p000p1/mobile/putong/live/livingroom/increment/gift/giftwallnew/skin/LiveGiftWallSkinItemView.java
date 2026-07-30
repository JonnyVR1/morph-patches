package com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.skin;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.skin.LiveGiftWallSkinItemView;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.tantanapp.common.utils.NullChecker;
import l.hxs;
import l.kvc0;
import l.t100;
import l.w8u;
import l.xdl0;
import p002l.eos;
import p002l.i3c0;
import p002l.ios;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftWallSkinItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5760a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5761b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5762c;

    /* JADX INFO: renamed from: d */
    public VText f5763d;

    /* JADX INFO: renamed from: e */
    public ios f5764e;

    public LiveGiftWallSkinItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7203a(ios iosVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, View view) {
        if (NullChecker.a(iosVar)) {
            iosVar.m15274W3(bLiveNewGiftWallGiftDetail.user);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7204b(ios iosVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, View view) {
        if (NullChecker.a(iosVar)) {
            iosVar.m15273V3(bLiveNewGiftWallGiftDetail.gift);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7205c(View view) {
        eos.m12640a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m7206d(final BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, final ios iosVar) {
        this.f5764e = iosVar;
        if (NullChecker.a(bLiveNewGiftWallGiftDetail.gift)) {
            this.f5763d.setText(w8u.s(bLiveNewGiftWallGiftDetail.gift.name, 5));
            hxs.s("context_livingAct", this.f5761b, bLiveNewGiftWallGiftDetail.gift.icon);
            kvc0.i(this.f5761b, TextUtils.isEmpty(bLiveNewGiftWallGiftDetail.gift.namedUserId));
            boolean zIsEmpty = TextUtils.isEmpty(bLiveNewGiftWallGiftDetail.gift.namedUserId);
            VDraweeView vDraweeView = this.f5760a;
            if (zIsEmpty) {
                vDraweeView.setActualImageResource(i3c0.f12602P0);
            } else {
                vDraweeView.setActualImageResource(i3c0.f12591O0);
            }
        }
        boolean zA = NullChecker.a(bLiveNewGiftWallGiftDetail.user);
        VDraweeView vDraweeView2 = this.f5762c;
        if (zA) {
            hxs.s("context_livingAct", vDraweeView2, bLiveNewGiftWallGiftDetail.user.avatar);
            xdl0.M(this.f5762c, true);
            xdl0.E0(this.f5762c, new View.OnClickListener() { // from class: l.cos
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveGiftWallSkinItemView.m7203a(iosVar, bLiveNewGiftWallGiftDetail, view);
                }
            });
        } else {
            xdl0.M(vDraweeView2, false);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveGiftWallSkinItemView.m7204b(iosVar, bLiveNewGiftWallGiftDetail, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7205c(this);
        xdl0.C0(this, t100.d(175.0f));
    }

    public LiveGiftWallSkinItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallSkinItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
