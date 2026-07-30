package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import l.i5h0;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.hkm0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceBottomGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceBottomGiftView f4597d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4598e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f4599f;

    /* JADX INFO: renamed from: g */
    public View f4600g;

    /* JADX INFO: renamed from: h */
    public TextView f4601h;

    /* JADX INFO: renamed from: i */
    public VText f4602i;

    /* JADX INFO: renamed from: j */
    public i5h0 f4603j;

    public VoiceBottomGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g0 */
    public void m5670g0(boolean z) {
        if (ypv.a.H()) {
            xdl0.M(this.f4600g, z);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m5671i0(View view) {
        hkm0.m14438a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m5672j0(Boolean bool) {
        if (bool.booleanValue()) {
            post(new Runnable() { // from class: l.gkm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11487a.m5673k0();
                }
            });
        } else {
            this.f4599f.stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m5673k0() {
        if (xdl0.O0(this.f4599f)) {
            return;
        }
        this.f4599f.l("https://auto.tancdn.com/v1/raw/ee6cf898-b62b-46be-8b89-e743fa53919d11.so", -1, this.f4603j);
    }

    /* JADX INFO: renamed from: l0 */
    public void m5674l0() {
        xdl0.M(this.f4601h, false);
        xdl0.M(this.f4602i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m5672j0(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5671i0(this);
        this.f4603j = new i5h0(this.f4599f, this.f4598e);
    }

    public void setIcon(String str) {
        hxs.t("context_livingAct", this.f4598e, str, t100.x);
    }

    public VoiceBottomGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceBottomGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f4598e.setImageResource(i);
    }
}
