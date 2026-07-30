package p153l;

import com.sina.weibo.sdk.constant.WBConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/mgi;", "", "<init>", "()V", "", "bid", "", "rawRule", "Ll/lgi;", "b", "(Ljava/lang/String;Ljava/util/Map;)Ll/lgi;", "c", "(Ljava/lang/String;)Ll/lgi;", "", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "cacheBox", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class mgi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, lgi> cacheBox = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private final lgi m158332b(String bid, Map<String, ? extends Object> rawRule) {
        Map<String, Object> mapM151326n;
        Object obj;
        Long lM151325m;
        Integer numM151323k;
        try {
            Object obj2 = rawRule.get("project");
            String strM151327o = obj2 != null ? kt0.m151327o(obj2) : null;
            Object obj3 = rawRule.get("versions");
            Map<String, Object> mapM151326n2 = obj3 != null ? kt0.m151326n(obj3) : null;
            if (strM151327o != null && mapM151326n2 != null && !mapM151326n2.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : mapM151326n2.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null && (mapM151326n = kt0.m151326n(value)) != null && (obj = mapM151326n.get(WBConstants.AUTH_PARAMS_VERSION)) != null && (lM151325m = kt0.m151325m(obj)) != null) {
                        long jLongValue = lM151325m.longValue();
                        Object obj4 = mapM151326n.get("type");
                        linkedHashMap.put(key, new lgi.C18390a(key, jLongValue, (obj4 == null || (numM151323k = kt0.m151323k(obj4)) == null) ? 0 : numM151323k.intValue()));
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return new lgi(bid, strM151327o, linkedHashMap);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m158333a() {
        synchronized (this.cacheBox) {
            this.cacheBox.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final lgi m158334c(@NotNull String bid) {
        lgi lgiVarM158332b;
        bid.getClass();
        lgi lgiVar = this.cacheBox.get(bid);
        if (lgiVar != null) {
            return lgiVar;
        }
        Map<String, Object> mapM130148c = ggi.INSTANCE.m130148c(bid);
        if (mapM130148c == null || (lgiVarM158332b = m158332b(bid, mapM130148c)) == null) {
            return null;
        }
        synchronized (this.cacheBox) {
            this.cacheBox.put(bid, lgiVarM158332b);
            Unit unit = Unit.INSTANCE;
        }
        return lgiVarM158332b;
    }
}
