package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class avr0 implements eor0, ewr0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, ewr0> f73653a = new HashMap();

    @Override // p153l.eor0
    /* JADX INFO: renamed from: a */
    public final void mo100512a(String str, ewr0 ewr0Var) {
        Map<String, ewr0> map = this.f73653a;
        if (ewr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ewr0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m100513b() {
        return new ArrayList(this.f73653a.keySet());
    }

    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        return "toString".equals(str) ? new vyr0(toString()) : hsr0.m137036b(this, new vyr0(str), gix0Var, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof avr0) {
            return this.f73653a.equals(((avr0) obj).f73653a);
        }
        return false;
    }

    public int hashCode() {
        return this.f73653a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f73653a.isEmpty()) {
            for (String str : this.f73653a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f73653a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(Constants.SEPARATOR_COMMA));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // p153l.eor0
    public final ewr0 zza(String str) {
        return this.f73653a.containsKey(str) ? this.f73653a.get(str) : ewr0.f96187w0;
    }

    @Override // p153l.ewr0
    public final ewr0 zzc() {
        avr0 avr0Var = new avr0();
        for (Map.Entry<String, ewr0> entry : this.f73653a.entrySet()) {
            boolean z = entry.getValue() instanceof eor0;
            Map<String, ewr0> map = avr0Var.f73653a;
            if (z) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                map.put(entry.getKey(), entry.getValue().zzc());
            }
        }
        return avr0Var;
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // p153l.ewr0
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p153l.ewr0
    public final String zzf() {
        return "[object Object]";
    }

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return hsr0.m137035a(this.f73653a);
    }

    @Override // p153l.eor0
    public final boolean zzc(String str) {
        return this.f73653a.containsKey(str);
    }
}
