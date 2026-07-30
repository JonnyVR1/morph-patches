package p149l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreAudioMatch;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class lrb0 extends aie0 {

    /* JADX INFO: renamed from: i */
    public Act f129546i;

    /* JADX INFO: renamed from: j */
    public PopupWindow f129547j;

    /* JADX INFO: renamed from: k */
    public boolean f129548k;

    /* JADX INFO: renamed from: l */
    public OnlineMatchPushUser f129549l;

    /* JADX INFO: renamed from: n */
    public String f129551n;

    /* JADX INFO: renamed from: o */
    public GestureDetector f129552o;

    /* JADX INFO: renamed from: p */
    public c4g0 f129553p;

    /* JADX INFO: renamed from: q */
    public c4g0 f129554q;

    /* JADX INFO: renamed from: r */
    public boolean f129555r;

    /* JADX INFO: renamed from: s */
    public d30 f129556s;

    /* JADX INFO: renamed from: m */
    public Runnable f129550m = null;

    /* JADX INFO: renamed from: t */
    public Runnable f129557t = new Runnable() { // from class: l.uqb0
        @Override // java.lang.Runnable
        public final void run() {
            this.f177735a.m151198j0();
        }
    };

    /* JADX INFO: renamed from: l.lrb0$c */
    public static /* synthetic */ class C18292c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f129561a;

        static {
            int[] iArr = new int[TabName.values().length];
            f129561a = iArr;
            try {
                iArr[TabName.Msg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129561a[TabName.Moment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129561a[TabName.Me.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lrb0(Act act, boolean z, @Nullable OnlineMatchPushUser onlineMatchPushUser, d30 d30Var) {
        this.f129546i = act;
        this.f129548k = z;
        this.f129549l = onlineMatchPushUser;
        this.f129556s = d30Var;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m151174L(View view) {
        qib0.f154691G.m102331L0((SimpleDraweeView) view.findViewById(u4c0.f174152a0), CoreModule.f17545c.f19639e0.m169520na().m60124fp().profileSmall().formatted());
        qib0.f154691G.m102354Y0((SimpleDraweeView) view.findViewById(u4c0.f174186c0), CoreModule.f17545c.f19639e0.m169520na().isFemale() ? x2c0.f190515r8 : x2c0.f190483q8);
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        m151190b0();
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: Y */
    public void m151187Y() {
        e51.m114745J(this.f129557t);
        this.f129557t.run();
    }

    /* JADX INFO: renamed from: Z */
    public final void m151188Z() {
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(sqb0.m185513i0()));
        map.put("quickchat_action", "reject");
        if (this.f129548k) {
            map.put("other_user_id", this.f129549l.userId);
        }
        zvf0.m220397s(this.f129548k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f129551n, map);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m151189a0() {
        Animator animatorM103744q = bt0.m103744q(this.f129547j.getContentView(), "translationY", 0.0f, -t100.m186890d(250.0f));
        animatorM103744q.setDuration(200L);
        animatorM103744q.setInterpolator(new AccelerateInterpolator());
        animatorM103744q.addListener(new C18291b(animatorM103744q));
        animatorM103744q.start();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m151190b0() {
        View viewInflate;
        if (this.f129552o == null) {
            this.f129552o = m151192d0(this.f129546i);
        }
        if (this.f129547j == null) {
            boolean z = this.f129548k;
            Act act = this.f129546i;
            if (z) {
                viewInflate = act.inflater().inflate(f6c0.f95796gb, (ViewGroup) null);
                m151206r0(this.f129546i, this.f129549l.user, viewInflate);
            } else {
                viewInflate = act.inflater().inflate(f6c0.f95813hb, (ViewGroup) null);
                m151207s0(this.f129546i, viewInflate);
            }
            qib0.f154691G.m102331L0((SimpleDraweeView) viewInflate.findViewById(u4c0.f174389o0), "https://auto.tancdn.com/v1/images/eyJpZCI6IlFZMlVFTU02WE1PVFpYM0RLVkhLTldOVjZISkRCNzEyIiwidyI6NzE4LCJoIjo0MzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTg3ODQ2NzM1MjE4MTE0NjI5fQ.png");
            viewInflate.measure(ffx.m121202e(), ffx.m121202e());
            PopupWindow popupWindow = new PopupWindow(viewInflate, xdl0.m208412y0(), viewInflate.getMeasuredHeight() + xdl0.m208331F0(), false);
            this.f129547j = popupWindow;
            popupWindow.setClippingEnabled(false);
            this.f129547j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.crb0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f82195a.m151194f0();
                }
            });
        }
        this.f129550m = new Runnable() { // from class: l.drb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87602a.m151196h0();
            }
        };
        this.f129546i.getWindow().getDecorView().post(this.f129550m);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m151191c0(final Act act) {
        if (this.f129548k) {
            act.duringCreated(CoreModule.f17545c.f19673p1.m30050p3(this.f129549l.tracker, CoreAudioMatch.m30049o3(sqb0.m185513i0() <= 0))).subscribe(mkd0.m154956H(new e30() { // from class: l.arb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71245a.m151197i0(act, (roj0) obj);
                }
            }, new e30() { // from class: l.brb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    osi0.m165778b("对方用户正在通话中，可以去发起语音闪聊哦");
                }
            }));
        } else {
            act.startActivity(DropDownAct.m54447a2(act, "voice_quick_chat", "audio_quick_chat_guide"));
        }
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(sqb0.m185513i0()));
        map.put("quickchat_action", "accept");
        if (this.f129548k) {
            map.put("other_user_id", this.f129549l.userId);
        }
        zvf0.m220397s(this.f129548k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f129551n, map);
        m151187Y();
    }

    /* JADX INFO: renamed from: d0 */
    public final GestureDetector m151192d0(Act act) {
        return new GestureDetector(act, new GestureDetectorOnGestureListenerC18290a());
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m151193e0() {
        return this.f129548k;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m151194f0() {
        if (NullChecker.m81303a(this.f97025b)) {
            this.f97025b.call();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m151195g0(View view, MotionEvent motionEvent) {
        return this.f129552o.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m151196h0() {
        try {
            PopupWindow popupWindow = this.f129547j;
            if (popupWindow == null) {
                return;
            }
            xdl0.m208345M0(popupWindow.getContentView(), true);
            this.f129547j.showAtLocation(this.f129546i.getWindow().getDecorView(), 49, 0, 0);
            m151208t0(this.f129547j.getContentView());
            HashMap map = new HashMap();
            map.put("remainingtimes", Integer.valueOf(sqb0.m185513i0()));
            if (this.f129548k) {
                map.put("other_user_id", this.f129549l.userId);
            }
            int i = C18292c.f129561a[((NewMainAct) this.f129546i).m39820j7().ordinal()];
            if (i == 1) {
                this.f129551n = OMSDialogPositon.p_messages_view;
            } else if (i == 2) {
                this.f129551n = "p_explore_view";
            } else if (i == 3) {
                this.f129551n = OMSDialogPositon.p_navigation_view;
            }
            zvf0.m220403y(this.f129548k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f129551n, map);
            FrameLayout frameLayout = (FrameLayout) this.f129547j.getContentView().findViewById(u4c0.f174546x4);
            frameLayout.setClickable(true);
            frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l.zqb0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f204374a.m151195g0(view, motionEvent);
                }
            });
            xdl0.m208360X(frameLayout, xdl0.m208331F0());
            SVGAnimationView sVGAnimationView = (SVGAnimationView) frameLayout.findViewById(u4c0.f174506uf);
            SVGALoader.with(this.f129546i).from("https://auto.tancdn.com/v1/raw/bd3b6c84-2d79-4eb5-928f-4dc06d19cdf513.pdf").repeatCount(-1).into(sVGAnimationView);
            sVGAnimationView.startAnimation();
        } catch (Throwable th) {
            CrashHelper.m81297d(th, 20);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m151197i0(Act act, roj0 roj0Var) {
        sqb0.m185498O().m185547M(act, this.f129549l.userId);
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f129546i.hashCode();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m151198j0() {
        if (this.f129548k) {
            CoreModule.f17545c.f19673p1.m30055u3();
        }
        PopupWindow popupWindow = this.f129547j;
        if (popupWindow != null) {
            popupWindow.getContentView().removeCallbacks(this.f129550m);
            SVGAnimationView sVGAnimationView = (SVGAnimationView) this.f129547j.getContentView().findViewById(u4c0.f174506uf);
            if (NullChecker.m81303a(sVGAnimationView)) {
                sVGAnimationView.stopAnimation(false);
            }
            this.f129547j.dismiss();
            this.f129547j = null;
        }
        this.f129550m = null;
        mkd0.m154992z(this.f129553p);
        mkd0.m154992z(this.f129554q);
        this.f129555r = false;
        this.f129552o = null;
        if (NullChecker.m81303a(this.f129556s)) {
            this.f129556s.call();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Boolean m151199k0(Long l2) {
        return Boolean.valueOf(NullChecker.m81303a(this.f129547j));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m151200l0(Long l2) {
        ((VText) this.f129547j.getContentView().findViewById(u4c0.f174204d1)).setText(String.format("立即接听 %ss", Long.valueOf(5 - l2.longValue())));
        if (l2.longValue() >= 5) {
            m151187Y();
        }
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f129546i;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m151201m0(TabName tabName) {
        m151187Y();
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        PopupWindow popupWindow = this.f129547j;
        if (popupWindow != null && popupWindow.isShowing()) {
            m151187Y();
            return;
        }
        f0m f0mVar = this.f69977f;
        if (f0mVar != null) {
            f0mVar.mo21109a(this);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m151202n0(Act act, View view) {
        m151191c0(act);
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return MagicBubble.AUDIO_QUICK_CHAT_BUBBLE.getGroup();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m151203o0(View view) {
        m151188Z();
        m151187Y();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.AUDIO_QUICK_CHAT_BUBBLE.getId();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m151204p0(Act act, View view) {
        m151191c0(act);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m151205q0(View view) {
        m151188Z();
        m151187Y();
        sqb0.m185498O().m185545K();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m151206r0(final Act act, final User user, final View view) {
        view.post(new Runnable() { // from class: l.irb0
            @Override // java.lang.Runnable
            public final void run() {
                C8609a.m50281w((SimpleDraweeView) view.findViewById(u4c0.f173954O), user.m60124fp().profileSmall());
            }
        });
        ((VText) view.findViewById(u4c0.f173816Fe)).setTypeface(eqh0.m117752c(3), 1);
        TextView textView = (TextView) view.findViewById(u4c0.f173861I8);
        textView.setText(user.name);
        VImage vImage = (VImage) view.findViewById(u4c0.f174103X);
        if (jjb0.m141784b()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            if (NullChecker.m81303a(vImage)) {
                qib0.f154713b0.f139231b.showUserVerificationLogo(act, user, vImage);
            }
        } else if (user.isIdAndPicBothVerified()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189805Up, 0);
        } else if (user.isPicVerificationVerified()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189654Pt, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        StringBuilder sb = new StringBuilder();
        Location location = user.location;
        String strM50219C = C8609a.m50219C(location.distance, location.region.city);
        if (!TextUtils.isEmpty(strM50219C)) {
            sb.append(strM50219C);
            sb.append(" · ");
        }
        sb.append(String.format("%1$s · %2$s", C8609a.m50224H(user), i0g0.m133869j0(user.profile.zodiac)));
        VText vText = (VText) view.findViewById(u4c0.f173973P1);
        vText.setTypeface(eqh0.m117752c(3), 1);
        vText.setText(sb.toString());
        String str = user.isFemale() ? "她" : "他";
        ((TextView) view.findViewById(u4c0.f173866Id)).setText(String.format("%s和你还蛮合适的，去和%s聊聊吧！", str, str));
        VText vText2 = (VText) view.findViewById(u4c0.f174204d1);
        vText2.setTypeface(eqh0.m117752c(3), 1);
        vText2.setText("立即接听 5s");
        xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.jrb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f119389a.m151202n0(act, view2);
            }
        });
        xdl0.m208329E0(view.findViewById(u4c0.f173718A1), new View.OnClickListener() { // from class: l.krb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124341a.m151203o0(view2);
            }
        });
        this.f129553p = act.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).filter(new w9j() { // from class: l.vqb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182624a.m151199k0((Long) obj);
            }
        }).take(6).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.wqb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187679a.m151200l0((Long) obj);
            }
        }));
        this.f129554q = act.duringCreated(((NewMainAct) act).m39819i7()).filter(new w9j() { // from class: l.xqb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                TabName tabName = (TabName) obj;
                return Boolean.valueOf(tabName == TabName.Card || tabName == TabName.Live);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.yqb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199543a.m151201m0((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m151207s0(final Act act, final View view) {
        view.post(new Runnable() { // from class: l.erb0
            @Override // java.lang.Runnable
            public final void run() {
                lrb0.m151174L(view);
            }
        });
        ((VText) view.findViewById(u4c0.f173861I8)).setTypeface(eqh0.m117752c(3), 1);
        VText vText = (VText) view.findViewById(u4c0.f174204d1);
        vText.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.frb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98917a.m151204p0(act, view2);
            }
        });
        xdl0.m208329E0(view.findViewById(u4c0.f173718A1), new View.OnClickListener() { // from class: l.grb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f104044a.m151205q0(view2);
            }
        });
        this.f129554q = act.duringCreated(((NewMainAct) act).m39819i7()).subscribe(mkd0.m154955G(new e30() { // from class: l.hrb0
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208344M(view, ((TabName) obj) == TabName.Msg);
            }
        }));
        e51.m114743H(act, this.f129557t, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m151208t0(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", -view.getMeasuredHeight(), 0.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: l.lrb0$a */
    public class GestureDetectorOnGestureListenerC18290a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC18290a() {
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
            if (lrb0.this.f129555r) {
                return false;
            }
            lrb0.this.f129555r = true;
            if (f2 <= 0.0f) {
                return false;
            }
            lrb0.this.m151189a0();
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
    public class C18291b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f129559a;

        public C18291b(Animator animator) {
            this.f129559a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f129559a.removeAllListeners();
            lrb0.this.m151187Y();
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

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
    }
}
