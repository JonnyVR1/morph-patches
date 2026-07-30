package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class sc20 {

    /* JADX INFO: renamed from: a */
    public final int f163698a;

    /* JADX INFO: renamed from: b */
    public final byte[] f163699b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Map<String, String> f163700c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final List<ixk> f163701d;

    /* JADX INFO: renamed from: e */
    public final boolean f163702e;

    /* JADX INFO: renamed from: f */
    public final long f163703f;

    private sc20(int i, byte[] bArr, @Nullable Map<String, String> map, @Nullable List<ixk> list, boolean z, long j) {
        this.f163698a = i;
        this.f163699b = bArr;
        this.f163700c = map;
        if (list == null) {
            this.f163701d = null;
        } else {
            this.f163701d = Collections.unmodifiableList(list);
        }
        this.f163702e = z;
        this.f163703f = j;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    private static List<ixk> m183371a(@Nullable Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new ixk(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private static Map<String, String> m183372b(@Nullable List<ixk> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (ixk ixkVar : list) {
            treeMap.put(ixkVar.m138849a(), ixkVar.m138850b());
        }
        return treeMap;
    }

    public sc20(int i, byte[] bArr, boolean z, long j, @Nullable List<ixk> list) {
        this(i, bArr, m183372b(list), list, z, j);
    }

    @Deprecated
    public sc20(byte[] bArr, @Nullable Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    @Deprecated
    public sc20(int i, byte[] bArr, @Nullable Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m183371a(map), z, j);
    }
}
