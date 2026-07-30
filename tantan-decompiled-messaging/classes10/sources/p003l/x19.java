package p003l;

import com.p000p1.mobile.putong.core.message.R$string;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import l.lsi0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class x19 {
    /* JADX INFO: renamed from: a */
    public static void m10615a(TantanException.Client.CoreService coreService) {
        int i = coreService.code;
        if (i == 40042 || i == 40044 || i == 40045) {
            lsi0.y("对方账号异常");
            return;
        }
        if (i != 4000701) {
            yij0.D(coreService);
        } else if (CoreModule.o.d().I5()) {
            lsi0.y("由于对方隐私设置，暂时无法告白");
        } else {
            lsi0.w(R$string.f397D2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10616b(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        if (i == 40301) {
            lsi0.h(R$string.f719p5);
            return;
        }
        if (i == 40308) {
            lsi0.y("对方被你拉黑，不能继续互动");
        } else if (i == 40309) {
            lsi0.y("对方设置了隐私权限，不能继续互动");
        } else {
            yij0.D(tantanForbidden);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10617c(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            m10615a((TantanException.Client.CoreService) th);
        } else if (th instanceof TantanException.Client.TantanForbidden) {
            m10616b((TantanException.Client.TantanForbidden) th);
        } else {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10618d(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40399;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10619e(TantanException.Client.TantanForbidden tantanForbidden) {
        return tantanForbidden.code == 40337;
    }
}
