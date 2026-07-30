package p153l;

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
import com.p051p1.mobile.putong.core.newui.view.RadarRipple;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class lny {

    /* JADX INFO: renamed from: l.lny$b */
    public class C18420b extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f132856a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScaleAnimation f132857b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f132858c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ RadarRipple f132859d;

        public C18420b(VDraweeView vDraweeView, ScaleAnimation scaleAnimation, ScaleAnimation scaleAnimation2, RadarRipple radarRipple) {
            this.f132856a = vDraweeView;
            this.f132857b = scaleAnimation;
            this.f132858c = scaleAnimation2;
            this.f132859d = radarRipple;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f132857b.cancel();
            this.f132858c.cancel();
            this.f132859d.f27816c.clear();
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f132856a.startAnimation(this.f132857b);
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f132856a.startAnimation(this.f132857b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m155032a(@NotNull Context context) {
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
        Object systemService = context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
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
            if (bnl0.m105516I(context) + i3 > i) {
                return false;
            }
        } else if (bnl0.m105516I(context) + i4 > i2) {
            return false;
        }
        return i2 - i4 > 0 || i - i3 > 0;
    }

    /* JADX INFO: renamed from: b */
    public static Animator m155033b(RadarRipple radarRipple, VDraweeView vDraweeView) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.12f, 1.0f, 1.12f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.12f, 1.0f, 1.12f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(500L);
        scaleAnimation2.setInterpolator(new DecelerateInterpolator());
        scaleAnimation2.setFillAfter(false);
        scaleAnimation.setAnimationListener(new AnimationAnimationListenerC18419a(radarRipple, vDraweeView, scaleAnimation2));
        duration.setRepeatCount(-1);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addListener(new C18420b(vDraweeView, scaleAnimation, scaleAnimation2, radarRipple));
        return duration;
    }

    /* JADX INFO: renamed from: l.lny$a */
    public class AnimationAnimationListenerC18419a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RadarRipple f132853a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f132854b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f132855c;

        public AnimationAnimationListenerC18419a(RadarRipple radarRipple, VDraweeView vDraweeView, ScaleAnimation scaleAnimation) {
            this.f132853a = radarRipple;
            this.f132854b = vDraweeView;
            this.f132855c = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f132853a.m44929f();
            this.f132854b.startAnimation(this.f132855c);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
