package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.mb3;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class BottomCallButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49326a;

    /* JADX INFO: renamed from: b */
    public View f49327b;

    /* JADX INFO: renamed from: c */
    public TextView f49328c;

    /* JADX INFO: renamed from: d */
    public int f49329d;

    public BottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73319a(View view) {
        mb3.m157765a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73320b(int i) {
        if (i <= 0 || bnl0.m105529O0(this.f49327b)) {
            bnl0.m105524M(this.f49328c, false);
        } else {
            bnl0.m105524M(this.f49328c, true);
            this.f49328c.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f49329d = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49327b, z);
        TextView textView = this.f49328c;
        if (z) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, this.f49329d > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73319a(this);
    }

    public void setIcon(String str) {
        izs.m142870u("context_livingAct", this.f49326a, str, qa00.m175859d(44.0f), qa00.m175859d(38.0f));
    }

    public BottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomCallButton(@NonNull Context context) {
        super(context);
    }

    public void setIcon(int i) {
        this.f49326a.setImageResource(i);
    }
}
