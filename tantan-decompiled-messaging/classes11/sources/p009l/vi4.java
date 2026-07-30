package p009l;

import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vi4 {

    /* JADX INFO: renamed from: a */
    public static HashMap<CacheCardType, col> f21591a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static col m23378a() {
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        synchronized (vi4.class) {
            try {
                if (upa.N3()) {
                    cacheCardType = CacheCardType.EXPANDED_CARD;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m23379b(cacheCardType);
    }

    /* JADX INFO: renamed from: b */
    public static col m23379b(CacheCardType cacheCardType) {
        col llfVar;
        if (f21591a.get(cacheCardType) == null) {
            synchronized (vi4.class) {
                try {
                    if (f21591a.get(cacheCardType) == null) {
                        if (cacheCardType == CacheCardType.EXPANDED_CARD) {
                            llfVar = new ilf(cacheCardType);
                        } else {
                            llfVar = cacheCardType == CacheCardType.TRANS_EXPANDED_CARD ? new llf(cacheCardType) : new bmd(cacheCardType);
                        }
                        f21591a.put(cacheCardType, llfVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21591a.get(cacheCardType);
    }

    /* JADX INFO: renamed from: c */
    public static void m23380c(CacheCardType cacheCardType) {
        f21591a.remove(cacheCardType);
    }

    /* JADX INFO: renamed from: d */
    public static void m23381d() {
        if (NullChecker.a(f21591a) && !f21591a.isEmpty()) {
            Iterator<col> it = f21591a.values().iterator();
            while (it.hasNext()) {
                it.next().mo12118f();
            }
        }
        f21591a.clear();
    }
}
