package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SendMultiSuperLikeBubbleView;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SendMultiSuperLikePushBubble;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.Map;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VFrame_FlipContainer;
import p151v.VIcon;

/* JADX INFO: loaded from: classes12.dex */
public class z5h0 {

    /* JADX INFO: renamed from: r */
    public static volatile z5h0 f203037r = null;

    /* JADX INFO: renamed from: s */
    public static String f203038s = "";

    /* JADX INFO: renamed from: t */
    public static int f203039t = 6;

    /* JADX INFO: renamed from: u */
    public static int f203040u = 7;

    /* JADX INFO: renamed from: v */
    public static int f203041v = 5;

    /* JADX INFO: renamed from: w */
    public static int f203042w = 2;

    /* JADX INFO: renamed from: k */
    public String f203053k;

    /* JADX INFO: renamed from: l */
    public String f203054l;

    /* JADX INFO: renamed from: m */
    public String f203055m;

    /* JADX INFO: renamed from: n */
    public String f203056n;

    /* JADX INFO: renamed from: a */
    public C22508b<Boolean> f203043a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public C22508b<uxj0> f203044b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public final byd0 f203045c = new byd0("super_like_pop_bubble_shown_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: d */
    public byd0 f203046d = new byd0("save_send_superlike_nexttime_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public vxd0 f203047e = new vxd0("showed_superlike_guide_times_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public jxd0 f203048f = new jxd0("showed_superlike_guide" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public byd0 f203049g = new byd0("save_show_superlike_breath_bubble", 0L);

    /* JADX INFO: renamed from: h */
    public vxd0 f203050h = new vxd0("save_show_superlike_breath_count", 0);

    /* JADX INFO: renamed from: i */
    public C22508b<Boolean> f203051i = C22508b.m222767b();

    /* JADX INFO: renamed from: j */
    public C22508b<Boolean> f203052j = C22508b.m222767b();

    /* JADX INFO: renamed from: o */
    public boolean f203057o = false;

    /* JADX INFO: renamed from: p */
    public String f203058p = null;

    /* JADX INFO: renamed from: q */
    public boolean f203059q = false;

    static {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("superlike_promotion_config");
            if (TextUtils.isEmpty(strM80485F)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM80485F);
            f203040u = jSONObject.optInt("male_poplevel", 7);
            f203041v = jSONObject.optInt("female_poplevel", 5);
            f203042w = jSONObject.optInt("received_superlike_count", 2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m218661E(PutongFrag putongFrag, View view, int i, final x20 x20Var) {
        C4499d.m21895l().m21899k("bubble_multi_superlike_bubble");
        SendMultiSuperLikeBubbleView sendMultiSuperLikeBubbleView = (SendMultiSuperLikeBubbleView) putongFrag.act().inflater().inflate(pec0.f152048v1, (ViewGroup) null, false);
        sendMultiSuperLikeBubbleView.m56952c(i, new x20() { // from class: l.u5h0
            @Override // p153l.x20
            public final void call() {
                z5h0.m218668a(x20Var);
            }
        });
        C4499d.m21895l().m21908u(new C4496a(putongFrag.act()).m21846B(qa00.m175859d(2.0f)).m21876s(sendMultiSuperLikeBubbleView).m21869k(Color.parseColor("#2bccff")).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21881x(qa00.m175859d(-4.0f)).m21860b(-1L).m21874q(C4496a.f16402Q | C4496a.f16401P), view, "bubble_multi_superlike_bubble");
    }

    /* JADX INFO: renamed from: F */
    public static void m218662F(Act act, User user) {
        SendMultiSuperLikePushBubble sendMultiSuperLikePushBubble = (SendMultiSuperLikePushBubble) p9r.m171370a(act).inflate(pec0.f152051w1, (ViewGroup) null);
        sendMultiSuperLikePushBubble.m56954b(user);
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, sendMultiSuperLikePushBubble).m22163B(1).m22170u("bubble_superlike_push_id").m22171v("bubble_superlike_push_id").m22175z(CorePopLevel.MULTI_SUPER_LIKE_SEND).m22168s());
    }

    /* JADX INFO: renamed from: G */
    public static void m218663G(Act act, final VFrame_FlipContainer vFrame_FlipContainer, TextView textView) {
        if (CoreModule.m30933P().m143405a().mo180437a2() || joa.m146363O3() || joa.m146354D3()) {
            return;
        }
        if (!CoreModule.m30933P().m143405a().mo34491ds()) {
            vFrame_FlipContainer.setRotateBg(0.2f);
            vFrame_FlipContainer.setRotateFg(0.8f);
            if (bs20.INSTANCE.m106196a()) {
                vFrame_FlipContainer.setOvalScale(0.7f);
            }
            vFrame_FlipContainer.setAnimDuration(1800);
        }
        act.postDelayed(new Runnable() { // from class: l.s5h0
            @Override // java.lang.Runnable
            public final void run() {
                vFrame_FlipContainer.m224281g(new x20() { // from class: l.t5h0
                    @Override // p153l.x20
                    public final void call() {
                        z5h0.m218669b();
                    }
                });
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: H */
    public static void m218664H(VFrame_FlipContainer vFrame_FlipContainer) {
        if (CoreModule.m30933P().m143405a().mo180437a2() || joa.m146363O3() || joa.m146354D3()) {
            return;
        }
        if (!CoreModule.m30933P().m143405a().mo34491ds()) {
            vFrame_FlipContainer.setRotateBg(0.2f);
            vFrame_FlipContainer.setRotateFg(0.8f);
            vFrame_FlipContainer.setAnimDuration(1800);
        }
        vFrame_FlipContainer.m224280f();
    }

    /* JADX INFO: renamed from: L */
    public static void m218665L(Act act) {
        View viewInflate = p9r.m171370a(act).inflate(pec0.f152060z1, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(ddc0.f87885O)).setText(R$string.f21424s0);
        ((VIcon) viewInflate.findViewById(ddc0.f87877G)).setImageResource(IntlCountryCodeController.m29125v() ? gbc0.f103331j5 : gbc0.f103323i5);
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, viewInflate).m22163B(1).m22170u("bubble_superlike_push_id").m22171v("bubble_superlike_push_id").m22175z(CorePopLevel.SUPER_LIKE_SEND).m22168s());
    }

    /* JADX INFO: renamed from: M */
    public static void m218666M(PutongFrag putongFrag, ViewGroup viewGroup, View view, int i) {
        if (gta.m132210e().m132214d().mo34933tp()) {
            return;
        }
        String string = putongFrag.getResources().getString(R$string.f21429u);
        C4496a c4496a = new C4496a(putongFrag.act());
        C4499d.m21895l().m21899k("bubble_superlike_coin_guide");
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(string).m21869k(putongFrag.act().color(f9c0.f97859d)).m21854J(13.0f).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21881x(qa00.m175859d(-4.0f)).m21872o(C4496a.f16401P, qa00.m175859d(20.0f)).m21860b(i).m21874q(C4496a.f16402Q | C4496a.f16401P);
        C4499d.m21895l().m21908u(c4496a, view, "bubble_superlike_coin_guide");
    }

    /* JADX INFO: renamed from: N */
    public static void m218667N() {
        m218675j().f203048f.put(Boolean.FALSE);
        f203039t = (int) (CoreModule.f18264c.f20381e0.f89081N0.get().longValue() + ((long) f203039t));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m218668a(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
            C4499d.m21895l().m21899k("bubble_multi_superlike_bubble");
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m218669b() {
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.v5h0
            @Override // java.lang.Runnable
            public final void run() {
                z5h0.m218672e();
            }
        }, 2000L);
        CoreModule.m30933P().m143405a().mo34497en();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m218671d(x20 x20Var, Throwable th) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m218672e() {
        if (CoreModule.m30933P().m143405a().mo34617w()) {
            return;
        }
        CoreModule.m30933P().m143405a().mo34460Zd();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m218674g(x20 x20Var, Boolean bool) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static z5h0 m218675j() {
        if (f203037r == null) {
            synchronized (z5h0.class) {
                try {
                    if (f203037r == null) {
                        f203037r = new z5h0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f203037r;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m218676p() {
        return !m218675j().f203048f.get().booleanValue() && CoreModule.f18264c.f20381e0.f89081N0.get().longValue() >= ((long) f203039t);
    }

    /* JADX INFO: renamed from: r */
    public static int m218677r(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public static long m218678s(long j) {
        long jM174454o = pzi0.m174454o();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = jM174454o - calendar.getTimeInMillis();
        if (timeInMillis < 0) {
            return -1L;
        }
        return timeInMillis / 86400000;
    }

    /* JADX INFO: renamed from: t */
    public static void m218679t() {
        f203037r = null;
    }

    /* JADX INFO: renamed from: u */
    public static void m218680u() {
        if (!TextUtils.isEmpty(f203038s)) {
            C4499d.m21895l().m21899k(f203038s);
        }
        C4499d.m21895l().m21899k("bubble_multi_superlike_bubble");
        C4499d.m21895l().m21899k("bubble_superlike_coin_guide");
    }

    /* JADX INFO: renamed from: A */
    public boolean m218681A(User user) {
        return NullChecker.m82486a(user) && m218675j().m218691k(user.f56859id) >= f203042w;
    }

    /* JADX INFO: renamed from: B */
    public final String m218682B(Frag frag, String str, View view, int i, int i2) {
        return m218683C(frag, str, view, i, i2, true);
    }

    /* JADX INFO: renamed from: C */
    public final String m218683C(Frag frag, String str, View view, int i, int i2, boolean z) {
        if (!z) {
            C4499d.m21895l().m21899k("bubble_superlike_bubble");
            C4499d.m21895l().m21908u(new C4496a(frag.act()).m21846B(qa00.m175859d(2.0f)).m21848D(str).m21869k(gta.m132210e().m132214d().mo34702I4() ? Color.parseColor("#5587FD") : Color.parseColor("#2bccff")).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21881x(qa00.m175859d(-4.0f)).m21880w(i2).m21860b(i).m21874q(C4496a.f16402Q), view, "bubble_superlike_bubble");
            return "bubble_superlike_bubble";
        }
        m218680u();
        C4496a c4496aM21874q = new C4496a(frag.act()).m21846B(qa00.m175859d(2.0f)).m21848D(str).m21869k(gta.m132210e().m132214d().mo34702I4() ? Color.parseColor("#5587FD") : Color.parseColor("#2bccff")).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21881x(qa00.m175859d(-4.0f)).m21880w(i2).m21860b(i).m21874q(C4496a.f16402Q);
        f203038s = "bubble_superlike_bubble_" + pzi0.m174454o();
        C4499d.m21895l().m21908u(c4496aM21874q, view, f203038s);
        return f203038s;
    }

    /* JADX INFO: renamed from: D */
    public void m218684D(Frag frag, User user, View view, int i) {
        this.f203053k = null;
        m218683C(frag, (user.isFemale() ? "她" : "他").concat("很受欢迎，超喜欢一下"), view, i, 0, false);
    }

    /* JADX INFO: renamed from: I */
    public boolean m218685I() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!NullChecker.m82486a(userM116600p9)) {
            return false;
        }
        long jM218678s = m218678s((long) userM116600p9.createdTime);
        return jM218678s == 1 || jM218678s == 4;
    }

    /* JADX INFO: renamed from: J */
    public String m218686J(User user, PutongFrag putongFrag, View view, int i) {
        if (user != null && !C4499d.m21895l().m21911x("bubble_superlike_coin_guide") && m218693m(this.f203045c.get().longValue(), CoreModule.m30933P().m143405a().mo34379Nm())) {
            boolean zIsFemale = user.isFemale();
            if (user.popLevel >= CoreModule.m30933P().m143405a().mo34418Tb(zIsFemale)) {
                this.f203045c.put(Long.valueOf(pzi0.m174454o()));
                this.f203053k = user.f56859id;
                if (gta.m132210e().m132214d().mo34933tp()) {
                    return null;
                }
                return m218682B(putongFrag, (zIsFemale ? "她" : "他").concat("很受欢迎，超喜欢一下"), view, i, qa00.f156321h);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public String m218687K(PutongFrag putongFrag, View view, int i) {
        int iRemainToday;
        if (!CoreModule.m30933P().m143405a().mo180437a2() && !joa.m146363O3() && !joa.m146354D3()) {
            Act act = putongFrag.act();
            if (!C4499d.m21895l().m21911x("bubble_superlike_coin_guide") && (iRemainToday = CoreModule.f18264c.m32487o3().superLikeLimit.remainToday()) > 0) {
                return m218682B(putongFrag, act.getString(R$string.f21395i1, String.valueOf(iRemainToday)), view, i, 0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O */
    public void m218688O() {
        boolean zM174439D = pzi0.m174439D(this.f203049g.get().longValue());
        vxd0 vxd0Var = this.f203050h;
        if (zM174439D) {
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        } else {
            vxd0Var.put(1);
        }
        this.f203049g.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: h */
    public void m218689h(Act act, final SummarizedPrivilegePrice summarizedPrivilegePrice, final x20 x20Var, final x20 x20Var2) {
        act.duringCreated((C22421c) CoreModule.f18264c.f20312H0.m155449k5().flatMap(new qcj() { // from class: l.w5h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20312H0.m155475x5(summarizedPrivilegePrice.coinSign, SummarizedPrivilegesId.get("superLike"), "coin", 0);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.x5h0
            @Override // p153l.y20
            public final void call(Object obj) {
                z5h0.m218674g(x20Var, (Boolean) obj);
            }
        }, new y20() { // from class: l.y5h0
            @Override // p153l.y20
            public final void call(Object obj) {
                z5h0.m218671d(x20Var2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m218690i() {
        this.f203059q = false;
    }

    /* JADX INFO: renamed from: k */
    public int m218691k(String str) {
        Map<String, Integer> map = CoreModule.f18264c.f20405m0.f20195t2;
        if (map.containsKey(str) && NullChecker.m82486a(map.get(str))) {
            return map.get(str).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public boolean m218692l(String str) {
        return TextUtils.equals(str, this.f203054l);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m218693m(long j, int i) {
        return pzi0.m174454o() - j >= ((long) i) * Constants.ONE_MIN_IN_MILLIS;
    }

    /* JADX INFO: renamed from: n */
    public boolean m218694n() {
        return this.f203050h.get().intValue() >= 3;
    }

    /* JADX INFO: renamed from: o */
    public boolean m218695o(String str) {
        return TextUtils.equals(str, m218675j().f203056n);
    }

    /* JADX INFO: renamed from: q */
    public boolean m218696q(String str) {
        return str != null && TextUtils.equals(str, this.f203053k);
    }

    /* JADX INFO: renamed from: v */
    public void m218697v() {
        this.f203053k = null;
    }

    /* JADX INFO: renamed from: w */
    public void m218698w(@Nullable String str) {
        this.f203054l = str;
    }

    /* JADX INFO: renamed from: x */
    public void m218699x() {
        this.f203059q = true;
    }

    /* JADX INFO: renamed from: y */
    public void m218700y(User user, PutongFrag putongFrag, View view, boolean z) {
        if (gta.m132210e().m132214d().mo34933tp()) {
            return;
        }
        this.f203053k = null;
        if (NullChecker.m82486a(user)) {
            if (z) {
                this.f203055m = user.f56859id;
            }
            this.f203056n = user.f56859id;
            int iM175859d = qa00.m175859d(6.5f);
            if (CoreModule.m30933P().m143405a().mo34385O7()) {
                iM175859d = 0;
            }
            m218682B(putongFrag, "试试长按连送", view, 2000, iM175859d);
            m218688O();
            i4g0.m138526x("e_superlike_combo_guidance", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: z */
    public void m218701z(boolean z, String str) {
        if (!z) {
            this.f203058p = null;
            this.f203046d.put(Long.MAX_VALUE);
        } else {
            if (!TextUtils.equals(str, this.f203058p)) {
                this.f203047e.m203841a(1);
            }
            this.f203058p = str;
            this.f203046d.put(Long.valueOf(pzi0.m174453n()));
        }
    }
}
