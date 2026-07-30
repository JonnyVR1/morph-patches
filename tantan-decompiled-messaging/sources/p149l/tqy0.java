package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2315d0;
import com.google.android.gms.internal.measurement.C2317e0;
import com.google.android.gms.internal.measurement.C2352w;
import com.google.android.gms.internal.measurement.C2354x;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tqy0 {

    /* JADX INFO: renamed from: a */
    public String f171649a;

    /* JADX INFO: renamed from: b */
    public boolean f171650b;

    /* JADX INFO: renamed from: c */
    public C2315d0 f171651c;

    /* JADX INFO: renamed from: d */
    public BitSet f171652d;

    /* JADX INFO: renamed from: e */
    public BitSet f171653e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, Long> f171654f;

    /* JADX INFO: renamed from: g */
    public Map<Integer, List<Long>> f171655g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ jny0 f171656h;

    public tqy0(jny0 jny0Var, String str, C2315d0 c2315d0, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f171656h = jny0Var;
        this.f171649a = str;
        this.f171652d = bitSet;
        this.f171653e = bitSet2;
        this.f171654f = map;
        this.f171655g = new e01();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f171655g.put(num, arrayList);
            }
        }
        this.f171650b = false;
        this.f171651c = c2315d0;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final C2352w m190199a(int i) {
        ArrayList arrayList;
        List list;
        C2352w.a aVarM14417E = C2352w.m14417E();
        aVarM14417E.m14427v(i);
        aVarM14417E.m14430y(this.f171650b);
        C2315d0 c2315d0 = this.f171651c;
        if (c2315d0 != null) {
            aVarM14417E.m14429x(c2315d0);
        }
        C2315d0.a aVarM14123C = C2315d0.m14110U().m14127y(pdy0.m168453H(this.f171652d)).m14123C(pdy0.m168453H(this.f171653e));
        if (this.f171654f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f171654f.size());
            for (Integer num : this.f171654f.keySet()) {
                int iIntValue = num.intValue();
                Long l2 = this.f171654f.get(num);
                if (l2 != null) {
                    arrayList.add((C2354x) ((AbstractC2349u0) C2354x.m14477E().m14483v(iIntValue).m14484w(l2.longValue()).mo14369H()));
                }
            }
        }
        if (arrayList != null) {
            aVarM14123C.m14125w(arrayList);
        }
        if (this.f171655g == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(this.f171655g.size());
            for (Integer num2 : this.f171655g.keySet()) {
                C2317e0.a aVarM14150v = C2317e0.m14143G().m14150v(num2.intValue());
                List<Long> list2 = this.f171655g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    aVarM14150v.m14151w(list2);
                }
                arrayList2.add((C2317e0) ((AbstractC2349u0) aVarM14150v.mo14369H()));
            }
            list = arrayList2;
        }
        aVarM14123C.m14121A(list);
        aVarM14417E.m14428w(aVarM14123C);
        return (C2352w) ((AbstractC2349u0) aVarM14417E.mo14369H());
    }

    /* JADX INFO: renamed from: c */
    public final void m190200c(@NonNull k1r0 k1r0Var) {
        int iMo144228a = k1r0Var.mo144228a();
        Boolean bool = k1r0Var.f120644c;
        if (bool != null) {
            this.f171653e.set(iMo144228a, bool.booleanValue());
        }
        Boolean bool2 = k1r0Var.f120645d;
        if (bool2 != null) {
            this.f171652d.set(iMo144228a, bool2.booleanValue());
        }
        if (k1r0Var.f120646e != null) {
            Long l2 = this.f171654f.get(Integer.valueOf(iMo144228a));
            long jLongValue = k1r0Var.f120646e.longValue() / 1000;
            if (l2 == null || jLongValue > l2.longValue()) {
                this.f171654f.put(Integer.valueOf(iMo144228a), Long.valueOf(jLongValue));
            }
        }
        if (k1r0Var.f120647f != null) {
            List<Long> arrayList = this.f171655g.get(Integer.valueOf(iMo144228a));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f171655g.put(Integer.valueOf(iMo144228a), arrayList);
            }
            if (k1r0Var.mo144230j()) {
                arrayList.clear();
            }
            if (lcy0.m149371a() && this.f171656h.mo15085a().m192629B(this.f171649a, q8s0.f153314q0) && k1r0Var.mo144229i()) {
                arrayList.clear();
            }
            if (!lcy0.m149371a() || !this.f171656h.mo15085a().m192629B(this.f171649a, q8s0.f153314q0)) {
                arrayList.add(Long.valueOf(k1r0Var.f120647f.longValue() / 1000));
                return;
            }
            long jLongValue2 = k1r0Var.f120647f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public tqy0(jny0 jny0Var, String str) {
        this.f171656h = jny0Var;
        this.f171649a = str;
        this.f171650b = true;
        this.f171652d = new BitSet();
        this.f171653e = new BitSet();
        this.f171654f = new e01();
        this.f171655g = new e01();
    }
}
