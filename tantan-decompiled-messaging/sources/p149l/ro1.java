package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;

/* JADX INFO: loaded from: classes4.dex */
public class ro1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m180221a(TextView textView, ValueAnimator valueAnimator) {
        textView.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        textView.requestLayout();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m180222b(TextView textView, ValueAnimator valueAnimator) {
        float f;
        float f2;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        double d = fFloatValue;
        float f3 = 1.0f;
        if (d < 0.2d) {
            f3 = 1.0f - ((fFloatValue / 0.2f) * 0.1f);
        } else {
            if (d < 0.35d) {
                f = ((fFloatValue - 0.2f) / 0.15f) * 0.15f;
                f2 = 0.9f;
            } else if (d < 0.45d) {
                f3 = 1.05f - (((fFloatValue - 0.35f) / 0.1f) * 0.1f);
            } else if (d <= 0.55d) {
                f = ((fFloatValue - 0.45f) / 0.1f) * 0.05f;
                f2 = 0.95f;
            }
            f3 = f + f2;
        }
        textView.setScaleX(f3);
        textView.setScaleY(f3);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m180224d(TextView textView, AvatarShineView avatarShineView) {
        textView.setBackgroundResource(i3c0.f111238z0);
        xdl0.m208344M(avatarShineView, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m180225e(boolean z, TextView textView, FrameLayout frameLayout) {
        if (bvv.m104078a() || !z) {
            textView.setText("");
        }
        textView.setBackgroundResource(i3c0.f111238z0);
        xdl0.m208345M0(textView, true);
        xdl0.m208344M(frameLayout, false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m180226f(AvatarShineView avatarShineView, int i, TextView textView, String str) {
        avatarShineView.getLayoutParams().width = i;
        textView.setText(str);
        xdl0.m208344M(avatarShineView, true);
        textView.setBackground(null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m180227g(TextView textView) {
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m180228h(TextView textView) {
        if (bvv.m104079b()) {
            textView.setText("");
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m180230j(TextView textView, ValueAnimator valueAnimator) {
        textView.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        textView.requestLayout();
    }

    /* JADX INFO: renamed from: k */
    public static void m180231k(pn40 pn40Var, String str, String str2) {
        String str3;
        User userM132146l0 = pn40Var.m132146l0();
        if (userM132146l0 != null) {
            sds.C19911a c19911aM183549h = sds.m183540k().m183549h(userM132146l0.f56011id);
            if (TextUtils.isEmpty(str2)) {
                str3 = "liveRoom_topleft";
            } else {
                str3 = "liveRoom_topleft_" + str2;
            }
            sds.C19911a c19911aM183545d = c19911aM183549h.m183546e(str3).m183545d(userM132146l0.f56011id);
            BLive bLiveMo165470l = pn40Var.m170393A2().mo165470l();
            if (bLiveMo165470l != null) {
                c19911aM183545d.m183547f(bLiveMo165470l.f44323id).m183548g(bLiveMo165470l.state);
            }
            zcu.m218089d(str, c19911aM183545d.m183542a());
        }
    }

    /* JADX INFO: renamed from: l */
    public static Animator m180232l(Context context, int i, final TextView textView) {
        ValueAnimator duration = ValueAnimator.ofInt(t100.m186890d(16.0f) + uep0.m193332s(12, context.getString(R$string.f46671F4)), i).setDuration(400L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ho1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ro1.m180221a(textView, valueAnimator);
            }
        });
        bt0.m103750w(duration, new Runnable() { // from class: l.io1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m180228h(textView);
            }
        }, new Runnable() { // from class: l.jo1
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText(R$string.f46627D4);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.55f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ko1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ro1.m180222b(textView, valueAnimator);
            }
        });
        bt0.m103733f(valueAnimatorOfFloat, new Runnable() { // from class: l.lo1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m180227g(textView);
            }
        });
        valueAnimatorOfFloat.setStartDelay(400L);
        valueAnimatorOfFloat.setDuration(550L);
        return bt0.m103753z(duration, valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: m */
    public static Animator m180233m(Context context, int i, final TextView textView, final AvatarShineView avatarShineView, final FrameLayout frameLayout, final boolean z) {
        final String string = z ? context.getString(R$string.f46671F4) : context.getString(R$string.f46844N3);
        final int iM186890d = t100.m186890d(16.0f) + uep0.m193332s(12, string);
        ValueAnimator duration = ValueAnimator.ofInt(i, iM186890d).setDuration(400L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mo1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ro1.m180230j(textView, valueAnimator);
            }
        });
        bt0.m103749v(duration, new Runnable() { // from class: l.no1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m180225e(z, textView, frameLayout);
            }
        });
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1200L);
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oo1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                avatarShineView.setProcess(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        duration2.setInterpolator(new DecelerateInterpolator());
        duration2.setStartDelay(400L);
        bt0.m103750w(duration2, new Runnable() { // from class: l.po1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m180226f(avatarShineView, iM186890d, textView, string);
            }
        }, new Runnable() { // from class: l.qo1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m180224d(textView, avatarShineView);
            }
        });
        return bt0.m103753z(duration, duration2);
    }
}
