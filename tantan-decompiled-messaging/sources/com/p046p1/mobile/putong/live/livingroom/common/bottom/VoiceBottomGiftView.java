package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hkm0;
import p149l.hxs;
import p149l.i5h0;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceBottomGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceBottomGiftView f48555d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48556e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f48557f;

    /* JADX INFO: renamed from: g */
    public View f48558g;

    /* JADX INFO: renamed from: h */
    public TextView f48559h;

    /* JADX INFO: renamed from: i */
    public VText f48560i;

    /* JADX INFO: renamed from: j */
    public i5h0 f48561j;

    public VoiceBottomGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g0 */
    public void m72197g0(boolean z) {
        if (ypv.f199493a.m199315H()) {
            xdl0.m208344M(this.f48558g, z);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m72198i0(View view) {
        hkm0.m131576a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m72199j0(Boolean bool) {
        if (bool.booleanValue()) {
            post(new Runnable() { // from class: l.gkm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103208a.m72200k0();
                }
            });
        } else {
            this.f48557f.stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m72200k0() {
        if (xdl0.m208349O0(this.f48557f)) {
            return;
        }
        this.f48557f.mo68502l("https://auto.tancdn.com/v1/raw/ee6cf898-b62b-46be-8b89-e743fa53919d11.so", -1, this.f48561j);
    }

    /* JADX INFO: renamed from: l0 */
    public void m72201l0() {
        xdl0.m208344M(this.f48559h, false);
        xdl0.m208344M(this.f48560i, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72199j0(Boolean.FALSE);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72198i0(this);
        this.f48561j = new i5h0(this.f48557f, this.f48556e);
    }

    public void setIcon(String str) {
        hxs.m133407t("context_livingAct", this.f48556e, str, t100.f167275x);
    }

    public VoiceBottomGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceBottomGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f48556e.setImageResource(i);
    }
}
