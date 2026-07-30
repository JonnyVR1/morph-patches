package com.p051p1.mobile.putong.core.p058ui.match;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Explore;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.a5i0;
import p153l.c17;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gta;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.l4g0;
import p153l.l51;
import p153l.lyh0;
import p153l.nro;
import p153l.psd0;
import p153l.q8g0;
import p153l.tu2;
import p153l.ugy;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.b */
/* JADX INFO: loaded from: classes3.dex */
public class C8619b {

    /* JADX INFO: renamed from: b */
    public static C8619b f31326b;

    /* JADX INFO: renamed from: a */
    public int f31327a = 0;

    /* JADX INFO: renamed from: A */
    public static void m48803A(final Act act, final User user, final String str, @NonNull final x20 x20Var, final y20<String> y20Var, final String str2) {
        act.duringCreated(CoreModule.f18264c.f20337P1.m119521n3(user.f56859id, str, TextUtils.equals("coin", str) ? CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get("instantChat")) : "")).subscribe(psd0.m173597H(new y20() { // from class: l.mp50
            @Override // p153l.y20
            public final void call(Object obj) {
                C8619b.m48806a(str, str2, user, act, x20Var, (Envelope) obj);
            }
        }, new y20() { // from class: l.np50
            @Override // p153l.y20
            public final void call(Object obj) {
                C8619b.m48809d(y20Var, user, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public static void m48804B(Act act, final x20 x20Var, final PurchaseType purchaseType) {
        l4g0 l4g0VarM96112N1 = a5i0.m96112N1(purchaseType);
        ugy ugyVarM195998t = new ugy.C20573a(act).m195995D("一键配对").m195994C(q8g0.m175782N(String.format("本次享受 %s 探探币限时优惠价格\n一键配对用完了，可以用探探币购买更多", Integer.valueOf(CoreModule.f18264c.f20312H0.m155406A4())), act.color(c9c0.f80342I), lyh0.m156283c(2))).m196002x(act.string(R$string.f19012Xp), new y20() { // from class: l.pp50
            @Override // p153l.y20
            public final void call(Object obj) {
                C8619b.m48814i(x20Var, purchaseType, (ugy) obj);
            }
        }).m195992A(false).m195999u(act.string(R$string.f19138c)).m196004z(a5i0.m96160p0().m96227y0()).m196001w(R$string.f19192dm, new CompoundButton.OnCheckedChangeListener() { // from class: l.qp50
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                a5i0.m96160p0().m96192K0(z);
            }
        }).m195998t();
        ugyVarM195998t.m195967g().m46337B(dbc0.f87567x5).m46340F(c17.m107528u0() ? dbc0.f87631z5 : dbc0.f87599y5);
        ugyVarM195998t.m195973m(l4g0VarM96112N1);
        ugyVarM195998t.m195974n();
    }

    /* JADX INFO: renamed from: C */
    public static String m48805C(String str) {
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
    public static /* synthetic */ void m48806a(String str, String str2, final User user, Act act, x20 x20Var, Envelope envelope) {
        if (TextUtils.equals("privilege", str)) {
            CoreModule.f18264c.f20297C0.m146425v4();
        } else {
            CoreModule.f18264c.f20312H0.m155449k5();
        }
        if (TextUtils.equals(str2, "home_moment_theme_card")) {
            CoreModule.f18264c.f20408n0.m32453U3(user.f56859id);
        } else if ("p_home,odiamond_sayhi".equals(str2)) {
            l51.m152888H(act, new Runnable() { // from class: l.rp50
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20405m0.m31997E8(user.f56859id);
                }
            }, 500L);
        } else {
            CoreModule.f18264c.f20405m0.m31997E8(user.f56859id);
        }
        if (gta.m132210e().m132214d().mo34758U9()) {
            CoreModule.f18264c.f20386f2.m214434K3(user.f56859id);
        }
        if (CoreModule.f18264c.f20443y2.m216799E3()) {
            CoreModule.f18264c.f20443y2.m216817W3(user.f56859id);
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48808c(Act act, User user, x20 x20Var) {
        act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(user.f56859id), 46, new ArrayList()), new MatchAct.C8617b());
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m48809d(y20 y20Var, User user, Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && NullChecker.m82486a(y20Var)) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            if (i == 40399) {
                y20Var.call(tantanForbidden.message);
                i4g0.m138523u("e_odiamond_sayhi_toast", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("other_user_id", user.f56859id));
            } else if (i == 40343) {
                y20Var.call("今天的一键配对用完了，明天再来吧");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m48811f(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m48813h(Act act, User user, x20 x20Var) {
        act.startActivityWithCustomTransition(MatchAct.m48746g2(act, jyb.m147507f0(user.f56859id), 46, new ArrayList()), new MatchAct.C8617b());
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m48814i(x20 x20Var, PurchaseType purchaseType, ugy ugyVar) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        a5i0.m96110M1(purchaseType);
        a5i0.m96160p0().m96205T0();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m48815j(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: l */
    public static void m48816l(Act act, String str, final x20 x20Var) {
        C8927c.m54622a0(act, str, new y20() { // from class: l.ip50
            @Override // p153l.y20
            public final void call(Object obj) {
                C8619b.m48815j((PurchaseType) obj);
            }
        }, new x20() { // from class: l.jp50
            @Override // p153l.x20
            public final void call() {
                C8619b.m48811f(x20Var);
            }
        }, null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: m */
    public static void m48817m(Act act, User user, String str) {
        m48818n(act, user, str, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m48818n(final Act act, final User user, String str, final x20 x20Var) {
        if (user == null) {
            return;
        }
        if (m48824u() || m48826w()) {
            m48828y(act, user, new x20() { // from class: l.lp50
                @Override // p153l.x20
                public final void call() {
                    C8619b.m48808c(act, user, x20Var);
                }
            }, str);
        } else {
            act.startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(act, jyb.m147507f0(user.f56859id), CoreModule.m30933P().m143405a().mo34556nr(), new ArrayList<>(), str), CoreModule.m30933P().m143405a().mo34515hg(act));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m48819o(final Act act, final User user, String str, final x20 x20Var) {
        if (user == null) {
            return;
        }
        if (m48824u() || m48826w()) {
            m48828y(act, user, new x20() { // from class: l.op50
                @Override // p153l.x20
                public final void call() {
                    C8619b.m48813h(act, user, x20Var);
                }
            }, str);
        } else {
            m48816l(act, str, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public static C8619b m48820q() {
        if (f31326b == null) {
            synchronized (C8619b.class) {
                try {
                    if (f31326b == null) {
                        f31326b = new C8619b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31326b;
    }

    /* JADX INFO: renamed from: r */
    public static void m48821r(Act act, User user) {
        act.startActivity(MessagesAct.m50126k2(act, user.f56859id, false, false));
    }

    /* JADX INFO: renamed from: s */
    public static void m48822s(Activity activity) {
        if (CoreModule.m30930K().mo31822sg(User.ID_ODIAMOND_SERVICE)) {
            activity.startActivity(MessagesAct.m50126k2(activity, User.ID_ODIAMOND_SERVICE, false, false));
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m48823t() {
        return joa.m146366R3() > 0;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m48824u() {
        return joa.m146357G3();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m48825v(String str) {
        return TextUtils.equals(str, User.ID_ODIAMOND_SERVICE);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m48826w() {
        return joa.m146363O3();
    }

    /* JADX INFO: renamed from: x */
    public static void m48827x(Act act, User user, x20 x20Var) {
        m48828y(act, user, x20Var, null);
    }

    /* JADX INFO: renamed from: y */
    public static void m48828y(final Act act, final User user, final x20 x20Var, final String str) {
        if (CoreModule.m30930K().mo31822sg(user.f56859id) || User.isMatched(user)) {
            tu2.m192703a("[onebtnmatch]", "has_im or match == " + user.f56859id);
            m48821r(act, user);
            return;
        }
        if (m48823t()) {
            m48803A(act, user, "privilege", x20Var, new nro(), str);
            return;
        }
        if (!a5i0.m96093F()) {
            a5i0.m96164q1(act, ("p_pay_result,e_odiamond_sayhi,click".equals(str) || "p_meet_visit,odiamond_sayhi".equals(str)) ? str : "p_diamond_tab,e_diamond_sayhi,click", CoreModule.f18264c.f20312H0.m155406A4());
        } else if (a5i0.m96160p0().m96215d1()) {
            m48804B(act, new x20() { // from class: l.kp50
                @Override // p153l.x20
                public final void call() {
                    C8619b.m48803A(act, user, "coin", x20Var, new nro(), str);
                }
            }, PurchaseType.TYPE_O_DIAMOND);
        } else {
            m48803A(act, user, "coin", x20Var, new nro(), str);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m48829z() {
        f31326b = null;
    }

    /* JADX INFO: renamed from: k */
    public void m48830k() {
        this.f31327a++;
    }

    /* JADX INFO: renamed from: p */
    public int m48831p() {
        return this.f31327a;
    }
}
