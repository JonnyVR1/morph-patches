package com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.b5o0;
import p153l.bnl0;
import p153l.i5o0;
import p153l.izs;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveSpecialSystemBulletView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f54068a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54069b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f54070c;

    /* JADX INFO: renamed from: d */
    public VText f54071d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f54072e;

    /* JADX INFO: renamed from: f */
    public VImage f54073f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54074g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f54075h;

    public VoiceLiveSpecialSystemBulletView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79394p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m79394p(View view) {
        b5o0.m102620a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m79395s(i5o0 i5o0Var) {
        float f = i5o0Var.m138761k() ? 126 : 112;
        this.f54071d.setMaxWidth(bnl0.m105592y0() - qa00.m175859d(f));
        this.f54072e.setMaxWidth(bnl0.m105592y0() - qa00.m175859d(f));
        izs.m142868s("context_livingAct", this.f54069b, i5o0Var.m138756f());
        izs.m142868s("context_livingAct", this.f54074g, i5o0Var.m138752b());
        bnl0.m105524M(this.f54073f, i5o0Var.m138761k());
        bnl0.m105507D0(this.f54071d.getWidth() + this.f54073f.getWidth(), this.f54070c);
        izs.m142868s("context_livingAct", this.f54070c, i5o0Var.m138757g());
    }

    public VoiceLiveSpecialSystemBulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveSpecialSystemBulletView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
