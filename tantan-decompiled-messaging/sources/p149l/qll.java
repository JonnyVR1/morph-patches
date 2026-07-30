package p149l;

import com.immomo.downloader.DownloadManager;
import com.immomo.mmutil.log.Log4Android;
import java.util.HashMap;
import java.util.Map;
import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: classes7.dex */
public class qll {

    /* JADX INFO: renamed from: a */
    public static int f155239a = 2;

    /* JADX INFO: renamed from: a */
    private static Map<String, String> m175488a(long j, long j2) {
        HashMap map = new HashMap();
        if (j >= 0) {
            if (j2 > 0) {
                map.put("RANGE", BytesRange.PREFIX + j + "-" + j2);
                return map;
            }
            map.put("RANGE", BytesRange.PREFIX + j + "-");
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static void m175489b(q8e q8eVar, int i) {
        DownloadManager.m18307q().f168692c.mo165037a(q8eVar, i);
    }

    /* JADX INFO: renamed from: c */
    public static jxc0 m175490c(String str, long j, long j2) {
        if (str == null) {
            jfd0.m141176a("parameter url is null!");
            return null;
        }
        jxc0 jxc0Var = null;
        for (int i = 0; i < f155239a && jxc0Var == null; i++) {
            try {
                jxc0Var = new jxc0(DownloadManager.m18307q().f168690a.mo165036a(str, m175488a(j, j2), false));
            } catch (Exception unused) {
                jxc0Var = null;
            }
        }
        return jxc0Var;
    }

    /* JADX INFO: renamed from: d */
    public static jxc0 m175491d(String str, long j, long j2, boolean z) {
        if (str == null) {
            jfd0.m141176a("parameter url is null!");
            return null;
        }
        jxc0 jxc0Var = null;
        for (int i = 0; i < f155239a && jxc0Var == null; i++) {
            try {
                jxc0Var = new jxc0(DownloadManager.m18307q().f168690a.mo165036a(str, m175488a(j, j2), z));
            } catch (Exception e) {
                Log4Android.m18417f().m18422e(e);
                jxc0Var = null;
            }
        }
        return jxc0Var;
    }
}
