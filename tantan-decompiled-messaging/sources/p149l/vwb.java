package p149l;

import android.graphics.Point;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$b_account;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class vwb {

    /* JADX INFO: renamed from: a */
    public static final Charset f183321a = Charset.forName("UTF-8");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: l.vwb$a */
    public class C20745a<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w9j f183322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f183323b;

        public C20745a(w9j w9jVar, List list) {
            this.f183322a = w9jVar;
            this.f183323b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            return (E) this.f183322a.call(this.f183323b.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f183323b.size();
        }
    }

    /* JADX INFO: renamed from: A */
    public static <T> void m200287A(T[] tArr, e30<T> e30Var) {
        for (T t : tArr) {
            e30Var.call(t);
        }
    }

    /* JADX INFO: renamed from: B */
    public static <A, T> T m200288B(HashMap<A, T> map, A a, v9j<T> v9jVar) {
        T t = map.get(a);
        if (t != null) {
            return t;
        }
        T tCall = v9jVar.call();
        map.put(a, tCall);
        return tCall;
    }

    /* JADX INFO: renamed from: C */
    public static <T> HashMap<String, ArrayList<T>> m200289C(List<T> list, w9j<T, String> w9jVar) {
        HashMap<String, ArrayList<T>> map = new HashMap<>();
        for (T t : list) {
            String strCall = w9jVar.call(t);
            ArrayList<T> arrayList = map.get(strCall);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(strCall, arrayList);
            }
            arrayList.add(t);
        }
        return map;
    }

    /* JADX INFO: renamed from: D */
    public static <T, F> List<T> m200290D(Map<T, F> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public static <T> List<T> m200291E(List<T> list) {
        return (list == null || list.size() < 1) ? Collections.EMPTY_LIST : m200299M(list.get(0));
    }

    /* JADX INFO: renamed from: F */
    public static <T> T m200292F(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: G */
    public static <T> int m200293G(List<T> list, w9j<T, Boolean> w9jVar) {
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (w9jVar.call(list.get(i)).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public static int m200294H(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i].equals(obj)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public static <T> void m200295I(List<T> list, Comparator<? super T> comparator) {
        for (int i = 1; i < list.size(); i++) {
            T t = list.get(i);
            int i2 = i - 1;
            while (i2 >= 0 && comparator.compare(t, list.get(i2)) < 0) {
                list.set(i2 + 1, list.get(i2));
                i2--;
            }
            list.set(i2 + 1, t);
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m200296J(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: K */
    public static <T> boolean m200297K(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m200298L(String str) {
        return str == null || str.trim().isEmpty();
    }

    /* JADX INFO: renamed from: M */
    public static <T> ArrayList<T> m200299M(T t) {
        ArrayList<T> arrayList = new ArrayList<>(1);
        arrayList.add(t);
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public static <T> T m200300N(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: O */
    public static <T> int m200301O(List<T> list, w9j<T, Boolean> w9jVar) {
        if (list == null) {
            return -1;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            if (w9jVar.call(list.get(size)).booleanValue()) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: P */
    public static <T> T m200302P(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: Q */
    public static <T, E> ArrayList<E> m200303Q(Collection<T> collection, w9j<T, E> w9jVar) {
        if (collection == null) {
            return null;
        }
        ArrayList<E> arrayList = new ArrayList<>();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(w9jVar.call(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R */
    public static <T, E> ArrayList<E> m200304R(T[] tArr, w9j<T, E> w9jVar) {
        if (tArr == null) {
            return null;
        }
        ArrayList<E> arrayList = new ArrayList<>();
        for (T t : tArr) {
            arrayList.add(w9jVar.call(t));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static <T, K, R> ArrayList<R> m200305S(List<? extends T> list, w9j<? super T, K> w9jVar, x9j<K, List<T>, R> x9jVar) {
        HashMap map = new HashMap(list.size());
        for (T t : list) {
            K kCall = w9jVar.call(t);
            List arrayList = (List) map.get(kCall);
            if (arrayList == null) {
                arrayList = new ArrayList(list.size());
                map.put(kCall, arrayList);
            }
            arrayList.add(t);
        }
        Injecter$$Intermediate$$b_account.C135271 c135271 = (ArrayList<R>) new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object objCall = x9jVar.call(entry.getKey(), (List) entry.getValue());
            if (objCall != null) {
                c135271.add(objCall);
            }
        }
        return c135271;
    }

    /* JADX INFO: renamed from: T */
    public static <T, E> List<E> m200306T(List<T> list, w9j<T, E> w9jVar) {
        return new C20745a(w9jVar, list);
    }

    /* JADX INFO: renamed from: U */
    public static <T> String m200307U(Collection<T> collection, String str) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (T t : collection) {
            if (t != null) {
                sb.append(t.toString());
                sb.append(str);
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - str.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: V */
    public static String m200308V(Object[] objArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj.toString());
            sb.append(str);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - str.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: W */
    public static String m200309W(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: X */
    public static <T, V> V m200310X(T t, w9j<T, V> w9jVar, V v2) {
        return t == null ? v2 : w9jVar.call(t);
    }

    /* JADX INFO: renamed from: Y */
    public static <T, E> j760<T, E> m200311Y(T t, E e) {
        return new j760<>(t, e);
    }

    /* JADX INFO: renamed from: Z */
    public static <A, B, C, D> knb0<A, B, C, D> m200312Z(A a, B b, C c, D d) {
        return new knb0<>(a, b, c, d);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m200313a(x9j x9jVar, Object obj, Object obj2) {
        return (Boolean) x9jVar.call(obj, obj2);
    }

    /* JADX INFO: renamed from: a0 */
    public static List<Integer> m200314a0(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b0 */
    public static ArrayList<Point> m200316b0(Matcher matcher) {
        ArrayList<Point> arrayList = new ArrayList<>();
        while (matcher.find()) {
            arrayList.add(new Point(matcher.start(), matcher.end()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static <T> List<T> m200317c(List<T> list, T t) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(t);
        return arrayList;
    }

    /* JADX INFO: renamed from: c0 */
    public static <T> List<T> m200318c0(List<T> list, T t) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(t);
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static <K, V, E> HashMap<K, V> m200319d(Collection<E> collection, w9j<E, K> w9jVar, w9j<E, V> w9jVar2) {
        HashMap<K, V> map = new HashMap<>();
        for (E e : collection) {
            map.put(w9jVar.call(e), w9jVar2.call(e));
        }
        return map;
    }

    /* JADX INFO: renamed from: d0 */
    public static <T> int m200320d0(List<T> list, w9j<T, Boolean> w9jVar) {
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (w9jVar.call(it.next()).booleanValue()) {
                it.remove();
                i++;
            }
        }
        return i;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: e */
    public static <T> List<T> m200321e(List<T> list, List<T>... listArr) {
        ArrayList arrayList = new ArrayList(list);
        for (List<T> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public static <T> boolean m200322e0(List<T> list, w9j<T, Boolean> w9jVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (w9jVar.call(it.next()).booleanValue()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static <T> int m200323f(List<T> list, w9j<T, Boolean> w9jVar) {
        return m200339n(list, w9jVar).size();
    }

    /* JADX INFO: renamed from: f0 */
    public static <T> ArrayList<T> m200324f0(T... tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        Collections.addAll(arrayList, tArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static <T> int m200325g(List<T> list, List<T> list2) {
        int i = 0;
        for (T t : list) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (t.equals(it.next())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: g0 */
    public static <T> void m200326g0(List<T> list, T t, Comparator<? super T> comparator) {
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (comparator.compare(list.get(i), t) < 0) {
                size = i;
                break;
            }
        }
        list.add(size, t);
    }

    /* JADX INFO: renamed from: h */
    public static <E, T> List<E> m200327h(List<E> list, final w9j<E, T> w9jVar) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        m200354z(list, new e30() { // from class: l.uwb
            @Override // p149l.e30
            public final void call(Object obj) {
                linkedHashMap.put(w9jVar.call(obj), obj);
            }
        });
        return new ArrayList(linkedHashMap.values());
    }

    /* JADX INFO: renamed from: h0 */
    public static <E> List<E> m200328h0(Collection<E> collection, Collection<E> collection2) {
        ArrayList arrayList = new ArrayList();
        for (E e : collection) {
            if (!collection2.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static String m200329i(String str, int i) {
        return str.substring(Math.min(i, str.length()), str.length());
    }

    /* JADX INFO: renamed from: i0 */
    public static int m200330i0(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: j */
    public static String m200331j(String str, String str2) {
        return str.startsWith(str2) ? str.substring(str2.length(), str.length()) : str;
    }

    /* JADX INFO: renamed from: j0 */
    public static <T> long m200332j0(Iterable<T> iterable, w9j<T, Long> w9jVar) {
        Iterator<T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += w9jVar.call(it.next()).longValue();
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: k */
    public static String m200333k(String str) {
        return m200298L(str) ? "" : str;
    }

    /* JADX INFO: renamed from: k0 */
    public static <T> List<T> m200334k0(List<T> list, int i) {
        if (list == null) {
            return null;
        }
        return list.subList(0, Math.min(i, list.size()));
    }

    /* JADX INFO: renamed from: l */
    public static <T> boolean m200335l(Collection<T> collection, Collection<T> collection2, final x9j<T, T, Boolean> x9jVar) {
        if (m200296J(collection) && m200296J(collection2)) {
            return true;
        }
        if (collection2.size() != collection.size()) {
            return false;
        }
        for (final T t : collection2) {
            if (!m200337m(collection, new w9j() { // from class: l.twb
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vwb.m200313a(x9jVar, t, obj);
                }
            })) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public static <T> T m200336l0(List<T> list) {
        if (m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: m */
    public static <T> boolean m200337m(Collection<T> collection, w9j<T, Boolean> w9jVar) {
        if (collection == null) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (w9jVar.call(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public static <T> List<T> m200338m0(List<T> list, int i) {
        return list.subList(Math.max(0, list.size() - i), list.size());
    }

    /* JADX INFO: renamed from: n */
    public static <T> ArrayList<T> m200339n(Collection<T> collection, w9j<T, Boolean> w9jVar) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (collection != null) {
            for (T t : collection) {
                if (w9jVar.call(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n0 */
    public static <E> Set<E> m200340n0(List<E> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: o */
    public static <T> List<T> m200341o(List<T> list, T t) {
        if (!list.contains(t)) {
            list.add(t);
        }
        return list;
    }

    /* JADX INFO: renamed from: o0 */
    public static <E> String m200342o0(Collection<E> collection, w9j<E, String> w9jVar, String str) {
        if (collection == null) {
            return null;
        }
        if (collection.isEmpty()) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(w9jVar.call(it.next()));
            sb.append(str);
        }
        return sb.substring(0, sb.length() - str.length());
    }

    /* JADX INFO: renamed from: p */
    public static <T> List<T> m200343p(List<T> list, List<T> list2) {
        for (T t : list2) {
            if (!list.contains(t)) {
                list.add(t);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: p0 */
    public static <T> List<j760<T, Integer>> m200344p0(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<T> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(m200311Y(it.next(), Integer.valueOf(i)));
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static String m200345q(String str) {
        return Pattern.compile("[^0-9]").matcher(str).replaceAll("").toString();
    }

    /* JADX INFO: renamed from: r */
    public static <T> T m200346r(Collection<T> collection, w9j<T, Boolean> w9jVar) {
        if (collection == null) {
            return null;
        }
        for (T t : collection) {
            if (w9jVar.call(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static <T> T m200347s(T[] tArr, w9j<T, Boolean> w9jVar) {
        if (tArr == null) {
            return null;
        }
        for (int i = 0; i < tArr.length; i++) {
            if (w9jVar.call(tArr[i]).booleanValue()) {
                return tArr[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static int m200348t(@NonNull int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: u */
    public static int m200349u(@NonNull int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: v */
    public static <T> T m200350v(List<T> list, w9j<T, Boolean> w9jVar, int i) {
        if (list == null) {
            return null;
        }
        for (int i2 = 0; i2 < list.size() && i2 <= i; i2++) {
            T t = list.get(i2);
            if (w9jVar.call(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static <T, V> ArrayList<V> m200351w(List<T> list, w9j<T, List<V>> w9jVar) {
        ArrayList<V> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(w9jVar.call(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static <T> List<T> m200352x(List<T>... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List<T> list : listArr) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static <T> boolean m200353y(Collection<T> collection, w9j<T, Boolean> w9jVar) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!w9jVar.call(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static <T> void m200354z(Collection<T> collection, e30<T> e30Var) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            e30Var.call(it.next());
        }
    }
}
