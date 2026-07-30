package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ulr0 implements yer0, ymr0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, ymr0> f177089a = new HashMap();

    @Override // p149l.yer0
    /* JADX INFO: renamed from: a */
    public final void mo126000a(String str, ymr0 ymr0Var) {
        Map<String, ymr0> map = this.f177089a;
        if (ymr0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ymr0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m194260b() {
        return new ArrayList(this.f177089a.keySet());
    }

    /* JADX INFO: renamed from: c */
    public ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        return "toString".equals(str) ? new ppr0(toString()) : bjr0.m102227b(this, new ppr0(str), a9x0Var, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ulr0) {
            return this.f177089a.equals(((ulr0) obj).f177089a);
        }
        return false;
    }

    public int hashCode() {
        return this.f177089a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f177089a.isEmpty()) {
            for (String str : this.f177089a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f177089a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(Constants.SEPARATOR_COMMA));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // p149l.yer0
    public final ymr0 zza(String str) {
        return this.f177089a.containsKey(str) ? this.f177089a.get(str) : ymr0.f199051w0;
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        ulr0 ulr0Var = new ulr0();
        for (Map.Entry<String, ymr0> entry : this.f177089a.entrySet()) {
            boolean z = entry.getValue() instanceof yer0;
            Map<String, ymr0> map = ulr0Var.f177089a;
            if (z) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                map.put(entry.getKey(), entry.getValue().zzc());
            }
        }
        return ulr0Var;
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // p149l.ymr0
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p149l.ymr0
    public final String zzf() {
        return "[object Object]";
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return bjr0.m102226a(this.f177089a);
    }

    @Override // p149l.yer0
    public final boolean zzc(String str) {
        return this.f177089a.containsKey(str);
    }
}
