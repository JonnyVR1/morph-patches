package p007l;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p000p1.mobile.putong.feed.data.StateOption;
import com.p000p1.mobile.putong.feed.data.StateQuestion;
import com.p000p1.mobile.putong.feed.newui.status.improve.FeedStatusPostGuidePopView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bt0;
import l.cwf0;
import l.e30;
import l.e51;
import l.eqh0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xaj0;
import l.xdl0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m3i {

    /* JADX INFO: renamed from: i */
    public static volatile m3i f10198i;

    /* JADX INFO: renamed from: j */
    public static User f10199j;

    /* JADX INFO: renamed from: b */
    public cwf0 f10201b;

    /* JADX INFO: renamed from: c */
    public PopupWindow f10202c;

    /* JADX INFO: renamed from: d */
    public FeedStatusPostGuidePopView f10203d;

    /* JADX INFO: renamed from: e */
    public StateQuestion f10204e;

    /* JADX INFO: renamed from: f */
    public String f10205f;

    /* JADX INFO: renamed from: a */
    public final zpd0 f10200a = new zpd0("feed_state_post_guide_pop_dialog_last_show_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public Runnable f10206g = new RunnableC2424a();

    /* JADX INFO: renamed from: h */
    public boolean f10207h = false;

    /* JADX INFO: renamed from: l.m3i$a */
    public class RunnableC2424a implements Runnable {
        public RunnableC2424a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m11783b() {
            if (m3i.this.f10202c != null) {
                m3i.this.f10202c.dismiss();
                m3i.this.f10202c = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.a(m3i.this.f10203d) && NullChecker.a(m3i.this.f10202c)) {
                Animator animatorL = bt0.l(m3i.this.f10203d.f4402d, View.ALPHA, 0L, 300L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
                bt0.f(animatorL, new Runnable() { // from class: l.l3i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9864a.m11783b();
                    }
                });
                animatorL.start();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static m3i m11762m() {
        if (f10198i == null) {
            synchronized (m3i.class) {
                try {
                    if (f10198i == null) {
                        f10198i = new m3i();
                        f10199j = FeedModule.m1140H().me_();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10198i;
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void m11777v(Act act) {
        if (act == null) {
            return;
        }
        m11771p(act);
        PopupWindow popupWindow = this.f10202c;
        if (popupWindow == null || popupWindow.isShowing()) {
            return;
        }
        this.f10200a.put(Long.valueOf(mqi0.o()));
        e51.J(this.f10206g);
        e51.H(act, this.f10206g, 5000L);
        m11780y();
        if (this.f10204e == null) {
            return;
        }
        this.f10202c.showAtLocation(act.getWindow().getDecorView(), 49, 0, m11769n(act));
        m11764B();
    }

    /* JADX INFO: renamed from: B */
    public final void m11764B() {
        m11765C();
    }

    /* JADX INFO: renamed from: C */
    public final void m11765C() {
        if (m11767k()) {
            return;
        }
        bt0.z(new Animator[]{bt0.l(this.f10203d.f4402d, View.ALPHA, 0L, 300L, new DecelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f10203d.f4402d, View.TRANSLATION_Y, 0L, 300L, new DecelerateInterpolator(), new float[]{-t100.d(20.0f), 0.0f})}).start();
    }

    /* JADX INFO: renamed from: j */
    public boolean m11766j() {
        if (!o3i.m12438h()) {
            return false;
        }
        qib0.b0.d.mo1246Tg().subscribe(mkd0.G(new e30() { // from class: l.g3i
            public final void call(Object obj) {
                this.f8338a.m11772q((xaj0) obj);
            }
        }));
        if (!this.f10207h) {
            return false;
        }
        if (((Long) this.f10200a.get()).longValue() == 0) {
            return true;
        }
        return !a5i.m8414n(((Long) this.f10200a.get()).longValue());
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11767k() {
        FeedStatusPostGuidePopView feedStatusPostGuidePopView;
        return this.f10202c == null || (feedStatusPostGuidePopView = this.f10203d) == null || feedStatusPostGuidePopView.m6932a0();
    }

    /* JADX INFO: renamed from: l */
    public void m11768l() {
        e51.J(this.f10206g);
        this.f10206g.run();
    }

    /* JADX INFO: renamed from: n */
    public final int m11769n(Act act) {
        int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m11770o() {
        cwf0 cwf0Var = new cwf0("p_fast_state_post", m3i.class.getName());
        this.f10201b = cwf0Var;
        cwf0Var.p(new j760[]{vwb.Y("refer_source", this.f10205f), vwb.Y(MomentMessageType.question, this.f10204e.question)});
        this.f10201b.i();
        this.f10201b.l();
    }

    /* JADX INFO: renamed from: p */
    public final void m11771p(Act act) {
        if (this.f10202c == null) {
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(o6c0.f11329w3, (ViewGroup) null), xdl0.y0(), t100.d(236.0f), false);
            this.f10202c = popupWindow;
            this.f10203d = (FeedStatusPostGuidePopView) popupWindow.getContentView().findViewById(b5c0.f5948B0);
            if (m11767k()) {
                return;
            }
            this.f10203d.f4405g.setTypeface(eqh0.c(3), 1);
            this.f10202c.setClippingEnabled(false);
            this.f10203d.f4402d.setClickable(true);
            xdl0.E0(this.f10203d.f4406h, new View.OnClickListener() { // from class: l.h3i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8569a.m11773r(view);
                }
            });
            xdl0.E0(this.f10203d.f4409k, new View.OnClickListener() { // from class: l.i3i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8884a.m11774s(view);
                }
            });
            xdl0.E0(this.f10203d.f4404f, new View.OnClickListener() { // from class: l.j3i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9210a.m11775t(view);
                }
            });
            this.f10202c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.k3i
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f9586a.m11776u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m11772q(xaj0 xaj0Var) {
        if (xaj0Var == null || xaj0Var.a == null) {
            this.f10207h = true;
        } else {
            this.f10207h = false;
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m11773r(View view) {
        m11779x(this.f10204e.stateOptions.get(0));
        m11768l();
        p6j0.m12912b("e_set_my_state_post", "p_fast_state_post", p6j0.C2456a.m12922g(MomentMessageType.question, this.f10204e.question), p6j0.C2456a.m12922g("options", this.f10204e.stateOptions.get(0).option));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m11774s(View view) {
        m11779x(this.f10204e.stateOptions.get(1));
        m11768l();
        p6j0.m12912b("e_set_my_state_post", "p_fast_state_post", p6j0.C2456a.m12922g(MomentMessageType.question, this.f10204e.question), p6j0.C2456a.m12922g("options", this.f10204e.stateOptions.get(1).option));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m11775t(View view) {
        m11768l();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m11776u() {
        cwf0 cwf0Var = this.f10201b;
        if (cwf0Var == null) {
            return;
        }
        cwf0Var.k();
        this.f10201b.j();
    }

    /* JADX INFO: renamed from: w */
    public void m11778w() {
        f10198i = null;
        f10199j = null;
    }

    /* JADX INFO: renamed from: x */
    public final void m11779x(StateOption stateOption) {
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
        FeedModule.f317e.m10712V0(bubbleInfo, "p_fast_state_post");
    }

    /* JADX INFO: renamed from: y */
    public final void m11780y() {
        Emotion emotion;
        StateQuestion stateQuestionM12432b = o3i.m12432b();
        this.f10204e = stateQuestionM12432b;
        if (stateQuestionM12432b == null || vwb.J(stateQuestionM12432b.stateOptions) || m11767k()) {
            return;
        }
        for (StateOption stateOption : this.f10204e.stateOptions) {
            if (stateOption == null || (emotion = stateOption.stateEmotion) == null || TextUtils.isEmpty(emotion.emojiUrl)) {
                return;
            }
        }
        m11770o();
        xdl0.M(this.f10203d.f4406h, false);
        xdl0.M(this.f10203d.f4409k, false);
        List<StateOption> list = this.f10204e.stateOptions;
        if (list.size() >= 1) {
            xdl0.M(this.f10203d.f4406h, true);
            this.f10203d.f4408j.setText(list.get(0).option);
            qib0.G.L0(this.f10203d.f4407i, list.get(0).stateEmotion.emojiUrl);
        }
        if (list.size() >= 2) {
            xdl0.M(this.f10203d.f4409k, true);
            this.f10203d.f4411m.setText(list.get(1).option);
            qib0.G.L0(this.f10203d.f4410l, list.get(1).stateEmotion.emojiUrl);
        }
        this.f10203d.f4405g.setText(this.f10204e.question);
        this.f10203d.f4412n.setText("点击即可发布状态");
        if (NullChecker.a(f10199j)) {
            qib0.G.J0(this.f10203d.f4414p, f10199j.m1042fp().profileMiddle(), false);
        }
        qib0.G.Y0(this.f10203d.f4415q, f3c0.f7620H0);
    }

    /* JADX INFO: renamed from: z */
    public void m11781z(final Act act, String str) {
        Window window;
        View decorView;
        this.f10205f = str;
        if (act == null || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new Runnable() { // from class: l.f3i
            @Override // java.lang.Runnable
            public final void run() {
                this.f7964a.m11777v(act);
            }
        });
    }
}
