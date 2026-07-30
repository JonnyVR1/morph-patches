package com.p046p1.mobile.putong.core.p053ui.gift.opt.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import p147v.VPager;
import p147v.VRelative;
import p149l.ltj;
import p149l.rqj;
import p149l.zsj;

/* JADX INFO: loaded from: classes10.dex */
public class GiftOuterPagerItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VPager f29246d;

    /* JADX INFO: renamed from: e */
    public GiftPanelBottomBar f29247e;

    /* JADX INFO: renamed from: f */
    public rqj f29248f;

    public GiftOuterPagerItemView(Context context) {
        super(context);
    }

    public rqj getAdapter() {
        return this.f29248f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45501p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m45501p(View view) {
        zsj.m220036a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m45502q(ltj ltjVar, int i) {
        rqj rqjVar = new rqj(ltjVar, 4, i);
        this.f29248f = rqjVar;
        this.f29246d.setAdapter(rqjVar);
        this.f29247e.m45506u(ltjVar.m96966b(), this.f29246d, ltjVar.m151705t());
    }

    /* JADX INFO: renamed from: z */
    public void m45503z(NewGiftInfoPanelWrapper newGiftInfoPanelWrapper) {
        this.f29247e.setIndicatorVisibility(newGiftInfoPanelWrapper.giftInfos.size() > 8);
        this.f29248f.m180460q(newGiftInfoPanelWrapper.giftInfos);
    }

    public GiftOuterPagerItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftOuterPagerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
