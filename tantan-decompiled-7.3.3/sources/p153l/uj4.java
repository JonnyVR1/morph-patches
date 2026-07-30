package p153l;

import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class uj4 {

    /* JADX INFO: renamed from: a */
    public static HashMap<CacheCardType, nql> f179178a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static nql m196316a() {
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        synchronized (uj4.class) {
            try {
                if (gra.m131606N3()) {
                    cacheCardType = CacheCardType.EXPANDED_CARD;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m196317b(cacheCardType);
    }

    /* JADX INFO: renamed from: b */
    public static nql m196317b(CacheCardType cacheCardType) {
        nql rmfVar;
        if (f179178a.get(cacheCardType) == null) {
            synchronized (uj4.class) {
                try {
                    if (f179178a.get(cacheCardType) == null) {
                        if (cacheCardType == CacheCardType.EXPANDED_CARD) {
                            rmfVar = new omf(cacheCardType);
                        } else {
                            rmfVar = cacheCardType == CacheCardType.TRANS_EXPANDED_CARD ? new rmf(cacheCardType) : new hnd(cacheCardType);
                        }
                        f179178a.put(cacheCardType, rmfVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f179178a.get(cacheCardType);
    }

    /* JADX INFO: renamed from: c */
    public static void m196318c(CacheCardType cacheCardType) {
        f179178a.remove(cacheCardType);
    }

    /* JADX INFO: renamed from: d */
    public static void m196319d() {
        if (NullChecker.m82486a(f179178a) && !f179178a.isEmpty()) {
            Iterator<nql> it = f179178a.values().iterator();
            while (it.hasNext()) {
                it.next().mo136052f();
            }
        }
        f179178a.clear();
    }
}
