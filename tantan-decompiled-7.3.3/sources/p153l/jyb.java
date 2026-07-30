package p153l;

import android.graphics.Point;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$b_core;
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

/* JADX INFO: loaded from: classes11.dex */
public class jyb {

    /* JADX INFO: renamed from: a */
    public static final Charset f123125a = Charset.forName("UTF-8");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: l.jyb$a */
    public class C18059a<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qcj f123126a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f123127b;

        public C18059a(qcj qcjVar, List list) {
            this.f123126a = qcjVar;
            this.f123127b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            return (E) this.f123126a.call(this.f123127b.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f123127b.size();
        }
    }

    /* JADX INFO: renamed from: A */
    public static <T> void m147470A(T[] tArr, y20<T> y20Var) {
        for (T t : tArr) {
            y20Var.call(t);
        }
    }

    /* JADX INFO: renamed from: B */
    public static <A, T> T m147471B(HashMap<A, T> map, A a, pcj<T> pcjVar) {
        T t = map.get(a);
        if (t != null) {
            return t;
        }
        T tCall = pcjVar.call();
        map.put(a, tCall);
        return tCall;
    }

    /* JADX INFO: renamed from: C */
    public static <T> HashMap<String, ArrayList<T>> m147472C(List<T> list, qcj<T, String> qcjVar) {
        HashMap<String, ArrayList<T>> map = new HashMap<>();
        for (T t : list) {
            String strCall = qcjVar.call(t);
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
    public static <T, F> List<T> m147473D(Map<T, F> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public static <T> List<T> m147474E(List<T> list) {
        return (list == null || list.size() < 1) ? Collections.EMPTY_LIST : m147482M(list.get(0));
    }

    /* JADX INFO: renamed from: F */
    public static <T> T m147475F(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: G */
    public static <T> int m147476G(List<T> list, qcj<T, Boolean> qcjVar) {
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (qcjVar.call(list.get(i)).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public static int m147477H(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i].equals(obj)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public static <T> void m147478I(List<T> list, Comparator<? super T> comparator) {
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
    public static boolean m147479J(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: K */
    public static <T> boolean m147480K(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m147481L(String str) {
        return str == null || str.trim().isEmpty();
    }

    /* JADX INFO: renamed from: M */
    public static <T> ArrayList<T> m147482M(T t) {
        ArrayList<T> arrayList = new ArrayList<>(1);
        arrayList.add(t);
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public static <T> T m147483N(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: O */
    public static <T> int m147484O(List<T> list, qcj<T, Boolean> qcjVar) {
        if (list == null) {
            return -1;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            if (qcjVar.call(list.get(size)).booleanValue()) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: P */
    public static <T> T m147485P(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: Q */
    public static <T, E> ArrayList<E> m147486Q(Collection<T> collection, qcj<T, E> qcjVar) {
        if (collection == null) {
            return null;
        }
        ArrayList<E> arrayList = new ArrayList<>();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(qcjVar.call(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R */
    public static <T, E> ArrayList<E> m147487R(T[] tArr, qcj<T, E> qcjVar) {
        if (tArr == null) {
            return null;
        }
        ArrayList<E> arrayList = new ArrayList<>();
        for (T t : tArr) {
            arrayList.add(qcjVar.call(t));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static <T, K, R> ArrayList<R> m147488S(List<? extends T> list, qcj<? super T, K> qcjVar, rcj<K, List<T>, R> rcjVar) {
        HashMap map = new HashMap(list.size());
        for (T t : list) {
            K kCall = qcjVar.call(t);
            List arrayList = (List) map.get(kCall);
            if (arrayList == null) {
                arrayList = new ArrayList(list.size());
                map.put(kCall, arrayList);
            }
            arrayList.add(t);
        }
        Injecter$$Intermediate$$b_core.C136911 c136911 = (ArrayList<R>) new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object objCall = rcjVar.call(entry.getKey(), (List) entry.getValue());
            if (objCall != null) {
                c136911.add(objCall);
            }
        }
        return c136911;
    }

    /* JADX INFO: renamed from: T */
    public static <T, E> List<E> m147489T(List<T> list, qcj<T, E> qcjVar) {
        return new C18059a(qcjVar, list);
    }

    /* JADX INFO: renamed from: U */
    public static <T> String m147490U(Collection<T> collection, String str) {
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
    public static String m147491V(Object[] objArr, String str) {
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
    public static String m147492W(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: X */
    public static <T, V> V m147493X(T t, qcj<T, V> qcjVar, V v2) {
        return t == null ? v2 : qcjVar.call(t);
    }

    /* JADX INFO: renamed from: Y */
    public static <T, E> pf60<T, E> m147494Y(T t, E e) {
        return new pf60<>(t, e);
    }

    /* JADX INFO: renamed from: Z */
    public static <A, B, C, D> ovb0<A, B, C, D> m147495Z(A a, B b, C c, D d) {
        return new ovb0<>(a, b, c, d);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m147496a(rcj rcjVar, Object obj, Object obj2) {
        return (Boolean) rcjVar.call(obj, obj2);
    }

    /* JADX INFO: renamed from: a0 */
    public static List<Integer> m147497a0(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b0 */
    public static ArrayList<Point> m147499b0(Matcher matcher) {
        ArrayList<Point> arrayList = new ArrayList<>();
        while (matcher.find()) {
            arrayList.add(new Point(matcher.start(), matcher.end()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static <T> List<T> m147500c(List<T> list, T t) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(t);
        return arrayList;
    }

    /* JADX INFO: renamed from: c0 */
    public static <T> List<T> m147501c0(List<T> list, T t) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(t);
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static <K, V, E> HashMap<K, V> m147502d(Collection<E> collection, qcj<E, K> qcjVar, qcj<E, V> qcjVar2) {
        HashMap<K, V> map = new HashMap<>();
        for (E e : collection) {
            map.put(qcjVar.call(e), qcjVar2.call(e));
        }
        return map;
    }

    /* JADX INFO: renamed from: d0 */
    public static <T> int m147503d0(List<T> list, qcj<T, Boolean> qcjVar) {
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (qcjVar.call(it.next()).booleanValue()) {
                it.remove();
                i++;
            }
        }
        return i;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: e */
    public static <T> List<T> m147504e(List<T> list, List<T>... listArr) {
        ArrayList arrayList = new ArrayList(list);
        for (List<T> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public static <T> boolean m147505e0(List<T> list, qcj<T, Boolean> qcjVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (qcjVar.call(it.next()).booleanValue()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static <T> int m147506f(List<T> list, qcj<T, Boolean> qcjVar) {
        return m147522n(list, qcjVar).size();
    }

    /* JADX INFO: renamed from: f0 */
    public static <T> ArrayList<T> m147507f0(T... tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        Collections.addAll(arrayList, tArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static <T> int m147508g(List<T> list, List<T> list2) {
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
    public static <T> void m147509g0(List<T> list, T t, Comparator<? super T> comparator) {
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
    public static <E, T> List<E> m147510h(List<E> list, final qcj<E, T> qcjVar) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        m147537z(list, new y20() { // from class: l.iyb
            @Override // p153l.y20
            public final void call(Object obj) {
                linkedHashMap.put(qcjVar.call(obj), obj);
            }
        });
        return new ArrayList(linkedHashMap.values());
    }

    /* JADX INFO: renamed from: h0 */
    public static <E> List<E> m147511h0(Collection<E> collection, Collection<E> collection2) {
        ArrayList arrayList = new ArrayList();
        for (E e : collection) {
            if (!collection2.contains(e)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static String m147512i(String str, int i) {
        return str.substring(Math.min(i, str.length()), str.length());
    }

    /* JADX INFO: renamed from: i0 */
    public static int m147513i0(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: j */
    public static String m147514j(String str, String str2) {
        return str.startsWith(str2) ? str.substring(str2.length(), str.length()) : str;
    }

    /* JADX INFO: renamed from: j0 */
    public static <T> long m147515j0(Iterable<T> iterable, qcj<T, Long> qcjVar) {
        Iterator<T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += qcjVar.call(it.next()).longValue();
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: k */
    public static String m147516k(String str) {
        return m147481L(str) ? "" : str;
    }

    /* JADX INFO: renamed from: k0 */
    public static <T> List<T> m147517k0(List<T> list, int i) {
        if (list == null) {
            return null;
        }
        return list.subList(0, Math.min(i, list.size()));
    }

    /* JADX INFO: renamed from: l */
    public static <T> boolean m147518l(Collection<T> collection, Collection<T> collection2, final rcj<T, T, Boolean> rcjVar) {
        if (m147479J(collection) && m147479J(collection2)) {
            return true;
        }
        if (collection2.size() != collection.size()) {
            return false;
        }
        for (final T t : collection2) {
            if (!m147520m(collection, new qcj() { // from class: l.hyb
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return jyb.m147496a(rcjVar, t, obj);
                }
            })) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public static <T> T m147519l0(List<T> list) {
        if (m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: m */
    public static <T> boolean m147520m(Collection<T> collection, qcj<T, Boolean> qcjVar) {
        if (collection == null) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (qcjVar.call(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public static <T> List<T> m147521m0(List<T> list, int i) {
        return list.subList(Math.max(0, list.size() - i), list.size());
    }

    /* JADX INFO: renamed from: n */
    public static <T> ArrayList<T> m147522n(Collection<T> collection, qcj<T, Boolean> qcjVar) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (collection != null) {
            for (T t : collection) {
                if (qcjVar.call(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n0 */
    public static <E> Set<E> m147523n0(List<E> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: o */
    public static <T> List<T> m147524o(List<T> list, T t) {
        if (!list.contains(t)) {
            list.add(t);
        }
        return list;
    }

    /* JADX INFO: renamed from: o0 */
    public static <E> String m147525o0(Collection<E> collection, qcj<E, String> qcjVar, String str) {
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
            sb.append(qcjVar.call(it.next()));
            sb.append(str);
        }
        return sb.substring(0, sb.length() - str.length());
    }

    /* JADX INFO: renamed from: p */
    public static <T> List<T> m147526p(List<T> list, List<T> list2) {
        for (T t : list2) {
            if (!list.contains(t)) {
                list.add(t);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: p0 */
    public static <T> List<pf60<T, Integer>> m147527p0(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<T> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(m147494Y(it.next(), Integer.valueOf(i)));
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static String m147528q(String str) {
        return Pattern.compile("[^0-9]").matcher(str).replaceAll("").toString();
    }

    /* JADX INFO: renamed from: r */
    public static <T> T m147529r(Collection<T> collection, qcj<T, Boolean> qcjVar) {
        if (collection == null) {
            return null;
        }
        for (T t : collection) {
            if (qcjVar.call(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static <T> T m147530s(T[] tArr, qcj<T, Boolean> qcjVar) {
        if (tArr == null) {
            return null;
        }
        for (int i = 0; i < tArr.length; i++) {
            if (qcjVar.call(tArr[i]).booleanValue()) {
                return tArr[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static int m147531t(@NonNull int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: u */
    public static int m147532u(@NonNull int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: v */
    public static <T> T m147533v(List<T> list, qcj<T, Boolean> qcjVar, int i) {
        if (list == null) {
            return null;
        }
        for (int i2 = 0; i2 < list.size() && i2 <= i; i2++) {
            T t = list.get(i2);
            if (qcjVar.call(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static <T, V> ArrayList<V> m147534w(List<T> list, qcj<T, List<V>> qcjVar) {
        ArrayList<V> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(qcjVar.call(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static <T> List<T> m147535x(List<T>... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List<T> list : listArr) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static <T> boolean m147536y(Collection<T> collection, qcj<T, Boolean> qcjVar) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!qcjVar.call(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static <T> void m147537z(Collection<T> collection, y20<T> y20Var) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            y20Var.call(it.next());
        }
    }
}
