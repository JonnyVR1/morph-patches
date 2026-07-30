package p153l;

import com.immomo.network.bean.CheckerStatus;
import com.immomo.network.bean.UrlType;

/* JADX INFO: loaded from: classes7.dex */
public class p4k0 {

    /* JADX INFO: renamed from: a */
    private final String f150542a;

    /* JADX INFO: renamed from: b */
    private final UrlType f150543b;

    /* JADX INFO: renamed from: c */
    private final CheckerStatus f150544c;

    public p4k0(String str, CheckerStatus checkerStatus) {
        this.f150542a = str;
        this.f150543b = m170570c(str);
        this.f150544c = checkerStatus;
    }

    /* JADX INFO: renamed from: c */
    private UrlType m170570c(String str) {
        if (rl20.m181911f(str)) {
            return UrlType.IPV6;
        }
        return rl20.m181909d(str) ? UrlType.IPV4 : UrlType.UNKNOWN;
    }

    /* JADX INFO: renamed from: a */
    public int m170571a() {
        CheckerStatus checkerStatus = this.f150544c;
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
    public UrlType m170572b() {
        return this.f150543b;
    }

    /* JADX INFO: renamed from: d */
    public String m170573d() {
        return this.f150542a;
    }
}
