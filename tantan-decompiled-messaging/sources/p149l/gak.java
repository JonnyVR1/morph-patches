package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class gak {
    /* JADX INFO: renamed from: a */
    public static void m125000a(TantanException.Client.CoreService coreService) {
        int i = coreService.code;
        if (i == 40042 || i == 40044 || i == 40045) {
            lsi0.m151595y("对方账号异常");
            return;
        }
        if (i != 4000701) {
            yij0.m214926D(coreService);
        } else if (CoreModule.f17557o.m195057d().mo33700I5()) {
            lsi0.m151595y("由于对方隐私设置，暂时无法告白");
        } else {
            lsi0.m151593w(R$string.f20735D2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m125001b(TantanException.Client.TantanForbidden tantanForbidden) {
        int i = tantanForbidden.code;
        if (i == 40301) {
            lsi0.m151578h(com.p046p1.mobile.putong.core.R$string.f18735mj);
            return;
        }
        if (i == 40308) {
            lsi0.m151595y("对方被你拉黑，不能继续互动");
        } else if (i == 40309) {
            lsi0.m151595y("对方设置了隐私权限，不能继续互动");
        } else {
            yij0.m214926D(tantanForbidden);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m125002c(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            m125000a((TantanException.Client.CoreService) th);
        } else if (th instanceof TantanException.Client.TantanForbidden) {
            m125001b((TantanException.Client.TantanForbidden) th);
        } else {
            yij0.m214926D(th);
        }
    }
}
