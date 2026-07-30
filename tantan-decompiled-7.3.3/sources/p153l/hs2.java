package p153l;

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
public final class hs2 {

    /* JADX INFO: renamed from: a */
    public final Map<String, Long> f111400a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, Long> f111401b;

    /* JADX INFO: renamed from: c */
    public final Map<List<Pair<String, Integer>>, fs2> f111402c;

    /* JADX INFO: renamed from: d */
    public final Random f111403d;

    @VisibleForTesting
    public hs2(Random random) {
        this.f111402c = new HashMap();
        this.f111403d = random;
        this.f111400a = new HashMap();
        this.f111401b = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m136938b(T t, long j, Map<T, Long> map) {
        if (map.containsKey(t)) {
            j = Math.max(j, ((Long) bmk0.m105144j(map.get(t))).longValue());
        }
        map.put(t, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: d */
    public static int m136939d(fs2 fs2Var, fs2 fs2Var2) {
        int iCompare = Integer.compare(fs2Var.f100519c, fs2Var2.f100519c);
        return iCompare != 0 ? iCompare : fs2Var.f100518b.compareTo(fs2Var2.f100518b);
    }

    /* JADX INFO: renamed from: f */
    public static int m136940f(List<fs2> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).f100519c));
        }
        return hashSet.size();
    }

    /* JADX INFO: renamed from: h */
    public static <T> void m136941h(long j, Map<T, Long> map) {
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
    public final List<fs2> m136942c(List<fs2> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m136941h(jElapsedRealtime, this.f111400a);
        m136941h(jElapsedRealtime, this.f111401b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            fs2 fs2Var = list.get(i);
            if (!this.f111400a.containsKey(fs2Var.f100518b) && !this.f111401b.containsKey(Integer.valueOf(fs2Var.f100519c))) {
                arrayList.add(fs2Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public void m136943e(fs2 fs2Var, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        m136938b(fs2Var.f100518b, jElapsedRealtime, this.f111400a);
        int i = fs2Var.f100519c;
        if (i != Integer.MIN_VALUE) {
            m136938b(Integer.valueOf(i), jElapsedRealtime, this.f111401b);
        }
    }

    /* JADX INFO: renamed from: g */
    public int m136944g(List<fs2> list) {
        HashSet hashSet = new HashSet();
        List<fs2> listM136942c = m136942c(list);
        for (int i = 0; i < listM136942c.size(); i++) {
            hashSet.add(Integer.valueOf(listM136942c.get(i).f100519c));
        }
        return hashSet.size();
    }

    /* JADX INFO: renamed from: i */
    public void m136945i() {
        this.f111400a.clear();
        this.f111401b.clear();
        this.f111402c.clear();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public fs2 m136946j(List<fs2> list) {
        List<fs2> listM136942c = m136942c(list);
        if (listM136942c.size() < 2) {
            return (fs2) akq.m98598f(listM136942c, null);
        }
        Collections.sort(listM136942c, new Comparator() { // from class: l.gs2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hs2.m136939d((fs2) obj, (fs2) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = listM136942c.get(0).f100519c;
        for (int i2 = 0; i2 < listM136942c.size(); i2++) {
            fs2 fs2Var = listM136942c.get(i2);
            if (i != fs2Var.f100519c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listM136942c.get(0);
            }
            arrayList.add(new Pair(fs2Var.f100518b, Integer.valueOf(fs2Var.f100520d)));
        }
        fs2 fs2Var2 = this.f111402c.get(arrayList);
        if (fs2Var2 != null) {
            return fs2Var2;
        }
        fs2 fs2VarM136947k = m136947k(listM136942c.subList(0, arrayList.size()));
        this.f111402c.put(arrayList, fs2VarM136947k);
        return fs2VarM136947k;
    }

    /* JADX INFO: renamed from: k */
    public final fs2 m136947k(List<fs2> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).f100520d;
        }
        int iNextInt = this.f111403d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            fs2 fs2Var = list.get(i4);
            i3 += fs2Var.f100520d;
            if (iNextInt < i3) {
                return fs2Var;
            }
        }
        return (fs2) akq.m98599g(list);
    }

    public hs2() {
        this(new Random());
    }
}
