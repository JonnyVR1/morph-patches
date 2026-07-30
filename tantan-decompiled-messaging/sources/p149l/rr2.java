package p149l;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rr2 {

    /* JADX INFO: renamed from: a */
    public final Map<String, Long> f160716a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, Long> f160717b;

    /* JADX INFO: renamed from: c */
    public final Map<List<Pair<String, Integer>>, pr2> f160718c;

    /* JADX INFO: renamed from: d */
    public final Random f160719d;

    @VisibleForTesting
    public rr2(Random random) {
        this.f160718c = new HashMap();
        this.f160719d = random;
        this.f160716a = new HashMap();
        this.f160717b = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m180512b(T t, long j, Map<T, Long> map) {
        if (map.containsKey(t)) {
            j = Math.max(j, ((Long) vck0.m197866j(map.get(t))).longValue());
        }
        map.put(t, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: d */
    public static int m180513d(pr2 pr2Var, pr2 pr2Var2) {
        int iCompare = Integer.compare(pr2Var.f150852c, pr2Var2.f150852c);
        return iCompare != 0 ? iCompare : pr2Var.f150851b.compareTo(pr2Var2.f150851b);
    }

    /* JADX INFO: renamed from: f */
    public static int m180514f(List<pr2> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).f150852c));
        }
        return hashSet.size();
    }

    /* JADX INFO: renamed from: h */
    public static <T> void m180515h(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<pr2> m180516c(List<pr2> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m180515h(jElapsedRealtime, this.f160716a);
        m180515h(jElapsedRealtime, this.f160717b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            pr2 pr2Var = list.get(i);
            if (!this.f160716a.containsKey(pr2Var.f150851b) && !this.f160717b.containsKey(Integer.valueOf(pr2Var.f150852c))) {
                arrayList.add(pr2Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public void m180517e(pr2 pr2Var, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        m180512b(pr2Var.f150851b, jElapsedRealtime, this.f160716a);
        int i = pr2Var.f150852c;
        if (i != Integer.MIN_VALUE) {
            m180512b(Integer.valueOf(i), jElapsedRealtime, this.f160717b);
        }
    }

    /* JADX INFO: renamed from: g */
    public int m180518g(List<pr2> list) {
        HashSet hashSet = new HashSet();
        List<pr2> listM180516c = m180516c(list);
        for (int i = 0; i < listM180516c.size(); i++) {
            hashSet.add(Integer.valueOf(listM180516c.get(i).f150852c));
        }
        return hashSet.size();
    }

    /* JADX INFO: renamed from: i */
    public void m180519i() {
        this.f160716a.clear();
        this.f160717b.clear();
        this.f160718c.clear();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public pr2 m180520j(List<pr2> list) {
        List<pr2> listM180516c = m180516c(list);
        if (listM180516c.size() < 2) {
            return (pr2) aiq.m96880f(listM180516c, null);
        }
        Collections.sort(listM180516c, new Comparator() { // from class: l.qr2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return rr2.m180513d((pr2) obj, (pr2) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = listM180516c.get(0).f150852c;
        for (int i2 = 0; i2 < listM180516c.size(); i2++) {
            pr2 pr2Var = listM180516c.get(i2);
            if (i != pr2Var.f150852c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listM180516c.get(0);
            }
            arrayList.add(new Pair(pr2Var.f150851b, Integer.valueOf(pr2Var.f150853d)));
        }
        pr2 pr2Var2 = this.f160718c.get(arrayList);
        if (pr2Var2 != null) {
            return pr2Var2;
        }
        pr2 pr2VarM180521k = m180521k(listM180516c.subList(0, arrayList.size()));
        this.f160718c.put(arrayList, pr2VarM180521k);
        return pr2VarM180521k;
    }

    /* JADX INFO: renamed from: k */
    public final pr2 m180521k(List<pr2> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).f150853d;
        }
        int iNextInt = this.f160719d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            pr2 pr2Var = list.get(i4);
            i3 += pr2Var.f150853d;
            if (iNextInt < i3) {
                return pr2Var;
            }
        }
        return (pr2) aiq.m96881g(list);
    }

    public rr2() {
        this(new Random());
    }
}
