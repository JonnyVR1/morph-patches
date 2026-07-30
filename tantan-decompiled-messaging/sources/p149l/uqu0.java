package p149l;

import androidx.annotation.GuardedBy;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class uqu0 {

    /* JADX INFO: renamed from: a */
    public final fqu0 f177779a;

    /* JADX INFO: renamed from: b */
    public final rku0 f177780b;

    /* JADX INFO: renamed from: c */
    public final Object f177781c = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final List f177782d = new ArrayList();

    /* JADX INFO: renamed from: e */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f177783e;

    public uqu0(fqu0 fqu0Var, rku0 rku0Var) {
        this.f177779a = fqu0Var;
        this.f177780b = rku0Var;
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m195014a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f177781c) {
            try {
                if (!this.f177783e) {
                    if (!this.f177779a.m122765t()) {
                        m195015c();
                        return jSONArray;
                    }
                    m195016d(this.f177779a.m122756g());
                }
                Iterator it = this.f177782d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((tqu0) it.next()).m190162a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m195015c() {
        this.f177779a.m122764s(new squ0(this));
    }

    /* JADX INFO: renamed from: d */
    public final void m195016d(List list) {
        qku0 qku0VarM179765a;
        qku0 qku0VarM179765a2;
        zzbvg zzbvgVar;
        synchronized (this.f177781c) {
            try {
                if (this.f177783e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbpd zzbpdVar = (zzbpd) it.next();
                    String string = (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132283j9)).booleanValue() || (qku0VarM179765a2 = this.f177780b.m179765a(zzbpdVar.zza)) == null || (zzbvgVar = qku0VarM179765a2.f155172c) == null) ? "" : zzbvgVar.toString();
                    String str = string;
                    boolean z = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132296k9)).booleanValue() && (qku0VarM179765a = this.f177780b.m179765a(zzbpdVar.zza)) != null && qku0VarM179765a.f155173d;
                    List list2 = this.f177782d;
                    String str2 = zzbpdVar.zza;
                    list2.add(new tqu0(str2, str, this.f177780b.m179767c(str2), zzbpdVar.zzb ? 1 : 0, zzbpdVar.zzd, zzbpdVar.zzc, z));
                }
                this.f177783e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
