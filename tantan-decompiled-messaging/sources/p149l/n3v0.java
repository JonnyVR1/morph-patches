package p149l;

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
public final class n3v0 {

    /* JADX INFO: renamed from: c */
    public final String f137024c;

    /* JADX INFO: renamed from: d */
    public nxv0 f137025d = null;

    /* JADX INFO: renamed from: e */
    public kxv0 f137026e = null;

    /* JADX INFO: renamed from: f */
    public zzu f137027f = null;

    /* JADX INFO: renamed from: b */
    public final Map f137023b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a */
    public final List f137022a = Collections.synchronizedList(new ArrayList());

    public n3v0(String str) {
        this.f137024c = str;
    }

    /* JADX INFO: renamed from: j */
    public static String m157776j(kxv0 kxv0Var) {
        return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132394s3)).booleanValue() ? kxv0Var.f125216q0 : kxv0Var.f125227x;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final zzu m157777a() {
        return this.f137027f;
    }

    /* JADX INFO: renamed from: b */
    public final vwt0 m157778b() {
        return new vwt0(this.f137026e, "", this, this.f137025d, this.f137024c);
    }

    /* JADX INFO: renamed from: c */
    public final List m157779c() {
        return this.f137022a;
    }

    /* JADX INFO: renamed from: d */
    public final void m157780d(kxv0 kxv0Var) {
        m157786k(kxv0Var, this.f137022a.size());
    }

    /* JADX INFO: renamed from: e */
    public final void m157781e(kxv0 kxv0Var) {
        int iIndexOf = this.f137022a.indexOf(this.f137023b.get(m157776j(kxv0Var)));
        if (iIndexOf < 0 || iIndexOf >= this.f137023b.size()) {
            iIndexOf = this.f137022a.indexOf(this.f137027f);
        }
        if (iIndexOf < 0 || iIndexOf >= this.f137023b.size()) {
            return;
        }
        this.f137027f = (zzu) this.f137022a.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f137022a.size()) {
                return;
            }
            zzu zzuVar = (zzu) this.f137022a.get(iIndexOf);
            zzuVar.zzb = 0L;
            zzuVar.zzc = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m157782f(kxv0 kxv0Var, long j, @Nullable zze zzeVar) {
        m157787l(kxv0Var, j, zzeVar, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m157783g(kxv0 kxv0Var, long j, @Nullable zze zzeVar) {
        m157787l(kxv0Var, j, null, true);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m157784h(String str, List list) {
        try {
            if (this.f137023b.containsKey(str)) {
                int iIndexOf = this.f137022a.indexOf((zzu) this.f137023b.get(str));
                try {
                    this.f137022a.remove(iIndexOf);
                } catch (IndexOutOfBoundsException e) {
                    vny0.m199079q().m212290w(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.f137023b.remove(str);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m157786k((kxv0) it.next(), iIndexOf);
                    iIndexOf++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m157785i(nxv0 nxv0Var) {
        this.f137025d = nxv0Var;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m157786k(kxv0 kxv0Var, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.f137023b;
        String strM157776j = m157776j(kxv0Var);
        if (map.containsKey(strM157776j)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = kxv0Var.f125226w.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, kxv0Var.f125226w.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132019O6)).booleanValue()) {
            str = kxv0Var.f125163G;
            str2 = kxv0Var.f125164H;
            str3 = kxv0Var.f125165I;
            str4 = kxv0Var.f125166J;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        zzu zzuVar = new zzu(kxv0Var.f125162F, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.f137022a.add(i, zzuVar);
        } catch (IndexOutOfBoundsException e) {
            vny0.m199079q().m212290w(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f137023b.put(strM157776j, zzuVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m157787l(kxv0 kxv0Var, long j, @Nullable zze zzeVar, boolean z) {
        Map map = this.f137023b;
        String strM157776j = m157776j(kxv0Var);
        if (map.containsKey(strM157776j)) {
            if (this.f137026e == null) {
                this.f137026e = kxv0Var;
            }
            zzu zzuVar = (zzu) this.f137023b.get(strM157776j);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132031P6)).booleanValue() && z) {
                this.f137027f = zzuVar;
            }
        }
    }
}
