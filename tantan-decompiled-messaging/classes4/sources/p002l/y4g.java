package p002l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import l.bt0;
import l.s7m;
import l.t100;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y4g implements s7m<z4g> {

    /* JADX INFO: renamed from: a */
    public z4g f22655a;

    /* JADX INFO: renamed from: b */
    public final VImage f22656b;

    /* JADX INFO: renamed from: c */
    public final VImage f22657c;

    /* JADX INFO: renamed from: d */
    public final VImage f22658d;

    /* JADX INFO: renamed from: e */
    public final ValueAnimator f22659e = ValueAnimator.ofFloat(0.0f, 1.0f);

    public y4g(VImage vImage, VImage vImage2, VImage vImage3) {
        this.f22656b = vImage;
        this.f22657c = vImage2;
        this.f22658d = vImage3;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m26346C0() {
        return this.f22656b.getContext();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m26352i1(z4g z4gVar) {
        this.f22655a = z4gVar;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m26348d() {
        this.f22656b.setTranslationX(t100.j);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m26349e(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        VImage vImage = this.f22656b;
        int i = t100.j;
        vImage.setTranslationY(i * (1.0f - fFloatValue));
        this.f22657c.setTranslationY(i * fFloatValue);
        this.f22658d.setTranslationY(i * fFloatValue);
    }

    /* JADX INFO: renamed from: f */
    public void m26350f() {
        this.f22659e.setDuration(2000L);
        bt0.v(this.f22659e, new Runnable() { // from class: l.w4g
            @Override // java.lang.Runnable
            public final void run() {
                this.f21441a.m26348d();
            }
        });
        this.f22659e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.x4g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22112a.m26349e(valueAnimator);
            }
        });
        this.f22659e.setInterpolator(new LinearInterpolator());
        this.f22659e.setRepeatMode(2);
        this.f22659e.setRepeatCount(-1);
        this.f22659e.start();
    }

    /* JADX INFO: renamed from: i */
    public void m26351i() {
        this.f22659e.cancel();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
