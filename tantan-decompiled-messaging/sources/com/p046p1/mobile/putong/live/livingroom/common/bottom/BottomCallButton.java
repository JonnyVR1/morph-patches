package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.t100;
import p149l.xa3;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class BottomCallButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f48478a;

    /* JADX INFO: renamed from: b */
    public View f48479b;

    /* JADX INFO: renamed from: c */
    public TextView f48480c;

    /* JADX INFO: renamed from: d */
    public int f48481d;

    public BottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m72136a(View view) {
        xa3.m207520a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72137b(int i) {
        if (i <= 0 || xdl0.m208349O0(this.f48479b)) {
            xdl0.m208344M(this.f48480c, false);
        } else {
            xdl0.m208344M(this.f48480c, true);
            this.f48480c.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f48481d = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48479b, z);
        TextView textView = this.f48480c;
        if (z) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, this.f48481d > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72136a(this);
    }

    public void setIcon(String str) {
        hxs.m133408u("context_livingAct", this.f48478a, str, t100.m186890d(44.0f), t100.m186890d(38.0f));
    }

    public BottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomCallButton(@NonNull Context context) {
        super(context);
    }

    public void setIcon(int i) {
        this.f48478a.setImageResource(i);
    }
}
