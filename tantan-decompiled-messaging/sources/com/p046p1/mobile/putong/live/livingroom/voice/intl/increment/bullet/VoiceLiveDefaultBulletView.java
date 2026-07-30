package com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.ewn0;
import p149l.hxs;
import p149l.onn0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveDefaultBulletView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceLiveDefaultBulletView f53214d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f53215e;

    /* JADX INFO: renamed from: f */
    public VText f53216f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f53217g;

    /* JADX INFO: renamed from: h */
    public VImage f53218h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53219i;

    public VoiceLiveDefaultBulletView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78209h0(View view) {
        onn0.m165215a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78210i0(ewn0 ewn0Var) {
        hxs.m133406s("context_single_room", this.f53219i, ewn0Var.m118482i());
        xdl0.m208344M(this.f53218h, ewn0Var.m118484k());
        this.f53215e.setBackground(ewn0Var.m118478e());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78209h0(this);
    }

    public VoiceLiveDefaultBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
