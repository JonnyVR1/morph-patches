package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import l.lsi0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bx6 {
    /* JADX INFO: renamed from: a */
    public static Throwable m13015a(Throwable th) {
        if (!m13017c(th)) {
            yij0.E(th);
        }
        return th;
    }

    /* JADX INFO: renamed from: b */
    public static void m13016b(Throwable th) {
        if (m13017c(th)) {
            return;
        }
        yij0.D(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m13017c(Throwable th) {
        if (th instanceof TantanException.ServerException) {
            return false;
        }
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z && m13020f((TantanException.Client.TantanForbidden) th)) {
            if (Act.foreground_() == null || !(Act.foreground_().a.get() instanceof MessagesAct)) {
                lsi0.h(R$string.f1694Ei);
            }
            return true;
        }
        if (z && m13018d((TantanException.Client.TantanForbidden) th)) {
            lsi0.h(com.p000p1.mobile.putong.common.R$string.f1375V0);
            return true;
        }
        if (z && m13021g((TantanException.Client.TantanForbidden) th)) {
            lsi0.h(R$string.f1664Di);
            return true;
        }
        if (z && m13026l((TantanException.Client.TantanForbidden) th)) {
            lsi0.w(R$string.f2060Qo);
            return true;
        }
        if (!z) {
            if (th instanceof TantanException.Client.CoreService) {
                TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                int i = coreService.code;
                if (i == 40099) {
                    lsi0.h(R$string.f1596Ba);
                    return true;
                }
                if (i == 40041) {
                    if (ura.m25555e().m25559d().m5613E()) {
                        CoreModule.f1534c.f3634g0.m3776T8(TantanException.Client.CoreService.USER_ISJAILED);
                        return false;
                    }
                } else if (coreService.subCode == 43901) {
                    CoreModule.f1534c.f3565J0.m17219V3();
                }
            }
            return false;
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        if (tantanForbidden.isIdCardAuthing()) {
            lsi0.y("认证信息审核中，审核结果将通过探探小助手发送给您，请耐心等待。");
        }
        int i2 = tantanForbidden.code;
        if (i2 == 40330 || i2 == 40331 || i2 == 40332 || i2 == 40333 || i2 == 40399) {
            if (!tantanForbidden.hasHandle) {
                CoreModule.f1534c.f3634g0.m3776T8(i2);
            }
            if (i2 == 40399) {
                String str = tantanForbidden.message;
                if (!tantanForbidden.hasHandle && !TextUtils.isEmpty(str)) {
                    lsi0.y(str);
                }
            } else if (i2 == 40331) {
                if (!tantanForbidden.hasHandle) {
                    lsi0.w(R$string.f2949u1);
                }
            } else if (i2 == 40330 && !tantanForbidden.hasHandle) {
                lsi0.w(R$string.f1557A1);
            }
            tantanForbidden.hasHandle = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13018d(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40301;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m13019e(TantanException.Client.TantanForbidden tantanForbidden) {
        return m13020f(tantanForbidden) || m13021g(tantanForbidden);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m13020f(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40334;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m13021g(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        return i == 40335 || i == 40336;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m13022h(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        return i == 40329 || i == 40330 || i == 40331 || i == 40332 || i == 40399 || i == 40333;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m13023i(int i) {
        return 40041 == i;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m13024j(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40313;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m13025k(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40326;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m13026l(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40328;
    }
}
