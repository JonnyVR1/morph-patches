package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2338d0;
import com.google.android.gms.internal.measurement.C2340e0;
import com.google.android.gms.internal.measurement.C2375w;
import com.google.android.gms.internal.measurement.C2377x;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zzy0 {

    /* JADX INFO: renamed from: a */
    public String f206754a;

    /* JADX INFO: renamed from: b */
    public boolean f206755b;

    /* JADX INFO: renamed from: c */
    public C2338d0 f206756c;

    /* JADX INFO: renamed from: d */
    public BitSet f206757d;

    /* JADX INFO: renamed from: e */
    public BitSet f206758e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, Long> f206759f;

    /* JADX INFO: renamed from: g */
    public Map<Integer, List<Long>> f206760g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ pwy0 f206761h;

    public zzy0(pwy0 pwy0Var, String str, C2338d0 c2338d0, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f206761h = pwy0Var;
        this.f206754a = str;
        this.f206757d = bitSet;
        this.f206758e = bitSet2;
        this.f206759f = map;
        this.f206760g = new l01();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f206760g.put(num, arrayList);
            }
        }
        this.f206755b = false;
        this.f206756c = c2338d0;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final C2375w m222294a(int i) {
        ArrayList arrayList;
        List list;
        C2375w.a aVarM14471E = C2375w.m14471E();
        aVarM14471E.m14481v(i);
        aVarM14471E.m14484y(this.f206755b);
        C2338d0 c2338d0 = this.f206756c;
        if (c2338d0 != null) {
            aVarM14471E.m14483x(c2338d0);
        }
        C2338d0.a aVarM14177C = C2338d0.m14164U().m14181y(vmy0.m201858H(this.f206757d)).m14177C(vmy0.m201858H(this.f206758e));
        if (this.f206759f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f206759f.size());
            for (Integer num : this.f206759f.keySet()) {
                int iIntValue = num.intValue();
                Long l2 = this.f206759f.get(num);
                if (l2 != null) {
                    arrayList.add((C2377x) ((AbstractC2372u0) C2377x.m14531E().m14537v(iIntValue).m14538w(l2.longValue()).mo14423H()));
                }
            }
        }
        if (arrayList != null) {
            aVarM14177C.m14179w(arrayList);
        }
        if (this.f206760g == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(this.f206760g.size());
            for (Integer num2 : this.f206760g.keySet()) {
                C2340e0.a aVarM14204v = C2340e0.m14197G().m14204v(num2.intValue());
                List<Long> list2 = this.f206760g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    aVarM14204v.m14205w(list2);
                }
                arrayList2.add((C2340e0) ((AbstractC2372u0) aVarM14204v.mo14423H()));
            }
            list = arrayList2;
        }
        aVarM14177C.m14175A(list);
        aVarM14471E.m14482w(aVarM14177C);
        return (C2375w) ((AbstractC2372u0) aVarM14471E.mo14423H());
    }

    /* JADX INFO: renamed from: c */
    public final void m222295c(@NonNull qar0 qar0Var) {
        int iMo102380a = qar0Var.mo102380a();
        Boolean bool = qar0Var.f156411c;
        if (bool != null) {
            this.f206758e.set(iMo102380a, bool.booleanValue());
        }
        Boolean bool2 = qar0Var.f156412d;
        if (bool2 != null) {
            this.f206757d.set(iMo102380a, bool2.booleanValue());
        }
        if (qar0Var.f156413e != null) {
            Long l2 = this.f206759f.get(Integer.valueOf(iMo102380a));
            long jLongValue = qar0Var.f156413e.longValue() / 1000;
            if (l2 == null || jLongValue > l2.longValue()) {
                this.f206759f.put(Integer.valueOf(iMo102380a), Long.valueOf(jLongValue));
            }
        }
        if (qar0Var.f156414f != null) {
            List<Long> arrayList = this.f206760g.get(Integer.valueOf(iMo102380a));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f206760g.put(Integer.valueOf(iMo102380a), arrayList);
            }
            if (qar0Var.mo102382j()) {
                arrayList.clear();
            }
            if (rly0.m182036a() && this.f206761h.mo15139a().m98421B(this.f206754a, whs0.f189290q0) && qar0Var.mo102381i()) {
                arrayList.clear();
            }
            if (!rly0.m182036a() || !this.f206761h.mo15139a().m98421B(this.f206754a, whs0.f189290q0)) {
                arrayList.add(Long.valueOf(qar0Var.f156414f.longValue() / 1000));
                return;
            }
            long jLongValue2 = qar0Var.f156414f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public zzy0(pwy0 pwy0Var, String str) {
        this.f206761h = pwy0Var;
        this.f206754a = str;
        this.f206755b = true;
        this.f206757d = new BitSet();
        this.f206758e = new BitSet();
        this.f206759f = new l01();
        this.f206760g = new l01();
    }
}
