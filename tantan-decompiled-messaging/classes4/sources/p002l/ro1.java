package p002l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.data.DbObject;
import l.bt0;
import l.bvv;
import l.sds;
import l.t100;
import l.uep0;
import l.xdl0;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ro1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22082a(TextView textView, ValueAnimator valueAnimator) {
        textView.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        textView.requestLayout();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m22083b(TextView textView, ValueAnimator valueAnimator) {
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
    public static /* synthetic */ void m22085d(TextView textView, AvatarShineView avatarShineView) {
        textView.setBackgroundResource(i3c0.f13023z0);
        xdl0.M(avatarShineView, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m22086e(boolean z, TextView textView, FrameLayout frameLayout) {
        if (bvv.a() || !z) {
            textView.setText("");
        }
        textView.setBackgroundResource(i3c0.f13023z0);
        xdl0.M0(textView, true);
        xdl0.M(frameLayout, false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m22087f(AvatarShineView avatarShineView, int i, TextView textView, String str) {
        avatarShineView.getLayoutParams().width = i;
        textView.setText(str);
        xdl0.M(avatarShineView, true);
        textView.setBackground(null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m22088g(TextView textView) {
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m22089h(TextView textView) {
        if (bvv.b()) {
            textView.setText("");
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m22091j(TextView textView, ValueAnimator valueAnimator) {
        textView.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        textView.requestLayout();
    }

    /* JADX INFO: renamed from: k */
    public static void m22092k(pn40 pn40Var, String str, String str2) {
        String str3;
        User userM14582l0 = pn40Var.m14582l0();
        if (userM14582l0 != null) {
            sds.a aVarH = sds.k().h(((DbObject) userM14582l0).id);
            if (TextUtils.isEmpty(str2)) {
                str3 = "liveRoom_topleft";
            } else {
                str3 = "liveRoom_topleft_" + str2;
            }
            sds.a aVarD = aVarH.e(str3).d(((DbObject) userM14582l0).id);
            BLive bLiveMo19690l = pn40Var.m20501A2().mo19690l();
            if (bLiveMo19690l != null) {
                aVarD.f(((BLiveAbsData) bLiveMo19690l).id).g(((BLiveAbsData) bLiveMo19690l).state);
            }
            zcu.d(str, aVarD.a());
        }
    }

    /* JADX INFO: renamed from: l */
    public static Animator m22093l(Context context, int i, final TextView textView) {
        ValueAnimator duration = ValueAnimator.ofInt(t100.d(16.0f) + uep0.s(12, context.getString(R$string.f2713F4)), i).setDuration(400L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ho1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ro1.m22082a(textView, valueAnimator);
            }
        });
        bt0.w(duration, new Runnable() { // from class: l.io1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m22089h(textView);
            }
        }, new Runnable() { // from class: l.jo1
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText(R$string.f2669D4);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.55f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ko1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ro1.m22083b(textView, valueAnimator);
            }
        });
        bt0.f(valueAnimatorOfFloat, new Runnable() { // from class: l.lo1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m22088g(textView);
            }
        });
        valueAnimatorOfFloat.setStartDelay(400L);
        valueAnimatorOfFloat.setDuration(550L);
        return bt0.z(new Animator[]{duration, valueAnimatorOfFloat});
    }

    /* JADX INFO: renamed from: m */
    public static Animator m22094m(Context context, int i, final TextView textView, final AvatarShineView avatarShineView, final FrameLayout frameLayout, final boolean z) {
        final String string = z ? context.getString(R$string.f2713F4) : context.getString(R$string.f2886N3);
        final int iD = t100.d(16.0f) + uep0.s(12, string);
        ValueAnimator duration = ValueAnimator.ofInt(i, iD).setDuration(400L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mo1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ro1.m22091j(textView, valueAnimator);
            }
        });
        bt0.v(duration, new Runnable() { // from class: l.no1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m22086e(z, textView, frameLayout);
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
        bt0.w(duration2, new Runnable() { // from class: l.po1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m22087f(avatarShineView, iD, textView, string);
            }
        }, new Runnable() { // from class: l.qo1
            @Override // java.lang.Runnable
            public final void run() {
                ro1.m22085d(textView, avatarShineView);
            }
        });
        return bt0.z(new Animator[]{duration, duration2});
    }
}
