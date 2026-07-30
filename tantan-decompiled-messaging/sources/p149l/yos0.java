package p149l;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.internal.ads.zzbjb;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class yos0 implements l620 {

    /* JADX INFO: renamed from: a */
    public final Date f199348a;

    /* JADX INFO: renamed from: b */
    public final int f199349b;

    /* JADX INFO: renamed from: c */
    public final Set f199350c;

    /* JADX INFO: renamed from: d */
    public final boolean f199351d;

    /* JADX INFO: renamed from: e */
    public final Location f199352e;

    /* JADX INFO: renamed from: f */
    public final int f199353f;

    /* JADX INFO: renamed from: g */
    public final zzbjb f199354g;

    /* JADX INFO: renamed from: i */
    public final boolean f199356i;

    /* JADX INFO: renamed from: k */
    public final String f199358k;

    /* JADX INFO: renamed from: h */
    public final List f199355h = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final Map f199357j = new HashMap();

    public yos0(@Nullable Date date, int i, @Nullable Set set, @Nullable Location location, boolean z, int i2, zzbjb zzbjbVar, List list, boolean z2, int i3, String str) {
        this.f199348a = date;
        this.f199349b = i;
        this.f199350c = set;
        this.f199352e = location;
        this.f199351d = z;
        this.f199353f = i2;
        this.f199354g = zzbjbVar;
        this.f199356i = z2;
        this.f199358k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f199357j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f199357j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f199355h.add(str2);
                }
            }
        }
    }

    @Override // p149l.xyx
    /* JADX INFO: renamed from: a */
    public final int mo160418a() {
        return this.f199353f;
    }

    @Override // p149l.xyx
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final boolean mo160419b() {
        return this.f199356i;
    }

    @Override // p149l.xyx
    /* JADX INFO: renamed from: c */
    public final Set<String> mo160420c() {
        return this.f199350c;
    }

    @Override // p149l.l620
    @NonNull
    /* JADX INFO: renamed from: d */
    public final i520 mo148694d() {
        return zzbjb.m13547g(this.f199354g);
    }

    @Override // p149l.xyx
    /* JADX INFO: renamed from: e */
    public final boolean mo160421e() {
        return this.f199351d;
    }

    @Override // p149l.l620
    /* JADX INFO: renamed from: f */
    public final h520 mo148695f() {
        h520.C17226a c17226a = new h520.C17226a();
        zzbjb zzbjbVar = this.f199354g;
        if (zzbjbVar == null) {
            return c17226a.m129366a();
        }
        int i = zzbjbVar.zza;
        if (i == 2) {
            c17226a.m129367b(zzbjbVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    c17226a.m129370e(zzbjbVar.zzg);
                    c17226a.m129369d(zzbjbVar.zzh);
                }
            }
            zzfk zzfkVar = zzbjbVar.zzf;
            if (zzfkVar != null) {
                c17226a.m129373h(new g6l0(zzfkVar));
            }
            c17226a.m129367b(zzbjbVar.zze);
        }
        c17226a.m129372g(zzbjbVar.zzb);
        c17226a.m129368c(zzbjbVar.zzc);
        c17226a.m129371f(zzbjbVar.zzd);
        return c17226a.m129366a();
    }

    @Override // p149l.l620
    /* JADX INFO: renamed from: g */
    public final boolean mo148696g() {
        return this.f199355h.contains(Constants.VIA_SHARE_TYPE_INFO);
    }

    @Override // p149l.l620
    public final Map zza() {
        return this.f199357j;
    }

    @Override // p149l.l620
    public final boolean zzb() {
        return this.f199355h.contains("3");
    }
}
