package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.t100;
import p149l.u310;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class MultiCallBottomMenuView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public MultiCallBottomMenuView f48516a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48517b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f48518c;

    /* JADX INFO: renamed from: d */
    public View f48519d;

    /* JADX INFO: renamed from: e */
    public TextView f48520e;

    /* JADX INFO: renamed from: f */
    public int f48521f;

    public MultiCallBottomMenuView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72159a(View view) {
        u310.m191560a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72160b(int i) {
        if (i <= 0 || xdl0.m208349O0(this.f48519d)) {
            xdl0.m208344M(this.f48520e, false);
        } else {
            xdl0.m208344M(this.f48520e, true);
            this.f48520e.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f48521f = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48519d, z);
        TextView textView = this.f48520e;
        if (z) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, this.f48521f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72159a(this);
    }

    public void setIcon(String str) {
        hxs.m133408u("context_livingAct", this.f48517b, str, t100.m186890d(44.0f), t100.m186890d(38.0f));
    }

    public MultiCallBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiCallBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f48517b.setImageResource(i);
    }
}
