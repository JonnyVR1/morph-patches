package p149l;

import android.util.Pair;
import com.meituan.robust.Constants;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class sqq0 {

    /* JADX INFO: renamed from: a */
    private static Vector<Pair<String, Long>> f166016a = new Vector<>();

    /* JADX INFO: renamed from: b */
    private static ConcurrentHashMap<String, Long> f166017b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static String m185610a() {
        StringBuilder sb = new StringBuilder();
        synchronized (f166016a) {
            for (int i = 0; i < f166016a.size(); i++) {
                try {
                    Pair<String, Long> pairElementAt = f166016a.elementAt(i);
                    sb.append((String) pairElementAt.first);
                    sb.append(":");
                    sb.append(pairElementAt.second);
                    if (i < f166016a.size() - 1) {
                        sb.append(Constants.PACKNAME_END);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            f166016a.clear();
        }
        return sb.toString();
    }
}
