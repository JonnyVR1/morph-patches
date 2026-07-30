package p153l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class dj30 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m116024a(y20 y20Var, ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        f.floatValue();
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static MatchSuccessAnimTime m116025b() {
        MatchSuccessAnimTime matchSuccessAnimTimeNew_ = MatchSuccessAnimTime.new_();
        matchSuccessAnimTimeNew_.male_enter_time = 700;
        matchSuccessAnimTimeNew_.male_keyboard_show_time = 200;
        matchSuccessAnimTimeNew_.male_keyboard_show_head_time = 150;
        matchSuccessAnimTimeNew_.male_exit_time = 800;
        matchSuccessAnimTimeNew_.female_enter_time = 600;
        matchSuccessAnimTimeNew_.female_exit_time = 800;
        return matchSuccessAnimTimeNew_;
    }

    /* JADX INFO: renamed from: c */
    public static void m116026c(float f, float f2, float f3, y20<Float> y20Var) {
        float fM116027d = m116027d(f, f2, f3);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Float.valueOf(fM116027d));
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m116027d(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: e */
    public static void m116028e(View view, float f, float f2, float f3) {
        view.setAlpha(m116027d(f, f2, f3));
    }

    /* JADX INFO: renamed from: f */
    public static void m116029f(View view, float f, float f2, float f3) {
        view.setRotation(m116027d(f, f2, f3));
    }

    /* JADX INFO: renamed from: g */
    public static void m116030g(View view, float f, float f2, float f3) {
        view.setScaleX(m116027d(f, f2, f3));
    }

    /* JADX INFO: renamed from: h */
    public static void m116031h(View view, float f, float f2, float f3) {
        view.setScaleY(m116027d(f, f2, f3));
    }

    /* JADX INFO: renamed from: i */
    public static void m116032i(View view, float f, float f2, float f3) {
        view.setTranslationX(m116027d(f, f2, f3));
    }

    /* JADX INFO: renamed from: j */
    public static void m116033j(View view, float f, float f2, float f3) {
        view.setTranslationY(m116027d(f, f2, f3));
    }

    /* JADX INFO: renamed from: k */
    public static void m116034k(int i, final y20<Float> y20Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cj30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dj30.m116024a(y20Var, valueAnimator);
            }
        });
        gt0.m132160f(duration, runnable);
        duration.start();
    }

    /* JADX INFO: renamed from: l */
    public static MatchSuccessAnimTime m116035l() {
        MatchSuccessAnimTime matchSuccessAnimTime;
        try {
            matchSuccessAnimTime = MatchSuccessAnimTime.JSON_ADAPTER.parse(CoreModule.f18264c.f20381e0.f89217e3.get());
        } catch (IOException unused) {
            matchSuccessAnimTime = null;
        }
        return matchSuccessAnimTime == null ? m116025b() : matchSuccessAnimTime;
    }
}
