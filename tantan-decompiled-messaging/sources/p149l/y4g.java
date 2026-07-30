package p149l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class y4g implements s7m<z4g> {

    /* JADX INFO: renamed from: a */
    public z4g f196277a;

    /* JADX INFO: renamed from: b */
    public final VImage f196278b;

    /* JADX INFO: renamed from: c */
    public final VImage f196279c;

    /* JADX INFO: renamed from: d */
    public final VImage f196280d;

    /* JADX INFO: renamed from: e */
    public final ValueAnimator f196281e = ValueAnimator.ofFloat(0.0f, 1.0f);

    public y4g(VImage vImage, VImage vImage2, VImage vImage3) {
        this.f196278b = vImage;
        this.f196279c = vImage2;
        this.f196280d = vImage3;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f196278b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(z4g z4gVar) {
        this.f196277a = z4gVar;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m212896d() {
        this.f196278b.setTranslationX(t100.f167261j);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m212897e(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        VImage vImage = this.f196278b;
        int i = t100.f167261j;
        vImage.setTranslationY(i * (1.0f - fFloatValue));
        this.f196279c.setTranslationY(i * fFloatValue);
        this.f196280d.setTranslationY(i * fFloatValue);
    }

    /* JADX INFO: renamed from: f */
    public void m212898f() {
        this.f196281e.setDuration(2000L);
        bt0.m103749v(this.f196281e, new Runnable() { // from class: l.w4g
            @Override // java.lang.Runnable
            public final void run() {
                this.f184559a.m212896d();
            }
        });
        this.f196281e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.x4g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f191021a.m212897e(valueAnimator);
            }
        });
        this.f196281e.setInterpolator(new LinearInterpolator());
        this.f196281e.setRepeatMode(2);
        this.f196281e.setRepeatCount(-1);
        this.f196281e.start();
    }

    /* JADX INFO: renamed from: i */
    public void m212899i() {
        this.f196281e.cancel();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
