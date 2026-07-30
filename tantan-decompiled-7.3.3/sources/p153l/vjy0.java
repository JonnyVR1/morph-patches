package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.C2349j;
import com.google.android.gms.measurement.internal.C2479e;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zznt;
import java.util.HashMap;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class vjy0 extends qjy0 {
    public vjy0(C2484j c2484j) {
        super(c2484j);
    }

    /* JADX INFO: renamed from: q */
    private final String m201558q(String str) {
        String strM15176L = mo15195l().m15176L(str);
        if (TextUtils.isEmpty(strM15176L)) {
            return whs0.f189291r.m220931a(null);
        }
        Uri uri = Uri.parse(whs0.f189291r.m220931a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strM15176L + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ vmy0 mo15192i() {
        return super.mo15192i();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ pwy0 mo15193j() {
        return super.mo15193j();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ opr0 mo15194k() {
        return super.mo15194k();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2479e mo15195l() {
        return super.mo15195l();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ kgy0 mo15196m() {
        return super.mo15196m();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ vjy0 mo15197n() {
        return super.mo15197n();
    }

    /* JADX INFO: renamed from: o */
    public final String m201559o(zqw0 zqw0Var) {
        Uri.Builder builder = new Uri.Builder();
        String strM221131q = zqw0Var.m221131q();
        if (TextUtils.isEmpty(strM221131q)) {
            strM221131q = zqw0Var.m221117j();
        }
        builder.scheme(whs0.f189259f.m220931a(null)).encodedAuthority(whs0.f189262g.m220931a(null)).path("config/app/" + strM221131q).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
    }

    /* JADX INFO: renamed from: p */
    public final aky0 m201560p(String str) {
        zqw0 zqw0VarM168706G0;
        if (gqy0.m131505a() && mo15139a().m98440n(whs0.f189306y0)) {
            mo15143e();
            if (hny0.m136291B0(str)) {
                zzj().m114562E().m153300a("sgtm feature flag enabled.");
                zqw0 zqw0VarM168706G1 = mo15194k().m168706G0(str);
                if (zqw0VarM168706G1 == null) {
                    return new aky0(m201558q(str), zznt.GOOGLE_ANALYTICS);
                }
                String strM221123m = zqw0VarM168706G1.m221123m();
                C2349j c2349jM15170F = mo15195l().m15170F(str);
                if (c2349jM15170F == null || (zqw0VarM168706G0 = mo15194k().m168706G0(str)) == null || ((!c2349jM15170F.m14276b0() || c2349jM15170F.m14267N().m14302h() != 100) && !mo15143e().m136370y0(str, zqw0VarM168706G0.m221141v()) && (!mo15139a().m98440n(whs0.f189193A0) ? !(TextUtils.isEmpty(strM221123m) || strM221123m.hashCode() % 100 >= c2349jM15170F.m14267N().m14302h()) : !(TextUtils.isEmpty(strM221123m) || Math.abs(strM221123m.hashCode() % 100) >= c2349jM15170F.m14267N().m14302h())))) {
                    return new aky0(m201558q(str), zznt.GOOGLE_ANALYTICS);
                }
                aky0 aky0Var = null;
                if (zqw0VarM168706G1.m221064C()) {
                    zzj().m114562E().m153300a("sgtm upload enabled in manifest.");
                    C2349j c2349jM15170F2 = mo15195l().m15170F(zqw0VarM168706G1.m221121l());
                    if (c2349jM15170F2 != null && c2349jM15170F2.m14276b0()) {
                        String strM14301E = c2349jM15170F2.m14267N().m14301E();
                        if (!TextUtils.isEmpty(strM14301E)) {
                            String strM14300D = c2349jM15170F2.m14267N().m14300D();
                            zzj().m114562E().m153302c("sgtm configured with upload_url, server_info", strM14301E, TextUtils.isEmpty(strM14300D) ? "Y" : "N");
                            if (TextUtils.isEmpty(strM14300D)) {
                                aky0Var = new aky0(strM14301E, zznt.SGTM);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strM14300D);
                                if (!TextUtils.isEmpty(zqw0VarM168706G1.m221141v())) {
                                    map.put("x-gtm-server-preview", zqw0VarM168706G1.m221141v());
                                }
                                aky0Var = new aky0(strM14301E, map, zznt.SGTM);
                            }
                        }
                    }
                }
                if (aky0Var != null) {
                    return aky0Var;
                }
            }
        }
        return new aky0(m201558q(str), zznt.GOOGLE_ANALYTICS);
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }
}
