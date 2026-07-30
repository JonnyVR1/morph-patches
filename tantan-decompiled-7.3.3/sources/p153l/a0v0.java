package p153l;

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
public final class a0v0 {

    /* JADX INFO: renamed from: a */
    public final lzu0 f67755a;

    /* JADX INFO: renamed from: b */
    public final xtu0 f67756b;

    /* JADX INFO: renamed from: c */
    public final Object f67757c = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final List f67758d = new ArrayList();

    /* JADX INFO: renamed from: e */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f67759e;

    public a0v0(lzu0 lzu0Var, xtu0 xtu0Var) {
        this.f67755a = lzu0Var;
        this.f67756b = xtu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m95426a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f67757c) {
            try {
                if (!this.f67759e) {
                    if (!this.f67755a.m156496t()) {
                        m95427c();
                        return jSONArray;
                    }
                    m95428d(this.f67755a.m156487g());
                }
                Iterator it = this.f67758d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzu0) it.next()).m222289a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m95427c() {
        this.f67755a.m156495s(new yzu0(this));
    }

    /* JADX INFO: renamed from: d */
    public final void m95428d(List list) {
        wtu0 wtu0VarM213104a;
        wtu0 wtu0VarM213104a2;
        zzbvg zzbvgVar;
        synchronized (this.f67757c) {
            try {
                if (this.f67759e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbpd zzbpdVar = (zzbpd) it.next();
                    String string = (!((Boolean) jas0.m144075c().m176505a(sgs0.f168354j9)).booleanValue() || (wtu0VarM213104a2 = this.f67756b.m213104a(zzbpdVar.zza)) == null || (zzbvgVar = wtu0VarM213104a2.f190816c) == null) ? "" : zzbvgVar.toString();
                    String str = string;
                    boolean z = ((Boolean) jas0.m144075c().m176505a(sgs0.f168367k9)).booleanValue() && (wtu0VarM213104a = this.f67756b.m213104a(zzbpdVar.zza)) != null && wtu0VarM213104a.f190817d;
                    List list2 = this.f67758d;
                    String str2 = zzbpdVar.zza;
                    list2.add(new zzu0(str2, str, this.f67756b.m213106c(str2), zzbpdVar.zzb ? 1 : 0, zzbpdVar.zzd, zzbpdVar.zzc, z));
                }
                this.f67759e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
