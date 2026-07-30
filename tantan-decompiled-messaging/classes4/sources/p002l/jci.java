package p002l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.C0034a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.abi;
import l.bt0;
import l.cwf0;
import l.e51;
import l.f6c0;
import l.ffx;
import l.n3m;
import l.o6j0;
import l.qib0;
import l.t100;
import l.u4c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jci {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f13686a;

    /* JADX INFO: renamed from: b */
    public static boolean f13687b;

    /* JADX INFO: renamed from: c */
    public static long f13688c;

    /* JADX INFO: renamed from: d */
    public static User f13689d;

    /* JADX INFO: renamed from: e */
    public static GestureDetector f13690e;

    /* JADX INFO: renamed from: f */
    public static final Runnable f13691f = new Runnable() { // from class: l.eci
        @Override // java.lang.Runnable
        public final void run() {
            jci.m15856d();
        }
    };

    /* JADX INFO: renamed from: l.jci$a */
    public class C0629a implements n3m {
        public boolean disableAutoPV() {
            return false;
        }

        public String pageId() {
            return "p_quickchat_successpopup";
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15853a(View view) {
        o6j0.c("e_quickchat_successpopup_reject", "p_quickchat_successpopup", new o6j0.a[0]);
        Runnable runnable = f13691f;
        e51.J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15856d() {
        PopupWindow popupWindow = f13686a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f13686a = null;
        }
        f13687b = false;
        f13690e = null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15858f(View view, User user) {
        qib0.G.L0(view.findViewById(u4c0.d0), CoreModule.c.e0.p9().fp().profileSmall().formatted());
        C0034a.m713x(view.findViewById(u4c0.O), user.fp().profileSmall(), 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m15864l(boolean z) {
        if (z || SystemClock.elapsedRealtime() - f13688c >= 3800) {
            Runnable runnable = f13691f;
            e51.J(runnable);
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m15865m() {
        e51.J(f13691f);
        Animator animatorQ = bt0.q(f13686a.getContentView(), "translationY", new float[]{0.0f, -t100.d(250.0f)});
        animatorQ.setDuration(200L);
        animatorQ.setInterpolator(new AccelerateInterpolator());
        animatorQ.addListener(new C0631c(animatorQ));
        animatorQ.start();
    }

    /* JADX INFO: renamed from: n */
    public static void m15866n(Act act, String str, boolean z) {
        act.startActivity(MessagesAct.p2(act, ((DbObject) f13689d).id, false, false, false, false, (Intent) null, 7, str));
        o6j0.c("e_quickchat_successpopup_trynow", "p_quickchat_successpopup", new o6j0.a[]{o6j0.a.i("is_emoji", z)});
        Runnable runnable = f13691f;
        e51.J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: o */
    public static GestureDetector m15867o(Act act) {
        return new GestureDetector((Context) act, (GestureDetector.OnGestureListener) new GestureDetectorOnGestureListenerC0630b(act));
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: p */
    public static void m15868p(final Act act, final User user, final View view) {
        TextView textView = (TextView) view.findViewById(u4c0.ye);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        ((TextView) view.findViewById(u4c0.ye)).setText(String.format("去和%s聊天", user.isFemale() ? "她" : "他"));
        view.findViewById(u4c0.d1).setOnClickListener(new View.OnClickListener() { // from class: l.fci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jci.m15866n(act, "", false);
            }
        });
        e51.M(new Runnable() { // from class: l.gci
            @Override // java.lang.Runnable
            public final void run() {
                jci.m15858f(view, user);
            }
        });
        ((TextView) view.findViewById(u4c0.I8)).setTypeface(typeface);
        ((TextView) view.findViewById(u4c0.I8)).setText(String.format("配对成功，%s在等你聊天", user.isFemale() ? "她" : "他"));
        view.findViewById(u4c0.A1).setOnClickListener(new View.OnClickListener() { // from class: l.hci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jci.m15853a(view2);
            }
        });
        e51.H(act, new Runnable() { // from class: l.ici
            @Override // java.lang.Runnable
            public final void run() {
                jci.m15864l(false);
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: q */
    public static void m15869q(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", -view.getMeasuredHeight(), 0.0f));
        animatorSet.start();
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: r */
    public static void m15870r(Act act, User user) {
        f13689d = user;
        if (f13690e == null) {
            f13690e = m15867o(act);
        }
        abi.y(true);
        if (f13686a == null) {
            f13688c = SystemClock.elapsedRealtime();
            View viewInflate = act.inflater().inflate(f6c0.n8, (ViewGroup) null);
            viewInflate.measure(ffx.e(), ffx.e());
            m15868p(act, user, viewInflate);
            viewInflate.findViewById(u4c0.d1);
            PopupWindow popupWindow = new PopupWindow(viewInflate, xdl0.y0(), t100.d(480.0f), false);
            f13686a = popupWindow;
            LinearLayout linearLayout = (LinearLayout) popupWindow.getContentView().findViewById(u4c0.Sd);
            linearLayout.setClickable(true);
            linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l.cci
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return jci.f13690e.onTouchEvent(motionEvent);
                }
            });
            f13686a.setClippingEnabled(false);
        }
        xdl0.M0(f13686a.getContentView(), true);
        final cwf0 cwf0Var = new cwf0(new C0629a());
        cwf0Var.o(o6j0.b(new o6j0.a[]{o6j0.a.h("otheruserID", ((DbObject) user).id), o6j0.a.h("time", String.valueOf(C0034a.m658K() / 1000)), o6j0.a.h("tooltips_trigger_module", "null"), o6j0.a.h("tooltips_trigger_mode", "passive"), o6j0.a.h("tooltips_type_ui", "alert_self_definition_basic"), o6j0.a.h("tooltips_type", "alert"), o6j0.a.h("tooltips_trigger_page", "anywhere"), o6j0.a.h("tooltips_trigger_reason", "tips")}));
        f13686a.showAtLocation(act.getWindow().getDecorView(), 49, 0, 0);
        m15869q(f13686a.getContentView());
        cwf0Var.l();
        f13686a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.dci
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                cwf0Var.k();
            }
        });
    }

    /* JADX INFO: renamed from: l.jci$b */
    public class GestureDetectorOnGestureListenerC0630b implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f13692a;

        public GestureDetectorOnGestureListenerC0630b(Act act) {
            this.f13692a = act;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!jci.f13687b) {
                jci.f13687b = true;
                if (f2 > 0.0f) {
                    jci.m15865m();
                    return true;
                }
                if (f2 == 0.0f) {
                    jci.m15866n(this.f13692a, "", false);
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jci.f13687b) {
                return false;
            }
            jci.f13687b = true;
            jci.m15866n(this.f13692a, "", false);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: renamed from: l.jci$c */
    public class C0631c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f13693a;

        public C0631c(Animator animator) {
            this.f13693a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13693a.removeAllListeners();
            jci.f13691f.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
