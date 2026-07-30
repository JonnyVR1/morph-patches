package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.ec10;
import p153l.izs;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class MultiCallBottomMenuView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public MultiCallBottomMenuView f49364a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49365b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f49366c;

    /* JADX INFO: renamed from: d */
    public View f49367d;

    /* JADX INFO: renamed from: e */
    public TextView f49368e;

    /* JADX INFO: renamed from: f */
    public int f49369f;

    public MultiCallBottomMenuView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73342a(View view) {
        ec10.m120290a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73343b(int i) {
        if (i <= 0 || bnl0.m105529O0(this.f49367d)) {
            bnl0.m105524M(this.f49368e, false);
        } else {
            bnl0.m105524M(this.f49368e, true);
            this.f49368e.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f49369f = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49367d, z);
        TextView textView = this.f49368e;
        if (z) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, this.f49369f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73342a(this);
    }

    public void setIcon(String str) {
        izs.m142870u("context_livingAct", this.f49365b, str, qa00.m175859d(44.0f), qa00.m175859d(38.0f));
    }

    public MultiCallBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiCallBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f49365b.setImageResource(i);
    }
}
