package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.u310;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MultiCallBottomMenuView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public MultiCallBottomMenuView f4558a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4559b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f4560c;

    /* JADX INFO: renamed from: d */
    public View f4561d;

    /* JADX INFO: renamed from: e */
    public TextView f4562e;

    /* JADX INFO: renamed from: f */
    public int f4563f;

    public MultiCallBottomMenuView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5632a(View view) {
        u310.m23274a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5633b(int i) {
        if (i <= 0 || xdl0.O0(this.f4561d)) {
            xdl0.M(this.f4562e, false);
        } else {
            xdl0.M(this.f4562e, true);
            this.f4562e.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f4563f = i;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4561d, z);
        TextView textView = this.f4562e;
        if (z) {
            xdl0.M(textView, false);
        } else {
            xdl0.M(textView, this.f4563f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5632a(this);
    }

    public void setIcon(String str) {
        hxs.u("context_livingAct", this.f4559b, str, t100.d(44.0f), t100.d(38.0f));
    }

    public MultiCallBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiCallBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f4559b.setImageResource(i);
    }
}
