package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class u280 {
    /* JADX INFO: renamed from: a */
    public static void m191442a(Throwable th) {
        int i;
        Throwable cause = th.getCause();
        String string = th.toString();
        if (cause != null) {
            string = cause.toString();
        }
        ht70.m132853j("error message = " + th.getMessage() + " cause = " + string);
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            i = coreService.code;
            switch (i) {
                case TantanException.Client.TantanForbidden.FOLLOW_SETTING_FORBIDDEN /* 41030 */:
                case 41031:
                    lsi0.m151593w(eat.f90257o);
                    break;
                case 41032:
                    lsi0.m151593w(R$string.f47183d3);
                    break;
                case 41034:
                    lsi0.m151593w(R$string.f46593Be);
                    break;
                case 41035:
                    lsi0.m151595y(ypv.m215672k().m195751V3());
                    break;
                case 41039:
                    lsi0.m151593w(eat.f90256n);
                    break;
                case 41040:
                    lsi0.m151593w(R$string.f47094Z1);
                    break;
                case 41041:
                    lsi0.m151593w(R$string.f47321ja);
                    break;
                case 41053:
                case 41057:
                case 41114:
                case 41115:
                case 41116:
                case 41117:
                    String str = coreService.metaMessage;
                    if (str != null) {
                        lsi0.m151595y(str);
                    }
                    break;
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            lsi0.m151578h(R$string.f46698G9);
        }
    }
}
