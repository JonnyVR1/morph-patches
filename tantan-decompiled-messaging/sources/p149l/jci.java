package p149l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class jci {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f117309a;

    /* JADX INFO: renamed from: b */
    public static boolean f117310b;

    /* JADX INFO: renamed from: c */
    public static long f117311c;

    /* JADX INFO: renamed from: d */
    public static User f117312d;

    /* JADX INFO: renamed from: e */
    public static GestureDetector f117313e;

    /* JADX INFO: renamed from: f */
    public static final Runnable f117314f = new Runnable() { // from class: l.eci
        @Override // java.lang.Runnable
        public final void run() {
            jci.m140928d();
        }
    };

    /* JADX INFO: renamed from: l.jci$a */
    public class C17746a implements n3m {
        @Override // p149l.n3m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_quickchat_successpopup";
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m140925a(View view) {
        o6j0.m162859c("e_quickchat_successpopup_reject", "p_quickchat_successpopup", new o6j0.C18854a[0]);
        Runnable runnable = f117314f;
        e51.m114745J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m140928d() {
        PopupWindow popupWindow = f117309a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f117309a = null;
        }
        f117310b = false;
        f117313e = null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m140930f(View view, User user) {
        qib0.f154691G.m102331L0((SimpleDraweeView) view.findViewById(u4c0.f174203d0), CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        C8609a.m50282x((SimpleDraweeView) view.findViewById(u4c0.f173954O), user.m60124fp().profileSmall(), 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m140936l(boolean z) {
        if (z || SystemClock.elapsedRealtime() - f117311c >= 3800) {
            Runnable runnable = f117314f;
            e51.m114745J(runnable);
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m140937m() {
        e51.m114745J(f117314f);
        Animator animatorM103744q = bt0.m103744q(f117309a.getContentView(), "translationY", 0.0f, -t100.m186890d(250.0f));
        animatorM103744q.setDuration(200L);
        animatorM103744q.setInterpolator(new AccelerateInterpolator());
        animatorM103744q.addListener(new C17748c(animatorM103744q));
        animatorM103744q.start();
    }

    /* JADX INFO: renamed from: n */
    public static void m140938n(Act act, String str, boolean z) {
        act.startActivity(MessagesAct.m48949p2(act, f117312d.f56011id, false, false, false, false, null, 7, str));
        o6j0.m162859c("e_quickchat_successpopup_trynow", "p_quickchat_successpopup", o6j0.C18854a.m162879i("is_emoji", z));
        Runnable runnable = f117314f;
        e51.m114745J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: o */
    public static GestureDetector m140939o(Act act) {
        return new GestureDetector(act, new GestureDetectorOnGestureListenerC17747b(act));
    }

    /* JADX INFO: renamed from: p */
    public static void m140940p(final Act act, final User user, final View view) {
        TextView textView = (TextView) view.findViewById(u4c0.f174573ye);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        ((TextView) view.findViewById(u4c0.f174573ye)).setText(String.format("去和%s聊天", user.isFemale() ? "她" : "他"));
        view.findViewById(u4c0.f174204d1).setOnClickListener(new View.OnClickListener() { // from class: l.fci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jci.m140938n(act, "", false);
            }
        });
        e51.m114748M(new Runnable() { // from class: l.gci
            @Override // java.lang.Runnable
            public final void run() {
                jci.m140930f(view, user);
            }
        });
        ((TextView) view.findViewById(u4c0.f173861I8)).setTypeface(typeface);
        ((TextView) view.findViewById(u4c0.f173861I8)).setText(String.format("配对成功，%s在等你聊天", user.isFemale() ? "她" : "他"));
        view.findViewById(u4c0.f173718A1).setOnClickListener(new View.OnClickListener() { // from class: l.hci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jci.m140925a(view2);
            }
        });
        e51.m114743H(act, new Runnable() { // from class: l.ici
            @Override // java.lang.Runnable
            public final void run() {
                jci.m140936l(false);
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: q */
    public static void m140941q(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", -view.getMeasuredHeight(), 0.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: r */
    public static void m140942r(Act act, User user) {
        f117312d = user;
        if (f117313e == null) {
            f117313e = m140939o(act);
        }
        abi.m95650y(true);
        if (f117309a == null) {
            f117311c = SystemClock.elapsedRealtime();
            View viewInflate = act.inflater().inflate(f6c0.f95911n8, (ViewGroup) null);
            viewInflate.measure(ffx.m121202e(), ffx.m121202e());
            m140940p(act, user, viewInflate);
            PopupWindow popupWindow = new PopupWindow(viewInflate, xdl0.m208412y0(), t100.m186890d(480.0f), false);
            f117309a = popupWindow;
            LinearLayout linearLayout = (LinearLayout) popupWindow.getContentView().findViewById(u4c0.f174036Sd);
            linearLayout.setClickable(true);
            linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l.cci
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return jci.f117313e.onTouchEvent(motionEvent);
                }
            });
            f117309a.setClippingEnabled(false);
        }
        xdl0.m208345M0(f117309a.getContentView(), true);
        final cwf0 cwf0Var = new cwf0(new C17746a());
        cwf0Var.m109039o(o6j0.m162858b(o6j0.C18854a.m162878h("otheruserID", user.f56011id), o6j0.C18854a.m162878h("time", String.valueOf(C8609a.m50227K() / 1000)), o6j0.C18854a.m162878h("tooltips_trigger_module", "null"), o6j0.C18854a.m162878h("tooltips_trigger_mode", "passive"), o6j0.C18854a.m162878h("tooltips_type_ui", "alert_self_definition_basic"), o6j0.C18854a.m162878h("tooltips_type", "alert"), o6j0.C18854a.m162878h("tooltips_trigger_page", "anywhere"), o6j0.C18854a.m162878h("tooltips_trigger_reason", "tips")));
        f117309a.showAtLocation(act.getWindow().getDecorView(), 49, 0, 0);
        m140941q(f117309a.getContentView());
        cwf0Var.m109036l();
        f117309a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.dci
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                cwf0Var.m109035k();
            }
        });
    }

    /* JADX INFO: renamed from: l.jci$b */
    public class GestureDetectorOnGestureListenerC17747b implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f117315a;

        public GestureDetectorOnGestureListenerC17747b(Act act) {
            this.f117315a = act;
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
            if (!jci.f117310b) {
                jci.f117310b = true;
                if (f2 > 0.0f) {
                    jci.m140937m();
                    return true;
                }
                if (f2 == 0.0f) {
                    jci.m140938n(this.f117315a, "", false);
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jci.f117310b) {
                return false;
            }
            jci.f117310b = true;
            jci.m140938n(this.f117315a, "", false);
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
    public class C17748c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f117316a;

        public C17748c(Animator animator) {
            this.f117316a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f117316a.removeAllListeners();
            jci.f117314f.run();
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
