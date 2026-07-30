package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;

/* JADX INFO: loaded from: classes4.dex */
public class yo1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m216964a(TextView textView, ValueAnimator valueAnimator) {
        textView.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        textView.requestLayout();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m216965b(TextView textView, ValueAnimator valueAnimator) {
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
    public static /* synthetic */ void m216967d(TextView textView, AvatarShineView avatarShineView) {
        textView.setBackgroundResource(obc0.f146566z0);
        bnl0.m105524M(avatarShineView, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m216968e(boolean z, TextView textView, FrameLayout frameLayout) {
        if (cxv.m113069a() || !z) {
            textView.setText("");
        }
        textView.setBackgroundResource(obc0.f146566z0);
        bnl0.m105525M0(textView, true);
        bnl0.m105524M(frameLayout, false);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m216969f(AvatarShineView avatarShineView, int i, TextView textView, String str) {
        avatarShineView.getLayoutParams().width = i;
        textView.setText(str);
        bnl0.m105524M(avatarShineView, true);
        textView.setBackground(null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m216970g(TextView textView) {
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m216971h(TextView textView) {
        if (cxv.m113070b()) {
            textView.setText("");
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m216973j(TextView textView, ValueAnimator valueAnimator) {
        textView.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        textView.requestLayout();
    }

    /* JADX INFO: renamed from: k */
    public static void m216974k(dw40 dw40Var, String str, String str2) {
        String str3;
        User userM168532l0 = dw40Var.m168532l0();
        if (userM168532l0 != null) {
            tfs.C20303a c20303aM190978h = tfs.m190969k().m190978h(userM168532l0.f56859id);
            if (TextUtils.isEmpty(str2)) {
                str3 = "liveRoom_topleft";
            } else {
                str3 = "liveRoom_topleft_" + str2;
            }
            tfs.C20303a c20303aM190974d = c20303aM190978h.m190975e(str3).m190974d(userM168532l0.f56859id);
            BLive bLiveMo122892l = dw40Var.m118363A2().mo122892l();
            if (bLiveMo122892l != null) {
                c20303aM190974d.m190976f(bLiveMo122892l.f45171id).m190977g(bLiveMo122892l.state);
            }
            afu.m97555d(str, c20303aM190974d.m190971a());
        }
    }

    /* JADX INFO: renamed from: l */
    public static Animator m216975l(Context context, int i, final TextView textView) {
        ValueAnimator duration = ValueAnimator.ofInt(qa00.m175859d(16.0f) + ynp0.m216942s(12, context.getString(R$string.f47519F4)), i).setDuration(400L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oo1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                yo1.m216964a(textView, valueAnimator);
            }
        });
        gt0.m132177w(duration, new Runnable() { // from class: l.po1
            @Override // java.lang.Runnable
            public final void run() {
                yo1.m216971h(textView);
            }
        }, new Runnable() { // from class: l.qo1
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText(R$string.f47475D4);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.55f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ro1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                yo1.m216965b(textView, valueAnimator);
            }
        });
        gt0.m132160f(valueAnimatorOfFloat, new Runnable() { // from class: l.so1
            @Override // java.lang.Runnable
            public final void run() {
                yo1.m216970g(textView);
            }
        });
        valueAnimatorOfFloat.setStartDelay(400L);
        valueAnimatorOfFloat.setDuration(550L);
        return gt0.m132180z(duration, valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: m */
    public static Animator m216976m(Context context, int i, final TextView textView, final AvatarShineView avatarShineView, final FrameLayout frameLayout, final boolean z) {
        final String string = z ? context.getString(R$string.f47519F4) : context.getString(R$string.f47692N3);
        final int iM175859d = qa00.m175859d(16.0f) + ynp0.m216942s(12, string);
        ValueAnimator duration = ValueAnimator.ofInt(i, iM175859d).setDuration(400L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.to1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                yo1.m216973j(textView, valueAnimator);
            }
        });
        gt0.m132176v(duration, new Runnable() { // from class: l.uo1
            @Override // java.lang.Runnable
            public final void run() {
                yo1.m216968e(z, textView, frameLayout);
            }
        });
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1200L);
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vo1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                avatarShineView.setProcess(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        duration2.setInterpolator(new DecelerateInterpolator());
        duration2.setStartDelay(400L);
        gt0.m132177w(duration2, new Runnable() { // from class: l.wo1
            @Override // java.lang.Runnable
            public final void run() {
                yo1.m216969f(avatarShineView, iM175859d, textView, string);
            }
        }, new Runnable() { // from class: l.xo1
            @Override // java.lang.Runnable
            public final void run() {
                yo1.m216967d(textView, avatarShineView);
            }
        });
        return gt0.m132180z(duration, duration2);
    }
}
