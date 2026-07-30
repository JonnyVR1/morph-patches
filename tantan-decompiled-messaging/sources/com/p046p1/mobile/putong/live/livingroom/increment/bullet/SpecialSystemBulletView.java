package com.p046p1.mobile.putong.live.livingroom.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.gnf0;
import p149l.hxs;
import p149l.sgh0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class SpecialSystemBulletView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f49463a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49464b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49465c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f49466d;

    /* JADX INFO: renamed from: e */
    public VText f49467e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f49468f;

    /* JADX INFO: renamed from: g */
    public VImage f49469g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f49470h;

    public SpecialSystemBulletView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73379p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m73379p(View view) {
        gnf0.m127137a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m73380s(sgh0 sgh0Var) {
        this.f49467e.setMaxWidth(xdl0.m208412y0() - t100.m186890d(86.0f));
        this.f49468f.setMaxWidth(xdl0.m208412y0() - t100.m186890d(86.0f));
        hxs.m133406s("context_livingAct", this.f49464b, sgh0Var.m184075f());
        hxs.m133406s("context_livingAct", this.f49466d, sgh0Var.m184071b());
        xdl0.m208344M(this.f49469g, sgh0Var.m184081l());
        xdl0.m208327D0(this.f49467e.getWidth(), this.f49465c);
        hxs.m133406s("context_livingAct", this.f49465c, sgh0Var.m184076g());
    }

    public SpecialSystemBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpecialSystemBulletView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
