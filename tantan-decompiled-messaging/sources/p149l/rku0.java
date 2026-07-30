package p149l;

import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzfho;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rku0 {

    /* JADX INFO: renamed from: a */
    public final Map f159885a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized qku0 m179765a(String str) {
        return (qku0) this.f159885a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final qku0 m179766b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qku0 qku0VarM179765a = m179765a((String) it.next());
            if (qku0VarM179765a != null) {
                return qku0VarM179765a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m179767c(String str) {
        zzbvg zzbvgVar;
        qku0 qku0VarM179765a = m179765a(str);
        return (qku0VarM179765a == null || (zzbvgVar = qku0VarM179765a.f155171b) == null) ? "" : zzbvgVar.toString();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m179768d(String str, lzv0 lzv0Var) {
        zzbvg zzbvgVarM152380j;
        if (this.f159885a.containsKey(str)) {
            return;
        }
        zzbvg zzbvgVarM152381k = null;
        if (lzv0Var == null) {
            zzbvgVarM152380j = null;
        } else {
            try {
                zzbvgVarM152380j = lzv0Var.m152380j();
            } catch (zzfho unused) {
                zzbvgVarM152380j = null;
            }
        }
        if (lzv0Var != null) {
            try {
                zzbvgVarM152381k = lzv0Var.m152381k();
            } catch (zzfho unused2) {
            }
        }
        boolean z = true;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132296k9)).booleanValue()) {
            if (lzv0Var == null) {
                z = false;
            } else {
                try {
                    lzv0Var.m152373c();
                } catch (zzfho unused3) {
                    z = false;
                }
            }
        }
        this.f159885a.put(str, new qku0(str, zzbvgVarM152380j, zzbvgVarM152381k, z));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m179769e(String str, bqs0 bqs0Var) {
        if (this.f159885a.containsKey(str)) {
            return;
        }
        try {
            this.f159885a.put(str, new qku0(str, bqs0Var.zzf(), bqs0Var.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
