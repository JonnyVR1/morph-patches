package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class tvf {

    /* JADX INFO: renamed from: a */
    public static long f172280a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f172281b;

    /* JADX INFO: renamed from: c */
    public static hpd0 f172282c;

    /* JADX INFO: renamed from: d */
    public static PhoneNumber f172283d;

    static {
        Boolean bool = Boolean.FALSE;
        f172281b = new hpd0("isVerificationByPicture", bool);
        f172282c = new hpd0("isVerificationByIDCard", bool);
        f172283d = null;
    }

    /* JADX INFO: renamed from: b */
    public static void m190724b(Act act, String str, boolean z, String str2) {
        if (m190725c(act, str, false)) {
            m190729g(act, str, false, "", "", 3, z, str2, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m190725c(Act act, String str, boolean z) {
        if (TextUtils.equals("appeal", str) || TextUtils.equals("fakeBatch", str) || TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg") || TextUtils.equals(str, "fromAccountBackH5")) {
            return true;
        }
        if (!z) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9.status) && userM169527p9.status.contains(UserStatus.get("hidden")) && !App.f15373i.get().equals(CoreModule.f17545c.f19639e0.m169399I7())) {
                lsi0.m151590t(act.string(R$string.f17924Lr)).show();
                return false;
            }
        }
        if (!CoreModule.f17545c.f19639e0.m169527p9().isVedioforFp()) {
            return true;
        }
        lsi0.m151590t(act.string(R$string.f18044Pr)).show();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m190726d(Act act, String str) {
        m190727e(act, str, false);
    }

    /* JADX INFO: renamed from: e */
    public static void m190727e(Act act, String str, boolean z) {
        m190728f(act, str, false, "", "", 1, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m190728f(Act act, String str, boolean z, String str2, String str3, int i, boolean z2) {
        m190729g(act, str, z, str2, str3, i, z2, null, false);
    }

    /* JADX INFO: renamed from: g */
    public static void m190729g(Act act, String str, boolean z, String str2, String str3, int i, boolean z2, String str4, boolean z3) {
        xgw.m208711m();
        xtk0.m210979b(str, rwk0.m181426i(str, i));
        if (m190734l()) {
            return;
        }
        new iuk0().m138419j(act, str, z, str2, str3, i, false, str4, z3);
    }

    /* JADX INFO: renamed from: h */
    public static void m190730h(Act act, String str) {
        m190731i(act, str, false, false);
    }

    /* JADX INFO: renamed from: i */
    public static void m190731i(Act act, String str, boolean z, boolean z2) {
        if (m190725c(act, str, z2)) {
            m190729g(act, str, false, "", "", 1, z, null, z2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static PhoneNumber m190732j() {
        return f172283d;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m190733k(Act act, String str, String str2, int i) {
        return kwk0.m147553D(act, str, str2, i);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m190734l() {
        if (Math.abs(mqi0.m155944o() - f172280a) < 1000) {
            return true;
        }
        f172280a = mqi0.m155944o();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m190735m(wvf wvfVar, VerificationToken verificationToken, Act act, String str, int i) {
        xuk0.m211107l(wvfVar, verificationToken, act, str, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m190736n() {
        TTFacertificationClient.m60201p().m60212z(swk0.m186329e("1"));
    }

    /* JADX INFO: renamed from: o */
    public static void m190737o(PhoneNumber phoneNumber) {
        f172283d = phoneNumber;
    }

    /* JADX INFO: renamed from: p */
    public static void m190738p(Act act, String str) {
        kwk0.m147561L(act, str);
    }

    /* JADX INFO: renamed from: q */
    public static void m190739q(Act act, String str) {
        boolean zEquals = TextUtils.equals(str, "verification_center");
        final cwf0 cwf0VarM133794c = i0e.m133794c(zEquals ? "p_avatar_verification_review_verification_center" : "p_avatar_verification_review_swipe_page", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b(zEquals ? Active.TYPE : "passive", "alert", "alert_self_definition_basic", zEquals ? "verification_center_avatar_button" : "card", zEquals ? "verification_center" : "swipe_page", zEquals ? "click" : "swipe"));
        CoreDlg.m44981E1(act, act.string(R$string.f17864Jr), act.string(R$string.f17834Ir), x2c0.f190654vj, act.string(R$string.f19076xr), null, false, null, null, new d30() { // from class: l.svf
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
    }
}
