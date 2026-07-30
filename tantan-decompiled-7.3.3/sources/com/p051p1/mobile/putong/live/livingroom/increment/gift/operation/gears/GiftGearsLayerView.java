package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import p153l.bnl0;
import p153l.jjs;
import p153l.osj;
import p153l.qa00;
import p153l.qsj;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class GiftGearsLayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GiftGearsProgressView f50696a;

    public GiftGearsLayerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m75016a(View view) {
        qsj.m177811a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final GiftGearsFlyView m75017b(jjs jjsVar) {
        if (jjsVar.m145119e() != 100.0f) {
            return null;
        }
        GiftGearsFlyView giftGearsFlyViewM169052b = osj.m169050c().m169052b(getContext());
        addView(giftGearsFlyViewM169052b, new FrameLayout.LayoutParams(qa00.m175859d(20.0f), qa00.m175859d(20.0f)));
        giftGearsFlyViewM169052b.m75014o(jjsVar);
        return giftGearsFlyViewM169052b;
    }

    /* JADX INFO: renamed from: c */
    public void m75018c(x20 x20Var) {
        this.f50696a.m75034i(x20Var);
    }

    /* JADX INFO: renamed from: d */
    public void m75019d() {
        if (getChildCount() <= 1) {
            bnl0.m105525M0(this, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m75020e() {
        this.f50696a.m75046u();
    }

    /* JADX INFO: renamed from: f */
    public void m75021f(LiveGiftItemView liveGiftItemView, jjs jjsVar, int[] iArr) {
        this.f50696a.m75045t(liveGiftItemView);
        bnl0.m105524M(this, true);
        this.f50696a.m75048w(jjsVar, iArr, m75017b(jjsVar));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75016a(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f50696a.setVisibility(i);
        }
    }

    public GiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
