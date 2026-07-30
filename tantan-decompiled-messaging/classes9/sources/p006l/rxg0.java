package p006l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade.SendMultiSuperLikeBubbleView;
import com.p000p1.mobile.putong.core.p004ui.superlikeopt.upgrade.SendMultiSuperLikePushBubble;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Map;
import l.b3c0;
import l.d30;
import l.e30;
import l.e51;
import l.hdb0;
import l.hpd0;
import l.k6c0;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.rj20;
import l.roj0;
import l.t100;
import l.tpd0;
import l.w9j;
import l.x4c0;
import l.z0c0;
import l.zpd0;
import l.zvf0;
import org.json.JSONObject;
import rx.subjects.b;
import v.VFrame_FlipContainer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rxg0 {

    /* JADX INFO: renamed from: r */
    public static volatile rxg0 f20874r = null;

    /* JADX INFO: renamed from: s */
    public static String f20875s = "";

    /* JADX INFO: renamed from: t */
    public static int f20876t = 6;

    /* JADX INFO: renamed from: u */
    public static int f20877u = 7;

    /* JADX INFO: renamed from: v */
    public static int f20878v = 5;

    /* JADX INFO: renamed from: w */
    public static int f20879w = 2;

    /* JADX INFO: renamed from: k */
    public String f20890k;

    /* JADX INFO: renamed from: l */
    public String f20891l;

    /* JADX INFO: renamed from: m */
    public String f20892m;

    /* JADX INFO: renamed from: n */
    public String f20893n;

    /* JADX INFO: renamed from: a */
    public b<Boolean> f20880a = b.b();

    /* JADX INFO: renamed from: b */
    public b<roj0> f20881b = b.b();

    /* JADX INFO: renamed from: c */
    public final zpd0 f20882c = new zpd0("super_like_pop_bubble_shown_time_" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public zpd0 f20883d = new zpd0("save_send_superlike_nexttime_" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public tpd0 f20884e = new tpd0("showed_superlike_guide_times_" + CoreModule.m1850H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public hpd0 f20885f = new hpd0("showed_superlike_guide" + CoreModule.m1850H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public zpd0 f20886g = new zpd0("save_show_superlike_breath_bubble", 0L);

    /* JADX INFO: renamed from: h */
    public tpd0 f20887h = new tpd0("save_show_superlike_breath_count", 0);

    /* JADX INFO: renamed from: i */
    public b<Boolean> f20888i = b.b();

    /* JADX INFO: renamed from: j */
    public b<Boolean> f20889j = b.b();

    /* JADX INFO: renamed from: o */
    public boolean f20894o = false;

    /* JADX INFO: renamed from: p */
    public String f20895p = null;

    /* JADX INFO: renamed from: q */
    public boolean f20896q = false;

    static {
        try {
            String strF = RemoteConfig.x().F("superlike_promotion_config");
            if (TextUtils.isEmpty(strF)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strF);
            f20877u = jSONObject.optInt("male_poplevel", 7);
            f20878v = jSONObject.optInt("female_poplevel", 5);
            f20879w = jSONObject.optInt("received_superlike_count", 2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m23403E(PutongFrag putongFrag, View view, int i, final d30 d30Var) {
        d.l().k("bubble_multi_superlike_bubble");
        SendMultiSuperLikeBubbleView sendMultiSuperLikeBubbleView = (SendMultiSuperLikeBubbleView) putongFrag.act().inflater().inflate(k6c0.v1, (ViewGroup) null, false);
        sendMultiSuperLikeBubbleView.m9167c(i, new d30() { // from class: l.mxg0
            public final void call() {
                rxg0.m23410a(d30Var);
            }
        });
        d.l().u(new a(putongFrag.act()).B(t100.d(2.0f)).s(sendMultiSuperLikeBubbleView).k(new int[]{Color.parseColor("#2bccff")}).l(t100.d(7.0f)).p(75).x(t100.d(-4.0f)).b(-1L).q(a.Q | a.P), view, "bubble_multi_superlike_bubble");
    }

    /* JADX INFO: renamed from: F */
    public static void m23404F(Act act, User user) {
        SendMultiSuperLikePushBubble sendMultiSuperLikePushBubble = (SendMultiSuperLikePushBubble) o7r.a(act).inflate(k6c0.w1, (ViewGroup) null);
        sendMultiSuperLikePushBubble.m9169b(user);
        hdb0.c().i(new SimplePushBubble.a(act, sendMultiSuperLikePushBubble).B(1).u("bubble_superlike_push_id").v("bubble_superlike_push_id").z(CorePopLevel.MULTI_SUPER_LIKE_SEND).s());
    }

    /* JADX INFO: renamed from: G */
    public static void m23405G(Act act, final VFrame_FlipContainer vFrame_FlipContainer, TextView textView) {
        if (CoreModule.m1854P().m11706a().m19853a2() || xma.m27357N3() || xma.m27348C3()) {
            return;
        }
        if (!CoreModule.m1854P().m11706a().m5425ds()) {
            vFrame_FlipContainer.setRotateBg(0.2f);
            vFrame_FlipContainer.setRotateFg(0.8f);
            if (rj20.INSTANCE.a()) {
                vFrame_FlipContainer.setOvalScale(0.7f);
            }
            vFrame_FlipContainer.setAnimDuration(1800);
        }
        act.postDelayed(new Runnable() { // from class: l.kxg0
            @Override // java.lang.Runnable
            public final void run() {
                vFrame_FlipContainer.g(new d30() { // from class: l.lxg0
                    public final void call() {
                        rxg0.m23411b();
                    }
                });
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: H */
    public static void m23406H(VFrame_FlipContainer vFrame_FlipContainer) {
        if (CoreModule.m1854P().m11706a().m19853a2() || xma.m27357N3() || xma.m27348C3()) {
            return;
        }
        if (!CoreModule.m1854P().m11706a().m5425ds()) {
            vFrame_FlipContainer.setRotateBg(0.2f);
            vFrame_FlipContainer.setRotateFg(0.8f);
            vFrame_FlipContainer.setAnimDuration(1800);
        }
        vFrame_FlipContainer.f();
    }

    /* JADX INFO: renamed from: L */
    public static void m23407L(Act act) {
        View viewInflate = o7r.a(act).inflate(k6c0.z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(x4c0.O)).setText(R.string.s0);
        viewInflate.findViewById(x4c0.G).setImageResource(IntlCountryCodeController.m21v() ? b3c0.j5 : b3c0.i5);
        hdb0.c().i(new SimplePushBubble.a(act, viewInflate).B(1).u("bubble_superlike_push_id").v("bubble_superlike_push_id").z(CorePopLevel.SUPER_LIKE_SEND).s());
    }

    /* JADX INFO: renamed from: M */
    public static void m23408M(PutongFrag putongFrag, ViewGroup viewGroup, View view, int i) {
        if (ura.m25555e().m25559d().m5867tp()) {
            return;
        }
        String string = putongFrag.getResources().getString(R.string.u);
        a aVar = new a(putongFrag.act());
        d.l().k("bubble_superlike_coin_guide");
        aVar.B(t100.d(2.0f)).D(string).k(new int[]{putongFrag.act().color(z0c0.d)}).J(13.0f).l(t100.d(7.0f)).p(75).x(t100.d(-4.0f)).o(a.P, t100.d(20.0f)).b(i).q(a.Q | a.P);
        d.l().u(aVar, view, "bubble_superlike_coin_guide");
    }

    /* JADX INFO: renamed from: N */
    public static void m23409N() {
        m23417j().f20885f.put(Boolean.FALSE);
        f20876t = (int) (((Long) CoreModule.f1534c.f3628e0.f18836N0.get()).longValue() + ((long) f20876t));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23410a(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
            d.l().k("bubble_multi_superlike_bubble");
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23411b() {
        e51.H(CoreModule.f1533b, new Runnable() { // from class: l.nxg0
            @Override // java.lang.Runnable
            public final void run() {
                rxg0.m23414e();
            }
        }, 2000L);
        CoreModule.m1854P().m11706a().m5431en();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m23413d(d30 d30Var, Throwable th) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m23414e() {
        if (CoreModule.m1854P().m11706a().m5551w()) {
            return;
        }
        CoreModule.m1854P().m11706a().m5394Zd();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m23416g(d30 d30Var, Boolean bool) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static rxg0 m23417j() {
        if (f20874r == null) {
            synchronized (rxg0.class) {
                try {
                    if (f20874r == null) {
                        f20874r = new rxg0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20874r;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m23418p() {
        return !((Boolean) m23417j().f20885f.get()).booleanValue() && ((Long) CoreModule.f1534c.f3628e0.f18836N0.get()).longValue() >= ((long) f20876t);
    }

    /* JADX INFO: renamed from: r */
    public static int m23419r(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public static long m23420s(long j) {
        long jO = mqi0.o();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = jO - calendar.getTimeInMillis();
        if (timeInMillis < 0) {
            return -1L;
        }
        return timeInMillis / 86400000;
    }

    /* JADX INFO: renamed from: t */
    public static void m23421t() {
        f20874r = null;
    }

    /* JADX INFO: renamed from: u */
    public static void m23422u() {
        if (!TextUtils.isEmpty(f20875s)) {
            d.l().k(f20875s);
        }
        d.l().k("bubble_multi_superlike_bubble");
        d.l().k("bubble_superlike_coin_guide");
    }

    /* JADX INFO: renamed from: A */
    public boolean m23423A(User user) {
        return NullChecker.a(user) && m23417j().m23433k(((DbObject) user).id) >= f20879w;
    }

    /* JADX INFO: renamed from: B */
    public final String m23424B(Frag frag, String str, View view, int i, int i2) {
        return m23425C(frag, str, view, i, i2, true);
    }

    /* JADX INFO: renamed from: C */
    public final String m23425C(Frag frag, String str, View view, int i, int i2, boolean z) {
        if (!z) {
            d.l().k("bubble_superlike_bubble");
            d.l().u(new a(frag.act()).B(t100.d(2.0f)).D(str).k(new int[]{ura.m25555e().m25559d().m5636I4() ? Color.parseColor("#5587FD") : Color.parseColor("#2bccff")}).l(t100.d(7.0f)).p(75).J(13.0f).x(t100.d(-4.0f)).w(i2).b(i).q(a.Q), view, "bubble_superlike_bubble");
            return "bubble_superlike_bubble";
        }
        m23422u();
        a aVarQ = new a(frag.act()).B(t100.d(2.0f)).D(str).k(new int[]{ura.m25555e().m25559d().m5636I4() ? Color.parseColor("#5587FD") : Color.parseColor("#2bccff")}).l(t100.d(7.0f)).p(75).J(13.0f).x(t100.d(-4.0f)).w(i2).b(i).q(a.Q);
        f20875s = "bubble_superlike_bubble_" + mqi0.o();
        d.l().u(aVarQ, view, f20875s);
        return f20875s;
    }

    /* JADX INFO: renamed from: D */
    public void m23426D(Frag frag, User user, View view, int i) {
        this.f20890k = null;
        m23425C(frag, (user.isFemale() ? "她" : "他").concat("很受欢迎，超喜欢一下"), view, i, 0, false);
    }

    /* JADX INFO: renamed from: I */
    public boolean m23427I() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (!NullChecker.a(userM21490p9)) {
            return false;
        }
        long jM23420s = m23420s((long) userM21490p9.createdTime);
        return jM23420s == 1 || jM23420s == 4;
    }

    /* JADX INFO: renamed from: J */
    public String m23428J(User user, PutongFrag putongFrag, View view, int i) {
        if (user != null && !d.l().x("bubble_superlike_coin_guide") && m23435m(((Long) this.f20882c.get()).longValue(), CoreModule.m1854P().m11706a().m5313Nm())) {
            boolean zIsFemale = user.isFemale();
            if (user.popLevel >= CoreModule.m1854P().m11706a().m5352Tb(zIsFemale)) {
                this.f20882c.put(Long.valueOf(mqi0.o()));
                this.f20890k = ((DbObject) user).id;
                if (ura.m25555e().m25559d().m5867tp()) {
                    return null;
                }
                return m23424B(putongFrag, (zIsFemale ? "她" : "他").concat("很受欢迎，超喜欢一下"), view, i, t100.h);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public String m23429K(PutongFrag putongFrag, View view, int i) {
        int iRemainToday;
        if (!CoreModule.m1854P().m11706a().m19853a2() && !xma.m27357N3() && !xma.m27348C3()) {
            Act act = putongFrag.act();
            if (!d.l().x("bubble_superlike_coin_guide") && (iRemainToday = CoreModule.f1534c.m3414o3().superLikeLimit.remainToday()) > 0) {
                return m23424B(putongFrag, act.getString(R.string.i1, String.valueOf(iRemainToday)), view, i, 0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public void m23430O() {
        boolean zD = mqi0.D(((Long) this.f20886g.get()).longValue());
        tpd0 tpd0Var = this.f20887h;
        if (zD) {
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        } else {
            tpd0Var.put(1);
        }
        this.f20886g.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: h */
    public void m23431h(Act act, final SummarizedPrivilegePrice summarizedPrivilegePrice, final d30 d30Var, final d30 d30Var2) {
        act.duringCreated(CoreModule.f1534c.f3559H0.m27536k5().flatMap(new w9j() { // from class: l.oxg0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3559H0.m27562x5(summarizedPrivilegePrice.coinSign, SummarizedPrivilegesId.get("superLike"), "coin", 0);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.pxg0
            public final void call(Object obj) {
                rxg0.m23416g(d30Var, (Boolean) obj);
            }
        }, new e30() { // from class: l.qxg0
            public final void call(Object obj) {
                rxg0.m23413d(d30Var2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m23432i() {
        this.f20896q = false;
    }

    /* JADX INFO: renamed from: k */
    public int m23433k(String str) {
        Map<String, Integer> map = CoreModule.f1534c.f3652m0.f3442t2;
        if (map.containsKey(str) && NullChecker.a(map.get(str))) {
            return map.get(str).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m23434l(String str) {
        return TextUtils.equals(str, this.f20891l);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m23435m(long j, int i) {
        return mqi0.o() - j >= ((long) i) * 60000;
    }

    /* JADX INFO: renamed from: n */
    public boolean m23436n() {
        return ((Integer) this.f20887h.get()).intValue() >= 3;
    }

    /* JADX INFO: renamed from: o */
    public boolean m23437o(String str) {
        return TextUtils.equals(str, m23417j().f20893n);
    }

    /* JADX INFO: renamed from: q */
    public boolean m23438q(String str) {
        return str != null && TextUtils.equals(str, this.f20890k);
    }

    /* JADX INFO: renamed from: v */
    public void m23439v() {
        this.f20890k = null;
    }

    /* JADX INFO: renamed from: w */
    public void m23440w(@Nullable String str) {
        this.f20891l = str;
    }

    /* JADX INFO: renamed from: x */
    public void m23441x() {
        this.f20896q = true;
    }

    /* JADX INFO: renamed from: y */
    public void m23442y(User user, PutongFrag putongFrag, View view, boolean z) {
        if (ura.m25555e().m25559d().m5867tp()) {
            return;
        }
        this.f20890k = null;
        if (NullChecker.a(user)) {
            if (z) {
                this.f20892m = ((DbObject) user).id;
            }
            this.f20893n = ((DbObject) user).id;
            int iD = t100.d(6.5f);
            if (CoreModule.m1854P().m11706a().m5319O7()) {
                iD = 0;
            }
            m23424B(putongFrag, "试试长按连送", view, 2000, iD);
            m23430O();
            zvf0.x("e_superlike_combo_guidance", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: z */
    public void m23443z(boolean z, String str) {
        if (!z) {
            this.f20895p = null;
            this.f20883d.put(Long.MAX_VALUE);
        } else {
            if (!TextUtils.equals(str, this.f20895p)) {
                this.f20884e.a(1);
            }
            this.f20895p = str;
            this.f20883d.put(Long.valueOf(mqi0.n()));
        }
    }
}
