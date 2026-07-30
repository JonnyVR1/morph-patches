package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Iterator;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes6.dex */
public class asj0 extends bsj0 {

    /* JADX INFO: renamed from: l.asj0$b */
    public class C15822b extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f73136a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f73137b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f73138c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ScaleAnimation f73139d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vql f73140e;

        public C15822b(boolean z, VDraweeView vDraweeView, ScaleAnimation scaleAnimation, ScaleAnimation scaleAnimation2, vql vqlVar) {
            this.f73136a = z;
            this.f73137b = vDraweeView;
            this.f73138c = scaleAnimation;
            this.f73139d = scaleAnimation2;
            this.f73140e = vqlVar;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f73138c.cancel();
            this.f73139d.cancel();
            this.f73140e.mo40117c();
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (this.f73136a) {
                this.f73137b.startAnimation(this.f73138c);
            }
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f73136a) {
                this.f73137b.startAnimation(this.f73138c);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m99928W(ImageView imageView, x20 x20Var, View view) {
        gt0.m132156b(imageView, bsj0.m106282r(imageView));
        x20Var.call();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m99929X(Throwable th) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m99930Y(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: Z */
    public static void m99931Z(final ImageView imageView, final x20 x20Var) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.srj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                asj0.m99928W(imageView, x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public static void m99932a0(Act act) {
        CoreModule.f18264c.f20363Y.m35870d3(User.ID_TEAM_ACCOUNT).subscribe(psd0.m173597H(new y20() { // from class: l.nrj0
            @Override // p153l.y20
            public final void call(Object obj) {
                asj0.m99930Y((uxj0) obj);
            }
        }, new y20() { // from class: l.qrj0
            @Override // p153l.y20
            public final void call(Object obj) {
                asj0.m99929X((Throwable) obj);
            }
        }));
        act.startActivity(MessagesAct.m50126k2(act, User.ID_TEAM_ACCOUNT, true, false));
    }

    /* JADX INFO: renamed from: b0 */
    public static Animator m99933b0(vql vqlVar, VDraweeView vDraweeView) {
        return m99934c0(vqlVar, vDraweeView, true);
    }

    /* JADX INFO: renamed from: c0 */
    public static Animator m99934c0(vql vqlVar, VDraweeView vDraweeView, boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.12f, 1.0f, 1.12f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.12f, 1.0f, 1.12f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(500L);
        scaleAnimation2.setInterpolator(new DecelerateInterpolator());
        scaleAnimation2.setFillAfter(false);
        scaleAnimation.setAnimationListener(new AnimationAnimationListenerC15821a(vqlVar, z, vDraweeView, scaleAnimation2));
        duration.setRepeatCount(-1);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addListener(new C15822b(z, vDraweeView, scaleAnimation, scaleAnimation2, vqlVar));
        return duration;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m99935d0() {
        if (ConnectivityReceiver.m82472l() && (jm5.f121638a.get().booleanValue() || jm5.f121640c.get().booleanValue())) {
            return true;
        }
        return ConnectivityReceiver.m82467g() && jm5.f121640c.get().booleanValue();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m99936e0() {
        Iterator<Integer> it = CoreBusinessModule.f18253d.m207541o().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 1 || iIntValue == 0 || CoreBusinessModule.f18253d.m207540n(2) || u17.m193926v(iIntValue) || u17.m193927w(iIntValue)) {
                CoreModule.f18264c.f20384f0.m33858Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), true, true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m99937f0(String str) {
        if (CoreBusinessModule.f18253d.m207540n(u17.m193922r(str)) || CoreBusinessModule.f18253d.m207540n(u17.m193924t(str)) || CoreBusinessModule.f18253d.m207540n(0) || CoreBusinessModule.f18253d.m207540n(2)) {
            CoreModule.f18264c.f20384f0.m33846Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), str);
            CoreModule.f18264c.f20384f0.m33846Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), CoreModule.m30929H().userId());
        }
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m99938p(Bitmap bitmap, int i, int i2, int i3) {
        return m99939q(bitmap, i, i2, i3, qa00.m175859d(12.0f));
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public static Bitmap m99939q(Bitmap bitmap, int i, int i2, int i3, int i4) {
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
        Bitmap bitmapM189143a = t43.m189143a(bitmap, Math.round(Math.max(i4 * fMax, 2.0f)), true);
        if (!bitmapM189143a.isMutable()) {
            bitmapM189143a = bitmapM189143a.copy(bitmapM189143a.getConfig(), true);
        }
        new Canvas(bitmapM189143a).drawColor(i3);
        return bitmapM189143a;
    }

    /* JADX INFO: renamed from: l.asj0$a */
    public class AnimationAnimationListenerC15821a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vql f73132a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f73133b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ VDraweeView f73134c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ScaleAnimation f73135d;

        public AnimationAnimationListenerC15821a(vql vqlVar, boolean z, VDraweeView vDraweeView, ScaleAnimation scaleAnimation) {
            this.f73132a = vqlVar;
            this.f73133b = z;
            this.f73134c = vDraweeView;
            this.f73135d = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f73132a.mo40115a();
            if (this.f73133b) {
                this.f73134c.startAnimation(this.f73135d);
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
