package com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.ewn0;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;
import p149l.xvn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveSpecialSystemBulletView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f53220a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53221b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f53222c;

    /* JADX INFO: renamed from: d */
    public VText f53223d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f53224e;

    /* JADX INFO: renamed from: f */
    public VImage f53225f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53226g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f53227h;

    public VoiceLiveSpecialSystemBulletView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78211p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m78211p(View view) {
        xvn0.m211302a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m78212s(ewn0 ewn0Var) {
        float f = ewn0Var.m118484k() ? 126 : 112;
        this.f53223d.setMaxWidth(xdl0.m208412y0() - t100.m186890d(f));
        this.f53224e.setMaxWidth(xdl0.m208412y0() - t100.m186890d(f));
        hxs.m133406s("context_livingAct", this.f53221b, ewn0Var.m118479f());
        hxs.m133406s("context_livingAct", this.f53226g, ewn0Var.m118475b());
        xdl0.m208344M(this.f53225f, ewn0Var.m118484k());
        xdl0.m208327D0(this.f53223d.getWidth() + this.f53225f.getWidth(), this.f53222c);
        hxs.m133406s("context_livingAct", this.f53222c, ewn0Var.m118480g());
    }

    public VoiceLiveSpecialSystemBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveSpecialSystemBulletView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
