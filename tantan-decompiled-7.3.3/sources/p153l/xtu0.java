package p153l;

import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzfho;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xtu0 {

    /* JADX INFO: renamed from: a */
    public final Map f196244a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized wtu0 m213104a(String str) {
        return (wtu0) this.f196244a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final wtu0 m213105b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wtu0 wtu0VarM213104a = m213104a((String) it.next());
            if (wtu0VarM213104a != null) {
                return wtu0VarM213104a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m213106c(String str) {
        zzbvg zzbvgVar;
        wtu0 wtu0VarM213104a = m213104a(str);
        return (wtu0VarM213104a == null || (zzbvgVar = wtu0VarM213104a.f190815b) == null) ? "" : zzbvgVar.toString();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m213107d(String str, r8w0 r8w0Var) {
        zzbvg zzbvgVarM180264j;
        if (this.f196244a.containsKey(str)) {
            return;
        }
        zzbvg zzbvgVarM180265k = null;
        if (r8w0Var == null) {
            zzbvgVarM180264j = null;
        } else {
            try {
                zzbvgVarM180264j = r8w0Var.m180264j();
            } catch (zzfho unused) {
                zzbvgVarM180264j = null;
            }
        }
        if (r8w0Var != null) {
            try {
                zzbvgVarM180265k = r8w0Var.m180265k();
            } catch (zzfho unused2) {
            }
        }
        boolean z = true;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168367k9)).booleanValue()) {
            if (r8w0Var == null) {
                z = false;
            } else {
                try {
                    r8w0Var.m180257c();
                } catch (zzfho unused3) {
                    z = false;
                }
            }
        }
        this.f196244a.put(str, new wtu0(str, zzbvgVarM180264j, zzbvgVarM180265k, z));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m213108e(String str, hzs0 hzs0Var) {
        if (this.f196244a.containsKey(str)) {
            return;
        }
        try {
            this.f196244a.put(str, new wtu0(str, hzs0Var.zzf(), hzs0Var.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
