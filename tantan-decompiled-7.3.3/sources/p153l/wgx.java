package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MatchPopAnim;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class wgx implements ryl {

    /* JADX INFO: renamed from: p */
    public static volatile wgx f189027p;

    /* JADX INFO: renamed from: a */
    public String f189028a;

    /* JADX INFO: renamed from: b */
    public MatchPopAnim f189029b;

    /* JADX INFO: renamed from: d */
    public l4g0 f189031d;

    /* JADX INFO: renamed from: e */
    public GestureDetector f189032e;

    /* JADX INFO: renamed from: f */
    public PopupWindow f189033f;

    /* JADX INFO: renamed from: g */
    public syl f189034g;

    /* JADX INFO: renamed from: h */
    public LinkedList<User> f189035h;

    /* JADX INFO: renamed from: i */
    public User f189036i;

    /* JADX INFO: renamed from: j */
    public long f189037j;

    /* JADX INFO: renamed from: k */
    public boolean f189038k;

    /* JADX INFO: renamed from: l */
    public long f189039l;

    /* JADX INFO: renamed from: m */
    public boolean f189040m;

    /* JADX INFO: renamed from: n */
    public boolean f189041n;

    /* JADX INFO: renamed from: c */
    public int f189030c = 1;

    /* JADX INFO: renamed from: o */
    public Runnable f189042o = new RunnableC21111f();

    /* JADX INFO: renamed from: l.wgx$a */
    public class C21106a implements PopupWindow.OnDismissListener {
        public C21106a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (wgx.this.f189031d == null) {
                return;
            }
            wgx.this.f189031d.m152776k();
            wgx.this.f189031d.m152775j();
        }
    }

    /* JADX INFO: renamed from: l.wgx$b */
    public class RunnableC21107b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f189044a;

        public RunnableC21107b(Act act) {
            this.f189044a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            wgx.this.mo183612a(this.f189044a, false);
        }
    }

    /* JADX INFO: renamed from: l.wgx$c */
    public class RunnableC21108c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f189046a;

        public RunnableC21108c(Act act) {
            this.f189046a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            wgx.this.mo183612a(this.f189046a, false);
        }
    }

    /* JADX INFO: renamed from: l.wgx$d */
    public class RunnableC21109d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f189048a;

        public RunnableC21109d(Act act) {
            this.f189048a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            wgx.this.mo183612a(this.f189048a, false);
        }
    }

    /* JADX INFO: renamed from: l.wgx$e */
    public class RunnableC21110e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f189050a;

        public RunnableC21110e(Animator animator) {
            this.f189050a = animator;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f189050a.removeAllListeners();
            this.f189050a.removeAllListeners();
            wgx.this.f189042o.run();
        }
    }

    /* JADX INFO: renamed from: l.wgx$f */
    public class RunnableC21111f implements Runnable {
        public RunnableC21111f() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m206322b() {
            if (wgx.this.f189033f != null && wgx.this.f189033f.isShowing()) {
                wgx.this.f189033f.dismiss();
            }
            wgx.this.f189033f = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m82486a(wgx.this.f189034g) && NullChecker.m82486a(wgx.this.f189033f)) {
                wgx.this.f189034g.mo48928N(new Runnable() { // from class: l.vgx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f184068a.m206322b();
                    }
                });
            }
            wgx.this.f189035h = null;
            wgx.this.f189036i = null;
            wgx.this.f189038k = false;
            wgx.this.f189032e = null;
            wgx.this.f189041n = false;
        }
    }

    /* JADX INFO: renamed from: l.wgx$g */
    public class C21112g implements qcj<uxj0, User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f189053a;

        public C21112g(String str) {
            this.f189053a = str;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public User call(uxj0 uxj0Var) {
            return CoreModule.f18264c.f20381e0.m116503Pa(this.f189053a);
        }
    }

    /* JADX INFO: renamed from: l.wgx$h */
    public class C21113h implements y20<User> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f189055a;

        public C21113h(Act act) {
            this.f189055a = act;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(User user) {
            if (w20.m204491f(this.f189055a) && ji30.m144964h() == TabName.Card) {
                Act act = this.f189055a;
                if ((act instanceof NewMainAct) && ((NewMainAct) act).m40824k6()) {
                    wgx.this.m206311K(this.f189055a, user, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.wgx$j */
    public class RunnableC21115j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f189058a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f189059b;

        public RunnableC21115j(Act act, User user) {
            this.f189058a = act;
            this.f189059b = user;
        }

        @Override // java.lang.Runnable
        public void run() {
            wgx.this.m206313M(this.f189058a, this.f189059b);
        }
    }

    /* JADX INFO: renamed from: l.wgx$k */
    public class RunnableC21116k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f189061a;

        public RunnableC21116k(Act act) {
            this.f189061a = act;
        }

        @Override // java.lang.Runnable
        public void run() {
            wgx.this.mo183612a(this.f189061a, false);
        }
    }

    /* JADX INFO: renamed from: l.wgx$m */
    public class ViewOnTouchListenerC21118m implements View.OnTouchListener {
        public ViewOnTouchListenerC21118m() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (NullChecker.m82486a(wgx.this.f189032e)) {
                return wgx.this.f189032e.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.wgx$n */
    public class C21119n implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f189066a;

        public C21119n(Act act) {
            this.f189066a = act;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i != 112) {
                return false;
            }
            if (i2 == 100 && NullChecker.m82486a(intent)) {
                d810.m114775h(this.f189066a, wgx.this.f189036i, intent.getStringExtra("input"), true, null);
                wgx.this.f189040m = false;
                wgx.this.mo183612a(this.f189066a, true);
            } else {
                wgx.this.f189040m = false;
                wgx.this.m206308H(this.f189066a);
            }
            return true;
        }
    }

    public wgx() {
        try {
            if (this.f189029b == null) {
                m206303C();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static wgx m206283A() {
        if (f189027p == null) {
            synchronized (wgx.class) {
                try {
                    if (f189027p == null) {
                        f189027p = new wgx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f189027p;
    }

    /* JADX INFO: renamed from: B */
    public static int m206284B(Act act) {
        int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m206303C() {
        MatchPopAnim matchPopAnimNew_ = MatchPopAnim.new_();
        this.f189029b = matchPopAnimNew_;
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
    public final void m206304D(User user) {
        String str;
        if (user == null) {
            return;
        }
        String str2 = this.f189041n ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f189028a)) {
            str2 = this.f189028a;
            str = TextUtils.equals(str2, "long_time_no_see") ? "female" : str2;
        }
        this.f189031d = new l4g0("p_successful_match_view", wgx.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("match_source", this.f189041n ? "negative" : "positive");
            jSONObject.put("moments_user_id", user.f56859id);
            jSONObject.put("matched_received_page_type", str);
            if (gra.m131740r1()) {
                jSONObject.put("is_matched_longtimenosee", TextUtils.equals(this.f189028a, "long_time_no_see") ? 1 : 0);
            }
            this.f189031d.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.f189031d.m152774i();
        this.f189031d.m152777l();
        sfj0.m185601h("e_matched_text_box", "p_successful_match_view", new sfj0.C20032a[0]);
        sfj0.m185601h("e_matched_later", "p_successful_match_view", new sfj0.C20032a[0]);
        sfj0.m185601h("e_matched_push_other_area", "p_successful_match_view", sfj0.C20032a.m185615h("matched_received_page_type", str));
        sfj0.m185601h("e_match_emoji", "p_successful_match_view", sfj0.C20032a.m185613f("emoji_quantity", 3));
    }

    /* JADX INFO: renamed from: E */
    public final void m206305E(User user, Act act) {
        if (this.f189032e == null) {
            this.f189032e = new GestureDetector(act, new GestureDetectorOnGestureListenerC21117l(act));
        }
        if (this.f189033f == null) {
            this.f189037j = SystemClock.elapsedRealtime();
            int i = kec0.f125864h8;
            int iM175859d = qa00.m175859d(236.0f);
            if (gra.m131634U2()) {
                i = kec0.f125881i8;
                iM175859d = qa00.m175859d(100.0f);
            }
            PopupWindow popupWindow = new PopupWindow(act.inflater().inflate(i, (ViewGroup) null), bnl0.m105592y0(), iM175859d, false);
            this.f189033f = popupWindow;
            syl sylVar = (syl) popupWindow.getContentView().findViewById(adc0.f69998L6);
            this.f189034g = sylVar;
            sylVar.mo48939x(this);
            if (m206317w()) {
                return;
            }
            this.f189034g.mo48936r();
            this.f189033f.setClippingEnabled(false);
            this.f189034g.getRootView().setClickable(true);
            this.f189034g.getRootView().setOnTouchListener(new ViewOnTouchListenerC21118m());
            act.registerOnActivityResultListener(new C21119n(act));
            this.f189033f.setOnDismissListener(new C21106a());
        }
        m206304D(user);
    }

    /* JADX INFO: renamed from: F */
    public final void m206306F(Act act) {
        User user = this.f189036i;
        if (user == null) {
            return;
        }
        act.startActivity(MessagesAct.m50127l2(act, user.f56859id, false, false, 2));
        String str = this.f189041n ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f189028a)) {
            str = this.f189028a;
        }
        sfj0.m185596c("e_matched_push_other_area", "p_successful_match_view", sfj0.C20032a.m185615h("matched_received_page_type", str));
        l51.m152890J(this.f189042o);
        this.f189042o.run();
    }

    /* JADX INFO: renamed from: G */
    public final void m206307G(User user, Act act) {
        this.f189034g.mo48937s();
        m206319y(user);
        l51.m152888H(act, new RunnableC21109d(act), this.f189030c * 2000);
    }

    /* JADX INFO: renamed from: H */
    public final void m206308H(Act act) {
        PopupWindow popupWindow = this.f189033f;
        if (popupWindow == null || !popupWindow.isShowing() || jyb.m147479J(this.f189035h)) {
            l51.m152888H(act, new RunnableC21108c(act), this.f189030c * 3800);
        } else {
            l51.m152888H(act, new RunnableC21107b(act), this.f189030c * 500);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m206309I() {
        f189027p = null;
    }

    /* JADX INFO: renamed from: J */
    public final void m206310J(User user, boolean z) {
        if (user == null) {
            return;
        }
        this.f189036i = user;
        if (m206317w()) {
            return;
        }
        this.f189034g.mo48938w(user, z);
    }

    /* JADX INFO: renamed from: K */
    public void m206311K(Act act, User user, boolean z) {
        m206312L(act, user, z, "");
    }

    /* JADX INFO: renamed from: L */
    public void m206312L(Act act, User user, boolean z, String str) {
        Window window;
        View decorView;
        this.f189028a = str;
        if (act == null || hlh0.m135741a().m135745e() || (window = act.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        this.f189041n = z;
        decorView.post(new RunnableC21115j(act, user));
    }

    /* JADX INFO: renamed from: M */
    public final void m206313M(Act act, User user) {
        if (act == null || user == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        m206305E(user, act);
        PopupWindow popupWindow = this.f189033f;
        if (popupWindow == null) {
            return;
        }
        if (popupWindow.isShowing()) {
            if (this.f189035h == null) {
                this.f189035h = new LinkedList<>();
            }
            this.f189035h.add(user);
        } else {
            l51.m152890J(this.f189042o);
            m206310J(user, false);
            this.f189033f.showAtLocation(act.getWindow().getDecorView(), 49, 0, m206284B(act));
            m206315O();
            l51.m152888H(act, new RunnableC21116k(act), this.f189030c * 3800);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m206314N(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Act actM206320z = m206320z();
        if (w20.m204491f(actM206320z)) {
            this.f189041n = true;
            actM206320z.duringCreated(CoreModule.f18264c.f20384f0.m33653Fo()).map(new C21112g(str)).subscribe(psd0.m173597H(new C21113h(actM206320z), new C21114i()));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m206315O() {
        this.f189034g.mo48929V();
    }

    /* JADX INFO: renamed from: P */
    public final void m206316P() {
        Runnable runnable = this.f189042o;
        if (runnable == null || this.f189033f == null) {
            return;
        }
        l51.m152890J(runnable);
        Animator animatorM132166l = gt0.m132166l(this.f189033f.getContentView(), View.TRANSLATION_Y, 0L, 200L, new AccelerateInterpolator(), 0.0f, -qa00.m175859d(236.0f));
        gt0.m132160f(animatorM132166l, new RunnableC21110e(animatorM132166l));
        animatorM132166l.start();
    }

    @Override // p153l.ryl
    /* JADX INFO: renamed from: a */
    public void mo183612a(Act act, boolean z) {
        if (this.f189040m) {
            return;
        }
        PopupWindow popupWindow = this.f189033f;
        if (popupWindow == null || !popupWindow.isShowing() || jyb.m147479J(this.f189035h)) {
            m206318x(z);
        } else {
            m206307G(this.f189035h.pop(), act);
        }
    }

    @Override // p153l.ryl
    /* JADX INFO: renamed from: b */
    public void mo183613b(boolean z) {
        this.f189040m = z;
    }

    @Override // p153l.ryl
    /* JADX INFO: renamed from: c */
    public void mo183614c(boolean z) {
        m206318x(z);
    }

    @Override // p153l.ryl
    /* JADX INFO: renamed from: f */
    public User mo183615f() {
        return this.f189036i;
    }

    @Override // p153l.ryl
    public MatchPopAnim getConfig() {
        return this.f189029b;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m206317w() {
        syl sylVar;
        return this.f189033f == null || (sylVar = this.f189034g) == null || sylVar.mo48930a0();
    }

    /* JADX INFO: renamed from: x */
    public void m206318x(boolean z) {
        if (z || SystemClock.elapsedRealtime() - this.f189037j >= 3800) {
            l51.m152890J(this.f189042o);
            this.f189042o.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m206319y(User user) {
        if (System.currentTimeMillis() - this.f189039l < 500 || m206317w()) {
            return;
        }
        this.f189039l = System.currentTimeMillis();
        this.f189034g.mo48927E(user);
    }

    /* JADX INFO: renamed from: z */
    public final Act m206320z() {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (NullChecker.m82486a(c4450rForeground_) && NullChecker.m82486a(c4450rForeground_.f16062a) && NullChecker.m82486a(c4450rForeground_.f16062a.get()) && (c4450rForeground_.f16062a.get() instanceof Act)) {
            return (Act) c4450rForeground_.f16062a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: l.wgx$i */
    public class C21114i implements y20<Throwable> {
        public C21114i() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: l.wgx$l */
    public class GestureDetectorOnGestureListenerC21117l implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f189063a;

        public GestureDetectorOnGestureListenerC21117l(Act act) {
            this.f189063a = act;
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
            if (wgx.this.f189038k) {
                return false;
            }
            wgx.this.f189038k = true;
            if (f2 > 0.0f) {
                wgx.this.m206316P();
                return true;
            }
            if (f2 != 0.0f) {
                return false;
            }
            wgx.this.m206306F(this.f189063a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (wgx.this.f189038k) {
                return false;
            }
            wgx.this.f189038k = true;
            wgx.this.m206306F(this.f189063a);
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
