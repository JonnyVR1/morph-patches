package p153l;

import com.apm.lite.CrashType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class rrq0 {

    /* JADX INFO: renamed from: a */
    private Map<CrashType, List<r31>> f164598a = new HashMap();

    /* JADX INFO: renamed from: b */
    private Map<CrashType, List<r31>> f164599b = new HashMap();

    /* JADX INFO: renamed from: c */
    private Map<String, String> f164600c = new HashMap();

    /* JADX INFO: renamed from: a */
    public List<r31> m182824a(CrashType crashType) {
        return this.f164598a.get(crashType);
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m182825b() {
        return this.f164600c;
    }

    /* JADX INFO: renamed from: c */
    public List<r31> m182826c(CrashType crashType) {
        return this.f164599b.get(crashType);
    }

    /* JADX INFO: renamed from: d */
    public trl m182827d() {
        return null;
    }
}
