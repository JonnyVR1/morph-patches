package p149l;

import com.apm.lite.CrashType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class miq0 {

    /* JADX INFO: renamed from: a */
    private Map<CrashType, List<k31>> f134028a = new HashMap();

    /* JADX INFO: renamed from: b */
    private Map<CrashType, List<k31>> f134029b = new HashMap();

    /* JADX INFO: renamed from: c */
    private Map<String, String> f134030c = new HashMap();

    /* JADX INFO: renamed from: a */
    public List<k31> m154747a(CrashType crashType) {
        return this.f134028a.get(crashType);
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m154748b() {
        return this.f134030c;
    }

    /* JADX INFO: renamed from: c */
    public List<k31> m154749c(CrashType crashType) {
        return this.f134029b.get(crashType);
    }

    /* JADX INFO: renamed from: d */
    public hpl m154750d() {
        return null;
    }
}
