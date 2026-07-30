package p003l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MatchSuccessAnimTime;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.bt0;
import org.spongycastle.crypto.tls.CipherSuite;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class pa30 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6805a(e30 e30Var, ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        f.floatValue();
        if (NullChecker.a(e30Var)) {
            e30Var.call(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static MatchSuccessAnimTime m6806b() {
        MatchSuccessAnimTime matchSuccessAnimTimeNew_ = MatchSuccessAnimTime.new_();
        matchSuccessAnimTimeNew_.male_enter_time = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
        matchSuccessAnimTimeNew_.male_keyboard_show_time = 200;
        matchSuccessAnimTimeNew_.male_keyboard_show_head_time = CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA;
        matchSuccessAnimTimeNew_.male_exit_time = 800;
        matchSuccessAnimTimeNew_.female_enter_time = 600;
        matchSuccessAnimTimeNew_.female_exit_time = 800;
        return matchSuccessAnimTimeNew_;
    }

    /* JADX INFO: renamed from: c */
    public static void m6807c(float f, float f2, float f3, e30<Float> e30Var) {
        float fM6808d = m6808d(f, f2, f3);
        if (NullChecker.a(e30Var)) {
            e30Var.call(Float.valueOf(fM6808d));
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m6808d(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: e */
    public static void m6809e(View view, float f, float f2, float f3) {
        view.setAlpha(m6808d(f, f2, f3));
    }

    /* JADX INFO: renamed from: f */
    public static void m6810f(View view, float f, float f2, float f3) {
        view.setRotation(m6808d(f, f2, f3));
    }

    /* JADX INFO: renamed from: g */
    public static void m6811g(View view, float f, float f2, float f3) {
        view.setScaleX(m6808d(f, f2, f3));
    }

    /* JADX INFO: renamed from: h */
    public static void m6812h(View view, float f, float f2, float f3) {
        view.setScaleY(m6808d(f, f2, f3));
    }

    /* JADX INFO: renamed from: i */
    public static void m6813i(View view, float f, float f2, float f3) {
        view.setTranslationX(m6808d(f, f2, f3));
    }

    /* JADX INFO: renamed from: j */
    public static void m6814j(View view, float f, float f2, float f3) {
        view.setTranslationY(m6808d(f, f2, f3));
    }

    /* JADX INFO: renamed from: k */
    public static void m6815k(int i, final e30<Float> e30Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oa30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                pa30.m6805a(e30Var, valueAnimator);
            }
        });
        bt0.f(duration, runnable);
        duration.start();
    }

    /* JADX INFO: renamed from: l */
    public static MatchSuccessAnimTime m6816l() {
        MatchSuccessAnimTime matchSuccessAnimTime;
        try {
            matchSuccessAnimTime = (MatchSuccessAnimTime) MatchSuccessAnimTime.JSON_ADAPTER.parse((String) CoreModule.c.e0.e3.get());
        } catch (IOException unused) {
            matchSuccessAnimTime = null;
        }
        return matchSuccessAnimTime == null ? m6806b() : matchSuccessAnimTime;
    }
}
