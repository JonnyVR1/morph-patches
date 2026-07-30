package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes2.dex */
public final class euq0 {

    /* JADX INFO: renamed from: a */
    private static final Comparator f93270a = new C16684b();

    /* JADX INFO: renamed from: l.euq0$b */
    public static class C16684b implements Comparator {
        private C16684b() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return euq0.m118196g((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return euq0.m118198i((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return euq0.m118197h((Map) obj, (Map) obj2);
            }
            return obj instanceof byte[] ? euq0.m118201l((byte[]) obj, (byte[]) obj2) : euq0.m118193d((Comparable) obj, (Comparable) obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m118190a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m118191b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m118192c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m118193d(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: e */
    public static int m118194e(String str, String str2) {
        return str.compareTo(str2);
    }

    /* JADX INFO: renamed from: f */
    public static int m118195f(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, iRemaining);
        return iRemaining;
    }

    /* JADX INFO: renamed from: g */
    public static int m118196g(List list, List list2) {
        int iM118191b = m118191b(list.size(), list2.size());
        if (iM118191b != 0) {
            return iM118191b;
        }
        for (int i = 0; i < list.size(); i++) {
            int iCompare = f93270a.compare(list.get(i), list2.get(i));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static int m118197h(Map map, Map map2) {
        int iM118191b = m118191b(map.size(), map2.size());
        if (iM118191b != 0) {
            return iM118191b;
        }
        Comparator comparator = f93270a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f93270a;
            int iCompare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m118198i(Set set, Set set2) {
        int iM118191b = m118191b(set.size(), set2.size());
        if (iM118191b != 0) {
            return iM118191b;
        }
        Comparator comparator = f93270a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f93270a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static int m118199j(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* JADX INFO: renamed from: k */
    public static int m118200k(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: l */
    public static int m118201l(byte[] bArr, byte[] bArr2) {
        int iM118191b = m118191b(bArr.length, bArr2.length);
        if (iM118191b != 0) {
            return iM118191b;
        }
        for (int i = 0; i < bArr.length; i++) {
            int iM118190a = m118190a(bArr[i], bArr2[i]);
            if (iM118190a != 0) {
                return iM118190a;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static String m118202m(byte b) {
        return Integer.toHexString((b | 256) & UnixStat.DEFAULT_LINK_PERM).toUpperCase().substring(1);
    }

    /* JADX INFO: renamed from: n */
    public static ByteBuffer m118203n(ByteBuffer byteBuffer) {
        return m118205p(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m118206q(byteBuffer));
    }

    /* JADX INFO: renamed from: o */
    public static void m118204o(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iArrayOffset > 128 ? iArrayOffset + 128 : iLimit;
        for (int i2 = iArrayOffset; i2 < i; i2++) {
            if (i2 > iArrayOffset) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            sb.append(m118202m(bArrArray[i2]));
        }
        if (iLimit != i) {
            sb.append("...");
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m118205p(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m118206q(ByteBuffer byteBuffer) {
        if (m118205p(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m118195f(byteBuffer, bArr, 0);
        return bArr;
    }
}
