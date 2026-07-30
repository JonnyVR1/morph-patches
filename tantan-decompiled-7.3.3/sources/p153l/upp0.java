package p153l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.MobileRespInfo;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class upp0 {

    /* JADX INFO: renamed from: b */
    public static upp0 f180308b;

    /* JADX INFO: renamed from: a */
    public boolean f180309a = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m197168c(C22507a c22507a, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            c22507a.m137019l(Boolean.FALSE);
        }
        return Boolean.valueOf(!mobileRespInfo.failed);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m197169d(Act act, C22507a c22507a, uxj0 uxj0Var) {
        fph0.m126678l();
        o1j0.m165651y(act.string(R$string.f19816xt));
        c22507a.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static upp0 m197170e() {
        if (f180308b == null) {
            synchronized (upp0.class) {
                try {
                    if (f180308b == null) {
                        f180308b = new upp0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f180308b;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public String m197171f(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.m81064b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: g */
    public boolean m197172g() {
        return this.f180309a;
    }

    /* JADX INFO: renamed from: h */
    public C22507a<Boolean> m197173h(final Act act) {
        final C22507a<Boolean> c22507aM222758b = C22507a.m222758b();
        act.duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).filter(new qcj() { // from class: l.qpp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return upp0.m197168c(c22507aM222758b, (MobileRespInfo) obj);
            }
        }).flatMap(new qcj() { // from class: l.rpp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return CoreModule.m30929H().oneClickBindPhone(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(psd0.m173597H(new y20() { // from class: l.spp0
            @Override // p153l.y20
            public final void call(Object obj) {
                upp0.m197169d(act, c22507aM222758b, (uxj0) obj);
            }
        }, new y20() { // from class: l.tpp0
            @Override // p153l.y20
            public final void call(Object obj) {
                c22507aM222758b.m137019l(Boolean.FALSE);
            }
        }));
        return c22507aM222758b;
    }
}
