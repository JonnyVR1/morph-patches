package p006l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreAudioMatch;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.DropDownAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l.aie0;
import l.bt0;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.f0m;
import l.fdb0;
import l.ffx;
import l.i0g0;
import l.jo0;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.t100;
import l.w9j;
import l.xdl0;
import l.zvf0;
import rx.c;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lrb0 extends aie0 {

    /* JADX INFO: renamed from: i */
    public Act f16587i;

    /* JADX INFO: renamed from: j */
    public PopupWindow f16588j;

    /* JADX INFO: renamed from: k */
    public boolean f16589k;

    /* JADX INFO: renamed from: l */
    public OnlineMatchPushUser f16590l;

    /* JADX INFO: renamed from: n */
    public String f16592n;

    /* JADX INFO: renamed from: o */
    public GestureDetector f16593o;

    /* JADX INFO: renamed from: p */
    public c4g0 f16594p;

    /* JADX INFO: renamed from: q */
    public c4g0 f16595q;

    /* JADX INFO: renamed from: r */
    public boolean f16596r;

    /* JADX INFO: renamed from: s */
    public d30 f16597s;

    /* JADX INFO: renamed from: m */
    public Runnable f16591m = null;

    /* JADX INFO: renamed from: t */
    public Runnable f16598t = new Runnable() { // from class: l.uqb0
        @Override // java.lang.Runnable
        public final void run() {
            this.f23707a.m18995j0();
        }
    };

    /* JADX INFO: renamed from: l.lrb0$c */
    public static /* synthetic */ class C0988c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16602a;

        static {
            int[] iArr = new int[TabName.values().length];
            f16602a = iArr;
            try {
                iArr[TabName.Msg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16602a[TabName.Moment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16602a[TabName.Me.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lrb0(Act act, boolean z, @Nullable OnlineMatchPushUser onlineMatchPushUser, d30 d30Var) {
        this.f16587i = act;
        this.f16589k = z;
        this.f16590l = onlineMatchPushUser;
        this.f16597s = d30Var;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m18968L(View view) {
        qib0.f19782G.m12744L0((SimpleDraweeView) view.findViewById(u4c0.f22900a0), CoreModule.f1534c.f3628e0.m21483na().fp().profileSmall().formatted());
        qib0.f19782G.m12767Y0((SimpleDraweeView) view.findViewById(u4c0.f22934c0), CoreModule.f1534c.f3628e0.m21483na().isFemale() ? x2c0.f27051r8 : x2c0.f27019q8);
    }

    /* JADX INFO: renamed from: A */
    public int m18981A() {
        m18985b0();
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: Y */
    public void m18982Y() {
        e51.J(this.f16598t);
        this.f16598t.run();
    }

    /* JADX INFO: renamed from: Z */
    public final void m18983Z() {
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(sqb0.m24051i0()));
        map.put("quickchat_action", "reject");
        if (this.f16589k) {
            map.put("other_user_id", this.f16590l.userId);
        }
        zvf0.s(this.f16589k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f16592n, map);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m18984a0() {
        Animator animatorQ = bt0.q(this.f16588j.getContentView(), "translationY", new float[]{0.0f, -t100.d(250.0f)});
        animatorQ.setDuration(200L);
        animatorQ.setInterpolator(new AccelerateInterpolator());
        animatorQ.addListener(new C0987b(animatorQ));
        animatorQ.start();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m18985b0() {
        View viewInflate;
        if (this.f16593o == null) {
            this.f16593o = m18987d0(this.f16587i);
        }
        if (this.f16588j == null) {
            boolean z = this.f16589k;
            Act act = this.f16587i;
            if (z) {
                viewInflate = act.inflater().inflate(f6c0.f12210gb, (ViewGroup) null);
                m19007r0(this.f16587i, this.f16590l.user, viewInflate);
            } else {
                viewInflate = act.inflater().inflate(f6c0.f12227hb, (ViewGroup) null);
                m19008s0(this.f16587i, viewInflate);
            }
            qib0.f19782G.m12744L0((SimpleDraweeView) viewInflate.findViewById(u4c0.f23137o0), "https://auto.tancdn.com/v1/images/eyJpZCI6IlFZMlVFTU02WE1PVFpYM0RLVkhLTldOVjZISkRCNzEyIiwidyI6NzE4LCJoIjo0MzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTg3ODQ2NzM1MjE4MTE0NjI5fQ.png");
            viewInflate.measure(ffx.e(), ffx.e());
            PopupWindow popupWindow = new PopupWindow(viewInflate, xdl0.y0(), viewInflate.getMeasuredHeight() + xdl0.F0(), false);
            this.f16588j = popupWindow;
            popupWindow.setClippingEnabled(false);
            this.f16588j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.crb0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f9801a.m18990f0();
                }
            });
        }
        this.f16591m = new Runnable() { // from class: l.drb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10539a.m18992h0();
            }
        };
        this.f16587i.getWindow().getDecorView().post(this.f16591m);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m18986c0(final Act act) {
        if (this.f16589k) {
            act.duringCreated(CoreModule.f1534c.f3662p1.m1978p3(this.f16590l.tracker, CoreAudioMatch.m1977o3(sqb0.m24051i0() <= 0))).subscribe(mkd0.H(new e30() { // from class: l.arb0
                public final void call(Object obj) {
                    this.f8455a.m18993i0(act, (roj0) obj);
                }
            }, new e30() { // from class: l.brb0
                public final void call(Object obj) {
                    osi0.b("对方用户正在通话中，可以去发起语音闪聊哦");
                }
            }));
        } else {
            act.startActivity(DropDownAct.m7782a2(act, "voice_quick_chat", "audio_quick_chat_guide"));
        }
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(sqb0.m24051i0()));
        map.put("quickchat_action", "accept");
        if (this.f16589k) {
            map.put("other_user_id", this.f16590l.userId);
        }
        zvf0.s(this.f16589k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f16592n, map);
        m18982Y();
    }

    /* JADX INFO: renamed from: d0 */
    public final GestureDetector m18987d0(Act act) {
        return new GestureDetector((Context) act, (GestureDetector.OnGestureListener) new GestureDetectorOnGestureListenerC0986a());
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m18988e0() {
        return this.f16589k;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m18990f0() {
        if (NullChecker.a(((fdb0) this).b)) {
            ((fdb0) this).b.call();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m18991g0(View view, MotionEvent motionEvent) {
        return this.f16593o.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m18992h0() {
        try {
            PopupWindow popupWindow = this.f16588j;
            if (popupWindow == null) {
                return;
            }
            xdl0.M0(popupWindow.getContentView(), true);
            this.f16588j.showAtLocation(this.f16587i.getWindow().getDecorView(), 49, 0, 0);
            m19009t0(this.f16588j.getContentView());
            HashMap map = new HashMap();
            map.put("remainingtimes", Integer.valueOf(sqb0.m24051i0()));
            if (this.f16589k) {
                map.put("other_user_id", this.f16590l.userId);
            }
            int i = C0988c.f16602a[this.f16587i.j7().ordinal()];
            if (i == 1) {
                this.f16592n = "p_messages_view";
            } else if (i == 2) {
                this.f16592n = "p_explore_view";
            } else if (i == 3) {
                this.f16592n = "p_navigation_view";
            }
            zvf0.y(this.f16589k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f16592n, map);
            FrameLayout frameLayout = (FrameLayout) this.f16588j.getContentView().findViewById(u4c0.f23294x4);
            frameLayout.setClickable(true);
            frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l.zqb0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f28913a.m18991g0(view, motionEvent);
                }
            });
            xdl0.X(frameLayout, xdl0.F0());
            SVGAnimationView sVGAnimationViewFindViewById = frameLayout.findViewById(u4c0.f23254uf);
            SVGALoader.with(this.f16587i).from("https://auto.tancdn.com/v1/raw/bd3b6c84-2d79-4eb5-928f-4dc06d19cdf513.pdf").repeatCount(-1).into(sVGAnimationViewFindViewById);
            sVGAnimationViewFindViewById.startAnimation();
        } catch (Throwable th) {
            CrashHelper.d(th, 20);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m18993i0(Act act, roj0 roj0Var) {
        sqb0.m24036O().m24085M(act, this.f16590l.userId);
    }

    /* JADX INFO: renamed from: j */
    public int m18994j() {
        return this.f16587i.hashCode();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m18995j0() {
        if (this.f16589k) {
            CoreModule.f1534c.f3662p1.m1983u3();
        }
        PopupWindow popupWindow = this.f16588j;
        if (popupWindow != null) {
            popupWindow.getContentView().removeCallbacks(this.f16591m);
            SVGAnimationView sVGAnimationViewFindViewById = this.f16588j.getContentView().findViewById(u4c0.f23254uf);
            if (NullChecker.a(sVGAnimationViewFindViewById)) {
                sVGAnimationViewFindViewById.stopAnimation(false);
            }
            this.f16588j.dismiss();
            this.f16588j = null;
        }
        this.f16591m = null;
        mkd0.z(this.f16594p);
        mkd0.z(this.f16595q);
        this.f16596r = false;
        this.f16593o = null;
        if (NullChecker.a(this.f16597s)) {
            this.f16597s.call();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Boolean m18996k0(Long l2) {
        return Boolean.valueOf(NullChecker.a(this.f16588j));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m18997l0(Long l2) {
        this.f16588j.getContentView().findViewById(u4c0.f22952d1).setText(String.format("立即接听 %ss", Long.valueOf(5 - l2.longValue())));
        if (l2.longValue() >= 5) {
            m18982Y();
        }
    }

    /* JADX INFO: renamed from: m */
    public Act m18998m() {
        return this.f16587i;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m18999m0(TabName tabName) {
        m18982Y();
    }

    /* JADX INFO: renamed from: n */
    public void m19000n(boolean z) {
        PopupWindow popupWindow = this.f16588j;
        if (popupWindow != null && popupWindow.isShowing()) {
            m18982Y();
            return;
        }
        f0m f0mVar = ((aie0) this).f;
        if (f0mVar != null) {
            f0mVar.a(this);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m19001n0(Act act, View view) {
        m18986c0(act);
    }

    /* JADX INFO: renamed from: o */
    public String m19002o() {
        return MagicBubble.AUDIO_QUICK_CHAT_BUBBLE.getGroup();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m19003o0(View view) {
        m18983Z();
        m18982Y();
    }

    /* JADX INFO: renamed from: p */
    public String m19004p() {
        return MagicBubble.AUDIO_QUICK_CHAT_BUBBLE.getId();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m19005p0(Act act, View view) {
        m18986c0(act);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m19006q0(View view) {
        m18983Z();
        m18982Y();
        sqb0.m24036O().m24083K();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m19007r0(final Act act, final User user, final View view) {
        view.post(new Runnable() { // from class: l.irb0
            @Override // java.lang.Runnable
            public final void run() {
                a.w(view.findViewById(u4c0.f22702O), user.fp().profileSmall());
            }
        });
        view.findViewById(u4c0.f22564Fe).setTypeface(eqh0.c(3), 1);
        TextView textView = (TextView) view.findViewById(u4c0.f22609I8);
        textView.setText(user.name);
        VImage vImageFindViewById = view.findViewById(u4c0.f22851X);
        if (jjb0.m17487b()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            if (NullChecker.a(vImageFindViewById)) {
                qib0.f19804b0.f17707b.showUserVerificationLogo(act, user, vImageFindViewById);
            }
        } else if (user.isIdAndPicBothVerified()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f26341Up, 0);
        } else if (user.isPicVerificationVerified()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f26190Pt, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        StringBuilder sb = new StringBuilder();
        Location location = user.location;
        String strC = a.C(location.distance, location.region.city);
        if (!TextUtils.isEmpty(strC)) {
            sb.append(strC);
            sb.append(" · ");
        }
        sb.append(String.format("%1$s · %2$s", a.H(user), i0g0.j0(user.profile.zodiac)));
        VText vTextFindViewById = view.findViewById(u4c0.f22721P1);
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
        vTextFindViewById.setText(sb.toString());
        String str = user.isFemale() ? "她" : "他";
        ((TextView) view.findViewById(u4c0.f22614Id)).setText(String.format("%s和你还蛮合适的，去和%s聊聊吧！", str, str));
        VText vTextFindViewById2 = view.findViewById(u4c0.f22952d1);
        vTextFindViewById2.setTypeface(eqh0.c(3), 1);
        vTextFindViewById2.setText("立即接听 5s");
        xdl0.E0(vTextFindViewById2, new View.OnClickListener() { // from class: l.jrb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15363a.m19001n0(act, view2);
            }
        });
        xdl0.E0(view.findViewById(u4c0.f22466A1), new View.OnClickListener() { // from class: l.krb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15971a.m19003o0(view2);
            }
        });
        this.f16594p = act.duringCreated(c.interval(1L, TimeUnit.SECONDS)).filter(new w9j() { // from class: l.vqb0
            public final Object call(Object obj) {
                return this.f24418a.m18996k0((Long) obj);
            }
        }).take(6).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.wqb0
            public final void call(Object obj) {
                this.f25317a.m18997l0((Long) obj);
            }
        }));
        this.f16595q = act.duringCreated(((NewMainAct) act).i7()).filter(new w9j() { // from class: l.xqb0
            public final Object call(Object obj) {
                TabName tabName = (TabName) obj;
                return Boolean.valueOf(tabName == TabName.Card || tabName == TabName.Live);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.yqb0
            public final void call(Object obj) {
                this.f28346a.m18999m0((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m19008s0(final Act act, final View view) {
        view.post(new Runnable() { // from class: l.erb0
            @Override // java.lang.Runnable
            public final void run() {
                lrb0.m18968L(view);
            }
        });
        view.findViewById(u4c0.f22609I8).setTypeface(eqh0.c(3), 1);
        VText vTextFindViewById = view.findViewById(u4c0.f22952d1);
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
        xdl0.E0(vTextFindViewById, new View.OnClickListener() { // from class: l.frb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12871a.m19005p0(act, view2);
            }
        });
        xdl0.E0(view.findViewById(u4c0.f22466A1), new View.OnClickListener() { // from class: l.grb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13458a.m19006q0(view2);
            }
        });
        this.f16595q = act.duringCreated(((NewMainAct) act).i7()).subscribe(mkd0.G(new e30() { // from class: l.hrb0
            public final void call(Object obj) {
                xdl0.M(view, ((TabName) obj) == TabName.Msg);
            }
        }));
        e51.H(act, this.f16598t, 30000L);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m19009t0(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", -view.getMeasuredHeight(), 0.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: l.lrb0$a */
    public class GestureDetectorOnGestureListenerC0986a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC0986a() {
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
            if (lrb0.this.f16596r) {
                return false;
            }
            lrb0.this.f16596r = true;
            if (f2 <= 0.0f) {
                return false;
            }
            lrb0.this.m18984a0();
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: renamed from: l.lrb0$b */
    public class C0987b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f16600a;

        public C0987b(Animator animator) {
            this.f16600a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16600a.removeAllListeners();
            lrb0.this.m18982Y();
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

    /* JADX INFO: renamed from: f */
    public void m18989f(boolean z) {
    }
}
