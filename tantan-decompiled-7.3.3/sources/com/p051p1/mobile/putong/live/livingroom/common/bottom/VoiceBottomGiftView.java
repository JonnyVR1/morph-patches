package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.ltm0;
import p153l.qa00;
import p153l.qdh0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceBottomGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceBottomGiftView f49403d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49404e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f49405f;

    /* JADX INFO: renamed from: g */
    public View f49406g;

    /* JADX INFO: renamed from: h */
    public TextView f49407h;

    /* JADX INFO: renamed from: i */
    public VText f49408i;

    /* JADX INFO: renamed from: j */
    public qdh0 f49409j;

    public VoiceBottomGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g0 */
    public void m73380g0(boolean z) {
        if (zrv.f205799a.m207637H()) {
            bnl0.m105524M(this.f49406g, z);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m73381i0(View view) {
        ltm0.m155801a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m73382j0(Boolean bool) {
        if (bool.booleanValue()) {
            post(new Runnable() { // from class: l.ktm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128719a.m73383k0();
                }
            });
        } else {
            this.f49405f.stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m73383k0() {
        if (bnl0.m105529O0(this.f49405f)) {
            return;
        }
        this.f49405f.mo69685l("https://auto.tancdn.com/v1/raw/ee6cf898-b62b-46be-8b89-e743fa53919d11.so", -1, this.f49409j);
    }

    /* JADX INFO: renamed from: l0 */
    public void m73384l0() {
        bnl0.m105524M(this.f49407h, false);
        bnl0.m105524M(this.f49408i, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m73382j0(Boolean.FALSE);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73381i0(this);
        this.f49409j = new qdh0(this.f49405f, this.f49404e);
    }

    public void setIcon(String str) {
        izs.m142869t("context_livingAct", this.f49404e, str, qa00.f156337x);
    }

    public VoiceBottomGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceBottomGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f49404e.setImageResource(i);
    }
}
