package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VIcon;
import p153l.adc0;
import p153l.bnl0;
import p153l.gt0;
import p153l.kec0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class SwipeLikeButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f24766a;

    /* JADX INFO: renamed from: b */
    public VIcon f24767b;

    public SwipeLikeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, kec0.f125362Cc, this);
        this.f24766a = (SVGAnimationView) findViewById(adc0.f70646xd);
        this.f24767b = (VIcon) findViewById(adc0.f70663yd);
    }

    public void reset() {
        bnl0.m105525M0(this.f24766a, true);
        bnl0.m105525M0(this.f24767b, false);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m40213s(x20 x20Var) {
        reset();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m40214u(String str) {
        m40215v(str, 0);
    }

    /* JADX INFO: renamed from: v */
    public void m40215v(String str, int i) {
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(i).into(this.f24766a);
    }

    /* JADX INFO: renamed from: w */
    public void m40216w(final x20 x20Var) {
        bnl0.m105525M0(this.f24766a, false);
        bnl0.m105525M0(this.f24767b, true);
        this.f24767b.setAlpha(0.8f);
        gt0.m132160f(gt0.m132170p(this.f24767b, "alpha", 350L, 500L, gt0.f106348c, 0.8f, 0.0f), new Runnable() { // from class: l.ojh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147673a.m40213s(x20Var);
            }
        }).start();
    }

    /* JADX INFO: renamed from: z */
    public void m40217z(float f) {
        this.f24766a.stepToFrame(f, false);
    }

    public SwipeLikeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeLikeButton(Context context) {
        this(context, null);
    }
}
