package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.skin;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.skin.LiveGiftWallSkinItemView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.eos;
import p149l.hxs;
import p149l.i3c0;
import p149l.ios;
import p149l.kvc0;
import p149l.t100;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftWallSkinItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49718a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49719b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49720c;

    /* JADX INFO: renamed from: d */
    public VText f49721d;

    /* JADX INFO: renamed from: e */
    public ios f49722e;

    public LiveGiftWallSkinItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73655a(ios iosVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, View view) {
        if (NullChecker.m81303a(iosVar)) {
            iosVar.m137375W3(bLiveNewGiftWallGiftDetail.user);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m73656b(ios iosVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, View view) {
        if (NullChecker.m81303a(iosVar)) {
            iosVar.m137374V3(bLiveNewGiftWallGiftDetail.gift);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m73657c(View view) {
        eos.m117511a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m73658d(final BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, final ios iosVar) {
        this.f49722e = iosVar;
        if (NullChecker.m81303a(bLiveNewGiftWallGiftDetail.gift)) {
            this.f49721d.setText(w8u.m202216s(bLiveNewGiftWallGiftDetail.gift.name, 5));
            hxs.m133406s("context_livingAct", this.f49719b, bLiveNewGiftWallGiftDetail.gift.icon);
            kvc0.m147360i(this.f49719b, TextUtils.isEmpty(bLiveNewGiftWallGiftDetail.gift.namedUserId));
            boolean zIsEmpty = TextUtils.isEmpty(bLiveNewGiftWallGiftDetail.gift.namedUserId);
            VDraweeView vDraweeView = this.f49718a;
            if (zIsEmpty) {
                vDraweeView.setActualImageResource(i3c0.f110817P0);
            } else {
                vDraweeView.setActualImageResource(i3c0.f110806O0);
            }
        }
        boolean zM81303a = NullChecker.m81303a(bLiveNewGiftWallGiftDetail.user);
        VDraweeView vDraweeView2 = this.f49720c;
        if (zM81303a) {
            hxs.m133406s("context_livingAct", vDraweeView2, bLiveNewGiftWallGiftDetail.user.avatar);
            xdl0.m208344M(this.f49720c, true);
            xdl0.m208329E0(this.f49720c, new View.OnClickListener() { // from class: l.cos
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveGiftWallSkinItemView.m73655a(iosVar, bLiveNewGiftWallGiftDetail, view);
                }
            });
        } else {
            xdl0.m208344M(vDraweeView2, false);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveGiftWallSkinItemView.m73656b(iosVar, bLiveNewGiftWallGiftDetail, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73657c(this);
        xdl0.m208325C0(this, t100.m186890d(175.0f));
    }

    public LiveGiftWallSkinItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallSkinItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
