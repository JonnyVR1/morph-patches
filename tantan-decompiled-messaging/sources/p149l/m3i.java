package p149l;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.PopupWindow;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Options;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.StateOption;
import com.p046p1.mobile.putong.feed.data.StateQuestion;
import com.p046p1.mobile.putong.feed.newui.status.improve.FeedStatusPostGuidePopView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class m3i {

    /* JADX INFO: renamed from: i */
    public static volatile m3i f131086i;

    /* JADX INFO: renamed from: j */
    public static User f131087j;

    /* JADX INFO: renamed from: b */
    public cwf0 f131089b;

    /* JADX INFO: renamed from: c */
    public PopupWindow f131090c;

    /* JADX INFO: renamed from: d */
    public FeedStatusPostGuidePopView f131091d;

    /* JADX INFO: renamed from: e */
    public StateQuestion f131092e;

    /* JADX INFO: renamed from: f */
    public String f131093f;

    /* JADX INFO: renamed from: a */
    public final zpd0 f131088a = new zpd0("feed_state_post_guide_pop_dialog_last_show_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public Runnable f131094g = new RunnableC18386a();

    /* JADX INFO: renamed from: h */
    public boolean f131095h = false;

    /* JADX INFO: renamed from: l.m3i$a */
    public class RunnableC18386a implements Runnable {
        public RunnableC18386a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m152944b() {
            if (m3i.this.f131090c != null) {
                m3i.this.f131090c.dismiss();
                m3i.this.f131090c = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m81303a(m3i.this.f131091d) && NullChecker.m81303a(m3i.this.f131090c)) {
                Animator animatorM103739l = bt0.m103739l(m3i.this.f131091d.f42941d, View.ALPHA, 0L, 300L, new LinearInterpolator(), 1.0f, 0.0f);
                bt0.m103733f(animatorM103739l, new Runnable() { // from class: l.l3i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f125909a.m152944b();
                    }
                });
                animatorM103739l.start();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static m3i m152923m() {
        if (f131086i == null) {
            synchronized (m3i.class) {
                try {
                    if (f131086i == null) {
                        f131086i = new m3i();
                        f131087j = FeedModule.m60222H().me_();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f131086i;
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void m152938v(Act act) {
        if (act == null) {
            return;
        }
        m152932p(act);
        PopupWindow popupWindow = this.f131090c;
        if (popupWindow == null || popupWindow.isShowing()) {
            return;
        }
        this.f131088a.put(Long.valueOf(mqi0.m155944o()));
        e51.m114745J(this.f131094g);
        e51.m114743H(act, this.f131094g, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        m152941y();
        if (this.f131092e == null) {
            return;
        }
        this.f131090c.showAtLocation(act.getWindow().getDecorView(), 49, 0, m152930n(act));
        m152925B();
    }

    /* JADX INFO: renamed from: B */
    public final void m152925B() {
        m152926C();
    }

    /* JADX INFO: renamed from: C */
    public final void m152926C() {
        if (m152928k()) {
            return;
        }
        bt0.m103753z(bt0.m103739l(this.f131091d.f42941d, View.ALPHA, 0L, 300L, new DecelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f131091d.f42941d, View.TRANSLATION_Y, 0L, 300L, new DecelerateInterpolator(), -t100.m186890d(20.0f), 0.0f)).start();
    }

    /* JADX INFO: renamed from: j */
    public boolean m152927j() {
        if (!o3i.m162434h()) {
            return false;
        }
        qib0.f154713b0.f139233d.mo60320Tg().subscribe(mkd0.m154955G(new e30() { // from class: l.g3i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100474a.m152933q((xaj0) obj);
            }
        }));
        if (!this.f131095h) {
            return false;
        }
        if (this.f131088a.get().longValue() == 0) {
            return true;
        }
        return !a5i.m95038n(this.f131088a.get().longValue());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m152928k() {
        FeedStatusPostGuidePopView feedStatusPostGuidePopView;
        return this.f131090c == null || (feedStatusPostGuidePopView = this.f131091d) == null || feedStatusPostGuidePopView.m65786a0();
    }

    /* JADX INFO: renamed from: l */
    public void m152929l() {
        e51.m114745J(this.f131094g);
        this.f131094g.run();
    }

    /* JADX INFO: renamed from: n */
    public final int m152930n(Act act) {
        int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m152931o() {
        cwf0 cwf0Var = new cwf0("p_fast_state_post", m3i.class.getName());
        this.f131089b = cwf0Var;
        cwf0Var.m109040p(vwb.m200311Y("refer_source", this.f131093f), vwb.m200311Y("question", this.f131092e.question));
        this.f131089b.m109033i();
        this.f131089b.m109036l();
    }

    /* JADX INFO: renamed from: p */
    public final void m152932p(Act act) {
        if (this.f131090c == null) {
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(o6c0.f142310w3, (ViewGroup) null), xdl0.m208412y0(), t100.m186890d(236.0f), false);
            this.f131090c = popupWindow;
            this.f131091d = (FeedStatusPostGuidePopView) popupWindow.getContentView().findViewById(b5c0.f73467B0);
            if (m152928k()) {
                return;
            }
            this.f131091d.f42944g.setTypeface(eqh0.m117752c(3), 1);
            this.f131090c.setClippingEnabled(false);
            this.f131091d.f42941d.setClickable(true);
            xdl0.m208329E0(this.f131091d.f42945h, new View.OnClickListener() { // from class: l.h3i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f105742a.m152934r(view);
                }
            });
            xdl0.m208329E0(this.f131091d.f42948k, new View.OnClickListener() { // from class: l.i3i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f111286a.m152935s(view);
                }
            });
            xdl0.m208329E0(this.f131091d.f42943f, new View.OnClickListener() { // from class: l.j3i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116074a.m152936t(view);
                }
            });
            this.f131090c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.k3i
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f120842a.m152937u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m152933q(xaj0 xaj0Var) {
        if (xaj0Var == null || xaj0Var.f191751a == 0) {
            this.f131095h = true;
        } else {
            this.f131095h = false;
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m152934r(View view) {
        m152940x(this.f131092e.stateOptions.get(0));
        m152929l();
        p6j0.m167668b("e_set_my_state_post", "p_fast_state_post", p6j0.C19147a.m167678g("question", this.f131092e.question), p6j0.C19147a.m167678g(Options.TYPE, this.f131092e.stateOptions.get(0).option));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m152935s(View view) {
        m152940x(this.f131092e.stateOptions.get(1));
        m152929l();
        p6j0.m167668b("e_set_my_state_post", "p_fast_state_post", p6j0.C19147a.m167678g("question", this.f131092e.question), p6j0.C19147a.m167678g(Options.TYPE, this.f131092e.stateOptions.get(1).option));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m152936t(View view) {
        m152929l();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m152937u() {
        cwf0 cwf0Var = this.f131089b;
        if (cwf0Var == null) {
            return;
        }
        cwf0Var.m109035k();
        this.f131089b.m109034j();
    }

    /* JADX INFO: renamed from: w */
    public void m152939w() {
        f131086i = null;
        f131087j = null;
    }

    /* JADX INFO: renamed from: x */
    public final void m152940x(StateOption stateOption) {
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
        FeedModule.f38856e.m132649V0(bubbleInfo, "p_fast_state_post");
    }

    /* JADX INFO: renamed from: y */
    public final void m152941y() {
        Emotion emotion;
        StateQuestion stateQuestionM162428b = o3i.m162428b();
        this.f131092e = stateQuestionM162428b;
        if (stateQuestionM162428b == null || vwb.m200296J(stateQuestionM162428b.stateOptions) || m152928k()) {
            return;
        }
        for (StateOption stateOption : this.f131092e.stateOptions) {
            if (stateOption == null || (emotion = stateOption.stateEmotion) == null || TextUtils.isEmpty(emotion.emojiUrl)) {
                return;
            }
        }
        m152931o();
        xdl0.m208344M(this.f131091d.f42945h, false);
        xdl0.m208344M(this.f131091d.f42948k, false);
        List<StateOption> list = this.f131092e.stateOptions;
        if (list.size() >= 1) {
            xdl0.m208344M(this.f131091d.f42945h, true);
            this.f131091d.f42947j.setText(list.get(0).option);
            qib0.f154691G.m102331L0(this.f131091d.f42946i, list.get(0).stateEmotion.emojiUrl);
        }
        if (list.size() >= 2) {
            xdl0.m208344M(this.f131091d.f42948k, true);
            this.f131091d.f42950m.setText(list.get(1).option);
            qib0.f154691G.m102331L0(this.f131091d.f42949l, list.get(1).stateEmotion.emojiUrl);
        }
        this.f131091d.f42944g.setText(this.f131092e.question);
        this.f131091d.f42951n.setText("点击即可发布状态");
        if (NullChecker.m81303a(f131087j)) {
            qib0.f154691G.m102327J0(this.f131091d.f42953p, f131087j.m60124fp().profileMiddle(), false);
        }
        qib0.f154691G.m102354Y0(this.f131091d.f42954q, f3c0.f94337H0);
    }

    /* JADX INFO: renamed from: z */
    public void m152942z(final Act act, String str) {
        Window window;
        View decorView;
        this.f131093f = str;
        if (act == null || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new Runnable() { // from class: l.f3i
            @Override // java.lang.Runnable
            public final void run() {
                this.f94686a.m152938v(act);
            }
        });
    }
}
