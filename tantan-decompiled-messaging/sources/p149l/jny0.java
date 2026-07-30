package p149l;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2312c;
import com.google.android.gms.internal.measurement.C2315d0;
import com.google.android.gms.internal.measurement.C2316e;
import com.google.android.gms.internal.measurement.C2317e0;
import com.google.android.gms.internal.measurement.C2319f0;
import com.google.android.gms.internal.measurement.C2352w;
import com.google.android.gms.internal.measurement.C2354x;
import com.google.android.gms.internal.measurement.C2356y;
import com.google.android.gms.measurement.internal.C2461j;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class jny0 extends hay0 {

    /* JADX INFO: renamed from: d */
    public String f118902d;

    /* JADX INFO: renamed from: e */
    public Set<Integer> f118903e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, tqy0> f118904f;

    /* JADX INFO: renamed from: g */
    public Long f118905g;

    /* JADX INFO: renamed from: h */
    public Long f118906h;

    public jny0(C2461j c2461j) {
        super(c2461j);
    }

    /* JADX INFO: renamed from: v */
    private final void m142399v(List<C2319f0> list) {
        if (list.isEmpty()) {
            return;
        }
        e01 e01Var = new e01();
        for (C2319f0 c2319f0 : list) {
            String strM14166X = c2319f0.m14166X();
            Map<Integer, List<C2316e>> mapM136117L0 = (Map) e01Var.get(strM14166X);
            if (mapM136117L0 == null) {
                mapM136117L0 = mo15140k().m136117L0(this.f118902d, strM14166X);
                e01Var.put(strM14166X, mapM136117L0);
            }
            for (Integer num : mapM136117L0.keySet()) {
                int iIntValue = num.intValue();
                if (this.f118903e.contains(num)) {
                    zzj().m211416E().m123937b("Skipping failed audience ID", num);
                    break;
                }
                boolean zM220742k = true;
                for (C2316e c2316e : mapM136117L0.get(num)) {
                    if (zzj().m211423w(2)) {
                        zzj().m211416E().m123939d("Evaluating filter. audience, filter, property", num, c2316e.m14137M() ? Integer.valueOf(c2316e.m14139h()) : null, mo15087c().m175779g(c2316e.m14133G()));
                        zzj().m211416E().m123937b("Filter definition", mo15138i().m168473E(c2316e));
                    }
                    if (!c2316e.m14137M() || c2316e.m14139h() > 256) {
                        zzj().m211417F().m123938c("Invalid property filter ID. appId, id", xww0.m211405p(this.f118902d), String.valueOf(c2316e.m14137M() ? Integer.valueOf(c2316e.m14139h()) : null));
                        zM220742k = false;
                        break;
                    }
                    zwy0 zwy0Var = new zwy0(this, this.f118902d, iIntValue, c2316e);
                    zM220742k = zwy0Var.m220742k(this.f118905g, this.f118906h, c2319f0, m142405x(iIntValue, c2316e.m14139h()));
                    if (!zM220742k) {
                        this.f118903e.add(num);
                        break;
                    }
                    m142403u(num).m190200c(zwy0Var);
                }
                if (!zM220742k) {
                    this.f118903e.add(num);
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    private final List<C2352w> m142400y() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> setKeySet = this.f118904f.keySet();
        setKeySet.removeAll(this.f118903e);
        for (Integer num : setKeySet) {
            int iIntValue = num.intValue();
            tqy0 tqy0Var = this.f118904f.get(num);
            Preconditions.checkNotNull(tqy0Var);
            C2352w c2352wM190199a = tqy0Var.m190199a(iIntValue);
            arrayList.add(c2352wM190199a);
            igr0 igr0VarMo15140k = mo15140k();
            String str = this.f118902d;
            C2315d0 c2315d0M14420K = c2352wM190199a.m14420K();
            igr0VarMo15140k.m130251o();
            igr0VarMo15140k.mo15092h();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(c2315d0M14420K);
            byte[] bArrM14254g = c2315d0M14420K.m14254g();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Constants.JumpUrlConstants.URL_KEY_APPID, str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrM14254g);
            try {
                if (igr0VarMo15140k.m136166v().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    igr0VarMo15140k.zzj().m211412A().m123937b("Failed to insert filter results (got -1). appId", xww0.m211405p(str));
                }
            } catch (SQLiteException e) {
                igr0VarMo15140k.zzj().m211412A().m123938c("Error storing filter results. appId", xww0.m211405p(str), e);
            }
        }
        return arrayList;
    }

    @Override // p149l.hay0
    /* JADX INFO: renamed from: r */
    public final boolean mo15144r() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final List<C2352w> m142401s(String str, List<C2356y> list, List<C2319f0> list2, Long l2, Long l3) {
        return m142402t(str, list, list2, l2, l3, false);
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final List<C2352w> m142402t(String str, List<C2356y> list, List<C2319f0> list2, Long l2, Long l3, boolean z) {
        boolean z2;
        boolean z3;
        HashSet hashSet;
        Map<Integer, C2315d0> map;
        List<C2312c> list3;
        boolean z4;
        HashSet hashSet2;
        Map<Integer, List<Integer>> map2;
        Iterator<Integer> it;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.f118902d = str;
        this.f118903e = new HashSet();
        this.f118904f = new e01();
        this.f118905g = l2;
        this.f118906h = l3;
        Iterator<C2356y> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(it2.next().m14500X())) {
                z2 = true;
                break;
            }
        }
        boolean z5 = lcy0.m149371a() && mo15085a().m192629B(this.f118902d, q8s0.f153314q0);
        boolean z6 = lcy0.m149371a() && mo15085a().m192629B(this.f118902d, q8s0.f153312p0);
        if (z2) {
            igr0 igr0VarMo15140k = mo15140k();
            String str2 = this.f118902d;
            igr0VarMo15140k.m130251o();
            igr0VarMo15140k.mo15092h();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                igr0VarMo15140k.m136166v().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                igr0VarMo15140k.zzj().m211412A().m123938c("Error resetting session-scoped event counts. appId", xww0.m211405p(str2), e);
            }
        }
        Map<Integer, List<C2312c>> mapM136133U0 = Collections.EMPTY_MAP;
        if (z6 && z5) {
            mapM136133U0 = mo15140k().m136133U0(this.f118902d);
        }
        Map<Integer, C2315d0> mapM136131T0 = mo15140k().m136131T0(this.f118902d);
        if (mapM136131T0.isEmpty()) {
            z3 = true;
        } else {
            HashSet hashSet3 = new HashSet(mapM136131T0.keySet());
            if (z2) {
                String str3 = this.f118902d;
                Map<Integer, List<Integer>> mapM136135V0 = mo15140k().m136135V0(this.f118902d);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(mapM136131T0);
                e01 e01Var = new e01();
                if (!mapM136131T0.isEmpty()) {
                    Iterator<Integer> it3 = mapM136131T0.keySet().iterator();
                    while (it3.hasNext()) {
                        Integer next = it3.next();
                        next.intValue();
                        C2315d0 c2315d0 = mapM136131T0.get(next);
                        List<Integer> list4 = mapM136135V0.get(next);
                        if (list4 == null || list4.isEmpty()) {
                            hashSet2 = hashSet3;
                            map2 = mapM136135V0;
                            it = it3;
                            e01Var.put(next, c2315d0);
                        } else {
                            hashSet2 = hashSet3;
                            List<Long> listM168475I = mo15138i().m168475I(c2315d0.m14117Y(), list4);
                            if (listM168475I.isEmpty()) {
                                hashSet3 = hashSet2;
                            } else {
                                C2315d0.a aVarM14127y = c2315d0.m14363t().m14126x().m14127y(listM168475I);
                                aVarM14127y.m14122B().m14123C(mo15138i().m168475I(c2315d0.m14119a0(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (C2354x c2354x : c2315d0.m14116X()) {
                                    Map<Integer, List<Integer>> map3 = mapM136135V0;
                                    Iterator<Integer> it4 = it3;
                                    if (!list4.contains(Integer.valueOf(c2354x.m14482h()))) {
                                        arrayList.add(c2354x);
                                    }
                                    mapM136135V0 = map3;
                                    it3 = it4;
                                }
                                map2 = mapM136135V0;
                                it = it3;
                                aVarM14127y.m14124v().m14125w(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (C2317e0 c2317e0 : c2315d0.m14118Z()) {
                                    if (!list4.contains(Integer.valueOf(c2317e0.m14146E()))) {
                                        arrayList2.add(c2317e0);
                                    }
                                }
                                aVarM14127y.m14128z().m14121A(arrayList2);
                                e01Var.put(next, (C2315d0) ((AbstractC2349u0) aVarM14127y.mo14369H()));
                            }
                        }
                        hashSet3 = hashSet2;
                        mapM136135V0 = map2;
                        it3 = it;
                    }
                }
                hashSet = hashSet3;
                z3 = true;
                map = e01Var;
            } else {
                hashSet = hashSet3;
                z3 = true;
                map = mapM136131T0;
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                Integer num = (Integer) it5.next();
                num.intValue();
                C2315d0 c2315d1 = map.get(num);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C2315d0 c2315d2 = c2315d1;
                e01 e01Var2 = new e01();
                if (c2315d2 != null && c2315d2.m14120h() != 0) {
                    Iterator<C2354x> it6 = c2315d2.m14116X().iterator();
                    while (it6.hasNext()) {
                        C2354x next2 = it6.next();
                        if (next2.m14481K()) {
                            e01Var2.put(Integer.valueOf(next2.m14482h()), next2.m14480I() ? Long.valueOf(next2.m14479D()) : null);
                        } else {
                            it6 = it6;
                        }
                        it6 = it6;
                        c2315d2 = c2315d2;
                    }
                }
                C2315d0 c2315d3 = c2315d2;
                e01 e01Var3 = new e01();
                if (c2315d3 != null && c2315d3.m14114I() != 0) {
                    Iterator<C2317e0> it7 = c2315d3.m14118Z().iterator();
                    while (it7.hasNext()) {
                        Iterator<C2317e0> it8 = it7;
                        C2317e0 next3 = it7.next();
                        if (next3.m14148L() && next3.m14149h() > 0) {
                            e01Var3.put(Integer.valueOf(next3.m14146E()), Long.valueOf(next3.m14145B(next3.m14149h() - 1)));
                        }
                        it7 = it8;
                        map = map;
                        it5 = it5;
                    }
                }
                Map<Integer, C2315d0> map4 = map;
                Iterator it9 = it5;
                if (c2315d3 != null) {
                    int i = 0;
                    while (i < (c2315d3.m14115M() << 6)) {
                        if (pdy0.m168463Y(c2315d3.m14119a0(), i)) {
                            z4 = z5;
                            zzj().m211416E().m123938c("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i));
                            bitSet2.set(i);
                            if (pdy0.m168463Y(c2315d3.m14117Y(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            z5 = z4;
                        } else {
                            z4 = z5;
                        }
                        e01Var2.remove(Integer.valueOf(i));
                        i++;
                        z5 = z4;
                    }
                }
                boolean z7 = z5;
                C2315d0 c2315d4 = mapM136131T0.get(num);
                if (z6 && z7 && (list3 = mapM136133U0.get(num)) != null && this.f118906h != null && this.f118905g != null) {
                    for (C2312c c2312c : list3) {
                        int iM13834E = c2312c.m13834E();
                        Map<Integer, List<C2312c>> map5 = mapM136133U0;
                        long jLongValue = this.f118906h.longValue() / 1000;
                        if (c2312c.m13839T()) {
                            jLongValue = this.f118905g.longValue() / 1000;
                        }
                        if (e01Var2.containsKey(Integer.valueOf(iM13834E))) {
                            e01Var2.put(Integer.valueOf(iM13834E), Long.valueOf(jLongValue));
                        }
                        if (e01Var3.containsKey(Integer.valueOf(iM13834E))) {
                            e01Var3.put(Integer.valueOf(iM13834E), Long.valueOf(jLongValue));
                        }
                        mapM136133U0 = map5;
                    }
                }
                this.f118904f.put(num, new tqy0(this, this.f118902d, c2315d4, bitSet, bitSet2, e01Var2, e01Var3));
                mapM136131T0 = mapM136131T0;
                z5 = z7;
                mapM136133U0 = mapM136133U0;
                map = map4;
                it5 = it9;
            }
        }
        if (!t9y0.m187687a() || !mo15085a().m192629B(null, q8s0.f153267Z0)) {
            m142404w(list, z3);
            m142399v(list2);
            return m142400y();
        }
        m142404w(list, z);
        if (z) {
            return new ArrayList();
        }
        m142399v(list2);
        return m142400y();
    }

    /* JADX INFO: renamed from: u */
    public final tqy0 m142403u(Integer num) {
        if (this.f118904f.containsKey(num)) {
            return this.f118904f.get(num);
        }
        tqy0 tqy0Var = new tqy0(this, this.f118902d);
        this.f118904f.put(num, tqy0Var);
        return tqy0Var;
    }

    /* JADX INFO: renamed from: w */
    public final void m142404w(List<C2356y> list, boolean z) {
        j2s0 j2s0Var;
        n4r0 n4r0Var;
        if (list.isEmpty()) {
            return;
        }
        n4r0 n4r0Var2 = null;
        ovy0 ovy0Var = new ovy0(this);
        e01 e01Var = new e01();
        for (C2356y c2356y : list) {
            C2356y c2356yM166211a = ovy0Var.m166211a(this.f118902d, c2356y);
            if (c2356yM166211a != null) {
                igr0 igr0VarMo15140k = mo15140k();
                String str = this.f118902d;
                String strM14500X = c2356yM166211a.m14500X();
                j2s0 j2s0VarM136105F0 = igr0VarMo15140k.m136105F0(str, c2356y.m14500X());
                if (j2s0VarM136105F0 == null) {
                    igr0VarMo15140k.zzj().m211417F().m123938c("Event aggregate wasn't created during raw event logging. appId, event", xww0.m211405p(str), igr0VarMo15140k.mo15087c().m175776c(strM14500X));
                    j2s0Var = new j2s0(str, c2356y.m14500X(), 1L, 1L, 1L, c2356y.m14499U(), 0L, null, null, null, null);
                } else {
                    j2s0Var = new j2s0(j2s0VarM136105F0.f115951a, j2s0VarM136105F0.f115952b, j2s0VarM136105F0.f115953c + 1, j2s0VarM136105F0.f115954d + 1, j2s0VarM136105F0.f115955e + 1, j2s0VarM136105F0.f115956f, j2s0VarM136105F0.f115957g, j2s0VarM136105F0.f115958h, j2s0VarM136105F0.f115959i, j2s0VarM136105F0.f115960j, j2s0VarM136105F0.f115961k);
                }
                mo15140k().m136136W(j2s0Var);
                if (t9y0.m187687a()) {
                    n4r0Var = null;
                    if (mo15085a().m192629B(null, q8s0.f153267Z0) && z) {
                        n4r0Var2 = null;
                        e01Var = e01Var;
                    }
                    ovy0Var = ovy0Var;
                } else {
                    n4r0Var = null;
                }
                long j = j2s0Var.f115953c;
                String strM14500X2 = c2356yM166211a.m14500X();
                e01 e01Var2 = e01Var;
                Map<Integer, List<C2312c>> mapM136111I0 = (Map) e01Var2.get(strM14500X2);
                if (mapM136111I0 == null) {
                    mapM136111I0 = mo15140k().m136111I0(this.f118902d, strM14500X2);
                    e01Var2.put(strM14500X2, mapM136111I0);
                }
                for (Integer num : mapM136111I0.keySet()) {
                    int iIntValue = num.intValue();
                    if (this.f118903e.contains(num)) {
                        zzj().m211416E().m123937b("Skipping failed audience ID", num);
                    } else {
                        boolean z2 = true;
                        for (C2312c c2312c : mapM136111I0.get(num)) {
                            vty0 vty0Var = new vty0(this, this.f118902d, iIntValue, c2312c);
                            boolean zM200057k = vty0Var.m200057k(this.f118905g, this.f118906h, c2356yM166211a, j, j2s0Var, m142405x(iIntValue, c2312c.m13834E()));
                            if (!zM200057k) {
                                this.f118903e.add(num);
                                z2 = zM200057k;
                                break;
                            } else {
                                m142403u(num).m190200c(vty0Var);
                                z2 = zM200057k;
                            }
                        }
                        if (!z2) {
                            this.f118903e.add(num);
                        }
                    }
                }
                n4r0 n4r0Var3 = n4r0Var;
                e01Var = e01Var2;
                n4r0Var2 = n4r0Var3;
                ovy0Var = ovy0Var;
            } else {
                e01Var = e01Var;
                n4r0Var2 = n4r0Var2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m142405x(int i, int i2) {
        tqy0 tqy0Var = this.f118904f.get(Integer.valueOf(i));
        if (tqy0Var == null) {
            return false;
        }
        return tqy0Var.f171652d.get(i2);
    }
}
