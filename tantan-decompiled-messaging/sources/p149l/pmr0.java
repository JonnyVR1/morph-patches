package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class pmr0 {

    /* JADX INFO: renamed from: a */
    public final int f150284a;

    /* JADX INFO: renamed from: b */
    public final byte[] f150285b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Map f150286c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final List f150287d;

    /* JADX INFO: renamed from: e */
    public final boolean f150288e;

    /* JADX WARN: Illegal instructions before constructor call */
    public pmr0(int i, byte[] bArr, boolean z, long j, @Nullable List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mmr0 mmr0Var = (mmr0) it.next();
                treeMap.put(mmr0Var.m155486a(), mmr0Var.m155487b());
            }
        }
        this(i, bArr, treeMap, list, z, j);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static List m170375a(@Nullable Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new mmr0((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public pmr0(int i, byte[] bArr, @Nullable Map map, boolean z, long j) {
        this(i, bArr, map, m170375a(map), z, j);
    }

    public pmr0(int i, byte[] bArr, @Nullable Map map, @Nullable List list, boolean z, long j) {
        this.f150284a = i;
        this.f150285b = bArr;
        this.f150286c = map;
        this.f150287d = list == null ? null : Collections.unmodifiableList(list);
        this.f150288e = z;
    }

    @Deprecated
    public pmr0(byte[] bArr, @Nullable Map map) {
        this(200, bArr, map, m170375a(map), false, 0L);
    }
}
