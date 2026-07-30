package p149l;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class wel {

    /* JADX INFO: renamed from: a */
    private static final Map<String, rel> f185948a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static synchronized rel m202905a(String str) {
        rel relVarM179053c;
        Map<String, rel> map = f185948a;
        relVarM179053c = map.get(str);
        if (relVarM179053c == null) {
            String strM218774b = zh80.m218774b(str, "");
            if (!TextUtils.isEmpty(strM218774b) && (relVarM179053c = new rel().m179053c(strM218774b)) != null) {
                if (relVarM179053c.m179051a()) {
                    map.put(relVarM179053c.f159063a, relVarM179053c);
                } else {
                    relVarM179053c = null;
                }
            }
        }
        return relVarM179053c;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m202906b(rel relVar) {
        List<String> list;
        if (relVar == null || (list = relVar.f159064b) == null || list.size() <= 0) {
            return false;
        }
        return uyp.m196341a(list.get(0));
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m202907c(rel relVar) {
        try {
            f185948a.put(relVar.f159063a, relVar);
            if (m202906b(relVar)) {
                relVar.f159066d = 30;
                relVar.f159064b = Collections.singletonList(relVar.f159063a);
            } else {
                zh80.m218776d(relVar.f159063a, relVar.m179052b());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m202908d(String str) {
        rel relVarM202905a = m202905a(str);
        if (relVarM202905a != null) {
            relVarM202905a.f159067e = System.currentTimeMillis() / 1000;
            m202907c(relVarM202905a);
        }
    }
}
