package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.i3c0;
import p002l.mk70;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PkBottomMenuView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public PkBottomMenuView f4570a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4571b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f4572c;

    /* JADX INFO: renamed from: d */
    public View f4573d;

    public PkBottomMenuView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5659a(View view) {
        mk70.m17973a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5660b() {
        xdl0.M(this.f4571b, false);
        xdl0.M(this.f4572c, true);
        this.f4572c.j("https://auto.tancdn.com/v1/raw/b397b07f-304c-4a32-b675-4ff555a3a26411.pdf", -1);
    }

    /* JADX INFO: renamed from: c */
    public void m5661c() {
        xdl0.M(this.f4571b, true);
        xdl0.M(this.f4572c, false);
        this.f4572c.n();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4573d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5659a(this);
    }

    public void setIcon(String str) {
        hxs.u("context_livingAct", this.f4571b, str, t100.d(44.0f), t100.d(38.0f));
    }

    public void setPkBackGround(boolean z) {
        if (z) {
            setBackgroundResource(0);
        } else {
            setBackgroundResource(i3c0.f12645T);
        }
    }

    public PkBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f4571b.setImageResource(i);
    }
}
