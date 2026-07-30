package p003l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.MobileRespInfo;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.w9j;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qgp0 {

    /* JADX INFO: renamed from: b */
    public static qgp0 f7018b;

    /* JADX INFO: renamed from: a */
    public boolean f7019a = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m8988c(a aVar, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            aVar.onNext(Boolean.FALSE);
        }
        return Boolean.valueOf(!mobileRespInfo.failed);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8989d(Act act, a aVar, roj0 roj0Var) {
        ygh0.m11225l();
        lsi0.y(act.string(R.string.at));
        aVar.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static qgp0 m8990e() {
        if (f7018b == null) {
            synchronized (qgp0.class) {
                try {
                    if (f7018b == null) {
                        f7018b = new qgp0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7018b;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public String m8991f(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: g */
    public boolean m8992g() {
        return this.f7019a;
    }

    /* JADX INFO: renamed from: h */
    public a<Boolean> m8993h(final Act act) {
        final a<Boolean> aVarB = a.b();
        act.duringCreated(ChinaMobileController.b().h(5000).filter(new w9j() { // from class: l.mgp0
            public final Object call(Object obj) {
                return qgp0.m8988c(aVarB, (MobileRespInfo) obj);
            }
        }).flatMap(new w9j() { // from class: l.ngp0
            public final Object call(Object obj) {
                MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
                return CoreModule.H().oneClickBindPhone(mobileRespInfo.token, mobileRespInfo.accessCode, mobileRespInfo.openId, mobileRespInfo.grantType);
            }
        }), false).subscribe(mkd0.H(new e30() { // from class: l.ogp0
            public final void call(Object obj) {
                qgp0.m8989d(act, aVarB, (roj0) obj);
            }
        }, new e30() { // from class: l.pgp0
            public final void call(Object obj) {
                aVarB.onNext(Boolean.FALSE);
            }
        }));
        return aVarB;
    }
}
