package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class tcv0 {

    /* JADX INFO: renamed from: c */
    public final String f173278c;

    /* JADX INFO: renamed from: d */
    public t6w0 f173279d = null;

    /* JADX INFO: renamed from: e */
    public q6w0 f173280e = null;

    /* JADX INFO: renamed from: f */
    public zzu f173281f = null;

    /* JADX INFO: renamed from: b */
    public final Map f173277b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a */
    public final List f173276a = Collections.synchronizedList(new ArrayList());

    public tcv0(String str) {
        this.f173278c = str;
    }

    /* JADX INFO: renamed from: j */
    public static String m190508j(q6w0 q6w0Var) {
        return ((Boolean) jas0.m144075c().m176505a(sgs0.f168465s3)).booleanValue() ? q6w0Var.f155906q0 : q6w0Var.f155917x;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final zzu m190509a() {
        return this.f173281f;
    }

    /* JADX INFO: renamed from: b */
    public final b6u0 m190510b() {
        return new b6u0(this.f173280e, "", this, this.f173279d, this.f173278c);
    }

    /* JADX INFO: renamed from: c */
    public final List m190511c() {
        return this.f173276a;
    }

    /* JADX INFO: renamed from: d */
    public final void m190512d(q6w0 q6w0Var) {
        m190518k(q6w0Var, this.f173276a.size());
    }

    /* JADX INFO: renamed from: e */
    public final void m190513e(q6w0 q6w0Var) {
        int iIndexOf = this.f173276a.indexOf(this.f173277b.get(m190508j(q6w0Var)));
        if (iIndexOf < 0 || iIndexOf >= this.f173277b.size()) {
            iIndexOf = this.f173276a.indexOf(this.f173281f);
        }
        if (iIndexOf < 0 || iIndexOf >= this.f173277b.size()) {
            return;
        }
        this.f173281f = (zzu) this.f173276a.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f173276a.size()) {
                return;
            }
            zzu zzuVar = (zzu) this.f173276a.get(iIndexOf);
            zzuVar.zzb = 0L;
            zzuVar.zzc = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m190514f(q6w0 q6w0Var, long j, @Nullable zze zzeVar) {
        m190519l(q6w0Var, j, zzeVar, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m190515g(q6w0 q6w0Var, long j, @Nullable zze zzeVar) {
        m190519l(q6w0Var, j, null, true);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m190516h(String str, List list) {
        if (this.f173277b.containsKey(str)) {
            int iIndexOf = this.f173276a.indexOf((zzu) this.f173277b.get(str));
            try {
                this.f173276a.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e) {
                bxy0.m106933q().m120275w(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f173277b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m190518k((q6w0) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m190517i(t6w0 t6w0Var) {
        this.f173279d = t6w0Var;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m190518k(q6w0 q6w0Var, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.f173277b;
        String strM190508j = m190508j(q6w0Var);
        if (map.containsKey(strM190508j)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = q6w0Var.f155916w.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, q6w0Var.f155916w.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168090O6)).booleanValue()) {
            str = q6w0Var.f155853G;
            str2 = q6w0Var.f155854H;
            str3 = q6w0Var.f155855I;
            str4 = q6w0Var.f155856J;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        zzu zzuVar = new zzu(q6w0Var.f155852F, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.f173276a.add(i, zzuVar);
        } catch (IndexOutOfBoundsException e) {
            bxy0.m106933q().m120275w(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f173277b.put(strM190508j, zzuVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m190519l(q6w0 q6w0Var, long j, @Nullable zze zzeVar, boolean z) {
        Map map = this.f173277b;
        String strM190508j = m190508j(q6w0Var);
        if (map.containsKey(strM190508j)) {
            if (this.f173280e == null) {
                this.f173280e = q6w0Var;
            }
            zzu zzuVar = (zzu) this.f173277b.get(strM190508j);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168102P6)).booleanValue() && z) {
                this.f173281f = zzuVar;
            }
        }
    }
}
