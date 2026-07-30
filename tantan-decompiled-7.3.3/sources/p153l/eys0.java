package p153l;

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
public final class eys0 implements te20 {

    /* JADX INFO: renamed from: a */
    public final Date f96496a;

    /* JADX INFO: renamed from: b */
    public final int f96497b;

    /* JADX INFO: renamed from: c */
    public final Set f96498c;

    /* JADX INFO: renamed from: d */
    public final boolean f96499d;

    /* JADX INFO: renamed from: e */
    public final Location f96500e;

    /* JADX INFO: renamed from: f */
    public final int f96501f;

    /* JADX INFO: renamed from: g */
    public final zzbjb f96502g;

    /* JADX INFO: renamed from: i */
    public final boolean f96504i;

    /* JADX INFO: renamed from: k */
    public final String f96506k;

    /* JADX INFO: renamed from: h */
    public final List f96503h = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final Map f96505j = new HashMap();

    public eys0(@Nullable Date date, int i, @Nullable Set set, @Nullable Location location, boolean z, int i2, zzbjb zzbjbVar, List list, boolean z2, int i3, String str) {
        this.f96496a = date;
        this.f96497b = i;
        this.f96498c = set;
        this.f96500e = location;
        this.f96499d = z;
        this.f96501f = i2;
        this.f96502g = zzbjbVar;
        this.f96504i = z2;
        this.f96506k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f96505j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f96505j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f96503h.add(str2);
                }
            }
        }
    }

    @Override // p153l.u7y
    /* JADX INFO: renamed from: a */
    public final int mo123242a() {
        return this.f96501f;
    }

    @Override // p153l.u7y
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final boolean mo123243b() {
        return this.f96504i;
    }

    @Override // p153l.u7y
    /* JADX INFO: renamed from: c */
    public final Set<String> mo123244c() {
        return this.f96498c;
    }

    @Override // p153l.te20
    @NonNull
    /* JADX INFO: renamed from: d */
    public final qd20 mo123245d() {
        return zzbjb.m13601g(this.f96502g);
    }

    @Override // p153l.u7y
    /* JADX INFO: renamed from: e */
    public final boolean mo123246e() {
        return this.f96499d;
    }

    @Override // p153l.te20
    /* JADX INFO: renamed from: f */
    public final pd20 mo123247f() {
        pd20.C19353a c19353a = new pd20.C19353a();
        zzbjb zzbjbVar = this.f96502g;
        if (zzbjbVar == null) {
            return c19353a.m171774a();
        }
        int i = zzbjbVar.zza;
        if (i == 2) {
            c19353a.m171775b(zzbjbVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    c19353a.m171778e(zzbjbVar.zzg);
                    c19353a.m171777d(zzbjbVar.zzh);
                }
            }
            zzfk zzfkVar = zzbjbVar.zzf;
            if (zzfkVar != null) {
                c19353a.m171781h(new kfl0(zzfkVar));
            }
            c19353a.m171775b(zzbjbVar.zze);
        }
        c19353a.m171780g(zzbjbVar.zzb);
        c19353a.m171776c(zzbjbVar.zzc);
        c19353a.m171779f(zzbjbVar.zzd);
        return c19353a.m171774a();
    }

    @Override // p153l.te20
    /* JADX INFO: renamed from: g */
    public final boolean mo123248g() {
        return this.f96503h.contains(Constants.VIA_SHARE_TYPE_INFO);
    }

    @Override // p153l.te20
    public final Map zza() {
        return this.f96505j;
    }

    @Override // p153l.te20
    public final boolean zzb() {
        return this.f96503h.contains("3");
    }
}
