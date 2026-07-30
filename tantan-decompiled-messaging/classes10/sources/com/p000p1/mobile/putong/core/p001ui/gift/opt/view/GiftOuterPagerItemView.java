package com.p000p1.mobile.putong.core.p001ui.gift.opt.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import p003l.ltj;
import p003l.rqj;
import p003l.zsj;
import v.VPager;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftOuterPagerItemView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VPager f1640d;

    /* JADX INFO: renamed from: e */
    public GiftPanelBottomBar f1641e;

    /* JADX INFO: renamed from: f */
    public rqj f1642f;

    public GiftOuterPagerItemView(Context context) {
        super(context);
    }

    public rqj getAdapter() {
        return this.f1642f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2837p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2837p(View view) {
        zsj.m11450a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public void m2838q(ltj ltjVar, int i) {
        rqj rqjVar = new rqj(ltjVar, 4, i);
        this.f1642f = rqjVar;
        this.f1640d.setAdapter(rqjVar);
        this.f1641e.m2842u(ltjVar.b(), this.f1640d, ltjVar.m7914t());
    }

    /* JADX INFO: renamed from: z */
    public void m2839z(NewGiftInfoPanelWrapper newGiftInfoPanelWrapper) {
        this.f1641e.setIndicatorVisibility(newGiftInfoPanelWrapper.giftInfos.size() > 8);
        this.f1642f.m9158q(newGiftInfoPanelWrapper.giftInfos);
    }

    public GiftOuterPagerItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftOuterPagerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
