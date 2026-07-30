package com.p000p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;
import com.p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.iwt;
import p002l.x1e0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveSignPrizeMainItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5416a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5417b;

    /* JADX INFO: renamed from: c */
    public TextView f5418c;

    /* JADX INFO: renamed from: d */
    public TextView f5419d;

    /* JADX INFO: renamed from: e */
    public TextView f5420e;

    public LiveSignPrizeMainItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6810a(C0358a c0358a, BLiveSignPrizesRewards bLiveSignPrizesRewards, String str, View view) {
        c0358a.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(625).m25610e(bLiveSignPrizesRewards.button.scheme).m25608c());
        c0358a.m6709x4(bLiveSignPrizesRewards.title, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m6811b(View view) {
        iwt.m15472a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6812c(final C0358a c0358a, final BLiveSignPrizesRewards bLiveSignPrizesRewards, final String str) {
        FrameLayout.LayoutParams layoutParams;
        if (bLiveSignPrizesRewards == null) {
            return;
        }
        this.f5418c.setText(bLiveSignPrizesRewards.title);
        this.f5419d.setText(bLiveSignPrizesRewards.description);
        xdl0.M(this.f5420e, true);
        this.f5420e.setText(bLiveSignPrizesRewards.button.text);
        boolean zEquals = "medal".equals(bLiveSignPrizesRewards.type);
        VDraweeView vDraweeView = this.f5417b;
        if (zEquals) {
            layoutParams = (FrameLayout.LayoutParams) vDraweeView.getLayoutParams();
            layoutParams.width = t100.d(30.0f);
            layoutParams.height = t100.d(30.0f);
        } else {
            layoutParams = (FrameLayout.LayoutParams) vDraweeView.getLayoutParams();
            layoutParams.width = t100.d(40.0f);
            layoutParams.height = t100.d(40.0f);
        }
        this.f5417b.setLayoutParams(layoutParams);
        VDraweeView vDraweeView2 = this.f5417b;
        String str2 = bLiveSignPrizesRewards.icon;
        int i = t100.y;
        hxs.u("context_single_room", vDraweeView2, str2, i, i);
        this.f5420e.setOnClickListener(new View.OnClickListener() { // from class: l.gwt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSignPrizeMainItem.m6810a(c0358a, bLiveSignPrizesRewards, str, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6811b(this);
    }

    public LiveSignPrizeMainItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
