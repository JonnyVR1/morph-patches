package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import immomo.com.mklibrary.fep.FepStrategyInfo;
import immomo.com.mklibrary.fep.FepVersion;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.k4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC17922k4 {

    /* JADX INFO: renamed from: j */
    public static final Pattern f120912j = Pattern.compile("^[1-9]+[0-9]*.x$");

    /* JADX INFO: renamed from: a */
    private final String f120913a;

    /* JADX INFO: renamed from: b */
    public final String f120914b;

    /* JADX INFO: renamed from: c */
    private String f120915c;

    /* JADX INFO: renamed from: d */
    private long f120916d;

    /* JADX INFO: renamed from: e */
    protected ConcurrentHashMap<String, FepVersion> f120917e;

    /* JADX INFO: renamed from: f */
    private long f120918f;

    /* JADX INFO: renamed from: g */
    protected String f120919g;

    /* JADX INFO: renamed from: h */
    public final int f120920h;

    /* JADX INFO: renamed from: i */
    public final int f120921i;

    public AbstractC17922k4(@NonNull String str, long j, FepStrategyInfo fepStrategyInfo) {
        this.f120913a = "default";
        this.f120914b = "v-";
        this.f120920h = 0;
        this.f120921i = 1;
        this.f120915c = str;
        this.f120916d = j;
        if (fepStrategyInfo != null) {
            this.f120917e = fepStrategyInfo.getVersionInfos();
        }
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("bid is  null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m144448l(String str) {
        return str != null && str.contains("/v-/");
    }

    /* JADX INFO: renamed from: o */
    private boolean m144449o(FepVersion fepVersion) {
        return fepVersion != null && fepVersion.isSupportType(0, 1);
    }

    /* JADX INFO: renamed from: a */
    public boolean m144450a(String str) {
        if (b0g0.m99769b(str)) {
            return false;
        }
        return this.f120916d > 0 || m144457i(str) != null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m144451b(String str, String str2) {
        FepVersion fepVersionM144457i;
        if (m144452c(str) && m144452c(str2) && (fepVersionM144457i = m144457i(str)) != null) {
            String tag = fepVersionM144457i.getTag();
            if (m144452c(tag)) {
                MDLog.m7395i("FepPublishManager", "delete fepStrategyInfo =" + tag);
                if (this.f120917e.remove(tag) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m144452c(String str) {
        return b0g0.m99771d(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m144453d() {
        return mei.m154200f();
    }

    /* JADX INFO: renamed from: e */
    public long m144454e() {
        return this.f120916d;
    }

    /* JADX INFO: renamed from: f */
    public long m144455f(String str) {
        String str2;
        FepVersion fepVersion;
        int i;
        if (m144452c(str) && m144459k()) {
            if (!m144448l(str)) {
                str2 = "default";
                break;
            }
            List<String> pathSegments = Uri.parse(str).getPathSegments();
            int i2 = 0;
            while (true) {
                if (i2 >= pathSegments.size()) {
                    str2 = "default";
                    break;
                }
                if (b0g0.m99768a(pathSegments.get(i2), "v-") && (i = i2 + 1) <= pathSegments.size()) {
                    str2 = pathSegments.get(i);
                    break;
                }
                i2++;
            }
            if (m144452c(str2) && (fepVersion = this.f120917e.get(str2)) != null) {
                long version = fepVersion.getVersion();
                this.f120918f = version;
                return version;
            }
        }
        this.f120918f = m144454e();
        return this.f120916d;
    }

    /* JADX INFO: renamed from: g */
    public String mo97466g(String str) {
        return m144458j(str);
    }

    /* JADX INFO: renamed from: h */
    public String m144456h(String str) {
        return m144453d() ? mo97466g(str) : str;
    }

    /* JADX INFO: renamed from: i */
    public FepVersion m144457i(String str) {
        try {
            if (!m144452c(str) || !b0g0.m99771d(this.f120919g)) {
                return null;
            }
            if (!str.contains("/" + this.f120919g) || !m144459k()) {
                return null;
            }
            boolean zM144448l = m144448l(str);
            Iterator<Map.Entry<String, FepVersion>> it = this.f120917e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, FepVersion> next = it.next();
                String key = next.getKey();
                FepVersion value = next.getValue();
                if (m144452c(key)) {
                    if (m144449o(value)) {
                        if (zM144448l) {
                            if (str.contains("/" + key + "/")) {
                                return this.f120917e.get(key);
                            }
                        }
                        if (!zM144448l && b0g0.m99768a(key, "default")) {
                            return this.f120917e.get(key);
                        }
                    } else {
                        it.remove();
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            MDLog.printErrStackTrace("FepPublishManager", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public String m144458j(String str) {
        return nhw.m159459b(str, this);
    }

    /* JADX INFO: renamed from: k */
    public boolean m144459k() {
        ConcurrentHashMap<String, FepVersion> concurrentHashMap = this.f120917e;
        return concurrentHashMap != null && concurrentHashMap.size() > 0;
    }

    /* JADX INFO: renamed from: m */
    public boolean m144460m(FepVersion fepVersion) {
        return fepVersion != null && fepVersion.getType() == 1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m144461n(FepVersion fepVersion) {
        return fepVersion != null && fepVersion.getType() == 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" -> cv:");
        long jM144454e = this.f120918f;
        if (jM144454e <= 0) {
            jM144454e = m144454e();
        }
        sb.append(jM144454e);
        return sb.toString();
    }

    public AbstractC17922k4(@NonNull String str, long j) {
        this(str, j, null);
    }
}
