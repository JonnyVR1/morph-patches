package com.p051p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.Medal;
import com.p051p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeMainItem;
import p151v.VDraweeView;
import p153l.bae0;
import p153l.bnl0;
import p153l.izs;
import p153l.jyt;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSignPrizeMainItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f50222a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50223b;

    /* JADX INFO: renamed from: c */
    public TextView f50224c;

    /* JADX INFO: renamed from: d */
    public TextView f50225d;

    /* JADX INFO: renamed from: e */
    public TextView f50226e;

    public LiveSignPrizeMainItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m74458a(C12932a c12932a, BLiveSignPrizesRewards bLiveSignPrizesRewards, String str, View view) {
        c12932a.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(625).m103154e(bLiveSignPrizesRewards.button.scheme).m103152c());
        c12932a.m74363x4(bLiveSignPrizesRewards.title, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m74459b(View view) {
        jyt.m147621a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m74460c(final C12932a c12932a, final BLiveSignPrizesRewards bLiveSignPrizesRewards, final String str) {
        FrameLayout.LayoutParams layoutParams;
        if (bLiveSignPrizesRewards == null) {
            return;
        }
        this.f50224c.setText(bLiveSignPrizesRewards.title);
        this.f50225d.setText(bLiveSignPrizesRewards.description);
        bnl0.m105524M(this.f50226e, true);
        this.f50226e.setText(bLiveSignPrizesRewards.button.text);
        boolean zEquals = Medal.TYPE.equals(bLiveSignPrizesRewards.type);
        VDraweeView vDraweeView = this.f50223b;
        if (zEquals) {
            layoutParams = (FrameLayout.LayoutParams) vDraweeView.getLayoutParams();
            layoutParams.width = qa00.m175859d(30.0f);
            layoutParams.height = qa00.m175859d(30.0f);
        } else {
            layoutParams = (FrameLayout.LayoutParams) vDraweeView.getLayoutParams();
            layoutParams.width = qa00.m175859d(40.0f);
            layoutParams.height = qa00.m175859d(40.0f);
        }
        this.f50223b.setLayoutParams(layoutParams);
        VDraweeView vDraweeView2 = this.f50223b;
        String str2 = bLiveSignPrizesRewards.icon;
        int i = qa00.f156338y;
        izs.m142870u("context_single_room", vDraweeView2, str2, i, i);
        this.f50226e.setOnClickListener(new View.OnClickListener() { // from class: l.hyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSignPrizeMainItem.m74458a(c12932a, bLiveSignPrizesRewards, str, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74459b(this);
    }

    public LiveSignPrizeMainItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
