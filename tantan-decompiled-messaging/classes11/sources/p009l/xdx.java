package p009l;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MatchPopAnim;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import l.awl;
import l.bt0;
import l.c30;
import l.cwf0;
import l.e30;
import l.e51;
import l.f6c0;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.t100;
import l.u4c0;
import l.upa;
import l.v930;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xdx implements zvl {

    /* JADX INFO: renamed from: p */
    public static volatile xdx f22526p;

    /* JADX INFO: renamed from: a */
    public String f22527a;

    /* JADX INFO: renamed from: b */
    public MatchPopAnim f22528b;

    /* JADX INFO: renamed from: d */
    public cwf0 f22530d;

    /* JADX INFO: renamed from: e */
    public GestureDetector f22531e;

    /* JADX INFO: renamed from: f */
    public PopupWindow f22532f;

    /* JADX INFO: renamed from: g */
    public awl f22533g;

    /* JADX INFO: renamed from: h */
    public LinkedList<User> f22534h;

    /* JADX INFO: renamed from: i */
    public User f22535i;

    /* JADX INFO: renamed from: j */
    public long f22536j;

    /* JADX INFO: renamed from: k */
    public boolean f22537k;

    /* JADX INFO: renamed from: l */
    public long f22538l;

    /* JADX INFO: renamed from: m */
    public boolean f22539m;

    /* JADX INFO: renamed from: n */
    public boolean f22540n;

    /* JADX INFO: renamed from: c */
    public int f22529c = 1;

    /* JADX INFO: renamed from: o */
    public Runnable f22541o = new RunnableC1305f();

    /* JADX INFO: renamed from: l.xdx$a */
    public class C1300a implements PopupWindow.OnDismissListener {
        public C1300a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (xdx.this.f22530d == null) {
                return;
            }
            xdx.this.f22530d.k();
            xdx.this.f22530d.j();
        }
    }

    /* JADX INFO: renamed from: l.xdx$b */
    public class RunnableC1301b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f22543a;

        public RunnableC1301b(Act act) {
            this.f22543a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.m24812a(this.f22543a, false);
        }
    }

    /* JADX INFO: renamed from: l.xdx$c */
    public class RunnableC1302c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f22545a;

        public RunnableC1302c(Act act) {
            this.f22545a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.m24812a(this.f22545a, false);
        }
    }

    /* JADX INFO: renamed from: l.xdx$d */
    public class RunnableC1303d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f22547a;

        public RunnableC1303d(Act act) {
            this.f22547a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.m24812a(this.f22547a, false);
        }
    }

    /* JADX INFO: renamed from: l.xdx$e */
    public class RunnableC1304e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f22549a;

        public RunnableC1304e(Animator animator) {
            this.f22549a = animator;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22549a.removeAllListeners();
            this.f22549a.removeAllListeners();
            xdx.this.f22541o.run();
        }
    }

    /* JADX INFO: renamed from: l.xdx$f */
    public class RunnableC1305f implements Runnable {
        public RunnableC1305f() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m24821b() {
            if (xdx.this.f22532f != null && xdx.this.f22532f.isShowing()) {
                xdx.this.f22532f.dismiss();
            }
            xdx.this.f22532f = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.a(xdx.this.f22533g) && NullChecker.a(xdx.this.f22532f)) {
                xdx.this.f22533g.N(new Runnable() { // from class: l.wdx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22063a.m24821b();
                    }
                });
            }
            xdx.this.f22534h = null;
            xdx.this.f22535i = null;
            xdx.this.f22537k = false;
            xdx.this.f22531e = null;
            xdx.this.f22540n = false;
        }
    }

    /* JADX INFO: renamed from: l.xdx$g */
    public class C1306g implements w9j<roj0, User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f22552a;

        public C1306g(String str) {
            this.f22552a = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(roj0 roj0Var) {
            return CoreModule.c.e0.Pa(this.f22552a);
        }
    }

    /* JADX INFO: renamed from: l.xdx$h */
    public class C1307h implements e30<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f22554a;

        public C1307h(Act act) {
            this.f22554a = act;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            if (c30.f(this.f22554a) && v930.h() == TabName.Card) {
                NewMainAct newMainAct = this.f22554a;
                if ((newMainAct instanceof NewMainAct) && newMainAct.m3892g6()) {
                    xdx.this.m24806K(this.f22554a, user, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.xdx$j */
    public class RunnableC1309j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f22557a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f22558b;

        public RunnableC1309j(Act act, User user) {
            this.f22557a = act;
            this.f22558b = user;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.m24808M(this.f22557a, this.f22558b);
        }
    }

    /* JADX INFO: renamed from: l.xdx$k */
    public class RunnableC1310k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f22560a;

        public RunnableC1310k(Act act) {
            this.f22560a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.m24812a(this.f22560a, false);
        }
    }

    /* JADX INFO: renamed from: l.xdx$m */
    public class ViewOnTouchListenerC1312m implements View.OnTouchListener {
        public ViewOnTouchListenerC1312m() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (NullChecker.a(xdx.this.f22531e)) {
                return xdx.this.f22531e.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.xdx$n */
    public class C1313n implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f22565a;

        public C1313n(Act act) {
            this.f22565a = act;
        }

        /* JADX INFO: renamed from: a */
        public boolean m24825a(int i, int i2, Intent intent) {
            if (i != 112) {
                return false;
            }
            if (i2 == 100 && NullChecker.a(intent)) {
                tz00.m22702h(this.f22565a, xdx.this.f22535i, intent.getStringExtra("input"), true, null);
                xdx.this.f22539m = false;
                xdx.this.m24812a(this.f22565a, true);
            } else {
                xdx.this.f22539m = false;
                xdx.this.m24803H(this.f22565a);
            }
            return true;
        }
    }

    public xdx() {
        try {
            if (this.f22528b == null) {
                m24798C();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static xdx m24778A() {
        if (f22526p == null) {
            synchronized (xdx.class) {
                try {
                    if (f22526p == null) {
                        f22526p = new xdx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22526p;
    }

    /* JADX INFO: renamed from: B */
    public static int m24779B(Act act) {
        int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m24798C() {
        MatchPopAnim matchPopAnimNew_ = MatchPopAnim.new_();
        this.f22528b = matchPopAnimNew_;
        matchPopAnimNew_.popEnter = 300;
        matchPopAnimNew_.popOut = 300;
        matchPopAnimNew_.speed = 1;
        matchPopAnimNew_.avatarDelay = 200;
        matchPopAnimNew_.avatarX = 1500;
        matchPopAnimNew_.avatarAlpha = 100;
        matchPopAnimNew_.delaySpeed = 1;
        matchPopAnimNew_.avatarTransX = 20;
        matchPopAnimNew_.avatarRepeatTransX = 12;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022 A[PHI: r1
      0x0022: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:10:0x0017, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: D */
    public final void m24799D(User user) {
        String str;
        if (user == null) {
            return;
        }
        String str2 = this.f22540n ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f22527a)) {
            str2 = this.f22527a;
            str = TextUtils.equals(str2, "long_time_no_see") ? "female" : str2;
        }
        this.f22530d = new cwf0("p_successful_match_view", xdx.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("match_source", this.f22540n ? "negative" : "positive");
            jSONObject.put("moments_user_id", ((DbObject) user).id);
            jSONObject.put("matched_received_page_type", str);
            if (upa.r1()) {
                jSONObject.put("is_matched_longtimenosee", TextUtils.equals(this.f22527a, "long_time_no_see") ? 1 : 0);
            }
            this.f22530d.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.f22530d.i();
        this.f22530d.l();
        o6j0.h("e_matched_text_box", "p_successful_match_view", new o6j0.a[0]);
        o6j0.h("e_matched_later", "p_successful_match_view", new o6j0.a[0]);
        o6j0.h("e_matched_push_other_area", "p_successful_match_view", new o6j0.a[]{o6j0.a.h("matched_received_page_type", str)});
        o6j0.h("e_match_emoji", "p_successful_match_view", new o6j0.a[]{o6j0.a.f("emoji_quantity", 3)});
    }

    /* JADX INFO: renamed from: E */
    public final void m24800E(User user, Act act) {
        if (this.f22531e == null) {
            this.f22531e = new GestureDetector((Context) act, (GestureDetector.OnGestureListener) new GestureDetectorOnGestureListenerC1311l(act));
        }
        if (this.f22532f == null) {
            this.f22536j = SystemClock.elapsedRealtime();
            int i = f6c0.a8;
            int iD = t100.d(236.0f);
            if (upa.U2()) {
                i = f6c0.b8;
                iD = t100.d(100.0f);
            }
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(i, (ViewGroup) null), xdl0.y0(), iD, false);
            this.f22532f = popupWindow;
            awl awlVarFindViewById = popupWindow.getContentView().findViewById(u4c0.J6);
            this.f22533g = awlVarFindViewById;
            awlVarFindViewById.x(this);
            if (m24816w()) {
                return;
            }
            this.f22533g.r();
            this.f22532f.setClippingEnabled(false);
            this.f22533g.getRootView().setClickable(true);
            this.f22533g.getRootView().setOnTouchListener(new ViewOnTouchListenerC1312m());
            act.registerOnActivityResultListener(new C1313n(act));
            this.f22532f.setOnDismissListener(new C1300a());
        }
        m24799D(user);
    }

    /* JADX INFO: renamed from: F */
    public final void m24801F(Act act) {
        User user = this.f22535i;
        if (user == null) {
            return;
        }
        act.startActivity(MessagesAct.k2(act, ((DbObject) user).id, false, false, 2));
        String str = this.f22540n ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f22527a)) {
            str = this.f22527a;
        }
        o6j0.c("e_matched_push_other_area", "p_successful_match_view", new o6j0.a[]{o6j0.a.h("matched_received_page_type", str)});
        e51.J(this.f22541o);
        this.f22541o.run();
    }

    /* JADX INFO: renamed from: G */
    public final void m24802G(User user, Act act) {
        this.f22533g.s();
        m24818y(user);
        e51.H(act, new RunnableC1303d(act), this.f22529c * 2000);
    }

    /* JADX INFO: renamed from: H */
    public final void m24803H(Act act) {
        PopupWindow popupWindow = this.f22532f;
        if (popupWindow == null || !popupWindow.isShowing() || vwb.J(this.f22534h)) {
            e51.H(act, new RunnableC1302c(act), this.f22529c * 3800);
        } else {
            e51.H(act, new RunnableC1301b(act), this.f22529c * 500);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m24804I() {
        f22526p = null;
    }

    /* JADX INFO: renamed from: J */
    public final void m24805J(User user, boolean z) {
        if (user == null) {
            return;
        }
        this.f22535i = user;
        if (m24816w()) {
            return;
        }
        this.f22533g.w(user, z);
    }

    /* JADX INFO: renamed from: K */
    public void m24806K(Act act, User user, boolean z) {
        m24807L(act, user, z, "");
    }

    /* JADX INFO: renamed from: L */
    public void m24807L(Act act, User user, boolean z, String str) {
        Window window;
        View decorView;
        this.f22527a = str;
        if (act == null || zch0.m25654a().m25658e() || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        this.f22540n = z;
        decorView.post(new RunnableC1309j(act, user));
    }

    /* JADX INFO: renamed from: M */
    public final void m24808M(Act act, User user) {
        if (act == null || user == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        m24800E(user, act);
        PopupWindow popupWindow = this.f22532f;
        if (popupWindow == null) {
            return;
        }
        if (popupWindow.isShowing()) {
            if (this.f22534h == null) {
                this.f22534h = new LinkedList<>();
            }
            this.f22534h.add(user);
        } else {
            e51.J(this.f22541o);
            m24805J(user, false);
            this.f22532f.showAtLocation(act.getWindow().getDecorView(), 49, 0, m24779B(act));
            m24810O();
            e51.H(act, new RunnableC1310k(act), this.f22529c * 3800);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m24809N(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Act actM24819z = m24819z();
        if (c30.f(actM24819z)) {
            this.f22540n = true;
            actM24819z.duringCreated(CoreModule.c.f0.Fo()).map(new C1306g(str)).subscribe(mkd0.H(new C1307h(actM24819z), new C1308i()));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m24810O() {
        this.f22533g.V();
    }

    /* JADX INFO: renamed from: P */
    public final void m24811P() {
        Runnable runnable = this.f22541o;
        if (runnable == null || this.f22532f == null) {
            return;
        }
        e51.J(runnable);
        Animator animatorL = bt0.l(this.f22532f.getContentView(), View.TRANSLATION_Y, 0L, 200L, new AccelerateInterpolator(), new float[]{0.0f, -t100.d(236.0f)});
        bt0.f(animatorL, new RunnableC1304e(animatorL));
        animatorL.start();
    }

    /* JADX INFO: renamed from: a */
    public void m24812a(Act act, boolean z) {
        if (this.f22539m) {
            return;
        }
        PopupWindow popupWindow = this.f22532f;
        if (popupWindow == null || !popupWindow.isShowing() || vwb.J(this.f22534h)) {
            m24817x(z);
        } else {
            m24802G(this.f22534h.pop(), act);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24813b(boolean z) {
        this.f22539m = z;
    }

    /* JADX INFO: renamed from: c */
    public void m24814c(boolean z) {
        m24817x(z);
    }

    /* JADX INFO: renamed from: f */
    public User m24815f() {
        return this.f22535i;
    }

    public MatchPopAnim getConfig() {
        return this.f22528b;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m24816w() {
        awl awlVar;
        return this.f22532f == null || (awlVar = this.f22533g) == null || awlVar.a0();
    }

    /* JADX INFO: renamed from: x */
    public void m24817x(boolean z) {
        if (z || SystemClock.elapsedRealtime() - this.f22536j >= 3800) {
            e51.J(this.f22541o);
            this.f22541o.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m24818y(User user) {
        if (System.currentTimeMillis() - this.f22538l < 500 || m24816w()) {
            return;
        }
        this.f22538l = System.currentTimeMillis();
        this.f22533g.E(user);
    }

    /* JADX INFO: renamed from: z */
    public final Act m24819z() {
        Act.r rVarForeground_ = Act.foreground_();
        if (NullChecker.a(rVarForeground_) && NullChecker.a(rVarForeground_.a) && NullChecker.a(rVarForeground_.a.get()) && (rVarForeground_.a.get() instanceof Act)) {
            return (Act) rVarForeground_.a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: l.xdx$i */
    public class C1308i implements e30<Throwable> {
        public C1308i() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: l.xdx$l */
    public class GestureDetectorOnGestureListenerC1311l implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f22562a;

        public GestureDetectorOnGestureListenerC1311l(Act act) {
            this.f22562a = act;
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
            if (xdx.this.f22537k) {
                return false;
            }
            xdx.this.f22537k = true;
            if (f2 > 0.0f) {
                xdx.this.m24811P();
                return true;
            }
            if (f2 != 0.0f) {
                return false;
            }
            xdx.this.m24801F(this.f22562a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (xdx.this.f22537k) {
                return false;
            }
            xdx.this.f22537k = true;
            xdx.this.m24801F(this.f22562a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }
    }
}
