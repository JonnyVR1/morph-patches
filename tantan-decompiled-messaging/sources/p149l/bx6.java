package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;

/* JADX INFO: loaded from: classes9.dex */
public class bx6 {
    /* JADX INFO: renamed from: a */
    public static Throwable m104282a(Throwable th) {
        if (!m104284c(th)) {
            yij0.m214927E(th);
        }
        return th;
    }

    /* JADX INFO: renamed from: b */
    public static void m104283b(Throwable th) {
        if (m104284c(th)) {
            return;
        }
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m104284c(Throwable th) {
        if (th instanceof TantanException.ServerException) {
            return false;
        }
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z && m104287f((TantanException.Client.TantanForbidden) th)) {
            if (Act.foreground_() == null || !(Act.foreground_().f15343a.get() instanceof MessagesAct)) {
                lsi0.m151578h(R$string.f17705Ei);
            }
            return true;
        }
        if (z && m104285d((TantanException.Client.TantanForbidden) th)) {
            lsi0.m151578h(com.p046p1.mobile.putong.common.R$string.f17386V0);
            return true;
        }
        if (z && m104288g((TantanException.Client.TantanForbidden) th)) {
            lsi0.m151578h(R$string.f17675Di);
            return true;
        }
        if (z && m104293l((TantanException.Client.TantanForbidden) th)) {
            lsi0.m151593w(R$string.f18071Qo);
            return true;
        }
        if (!z) {
            if (th instanceof TantanException.Client.CoreService) {
                TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                int i = coreService.code;
                if (i == 40099) {
                    lsi0.m151578h(R$string.f17607Ba);
                    return true;
                }
                if (i == 40041) {
                    if (ura.m195053e().m195057d().mo33676E()) {
                        CoreModule.f17545c.f19645g0.m31846T8(TantanException.Client.CoreService.USER_ISJAILED);
                        return false;
                    }
                } else if (coreService.subCode == 43901) {
                    CoreModule.f17545c.f19576J0.m139269V3();
                }
            }
            return false;
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        if (tantanForbidden.isIdCardAuthing()) {
            lsi0.m151595y("认证信息审核中，审核结果将通过探探小助手发送给您，请耐心等待。");
        }
        int i2 = tantanForbidden.code;
        if (i2 == 40330 || i2 == 40331 || i2 == 40332 || i2 == 40333 || i2 == 40399) {
            if (!tantanForbidden.hasHandle) {
                CoreModule.f17545c.f19645g0.m31846T8(i2);
            }
            if (i2 == 40399) {
                String str = tantanForbidden.message;
                if (!tantanForbidden.hasHandle && !TextUtils.isEmpty(str)) {
                    lsi0.m151595y(str);
                }
            } else if (i2 == 40331) {
                if (!tantanForbidden.hasHandle) {
                    lsi0.m151593w(R$string.f18960u1);
                }
            } else if (i2 == 40330 && !tantanForbidden.hasHandle) {
                lsi0.m151593w(R$string.f17568A1);
            }
            tantanForbidden.hasHandle = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m104285d(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40301;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m104286e(TantanException.Client.TantanForbidden tantanForbidden) {
        return m104287f(tantanForbidden) || m104288g(tantanForbidden);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m104287f(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40334;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m104288g(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        return i == 40335 || i == 40336;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m104289h(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        return i == 40329 || i == 40330 || i == 40331 || i == 40332 || i == 40399 || i == 40333;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m104290i(int i) {
        return 40041 == i;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m104291j(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40313;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m104292k(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40326;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m104293l(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40328;
    }
}
