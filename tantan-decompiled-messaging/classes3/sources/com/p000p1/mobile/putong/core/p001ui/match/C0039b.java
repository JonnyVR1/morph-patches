package com.p000p1.mobile.putong.core.p001ui.match;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.match.C0039b;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.cwf0;
import l.du2;
import l.e51;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.swh0;
import l.ura;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.x7y;
import l.xma;
import l.zvf0;
import l.zz6;
import p003l.d30;
import p003l.e30;
import p003l.eqh0;
import p003l.m250;
import p003l.npo;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0039b {

    /* JADX INFO: renamed from: b */
    public static C0039b f369b;

    /* JADX INFO: renamed from: a */
    public int f370a = 0;

    /* JADX INFO: renamed from: A */
    public static void m684A(final Act act, final User user, final String str, @NonNull final d30 d30Var, final e30<String> e30Var, final String str2) {
        act.duringCreated(CoreModule.c.P1.n3(((DbObject) user).id, str, TextUtils.equals("coin", str) ? CoreModule.c.H0.s4(SummarizedPrivilegesId.get("instantChat")) : "")).subscribe((m250) mkd0.H(new e30() { // from class: l.gh50
            @Override // p003l.e30
            public final void call(Object obj) {
                C0039b.m687a(str, str2, user, act, d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.hh50
            @Override // p003l.e30
            public final void call(Object obj) {
                C0039b.m690d(e30Var, user, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public static void m685B(Act act, final d30 d30Var, final PurchaseType purchaseType) {
        cwf0 cwf0VarN1 = swh0.N1(purchaseType);
        x7y x7yVarT = new x7y.a(act).D("一键配对").C(i0g0.N(String.format("本次享受 %s 探探币限时优惠价格\n一键配对用完了，可以用探探币购买更多", Integer.valueOf(CoreModule.c.H0.A4())), act.color(w0c0.I), eqh0.m3924c(2))).x(act.string(R.string.Cp), new e30() { // from class: l.jh50
            @Override // p003l.e30
            public final void call(Object obj) {
                C0039b.m695i(d30Var, purchaseType, (x7y) obj);
            }
        }).A(false).u(act.string(R.string.c)).z(swh0.p0().y0()).w(R.string.Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.kh50
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.p0().K0(z);
            }
        }).t();
        x7yVarT.g().B(x2c0.w5).F(zz6.u0() ? x2c0.y5 : x2c0.x5);
        x7yVarT.m(cwf0VarN1);
        x7yVarT.n();
    }

    /* JADX INFO: renamed from: C */
    public static String m686C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "other";
        }
        str.getClass();
        switch (str) {
            case "from_picks":
            case "from_new_meet_picks_feed":
                return "picks";
            case "from_new_meet_see_feed":
            case "from_meet_feed":
                return "meet";
            case "photo_album_feed_from_discover_dating":
                return "explore";
            case "liked_users":
                return "iliked";
            case "moment_visitor":
                return "diamond_tab";
            case "home_card":
                return "home";
            default:
                return "other";
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m687a(String str, String str2, final User user, Act act, d30 d30Var, Envelope envelope) {
        if (TextUtils.equals("privilege", str)) {
            CoreModule.c.C0.u4();
        } else {
            CoreModule.c.H0.k5();
        }
        if (TextUtils.equals(str2, "home_moment_theme_card")) {
            CoreModule.c.n0.U3(((DbObject) user).id);
        } else if ("p_home,odiamond_sayhi".equals(str2)) {
            e51.H(act, new Runnable() { // from class: l.lh50
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.m0.E8(((DbObject) user).id);
                }
            }, 500L);
        } else {
            CoreModule.c.m0.E8(((DbObject) user).id);
        }
        if (ura.e().d().U9()) {
            CoreModule.c.f2.K3(((DbObject) user).id);
        }
        if (CoreModule.c.y2.E3()) {
            CoreModule.c.y2.W3(((DbObject) user).id);
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m689c(Act act, User user, d30 d30Var) {
        act.startActivityWithCustomTransition(MatchAct.m617e2(act, vwb.f0(new String[]{((DbObject) user).id}), 46, new ArrayList()), new MatchAct.C0037b());
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m690d(e30 e30Var, User user, Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && NullChecker.a(e30Var)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            if (i == 40399) {
                e30Var.call(tantanForbidden.message);
                zvf0.u("e_odiamond_sayhi_toast", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("other_user_id", ((DbObject) user).id)});
            } else if (i == 40343) {
                e30Var.call("今天的一键配对用完了，明天再来吧");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m692f(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m694h(Act act, User user, d30 d30Var) {
        act.startActivityWithCustomTransition(MatchAct.m617e2(act, vwb.f0(new String[]{((DbObject) user).id}), 46, new ArrayList()), new MatchAct.C0037b());
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m695i(d30 d30Var, PurchaseType purchaseType, x7y x7yVar) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        swh0.M1(purchaseType);
        swh0.p0().T0();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m696j(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: l */
    public static void m697l(Act act, String str, final d30 d30Var) {
        c.a0(act, str, new e30() { // from class: l.ch50
            @Override // p003l.e30
            public final void call(Object obj) {
                C0039b.m696j((PurchaseType) obj);
            }
        }, new d30() { // from class: l.dh50
            @Override // p003l.d30
            public final void call() {
                C0039b.m692f(d30Var);
            }
        }, (d30) null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: m */
    public static void m698m(Act act, User user, String str) {
        m699n(act, user, str, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m699n(final Act act, final User user, String str, final d30 d30Var) {
        if (user == null) {
            return;
        }
        if (m705u() || m707w()) {
            m709y(act, user, new d30() { // from class: l.fh50
                @Override // p003l.d30
                public final void call() {
                    C0039b.m689c(act, user, d30Var);
                }
            }, str);
        } else {
            act.startActivityWithCustomTransition(CoreModule.P().a().n8(act, vwb.f0(new String[]{((DbObject) user).id}), CoreModule.P().a().nr(), new ArrayList(), str), CoreModule.P().a().hg(act));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m700o(final Act act, final User user, String str, final d30 d30Var) {
        if (user == null) {
            return;
        }
        if (m705u() || m707w()) {
            m709y(act, user, new d30() { // from class: l.ih50
                @Override // p003l.d30
                public final void call() {
                    C0039b.m694h(act, user, d30Var);
                }
            }, str);
        } else {
            m697l(act, str, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public static C0039b m701q() {
        if (f369b == null) {
            synchronized (C0039b.class) {
                try {
                    if (f369b == null) {
                        f369b = new C0039b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f369b;
    }

    /* JADX INFO: renamed from: r */
    public static void m702r(Act act, User user) {
        act.startActivity(MessagesAct.m2035i2(act, ((DbObject) user).id, false, false));
    }

    /* JADX INFO: renamed from: s */
    public static void m703s(Activity activity) {
        if (CoreModule.K().sg("-11006")) {
            activity.startActivity(MessagesAct.m2035i2(activity, "-11006", false, false));
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m704t() {
        return xma.Q3() > 0;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m705u() {
        return xma.F3();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m706v(String str) {
        return TextUtils.equals(str, "-11006");
    }

    /* JADX INFO: renamed from: w */
    public static boolean m707w() {
        return xma.N3();
    }

    /* JADX INFO: renamed from: x */
    public static void m708x(Act act, User user, d30 d30Var) {
        m709y(act, user, d30Var, null);
    }

    /* JADX INFO: renamed from: y */
    public static void m709y(final Act act, final User user, final d30 d30Var, final String str) {
        if (CoreModule.K().sg(((DbObject) user).id) || User.isMatched(user)) {
            du2.a("[onebtnmatch]", "has_im or match == " + ((DbObject) user).id);
            m702r(act, user);
            return;
        }
        if (m704t()) {
            m684A(act, user, "privilege", d30Var, new npo(), str);
            return;
        }
        if (!swh0.F()) {
            swh0.q1(act, ("p_pay_result,e_odiamond_sayhi,click".equals(str) || "p_meet_visit,odiamond_sayhi".equals(str)) ? str : "p_diamond_tab,e_diamond_sayhi,click", CoreModule.c.H0.A4());
        } else if (swh0.p0().d1()) {
            m685B(act, new d30() { // from class: l.eh50
                @Override // p003l.d30
                public final void call() {
                    C0039b.m684A(act, user, "coin", d30Var, new npo(), str);
                }
            }, PurchaseType.TYPE_O_DIAMOND);
        } else {
            m684A(act, user, "coin", d30Var, new npo(), str);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m710z() {
        f369b = null;
    }

    /* JADX INFO: renamed from: k */
    public void m711k() {
        this.f370a++;
    }

    /* JADX INFO: renamed from: p */
    public int m712p() {
        return this.f370a;
    }
}
