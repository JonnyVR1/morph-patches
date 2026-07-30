package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.view.CountdownGiftProgressView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.kjj0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class TreasureBoxView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public TreasureBoxView f49398a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49399b;

    /* JADX INFO: renamed from: c */
    public CountdownGiftProgressView f49400c;

    /* JADX INFO: renamed from: d */
    public VText f49401d;

    /* JADX INFO: renamed from: e */
    public View f49402e;

    public TreasureBoxView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73378a(View view) {
        kjj0.m150048a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49402e, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73378a(this);
    }

    public void setIcon(String str) {
        izs.m142870u("context_livingAct", this.f49399b, str, qa00.m175859d(44.0f), qa00.m175859d(38.0f));
    }

    public TreasureBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TreasureBoxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
