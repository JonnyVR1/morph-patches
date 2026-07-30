package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.common.R$string;

/* JADX INFO: renamed from: l.tf */
/* JADX INFO: loaded from: classes9.dex */
public class C20299tf {
    /* JADX INFO: renamed from: a */
    public static Throwable m190905a(Throwable th) {
        return bsj0.m106247E(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m190906b(Throwable th) {
        if (m190907c(th)) {
            return;
        }
        bsj0.m106246D(th);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX INFO: renamed from: c */
    public static boolean m190907c(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (!(th instanceof TantanException.Client.AccountService) || ((TantanException.Client.AccountService) th).code != 40095) {
                return false;
            }
            o1j0.m165634h(R$string.f18143d3);
            return true;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (i != 40300 && i != 403000) {
            switch (i) {
                case 40013:
                    break;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    o1j0.m165634h(R$string.f18072N);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    o1j0.m165634h(R$string.f18060K);
                    return true;
                default:
                    switch (i) {
                        case 400010:
                        case 400012:
                            break;
                        case 400011:
                        case 400014:
                            o1j0.m165634h(R$string.f18072N);
                            return true;
                        case 400013:
                        case 400015:
                            o1j0.m165634h(R$string.f18060K);
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
        o1j0.m165634h(R$string.f18064L);
        return true;
    }
}
