package p149l;

import com.immomo.network.bean.CheckerStatus;
import com.immomo.network.bean.UrlType;

/* JADX INFO: loaded from: classes7.dex */
public class mvj0 {

    /* JADX INFO: renamed from: a */
    private final String f135908a;

    /* JADX INFO: renamed from: b */
    private final UrlType f135909b;

    /* JADX INFO: renamed from: c */
    private final CheckerStatus f135910c;

    public mvj0(String str, CheckerStatus checkerStatus) {
        this.f135908a = str;
        this.f135909b = m156526c(str);
        this.f135910c = checkerStatus;
    }

    /* JADX INFO: renamed from: c */
    private UrlType m156526c(String str) {
        if (hd20.m130571f(str)) {
            return UrlType.IPV6;
        }
        return hd20.m130569d(str) ? UrlType.IPV4 : UrlType.UNKNOWN;
    }

    /* JADX INFO: renamed from: a */
    public int m156527a() {
        CheckerStatus checkerStatus = this.f135910c;
        if (checkerStatus == CheckerStatus.DISABLED) {
            return -1;
        }
        if (checkerStatus == CheckerStatus.PARAMS_ILLEGAL) {
            return -2;
        }
        if (checkerStatus == CheckerStatus.DNS_DISABLED) {
            return -101;
        }
        if (checkerStatus == CheckerStatus.EXCEPTION) {
            return -102;
        }
        return checkerStatus.ordinal();
    }

    /* JADX INFO: renamed from: b */
    public UrlType m156528b() {
        return this.f135909b;
    }

    /* JADX INFO: renamed from: d */
    public String m156529d() {
        return this.f135908a;
    }
}
