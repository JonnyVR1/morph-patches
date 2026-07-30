package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VIcon;
import p149l.bt0;
import p149l.d30;
import p149l.f6c0;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class SwipeLikeButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f24024a;

    /* JADX INFO: renamed from: b */
    public VIcon f24025b;

    public SwipeLikeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, f6c0.f96051vc, this);
        this.f24024a = (SVGAnimationView) findViewById(u4c0.f174521vd);
        this.f24025b = (VIcon) findViewById(u4c0.f174538wd);
    }

    public void reset() {
        xdl0.m208345M0(this.f24024a, true);
        xdl0.m208345M0(this.f24025b, false);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m39210s(d30 d30Var) {
        reset();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m39211u(String str) {
        m39212v(str, 0);
    }

    /* JADX INFO: renamed from: v */
    public void m39212v(String str, int i) {
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(i).into(this.f24024a);
    }

    /* JADX INFO: renamed from: w */
    public void m39213w(final d30 d30Var) {
        xdl0.m208345M0(this.f24024a, false);
        xdl0.m208345M0(this.f24025b, true);
        this.f24025b.setAlpha(0.8f);
        bt0.m103733f(bt0.m103743p(this.f24025b, "alpha", 350L, 500L, bt0.f77156c, 0.8f, 0.0f), new Runnable() { // from class: l.gbh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101854a.m39210s(d30Var);
            }
        }).start();
    }

    /* JADX INFO: renamed from: z */
    public void m39214z(float f) {
        this.f24024a.stepToFrame(f, false);
    }

    public SwipeLikeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeLikeButton(Context context) {
        this(context, null);
    }
}
