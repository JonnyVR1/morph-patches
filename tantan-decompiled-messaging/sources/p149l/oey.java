package p149l;

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
import com.p046p1.mobile.putong.core.newui.view.RadarRipple;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class oey {

    /* JADX INFO: renamed from: l.oey$b */
    public class C18910b extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f143603a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScaleAnimation f143604b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f143605c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ RadarRipple f143606d;

        public C18910b(VDraweeView vDraweeView, ScaleAnimation scaleAnimation, ScaleAnimation scaleAnimation2, RadarRipple radarRipple) {
            this.f143603a = vDraweeView;
            this.f143604b = scaleAnimation;
            this.f143605c = scaleAnimation2;
            this.f143606d = radarRipple;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f143604b.cancel();
            this.f143605c.cancel();
            this.f143606d.f26968c.clear();
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f143603a.startAnimation(this.f143604b);
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f143603a.startAnimation(this.f143604b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m164038a(@NotNull Context context) {
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
            if (xdl0.m208336I(context) + i3 > i) {
                return false;
            }
        } else if (xdl0.m208336I(context) + i4 > i2) {
            return false;
        }
        return i2 - i4 > 0 || i - i3 > 0;
    }

    /* JADX INFO: renamed from: b */
    public static Animator m164039b(RadarRipple radarRipple, VDraweeView vDraweeView) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.12f, 1.0f, 1.12f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.12f, 1.0f, 1.12f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(500L);
        scaleAnimation2.setInterpolator(new DecelerateInterpolator());
        scaleAnimation2.setFillAfter(false);
        scaleAnimation.setAnimationListener(new AnimationAnimationListenerC18909a(radarRipple, vDraweeView, scaleAnimation2));
        duration.setRepeatCount(-1);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addListener(new C18910b(vDraweeView, scaleAnimation, scaleAnimation2, radarRipple));
        return duration;
    }

    /* JADX INFO: renamed from: l.oey$a */
    public class AnimationAnimationListenerC18909a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RadarRipple f143600a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f143601b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f143602c;

        public AnimationAnimationListenerC18909a(RadarRipple radarRipple, VDraweeView vDraweeView, ScaleAnimation scaleAnimation) {
            this.f143600a = radarRipple;
            this.f143601b = vDraweeView;
            this.f143602c = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f143600a.m43743f();
            this.f143601b.startAnimation(this.f143602c);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
