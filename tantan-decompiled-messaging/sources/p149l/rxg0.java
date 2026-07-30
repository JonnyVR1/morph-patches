package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SendMultiSuperLikeBubbleView;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SendMultiSuperLikePushBubble;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Map;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VFrame_FlipContainer;
import p147v.VIcon;

/* JADX INFO: loaded from: classes9.dex */
public class rxg0 {

    /* JADX INFO: renamed from: r */
    public static volatile rxg0 f161450r = null;

    /* JADX INFO: renamed from: s */
    public static String f161451s = "";

    /* JADX INFO: renamed from: t */
    public static int f161452t = 6;

    /* JADX INFO: renamed from: u */
    public static int f161453u = 7;

    /* JADX INFO: renamed from: v */
    public static int f161454v = 5;

    /* JADX INFO: renamed from: w */
    public static int f161455w = 2;

    /* JADX INFO: renamed from: k */
    public String f161466k;

    /* JADX INFO: renamed from: l */
    public String f161467l;

    /* JADX INFO: renamed from: m */
    public String f161468m;

    /* JADX INFO: renamed from: n */
    public String f161469n;

    /* JADX INFO: renamed from: a */
    public C22393b<Boolean> f161456a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public C22393b<roj0> f161457b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public final zpd0 f161458c = new zpd0("super_like_pop_bubble_shown_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public zpd0 f161459d = new zpd0("save_send_superlike_nexttime_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public tpd0 f161460e = new tpd0("showed_superlike_guide_times_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public hpd0 f161461f = new hpd0("showed_superlike_guide" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public zpd0 f161462g = new zpd0("save_show_superlike_breath_bubble", 0L);

    /* JADX INFO: renamed from: h */
    public tpd0 f161463h = new tpd0("save_show_superlike_breath_count", 0);

    /* JADX INFO: renamed from: i */
    public C22393b<Boolean> f161464i = C22393b.m221521b();

    /* JADX INFO: renamed from: j */
    public C22393b<Boolean> f161465j = C22393b.m221521b();

    /* JADX INFO: renamed from: o */
    public boolean f161470o = false;

    /* JADX INFO: renamed from: p */
    public String f161471p = null;

    /* JADX INFO: renamed from: q */
    public boolean f161472q = false;

    static {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("superlike_promotion_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM79302F);
            f161453u = jSONObject.optInt("male_poplevel", 7);
            f161454v = jSONObject.optInt("female_poplevel", 5);
            f161455w = jSONObject.optInt("received_superlike_count", 2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m181558E(PutongFrag putongFrag, View view, int i, final d30 d30Var) {
        C4348d.m20896l().m20900k("bubble_multi_superlike_bubble");
        SendMultiSuperLikeBubbleView sendMultiSuperLikeBubbleView = (SendMultiSuperLikeBubbleView) putongFrag.act().inflater().inflate(k6c0.f121440v1, (ViewGroup) null, false);
        sendMultiSuperLikeBubbleView.m55769c(i, new d30() { // from class: l.mxg0
            @Override // p149l.d30
            public final void call() {
                rxg0.m181565a(d30Var);
            }
        });
        C4348d.m20896l().m20909u(new C4345a(putongFrag.act()).m20847B(t100.m186890d(2.0f)).m20877s(sendMultiSuperLikeBubbleView).m20870k(Color.parseColor("#2bccff")).m20871l(t100.m186890d(7.0f)).m20874p(75).m20882x(t100.m186890d(-4.0f)).m20861b(-1L).m20875q(C4345a.f15683Q | C4345a.f15682P), view, "bubble_multi_superlike_bubble");
    }

    /* JADX INFO: renamed from: F */
    public static void m181559F(Act act, User user) {
        SendMultiSuperLikePushBubble sendMultiSuperLikePushBubble = (SendMultiSuperLikePushBubble) o7r.m163037a(act).inflate(k6c0.f121443w1, (ViewGroup) null);
        sendMultiSuperLikePushBubble.m55771b(user);
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, sendMultiSuperLikePushBubble).m21164B(1).m21171u("bubble_superlike_push_id").m21172v("bubble_superlike_push_id").m21176z(CorePopLevel.MULTI_SUPER_LIKE_SEND).m21169s());
    }

    /* JADX INFO: renamed from: G */
    public static void m181560G(Act act, final VFrame_FlipContainer vFrame_FlipContainer, TextView textView) {
        if (CoreModule.m29935P().m94651a().mo158345a2() || xma.m210049N3() || xma.m210040C3()) {
            return;
        }
        if (!CoreModule.m29935P().m94651a().mo33488ds()) {
            vFrame_FlipContainer.setRotateBg(0.2f);
            vFrame_FlipContainer.setRotateFg(0.8f);
            if (rj20.INSTANCE.m179543a()) {
                vFrame_FlipContainer.setOvalScale(0.7f);
            }
            vFrame_FlipContainer.setAnimDuration(1800);
        }
        act.postDelayed(new Runnable() { // from class: l.kxg0
            @Override // java.lang.Runnable
            public final void run() {
                vFrame_FlipContainer.m223035g(new d30() { // from class: l.lxg0
                    @Override // p149l.d30
                    public final void call() {
                        rxg0.m181566b();
                    }
                });
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: H */
    public static void m181561H(VFrame_FlipContainer vFrame_FlipContainer) {
        if (CoreModule.m29935P().m94651a().mo158345a2() || xma.m210049N3() || xma.m210040C3()) {
            return;
        }
        if (!CoreModule.m29935P().m94651a().mo33488ds()) {
            vFrame_FlipContainer.setRotateBg(0.2f);
            vFrame_FlipContainer.setRotateFg(0.8f);
            vFrame_FlipContainer.setAnimDuration(1800);
        }
        vFrame_FlipContainer.m223034f();
    }

    /* JADX INFO: renamed from: L */
    public static void m181562L(Act act) {
        View viewInflate = o7r.m163037a(act).inflate(k6c0.f121452z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(x4c0.f190980O)).setText(R$string.f20682s0);
        ((VIcon) viewInflate.findViewById(x4c0.f190972G)).setImageResource(IntlCountryCodeController.m28126v() ? b3c0.f73080j5 : b3c0.f73072i5);
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, viewInflate).m21164B(1).m21171u("bubble_superlike_push_id").m21172v("bubble_superlike_push_id").m21176z(CorePopLevel.SUPER_LIKE_SEND).m21169s());
    }

    /* JADX INFO: renamed from: M */
    public static void m181563M(PutongFrag putongFrag, ViewGroup viewGroup, View view, int i) {
        if (ura.m195053e().m195057d().mo33930tp()) {
            return;
        }
        String string = putongFrag.getResources().getString(R$string.f20687u);
        C4345a c4345a = new C4345a(putongFrag.act());
        C4348d.m20896l().m20900k("bubble_superlike_coin_guide");
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D(string).m20870k(putongFrag.act().color(z0c0.f200976d)).m20855J(13.0f).m20871l(t100.m186890d(7.0f)).m20874p(75).m20882x(t100.m186890d(-4.0f)).m20873o(C4345a.f15682P, t100.m186890d(20.0f)).m20861b(i).m20875q(C4345a.f15683Q | C4345a.f15682P);
        C4348d.m20896l().m20909u(c4345a, view, "bubble_superlike_coin_guide");
    }

    /* JADX INFO: renamed from: N */
    public static void m181564N() {
        m181572j().f161461f.put(Boolean.FALSE);
        f161452t = (int) (CoreModule.f17545c.f19639e0.f149224N0.get().longValue() + ((long) f161452t));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m181565a(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
            C4348d.m20896l().m20900k("bubble_multi_superlike_bubble");
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m181566b() {
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.nxg0
            @Override // java.lang.Runnable
            public final void run() {
                rxg0.m181569e();
            }
        }, 2000L);
        CoreModule.m29935P().m94651a().mo33494en();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m181568d(d30 d30Var, Throwable th) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m181569e() {
        if (CoreModule.m29935P().m94651a().mo33614w()) {
            return;
        }
        CoreModule.m29935P().m94651a().mo33457Zd();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m181571g(d30 d30Var, Boolean bool) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static rxg0 m181572j() {
        if (f161450r == null) {
            synchronized (rxg0.class) {
                try {
                    if (f161450r == null) {
                        f161450r = new rxg0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161450r;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m181573p() {
        return !m181572j().f161461f.get().booleanValue() && CoreModule.f17545c.f19639e0.f149224N0.get().longValue() >= ((long) f161452t);
    }

    /* JADX INFO: renamed from: r */
    public static int m181574r(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public static long m181575s(long j) {
        long jM155944o = mqi0.m155944o();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = jM155944o - calendar.getTimeInMillis();
        if (timeInMillis < 0) {
            return -1L;
        }
        return timeInMillis / 86400000;
    }

    /* JADX INFO: renamed from: t */
    public static void m181576t() {
        f161450r = null;
    }

    /* JADX INFO: renamed from: u */
    public static void m181577u() {
        if (!TextUtils.isEmpty(f161451s)) {
            C4348d.m20896l().m20900k(f161451s);
        }
        C4348d.m20896l().m20900k("bubble_multi_superlike_bubble");
        C4348d.m20896l().m20900k("bubble_superlike_coin_guide");
    }

    /* JADX INFO: renamed from: A */
    public boolean m181578A(User user) {
        return NullChecker.m81303a(user) && m181572j().m181588k(user.f56011id) >= f161455w;
    }

    /* JADX INFO: renamed from: B */
    public final String m181579B(Frag frag, String str, View view, int i, int i2) {
        return m181580C(frag, str, view, i, i2, true);
    }

    /* JADX INFO: renamed from: C */
    public final String m181580C(Frag frag, String str, View view, int i, int i2, boolean z) {
        if (!z) {
            C4348d.m20896l().m20900k("bubble_superlike_bubble");
            C4348d.m20896l().m20909u(new C4345a(frag.act()).m20847B(t100.m186890d(2.0f)).m20849D(str).m20870k(ura.m195053e().m195057d().mo33699I4() ? Color.parseColor("#5587FD") : Color.parseColor("#2bccff")).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20882x(t100.m186890d(-4.0f)).m20881w(i2).m20861b(i).m20875q(C4345a.f15683Q), view, "bubble_superlike_bubble");
            return "bubble_superlike_bubble";
        }
        m181577u();
        C4345a c4345aM20875q = new C4345a(frag.act()).m20847B(t100.m186890d(2.0f)).m20849D(str).m20870k(ura.m195053e().m195057d().mo33699I4() ? Color.parseColor("#5587FD") : Color.parseColor("#2bccff")).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20882x(t100.m186890d(-4.0f)).m20881w(i2).m20861b(i).m20875q(C4345a.f15683Q);
        f161451s = "bubble_superlike_bubble_" + mqi0.m155944o();
        C4348d.m20896l().m20909u(c4345aM20875q, view, f161451s);
        return f161451s;
    }

    /* JADX INFO: renamed from: D */
    public void m181581D(Frag frag, User user, View view, int i) {
        this.f161466k = null;
        m181580C(frag, (user.isFemale() ? "她" : "他").concat("很受欢迎，超喜欢一下"), view, i, 0, false);
    }

    /* JADX INFO: renamed from: I */
    public boolean m181582I() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!NullChecker.m81303a(userM169527p9)) {
            return false;
        }
        long jM181575s = m181575s((long) userM169527p9.createdTime);
        return jM181575s == 1 || jM181575s == 4;
    }

    /* JADX INFO: renamed from: J */
    public String m181583J(User user, PutongFrag putongFrag, View view, int i) {
        if (user != null && !C4348d.m20896l().m20912x("bubble_superlike_coin_guide") && m181590m(this.f161458c.get().longValue(), CoreModule.m29935P().m94651a().mo33376Nm())) {
            boolean zIsFemale = user.isFemale();
            if (user.popLevel >= CoreModule.m29935P().m94651a().mo33415Tb(zIsFemale)) {
                this.f161458c.put(Long.valueOf(mqi0.m155944o()));
                this.f161466k = user.f56011id;
                if (ura.m195053e().m195057d().mo33930tp()) {
                    return null;
                }
                return m181579B(putongFrag, (zIsFemale ? "她" : "他").concat("很受欢迎，超喜欢一下"), view, i, t100.f167259h);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public String m181584K(PutongFrag putongFrag, View view, int i) {
        int iRemainToday;
        if (!CoreModule.m29935P().m94651a().mo158345a2() && !xma.m210049N3() && !xma.m210040C3()) {
            Act act = putongFrag.act();
            if (!C4348d.m20896l().m20912x("bubble_superlike_coin_guide") && (iRemainToday = CoreModule.f17545c.m31484o3().superLikeLimit.remainToday()) > 0) {
                return m181579B(putongFrag, act.getString(R$string.f20653i1, String.valueOf(iRemainToday)), view, i, 0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public void m181585O() {
        boolean zM155929D = mqi0.m155929D(this.f161462g.get().longValue());
        tpd0 tpd0Var = this.f161463h;
        if (zM155929D) {
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        } else {
            tpd0Var.put(1);
        }
        this.f161462g.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: h */
    public void m181586h(Act act, final SummarizedPrivilegePrice summarizedPrivilegePrice, final d30 d30Var, final d30 d30Var2) {
        act.duringCreated((C22306c) CoreModule.f17545c.f19570H0.m210361k5().flatMap(new w9j() { // from class: l.oxg0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19570H0.m210387x5(summarizedPrivilegePrice.coinSign, SummarizedPrivilegesId.get("superLike"), "coin", 0);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.pxg0
            @Override // p149l.e30
            public final void call(Object obj) {
                rxg0.m181571g(d30Var, (Boolean) obj);
            }
        }, new e30() { // from class: l.qxg0
            @Override // p149l.e30
            public final void call(Object obj) {
                rxg0.m181568d(d30Var2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m181587i() {
        this.f161472q = false;
    }

    /* JADX INFO: renamed from: k */
    public int m181588k(String str) {
        Map<String, Integer> map = CoreModule.f17545c.f19663m0.f19453t2;
        if (map.containsKey(str) && NullChecker.m81303a(map.get(str))) {
            return map.get(str).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m181589l(String str) {
        return TextUtils.equals(str, this.f161467l);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m181590m(long j, int i) {
        return mqi0.m155944o() - j >= ((long) i) * Constants.ONE_MIN_IN_MILLIS;
    }

    /* JADX INFO: renamed from: n */
    public boolean m181591n() {
        return this.f161463h.get().intValue() >= 3;
    }

    /* JADX INFO: renamed from: o */
    public boolean m181592o(String str) {
        return TextUtils.equals(str, m181572j().f161469n);
    }

    /* JADX INFO: renamed from: q */
    public boolean m181593q(String str) {
        return str != null && TextUtils.equals(str, this.f161466k);
    }

    /* JADX INFO: renamed from: v */
    public void m181594v() {
        this.f161466k = null;
    }

    /* JADX INFO: renamed from: w */
    public void m181595w(@Nullable String str) {
        this.f161467l = str;
    }

    /* JADX INFO: renamed from: x */
    public void m181596x() {
        this.f161472q = true;
    }

    /* JADX INFO: renamed from: y */
    public void m181597y(User user, PutongFrag putongFrag, View view, boolean z) {
        if (ura.m195053e().m195057d().mo33930tp()) {
            return;
        }
        this.f161466k = null;
        if (NullChecker.m81303a(user)) {
            if (z) {
                this.f161468m = user.f56011id;
            }
            this.f161469n = user.f56011id;
            int iM186890d = t100.m186890d(6.5f);
            if (CoreModule.m29935P().m94651a().mo33382O7()) {
                iM186890d = 0;
            }
            m181579B(putongFrag, "试试长按连送", view, 2000, iM186890d);
            m181585O();
            zvf0.m220402x("e_superlike_combo_guidance", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: z */
    public void m181598z(boolean z, String str) {
        if (!z) {
            this.f161471p = null;
            this.f161459d.put(Long.MAX_VALUE);
        } else {
            if (!TextUtils.equals(str, this.f161471p)) {
                this.f161460e.m189988a(1);
            }
            this.f161471p = str;
            this.f161459d.put(Long.valueOf(mqi0.m155943n()));
        }
    }
}
