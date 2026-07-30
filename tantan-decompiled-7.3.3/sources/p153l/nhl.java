package p153l;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class nhl {

    /* JADX INFO: renamed from: a */
    private static final Map<String, hhl> f142001a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static synchronized hhl m163109a(String str) {
        hhl hhlVarM135073c;
        Map<String, hhl> map = f142001a;
        hhlVarM135073c = map.get(str);
        if (hhlVarM135073c == null) {
            String strM121903b = eq80.m121903b(str, "");
            if (!TextUtils.isEmpty(strM121903b) && (hhlVarM135073c = new hhl().m135073c(strM121903b)) != null) {
                if (hhlVarM135073c.m135071a()) {
                    map.put(hhlVarM135073c.f109900a, hhlVarM135073c);
                } else {
                    hhlVarM135073c = null;
                }
            }
        }
        return hhlVarM135073c;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m163110b(hhl hhlVar) {
        List<String> list;
        if (hhlVar == null || (list = hhlVar.f109901b) == null || list.size() <= 0) {
            return false;
        }
        return u0q.m193870a(list.get(0));
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m163111c(hhl hhlVar) {
        try {
            f142001a.put(hhlVar.f109900a, hhlVar);
            if (m163110b(hhlVar)) {
                hhlVar.f109903d = 30;
                hhlVar.f109901b = Collections.singletonList(hhlVar.f109900a);
            } else {
                eq80.m121905d(hhlVar.f109900a, hhlVar.m135072b());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m163112d(String str) {
        hhl hhlVarM163109a = m163109a(str);
        if (hhlVarM163109a != null) {
            hhlVarM163109a.f109904e = System.currentTimeMillis() / 1000;
            m163111c(hhlVarM163109a);
        }
    }
}
