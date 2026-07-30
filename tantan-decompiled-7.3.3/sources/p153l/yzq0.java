package p153l;

import android.util.Pair;
import com.meituan.robust.Constants;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class yzq0 {

    /* JADX INFO: renamed from: a */
    private static Vector<Pair<String, Long>> f202216a = new Vector<>();

    /* JADX INFO: renamed from: b */
    private static ConcurrentHashMap<String, Long> f202217b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static String m218026a() {
        StringBuilder sb = new StringBuilder();
        synchronized (f202216a) {
            for (int i = 0; i < f202216a.size(); i++) {
                try {
                    Pair<String, Long> pairElementAt = f202216a.elementAt(i);
                    sb.append((String) pairElementAt.first);
                    sb.append(":");
                    sb.append(pairElementAt.second);
                    if (i < f202216a.size() - 1) {
                        sb.append(Constants.PACKNAME_END);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            f202216a.clear();
        }
        return sb.toString();
    }
}
