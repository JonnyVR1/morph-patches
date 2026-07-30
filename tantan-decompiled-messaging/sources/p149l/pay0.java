package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.C2326j;
import com.google.android.gms.measurement.internal.C2456e;
import com.google.android.gms.measurement.internal.C2461j;
import com.google.android.gms.measurement.internal.zznt;
import java.util.HashMap;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class pay0 extends kay0 {
    public pay0(C2461j c2461j) {
        super(c2461j);
    }

    /* JADX INFO: renamed from: q */
    private final String m168105q(String str) {
        String strM15122L = mo15141l().m15122L(str);
        if (TextUtils.isEmpty(strM15122L)) {
            return q8s0.f153315r.m188827a(null);
        }
        Uri uri = Uri.parse(q8s0.f153315r.m188827a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strM15122L + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ pdy0 mo15138i() {
        return super.mo15138i();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ jny0 mo15139j() {
        return super.mo15139j();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ igr0 mo15140k() {
        return super.mo15140k();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2456e mo15141l() {
        return super.mo15141l();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ e7y0 mo15142m() {
        return super.mo15142m();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ pay0 mo15143n() {
        return super.mo15143n();
    }

    /* JADX INFO: renamed from: o */
    public final String m168106o(thw0 thw0Var) {
        Uri.Builder builder = new Uri.Builder();
        String strM189003q = thw0Var.m189003q();
        if (TextUtils.isEmpty(strM189003q)) {
            strM189003q = thw0Var.m188989j();
        }
        builder.scheme(q8s0.f153283f.m188827a(null)).encodedAuthority(q8s0.f153286g.m188827a(null)).path("config/app/" + strM189003q).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
    }

    /* JADX INFO: renamed from: p */
    public final uay0 m168107p(String str) {
        thw0 thw0VarM136107G0;
        if (ahy0.m96761a() && mo15085a().m192648n(q8s0.f153330y0)) {
            mo15089e();
            if (bey0.m101424B0(str)) {
                zzj().m211416E().m123936a("sgtm feature flag enabled.");
                thw0 thw0VarM136107G1 = mo15140k().m136107G0(str);
                if (thw0VarM136107G1 == null) {
                    return new uay0(m168105q(str), zznt.GOOGLE_ANALYTICS);
                }
                String strM188995m = thw0VarM136107G1.m188995m();
                C2326j c2326jM15116F = mo15141l().m15116F(str);
                if (c2326jM15116F == null || (thw0VarM136107G0 = mo15140k().m136107G0(str)) == null || ((!c2326jM15116F.m14222b0() || c2326jM15116F.m14213N().m14248h() != 100) && !mo15089e().m101505y0(str, thw0VarM136107G0.m189013v()) && (!mo15085a().m192648n(q8s0.f153217A0) ? !(TextUtils.isEmpty(strM188995m) || strM188995m.hashCode() % 100 >= c2326jM15116F.m14213N().m14248h()) : !(TextUtils.isEmpty(strM188995m) || Math.abs(strM188995m.hashCode() % 100) >= c2326jM15116F.m14213N().m14248h())))) {
                    return new uay0(m168105q(str), zznt.GOOGLE_ANALYTICS);
                }
                uay0 uay0Var = null;
                if (thw0VarM136107G1.m188936C()) {
                    zzj().m211416E().m123936a("sgtm upload enabled in manifest.");
                    C2326j c2326jM15116F2 = mo15141l().m15116F(thw0VarM136107G1.m188993l());
                    if (c2326jM15116F2 != null && c2326jM15116F2.m14222b0()) {
                        String strM14247E = c2326jM15116F2.m14213N().m14247E();
                        if (!TextUtils.isEmpty(strM14247E)) {
                            String strM14246D = c2326jM15116F2.m14213N().m14246D();
                            zzj().m211416E().m123938c("sgtm configured with upload_url, server_info", strM14247E, TextUtils.isEmpty(strM14246D) ? "Y" : "N");
                            if (TextUtils.isEmpty(strM14246D)) {
                                uay0Var = new uay0(strM14247E, zznt.SGTM);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strM14246D);
                                if (!TextUtils.isEmpty(thw0VarM136107G1.m189013v())) {
                                    map.put("x-gtm-server-preview", thw0VarM136107G1.m189013v());
                                }
                                uay0Var = new uay0(strM14247E, map, zznt.SGTM);
                            }
                        }
                    }
                }
                if (uay0Var != null) {
                    return uay0Var;
                }
            }
        }
        return new uay0(m168105q(str), zznt.GOOGLE_ANALYTICS);
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
