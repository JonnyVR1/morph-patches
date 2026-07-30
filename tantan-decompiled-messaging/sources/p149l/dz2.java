package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class dz2 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m114106b(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m114107c(Act act, d30 d30Var) {
        m114108d(act, d30Var, false);
    }

    /* JADX INFO: renamed from: d */
    public static void m114108d(Act act, d30 d30Var, boolean z) {
        if (m114109e()) {
            m114110f(act, d30Var, z);
        } else if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m114109e() {
        User userM199329V = ypv.f199493a.m199329V();
        if (userM199329V == null || userM199329V.settings == null) {
            return true;
        }
        if ((TEnum.equals(userM199329V.source, "wechat") || TEnum.equals(userM199329V.source, "qq") || TEnum.equals(userM199329V.source, UserSource.network_security)) && TextUtils.isEmpty(userM199329V.settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userM199329V.settings.phoneNumber.number)) {
            return true;
        }
        return (TEnum.equals(userM199329V.source, "facebook") || TEnum.equals(userM199329V.source, "google")) && TextUtils.isEmpty(userM199329V.settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userM199329V.settings.phoneNumber.number);
    }

    /* JADX INFO: renamed from: f */
    public static void m114110f(final Act act, final d30 d30Var, boolean z) {
        Runnable runnable = new Runnable() { // from class: l.bz2
            @Override // java.lang.Runnable
            public final void run() {
                ypv.f199493a.m199361n0(act, new d30() { // from class: l.cz2
                    @Override // p149l.d30
                    public final void call() {
                        dz2.m114106b(d30Var);
                    }
                });
            }
        };
        if (z) {
            runnable.run();
        } else {
            act.dialog().m20556t0(R$string.f46711H0, runnable).m20500D(R$string.f47021Vc).m20541k0(R$string.f47113a).m20496B(false).m20568z0();
        }
    }
}
