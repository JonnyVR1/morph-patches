package p149l;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.C2095a0;
import com.google.android.gms.internal.ads.C2104b0;
import com.google.android.gms.internal.ads.C2288y;
import com.google.android.gms.internal.ads.C2296z;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class c0w0 implements b0w0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f78181a;

    /* JADX INFO: renamed from: b */
    public final zzfjc f78182b;

    /* JADX INFO: renamed from: c */
    public final e0w0 f78183c = new e0w0();

    public c0w0(zzfjc zzfjcVar) {
        this.f78181a = new ConcurrentHashMap(zzfjcVar.zzd);
        this.f78182b = zzfjcVar;
    }

    @Override // p149l.b0w0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final synchronized o0w0 mo99793a(p0w0 p0w0Var) {
        o0w0 o0w0VarM94490e;
        try {
            a0w0 a0w0Var = (a0w0) this.f78181a.get(p0w0Var);
            if (a0w0Var != null) {
                o0w0VarM94490e = a0w0Var.m94490e();
                if (o0w0VarM94490e == null) {
                    this.f78183c.m114348e();
                }
                c1w0 c1w0VarM94491f = a0w0Var.m94491f();
                if (o0w0VarM94490e != null) {
                    u3s0 u3s0VarM12527L = C2104b0.m12527L();
                    t3s0 t3s0VarM13479L = C2288y.m13479L();
                    t3s0VarM13479L.m187126t(2);
                    w3s0 w3s0VarM13506L = C2296z.m13506L();
                    w3s0VarM13506L.m201392q(c1w0VarM94491f.f78310a);
                    w3s0VarM13506L.m201393r(c1w0VarM94491f.f78311b);
                    t3s0VarM13479L.m187123q(w3s0VarM13506L);
                    u3s0VarM12527L.m191614q(t3s0VarM13479L);
                    o0w0VarM94490e.f141385a.zzb().m190438c().mo97691k0((C2104b0) u3s0VarM12527L.m153521m());
                }
                m104774e();
            } else {
                this.f78183c.m114349f();
                m104774e();
                o0w0VarM94490e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return o0w0VarM94490e;
    }

    @Override // p149l.b0w0
    /* JADX INFO: renamed from: b */
    public final synchronized boolean mo99794b(p0w0 p0w0Var, o0w0 o0w0Var) {
        boolean zM94493h;
        try {
            a0w0 a0w0Var = (a0w0) this.f78181a.get(p0w0Var);
            o0w0Var.f141388d = vny0.m199064b().currentTimeMillis();
            if (a0w0Var == null) {
                zzfjc zzfjcVar = this.f78182b;
                a0w0 a0w0Var2 = new a0w0(zzfjcVar.zzd, zzfjcVar.zze * 1000);
                if (this.f78181a.size() == this.f78182b.zzc) {
                    int i = this.f78182b.zzg;
                    int i2 = i - 1;
                    p0w0 p0w0Var2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long jM94488c = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.f78181a.entrySet()) {
                            if (((a0w0) entry.getValue()).m94488c() < jM94488c) {
                                jM94488c = ((a0w0) entry.getValue()).m94488c();
                                p0w0Var2 = (p0w0) entry.getKey();
                            }
                        }
                        if (p0w0Var2 != null) {
                            this.f78181a.remove(p0w0Var2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.f78181a.entrySet()) {
                            if (((a0w0) entry2.getValue()).m94489d() < jM94488c) {
                                jM94488c = ((a0w0) entry2.getValue()).m94489d();
                                p0w0Var2 = (p0w0) entry2.getKey();
                            }
                        }
                        if (p0w0Var2 != null) {
                            this.f78181a.remove(p0w0Var2);
                        }
                    } else if (i2 == 2) {
                        int iM94486a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.f78181a.entrySet()) {
                            if (((a0w0) entry3.getValue()).m94486a() < iM94486a) {
                                iM94486a = ((a0w0) entry3.getValue()).m94486a();
                                p0w0Var2 = (p0w0) entry3.getKey();
                            }
                        }
                        if (p0w0Var2 != null) {
                            this.f78181a.remove(p0w0Var2);
                        }
                    }
                    this.f78183c.m114350g();
                }
                this.f78181a.put(p0w0Var, a0w0Var2);
                this.f78183c.m114347d();
                a0w0Var = a0w0Var2;
            }
            zM94493h = a0w0Var.m94493h(o0w0Var);
            this.f78183c.m114346c();
            d0w0 d0w0VarM114344a = this.f78183c.m114344a();
            c1w0 c1w0VarM94491f = a0w0Var.m94491f();
            u3s0 u3s0VarM12527L = C2104b0.m12527L();
            t3s0 t3s0VarM13479L = C2288y.m13479L();
            t3s0VarM13479L.m187126t(2);
            x3s0 x3s0VarM12501L = C2095a0.m12501L();
            x3s0VarM12501L.m206946q(d0w0VarM114344a.f83216a);
            x3s0VarM12501L.m206947r(d0w0VarM114344a.f83217b);
            x3s0VarM12501L.m206948s(c1w0VarM94491f.f78311b);
            t3s0VarM13479L.m187125s(x3s0VarM12501L);
            u3s0VarM12527L.m191614q(t3s0VarM13479L);
            o0w0Var.f141385a.zzb().m190438c().mo97690h0((C2104b0) u3s0VarM12527L.m153521m());
            m104774e();
        } catch (Throwable th) {
            throw th;
        }
        return zM94493h;
    }

    @Override // p149l.b0w0
    /* JADX INFO: renamed from: c */
    public final synchronized boolean mo99795c(p0w0 p0w0Var) {
        a0w0 a0w0Var = (a0w0) this.f78181a.get(p0w0Var);
        if (a0w0Var == null) {
            return true;
        }
        return a0w0Var.m94487b() < this.f78182b.zzd;
    }

    @Override // p149l.b0w0
    @Deprecated
    /* JADX INFO: renamed from: d */
    public final p0w0 mo99796d(zzl zzlVar, String str, zzw zzwVar) {
        return new q0w0(zzlVar, str, new nvs0(this.f78182b.zza).m161759a().f145841k, this.f78182b.zzf, zzwVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m104774e() {
        Parcelable.Creator<zzfjc> creator = zzfjc.CREATOR;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132397s6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f78182b.zzb);
            sb.append(" PoolCollection");
            sb.append(this.f78183c.m114345b());
            int i = 0;
            for (Map.Entry entry : this.f78181a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((p0w0) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((a0w0) entry.getValue()).m94487b(); i2++) {
                    sb.append("[O]");
                }
                for (int iM94487b = ((a0w0) entry.getValue()).m94487b(); iM94487b < this.f78182b.zzd; iM94487b++) {
                    sb.append("[ ]");
                }
                sb.append(SignParameters.NEW_LINE);
                sb.append(((a0w0) entry.getValue()).m94492g());
                sb.append(SignParameters.NEW_LINE);
            }
            while (i < this.f78182b.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            x2t0.m206864b(sb.toString());
        }
    }

    @Override // p149l.b0w0
    public final zzfjc zza() {
        return this.f78182b;
    }
}
