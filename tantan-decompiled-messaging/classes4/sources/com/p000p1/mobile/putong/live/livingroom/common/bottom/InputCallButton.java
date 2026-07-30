package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.ssm;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class InputCallButton extends RelativeLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4555a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f4556b;

    /* JADX INFO: renamed from: c */
    public View f4557c;

    public InputCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m5629a(View view) {
        ssm.m22635a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5630b(boolean z) {
        if (xdl0.O0(this.f4555a) || xdl0.O0(this.f4556b)) {
            if (z) {
                xdl0.M(this.f4556b, true);
                xdl0.M(this.f4555a, false);
                this.f4556b.j("https://auto.tancdn.com/v1/raw/5a4eb7ec-aef8-40e8-abb3-25884bc4f3f510.so", -1);
            } else {
                xdl0.M(this.f4555a, true);
                xdl0.M(this.f4556b, false);
                this.f4556b.n();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5631c(boolean z) {
        if (!z) {
            xdl0.M(this, false);
            xdl0.M(this.f4556b, false);
            xdl0.M(this.f4555a, false);
        } else {
            xdl0.M(this, true);
            xdl0.M(this.f4555a, true);
            xdl0.M(this.f4556b, false);
            this.f4556b.n();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4557c, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5629a(this);
    }

    public void setIcon(String str) {
        hxs.t("context_livingAct", this.f4555a, str, t100.o);
    }
}
