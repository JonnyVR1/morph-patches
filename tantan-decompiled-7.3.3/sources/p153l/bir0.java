package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.GuideBoostMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class bir0 implements eor0, ewr0, Iterable<ewr0> {

    /* JADX INFO: renamed from: a */
    public final SortedMap<Integer, ewr0> f76907a;

    /* JADX INFO: renamed from: b */
    public final Map<String, ewr0> f76908b;

    public bir0(List<ewr0> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m104504p(i, list.get(i));
            }
        }
    }

    @Override // p153l.eor0
    /* JADX INFO: renamed from: a */
    public final void mo100512a(String str, ewr0 ewr0Var) {
        Map<String, ewr0> map = this.f76908b;
        if (ewr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ewr0Var);
        }
    }

    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || GuideBoostMode.pop.equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? qes0.m176266c(str, this, gix0Var, list) : hsr0.m137036b(this, new vyr0(str), gix0Var, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bir0)) {
            return false;
        }
        bir0 bir0Var = (bir0) obj;
        if (m104501j() != bir0Var.m104501j()) {
            return false;
        }
        if (this.f76907a.isEmpty()) {
            return bir0Var.f76907a.isEmpty();
        }
        for (int iIntValue = this.f76907a.firstKey().intValue(); iIntValue <= this.f76907a.lastKey().intValue(); iIntValue++) {
            if (!m104498g(iIntValue).equals(bir0Var.m104498g(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m104497f() {
        return this.f76907a.size();
    }

    /* JADX INFO: renamed from: g */
    public final ewr0 m104498g(int i) {
        ewr0 ewr0Var;
        if (i < m104501j()) {
            return (!m104505r(i) || (ewr0Var = this.f76907a.get(Integer.valueOf(i))) == null) ? ewr0.f96187w0 : ewr0Var;
        }
        kym.m151996a("Attempting to get element outside of current array");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m104499h(int i, ewr0 ewr0Var) {
        if (i < 0) {
            za50.m219101a("Invalid value index: ", i);
            return;
        }
        if (i >= m104501j()) {
            m104504p(i, ewr0Var);
            return;
        }
        for (int iIntValue = this.f76907a.lastKey().intValue(); iIntValue >= i; iIntValue--) {
            ewr0 ewr0Var2 = this.f76907a.get(Integer.valueOf(iIntValue));
            if (ewr0Var2 != null) {
                m104504p(iIntValue + 1, ewr0Var2);
                this.f76907a.remove(Integer.valueOf(iIntValue));
            }
        }
        m104504p(i, ewr0Var);
    }

    public final int hashCode() {
        return this.f76907a.hashCode() * 31;
    }

    /* JADX INFO: renamed from: i */
    public final void m104500i(ewr0 ewr0Var) {
        m104504p(m104501j(), ewr0Var);
    }

    @Override // java.lang.Iterable
    public final Iterator<ewr0> iterator() {
        return new ekr0(this);
    }

    /* JADX INFO: renamed from: j */
    public final int m104501j() {
        if (this.f76907a.isEmpty()) {
            return 0;
        }
        return this.f76907a.lastKey().intValue() + 1;
    }

    /* JADX INFO: renamed from: l */
    public final String m104502l(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f76907a.isEmpty()) {
            for (int i = 0; i < m104501j(); i++) {
                ewr0 ewr0VarM104498g = m104498g(i);
                sb.append(str);
                if (!(ewr0VarM104498g instanceof w4s0) && !(ewr0VarM104498g instanceof str0)) {
                    sb.append(ewr0VarM104498g.zzf());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public final void m104503o(int i) {
        int iIntValue = this.f76907a.lastKey().intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        this.f76907a.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            if (this.f76907a.containsKey(Integer.valueOf(i2)) || i2 < 0) {
                return;
            }
            this.f76907a.put(Integer.valueOf(i2), ewr0.f96187w0);
            return;
        }
        while (true) {
            i++;
            if (i > this.f76907a.lastKey().intValue()) {
                return;
            }
            ewr0 ewr0Var = this.f76907a.get(Integer.valueOf(i));
            if (ewr0Var != null) {
                this.f76907a.put(Integer.valueOf(i - 1), ewr0Var);
                this.f76907a.remove(Integer.valueOf(i));
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* JADX INFO: renamed from: p */
    public final void m104504p(int i, ewr0 ewr0Var) {
        if (i > 32468) {
            wtq0.m207906a("Array too large");
            return;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        SortedMap<Integer, ewr0> sortedMap = this.f76907a;
        if (ewr0Var == null) {
            sortedMap.remove(Integer.valueOf(i));
        } else {
            sortedMap.put(Integer.valueOf(i), ewr0Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m104505r(int i) {
        if (i >= 0 && i <= this.f76907a.lastKey().intValue()) {
            return this.f76907a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    /* JADX INFO: renamed from: s */
    public final Iterator<Integer> m104506s() {
        return this.f76907a.keySet().iterator();
    }

    public final String toString() {
        return m104502l(Constants.SEPARATOR_COMMA);
    }

    /* JADX INFO: renamed from: v */
    public final List<ewr0> m104507v() {
        ArrayList arrayList = new ArrayList(m104501j());
        for (int i = 0; i < m104501j(); i++) {
            arrayList.add(m104498g(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public final void m104508w() {
        this.f76907a.clear();
    }

    @Override // p153l.eor0
    public final ewr0 zza(String str) {
        ewr0 ewr0Var;
        if ("length".equals(str)) {
            return new glr0(Double.valueOf(m104501j()));
        }
        return (!zzc(str) || (ewr0Var = this.f76908b.get(str)) == null) ? ewr0.f96187w0 : ewr0Var;
    }

    @Override // p153l.ewr0
    public final ewr0 zzc() {
        bir0 bir0Var = new bir0();
        for (Map.Entry<Integer, ewr0> entry : this.f76907a.entrySet()) {
            boolean z = entry.getValue() instanceof eor0;
            SortedMap<Integer, ewr0> sortedMap = bir0Var.f76907a;
            if (z) {
                sortedMap.put(entry.getKey(), entry.getValue());
            } else {
                sortedMap.put(entry.getKey(), entry.getValue().zzc());
            }
        }
        return bir0Var;
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // p153l.ewr0
    public final Double zze() {
        if (this.f76907a.size() == 1) {
            return m104498g(0).zze();
        }
        return this.f76907a.size() <= 0 ? Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Double.valueOf(Double.NaN);
    }

    @Override // p153l.ewr0
    public final String zzf() {
        return toString();
    }

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return new pgr0(this, this.f76907a.keySet().iterator(), this.f76908b.keySet().iterator());
    }

    public bir0() {
        this.f76907a = new TreeMap();
        this.f76908b = new TreeMap();
    }

    public bir0(ewr0... ewr0VarArr) {
        this((List<ewr0>) Arrays.asList(ewr0VarArr));
    }

    @Override // p153l.eor0
    public final boolean zzc(String str) {
        return "length".equals(str) || this.f76908b.containsKey(str);
    }
}
