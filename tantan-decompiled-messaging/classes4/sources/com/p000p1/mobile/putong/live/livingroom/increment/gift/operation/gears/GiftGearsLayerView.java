package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import l.d30;
import l.t100;
import l.xdl0;
import p002l.aqj;
import p002l.ihs;
import p002l.ypj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftGearsLayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GiftGearsProgressView f5890a;

    public GiftGearsLayerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7389a(View view) {
        aqj.m10062a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final GiftGearsFlyView m7390b(ihs ihsVar) {
        if (ihsVar.m15157e() != 100.0f) {
            return null;
        }
        GiftGearsFlyView giftGearsFlyViewM26872b = ypj.m26870c().m26872b(getContext());
        addView(giftGearsFlyViewM26872b, new FrameLayout.LayoutParams(t100.d(20.0f), t100.d(20.0f)));
        giftGearsFlyViewM26872b.m7387o(ihsVar);
        return giftGearsFlyViewM26872b;
    }

    /* JADX INFO: renamed from: c */
    public void m7391c(d30 d30Var) {
        this.f5890a.m7407i(d30Var);
    }

    /* JADX INFO: renamed from: d */
    public void m7392d() {
        if (getChildCount() <= 1) {
            xdl0.M0(this, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m7393e() {
        this.f5890a.m7419u();
    }

    /* JADX INFO: renamed from: f */
    public void m7394f(LiveGiftItemView liveGiftItemView, ihs ihsVar, int[] iArr) {
        this.f5890a.m7418t(liveGiftItemView);
        xdl0.M(this, true);
        this.f5890a.m7421w(ihsVar, iArr, m7390b(ihsVar));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7389a(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f5890a.setVisibility(i);
        }
    }

    public GiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
