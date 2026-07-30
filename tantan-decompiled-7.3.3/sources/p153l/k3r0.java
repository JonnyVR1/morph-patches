package p153l;

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
public final class k3r0 {

    /* JADX INFO: renamed from: a */
    private static final Comparator f123769a = new C18085b();

    /* JADX INFO: renamed from: l.k3r0$b */
    public static class C18085b implements Comparator {
        private C18085b() {
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
                return k3r0.m148148g((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return k3r0.m148150i((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return k3r0.m148149h((Map) obj, (Map) obj2);
            }
            return obj instanceof byte[] ? k3r0.m148153l((byte[]) obj, (byte[]) obj2) : k3r0.m148145d((Comparable) obj, (Comparable) obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m148142a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m148143b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m148144c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static int m148145d(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: e */
    public static int m148146e(String str, String str2) {
        return str.compareTo(str2);
    }

    /* JADX INFO: renamed from: f */
    public static int m148147f(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, iRemaining);
        return iRemaining;
    }

    /* JADX INFO: renamed from: g */
    public static int m148148g(List list, List list2) {
        int iM148143b = m148143b(list.size(), list2.size());
        if (iM148143b != 0) {
            return iM148143b;
        }
        for (int i = 0; i < list.size(); i++) {
            int iCompare = f123769a.compare(list.get(i), list2.get(i));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static int m148149h(Map map, Map map2) {
        int iM148143b = m148143b(map.size(), map2.size());
        if (iM148143b != 0) {
            return iM148143b;
        }
        Comparator comparator = f123769a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f123769a;
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
    public static int m148150i(Set set, Set set2) {
        int iM148143b = m148143b(set.size(), set2.size());
        if (iM148143b != 0) {
            return iM148143b;
        }
        Comparator comparator = f123769a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f123769a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static int m148151j(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* JADX INFO: renamed from: k */
    public static int m148152k(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: l */
    public static int m148153l(byte[] bArr, byte[] bArr2) {
        int iM148143b = m148143b(bArr.length, bArr2.length);
        if (iM148143b != 0) {
            return iM148143b;
        }
        for (int i = 0; i < bArr.length; i++) {
            int iM148142a = m148142a(bArr[i], bArr2[i]);
            if (iM148142a != 0) {
                return iM148142a;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static String m148154m(byte b) {
        return Integer.toHexString((b | 256) & UnixStat.DEFAULT_LINK_PERM).toUpperCase().substring(1);
    }

    /* JADX INFO: renamed from: n */
    public static ByteBuffer m148155n(ByteBuffer byteBuffer) {
        return m148157p(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m148158q(byteBuffer));
    }

    /* JADX INFO: renamed from: o */
    public static void m148156o(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iArrayOffset > 128 ? iArrayOffset + 128 : iLimit;
        for (int i2 = iArrayOffset; i2 < i; i2++) {
            if (i2 > iArrayOffset) {
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            sb.append(m148154m(bArrArray[i2]));
        }
        if (iLimit != i) {
            sb.append("...");
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m148157p(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m148158q(ByteBuffer byteBuffer) {
        if (m148157p(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m148147f(byteBuffer, bArr, 0);
        return bArr;
    }
}
