package com.p000p1.mobile.putong.live.livingroom.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantan.library.svga.SVGAnimationView;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.gnf0;
import p002l.sgh0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VMarqueeText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SpecialSystemBulletView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f5505a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5506b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5507c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f5508d;

    /* JADX INFO: renamed from: e */
    public VText f5509e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f5510f;

    /* JADX INFO: renamed from: g */
    public VImage f5511g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f5512h;

    public SpecialSystemBulletView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6917p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m6917p(View view) {
        gnf0.m13973a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m6918s(sgh0 sgh0Var) {
        this.f5509e.setMaxWidth(xdl0.y0() - t100.d(86.0f));
        this.f5510f.setMaxWidth(xdl0.y0() - t100.d(86.0f));
        hxs.s("context_livingAct", this.f5506b, sgh0Var.m22458f());
        hxs.s("context_livingAct", this.f5508d, sgh0Var.m22454b());
        xdl0.M(this.f5511g, sgh0Var.m22464l());
        xdl0.D0(this.f5509e.getWidth(), new View[]{this.f5507c});
        hxs.s("context_livingAct", this.f5507c, sgh0Var.m22459g());
    }

    public SpecialSystemBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpecialSystemBulletView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
