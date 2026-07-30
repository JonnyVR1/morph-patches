package p003l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import com.p1.mobile.putong.core.newui.view.RadarRipple;
import l.bt0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oey {

    /* JADX INFO: renamed from: l.oey$b */
    public class C3394b extends bt0.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f6656a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScaleAnimation f6657b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f6658c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ RadarRipple f6659d;

        public C3394b(VDraweeView vDraweeView, ScaleAnimation scaleAnimation, ScaleAnimation scaleAnimation2, RadarRipple radarRipple) {
            this.f6656a = vDraweeView;
            this.f6657b = scaleAnimation;
            this.f6658c = scaleAnimation2;
            this.f6659d = radarRipple;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6657b.cancel();
            this.f6658c.cancel();
            this.f6659d.c.clear();
        }

        public void onAnimationRepeat(Animator animator) {
            this.f6656a.startAnimation(this.f6657b);
        }

        public void onAnimationStart(Animator animator) {
            this.f6656a.startAnimation(this.f6657b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8450a(@NotNull Context context) {
        String str;
        String str2 = Build.BRAND;
        if (str2.equalsIgnoreCase("HUAWEI")) {
            str = "navigationbar_is_min";
        } else {
            str = str2.equalsIgnoreCase("XIAOMI") ? "force_fsg_nav_bar" : null;
        }
        if (!TextUtils.isEmpty(str)) {
            return Settings.Global.getInt(context.getContentResolver(), str, 0) != 1;
        }
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            return false;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i3 = displayMetrics2.heightPixels;
        int i4 = displayMetrics2.widthPixels;
        if (i3 > i4) {
            if (xdl0.I(context) + i3 > i) {
                return false;
            }
        } else if (xdl0.I(context) + i4 > i2) {
            return false;
        }
        return i2 - i4 > 0 || i - i3 > 0;
    }

    /* JADX INFO: renamed from: b */
    public static Animator m8451b(RadarRipple radarRipple, VDraweeView vDraweeView) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.12f, 1.0f, 1.12f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.12f, 1.0f, 1.12f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(500L);
        scaleAnimation2.setInterpolator(new DecelerateInterpolator());
        scaleAnimation2.setFillAfter(false);
        scaleAnimation.setAnimationListener(new AnimationAnimationListenerC3393a(radarRipple, vDraweeView, scaleAnimation2));
        duration.setRepeatCount(-1);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addListener(new C3394b(vDraweeView, scaleAnimation, scaleAnimation2, radarRipple));
        return duration;
    }

    /* JADX INFO: renamed from: l.oey$a */
    public class AnimationAnimationListenerC3393a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RadarRipple f6653a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f6654b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f6655c;

        public AnimationAnimationListenerC3393a(RadarRipple radarRipple, VDraweeView vDraweeView, ScaleAnimation scaleAnimation) {
            this.f6653a = radarRipple;
            this.f6654b = vDraweeView;
            this.f6655c = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f6653a.f();
            this.f6654b.startAnimation(this.f6655c);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
