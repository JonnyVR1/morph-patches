package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class ab80 {
    /* JADX INFO: renamed from: a */
    public static void m96733a(Throwable th) {
        int i;
        Throwable cause = th.getCause();
        String string = th.toString();
        if (cause != null) {
            string = cause.toString();
        }
        n180.m161093j("error message = " + th.getMessage() + " cause = " + string);
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            i = coreService.code;
            switch (i) {
                case TantanException.Client.TantanForbidden.FOLLOW_SETTING_FORBIDDEN /* 41030 */:
                case 41031:
                    o1j0.m165649w(fct.f98275o);
                    break;
                case 41032:
                    o1j0.m165649w(R$string.f48031d3);
                    break;
                case 41034:
                    o1j0.m165649w(R$string.f47441Be);
                    break;
                case 41035:
                    o1j0.m165651y(zrv.m221193k().m203538V3());
                    break;
                case 41039:
                    o1j0.m165649w(fct.f98274n);
                    break;
                case 41040:
                    o1j0.m165649w(R$string.f47942Z1);
                    break;
                case 41041:
                    o1j0.m165649w(R$string.f48169ja);
                    break;
                case 41053:
                case 41057:
                case 41114:
                case 41115:
                case 41116:
                case 41117:
                    String str = coreService.metaMessage;
                    if (str != null) {
                        o1j0.m165651y(str);
                    }
                    break;
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            o1j0.m165634h(R$string.f47546G9);
        }
    }
}
