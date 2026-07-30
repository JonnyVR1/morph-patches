package p153l;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.PopupWindow;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Options;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.StateOption;
import com.p051p1.mobile.putong.feed.data.StateQuestion;
import com.p051p1.mobile.putong.feed.newui.status.improve.FeedStatusPostGuidePopView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class b5i {

    /* JADX INFO: renamed from: i */
    public static volatile b5i f75060i;

    /* JADX INFO: renamed from: j */
    public static User f75061j;

    /* JADX INFO: renamed from: b */
    public l4g0 f75063b;

    /* JADX INFO: renamed from: c */
    public PopupWindow f75064c;

    /* JADX INFO: renamed from: d */
    public FeedStatusPostGuidePopView f75065d;

    /* JADX INFO: renamed from: e */
    public StateQuestion f75066e;

    /* JADX INFO: renamed from: f */
    public String f75067f;

    /* JADX INFO: renamed from: a */
    public final byd0 f75062a = new byd0("feed_state_post_guide_pop_dialog_last_show_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public Runnable f75068g = new RunnableC15933a();

    /* JADX INFO: renamed from: h */
    public boolean f75069h = false;

    /* JADX INFO: renamed from: l.b5i$a */
    public class RunnableC15933a implements Runnable {
        public RunnableC15933a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m102615b() {
            if (b5i.this.f75064c != null) {
                b5i.this.f75064c.dismiss();
                b5i.this.f75064c = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m82486a(b5i.this.f75065d) && NullChecker.m82486a(b5i.this.f75064c)) {
                Animator animatorM132166l = gt0.m132166l(b5i.this.f75065d.f43789d, View.ALPHA, 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
                gt0.m132160f(animatorM132166l, new Runnable() { // from class: l.a5i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f68585a.m102615b();
                    }
                });
                animatorM132166l.start();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static b5i m102594m() {
        if (f75060i == null) {
            synchronized (b5i.class) {
                try {
                    if (f75060i == null) {
                        f75060i = new b5i();
                        f75061j = FeedModule.m61406H().me_();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f75060i;
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void m102609v(Act act) {
        if (act == null) {
            return;
        }
        m102603p(act);
        PopupWindow popupWindow = this.f75064c;
        if (popupWindow == null || popupWindow.isShowing()) {
            return;
        }
        this.f75062a.put(Long.valueOf(pzi0.m174454o()));
        l51.m152890J(this.f75068g);
        l51.m152888H(act, this.f75068g, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        m102612y();
        if (this.f75066e == null) {
            return;
        }
        this.f75064c.showAtLocation(act.getWindow().getDecorView(), 49, 0, m102601n(act));
        m102596B();
    }

    /* JADX INFO: renamed from: B */
    public final void m102596B() {
        m102597C();
    }

    /* JADX INFO: renamed from: C */
    public final void m102597C() {
        if (m102599k()) {
            return;
        }
        gt0.m132180z(gt0.m132166l(this.f75065d.f43789d, View.ALPHA, 0L, 300L, new DecelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f75065d.f43789d, View.TRANSLATION_Y, 0L, 300L, new DecelerateInterpolator(), -qa00.m175859d(20.0f), 0.0f)).start();
    }

    /* JADX INFO: renamed from: j */
    public boolean m102598j() {
        if (!d5i.m114305h()) {
            return false;
        }
        uqb0.f180396b0.f170327d.mo61504Tg().subscribe(psd0.m173596G(new y20() { // from class: l.v4i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182376a.m102604q((bkj0) obj);
            }
        }));
        if (!this.f75069h) {
            return false;
        }
        if (this.f75062a.get().longValue() == 0) {
            return true;
        }
        return !p6i.m170905n(this.f75062a.get().longValue());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m102599k() {
        FeedStatusPostGuidePopView feedStatusPostGuidePopView;
        return this.f75064c == null || (feedStatusPostGuidePopView = this.f75065d) == null || feedStatusPostGuidePopView.m66969a0();
    }

    /* JADX INFO: renamed from: l */
    public void m102600l() {
        l51.m152890J(this.f75068g);
        this.f75068g.run();
    }

    /* JADX INFO: renamed from: n */
    public final int m102601n(Act act) {
        int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m102602o() {
        l4g0 l4g0Var = new l4g0("p_fast_state_post", b5i.class.getName());
        this.f75063b = l4g0Var;
        l4g0Var.m152781p(jyb.m147494Y("refer_source", this.f75067f), jyb.m147494Y("question", this.f75066e.question));
        this.f75063b.m152774i();
        this.f75063b.m152777l();
    }

    /* JADX INFO: renamed from: p */
    public final void m102603p(Act act) {
        if (this.f75064c == null) {
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(tec0.f173779w3, (ViewGroup) null), bnl0.m105592y0(), qa00.m175859d(236.0f), false);
            this.f75064c = popupWindow;
            this.f75065d = (FeedStatusPostGuidePopView) popupWindow.getContentView().findViewById(hdc0.f108820B0);
            if (m102599k()) {
                return;
            }
            this.f75065d.f43792g.setTypeface(lyh0.m156283c(3), 1);
            this.f75064c.setClippingEnabled(false);
            this.f75065d.f43789d.setClickable(true);
            bnl0.m105509E0(this.f75065d.f43793h, new View.OnClickListener() { // from class: l.w4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187410a.m102605r(view);
                }
            });
            bnl0.m105509E0(this.f75065d.f43796k, new View.OnClickListener() { // from class: l.x4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192413a.m102606s(view);
                }
            });
            bnl0.m105509E0(this.f75065d.f43791f, new View.OnClickListener() { // from class: l.y4i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197470a.m102607t(view);
                }
            });
            this.f75064c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.z4i
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f202960a.m102608u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m102604q(bkj0 bkj0Var) {
        if (bkj0Var == null || bkj0Var.f77081a == 0) {
            this.f75069h = true;
        } else {
            this.f75069h = false;
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m102605r(View view) {
        m102611x(this.f75066e.stateOptions.get(0));
        m102600l();
        tfj0.m190939b("e_set_my_state_post", "p_fast_state_post", tfj0.C20302a.m190949g("question", this.f75066e.question), tfj0.C20302a.m190949g(Options.TYPE, this.f75066e.stateOptions.get(0).option));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m102606s(View view) {
        m102611x(this.f75066e.stateOptions.get(1));
        m102600l();
        tfj0.m190939b("e_set_my_state_post", "p_fast_state_post", tfj0.C20302a.m190949g("question", this.f75066e.question), tfj0.C20302a.m190949g(Options.TYPE, this.f75066e.stateOptions.get(1).option));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m102607t(View view) {
        m102600l();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m102608u() {
        l4g0 l4g0Var = this.f75063b;
        if (l4g0Var == null) {
            return;
        }
        l4g0Var.m152776k();
        this.f75063b.m152775j();
    }

    /* JADX INFO: renamed from: w */
    public void m102610w() {
        f75060i = null;
        f75061j = null;
    }

    /* JADX INFO: renamed from: x */
    public final void m102611x(StateOption stateOption) {
        String strSubstring = stateOption.defaultContent;
        Emotion emotion = stateOption.stateEmotion;
        BubbleInfo bubbleInfo = new BubbleInfo();
        if (!TextUtils.isEmpty(strSubstring) && strSubstring.length() > 60) {
            strSubstring = strSubstring.substring(0, 60);
        }
        bubbleInfo.value = strSubstring;
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        FeedModule.f39704e.m159782V0(bubbleInfo, "p_fast_state_post");
    }

    /* JADX INFO: renamed from: y */
    public final void m102612y() {
        Emotion emotion;
        StateQuestion stateQuestionM114299b = d5i.m114299b();
        this.f75066e = stateQuestionM114299b;
        if (stateQuestionM114299b == null || jyb.m147479J(stateQuestionM114299b.stateOptions) || m102599k()) {
            return;
        }
        for (StateOption stateOption : this.f75066e.stateOptions) {
            if (stateOption == null || (emotion = stateOption.stateEmotion) == null || TextUtils.isEmpty(emotion.emojiUrl)) {
                return;
            }
        }
        m102602o();
        bnl0.m105524M(this.f75065d.f43793h, false);
        bnl0.m105524M(this.f75065d.f43796k, false);
        List<StateOption> list = this.f75066e.stateOptions;
        if (list.size() >= 1) {
            bnl0.m105524M(this.f75065d.f43793h, true);
            this.f75065d.f43795j.setText(list.get(0).option);
            uqb0.f180374G.m127115L0(this.f75065d.f43794i, list.get(0).stateEmotion.emojiUrl);
        }
        if (list.size() >= 2) {
            bnl0.m105524M(this.f75065d.f43796k, true);
            this.f75065d.f43798m.setText(list.get(1).option);
            uqb0.f180374G.m127115L0(this.f75065d.f43797l, list.get(1).stateEmotion.emojiUrl);
        }
        this.f75065d.f43792g.setText(this.f75066e.question);
        this.f75065d.f43799n.setText("点击即可发布状态");
        if (NullChecker.m82486a(f75061j)) {
            uqb0.f180374G.m127111J0(this.f75065d.f43801p, f75061j.m61308fp().profileMiddle(), false);
        }
        uqb0.f180374G.m127138Y0(this.f75065d.f43802q, lbc0.f130855H0);
    }

    /* JADX INFO: renamed from: z */
    public void m102613z(final Act act, String str) {
        Window window;
        View decorView;
        this.f75067f = str;
        if (act == null || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new Runnable() { // from class: l.u4i
            @Override // java.lang.Runnable
            public final void run() {
                this.f177464a.m102609v(act);
            }
        });
    }
}
