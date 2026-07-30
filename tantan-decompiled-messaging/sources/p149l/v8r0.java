package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.GuideBoostMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class v8r0 implements yer0, ymr0, Iterable<ymr0> {

    /* JADX INFO: renamed from: a */
    public final SortedMap<Integer, ymr0> f180582a;

    /* JADX INFO: renamed from: b */
    public final Map<String, ymr0> f180583b;

    public v8r0(List<ymr0> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m197500p(i, list.get(i));
            }
        }
    }

    @Override // p149l.yer0
    /* JADX INFO: renamed from: a */
    public final void mo126000a(String str, ymr0 ymr0Var) {
        Map<String, ymr0> map = this.f180583b;
        if (ymr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ymr0Var);
        }
    }

    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || GuideBoostMode.pop.equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? k5s0.m144545c(str, this, a9x0Var, list) : bjr0.m102227b(this, new ppr0(str), a9x0Var, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v8r0)) {
            return false;
        }
        v8r0 v8r0Var = (v8r0) obj;
        if (m197497j() != v8r0Var.m197497j()) {
            return false;
        }
        if (this.f180582a.isEmpty()) {
            return v8r0Var.f180582a.isEmpty();
        }
        for (int iIntValue = this.f180582a.firstKey().intValue(); iIntValue <= this.f180582a.lastKey().intValue(); iIntValue++) {
            if (!m197494g(iIntValue).equals(v8r0Var.m197494g(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m197493f() {
        return this.f180582a.size();
    }

    /* JADX INFO: renamed from: g */
    public final ymr0 m197494g(int i) {
        ymr0 ymr0Var;
        if (i < m197497j()) {
            return (!m197501r(i) || (ymr0Var = this.f180582a.get(Integer.valueOf(i))) == null) ? ymr0.f199051w0 : ymr0Var;
        }
        jwm.m143661a("Attempting to get element outside of current array");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m197495h(int i, ymr0 ymr0Var) {
        if (i < 0) {
            k250.m144273a("Invalid value index: ", i);
            return;
        }
        if (i >= m197497j()) {
            m197500p(i, ymr0Var);
            return;
        }
        for (int iIntValue = this.f180582a.lastKey().intValue(); iIntValue >= i; iIntValue--) {
            ymr0 ymr0Var2 = this.f180582a.get(Integer.valueOf(iIntValue));
            if (ymr0Var2 != null) {
                m197500p(iIntValue + 1, ymr0Var2);
                this.f180582a.remove(Integer.valueOf(iIntValue));
            }
        }
        m197500p(i, ymr0Var);
    }

    public final int hashCode() {
        return this.f180582a.hashCode() * 31;
    }

    /* JADX INFO: renamed from: i */
    public final void m197496i(ymr0 ymr0Var) {
        m197500p(m197497j(), ymr0Var);
    }

    @Override // java.lang.Iterable
    public final Iterator<ymr0> iterator() {
        return new yar0(this);
    }

    /* JADX INFO: renamed from: j */
    public final int m197497j() {
        if (this.f180582a.isEmpty()) {
            return 0;
        }
        return this.f180582a.lastKey().intValue() + 1;
    }

    /* JADX INFO: renamed from: l */
    public final String m197498l(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f180582a.isEmpty()) {
            for (int i = 0; i < m197497j(); i++) {
                ymr0 ymr0VarM197494g = m197494g(i);
                sb.append(str);
                if (!(ymr0VarM197494g instanceof qvr0) && !(ymr0VarM197494g instanceof mkr0)) {
                    sb.append(ymr0VarM197494g.zzf());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public final void m197499o(int i) {
        int iIntValue = this.f180582a.lastKey().intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        this.f180582a.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            if (this.f180582a.containsKey(Integer.valueOf(i2)) || i2 < 0) {
                return;
            }
            this.f180582a.put(Integer.valueOf(i2), ymr0.f199051w0);
            return;
        }
        while (true) {
            i++;
            if (i > this.f180582a.lastKey().intValue()) {
                return;
            }
            ymr0 ymr0Var = this.f180582a.get(Integer.valueOf(i));
            if (ymr0Var != null) {
                this.f180582a.put(Integer.valueOf(i - 1), ymr0Var);
                this.f180582a.remove(Integer.valueOf(i));
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* JADX INFO: renamed from: p */
    public final void m197500p(int i, ymr0 ymr0Var) {
        if (i > 32468) {
            qkq0.m175383a("Array too large");
            return;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        SortedMap<Integer, ymr0> sortedMap = this.f180582a;
        if (ymr0Var == null) {
            sortedMap.remove(Integer.valueOf(i));
        } else {
            sortedMap.put(Integer.valueOf(i), ymr0Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m197501r(int i) {
        if (i >= 0 && i <= this.f180582a.lastKey().intValue()) {
            return this.f180582a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    /* JADX INFO: renamed from: s */
    public final Iterator<Integer> m197502s() {
        return this.f180582a.keySet().iterator();
    }

    public final String toString() {
        return m197498l(Constants.SEPARATOR_COMMA);
    }

    /* JADX INFO: renamed from: v */
    public final List<ymr0> m197503v() {
        ArrayList arrayList = new ArrayList(m197497j());
        for (int i = 0; i < m197497j(); i++) {
            arrayList.add(m197494g(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public final void m197504w() {
        this.f180582a.clear();
    }

    @Override // p149l.yer0
    public final ymr0 zza(String str) {
        ymr0 ymr0Var;
        if ("length".equals(str)) {
            return new acr0(Double.valueOf(m197497j()));
        }
        return (!zzc(str) || (ymr0Var = this.f180583b.get(str)) == null) ? ymr0.f199051w0 : ymr0Var;
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        v8r0 v8r0Var = new v8r0();
        for (Map.Entry<Integer, ymr0> entry : this.f180582a.entrySet()) {
            boolean z = entry.getValue() instanceof yer0;
            SortedMap<Integer, ymr0> sortedMap = v8r0Var.f180582a;
            if (z) {
                sortedMap.put(entry.getKey(), entry.getValue());
            } else {
                sortedMap.put(entry.getKey(), entry.getValue().zzc());
            }
        }
        return v8r0Var;
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // p149l.ymr0
    public final Double zze() {
        if (this.f180582a.size() == 1) {
            return m197494g(0).zze();
        }
        return this.f180582a.size() <= 0 ? Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Double.valueOf(Double.NaN);
    }

    @Override // p149l.ymr0
    public final String zzf() {
        return toString();
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return new j7r0(this, this.f180582a.keySet().iterator(), this.f180583b.keySet().iterator());
    }

    public v8r0() {
        this.f180582a = new TreeMap();
        this.f180583b = new TreeMap();
    }

    public v8r0(ymr0... ymr0VarArr) {
        this((List<ymr0>) Arrays.asList(ymr0VarArr));
    }

    @Override // p149l.yer0
    public final boolean zzc(String str) {
        return "length".equals(str) || this.f180583b.containsKey(str);
    }
}
