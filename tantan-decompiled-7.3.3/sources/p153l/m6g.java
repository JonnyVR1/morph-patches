package p153l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class m6g implements iam<n6g> {

    /* JADX INFO: renamed from: a */
    public n6g f134991a;

    /* JADX INFO: renamed from: b */
    public final VImage f134992b;

    /* JADX INFO: renamed from: c */
    public final VImage f134993c;

    /* JADX INFO: renamed from: d */
    public final VImage f134994d;

    /* JADX INFO: renamed from: e */
    public final ValueAnimator f134995e = ValueAnimator.ofFloat(0.0f, 1.0f);

    public m6g(VImage vImage, VImage vImage2, VImage vImage3) {
        this.f134992b = vImage;
        this.f134993c = vImage2;
        this.f134994d = vImage3;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f134992b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(n6g n6gVar) {
        this.f134991a = n6gVar;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m157222d() {
        this.f134992b.setTranslationX(qa00.f156323j);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m157223e(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        VImage vImage = this.f134992b;
        int i = qa00.f156323j;
        vImage.setTranslationY(i * (1.0f - fFloatValue));
        this.f134993c.setTranslationY(i * fFloatValue);
        this.f134994d.setTranslationY(i * fFloatValue);
    }

    /* JADX INFO: renamed from: f */
    public void m157224f() {
        this.f134995e.setDuration(2000L);
        gt0.m132176v(this.f134995e, new Runnable() { // from class: l.k6g
            @Override // java.lang.Runnable
            public final void run() {
                this.f124175a.m157222d();
            }
        });
        this.f134995e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l6g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f130255a.m157223e(valueAnimator);
            }
        });
        this.f134995e.setInterpolator(new LinearInterpolator());
        this.f134995e.setRepeatMode(2);
        this.f134995e.setRepeatCount(-1);
        this.f134995e.start();
    }

    /* JADX INFO: renamed from: i */
    public void m157225i() {
        this.f134995e.cancel();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
