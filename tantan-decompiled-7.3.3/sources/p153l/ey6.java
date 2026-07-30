package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;

/* JADX INFO: loaded from: classes9.dex */
public class ey6 {
    /* JADX INFO: renamed from: a */
    public static Throwable m123173a(Throwable th) {
        if (!m123175c(th)) {
            bsj0.m106247E(th);
        }
        return th;
    }

    /* JADX INFO: renamed from: b */
    public static void m123174b(Throwable th) {
        if (m123175c(th)) {
            return;
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m123175c(Throwable th) {
        if (th instanceof TantanException.ServerException) {
            return false;
        }
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z && m123178f((TantanException.Client.TantanForbidden) th)) {
            if (Act.foreground_() == null || !(Act.foreground_().f16062a.get() instanceof MessagesAct)) {
                o1j0.m165634h(R$string.f19096aj);
            }
            return true;
        }
        if (z && m123176d((TantanException.Client.TantanForbidden) th)) {
            o1j0.m165634h(com.p051p1.mobile.putong.common.R$string.f18105V0);
            return true;
        }
        if (z && m123179g((TantanException.Client.TantanForbidden) th)) {
            o1j0.m165634h(R$string.f19065Zi);
            return true;
        }
        if (z && m123184l((TantanException.Client.TantanForbidden) th)) {
            o1j0.m165649w(R$string.f19471mp);
            return true;
        }
        if (!z) {
            if (th instanceof TantanException.Client.CoreService) {
                TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                int i = coreService.code;
                if (i == 40099) {
                    o1j0.m165634h(R$string.f18667Ma);
                    return true;
                }
                if (i == 40041) {
                    if (gta.m132210e().m132214d().mo34679E()) {
                        CoreModule.f18264c.f20387g0.m32849T8(TantanException.Client.CoreService.USER_ISJAILED);
                        return false;
                    }
                } else if (coreService.subCode == 43901) {
                    CoreModule.f18264c.f20318J0.m156781V3();
                }
            }
            return false;
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        if (tantanForbidden.isIdCardAuthing()) {
            o1j0.m165651y("认证信息审核中，审核结果将通过探探小助手发送给您，请耐心等待。");
        }
        int i2 = tantanForbidden.code;
        if (i2 == 40330 || i2 == 40331 || i2 == 40332 || i2 == 40333 || i2 == 40399) {
            if (!tantanForbidden.hasHandle) {
                CoreModule.f18264c.f20387g0.m32849T8(i2);
            }
            if (i2 == 40399) {
                String str = tantanForbidden.message;
                if (!tantanForbidden.hasHandle && !TextUtils.isEmpty(str)) {
                    o1j0.m165651y(str);
                }
            } else if (i2 == 40331) {
                if (!tantanForbidden.hasHandle) {
                    o1j0.m165649w(R$string.f19695u1);
                }
            } else if (i2 == 40330 && !tantanForbidden.hasHandle) {
                o1j0.m165649w(R$string.f18287A1);
            }
            tantanForbidden.hasHandle = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m123176d(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40301;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m123177e(TantanException.Client.TantanForbidden tantanForbidden) {
        return m123178f(tantanForbidden) || m123179g(tantanForbidden);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m123178f(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40334;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m123179g(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        return i == 40335 || i == 40336;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m123180h(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        return i == 40329 || i == 40330 || i == 40331 || i == 40332 || i == 40399 || i == 40333;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m123181i(int i) {
        return 40041 == i;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m123182j(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40313;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m123183k(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40326;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m123184l(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40328;
    }
}
