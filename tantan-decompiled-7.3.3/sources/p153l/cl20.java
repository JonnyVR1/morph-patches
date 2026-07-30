package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class cl20 {

    /* JADX INFO: renamed from: a */
    public final int f82338a;

    /* JADX INFO: renamed from: b */
    public final byte[] f82339b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Map<String, String> f82340c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final List<yzk> f82341d;

    /* JADX INFO: renamed from: e */
    public final boolean f82342e;

    /* JADX INFO: renamed from: f */
    public final long f82343f;

    private cl20(int i, byte[] bArr, @Nullable Map<String, String> map, @Nullable List<yzk> list, boolean z, long j) {
        this.f82338a = i;
        this.f82339b = bArr;
        this.f82340c = map;
        if (list == null) {
            this.f82341d = null;
        } else {
            this.f82341d = Collections.unmodifiableList(list);
        }
        this.f82342e = z;
        this.f82343f = j;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    private static List<yzk> m110411a(@Nullable Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new yzk(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private static Map<String, String> m110412b(@Nullable List<yzk> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (yzk yzkVar : list) {
            treeMap.put(yzkVar.m218023a(), yzkVar.m218024b());
        }
        return treeMap;
    }

    public cl20(int i, byte[] bArr, boolean z, long j, @Nullable List<yzk> list) {
        this(i, bArr, m110412b(list), list, z, j);
    }

    @Deprecated
    public cl20(byte[] bArr, @Nullable Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    @Deprecated
    public cl20(int i, byte[] bArr, @Nullable Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m110411a(map), z, j);
    }
}
