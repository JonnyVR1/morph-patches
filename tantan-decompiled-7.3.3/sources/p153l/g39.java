package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;

/* JADX INFO: loaded from: classes12.dex */
public class g39 {
    /* JADX INFO: renamed from: a */
    public static void m128715a(TantanException.Client.CoreService coreService) {
        int i = coreService.code;
        if (i == 40042 || i == 40044 || i == 40045) {
            o1j0.m165651y("对方账号异常");
            return;
        }
        if (i != 4000701) {
            bsj0.m106246D(coreService);
        } else if (CoreModule.f18276o.m132214d().mo34703I5()) {
            o1j0.m165651y("由于对方隐私设置，暂时无法告白");
        } else {
            o1j0.m165649w(R$string.f21477D2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m128716b(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        if (i == 40301) {
            o1j0.m165634h(R$string.f21799p5);
            return;
        }
        if (i == 40308) {
            o1j0.m165651y("对方被你拉黑，不能继续互动");
        } else if (i == 40309) {
            o1j0.m165651y("对方设置了隐私权限，不能继续互动");
        } else {
            bsj0.m106246D(tantanForbidden);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m128717c(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            m128715a((TantanException.Client.CoreService) th);
        } else if (th instanceof TantanException.Client.TantanForbidden) {
            m128716b((TantanException.Client.TantanForbidden) th);
        } else {
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m128718d(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40399;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m128719e(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40337;
    }
}
