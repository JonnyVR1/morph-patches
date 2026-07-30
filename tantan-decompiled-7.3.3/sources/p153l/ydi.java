package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public class ydi {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f198599a;

    /* JADX INFO: renamed from: b */
    public static boolean f198600b;

    /* JADX INFO: renamed from: c */
    public static long f198601c;

    /* JADX INFO: renamed from: d */
    public static User f198602d;

    /* JADX INFO: renamed from: e */
    public static GestureDetector f198603e;

    /* JADX INFO: renamed from: f */
    public static final Runnable f198604f = new Runnable() { // from class: l.tdi
        @Override // java.lang.Runnable
        public final void run() {
            ydi.m215221d();
        }
    };

    /* JADX INFO: renamed from: l.ydi$a */
    public class C21560a implements e6m {
        @Override // p153l.e6m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_quickchat_successpopup";
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m215218a(View view) {
        sfj0.m185596c("e_quickchat_successpopup_reject", "p_quickchat_successpopup", new sfj0.C20032a[0]);
        Runnable runnable = f198604f;
        l51.m152890J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m215221d() {
        PopupWindow popupWindow = f198599a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f198599a = null;
        }
        f198600b = false;
        f198603e = null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m215223f(View view, User user) {
        uqb0.f180374G.m127115L0((SimpleDraweeView) view.findViewById(adc0.f70294d0), CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        C8772a.m51465x((SimpleDraweeView) view.findViewById(adc0.f70042O), user.m61308fp().profileSmall(), 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m215229l(boolean z) {
        if (z || SystemClock.elapsedRealtime() - f198601c >= 3800) {
            Runnable runnable = f198604f;
            l51.m152890J(runnable);
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m215230m() {
        l51.m152890J(f198604f);
        Animator animatorM132171q = gt0.m132171q(f198599a.getContentView(), "translationY", 0.0f, -qa00.m175859d(250.0f));
        animatorM132171q.setDuration(200L);
        animatorM132171q.setInterpolator(new AccelerateInterpolator());
        animatorM132171q.addListener(new C21562c(animatorM132171q));
        animatorM132171q.start();
    }

    /* JADX INFO: renamed from: n */
    public static void m215231n(Act act, String str, boolean z) {
        act.startActivity(MessagesAct.m50132q2(act, f198602d.f56859id, false, false, false, false, null, 7, str));
        sfj0.m185596c("e_quickchat_successpopup_trynow", "p_quickchat_successpopup", sfj0.C20032a.m185616i("is_emoji", z));
        Runnable runnable = f198604f;
        l51.m152890J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: o */
    public static GestureDetector m215232o(Act act) {
        return new GestureDetector(act, new GestureDetectorOnGestureListenerC21561b(act));
    }

    /* JADX INFO: renamed from: p */
    public static void m215233p(final Act act, final User user, final View view) {
        TextView textView = (TextView) view.findViewById(adc0.f69836Be);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        ((TextView) view.findViewById(adc0.f69836Be)).setText(String.format("去和%s聊天", user.isFemale() ? "她" : "他"));
        view.findViewById(adc0.f70295d1).setOnClickListener(new View.OnClickListener() { // from class: l.udi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ydi.m215231n(act, "", false);
            }
        });
        l51.m152893M(new Runnable() { // from class: l.vdi
            @Override // java.lang.Runnable
            public final void run() {
                ydi.m215223f(view, user);
            }
        });
        ((TextView) view.findViewById(adc0.f69983K8)).setTypeface(typeface);
        ((TextView) view.findViewById(adc0.f69983K8)).setText(String.format("配对成功，%s在等你聊天", user.isFemale() ? "她" : "他"));
        view.findViewById(adc0.f69806A1).setOnClickListener(new View.OnClickListener() { // from class: l.wdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ydi.m215218a(view2);
            }
        });
        l51.m152888H(act, new Runnable() { // from class: l.xdi
            @Override // java.lang.Runnable
            public final void run() {
                ydi.m215229l(false);
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: q */
    public static void m215234q(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", -view.getMeasuredHeight(), 0.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: r */
    public static void m215235r(Act act, User user) {
        f198602d = user;
        if (f198603e == null) {
            f198603e = m215232o(act);
        }
        pci.m171689y(true);
        if (f198599a == null) {
            f198601c = SystemClock.elapsedRealtime();
            View viewInflate = act.inflater().inflate(kec0.f126084u8, (ViewGroup) null);
            viewInflate.measure(dox.m117367e(), dox.m117367e());
            m215233p(act, user, viewInflate);
            PopupWindow popupWindow = new PopupWindow(viewInflate, bnl0.m105592y0(), qa00.m175859d(480.0f), false);
            f198599a = popupWindow;
            LinearLayout linearLayout = (LinearLayout) popupWindow.getContentView().findViewById(adc0.f70175Vd);
            linearLayout.setClickable(true);
            linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l.rdi
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ydi.f198603e.onTouchEvent(motionEvent);
                }
            });
            f198599a.setClippingEnabled(false);
        }
        bnl0.m105525M0(f198599a.getContentView(), true);
        final l4g0 l4g0Var = new l4g0(new C21560a());
        l4g0Var.m152780o(sfj0.m185595b(sfj0.C20032a.m185615h("otheruserID", user.f56859id), sfj0.C20032a.m185615h("time", String.valueOf(C8772a.m51410K() / 1000)), sfj0.C20032a.m185615h("tooltips_trigger_module", "null"), sfj0.C20032a.m185615h("tooltips_trigger_mode", "passive"), sfj0.C20032a.m185615h("tooltips_type_ui", "alert_self_definition_basic"), sfj0.C20032a.m185615h("tooltips_type", "alert"), sfj0.C20032a.m185615h("tooltips_trigger_page", "anywhere"), sfj0.C20032a.m185615h("tooltips_trigger_reason", "tips")));
        f198599a.showAtLocation(act.getWindow().getDecorView(), 49, 0, 0);
        m215234q(f198599a.getContentView());
        l4g0Var.m152777l();
        f198599a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.sdi
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                l4g0Var.m152776k();
            }
        });
    }

    /* JADX INFO: renamed from: l.ydi$b */
    public class GestureDetectorOnGestureListenerC21561b implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f198605a;

        public GestureDetectorOnGestureListenerC21561b(Act act) {
            this.f198605a = act;
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
            if (!ydi.f198600b) {
                ydi.f198600b = true;
                if (f2 > 0.0f) {
                    ydi.m215230m();
                    return true;
                }
                if (f2 == 0.0f) {
                    ydi.m215231n(this.f198605a, "", false);
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (ydi.f198600b) {
                return false;
            }
            ydi.f198600b = true;
            ydi.m215231n(this.f198605a, "", false);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: renamed from: l.ydi$c */
    public class C21562c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f198606a;

        public C21562c(Animator animator) {
            this.f198606a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f198606a.removeAllListeners();
            ydi.f198604f.run();
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
