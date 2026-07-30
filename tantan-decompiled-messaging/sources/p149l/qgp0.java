package p149l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.MobileRespInfo;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public class qgp0 {

    /* JADX INFO: renamed from: b */
    public static qgp0 f154366b;

    /* JADX INFO: renamed from: a */
    public boolean f154367a = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m174448c(C22392a c22392a, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            c22392a.m132487l(Boolean.FALSE);
        }
        return Boolean.valueOf(!mobileRespInfo.failed);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m174449d(Act act, C22392a c22392a, roj0 roj0Var) {
        ygh0.m214690l();
        lsi0.m151595y(act.string(R$string.f18376at));
        c22392a.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static qgp0 m174450e() {
        if (f154366b == null) {
            synchronized (qgp0.class) {
                try {
                    if (f154366b == null) {
                        f154366b = new qgp0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f154366b;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public String m174451f(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.m79881b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: g */
    public boolean m174452g() {
        return this.f154367a;
    }

    /* JADX INFO: renamed from: h */
    public C22392a<Boolean> m174453h(final Act act) {
        final C22392a<Boolean> c22392aM221512b = C22392a.m221512b();
        act.duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).filter(new w9j() { // from class: l.mgp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qgp0.m174448c(c22392aM221512b, (MobileRespInfo) obj);
            }
        }).flatMap(new w9j() { // from class: l.ngp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return CoreModule.m29931H().oneClickBindPhone(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(mkd0.m154956H(new e30() { // from class: l.ogp0
            @Override // p149l.e30
            public final void call(Object obj) {
                qgp0.m174449d(act, c22392aM221512b, (roj0) obj);
            }
        }, new e30() { // from class: l.pgp0
            @Override // p149l.e30
            public final void call(Object obj) {
                c22392aM221512b.m132487l(Boolean.FALSE);
            }
        }));
        return c22392aM221512b;
    }
}
