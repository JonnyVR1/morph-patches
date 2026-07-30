package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.ssm;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class InputCallButton extends RelativeLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f48513a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f48514b;

    /* JADX INFO: renamed from: c */
    public View f48515c;

    public InputCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m72156a(View view) {
        ssm.m185756a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72157b(boolean z) {
        if (xdl0.m208349O0(this.f48513a) || xdl0.m208349O0(this.f48514b)) {
            if (z) {
                xdl0.m208344M(this.f48514b, true);
                xdl0.m208344M(this.f48513a, false);
                this.f48514b.m68500j("https://auto.tancdn.com/v1/raw/5a4eb7ec-aef8-40e8-abb3-25884bc4f3f510.so", -1);
            } else {
                xdl0.m208344M(this.f48513a, true);
                xdl0.m208344M(this.f48514b, false);
                this.f48514b.m68504n();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m72158c(boolean z) {
        if (!z) {
            xdl0.m208344M(this, false);
            xdl0.m208344M(this.f48514b, false);
            xdl0.m208344M(this.f48513a, false);
        } else {
            xdl0.m208344M(this, true);
            xdl0.m208344M(this.f48513a, true);
            xdl0.m208344M(this.f48514b, false);
            this.f48514b.m68504n();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48515c, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72156a(this);
    }

    public void setIcon(String str) {
        hxs.m133407t("context_livingAct", this.f48513a, str, t100.f167266o);
    }
}
