package com.p046p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.Medal;
import com.p046p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.iwt;
import p149l.t100;
import p149l.x1e0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSignPrizeMainItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49374a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49375b;

    /* JADX INFO: renamed from: c */
    public TextView f49376c;

    /* JADX INFO: renamed from: d */
    public TextView f49377d;

    /* JADX INFO: renamed from: e */
    public TextView f49378e;

    public LiveSignPrizeMainItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73275a(C12769a c12769a, BLiveSignPrizesRewards bLiveSignPrizesRewards, String str, View view) {
        c12769a.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(625).m206701e(bLiveSignPrizesRewards.button.scheme).m206699c());
        c12769a.m73180x4(bLiveSignPrizesRewards.title, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m73276b(View view) {
        iwt.m138761a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m73277c(final C12769a c12769a, final BLiveSignPrizesRewards bLiveSignPrizesRewards, final String str) {
        FrameLayout.LayoutParams layoutParams;
        if (bLiveSignPrizesRewards == null) {
            return;
        }
        this.f49376c.setText(bLiveSignPrizesRewards.title);
        this.f49377d.setText(bLiveSignPrizesRewards.description);
        xdl0.m208344M(this.f49378e, true);
        this.f49378e.setText(bLiveSignPrizesRewards.button.text);
        boolean zEquals = Medal.TYPE.equals(bLiveSignPrizesRewards.type);
        VDraweeView vDraweeView = this.f49375b;
        if (zEquals) {
            layoutParams = (FrameLayout.LayoutParams) vDraweeView.getLayoutParams();
            layoutParams.width = t100.m186890d(30.0f);
            layoutParams.height = t100.m186890d(30.0f);
        } else {
            layoutParams = (FrameLayout.LayoutParams) vDraweeView.getLayoutParams();
            layoutParams.width = t100.m186890d(40.0f);
            layoutParams.height = t100.m186890d(40.0f);
        }
        this.f49375b.setLayoutParams(layoutParams);
        VDraweeView vDraweeView2 = this.f49375b;
        String str2 = bLiveSignPrizesRewards.icon;
        int i = t100.f167276y;
        hxs.m133408u("context_single_room", vDraweeView2, str2, i, i);
        this.f49378e.setOnClickListener(new View.OnClickListener() { // from class: l.gwt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSignPrizeMainItem.m73275a(c12769a, bLiveSignPrizesRewards, str, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73276b(this);
    }

    public LiveSignPrizeMainItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
