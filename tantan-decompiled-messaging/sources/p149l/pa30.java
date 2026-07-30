package p149l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class pa30 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m167971a(e30 e30Var, ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        f.floatValue();
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static MatchSuccessAnimTime m167972b() {
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
    public static void m167973c(float f, float f2, float f3, e30<Float> e30Var) {
        float fM167974d = m167974d(f, f2, f3);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Float.valueOf(fM167974d));
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m167974d(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: e */
    public static void m167975e(View view, float f, float f2, float f3) {
        view.setAlpha(m167974d(f, f2, f3));
    }

    /* JADX INFO: renamed from: f */
    public static void m167976f(View view, float f, float f2, float f3) {
        view.setRotation(m167974d(f, f2, f3));
    }

    /* JADX INFO: renamed from: g */
    public static void m167977g(View view, float f, float f2, float f3) {
        view.setScaleX(m167974d(f, f2, f3));
    }

    /* JADX INFO: renamed from: h */
    public static void m167978h(View view, float f, float f2, float f3) {
        view.setScaleY(m167974d(f, f2, f3));
    }

    /* JADX INFO: renamed from: i */
    public static void m167979i(View view, float f, float f2, float f3) {
        view.setTranslationX(m167974d(f, f2, f3));
    }

    /* JADX INFO: renamed from: j */
    public static void m167980j(View view, float f, float f2, float f3) {
        view.setTranslationY(m167974d(f, f2, f3));
    }

    /* JADX INFO: renamed from: k */
    public static void m167981k(int i, final e30<Float> e30Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oa30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                pa30.m167971a(e30Var, valueAnimator);
            }
        });
        bt0.m103733f(duration, runnable);
        duration.start();
    }

    /* JADX INFO: renamed from: l */
    public static MatchSuccessAnimTime m167982l() {
        MatchSuccessAnimTime matchSuccessAnimTime;
        try {
            matchSuccessAnimTime = MatchSuccessAnimTime.JSON_ADAPTER.parse(CoreModule.f17545c.f19639e0.f149360e3.get());
        } catch (IOException unused) {
            matchSuccessAnimTime = null;
        }
        return matchSuccessAnimTime == null ? m167972b() : matchSuccessAnimTime;
    }
}
