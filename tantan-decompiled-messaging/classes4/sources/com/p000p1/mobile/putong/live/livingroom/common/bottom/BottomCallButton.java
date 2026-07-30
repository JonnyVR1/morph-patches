package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.xa3;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BottomCallButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4520a;

    /* JADX INFO: renamed from: b */
    public View f4521b;

    /* JADX INFO: renamed from: c */
    public TextView f4522c;

    /* JADX INFO: renamed from: d */
    public int f4523d;

    public BottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m5609a(View view) {
        xa3.m25805a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5610b(int i) {
        if (i <= 0 || xdl0.O0(this.f4521b)) {
            xdl0.M(this.f4522c, false);
        } else {
            xdl0.M(this.f4522c, true);
            this.f4522c.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f4523d = i;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4521b, z);
        TextView textView = this.f4522c;
        if (z) {
            xdl0.M(textView, false);
        } else {
            xdl0.M(textView, this.f4523d > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5609a(this);
    }

    public void setIcon(String str) {
        hxs.u("context_livingAct", this.f4520a, str, t100.d(44.0f), t100.d(38.0f));
    }

    public BottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomCallButton(@NonNull Context context) {
        super(context);
    }

    public void setIcon(int i) {
        this.f4520a.setImageResource(i);
    }
}
