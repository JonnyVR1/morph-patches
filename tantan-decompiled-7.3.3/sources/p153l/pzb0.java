package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreAudioMatch;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class pzb0 extends fqe0 {

    /* JADX INFO: renamed from: i */
    public Act f154808i;

    /* JADX INFO: renamed from: j */
    public PopupWindow f154809j;

    /* JADX INFO: renamed from: k */
    public boolean f154810k;

    /* JADX INFO: renamed from: l */
    public OnlineMatchPushUser f154811l;

    /* JADX INFO: renamed from: n */
    public String f154813n;

    /* JADX INFO: renamed from: o */
    public GestureDetector f154814o;

    /* JADX INFO: renamed from: p */
    public kcg0 f154815p;

    /* JADX INFO: renamed from: q */
    public kcg0 f154816q;

    /* JADX INFO: renamed from: r */
    public boolean f154817r;

    /* JADX INFO: renamed from: s */
    public x20 f154818s;

    /* JADX INFO: renamed from: m */
    public Runnable f154812m = null;

    /* JADX INFO: renamed from: t */
    public Runnable f154819t = new Runnable() { // from class: l.yyb0
        @Override // java.lang.Runnable
        public final void run() {
            this.f202095a.m174391j0();
        }
    };

    /* JADX INFO: renamed from: l.pzb0$c */
    public static /* synthetic */ class C19469c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f154823a;

        static {
            int[] iArr = new int[TabName.values().length];
            f154823a = iArr;
            try {
                iArr[TabName.Msg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f154823a[TabName.Moment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f154823a[TabName.Me.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public pzb0(Act act, boolean z, @Nullable OnlineMatchPushUser onlineMatchPushUser, x20 x20Var) {
        this.f154808i = act;
        this.f154810k = z;
        this.f154811l = onlineMatchPushUser;
        this.f154818s = x20Var;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m174367L(View view) {
        uqb0.f180374G.m127115L0((SimpleDraweeView) view.findViewById(adc0.f70243a0), CoreModule.f18264c.f20381e0.m116593na().m61308fp().profileSmall().formatted());
        uqb0.f180374G.m127138Y0((SimpleDraweeView) view.findViewById(adc0.f70277c0), CoreModule.f18264c.f20381e0.m116593na().isFemale() ? dbc0.f87408s8 : dbc0.f87375r8);
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        m174383b0();
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: Y */
    public void m174380Y() {
        l51.m152890J(this.f154819t);
        this.f154819t.run();
    }

    /* JADX INFO: renamed from: Z */
    public final void m174381Z() {
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(wyb0.m208508i0()));
        map.put("quickchat_action", "reject");
        if (this.f154810k) {
            map.put("other_user_id", this.f154811l.userId);
        }
        i4g0.m138521s(this.f154810k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f154813n, map);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m174382a0() {
        Animator animatorM132171q = gt0.m132171q(this.f154809j.getContentView(), "translationY", 0.0f, -qa00.m175859d(250.0f));
        animatorM132171q.setDuration(200L);
        animatorM132171q.setInterpolator(new AccelerateInterpolator());
        animatorM132171q.addListener(new C19468b(animatorM132171q));
        animatorM132171q.start();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m174383b0() {
        View viewInflate;
        if (this.f154814o == null) {
            this.f154814o = m174385d0(this.f154808i);
        }
        if (this.f154809j == null) {
            boolean z = this.f154810k;
            Act act = this.f154808i;
            if (z) {
                viewInflate = act.inflater().inflate(kec0.f125968nb, (ViewGroup) null);
                m174399r0(this.f154808i, this.f154811l.user, viewInflate);
            } else {
                viewInflate = act.inflater().inflate(kec0.f125985ob, (ViewGroup) null);
                m174400s0(this.f154808i, viewInflate);
            }
            uqb0.f180374G.m127115L0((SimpleDraweeView) viewInflate.findViewById(adc0.f70480o0), "https://auto.tancdn.com/v1/images/eyJpZCI6IlFZMlVFTU02WE1PVFpYM0RLVkhLTldOVjZISkRCNzEyIiwidyI6NzE4LCJoIjo0MzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTg3ODQ2NzM1MjE4MTE0NjI5fQ.png");
            viewInflate.measure(dox.m117367e(), dox.m117367e());
            PopupWindow popupWindow = new PopupWindow(viewInflate, bnl0.m105592y0(), viewInflate.getMeasuredHeight() + bnl0.m105511F0(), false);
            this.f154809j = popupWindow;
            popupWindow.setClippingEnabled(false);
            this.f154809j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.gzb0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f107185a.m174387f0();
                }
            });
        }
        this.f154812m = new Runnable() { // from class: l.hzb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f112220a.m174389h0();
            }
        };
        this.f154808i.getWindow().getDecorView().post(this.f154812m);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m174384c0(final Act act) {
        if (this.f154810k) {
            act.duringCreated(CoreModule.f18264c.f20415p1.m31048p3(this.f154811l.tracker, CoreAudioMatch.m31047o3(wyb0.m208508i0() <= 0))).subscribe(psd0.m173597H(new y20() { // from class: l.ezb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96579a.m174390i0(act, (uxj0) obj);
                }
            }, new y20() { // from class: l.fzb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    r1j0.m179415b("对方用户正在通话中，可以去发起语音闪聊哦");
                }
            }));
        } else {
            act.startActivity(DropDownAct.m55630b2(act, "voice_quick_chat", "audio_quick_chat_guide"));
        }
        HashMap map = new HashMap();
        map.put("remainingtimes", Integer.valueOf(wyb0.m208508i0()));
        map.put("quickchat_action", "accept");
        if (this.f154810k) {
            map.put("other_user_id", this.f154811l.userId);
        }
        i4g0.m138521s(this.f154810k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f154813n, map);
        m174380Y();
    }

    /* JADX INFO: renamed from: d0 */
    public final GestureDetector m174385d0(Act act) {
        return new GestureDetector(act, new GestureDetectorOnGestureListenerC19467a());
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m174386e0() {
        return this.f154810k;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m174387f0() {
        if (NullChecker.m82486a(this.f121543b)) {
            this.f121543b.call();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m174388g0(View view, MotionEvent motionEvent) {
        return this.f154814o.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m174389h0() {
        try {
            PopupWindow popupWindow = this.f154809j;
            if (popupWindow == null) {
                return;
            }
            bnl0.m105525M0(popupWindow.getContentView(), true);
            this.f154809j.showAtLocation(this.f154808i.getWindow().getDecorView(), 49, 0, 0);
            m174401t0(this.f154809j.getContentView());
            HashMap map = new HashMap();
            map.put("remainingtimes", Integer.valueOf(wyb0.m208508i0()));
            if (this.f154810k) {
                map.put("other_user_id", this.f154811l.userId);
            }
            int i = C19469c.f154823a[((NewMainAct) this.f154808i).m40830p7().ordinal()];
            if (i == 1) {
                this.f154813n = OMSDialogPositon.p_messages_view;
            } else if (i == 2) {
                this.f154813n = "p_explore_view";
            } else if (i == 3) {
                this.f154813n = OMSDialogPositon.p_navigation_view;
            }
            i4g0.m138527y(this.f154810k ? "e_match_pop_quickchat_voice" : "e_suggest_pop_quickchat_voice", this.f154813n, map);
            FrameLayout frameLayout = (FrameLayout) this.f154809j.getContentView().findViewById(adc0.f70671z4);
            frameLayout.setClickable(true);
            frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: l.dzb0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f91340a.m174388g0(view, motionEvent);
                }
            });
            bnl0.m105540X(frameLayout, bnl0.m105511F0());
            SVGAnimationView sVGAnimationView = (SVGAnimationView) frameLayout.findViewById(adc0.f70648xf);
            SVGALoader.with(this.f154808i).from("https://auto.tancdn.com/v1/raw/bd3b6c84-2d79-4eb5-928f-4dc06d19cdf513.pdf").repeatCount(-1).into(sVGAnimationView);
            sVGAnimationView.startAnimation();
        } catch (Throwable th) {
            CrashHelper.m82480d(th, 20);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m174390i0(Act act, uxj0 uxj0Var) {
        wyb0.m208493O().m208542M(act, this.f154811l.userId);
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f154808i.hashCode();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m174391j0() {
        if (this.f154810k) {
            CoreModule.f18264c.f20415p1.m31053u3();
        }
        PopupWindow popupWindow = this.f154809j;
        if (popupWindow != null) {
            popupWindow.getContentView().removeCallbacks(this.f154812m);
            SVGAnimationView sVGAnimationView = (SVGAnimationView) this.f154809j.getContentView().findViewById(adc0.f70648xf);
            if (NullChecker.m82486a(sVGAnimationView)) {
                sVGAnimationView.stopAnimation(false);
            }
            this.f154809j.dismiss();
            this.f154809j = null;
        }
        this.f154812m = null;
        psd0.m173633z(this.f154815p);
        psd0.m173633z(this.f154816q);
        this.f154817r = false;
        this.f154814o = null;
        if (NullChecker.m82486a(this.f154818s)) {
            this.f154818s.call();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Boolean m174392k0(Long l2) {
        return Boolean.valueOf(NullChecker.m82486a(this.f154809j));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m174393l0(Long l2) {
        ((VText) this.f154809j.getContentView().findViewById(adc0.f70295d1)).setText(String.format("立即接听 %ss", Long.valueOf(5 - l2.longValue())));
        if (l2.longValue() >= 5) {
            m174380Y();
        }
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f154808i;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m174394m0(TabName tabName) {
        m174380Y();
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        PopupWindow popupWindow = this.f154809j;
        if (popupWindow != null && popupWindow.isShowing()) {
            m174380Y();
            return;
        }
        z2m z2mVar = this.f100281f;
        if (z2mVar != null) {
            z2mVar.mo22108a(this);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m174395n0(Act act, View view) {
        m174384c0(act);
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return MagicBubble.AUDIO_QUICK_CHAT_BUBBLE.getGroup();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m174396o0(View view) {
        m174381Z();
        m174380Y();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.AUDIO_QUICK_CHAT_BUBBLE.getId();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m174397p0(Act act, View view) {
        m174384c0(act);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m174398q0(View view) {
        m174381Z();
        m174380Y();
        wyb0.m208493O().m208540K();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m174399r0(final Act act, final User user, final View view) {
        view.post(new Runnable() { // from class: l.mzb0
            @Override // java.lang.Runnable
            public final void run() {
                C8772a.m51464w((SimpleDraweeView) view.findViewById(adc0.f70042O), user.m61308fp().profileSmall());
            }
        });
        ((VText) view.findViewById(adc0.f69955Ie)).setTypeface(lyh0.m156283c(3), 1);
        TextView textView = (TextView) view.findViewById(adc0.f69983K8);
        textView.setText(user.name);
        VImage vImage = (VImage) view.findViewById(adc0.f70194X);
        if (nrb0.m164466b()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            if (NullChecker.m82486a(vImage)) {
                uqb0.f180396b0.f170325b.showUserVerificationLogo(act, user, vImage);
            }
        } else if (user.isIdAndPicBothVerified()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86259Iq, 0);
        } else if (user.isPicVerificationVerified()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86103Du, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        StringBuilder sb = new StringBuilder();
        Location location = user.location;
        String strM51402C = C8772a.m51402C(location.distance, location.region.city);
        if (!TextUtils.isEmpty(strM51402C)) {
            sb.append(strM51402C);
            sb.append(" · ");
        }
        sb.append(String.format("%1$s · %2$s", C8772a.m51407H(user), q8g0.m175804j0(user.profile.zodiac)));
        VText vText = (VText) view.findViewById(adc0.f70061P1);
        vText.setTypeface(lyh0.m156283c(3), 1);
        vText.setText(sb.toString());
        String str = user.isFemale() ? "她" : "他";
        ((TextView) view.findViewById(adc0.f69988Kd)).setText(String.format("%s和你还蛮合适的，去和%s聊聊吧！", str, str));
        VText vText2 = (VText) view.findViewById(adc0.f70295d1);
        vText2.setTypeface(lyh0.m156283c(3), 1);
        vText2.setText("立即接听 5s");
        bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.nzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f144417a.m174395n0(act, view2);
            }
        });
        bnl0.m105509E0(view.findViewById(adc0.f69806A1), new View.OnClickListener() { // from class: l.ozb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f149857a.m174396o0(view2);
            }
        });
        this.f154815p = act.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).filter(new qcj() { // from class: l.zyb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f206570a.m174392k0((Long) obj);
            }
        }).take(6).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.azb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74135a.m174393l0((Long) obj);
            }
        }));
        this.f154816q = act.duringCreated(((NewMainAct) act).m40829o7()).filter(new qcj() { // from class: l.bzb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                TabName tabName = (TabName) obj;
                return Boolean.valueOf(tabName == TabName.Card || tabName == TabName.Live);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.czb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84453a.m174394m0((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m174400s0(final Act act, final View view) {
        view.post(new Runnable() { // from class: l.izb0
            @Override // java.lang.Runnable
            public final void run() {
                pzb0.m174367L(view);
            }
        });
        ((VText) view.findViewById(adc0.f69983K8)).setTypeface(lyh0.m156283c(3), 1);
        VText vText = (VText) view.findViewById(adc0.f70295d1);
        vText.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.jzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f123252a.m174397p0(act, view2);
            }
        });
        bnl0.m105509E0(view.findViewById(adc0.f69806A1), new View.OnClickListener() { // from class: l.kzb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f129398a.m174398q0(view2);
            }
        });
        this.f154816q = act.duringCreated(((NewMainAct) act).m40829o7()).subscribe(psd0.m173596G(new y20() { // from class: l.lzb0
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105524M(view, ((TabName) obj) == TabName.Msg);
            }
        }));
        l51.m152888H(act, this.f154819t, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m174401t0(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", -view.getMeasuredHeight(), 0.0f));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: l.pzb0$a */
    public class GestureDetectorOnGestureListenerC19467a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC19467a() {
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
            if (pzb0.this.f154817r) {
                return false;
            }
            pzb0.this.f154817r = true;
            if (f2 <= 0.0f) {
                return false;
            }
            pzb0.this.m174382a0();
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

    /* JADX INFO: renamed from: l.pzb0$b */
    public class C19468b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f154821a;

        public C19468b(Animator animator) {
            this.f154821a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f154821a.removeAllListeners();
            pzb0.this.m174380Y();
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

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
    }
}
