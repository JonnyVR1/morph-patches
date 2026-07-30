package p006l;

import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.common.R$string;
import l.lsi0;
import l.yij0;

/* JADX INFO: renamed from: l.yf */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1478yf {
    /* JADX INFO: renamed from: a */
    public static Throwable m28231a(Throwable th) {
        return yij0.E(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m28232b(Throwable th) {
        if (m28233c(th)) {
            return;
        }
        yij0.D(th);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m28233c(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            if (!(th instanceof TantanException.Client.AccountService) || ((TantanException.Client.AccountService) th).code != 40095) {
                return false;
            }
            lsi0.h(R$string.f1413d3);
            return true;
        }
        int i = ((TantanException.Client.CoreService) th).code;
        if (i != 40300 && i != 403000) {
            switch (i) {
                case 40013:
                    break;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    lsi0.h(R$string.f1342N);
                    return true;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    lsi0.h(R$string.f1330K);
                    return true;
                default:
                    switch (i) {
                        case 400010:
                        case 400012:
                            break;
                        case 400011:
                        case 400014:
                            lsi0.h(R$string.f1342N);
                            return true;
                        case 400013:
                        case 400015:
                            lsi0.h(R$string.f1330K);
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
        lsi0.h(R$string.f1334L);
        return true;
    }
}
