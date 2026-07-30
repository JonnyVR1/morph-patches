package p153l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ypx0 extends mpx0 {

    /* JADX INFO: renamed from: b */
    public static final dqx0 f201141b = vpx0.m202347a(Collections.EMPTY_MAP);

    public /* synthetic */ ypx0(Map map, wpx0 wpx0Var) {
        super(map);
    }

    /* JADX INFO: renamed from: b */
    public static xpx0 m217066b(int i) {
        return new xpx0(i, null);
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapM182553b = rpx0.m182553b(m159444a().size());
        for (Map.Entry entry : m159444a().entrySet()) {
            linkedHashMapM182553b.put(entry.getKey(), ((dqx0) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapM182553b);
    }
}
