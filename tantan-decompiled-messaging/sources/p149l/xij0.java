package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Iterator;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes8.dex */
public class xij0 extends yij0 {

    /* JADX INFO: renamed from: l.xij0$b */
    public class C21160b extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f193131a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f193132b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ScaleAnimation f193133c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ScaleAnimation f193134d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kol f193135e;

        public C21160b(boolean z, VDraweeView vDraweeView, ScaleAnimation scaleAnimation, ScaleAnimation scaleAnimation2, kol kolVar) {
            this.f193131a = z;
            this.f193132b = vDraweeView;
            this.f193133c = scaleAnimation;
            this.f193134d = scaleAnimation2;
            this.f193135e = kolVar;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f193133c.cancel();
            this.f193134d.cancel();
            this.f193135e.mo39114c();
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (this.f193131a) {
                this.f193132b.startAnimation(this.f193133c);
            }
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f193131a) {
                this.f193132b.startAnimation(this.f193133c);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m209654W(ImageView imageView, d30 d30Var, View view) {
        bt0.m103729b(imageView, yij0.m214962r(imageView));
        d30Var.call();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m209655X(Throwable th) {
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m209656Y(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z */
    public static void m209657Z(final ImageView imageView, final d30 d30Var) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.pij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xij0.m209654W(imageView, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public static void m209658a0(Act act) {
        CoreModule.f17545c.f19621Y.m34867d3(User.ID_TEAM_ACCOUNT).subscribe(mkd0.m154956H(new e30() { // from class: l.kij0
            @Override // p149l.e30
            public final void call(Object obj) {
                xij0.m209656Y((roj0) obj);
            }
        }, new e30() { // from class: l.nij0
            @Override // p149l.e30
            public final void call(Object obj) {
                xij0.m209655X((Throwable) obj);
            }
        }));
        act.startActivity(MessagesAct.m48943i2(act, User.ID_TEAM_ACCOUNT, true, false));
    }

    /* JADX INFO: renamed from: b0 */
    public static Animator m209659b0(kol kolVar, VDraweeView vDraweeView) {
        return m209660c0(kolVar, vDraweeView, true);
    }

    /* JADX INFO: renamed from: c0 */
    public static Animator m209660c0(kol kolVar, VDraweeView vDraweeView, boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.12f, 1.0f, 1.12f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.12f, 1.0f, 1.12f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(500L);
        scaleAnimation2.setInterpolator(new DecelerateInterpolator());
        scaleAnimation2.setFillAfter(false);
        scaleAnimation.setAnimationListener(new AnimationAnimationListenerC21159a(kolVar, z, vDraweeView, scaleAnimation2));
        duration.setRepeatCount(-1);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addListener(new C21160b(z, vDraweeView, scaleAnimation, scaleAnimation2, kolVar));
        return duration;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m209661d0() {
        if (ConnectivityReceiver.m81289l() && (gl5.f103293a.get().booleanValue() || gl5.f103295c.get().booleanValue())) {
            return true;
        }
        return ConnectivityReceiver.m81284g() && gl5.f103295c.get().booleanValue();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m209662e0() {
        Iterator<Integer> it = CoreBusinessModule.f17534d.m127660o().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 1 || iIntValue == 0 || CoreBusinessModule.f17534d.m127659n(2) || r07.m177357v(iIntValue) || r07.m177358w(iIntValue)) {
                CoreModule.f17545c.f19642f0.m32855Wp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), true, true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m209663f0(String str) {
        if (CoreBusinessModule.f17534d.m127659n(r07.m177353r(str)) || CoreBusinessModule.f17534d.m127659n(r07.m177355t(str)) || CoreBusinessModule.f17534d.m127659n(0) || CoreBusinessModule.f17534d.m127659n(2)) {
            CoreModule.f17545c.f19642f0.m32843Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), str);
            CoreModule.f17545c.f19642f0.m32843Vp(NotificationStatus.get("ongoing"), NotificationStatus.get("removed"), CoreModule.m29931H().userId());
        }
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m209664p(Bitmap bitmap, int i, int i2, int i3) {
        return m209665q(bitmap, i, i2, i3, t100.m186890d(12.0f));
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public static Bitmap m209665q(Bitmap bitmap, int i, int i2, int i3, int i4) {
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
        Bitmap bitmapM109969a = d43.m109969a(bitmap, Math.round(Math.max(i4 * fMax, 2.0f)), true);
        if (!bitmapM109969a.isMutable()) {
            bitmapM109969a = bitmapM109969a.copy(bitmapM109969a.getConfig(), true);
        }
        new Canvas(bitmapM109969a).drawColor(i3);
        return bitmapM109969a;
    }

    /* JADX INFO: renamed from: l.xij0$a */
    public class AnimationAnimationListenerC21159a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kol f193127a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f193128b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ VDraweeView f193129c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ScaleAnimation f193130d;

        public AnimationAnimationListenerC21159a(kol kolVar, boolean z, VDraweeView vDraweeView, ScaleAnimation scaleAnimation) {
            this.f193127a = kolVar;
            this.f193128b = z;
            this.f193129c = vDraweeView;
            this.f193130d = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f193127a.mo39112a();
            if (this.f193128b) {
                this.f193129c.startAnimation(this.f193130d);
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
