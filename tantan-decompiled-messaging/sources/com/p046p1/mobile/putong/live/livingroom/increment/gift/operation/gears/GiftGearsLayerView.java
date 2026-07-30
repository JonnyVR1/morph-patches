package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import p149l.aqj;
import p149l.d30;
import p149l.ihs;
import p149l.t100;
import p149l.xdl0;
import p149l.ypj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftGearsLayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GiftGearsProgressView f49848a;

    public GiftGearsLayerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73833a(View view) {
        aqj.m98304a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final GiftGearsFlyView m73834b(ihs ihsVar) {
        if (ihsVar.m136280e() != 100.0f) {
            return null;
        }
        GiftGearsFlyView giftGearsFlyViewM215639b = ypj.m215637c().m215639b(getContext());
        addView(giftGearsFlyViewM215639b, new FrameLayout.LayoutParams(t100.m186890d(20.0f), t100.m186890d(20.0f)));
        giftGearsFlyViewM215639b.m73831o(ihsVar);
        return giftGearsFlyViewM215639b;
    }

    /* JADX INFO: renamed from: c */
    public void m73835c(d30 d30Var) {
        this.f49848a.m73851i(d30Var);
    }

    /* JADX INFO: renamed from: d */
    public void m73836d() {
        if (getChildCount() <= 1) {
            xdl0.m208345M0(this, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m73837e() {
        this.f49848a.m73863u();
    }

    /* JADX INFO: renamed from: f */
    public void m73838f(LiveGiftItemView liveGiftItemView, ihs ihsVar, int[] iArr) {
        this.f49848a.m73862t(liveGiftItemView);
        xdl0.m208344M(this, true);
        this.f49848a.m73865w(ihsVar, iArr, m73834b(ihsVar));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73833a(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f49848a.setVisibility(i);
        }
    }

    public GiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
