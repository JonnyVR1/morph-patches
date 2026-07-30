package com.p046p1.mobile.putong.core.p053ui.match;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.cwf0;
import p149l.d30;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.i0g0;
import p149l.mkd0;
import p149l.npo;
import p149l.swh0;
import p149l.ura;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.x7y;
import p149l.xma;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.b */
/* JADX INFO: loaded from: classes3.dex */
public class C8456b {

    /* JADX INFO: renamed from: b */
    public static C8456b f30478b;

    /* JADX INFO: renamed from: a */
    public int f30479a = 0;

    /* JADX INFO: renamed from: A */
    public static void m47620A(final Act act, final User user, final String str, @NonNull final d30 d30Var, final e30<String> e30Var, final String str2) {
        act.duringCreated(CoreModule.f17545c.f19595P1.m196847n3(user.f56011id, str, TextUtils.equals("coin", str) ? CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get("instantChat")) : "")).subscribe(mkd0.m154956H(new e30() { // from class: l.gh50
            @Override // p149l.e30
            public final void call(Object obj) {
                C8456b.m47623a(str, str2, user, act, d30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.hh50
            @Override // p149l.e30
            public final void call(Object obj) {
                C8456b.m47626d(e30Var, user, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public static void m47621B(Act act, final d30 d30Var, final PurchaseType purchaseType) {
        cwf0 cwf0VarM186207N1 = swh0.m186207N1(purchaseType);
        x7y x7yVarM207348t = new x7y.C21039a(act).m207345D("一键配对").m207344C(i0g0.m133847N(String.format("本次享受 %s 探探币限时优惠价格\n一键配对用完了，可以用探探币购买更多", Integer.valueOf(CoreModule.f17545c.f19570H0.m210318A4())), act.color(w0c0.f183773I), eqh0.m117752c(2))).m207352x(act.string(R$string.f17652Cp), new e30() { // from class: l.jh50
            @Override // p149l.e30
            public final void call(Object obj) {
                C8456b.m47631i(d30Var, purchaseType, (x7y) obj);
            }
        }).m207342A(false).m207349u(act.string(R$string.f18408c)).m207354z(swh0.m186255p0().m186322y0()).m207351w(R$string.f17798Hl, new CompoundButton.OnCheckedChangeListener() { // from class: l.kh50
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                swh0.m186255p0().m186287K0(z);
            }
        }).m207348t();
        x7yVarM207348t.m207317g().m45154B(x2c0.f190672w5).m45157F(zz6.m221004u0() ? x2c0.f190736y5 : x2c0.f190704x5);
        x7yVarM207348t.m207323m(cwf0VarM186207N1);
        x7yVarM207348t.m207324n();
    }

    /* JADX INFO: renamed from: C */
    public static String m47622C(String str) {
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
                return Explore.TYPE;
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
    public static /* synthetic */ void m47623a(String str, String str2, final User user, Act act, d30 d30Var, Envelope envelope) {
        if (TextUtils.equals("privilege", str)) {
            CoreModule.f17545c.f19555C0.m210112u4();
        } else {
            CoreModule.f17545c.f19570H0.m210361k5();
        }
        if (TextUtils.equals(str2, "home_moment_theme_card")) {
            CoreModule.f17545c.f19666n0.m31450U3(user.f56011id);
        } else if ("p_home,odiamond_sayhi".equals(str2)) {
            e51.m114743H(act, new Runnable() { // from class: l.lh50
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19663m0.m30994E8(user.f56011id);
                }
            }, 500L);
        } else {
            CoreModule.f17545c.f19663m0.m30994E8(user.f56011id);
        }
        if (ura.m195053e().m195057d().mo33755U9()) {
            CoreModule.f17545c.f19644f2.m148606K3(user.f56011id);
        }
        if (CoreModule.f17545c.f19701y2.m155330E3()) {
            CoreModule.f17545c.f19701y2.m155348W3(user.f56011id);
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m47625c(Act act, User user, d30 d30Var) {
        act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(user.f56011id), 46, new ArrayList()), new MatchAct.C8454b());
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m47626d(e30 e30Var, User user, Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && NullChecker.m81303a(e30Var)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            if (i == 40399) {
                e30Var.call(tantanForbidden.message);
                zvf0.m220399u("e_odiamond_sayhi_toast", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("other_user_id", user.f56011id));
            } else if (i == 40343) {
                e30Var.call("今天的一键配对用完了，明天再来吧");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m47628f(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m47630h(Act act, User user, d30 d30Var) {
        act.startActivityWithCustomTransition(MatchAct.m47563e2(act, vwb.m200324f0(user.f56011id), 46, new ArrayList()), new MatchAct.C8454b());
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m47631i(d30 d30Var, PurchaseType purchaseType, x7y x7yVar) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        swh0.m186205M1(purchaseType);
        swh0.m186255p0().m186300T0();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m47632j(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: l */
    public static void m47633l(Act act, String str, final d30 d30Var) {
        C8764c.m53439a0(act, str, new e30() { // from class: l.ch50
            @Override // p149l.e30
            public final void call(Object obj) {
                C8456b.m47632j((PurchaseType) obj);
            }
        }, new d30() { // from class: l.dh50
            @Override // p149l.d30
            public final void call() {
                C8456b.m47628f(d30Var);
            }
        }, null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: m */
    public static void m47634m(Act act, User user, String str) {
        m47635n(act, user, str, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m47635n(final Act act, final User user, String str, final d30 d30Var) {
        if (user == null) {
            return;
        }
        if (m47641u() || m47643w()) {
            m47645y(act, user, new d30() { // from class: l.fh50
                @Override // p149l.d30
                public final void call() {
                    C8456b.m47625c(act, user, d30Var);
                }
            }, str);
        } else {
            act.startActivityWithCustomTransition(CoreModule.m29935P().m94651a().mo33551n8(act, vwb.m200324f0(user.f56011id), CoreModule.m29935P().m94651a().mo33553nr(), new ArrayList<>(), str), CoreModule.m29935P().m94651a().mo33512hg(act));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m47636o(final Act act, final User user, String str, final d30 d30Var) {
        if (user == null) {
            return;
        }
        if (m47641u() || m47643w()) {
            m47645y(act, user, new d30() { // from class: l.ih50
                @Override // p149l.d30
                public final void call() {
                    C8456b.m47630h(act, user, d30Var);
                }
            }, str);
        } else {
            m47633l(act, str, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public static C8456b m47637q() {
        if (f30478b == null) {
            synchronized (C8456b.class) {
                try {
                    if (f30478b == null) {
                        f30478b = new C8456b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30478b;
    }

    /* JADX INFO: renamed from: r */
    public static void m47638r(Act act, User user) {
        act.startActivity(MessagesAct.m48943i2(act, user.f56011id, false, false));
    }

    /* JADX INFO: renamed from: s */
    public static void m47639s(Activity activity) {
        if (CoreModule.m29932K().mo30819sg(User.ID_ODIAMOND_SERVICE)) {
            activity.startActivity(MessagesAct.m48943i2(activity, User.ID_ODIAMOND_SERVICE, false, false));
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m47640t() {
        return xma.m210052Q3() > 0;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m47641u() {
        return xma.m210043F3();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m47642v(String str) {
        return TextUtils.equals(str, User.ID_ODIAMOND_SERVICE);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m47643w() {
        return xma.m210049N3();
    }

    /* JADX INFO: renamed from: x */
    public static void m47644x(Act act, User user, d30 d30Var) {
        m47645y(act, user, d30Var, null);
    }

    /* JADX INFO: renamed from: y */
    public static void m47645y(final Act act, final User user, final d30 d30Var, final String str) {
        if (CoreModule.m29932K().mo30819sg(user.f56011id) || User.isMatched(user)) {
            du2.m113670a("[onebtnmatch]", "has_im or match == " + user.f56011id);
            m47638r(act, user);
            return;
        }
        if (m47640t()) {
            m47620A(act, user, "privilege", d30Var, new npo(), str);
            return;
        }
        if (!swh0.m186188F()) {
            swh0.m186259q1(act, ("p_pay_result,e_odiamond_sayhi,click".equals(str) || "p_meet_visit,odiamond_sayhi".equals(str)) ? str : "p_diamond_tab,e_diamond_sayhi,click", CoreModule.f17545c.f19570H0.m210318A4());
        } else if (swh0.m186255p0().m186310d1()) {
            m47621B(act, new d30() { // from class: l.eh50
                @Override // p149l.d30
                public final void call() {
                    C8456b.m47620A(act, user, "coin", d30Var, new npo(), str);
                }
            }, PurchaseType.TYPE_O_DIAMOND);
        } else {
            m47620A(act, user, "coin", d30Var, new npo(), str);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m47646z() {
        f30478b = null;
    }

    /* JADX INFO: renamed from: k */
    public void m47647k() {
        this.f30479a++;
    }

    /* JADX INFO: renamed from: p */
    public int m47648p() {
        return this.f30479a;
    }
}
