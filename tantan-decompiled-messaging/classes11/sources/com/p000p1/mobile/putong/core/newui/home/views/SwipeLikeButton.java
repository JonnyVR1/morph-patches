package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.d30;
import l.f6c0;
import l.u4c0;
import l.xdl0;
import v.VFrame;
import v.VIcon;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SwipeLikeButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f2802a;

    /* JADX INFO: renamed from: b */
    public VIcon f2803b;

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeLikeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, f6c0.vc, this);
        this.f2802a = findViewById(u4c0.vd);
        this.f2803b = findViewById(u4c0.wd);
    }

    public void reset() {
        xdl0.M0(this.f2802a, true);
        xdl0.M0(this.f2803b, false);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m3228s(d30 d30Var) {
        reset();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3229u(String str) {
        m3230v(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m3230v(String str, int i) {
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(i).into(this.f2802a);
    }

    /* JADX INFO: renamed from: w */
    public void m3231w(final d30 d30Var) {
        xdl0.M0(this.f2802a, false);
        xdl0.M0(this.f2803b, true);
        this.f2803b.setAlpha(0.8f);
        bt0.f(bt0.p(this.f2803b, "alpha", 350L, 500L, bt0.c, new float[]{0.8f, 0.0f}), new Runnable() { // from class: l.gbh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13400a.m3228s(d30Var);
            }
        }).start();
    }

    /* JADX INFO: renamed from: z */
    public void m3232z(float f) {
        this.f2802a.stepToFrame(f, false);
    }

    public SwipeLikeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeLikeButton(Context context) {
        this(context, null);
    }
}
