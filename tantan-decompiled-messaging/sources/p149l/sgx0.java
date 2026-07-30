package p149l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class sgx0 extends ggx0 {

    /* JADX INFO: renamed from: b */
    public static final xgx0 f164501b = pgx0.m168925a(Collections.EMPTY_MAP);

    public /* synthetic */ sgx0(Map map, qgx0 qgx0Var) {
        super(map);
    }

    /* JADX INFO: renamed from: b */
    public static rgx0 m184138b(int i) {
        return new rgx0(i, null);
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapM149800b = lgx0.m149800b(m126095a().size());
        for (Map.Entry entry : m126095a().entrySet()) {
            linkedHashMapM149800b.put(entry.getKey(), ((xgx0) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapM149800b);
    }
}
