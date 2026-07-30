package com.p051p1.mobile.putong.core.p058ui.gift.opt.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import p151v.VPager;
import p151v.VRelative;
import p153l.bwj;
import p153l.htj;
import p153l.pvj;

/* JADX INFO: loaded from: classes3.dex */
public class GiftOuterPagerItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VPager f30094d;

    /* JADX INFO: renamed from: e */
    public GiftPanelBottomBar f30095e;

    /* JADX INFO: renamed from: f */
    public htj f30096f;

    public GiftOuterPagerItemView(Context context) {
        super(context);
    }

    public htj getAdapter() {
        return this.f30096f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46684p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m46684p(View view) {
        pvj.m173965a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m46685q(bwj bwjVar, int i) {
        htj htjVar = new htj(bwjVar, 4, i);
        this.f30096f = htjVar;
        this.f30094d.setAdapter(htjVar);
        this.f30095e.m46689u(bwjVar.m140179b(), this.f30094d, bwjVar.m106714t());
    }

    /* JADX INFO: renamed from: z */
    public void m46686z(NewGiftInfoPanelWrapper newGiftInfoPanelWrapper) {
        this.f30095e.setIndicatorVisibility(newGiftInfoPanelWrapper.giftInfos.size() > 8);
        this.f30096f.m137085q(newGiftInfoPanelWrapper.giftInfos);
    }

    public GiftOuterPagerItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftOuterPagerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
