package com.p051p1.mobile.putong.live.livingroom.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.pvf0;
import p153l.qa00;
import p153l.zoh0;

/* JADX INFO: loaded from: classes4.dex */
public class SpecialSystemBulletView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f50311a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50312b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50313c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f50314d;

    /* JADX INFO: renamed from: e */
    public VText f50315e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f50316f;

    /* JADX INFO: renamed from: g */
    public VImage f50317g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f50318h;

    public SpecialSystemBulletView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74562p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m74562p(View view) {
        pvf0.m173941a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m74563s(zoh0 zoh0Var) {
        this.f50315e.setMaxWidth(bnl0.m105592y0() - qa00.m175859d(86.0f));
        this.f50316f.setMaxWidth(bnl0.m105592y0() - qa00.m175859d(86.0f));
        izs.m142868s("context_livingAct", this.f50312b, zoh0Var.m220770f());
        izs.m142868s("context_livingAct", this.f50314d, zoh0Var.m220766b());
        bnl0.m105524M(this.f50317g, zoh0Var.m220776l());
        bnl0.m105507D0(this.f50315e.getWidth(), this.f50313c);
        izs.m142868s("context_livingAct", this.f50313c, zoh0Var.m220771g());
    }

    public SpecialSystemBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpecialSystemBulletView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
