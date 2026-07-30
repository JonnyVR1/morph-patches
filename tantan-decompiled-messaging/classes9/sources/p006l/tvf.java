package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.VerificationToken;
import com.p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.hpd0;
import l.i0e;
import l.lsi0;
import l.mqi0;
import l.u4e;
import l.wvf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tvf {

    /* JADX INFO: renamed from: a */
    public static long f22296a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f22297b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f22298c;

    /* JADX INFO: renamed from: d */
    public static PhoneNumber f22299d;

    static {
        Boolean bool = Boolean.FALSE;
        f22297b = new hpd0("isVerificationByPicture", bool);
        f22298c = new hpd0("isVerificationByIDCard", bool);
        f22299d = null;
    }

    /* JADX INFO: renamed from: b */
    public static void m24823b(Act act, String str, boolean z, String str2) {
        if (m24824c(act, str, false)) {
            m24828g(act, str, false, "", "", 3, z, str2, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24824c(Act act, String str, boolean z) {
        if (TextUtils.equals("appeal", str) || TextUtils.equals("fakeBatch", str) || TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg") || TextUtils.equals(str, "fromAccountBackH5")) {
            return true;
        }
        if (!z) {
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            if (NullChecker.a(userM21490p9.status) && userM21490p9.status.contains(UserStatus.get("hidden")) && !((Integer) App.i.get()).equals(CoreModule.f1534c.f3628e0.m21362I7())) {
                lsi0.t(act.string(R$string.f1913Lr)).show();
                return false;
            }
        }
        if (!CoreModule.f1534c.f3628e0.m21490p9().isVedioforFp()) {
            return true;
        }
        lsi0.t(act.string(R$string.f2033Pr)).show();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m24825d(Act act, String str) {
        m24826e(act, str, false);
    }

    /* JADX INFO: renamed from: e */
    public static void m24826e(Act act, String str, boolean z) {
        m24827f(act, str, false, "", "", 1, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m24827f(Act act, String str, boolean z, String str2, String str3, int i, boolean z2) {
        m24828g(act, str, z, str2, str3, i, z2, null, false);
    }

    /* JADX INFO: renamed from: g */
    public static void m24828g(Act act, String str, boolean z, String str2, String str3, int i, boolean z2, String str4, boolean z3) {
        xgw.m27237m();
        xtk0.m27607b(str, rwk0.m23350i(str, i));
        if (m24833l()) {
            return;
        }
        new iuk0().m17046j(act, str, z, str2, str3, i, false, str4, z3);
    }

    /* JADX INFO: renamed from: h */
    public static void m24829h(Act act, String str) {
        m24830i(act, str, false, false);
    }

    /* JADX INFO: renamed from: i */
    public static void m24830i(Act act, String str, boolean z, boolean z2) {
        if (m24824c(act, str, z2)) {
            m24828g(act, str, false, "", "", 1, z, null, z2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static PhoneNumber m24831j() {
        return f22299d;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m24832k(Act act, String str, String str2, int i) {
        return kwk0.m18276D(act, str, str2, i);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m24833l() {
        if (Math.abs(mqi0.o() - f22296a) < 1000) {
            return true;
        }
        f22296a = mqi0.o();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m24834m(wvf wvfVar, VerificationToken verificationToken, Act act, String str, int i) {
        xuk0.m27639l(wvfVar, verificationToken, act, str, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m24835n() {
        TTFacertificationClient.p().z(swk0.m24379e("1"));
    }

    /* JADX INFO: renamed from: o */
    public static void m24836o(PhoneNumber phoneNumber) {
        f22299d = phoneNumber;
    }

    /* JADX INFO: renamed from: p */
    public static void m24837p(Act act, String str) {
        kwk0.m18284L(act, str);
    }

    /* JADX INFO: renamed from: q */
    public static void m24838q(Act act, String str) {
        boolean zEquals = TextUtils.equals(str, "verification_center");
        final cwf0 cwf0VarC = i0e.c(zEquals ? "p_avatar_verification_review_verification_center" : "p_avatar_verification_review_swipe_page", Dialog.class.getName());
        cwf0VarC.o(u4e.b(zEquals ? "active" : "passive", "alert", "alert_self_definition_basic", zEquals ? "verification_center_avatar_button" : "card", zEquals ? "verification_center" : "swipe_page", zEquals ? "click" : "swipe"));
        CoreDlg.E1(act, act.string(R$string.f1853Jr), act.string(R$string.f1823Ir), x2c0.f27190vj, act.string(R$string.f3065xr), (d30) null, false, (String) null, (d30) null, new d30() { // from class: l.svf
            public final void call() {
                i0e.e(cwf0VarC);
            }
        });
        i0e.f(cwf0VarC);
    }
}
