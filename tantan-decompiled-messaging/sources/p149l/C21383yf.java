package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.common.R$string;

/* JADX INFO: renamed from: l.yf */
/* JADX INFO: loaded from: classes9.dex */
public class C21383yf {
    /* JADX INFO: renamed from: a */
    public static Throwable m214460a(Throwable th) {
        return yij0.m214927E(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m214461b(Throwable th) {
        if (m214462c(th)) {
            return;
        }
        yij0.m214926D(th);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX INFO: renamed from: c */
    public static boolean m214462c(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (!(th instanceof TantanException.Client.AccountService) || ((TantanException.Client.AccountService) th).code != 40095) {
                return false;
            }
            lsi0.m151578h(R$string.f17424d3);
            return true;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (i != 40300 && i != 403000) {
            switch (i) {
                case 40013:
                    break;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    lsi0.m151578h(R$string.f17353N);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    lsi0.m151578h(R$string.f17341K);
                    return true;
                default:
                    switch (i) {
                        case 400010:
                        case 400012:
                            break;
                        case 400011:
                        case 400014:
                            lsi0.m151578h(R$string.f17353N);
                            return true;
                        case 400013:
                        case 400015:
                            lsi0.m151578h(R$string.f17341K);
                            return true;
                        default:
                            switch (i) {
                                case 429000:
                                case 429001:
                                case 429002:
                                case 429003:
                                case 429004:
                                    break;
                                default:
                                    return false;
                            }
                            break;
                    }
                    break;
            }
        }
        lsi0.m151578h(R$string.f17345L);
        return true;
    }
}
