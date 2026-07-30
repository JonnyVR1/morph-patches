package p153l;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.C2118a0;
import com.google.android.gms.internal.ads.C2127b0;
import com.google.android.gms.internal.ads.C2311y;
import com.google.android.gms.internal.ads.C2319z;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class i9w0 implements h9w0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f113520a;

    /* JADX INFO: renamed from: b */
    public final zzfjc f113521b;

    /* JADX INFO: renamed from: c */
    public final k9w0 f113522c = new k9w0();

    public i9w0(zzfjc zzfjcVar) {
        this.f113520a = new ConcurrentHashMap(zzfjcVar.zzd);
        this.f113521b = zzfjcVar;
    }

    @Override // p153l.h9w0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final synchronized u9w0 mo134087a(v9w0 v9w0Var) {
        u9w0 u9w0VarM129638e;
        try {
            g9w0 g9w0Var = (g9w0) this.f113520a.get(v9w0Var);
            if (g9w0Var != null) {
                u9w0VarM129638e = g9w0Var.m129638e();
                if (u9w0VarM129638e == null) {
                    this.f113522c.m148897e();
                }
                iaw0 iaw0VarM129639f = g9w0Var.m129639f();
                if (u9w0VarM129638e != null) {
                    ads0 ads0VarM12581L = C2127b0.m12581L();
                    zcs0 zcs0VarM13533L = C2311y.m13533L();
                    zcs0VarM13533L.m219262t(2);
                    cds0 cds0VarM13560L = C2319z.m13560L();
                    cds0VarM13560L.m109238q(iaw0VarM129639f.f113629a);
                    cds0VarM13560L.m109239r(iaw0VarM129639f.f113630b);
                    zcs0VarM13533L.m219259q(cds0VarM13560L);
                    ads0VarM12581L.m97137q(zcs0VarM13533L);
                    u9w0VarM129638e.f178157a.zzb().m218167c().mo103637k0((C2127b0) ads0VarM12581L.m185950m());
                }
                m139156e();
            } else {
                this.f113522c.m148898f();
                m139156e();
                u9w0VarM129638e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return u9w0VarM129638e;
    }

    @Override // p153l.h9w0
    /* JADX INFO: renamed from: b */
    public final synchronized boolean mo134088b(v9w0 v9w0Var, u9w0 u9w0Var) {
        boolean zM129641h;
        try {
            g9w0 g9w0Var = (g9w0) this.f113520a.get(v9w0Var);
            u9w0Var.f178160d = bxy0.m106918b().currentTimeMillis();
            if (g9w0Var == null) {
                zzfjc zzfjcVar = this.f113521b;
                g9w0 g9w0Var2 = new g9w0(zzfjcVar.zzd, zzfjcVar.zze * 1000);
                if (this.f113520a.size() == this.f113521b.zzc) {
                    int i = this.f113521b.zzg;
                    int i2 = i - 1;
                    v9w0 v9w0Var2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long jM129636c = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.f113520a.entrySet()) {
                            if (((g9w0) entry.getValue()).m129636c() < jM129636c) {
                                jM129636c = ((g9w0) entry.getValue()).m129636c();
                                v9w0Var2 = (v9w0) entry.getKey();
                            }
                        }
                        if (v9w0Var2 != null) {
                            this.f113520a.remove(v9w0Var2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.f113520a.entrySet()) {
                            if (((g9w0) entry2.getValue()).m129637d() < jM129636c) {
                                jM129636c = ((g9w0) entry2.getValue()).m129637d();
                                v9w0Var2 = (v9w0) entry2.getKey();
                            }
                        }
                        if (v9w0Var2 != null) {
                            this.f113520a.remove(v9w0Var2);
                        }
                    } else if (i2 == 2) {
                        int iM129634a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.f113520a.entrySet()) {
                            if (((g9w0) entry3.getValue()).m129634a() < iM129634a) {
                                iM129634a = ((g9w0) entry3.getValue()).m129634a();
                                v9w0Var2 = (v9w0) entry3.getKey();
                            }
                        }
                        if (v9w0Var2 != null) {
                            this.f113520a.remove(v9w0Var2);
                        }
                    }
                    this.f113522c.m148899g();
                }
                this.f113520a.put(v9w0Var, g9w0Var2);
                this.f113522c.m148896d();
                g9w0Var = g9w0Var2;
            }
            zM129641h = g9w0Var.m129641h(u9w0Var);
            this.f113522c.m148895c();
            j9w0 j9w0VarM148893a = this.f113522c.m148893a();
            iaw0 iaw0VarM129639f = g9w0Var.m129639f();
            ads0 ads0VarM12581L = C2127b0.m12581L();
            zcs0 zcs0VarM13533L = C2311y.m13533L();
            zcs0VarM13533L.m219262t(2);
            dds0 dds0VarM12555L = C2118a0.m12555L();
            dds0VarM12555L.m115363q(j9w0VarM148893a.f118911a);
            dds0VarM12555L.m115364r(j9w0VarM148893a.f118912b);
            dds0VarM12555L.m115365s(iaw0VarM129639f.f113630b);
            zcs0VarM13533L.m219261s(dds0VarM12555L);
            ads0VarM12581L.m97137q(zcs0VarM13533L);
            u9w0Var.f178157a.zzb().m218167c().mo103636h0((C2127b0) ads0VarM12581L.m185950m());
            m139156e();
        } catch (Throwable th) {
            throw th;
        }
        return zM129641h;
    }

    @Override // p153l.h9w0
    /* JADX INFO: renamed from: c */
    public final synchronized boolean mo134089c(v9w0 v9w0Var) {
        g9w0 g9w0Var = (g9w0) this.f113520a.get(v9w0Var);
        if (g9w0Var == null) {
            return true;
        }
        return g9w0Var.m129635b() < this.f113521b.zzd;
    }

    @Override // p153l.h9w0
    @Deprecated
    /* JADX INFO: renamed from: d */
    public final v9w0 mo134090d(zzl zzlVar, String str, zzw zzwVar) {
        return new w9w0(zzlVar, str, new t4t0(this.f113521b.zza).m189308a().f177497k, this.f113521b.zzf, zzwVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m139156e() {
        Parcelable.Creator<zzfjc> creator = zzfjc.CREATOR;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168468s6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f113521b.zzb);
            sb.append(" PoolCollection");
            sb.append(this.f113522c.m148894b());
            int i = 0;
            for (Map.Entry entry : this.f113520a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((v9w0) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((g9w0) entry.getValue()).m129635b(); i2++) {
                    sb.append("[O]");
                }
                for (int iM129635b = ((g9w0) entry.getValue()).m129635b(); iM129635b < this.f113521b.zzd; iM129635b++) {
                    sb.append("[ ]");
                }
                sb.append(SignParameters.NEW_LINE);
                sb.append(((g9w0) entry.getValue()).m129640g());
                sb.append(SignParameters.NEW_LINE);
            }
            while (i < this.f113521b.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            dct0.m115293b(sb.toString());
        }
    }

    @Override // p153l.h9w0
    public final zzfjc zza() {
        return this.f113521b;
    }
}
