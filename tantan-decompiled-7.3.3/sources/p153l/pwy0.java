package p153l;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2335c;
import com.google.android.gms.internal.measurement.C2338d0;
import com.google.android.gms.internal.measurement.C2339e;
import com.google.android.gms.internal.measurement.C2340e0;
import com.google.android.gms.internal.measurement.C2342f0;
import com.google.android.gms.internal.measurement.C2375w;
import com.google.android.gms.internal.measurement.C2377x;
import com.google.android.gms.internal.measurement.C2379y;
import com.google.android.gms.measurement.internal.C2484j;
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
public final class pwy0 extends njy0 {

    /* JADX INFO: renamed from: d */
    public String f154453d;

    /* JADX INFO: renamed from: e */
    public Set<Integer> f154454e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, zzy0> f154455f;

    /* JADX INFO: renamed from: g */
    public Long f154456g;

    /* JADX INFO: renamed from: h */
    public Long f154457h;

    public pwy0(C2484j c2484j) {
        super(c2484j);
    }

    /* JADX INFO: renamed from: v */
    private final void m174095v(List<C2342f0> list) {
        if (list.isEmpty()) {
            return;
        }
        l01 l01Var = new l01();
        for (C2342f0 c2342f0 : list) {
            String strM14220X = c2342f0.m14220X();
            Map<Integer, List<C2339e>> mapM168716L0 = (Map) l01Var.get(strM14220X);
            if (mapM168716L0 == null) {
                mapM168716L0 = mo15194k().m168716L0(this.f154453d, strM14220X);
                l01Var.put(strM14220X, mapM168716L0);
            }
            for (Integer num : mapM168716L0.keySet()) {
                int iIntValue = num.intValue();
                if (this.f154454e.contains(num)) {
                    zzj().m114562E().m153301b("Skipping failed audience ID", num);
                    break;
                }
                boolean zM124336k = true;
                for (C2339e c2339e : mapM168716L0.get(num)) {
                    if (zzj().m114569w(2)) {
                        zzj().m114562E().m153303d("Evaluating filter. audience, filter, property", num, c2339e.m14191M() ? Integer.valueOf(c2339e.m14193h()) : null, mo15141c().m208452g(c2339e.m14187G()));
                        zzj().m114562E().m153301b("Filter definition", mo15192i().m201878E(c2339e));
                    }
                    if (!c2339e.m14191M() || c2339e.m14193h() > 256) {
                        zzj().m114563F().m153302c("Invalid property filter ID. appId, id", d6x0.m114551p(this.f154453d), String.valueOf(c2339e.m14191M() ? Integer.valueOf(c2339e.m14193h()) : null));
                        zM124336k = false;
                        break;
                    }
                    f6z0 f6z0Var = new f6z0(this, this.f154453d, iIntValue, c2339e);
                    zM124336k = f6z0Var.m124336k(this.f154456g, this.f154457h, c2342f0, m174101x(iIntValue, c2339e.m14193h()));
                    if (!zM124336k) {
                        this.f154454e.add(num);
                        break;
                    }
                    m174099u(num).m222295c(f6z0Var);
                }
                if (!zM124336k) {
                    this.f154454e.add(num);
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    private final List<C2375w> m174096y() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> setKeySet = this.f154455f.keySet();
        setKeySet.removeAll(this.f154454e);
        for (Integer num : setKeySet) {
            int iIntValue = num.intValue();
            zzy0 zzy0Var = this.f154455f.get(num);
            Preconditions.checkNotNull(zzy0Var);
            C2375w c2375wM222294a = zzy0Var.m222294a(iIntValue);
            arrayList.add(c2375wM222294a);
            opr0 opr0VarMo15194k = mo15194k();
            String str = this.f154453d;
            C2338d0 c2338d0M14474K = c2375wM222294a.m14474K();
            opr0VarMo15194k.m163482o();
            opr0VarMo15194k.mo15146h();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(c2338d0M14474K);
            byte[] bArrM14308g = c2338d0M14474K.m14308g();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Constants.JumpUrlConstants.URL_KEY_APPID, str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrM14308g);
            try {
                if (opr0VarMo15194k.m168765v().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    opr0VarMo15194k.zzj().m114558A().m153301b("Failed to insert filter results (got -1). appId", d6x0.m114551p(str));
                }
            } catch (SQLiteException e) {
                opr0VarMo15194k.zzj().m114558A().m153302c("Error storing filter results. appId", d6x0.m114551p(str), e);
            }
        }
        return arrayList;
    }

    @Override // p153l.njy0
    /* JADX INFO: renamed from: r */
    public final boolean mo15198r() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final List<C2375w> m174097s(String str, List<C2379y> list, List<C2342f0> list2, Long l2, Long l3) {
        return m174098t(str, list, list2, l2, l3, false);
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final List<C2375w> m174098t(String str, List<C2379y> list, List<C2342f0> list2, Long l2, Long l3, boolean z) {
        boolean z2;
        boolean z3;
        HashSet hashSet;
        Map<Integer, C2338d0> map;
        List<C2335c> list3;
        boolean z4;
        HashSet hashSet2;
        Map<Integer, List<Integer>> map2;
        Iterator<Integer> it;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.f154453d = str;
        this.f154454e = new HashSet();
        this.f154455f = new l01();
        this.f154456g = l2;
        this.f154457h = l3;
        Iterator<C2379y> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(it2.next().m14554X())) {
                z2 = true;
                break;
            }
        }
        boolean z5 = rly0.m182036a() && mo15139a().m98421B(this.f154453d, whs0.f189290q0);
        boolean z6 = rly0.m182036a() && mo15139a().m98421B(this.f154453d, whs0.f189288p0);
        if (z2) {
            opr0 opr0VarMo15194k = mo15194k();
            String str2 = this.f154453d;
            opr0VarMo15194k.m163482o();
            opr0VarMo15194k.mo15146h();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                opr0VarMo15194k.m168765v().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                opr0VarMo15194k.zzj().m114558A().m153302c("Error resetting session-scoped event counts. appId", d6x0.m114551p(str2), e);
            }
        }
        Map<Integer, List<C2335c>> mapM168732U0 = Collections.EMPTY_MAP;
        if (z6 && z5) {
            mapM168732U0 = mo15194k().m168732U0(this.f154453d);
        }
        Map<Integer, C2338d0> mapM168730T0 = mo15194k().m168730T0(this.f154453d);
        if (mapM168730T0.isEmpty()) {
            z3 = true;
        } else {
            HashSet hashSet3 = new HashSet(mapM168730T0.keySet());
            if (z2) {
                String str3 = this.f154453d;
                Map<Integer, List<Integer>> mapM168734V0 = mo15194k().m168734V0(this.f154453d);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(mapM168730T0);
                l01 l01Var = new l01();
                if (!mapM168730T0.isEmpty()) {
                    Iterator<Integer> it3 = mapM168730T0.keySet().iterator();
                    while (it3.hasNext()) {
                        Integer next = it3.next();
                        next.intValue();
                        C2338d0 c2338d0 = mapM168730T0.get(next);
                        List<Integer> list4 = mapM168734V0.get(next);
                        if (list4 == null || list4.isEmpty()) {
                            hashSet2 = hashSet3;
                            map2 = mapM168734V0;
                            it = it3;
                            l01Var.put(next, c2338d0);
                        } else {
                            hashSet2 = hashSet3;
                            List<Long> listM201880I = mo15192i().m201880I(c2338d0.m14171Y(), list4);
                            if (listM201880I.isEmpty()) {
                                hashSet3 = hashSet2;
                            } else {
                                C2338d0.a aVarM14181y = c2338d0.m14417t().m14180x().m14181y(listM201880I);
                                aVarM14181y.m14176B().m14177C(mo15192i().m201880I(c2338d0.m14173a0(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (C2377x c2377x : c2338d0.m14170X()) {
                                    Map<Integer, List<Integer>> map3 = mapM168734V0;
                                    Iterator<Integer> it4 = it3;
                                    if (!list4.contains(Integer.valueOf(c2377x.m14536h()))) {
                                        arrayList.add(c2377x);
                                    }
                                    mapM168734V0 = map3;
                                    it3 = it4;
                                }
                                map2 = mapM168734V0;
                                it = it3;
                                aVarM14181y.m14178v().m14179w(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (C2340e0 c2340e0 : c2338d0.m14172Z()) {
                                    if (!list4.contains(Integer.valueOf(c2340e0.m14200E()))) {
                                        arrayList2.add(c2340e0);
                                    }
                                }
                                aVarM14181y.m14182z().m14175A(arrayList2);
                                l01Var.put(next, (C2338d0) ((AbstractC2372u0) aVarM14181y.mo14423H()));
                            }
                        }
                        hashSet3 = hashSet2;
                        mapM168734V0 = map2;
                        it3 = it;
                    }
                }
                hashSet = hashSet3;
                z3 = true;
                map = l01Var;
            } else {
                hashSet = hashSet3;
                z3 = true;
                map = mapM168730T0;
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                Integer num = (Integer) it5.next();
                num.intValue();
                C2338d0 c2338d1 = map.get(num);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C2338d0 c2338d2 = c2338d1;
                l01 l01Var2 = new l01();
                if (c2338d2 != null && c2338d2.m14174h() != 0) {
                    Iterator<C2377x> it6 = c2338d2.m14170X().iterator();
                    while (it6.hasNext()) {
                        C2377x next2 = it6.next();
                        if (next2.m14535K()) {
                            l01Var2.put(Integer.valueOf(next2.m14536h()), next2.m14534I() ? Long.valueOf(next2.m14533D()) : null);
                        } else {
                            it6 = it6;
                        }
                        it6 = it6;
                        c2338d2 = c2338d2;
                    }
                }
                C2338d0 c2338d3 = c2338d2;
                l01 l01Var3 = new l01();
                if (c2338d3 != null && c2338d3.m14168I() != 0) {
                    Iterator<C2340e0> it7 = c2338d3.m14172Z().iterator();
                    while (it7.hasNext()) {
                        Iterator<C2340e0> it8 = it7;
                        C2340e0 next3 = it7.next();
                        if (next3.m14202L() && next3.m14203h() > 0) {
                            l01Var3.put(Integer.valueOf(next3.m14200E()), Long.valueOf(next3.m14199B(next3.m14203h() - 1)));
                        }
                        it7 = it8;
                        map = map;
                        it5 = it5;
                    }
                }
                Map<Integer, C2338d0> map4 = map;
                Iterator it9 = it5;
                if (c2338d3 != null) {
                    int i = 0;
                    while (i < (c2338d3.m14169M() << 6)) {
                        if (vmy0.m201868Y(c2338d3.m14173a0(), i)) {
                            z4 = z5;
                            zzj().m114562E().m153302c("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i));
                            bitSet2.set(i);
                            if (vmy0.m201868Y(c2338d3.m14171Y(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            z5 = z4;
                        } else {
                            z4 = z5;
                        }
                        l01Var2.remove(Integer.valueOf(i));
                        i++;
                        z5 = z4;
                    }
                }
                boolean z7 = z5;
                C2338d0 c2338d4 = mapM168730T0.get(num);
                if (z6 && z7 && (list3 = mapM168732U0.get(num)) != null && this.f154457h != null && this.f154456g != null) {
                    for (C2335c c2335c : list3) {
                        int iM13888E = c2335c.m13888E();
                        Map<Integer, List<C2335c>> map5 = mapM168732U0;
                        long jLongValue = this.f154457h.longValue() / 1000;
                        if (c2335c.m13893T()) {
                            jLongValue = this.f154456g.longValue() / 1000;
                        }
                        if (l01Var2.containsKey(Integer.valueOf(iM13888E))) {
                            l01Var2.put(Integer.valueOf(iM13888E), Long.valueOf(jLongValue));
                        }
                        if (l01Var3.containsKey(Integer.valueOf(iM13888E))) {
                            l01Var3.put(Integer.valueOf(iM13888E), Long.valueOf(jLongValue));
                        }
                        mapM168732U0 = map5;
                    }
                }
                this.f154455f.put(num, new zzy0(this, this.f154453d, c2338d4, bitSet, bitSet2, l01Var2, l01Var3));
                mapM168730T0 = mapM168730T0;
                z5 = z7;
                mapM168732U0 = mapM168732U0;
                map = map4;
                it5 = it9;
            }
        }
        if (!ziy0.m219953a() || !mo15139a().m98421B(null, whs0.f189243Z0)) {
            m174100w(list, z3);
            m174095v(list2);
            return m174096y();
        }
        m174100w(list, z);
        if (z) {
            return new ArrayList();
        }
        m174095v(list2);
        return m174096y();
    }

    /* JADX INFO: renamed from: u */
    public final zzy0 m174099u(Integer num) {
        if (this.f154455f.containsKey(num)) {
            return this.f154455f.get(num);
        }
        zzy0 zzy0Var = new zzy0(this, this.f154453d);
        this.f154455f.put(num, zzy0Var);
        return zzy0Var;
    }

    /* JADX INFO: renamed from: w */
    public final void m174100w(List<C2379y> list, boolean z) {
        pbs0 pbs0Var;
        tdr0 tdr0Var;
        if (list.isEmpty()) {
            return;
        }
        tdr0 tdr0Var2 = null;
        u4z0 u4z0Var = new u4z0(this);
        l01 l01Var = new l01();
        for (C2379y c2379y : list) {
            C2379y c2379yM194519a = u4z0Var.m194519a(this.f154453d, c2379y);
            if (c2379yM194519a != null) {
                opr0 opr0VarMo15194k = mo15194k();
                String str = this.f154453d;
                String strM14554X = c2379yM194519a.m14554X();
                pbs0 pbs0VarM168704F0 = opr0VarMo15194k.m168704F0(str, c2379y.m14554X());
                if (pbs0VarM168704F0 == null) {
                    opr0VarMo15194k.zzj().m114563F().m153302c("Event aggregate wasn't created during raw event logging. appId, event", d6x0.m114551p(str), opr0VarMo15194k.mo15141c().m208449c(strM14554X));
                    pbs0Var = new pbs0(str, c2379y.m14554X(), 1L, 1L, 1L, c2379y.m14553U(), 0L, null, null, null, null);
                } else {
                    pbs0Var = new pbs0(pbs0VarM168704F0.f151417a, pbs0VarM168704F0.f151418b, pbs0VarM168704F0.f151419c + 1, pbs0VarM168704F0.f151420d + 1, pbs0VarM168704F0.f151421e + 1, pbs0VarM168704F0.f151422f, pbs0VarM168704F0.f151423g, pbs0VarM168704F0.f151424h, pbs0VarM168704F0.f151425i, pbs0VarM168704F0.f151426j, pbs0VarM168704F0.f151427k);
                }
                mo15194k().m168735W(pbs0Var);
                if (ziy0.m219953a()) {
                    tdr0Var = null;
                    if (mo15139a().m98421B(null, whs0.f189243Z0) && z) {
                        tdr0Var2 = null;
                        l01Var = l01Var;
                    }
                    u4z0Var = u4z0Var;
                } else {
                    tdr0Var = null;
                }
                long j = pbs0Var.f151419c;
                String strM14554X2 = c2379yM194519a.m14554X();
                l01 l01Var2 = l01Var;
                Map<Integer, List<C2335c>> mapM168710I0 = (Map) l01Var2.get(strM14554X2);
                if (mapM168710I0 == null) {
                    mapM168710I0 = mo15194k().m168710I0(this.f154453d, strM14554X2);
                    l01Var2.put(strM14554X2, mapM168710I0);
                }
                for (Integer num : mapM168710I0.keySet()) {
                    int iIntValue = num.intValue();
                    if (this.f154454e.contains(num)) {
                        zzj().m114562E().m153301b("Skipping failed audience ID", num);
                    } else {
                        boolean z2 = true;
                        for (C2335c c2335c : mapM168710I0.get(num)) {
                            b3z0 b3z0Var = new b3z0(this, this.f154453d, iIntValue, c2335c);
                            boolean zM102383k = b3z0Var.m102383k(this.f154456g, this.f154457h, c2379yM194519a, j, pbs0Var, m174101x(iIntValue, c2335c.m13888E()));
                            if (!zM102383k) {
                                this.f154454e.add(num);
                                z2 = zM102383k;
                                break;
                            } else {
                                m174099u(num).m222295c(b3z0Var);
                                z2 = zM102383k;
                            }
                        }
                        if (!z2) {
                            this.f154454e.add(num);
                        }
                    }
                }
                tdr0 tdr0Var3 = tdr0Var;
                l01Var = l01Var2;
                tdr0Var2 = tdr0Var3;
                u4z0Var = u4z0Var;
            } else {
                l01Var = l01Var;
                tdr0Var2 = tdr0Var2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m174101x(int i, int i2) {
        zzy0 zzy0Var = this.f154455f.get(Integer.valueOf(i));
        if (zzy0Var == null) {
            return false;
        }
        return zzy0Var.f206757d.get(i2);
    }
}
