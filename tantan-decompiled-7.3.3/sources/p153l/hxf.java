package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class hxf {

    /* JADX INFO: renamed from: a */
    public static long f111997a;

    /* JADX INFO: renamed from: b */
    public static jxd0 f111998b;

    /* JADX INFO: renamed from: c */
    public static jxd0 f111999c;

    /* JADX INFO: renamed from: d */
    public static PhoneNumber f112000d;

    static {
        Boolean bool = Boolean.FALSE;
        f111998b = new jxd0("isVerificationByPicture", bool);
        f111999c = new jxd0("isVerificationByIDCard", bool);
        f112000d = null;
    }

    /* JADX INFO: renamed from: b */
    public static void m137581b(Act act, String str, boolean z, String str2) {
        if (m137582c(act, str, false)) {
            m137586g(act, str, false, "", "", 3, z, str2, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m137582c(Act act, String str, boolean z) {
        if (TextUtils.equals("appeal", str) || TextUtils.equals("fakeBatch", str) || TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg") || TextUtils.equals(str, "fromAccountBackH5")) {
            return true;
        }
        if (!z) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9.status) && userM116600p9.status.contains(UserStatus.get("hidden")) && !App.f16092i.get().equals(CoreModule.f18264c.f20381e0.m116472I7())) {
                o1j0.m165646t(act.string(R$string.f19321hs)).show();
                return false;
            }
        }
        if (!CoreModule.f18264c.f20381e0.m116600p9().isVedioforFp()) {
            return true;
        }
        o1j0.m165646t(act.string(R$string.f19443ls)).show();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m137583d(Act act, String str) {
        m137584e(act, str, false);
    }

    /* JADX INFO: renamed from: e */
    public static void m137584e(Act act, String str, boolean z) {
        m137585f(act, str, false, "", "", 1, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m137585f(Act act, String str, boolean z, String str2, String str3, int i, boolean z2) {
        m137586g(act, str, z, str2, str3, i, z2, null, false);
    }

    /* JADX INFO: renamed from: g */
    public static void m137586g(Act act, String str, boolean z, String str2, String str3, int i, boolean z2, String str4, boolean z3) {
        wiw.m206612m();
        d3l0.m113845b(str, x5l0.m209396i(str, i));
        if (m137591l()) {
            return;
        }
        new o3l0().m165867j(act, str, z, str2, str3, i, false, str4, z3);
    }

    /* JADX INFO: renamed from: h */
    public static void m137587h(Act act, String str) {
        m137588i(act, str, false, false);
    }

    /* JADX INFO: renamed from: i */
    public static void m137588i(Act act, String str, boolean z, boolean z2) {
        if (m137582c(act, str, z2)) {
            m137586g(act, str, false, "", "", 1, z, null, z2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static PhoneNumber m137589j() {
        return f112000d;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m137590k(Act act, String str, String str2, int i) {
        return q5l0.m175459D(act, str, str2, i);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m137591l() {
        if (Math.abs(pzi0.m174454o() - f111997a) < 1000) {
            return true;
        }
        f111997a = pzi0.m174454o();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static void m137592m(kxf kxfVar, VerificationToken verificationToken, Act act, String str, int i) {
        d4l0.m114219l(kxfVar, verificationToken, act, str, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m137593n() {
        TTFacertificationClient.m61385p().m61396z(y5l0.m214311e("1"));
    }

    /* JADX INFO: renamed from: o */
    public static void m137594o(PhoneNumber phoneNumber) {
        f112000d = phoneNumber;
    }

    /* JADX INFO: renamed from: p */
    public static void m137595p(Act act, String str) {
        q5l0.m175467L(act, str);
    }

    /* JADX INFO: renamed from: q */
    public static void m137596q(Act act, String str) {
        boolean zEquals = TextUtils.equals(str, "verification_center");
        final l4g0 l4g0VarM204399c = w1e.m204399c(zEquals ? "p_avatar_verification_review_verification_center" : "p_avatar_verification_review_swipe_page", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b(zEquals ? Active.TYPE : "passive", "alert", "alert_self_definition_basic", zEquals ? "verification_center_avatar_button" : "card", zEquals ? "verification_center" : "swipe_page", zEquals ? "click" : "swipe"));
        CoreDlg.m46164E1(act, act.string(R$string.f19259fs), act.string(R$string.f19228es), dbc0.f87123jk, act.string(R$string.f18894Tr), null, false, null, null, new x20() { // from class: l.gxf
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
    }
}
