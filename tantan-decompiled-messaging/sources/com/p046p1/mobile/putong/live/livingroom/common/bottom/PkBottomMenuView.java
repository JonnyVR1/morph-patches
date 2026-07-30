package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.i3c0;
import p149l.mk70;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class PkBottomMenuView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public PkBottomMenuView f48528a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48529b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f48530c;

    /* JADX INFO: renamed from: d */
    public View f48531d;

    public PkBottomMenuView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72186a(View view) {
        mk70.m154925a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72187b() {
        xdl0.m208344M(this.f48529b, false);
        xdl0.m208344M(this.f48530c, true);
        this.f48530c.m68500j("https://auto.tancdn.com/v1/raw/b397b07f-304c-4a32-b675-4ff555a3a26411.pdf", -1);
    }

    /* JADX INFO: renamed from: c */
    public void m72188c() {
        xdl0.m208344M(this.f48529b, true);
        xdl0.m208344M(this.f48530c, false);
        this.f48530c.m68504n();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48531d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72186a(this);
    }

    public void setIcon(String str) {
        hxs.m133408u("context_livingAct", this.f48529b, str, t100.m186890d(44.0f), t100.m186890d(38.0f));
    }

    public void setPkBackGround(boolean z) {
        if (z) {
            setBackgroundResource(0);
        } else {
            setBackgroundResource(i3c0.f110860T);
        }
    }

    public PkBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f48529b.setImageResource(i);
    }
}
