package p149l;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2308a0;
import com.google.android.gms.internal.measurement.C2313c0;
import com.google.android.gms.internal.measurement.C2319f0;
import com.google.android.gms.internal.measurement.C2356y;
import com.google.android.gms.internal.measurement.C2358z;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.internal.measurement.zzfy$zzl;
import com.google.android.gms.measurement.internal.C2461j;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzje;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class h1y0 extends hay0 {
    public h1y0(C2461j c2461j) {
        super(c2461j);
    }

    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // p149l.hay0
    /* JADX INFO: renamed from: r */
    public final boolean mo15144r() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final byte[] m129089s(@NonNull zzbf zzbfVar, @Size(min = 1) String str) {
        zzje zzjeVar;
        sdy0 next;
        zzfy$zzj.C2366a c2366a;
        thw0 thw0Var;
        C2313c0.a aVar;
        byte[] bArr;
        j2s0 j2s0VarM139493a;
        long j;
        mo15092h();
        this.f165891a.m194111L();
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotEmpty(str);
        if (!mo15085a().m192660z(str, q8s0.f153305m0)) {
            zzj().m211424z().m123937b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzbfVar.zza) && !"_iapx".equals(zzbfVar.zza)) {
            zzj().m211424z().m123938c("Generating a payload for this event is not available. package_name, event_name", str, zzbfVar.zza);
            return null;
        }
        zzfy$zzj.C2366a c2366aM14596I = zzfy$zzj.m14596I();
        mo15140k().m136137W0();
        try {
            thw0 thw0VarM136107G0 = mo15140k().m136107G0(str);
            if (thw0VarM136107G0 == null) {
                zzj().m211424z().m123937b("Log and bundle not available. package_name", str);
                byte[] bArr2 = new byte[0];
                mo15140k().m136149c1();
                return bArr2;
            }
            if (!thw0VarM136107G0.m188932A()) {
                zzj().m211424z().m123937b("Log and bundle disabled. package_name", str);
                byte[] bArr3 = new byte[0];
                mo15140k().m136149c1();
                return bArr3;
            }
            C2313c0.a aVarM14049d1 = C2313c0.m13917x2().m14008E0(1).m14049d1("android");
            if (!TextUtils.isEmpty(thw0VarM136107G0.m188993l())) {
                aVarM14049d1.m14046c0(thw0VarM136107G0.m188993l());
            }
            if (!TextUtils.isEmpty(thw0VarM136107G0.m188997n())) {
                aVarM14049d1.m14070o0((String) Preconditions.checkNotNull(thw0VarM136107G0.m188997n()));
            }
            if (!TextUtils.isEmpty(thw0VarM136107G0.m188999o())) {
                aVarM14049d1.m14079u0((String) Preconditions.checkNotNull(thw0VarM136107G0.m188999o()));
            }
            if (thw0VarM136107G0.m188965U() != -2147483648L) {
                aVarM14049d1.m14076r0((int) thw0VarM136107G0.m188965U());
            }
            aVarM14049d1.m14085x0(thw0VarM136107G0.m189022z0()).m14066m0(thw0VarM136107G0.m189014v0());
            String strM189003q = thw0VarM136107G0.m189003q();
            String strM188989j = thw0VarM136107G0.m188989j();
            if (!TextUtils.isEmpty(strM189003q)) {
                aVarM14049d1.m14037X0(strM189003q);
            } else if (!TextUtils.isEmpty(strM188989j)) {
                aVarM14049d1.m14019M(strM188989j);
            }
            aVarM14049d1.m14022N0(thw0VarM136107G0.m188951J0());
            zzje zzjeVarM15267P = this.f122162b.m15267P(str);
            aVarM14049d1.m14054g0(thw0VarM136107G0.m189010t0());
            if (this.f165891a.m194118k() && mo15085a().m192633H(aVarM14049d1.m14063k1()) && zzjeVarM15267P.m15357y() && !TextUtils.isEmpty(null)) {
                aVarM14049d1.m14023O0(null);
            }
            aVarM14049d1.m14004C0(zzjeVarM15267P.m15355w());
            if (zzjeVarM15267P.m15357y() && thw0VarM136107G0.m189021z()) {
                Pair<String, Boolean> pairM115229t = mo15142m().m115229t(thw0VarM136107G0.m188993l(), zzjeVarM15267P);
                if (!thw0VarM136107G0.m189021z() || pairM115229t == null || TextUtils.isEmpty((CharSequence) pairM115229t.first)) {
                    zzjeVar = zzjeVarM15267P;
                } else {
                    try {
                        zzjeVar = zzjeVarM15267P;
                        aVarM14049d1.m14053f1(zza((String) pairM115229t.first, Long.toString(zzbfVar.zzd)));
                        Object obj = pairM115229t.second;
                        if (obj != null) {
                            aVarM14049d1.m14060j0(((Boolean) obj).booleanValue());
                        }
                    } catch (SecurityException e) {
                        zzj().m211424z().m123937b("Resettable device id encryption failed", e.getMessage());
                        byte[] bArr4 = new byte[0];
                        mo15140k().m136149c1();
                        return bArr4;
                    }
                }
            } else {
                zzjeVar = zzjeVarM15267P;
            }
            mo15086b().m127632j();
            C2313c0.a aVarM14016K0 = aVarM14049d1.m14016K0(Build.MODEL);
            mo15086b().m127632j();
            aVarM14016K0.m14045b1(Build.VERSION.RELEASE).m14020M0((int) mo15086b().m138987o()).m14061j1(mo15086b().m138988p());
            try {
                if (zzjeVar.m15358z() && thw0VarM136107G0.m188995m() != null) {
                    aVarM14049d1.m14058i0(zza((String) Preconditions.checkNotNull(thw0VarM136107G0.m188995m()), Long.toString(zzbfVar.zzd)));
                }
                if (!TextUtils.isEmpty(thw0VarM136107G0.m189001p())) {
                    aVarM14049d1.m14033V0((String) Preconditions.checkNotNull(thw0VarM136107G0.m189001p()));
                }
                String strM188993l = thw0VarM136107G0.m188993l();
                List<sdy0> listM136129S0 = mo15140k().m136129S0(strM188993l);
                Iterator<sdy0> it = listM136129S0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!"_lte".equals(next.f163922c));
                if (next == null || next.f163924e == null) {
                    sdy0 sdy0Var = new sdy0(strM188993l, "auto", "_lte", zzb().currentTimeMillis(), 0L);
                    listM136129S0.add(sdy0Var);
                    mo15140k().m136158h0(sdy0Var);
                }
                C2319f0[] c2319f0Arr = new C2319f0[listM136129S0.size()];
                for (int i = 0; i < listM136129S0.size(); i++) {
                    C2319f0.a aVarM14173A = C2319f0.m14160V().m14179y(listM136129S0.get(i).f163922c).m14173A(listM136129S0.get(i).f163923d);
                    mo15138i().m168478P(aVarM14173A, listM136129S0.get(i).f163924e);
                    c2319f0Arr[i] = (C2319f0) ((AbstractC2349u0) aVarM14173A.mo14369H());
                }
                aVarM14049d1.m14078t0(Arrays.asList(c2319f0Arr));
                this.f122162b.m15261E(thw0VarM136107G0, aVarM14049d1);
                if (hey0.m130716a() && mo15085a().m192648n(q8s0.f153259V0)) {
                    this.f122162b.m15274W(thw0VarM136107G0, aVarM14049d1);
                }
                n1x0 n1x0VarM157515b = n1x0.m157515b(zzbfVar);
                mo15089e().m101461H(n1x0VarM157515b.f136734d, mo15140k().m136103E0(str));
                mo15089e().m101478R(n1x0VarM157515b, mo15085a().m192650p(str));
                Bundle bundle = n1x0VarM157515b.f136734d;
                bundle.putLong("_c", 1L);
                zzj().m211424z().m123936a("Marking in-app purchase as real-time");
                bundle.putLong("_r", 1L);
                bundle.putString("_o", zzbfVar.zzc);
                if (mo15089e().m101505y0(aVarM14049d1.m14063k1(), thw0VarM136107G0.m189013v())) {
                    mo15089e().m101463I(bundle, "_dbg", 1L);
                    mo15089e().m101463I(bundle, "_r", 1L);
                }
                j2s0 j2s0VarM136105F0 = mo15140k().m136105F0(str, zzbfVar.zza);
                if (j2s0VarM136105F0 == null) {
                    thw0Var = thw0VarM136107G0;
                    aVar = aVarM14049d1;
                    c2366a = c2366aM14596I;
                    bArr = null;
                    j2s0VarM139493a = new j2s0(str, zzbfVar.zza, 0L, 0L, zzbfVar.zzd, 0L, null, null, null, null);
                    j = 0;
                } else {
                    c2366a = c2366aM14596I;
                    thw0Var = thw0VarM136107G0;
                    aVar = aVarM14049d1;
                    bArr = null;
                    long j2 = j2s0VarM136105F0.f115956f;
                    j2s0VarM139493a = j2s0VarM136105F0.m139493a(zzbfVar.zzd);
                    j = j2;
                }
                j2s0 j2s0Var = j2s0VarM139493a;
                mo15140k().m136136W(j2s0Var);
                q3s0 q3s0Var = new q3s0(this.f165891a, zzbfVar.zzc, str, zzbfVar.zza, zzbfVar.zzd, j, bundle);
                C2356y.a aVarM14523z = C2356y.m14494V().m14512G(q3s0Var.f152510d).m14510D(q3s0Var.f152508b).m14523z(q3s0Var.f152511e);
                for (String str2 : q3s0Var.f152512f) {
                    C2308a0.a aVarM13795A = C2308a0.m13779X().m13795A(str2);
                    Object objM15326I = q3s0Var.f152512f.m15326I(str2);
                    if (objM15326I != null) {
                        mo15138i().m168477O(aVarM13795A, objM15326I);
                        aVarM14523z.m14507A(aVarM13795A);
                    }
                }
                C2313c0.a aVar2 = aVar;
                aVar2.m14005D(aVarM14523z).m14007E(zzfy$zzl.m14617B().m14620v(C2358z.m14543B().m14547v(j2s0Var.f115953c).m14548w(zzbfVar.zza)));
                aVar2.m14017L(mo15139j().m142401s(thw0Var.m188993l(), Collections.EMPTY_LIST, aVar2.m14030U(), Long.valueOf(aVarM14523z.m14514L()), Long.valueOf(aVarM14523z.m14514L())));
                if (aVarM14523z.m14518U()) {
                    aVar2.m14014J0(aVarM14523z.m14514L()).m14077s0(aVarM14523z.m14514L());
                }
                long jM188939D0 = thw0Var.m188939D0();
                if (jM188939D0 != 0) {
                    aVar2.m14002B0(jM188939D0);
                }
                long jM188947H0 = thw0Var.m188947H0();
                if (jM188947H0 != 0) {
                    aVar2.m14009F0(jM188947H0);
                } else if (jM188939D0 != 0) {
                    aVar2.m14009F0(jM188939D0);
                }
                String strM189011u = thw0Var.m189011u();
                if (ogy0.m164303a() && mo15085a().m192660z(str, q8s0.f153328x0) && strM189011u != null) {
                    aVar2.m14057h1(strM189011u);
                }
                thw0Var.m189019y();
                aVar2.m14083w0((int) thw0Var.m188943F0()).m14031U0(106000L).m14025Q0(zzb().currentTimeMillis()).m14072p0(true);
                this.f122162b.m15317y(aVar2.m14063k1(), aVar2);
                zzfy$zzj.C2366a c2366a2 = c2366a;
                c2366a2.m14613w(aVar2);
                thw0 thw0Var2 = thw0Var;
                thw0Var2.m188937C0(aVar2.m14081v0());
                thw0Var2.m189020y0(aVar2.m14074q0());
                mo15140k().m136138X(thw0Var2, false, false);
                mo15140k().m136153e1();
                mo15140k().m136149c1();
                try {
                    return mo15138i().m168482b0(((zzfy$zzj) ((AbstractC2349u0) c2366a2.mo14369H())).m14254g());
                } catch (IOException e2) {
                    zzj().m211412A().m123938c("Data loss. Failed to bundle and serialize. appId", xww0.m211405p(str), e2);
                    return bArr;
                }
            } catch (SecurityException e3) {
                zzj().m211424z().m123937b("app instance id encryption failed", e3.getMessage());
                byte[] bArr5 = new byte[0];
                mo15140k().m136149c1();
                return bArr5;
            }
        } catch (Throwable th) {
            mo15140k().m136149c1();
            throw th;
        }
    }
}
