package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class vvr0 {

    /* JADX INFO: renamed from: a */
    public final int f185979a;

    /* JADX INFO: renamed from: b */
    public final byte[] f185980b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Map f185981c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final List f185982d;

    /* JADX INFO: renamed from: e */
    public final boolean f185983e;

    /* JADX WARN: Illegal instructions before constructor call */
    public vvr0(int i, byte[] bArr, boolean z, long j, @Nullable List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                svr0 svr0Var = (svr0) it.next();
                treeMap.put(svr0Var.m188224a(), svr0Var.m188225b());
            }
        }
        this(i, bArr, treeMap, list, z, j);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static List m203036a(@Nullable Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new svr0((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public vvr0(int i, byte[] bArr, @Nullable Map map, boolean z, long j) {
        this(i, bArr, map, m203036a(map), z, j);
    }

    public vvr0(int i, byte[] bArr, @Nullable Map map, @Nullable List list, boolean z, long j) {
        this.f185979a = i;
        this.f185980b = bArr;
        this.f185981c = map;
        this.f185982d = list == null ? null : Collections.unmodifiableList(list);
        this.f185983e = z;
    }

    @Deprecated
    public vvr0(byte[] bArr, @Nullable Map map) {
        this(200, bArr, map, m203036a(map), false, 0L);
    }
}
