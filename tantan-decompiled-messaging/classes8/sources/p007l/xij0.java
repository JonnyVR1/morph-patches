package p007l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import androidx.annotation.WorkerThread;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.NotificationStatus;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Iterator;
import l.d30;
import l.e30;
import l.gl5;
import l.kol;
import l.r07;
import l.roj0;
import l.t100;
import l.yij0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class xij0 extends yij0 {

    /* JADX INFO: renamed from: l.xij0$b */
    public class C0778b extends bt0.C0509j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f5339a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f5340b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f5341c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ScaleAnimation f5342d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kol f5343e;

        public C0778b(boolean z, VDraweeView vDraweeView, ScaleAnimation scaleAnimation, ScaleAnimation scaleAnimation2, kol kolVar) {
            this.f5339a = z;
            this.f5340b = vDraweeView;
            this.f5341c = scaleAnimation;
            this.f5342d = scaleAnimation2;
            this.f5343e = kolVar;
        }

        @Override // p007l.bt0.C0509j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5341c.cancel();
            this.f5342d.cancel();
            this.f5343e.c();
        }

        @Override // p007l.bt0.C0509j, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (this.f5339a) {
                this.f5340b.startAnimation(this.f5341c);
            }
        }

        @Override // p007l.bt0.C0509j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f5339a) {
                this.f5340b.startAnimation(this.f5341c);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m11823W(ImageView imageView, d30 d30Var, View view) {
        bt0.m8647b(imageView, yij0.r(imageView));
        d30Var.call();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m11824X(Throwable th) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m11825Y(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z */
    public static void m11826Z(final ImageView imageView, final d30 d30Var) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.pij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xij0.m11823W(imageView, d30Var, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public static void m11827a0(Act act) {
        CoreModule.c.Y.d3("-1").subscribe(mkd0.m9875H(new e30() { // from class: l.kij0
            public final void call(Object obj) {
                xij0.m11825Y((roj0) obj);
            }
        }, new e30() { // from class: l.nij0
            public final void call(Object obj) {
                xij0.m11824X((Throwable) obj);
            }
        }));
        act.startActivity(MessagesAct.i2(act, "-1", true, false));
    }

    /* JADX INFO: renamed from: b0 */
    public static Animator m11828b0(kol kolVar, VDraweeView vDraweeView) {
        return m11829c0(kolVar, vDraweeView, true);
    }

    /* JADX INFO: renamed from: c0 */
    public static Animator m11829c0(kol kolVar, VDraweeView vDraweeView, boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.12f, 1.0f, 1.12f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.12f, 1.0f, 1.12f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(500L);
        scaleAnimation2.setInterpolator(new DecelerateInterpolator());
        scaleAnimation2.setFillAfter(false);
        scaleAnimation.setAnimationListener(new AnimationAnimationListenerC0777a(kolVar, z, vDraweeView, scaleAnimation2));
        duration.setRepeatCount(-1);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addListener(new C0778b(z, vDraweeView, scaleAnimation, scaleAnimation2, kolVar));
        return duration;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m11830d0() {
        if (ConnectivityReceiver.l() && (((Boolean) gl5.a.get()).booleanValue() || ((Boolean) gl5.c.get()).booleanValue())) {
            return true;
        }
        return ConnectivityReceiver.g() && ((Boolean) gl5.c.get()).booleanValue();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m11831e0() {
        Iterator it = CoreBusinessModule.d.o().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue == 1 || iIntValue == 0 || CoreBusinessModule.d.n(2) || r07.v(iIntValue) || r07.w(iIntValue)) {
                CoreModule.c.f0.Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), true, true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m11832f0(String str) {
        if (CoreBusinessModule.d.n(r07.r(str)) || CoreBusinessModule.d.n(r07.t(str)) || CoreBusinessModule.d.n(0) || CoreBusinessModule.d.n(2)) {
            CoreModule.c.f0.Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), str);
            CoreModule.c.f0.Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), CoreModule.H().userId());
        }
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m11833p(Bitmap bitmap, int i, int i2, int i3) {
        return m11834q(bitmap, i, i2, i3, t100.d(12.0f));
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public static Bitmap m11834q(Bitmap bitmap, int i, int i2, int i3, int i4) {
        float f = i2;
        float f2 = i;
        boolean z = (f * 1.0f) / f2 > (((float) bitmap.getHeight()) * 1.0f) / ((float) bitmap.getWidth());
        float fMax = Math.max(Math.min(Math.min(1.0f, Math.min((bitmap.getWidth() * 1.0f) / f2, (bitmap.getHeight() * 1.0f) / f)), 0.5f), (0.25f / Math.max(i4, 2)) * 2.0f);
        if (!z) {
            int i5 = (int) (fMax * f2);
            int iMax = Math.max((i5 / 4) * 4, i5);
            float f3 = (iMax * 1.0f) / f2;
            if (iMax != bitmap.getWidth()) {
                Matrix matrix = new Matrix();
                matrix.setScale(f3, f3);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            }
            fMax = f3;
        }
        Bitmap bitmapM8839a = d43.m8839a(bitmap, Math.round(Math.max(i4 * fMax, 2.0f)), true);
        if (!bitmapM8839a.isMutable()) {
            bitmapM8839a = bitmapM8839a.copy(bitmapM8839a.getConfig(), true);
        }
        new Canvas(bitmapM8839a).drawColor(i3);
        return bitmapM8839a;
    }

    /* JADX INFO: renamed from: l.xij0$a */
    public class AnimationAnimationListenerC0777a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kol f5335a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f5336b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ VDraweeView f5337c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ScaleAnimation f5338d;

        public AnimationAnimationListenerC0777a(kol kolVar, boolean z, VDraweeView vDraweeView, ScaleAnimation scaleAnimation) {
            this.f5335a = kolVar;
            this.f5336b = z;
            this.f5337c = vDraweeView;
            this.f5338d = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f5335a.a();
            if (this.f5336b) {
                this.f5337c.startAnimation(this.f5338d);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
