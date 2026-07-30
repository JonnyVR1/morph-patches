package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class sz2 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m188614b(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m188615c(Act act, x20 x20Var) {
        m188616d(act, x20Var, false);
    }

    /* JADX INFO: renamed from: d */
    public static void m188616d(Act act, x20 x20Var, boolean z) {
        if (m188617e()) {
            m188618f(act, x20Var, z);
        } else if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m188617e() {
        User userM207651V = zrv.f205799a.m207651V();
        if (userM207651V == null || userM207651V.settings == null) {
            return true;
        }
        if ((TEnum.equals(userM207651V.source, "wechat") || TEnum.equals(userM207651V.source, "qq") || TEnum.equals(userM207651V.source, UserSource.network_security)) && TextUtils.isEmpty(userM207651V.settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userM207651V.settings.phoneNumber.number)) {
            return true;
        }
        return (TEnum.equals(userM207651V.source, "facebook") || TEnum.equals(userM207651V.source, "google")) && TextUtils.isEmpty(userM207651V.settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userM207651V.settings.phoneNumber.number);
    }

    /* JADX INFO: renamed from: f */
    public static void m188618f(final Act act, final x20 x20Var, boolean z) {
        Runnable runnable = new Runnable() { // from class: l.qz2
            @Override // java.lang.Runnable
            public final void run() {
                zrv.f205799a.m207683n0(act, new x20() { // from class: l.rz2
                    @Override // p153l.x20
                    public final void call() {
                        sz2.m188614b(x20Var);
                    }
                });
            }
        };
        if (z) {
            runnable.run();
        } else {
            act.dialog().m21555t0(R$string.f47559H0, runnable).m21499D(R$string.f47869Vc).m21540k0(R$string.f47961a).m21495B(false).m21567z0();
        }
    }
}
