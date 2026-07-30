package p149l;

import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class vi4 {

    /* JADX INFO: renamed from: a */
    public static HashMap<CacheCardType, col> f181551a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static col m198495a() {
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        synchronized (vi4.class) {
            try {
                if (upa.m194675N3()) {
                    cacheCardType = CacheCardType.EXPANDED_CARD;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m198496b(cacheCardType);
    }

    /* JADX INFO: renamed from: b */
    public static col m198496b(CacheCardType cacheCardType) {
        col llfVar;
        if (f181551a.get(cacheCardType) == null) {
            synchronized (vi4.class) {
                try {
                    if (f181551a.get(cacheCardType) == null) {
                        if (cacheCardType == CacheCardType.EXPANDED_CARD) {
                            llfVar = new ilf(cacheCardType);
                        } else {
                            llfVar = cacheCardType == CacheCardType.TRANS_EXPANDED_CARD ? new llf(cacheCardType) : new bmd(cacheCardType);
                        }
                        f181551a.put(cacheCardType, llfVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f181551a.get(cacheCardType);
    }

    /* JADX INFO: renamed from: c */
    public static void m198497c(CacheCardType cacheCardType) {
        f181551a.remove(cacheCardType);
    }

    /* JADX INFO: renamed from: d */
    public static void m198498d() {
        if (NullChecker.m81303a(f181551a) && !f181551a.isEmpty()) {
            Iterator<col> it = f181551a.values().iterator();
            while (it.hasNext()) {
                it.next().mo102632f();
            }
        }
        f181551a.clear();
    }
}
