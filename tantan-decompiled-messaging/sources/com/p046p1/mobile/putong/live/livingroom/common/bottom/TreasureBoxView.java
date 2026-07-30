package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.view.CountdownGiftProgressView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.gaj0;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TreasureBoxView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public TreasureBoxView f48550a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48551b;

    /* JADX INFO: renamed from: c */
    public CountdownGiftProgressView f48552c;

    /* JADX INFO: renamed from: d */
    public VText f48553d;

    /* JADX INFO: renamed from: e */
    public View f48554e;

    public TreasureBoxView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72195a(View view) {
        gaj0.m124999a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48554e, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72195a(this);
    }

    public void setIcon(String str) {
        hxs.m133408u("context_livingAct", this.f48551b, str, t100.m186890d(44.0f), t100.m186890d(38.0f));
    }

    public TreasureBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TreasureBoxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
