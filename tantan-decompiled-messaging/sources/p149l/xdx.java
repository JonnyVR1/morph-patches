package p149l;

import android.animation.Animator;
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
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MatchPopAnim;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class xdx implements zvl {

    /* JADX INFO: renamed from: p */
    public static volatile xdx f192471p;

    /* JADX INFO: renamed from: a */
    public String f192472a;

    /* JADX INFO: renamed from: b */
    public MatchPopAnim f192473b;

    /* JADX INFO: renamed from: d */
    public cwf0 f192475d;

    /* JADX INFO: renamed from: e */
    public GestureDetector f192476e;

    /* JADX INFO: renamed from: f */
    public PopupWindow f192477f;

    /* JADX INFO: renamed from: g */
    public awl f192478g;

    /* JADX INFO: renamed from: h */
    public LinkedList<User> f192479h;

    /* JADX INFO: renamed from: i */
    public User f192480i;

    /* JADX INFO: renamed from: j */
    public long f192481j;

    /* JADX INFO: renamed from: k */
    public boolean f192482k;

    /* JADX INFO: renamed from: l */
    public long f192483l;

    /* JADX INFO: renamed from: m */
    public boolean f192484m;

    /* JADX INFO: renamed from: n */
    public boolean f192485n;

    /* JADX INFO: renamed from: c */
    public int f192474c = 1;

    /* JADX INFO: renamed from: o */
    public Runnable f192486o = new RunnableC21111f();

    /* JADX INFO: renamed from: l.xdx$a */
    public class C21106a implements PopupWindow.OnDismissListener {
        public C21106a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (xdx.this.f192475d == null) {
                return;
            }
            xdx.this.f192475d.m109035k();
            xdx.this.f192475d.m109034j();
        }
    }

    /* JADX INFO: renamed from: l.xdx$b */
    public class RunnableC21107b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192488a;

        public RunnableC21107b(Act act) {
            this.f192488a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.mo208467a(this.f192488a, false);
        }
    }

    /* JADX INFO: renamed from: l.xdx$c */
    public class RunnableC21108c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192490a;

        public RunnableC21108c(Act act) {
            this.f192490a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.mo208467a(this.f192490a, false);
        }
    }

    /* JADX INFO: renamed from: l.xdx$d */
    public class RunnableC21109d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192492a;

        public RunnableC21109d(Act act) {
            this.f192492a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.mo208467a(this.f192492a, false);
        }
    }

    /* JADX INFO: renamed from: l.xdx$e */
    public class RunnableC21110e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f192494a;

        public RunnableC21110e(Animator animator) {
            this.f192494a = animator;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f192494a.removeAllListeners();
            this.f192494a.removeAllListeners();
            xdx.this.f192486o.run();
        }
    }

    /* JADX INFO: renamed from: l.xdx$f */
    public class RunnableC21111f implements Runnable {
        public RunnableC21111f() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m208476b() {
            if (xdx.this.f192477f != null && xdx.this.f192477f.isShowing()) {
                xdx.this.f192477f.dismiss();
            }
            xdx.this.f192477f = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m81303a(xdx.this.f192478g) && NullChecker.m81303a(xdx.this.f192477f)) {
                xdx.this.f192478g.mo47745N(new Runnable() { // from class: l.wdx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f185894a.m208476b();
                    }
                });
            }
            xdx.this.f192479h = null;
            xdx.this.f192480i = null;
            xdx.this.f192482k = false;
            xdx.this.f192476e = null;
            xdx.this.f192485n = false;
        }
    }

    /* JADX INFO: renamed from: l.xdx$g */
    public class C21112g implements w9j<roj0, User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f192497a;

        public C21112g(String str) {
            this.f192497a = str;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(roj0 roj0Var) {
            return CoreModule.f17545c.f19639e0.m169430Pa(this.f192497a);
        }
    }

    /* JADX INFO: renamed from: l.xdx$h */
    public class C21113h implements e30<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192499a;

        public C21113h(Act act) {
            this.f192499a = act;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            if (c30.m104964f(this.f192499a) && v930.m197534h() == TabName.Card) {
                Act act = this.f192499a;
                if ((act instanceof NewMainAct) && ((NewMainAct) act).m39816g6()) {
                    xdx.this.m208461K(this.f192499a, user, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.xdx$j */
    public class RunnableC21115j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192502a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f192503b;

        public RunnableC21115j(Act act, User user) {
            this.f192502a = act;
            this.f192503b = user;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.m208463M(this.f192502a, this.f192503b);
        }
    }

    /* JADX INFO: renamed from: l.xdx$k */
    public class RunnableC21116k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192505a;

        public RunnableC21116k(Act act) {
            this.f192505a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            xdx.this.mo208467a(this.f192505a, false);
        }
    }

    /* JADX INFO: renamed from: l.xdx$m */
    public class ViewOnTouchListenerC21118m implements View.OnTouchListener {
        public ViewOnTouchListenerC21118m() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (NullChecker.m81303a(xdx.this.f192476e)) {
                return xdx.this.f192476e.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.xdx$n */
    public class C21119n implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192510a;

        public C21119n(Act act) {
            this.f192510a = act;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i != 112) {
                return false;
            }
            if (i2 == 100 && NullChecker.m81303a(intent)) {
                tz00.m191126h(this.f192510a, xdx.this.f192480i, intent.getStringExtra("input"), true, null);
                xdx.this.f192484m = false;
                xdx.this.mo208467a(this.f192510a, true);
            } else {
                xdx.this.f192484m = false;
                xdx.this.m208458H(this.f192510a);
            }
            return true;
        }
    }

    public xdx() {
        try {
            if (this.f192473b == null) {
                m208453C();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static xdx m208433A() {
        if (f192471p == null) {
            synchronized (xdx.class) {
                try {
                    if (f192471p == null) {
                        f192471p = new xdx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192471p;
    }

    /* JADX INFO: renamed from: B */
    public static int m208434B(Act act) {
        int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m208453C() {
        MatchPopAnim matchPopAnimNew_ = MatchPopAnim.new_();
        this.f192473b = matchPopAnimNew_;
        matchPopAnimNew_.popEnter = 300;
        matchPopAnimNew_.popOut = 300;
        matchPopAnimNew_.speed = 1;
        matchPopAnimNew_.avatarDelay = 200;
        matchPopAnimNew_.avatarX = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        matchPopAnimNew_.avatarAlpha = 100;
        matchPopAnimNew_.delaySpeed = 1;
        matchPopAnimNew_.avatarTransX = 20;
        matchPopAnimNew_.avatarRepeatTransX = 12;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022 A[PHI: r1
      0x0022: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:10:0x0017, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: D */
    public final void m208454D(User user) {
        String str;
        if (user == null) {
            return;
        }
        String str2 = this.f192485n ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f192472a)) {
            str2 = this.f192472a;
            str = TextUtils.equals(str2, "long_time_no_see") ? "female" : str2;
        }
        this.f192475d = new cwf0("p_successful_match_view", xdx.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("match_source", this.f192485n ? "negative" : "positive");
            jSONObject.put("moments_user_id", user.f56011id);
            jSONObject.put("matched_received_page_type", str);
            if (upa.m194809r1()) {
                jSONObject.put("is_matched_longtimenosee", TextUtils.equals(this.f192472a, "long_time_no_see") ? 1 : 0);
            }
            this.f192475d.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.f192475d.m109033i();
        this.f192475d.m109036l();
        o6j0.m162864h("e_matched_text_box", "p_successful_match_view", new o6j0.C18854a[0]);
        o6j0.m162864h("e_matched_later", "p_successful_match_view", new o6j0.C18854a[0]);
        o6j0.m162864h("e_matched_push_other_area", "p_successful_match_view", o6j0.C18854a.m162878h("matched_received_page_type", str));
        o6j0.m162864h("e_match_emoji", "p_successful_match_view", o6j0.C18854a.m162876f("emoji_quantity", 3));
    }

    /* JADX INFO: renamed from: E */
    public final void m208455E(User user, Act act) {
        if (this.f192476e == null) {
            this.f192476e = new GestureDetector(act, new GestureDetectorOnGestureListenerC21117l(act));
        }
        if (this.f192477f == null) {
            this.f192481j = SystemClock.elapsedRealtime();
            int i = f6c0.f95691a8;
            int iM186890d = t100.m186890d(236.0f);
            if (upa.m194703U2()) {
                i = f6c0.f95708b8;
                iM186890d = t100.m186890d(100.0f);
            }
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(i, (ViewGroup) null), xdl0.m208412y0(), iM186890d, false);
            this.f192477f = popupWindow;
            awl awlVar = (awl) popupWindow.getContentView().findViewById(u4c0.f173876J6);
            this.f192478g = awlVar;
            awlVar.mo47756x(this);
            if (m208471w()) {
                return;
            }
            this.f192478g.mo47753r();
            this.f192477f.setClippingEnabled(false);
            this.f192478g.getRootView().setClickable(true);
            this.f192478g.getRootView().setOnTouchListener(new ViewOnTouchListenerC21118m());
            act.registerOnActivityResultListener(new C21119n(act));
            this.f192477f.setOnDismissListener(new C21106a());
        }
        m208454D(user);
    }

    /* JADX INFO: renamed from: F */
    public final void m208456F(Act act) {
        User user = this.f192480i;
        if (user == null) {
            return;
        }
        act.startActivity(MessagesAct.m48944k2(act, user.f56011id, false, false, 2));
        String str = this.f192485n ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f192472a)) {
            str = this.f192472a;
        }
        o6j0.m162859c("e_matched_push_other_area", "p_successful_match_view", o6j0.C18854a.m162878h("matched_received_page_type", str));
        e51.m114745J(this.f192486o);
        this.f192486o.run();
    }

    /* JADX INFO: renamed from: G */
    public final void m208457G(User user, Act act) {
        this.f192478g.mo47754s();
        m208473y(user);
        e51.m114743H(act, new RunnableC21109d(act), this.f192474c * 2000);
    }

    /* JADX INFO: renamed from: H */
    public final void m208458H(Act act) {
        PopupWindow popupWindow = this.f192477f;
        if (popupWindow == null || !popupWindow.isShowing() || vwb.m200296J(this.f192479h)) {
            e51.m114743H(act, new RunnableC21108c(act), this.f192474c * 3800);
        } else {
            e51.m114743H(act, new RunnableC21107b(act), this.f192474c * 500);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m208459I() {
        f192471p = null;
    }

    /* JADX INFO: renamed from: J */
    public final void m208460J(User user, boolean z) {
        if (user == null) {
            return;
        }
        this.f192480i = user;
        if (m208471w()) {
            return;
        }
        this.f192478g.mo47755w(user, z);
    }

    /* JADX INFO: renamed from: K */
    public void m208461K(Act act, User user, boolean z) {
        m208462L(act, user, z, "");
    }

    /* JADX INFO: renamed from: L */
    public void m208462L(Act act, User user, boolean z, String str) {
        Window window;
        View decorView;
        this.f192472a = str;
        if (act == null || zch0.m218024a().m218028e() || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        this.f192485n = z;
        decorView.post(new RunnableC21115j(act, user));
    }

    /* JADX INFO: renamed from: M */
    public final void m208463M(Act act, User user) {
        if (act == null || user == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        m208455E(user, act);
        PopupWindow popupWindow = this.f192477f;
        if (popupWindow == null) {
            return;
        }
        if (popupWindow.isShowing()) {
            if (this.f192479h == null) {
                this.f192479h = new LinkedList<>();
            }
            this.f192479h.add(user);
        } else {
            e51.m114745J(this.f192486o);
            m208460J(user, false);
            this.f192477f.showAtLocation(act.getWindow().getDecorView(), 49, 0, m208434B(act));
            m208465O();
            e51.m114743H(act, new RunnableC21116k(act), this.f192474c * 3800);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m208464N(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Act actM208474z = m208474z();
        if (c30.m104964f(actM208474z)) {
            this.f192485n = true;
            actM208474z.duringCreated(CoreModule.f17545c.f19642f0.m32650Fo()).map(new C21112g(str)).subscribe(mkd0.m154956H(new C21113h(actM208474z), new C21114i()));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m208465O() {
        this.f192478g.mo47746V();
    }

    /* JADX INFO: renamed from: P */
    public final void m208466P() {
        Runnable runnable = this.f192486o;
        if (runnable == null || this.f192477f == null) {
            return;
        }
        e51.m114745J(runnable);
        Animator animatorM103739l = bt0.m103739l(this.f192477f.getContentView(), View.TRANSLATION_Y, 0L, 200L, new AccelerateInterpolator(), 0.0f, -t100.m186890d(236.0f));
        bt0.m103733f(animatorM103739l, new RunnableC21110e(animatorM103739l));
        animatorM103739l.start();
    }

    @Override // p149l.zvl
    /* JADX INFO: renamed from: a */
    public void mo208467a(Act act, boolean z) {
        if (this.f192484m) {
            return;
        }
        PopupWindow popupWindow = this.f192477f;
        if (popupWindow == null || !popupWindow.isShowing() || vwb.m200296J(this.f192479h)) {
            m208472x(z);
        } else {
            m208457G(this.f192479h.pop(), act);
        }
    }

    @Override // p149l.zvl
    /* JADX INFO: renamed from: b */
    public void mo208468b(boolean z) {
        this.f192484m = z;
    }

    @Override // p149l.zvl
    /* JADX INFO: renamed from: c */
    public void mo208469c(boolean z) {
        m208472x(z);
    }

    @Override // p149l.zvl
    /* JADX INFO: renamed from: f */
    public User mo208470f() {
        return this.f192480i;
    }

    @Override // p149l.zvl
    public MatchPopAnim getConfig() {
        return this.f192473b;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m208471w() {
        awl awlVar;
        return this.f192477f == null || (awlVar = this.f192478g) == null || awlVar.mo47747a0();
    }

    /* JADX INFO: renamed from: x */
    public void m208472x(boolean z) {
        if (z || SystemClock.elapsedRealtime() - this.f192481j >= 3800) {
            e51.m114745J(this.f192486o);
            this.f192486o.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m208473y(User user) {
        if (System.currentTimeMillis() - this.f192483l < 500 || m208471w()) {
            return;
        }
        this.f192483l = System.currentTimeMillis();
        this.f192478g.mo47744E(user);
    }

    /* JADX INFO: renamed from: z */
    public final Act m208474z() {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (NullChecker.m81303a(c4299rForeground_) && NullChecker.m81303a(c4299rForeground_.f15343a) && NullChecker.m81303a(c4299rForeground_.f15343a.get()) && (c4299rForeground_.f15343a.get() instanceof Act)) {
            return (Act) c4299rForeground_.f15343a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: l.xdx$i */
    public class C21114i implements e30<Throwable> {
        public C21114i() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: l.xdx$l */
    public class GestureDetectorOnGestureListenerC21117l implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f192507a;

        public GestureDetectorOnGestureListenerC21117l(Act act) {
            this.f192507a = act;
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
            if (xdx.this.f192482k) {
                return false;
            }
            xdx.this.f192482k = true;
            if (f2 > 0.0f) {
                xdx.this.m208466P();
                return true;
            }
            if (f2 != 0.0f) {
                return false;
            }
            xdx.this.m208456F(this.f192507a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (xdx.this.f192482k) {
                return false;
            }
            xdx.this.f192482k = true;
            xdx.this.m208456F(this.f192507a);
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
