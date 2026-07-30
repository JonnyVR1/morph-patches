package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.LocalPlaceBan;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a4g0;
import l.d30;
import l.e30;
import l.e51;
import l.hpd0;
import l.kpd0;
import l.mkd0;
import l.mqi0;
import l.n3b0;
import l.q860;
import l.qqi0;
import l.roj0;
import l.vwb;
import l.x9j;
import l.z3g0;
import l.zz6;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fap {

    /* JADX INFO: renamed from: f */
    public static a<Boolean> f12623f = a.b();

    /* JADX INFO: renamed from: g */
    public static boolean f12624g = false;

    /* JADX INFO: renamed from: h */
    public static hpd0 f12625h = new hpd0("see_letter_cover_home_guide_shown", Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public String f12626a;

    /* JADX INFO: renamed from: b */
    public z3g0 f12627b;

    /* JADX INFO: renamed from: c */
    public kpd0 f12628c;

    /* JADX INFO: renamed from: d */
    public a<roj0> f12629d;

    /* JADX INFO: renamed from: e */
    public double f12630e;

    /* JADX INFO: renamed from: l.fap$a */
    public static class C0714a {
        private static final fap INSTANCE = new fap();
    }

    public fap() {
        this.f12626a = "";
        this.f12629d = a.c(roj0.a);
        this.f12630e = 0.0d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ q860 m15271b(q860 q860Var, roj0 roj0Var) {
        return q860Var;
    }

    /* JADX INFO: renamed from: g */
    public static void m15274g(Conversation conversation) {
        CoreModule.f1534c.f3631f0.m4739Tf(conversation.otherUser);
    }

    /* JADX INFO: renamed from: i */
    public static fap m15275i() {
        return C0714a.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m15276j() {
        return xma.m27349D3() || swh0.m24242G();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15277k(Conversation conversation) {
        if (NullChecker.a(conversation)) {
            return TextUtils.equals(((DbObject) conversation).id, "-770011");
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m15278l(Conversation conversation) {
        if (NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.oneSide)) {
            return TEnum.equals(conversation.additional.oneSide.subChannel, "intlSvipLetterC");
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m15279m(Conversation conversation) {
        return NullChecker.a(conversation) && m15278l(conversation) && !TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m15280n(String str) {
        return m15279m(CoreModule.f1534c.f3631f0.m4786Xe(str));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m15281o(Conversation conversation) {
        return m15278l(conversation) && TextUtils.equals(conversation.convType, "oneSide");
    }

    /* JADX INFO: renamed from: p */
    public static boolean m15282p(String str) {
        return m15281o(CoreModule.f1534c.f3631f0.m4786Xe(str));
    }

    /* JADX INFO: renamed from: t */
    public static void m15283t(Act act, String str, d30 d30Var) {
        if (xma.m27349D3()) {
            d30Var.call();
            return;
        }
        if (n3b0.i() <= 0) {
            CoreModule.m1854P().m11706a().m5559wr(act, str, Privilege.see_letter_gp);
        } else if (swh0.m24242G()) {
            d30Var.call();
        } else {
            swh0.m24315s1(act, str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m15284w(Envelope envelope) {
        if (!u59.m24998f0() || vwb.J(envelope.getModuleData(CoreData.class).conversations)) {
            return;
        }
        for (Conversation conversation : envelope.getModuleData(CoreData.class).conversations) {
            if (!m15278l(conversation) || !TextUtils.equals(conversation.convType, "oneSide")) {
                conversation.localPlaceBan = LocalPlaceBan.get(AccountMakeupPageAdapter.MakeupItem.NONE);
            } else if (TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.m1850H().userId())) {
                conversation.localPlaceBan = LocalPlaceBan.get("matchList");
            } else {
                conversation.localPlaceBan = LocalPlaceBan.get("both");
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m15285x() {
        return zz6.u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9HUlRRNlhDUlpQSlo3WUNZNDc1WFhGTURJRE00VzA2IiwidyI6MTMyNCwiaCI6MTE2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyNTIyOTAyNTU5MDkxMTg3NzN9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9LREtLVUk2U1FYSjZaRFkzVlhGSDVOMlI0UkRRWTA2IiwidyI6MTMyNCwiaCI6MTE2MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyNTIzMDMxMjM0Mjc5NjM2ODl9.png";
    }

    /* JADX INFO: renamed from: y */
    public static boolean m15286y() {
        boolean zM15287z = m15287z();
        f12623f.onNext(Boolean.valueOf(zM15287z));
        return zM15287z;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m15287z() {
        if (!IntlCountryCodeController.m21v() && u59.m24998f0()) {
            if (n3b0.i() > 0) {
                return true;
            }
            User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
            if (NullChecker.a(userM21483na) && (qqi0.h(mqi0.o(), (long) userM21483na.createdTime, 1) || nkp.m20160f() || f12624g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public void m15288A(String str) {
        this.f12626a = str;
    }

    /* JADX INFO: renamed from: e */
    public void m15289e() {
        z3g0 z3g0VarA = a4g0.a();
        this.f12627b = z3g0VarA;
        z3g0VarA.b(mkd0.r(CoreModule.f1534c.f3631f0.m4516Ap(), this.f12629d, new x9j() { // from class: l.bap
            public final Object call(Object obj, Object obj2) {
                return fap.m15271b((q860) obj, (roj0) obj2);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.cap
            public final void call(Object obj) {
                this.f9564a.m15294s((q860) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: f */
    public void m15290f() {
        if (!NullChecker.a(this.f12628c)) {
            this.f12628c = new kpd0("lastClickSetItemTimestamp_" + CoreModule.m1850H().userId(), 0.0d);
        }
        this.f12628c.put(Double.valueOf(this.f12630e));
        this.f12629d.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: h */
    public String m15291h() {
        return this.f12626a;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m15292q(q860 q860Var) {
        if (!u59.m24998f0()) {
            CoreModule.f1534c.f3631f0.m4558Ef("-770011");
            return;
        }
        Conversation conversation = (Conversation) vwb.F(q860Var.a);
        if (!NullChecker.a(conversation)) {
            CoreModule.f1534c.f3631f0.m4558Ef("-770011");
            return;
        }
        f12624g = true;
        Boolean bool = (Boolean) f12623f.e();
        if (bool == null || bool == Boolean.FALSE) {
            m15286y();
        }
        Conversation conversationClone = conversation.clone();
        ((DbObject) conversationClone).id = "-770011";
        conversationClone.localPlaceBan = LocalPlaceBan.get(AccountMakeupPageAdapter.MakeupItem.NONE);
        conversationClone.convType = "conversation_type_see_letter";
        this.f12630e = conversationClone.latestTime;
        conversationClone.unreadMessages = CoreModule.f1534c.f3631f0.m5017po();
        CoreModule.f1534c.f3631f0.m4980mq(conversationClone);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m15293r(final q860 q860Var) {
        CoreModule.f1534c.f3598U.m13685a(new d30() { // from class: l.eap
            public final void call() {
                this.f11034a.m15292q(q860Var);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m15294s(final q860 q860Var) {
        e51.y(new Runnable() { // from class: l.dap
            @Override // java.lang.Runnable
            public final void run() {
                this.f10267a.m15293r(q860Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m15295u() {
        this.f12626a = "";
    }

    /* JADX INFO: renamed from: v */
    public void m15296v() {
        if (NullChecker.a(this.f12627b)) {
            this.f12627b.unsubscribe();
        }
        this.f12627b = a4g0.a();
        f12624g = false;
        this.f12628c = null;
    }
}
