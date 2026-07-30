package p153l;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2331a0;
import com.google.android.gms.internal.measurement.C2336c0;
import com.google.android.gms.internal.measurement.C2342f0;
import com.google.android.gms.internal.measurement.C2379y;
import com.google.android.gms.internal.measurement.C2381z;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.internal.measurement.zzfy$zzl;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzje;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class nay0 extends njy0 {
    public nay0(C2484j c2484j) {
        super(c2484j);
    }

    private static String zza(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // p153l.njy0
    /* JADX INFO: renamed from: r */
    public final boolean mo15198r() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final byte[] m162106s(@NonNull zzbf zzbfVar, @Size(min = 1) String str) {
        zzje zzjeVar;
        ymy0 next;
        zzfy$zzj.C2389a c2389a;
        zqw0 zqw0Var;
        C2336c0.a aVar;
        byte[] bArr;
        pbs0 pbs0VarM171529a;
        long j;
        mo15146h();
        this.f202159a.m100291L();
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotEmpty(str);
        if (!mo15139a().m98452z(str, whs0.f189281m0)) {
            zzj().m114570z().m153301b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzbfVar.zza) && !"_iapx".equals(zzbfVar.zza)) {
            zzj().m114570z().m153302c("Generating a payload for this event is not available. package_name, event_name", str, zzbfVar.zza);
            return null;
        }
        zzfy$zzj.C2389a c2389aM14650I = zzfy$zzj.m14650I();
        mo15194k().m168736W0();
        try {
            zqw0 zqw0VarM168706G0 = mo15194k().m168706G0(str);
            if (zqw0VarM168706G0 == null) {
                zzj().m114570z().m153301b("Log and bundle not available. package_name", str);
                byte[] bArr2 = new byte[0];
                mo15194k().m168748c1();
                return bArr2;
            }
            if (!zqw0VarM168706G0.m221060A()) {
                zzj().m114570z().m153301b("Log and bundle disabled. package_name", str);
                byte[] bArr3 = new byte[0];
                mo15194k().m168748c1();
                return bArr3;
            }
            C2336c0.a aVarM14103d1 = C2336c0.m13971x2().m14062E0(1).m14103d1("android");
            if (!TextUtils.isEmpty(zqw0VarM168706G0.m221121l())) {
                aVarM14103d1.m14100c0(zqw0VarM168706G0.m221121l());
            }
            if (!TextUtils.isEmpty(zqw0VarM168706G0.m221125n())) {
                aVarM14103d1.m14124o0((String) Preconditions.checkNotNull(zqw0VarM168706G0.m221125n()));
            }
            if (!TextUtils.isEmpty(zqw0VarM168706G0.m221127o())) {
                aVarM14103d1.m14133u0((String) Preconditions.checkNotNull(zqw0VarM168706G0.m221127o()));
            }
            if (zqw0VarM168706G0.m221093U() != -2147483648L) {
                aVarM14103d1.m14130r0((int) zqw0VarM168706G0.m221093U());
            }
            aVarM14103d1.m14139x0(zqw0VarM168706G0.m221150z0()).m14120m0(zqw0VarM168706G0.m221142v0());
            String strM221131q = zqw0VarM168706G0.m221131q();
            String strM221117j = zqw0VarM168706G0.m221117j();
            if (!TextUtils.isEmpty(strM221131q)) {
                aVarM14103d1.m14091X0(strM221131q);
            } else if (!TextUtils.isEmpty(strM221117j)) {
                aVarM14103d1.m14073M(strM221117j);
            }
            aVarM14103d1.m14076N0(zqw0VarM168706G0.m221079J0());
            zzje zzjeVarM15321P = this.f158066b.m15321P(str);
            aVarM14103d1.m14108g0(zqw0VarM168706G0.m221138t0());
            if (this.f202159a.m100298k() && mo15139a().m98425H(aVarM14103d1.m14117k1()) && zzjeVarM15321P.m15411y() && !TextUtils.isEmpty(null)) {
                aVarM14103d1.m14077O0(null);
            }
            aVarM14103d1.m14058C0(zzjeVarM15321P.m15409w());
            if (zzjeVarM15321P.m15411y() && zqw0VarM168706G0.m221149z()) {
                Pair<String, Boolean> pairM149777t = mo15196m().m149777t(zqw0VarM168706G0.m221121l(), zzjeVarM15321P);
                if (!zqw0VarM168706G0.m221149z() || pairM149777t == null || TextUtils.isEmpty((CharSequence) pairM149777t.first)) {
                    zzjeVar = zzjeVarM15321P;
                } else {
                    try {
                        zzjeVar = zzjeVarM15321P;
                        aVarM14103d1.m14107f1(zza((String) pairM149777t.first, Long.toString(zzbfVar.zzd)));
                        Object obj = pairM149777t.second;
                        if (obj != null) {
                            aVarM14103d1.m14114j0(((Boolean) obj).booleanValue());
                        }
                    } catch (SecurityException e) {
                        zzj().m114570z().m153301b("Resettable device id encryption failed", e.getMessage());
                        byte[] bArr4 = new byte[0];
                        mo15194k().m168748c1();
                        return bArr4;
                    }
                }
            } else {
                zzjeVar = zzjeVarM15321P;
            }
            mo15140b().m160930j();
            C2336c0.a aVarM14070K0 = aVarM14103d1.m14070K0(Build.MODEL);
            mo15140b().m160930j();
            aVarM14070K0.m14099b1(Build.VERSION.RELEASE).m14074M0((int) mo15140b().m166364o()).m14115j1(mo15140b().m166365p());
            try {
                if (zzjeVar.m15412z() && zqw0VarM168706G0.m221123m() != null) {
                    aVarM14103d1.m14112i0(zza((String) Preconditions.checkNotNull(zqw0VarM168706G0.m221123m()), Long.toString(zzbfVar.zzd)));
                }
                if (!TextUtils.isEmpty(zqw0VarM168706G0.m221129p())) {
                    aVarM14103d1.m14087V0((String) Preconditions.checkNotNull(zqw0VarM168706G0.m221129p()));
                }
                String strM221121l = zqw0VarM168706G0.m221121l();
                List<ymy0> listM168728S0 = mo15194k().m168728S0(strM221121l);
                Iterator<ymy0> it = listM168728S0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!"_lte".equals(next.f200729c));
                if (next == null || next.f200731e == null) {
                    ymy0 ymy0Var = new ymy0(strM221121l, "auto", "_lte", zzb().currentTimeMillis(), 0L);
                    listM168728S0.add(ymy0Var);
                    mo15194k().m168757h0(ymy0Var);
                }
                C2342f0[] c2342f0Arr = new C2342f0[listM168728S0.size()];
                for (int i = 0; i < listM168728S0.size(); i++) {
                    C2342f0.a aVarM14227A = C2342f0.m14214V().m14233y(listM168728S0.get(i).f200729c).m14227A(listM168728S0.get(i).f200730d);
                    mo15192i().m201883P(aVarM14227A, listM168728S0.get(i).f200731e);
                    c2342f0Arr[i] = (C2342f0) ((AbstractC2372u0) aVarM14227A.mo14423H());
                }
                aVarM14103d1.m14132t0(Arrays.asList(c2342f0Arr));
                this.f158066b.m15315E(zqw0VarM168706G0, aVarM14103d1);
                if (nny0.m164006a() && mo15139a().m98440n(whs0.f189235V0)) {
                    this.f158066b.m15328W(zqw0VarM168706G0, aVarM14103d1);
                }
                tax0 tax0VarM189960b = tax0.m189960b(zzbfVar);
                mo15143e().m136328H(tax0VarM189960b.f172812d, mo15194k().m168702E0(str));
                mo15143e().m136345R(tax0VarM189960b, mo15139a().m98442p(str));
                Bundle bundle = tax0VarM189960b.f172812d;
                bundle.putLong("_c", 1L);
                zzj().m114570z().m153300a("Marking in-app purchase as real-time");
                bundle.putLong("_r", 1L);
                bundle.putString("_o", zzbfVar.zzc);
                if (mo15143e().m136370y0(aVarM14103d1.m14117k1(), zqw0VarM168706G0.m221141v())) {
                    mo15143e().m136330I(bundle, "_dbg", 1L);
                    mo15143e().m136330I(bundle, "_r", 1L);
                }
                pbs0 pbs0VarM168704F0 = mo15194k().m168704F0(str, zzbfVar.zza);
                if (pbs0VarM168704F0 == null) {
                    zqw0Var = zqw0VarM168706G0;
                    aVar = aVarM14103d1;
                    c2389a = c2389aM14650I;
                    bArr = null;
                    pbs0VarM171529a = new pbs0(str, zzbfVar.zza, 0L, 0L, zzbfVar.zzd, 0L, null, null, null, null);
                    j = 0;
                } else {
                    c2389a = c2389aM14650I;
                    zqw0Var = zqw0VarM168706G0;
                    aVar = aVarM14103d1;
                    bArr = null;
                    long j2 = pbs0VarM168704F0.f151422f;
                    pbs0VarM171529a = pbs0VarM168704F0.m171529a(zzbfVar.zzd);
                    j = j2;
                }
                pbs0 pbs0Var = pbs0VarM171529a;
                mo15194k().m168735W(pbs0Var);
                wcs0 wcs0Var = new wcs0(this.f202159a, zzbfVar.zzc, str, zzbfVar.zza, zzbfVar.zzd, j, bundle);
                C2379y.a aVarM14577z = C2379y.m14548V().m14566G(wcs0Var.f188498d).m14564D(wcs0Var.f188496b).m14577z(wcs0Var.f188499e);
                for (String str2 : wcs0Var.f188500f) {
                    C2331a0.a aVarM13849A = C2331a0.m13833X().m13849A(str2);
                    Object objM15380I = wcs0Var.f188500f.m15380I(str2);
                    if (objM15380I != null) {
                        mo15192i().m201882O(aVarM13849A, objM15380I);
                        aVarM14577z.m14561A(aVarM13849A);
                    }
                }
                C2336c0.a aVar2 = aVar;
                aVar2.m14059D(aVarM14577z).m14061E(zzfy$zzl.m14671B().m14674v(C2381z.m14597B().m14601v(pbs0Var.f151419c).m14602w(zzbfVar.zza)));
                aVar2.m14071L(mo15193j().m174097s(zqw0Var.m221121l(), Collections.EMPTY_LIST, aVar2.m14084U(), Long.valueOf(aVarM14577z.m14568L()), Long.valueOf(aVarM14577z.m14568L())));
                if (aVarM14577z.m14572U()) {
                    aVar2.m14068J0(aVarM14577z.m14568L()).m14131s0(aVarM14577z.m14568L());
                }
                long jM221067D0 = zqw0Var.m221067D0();
                if (jM221067D0 != 0) {
                    aVar2.m14056B0(jM221067D0);
                }
                long jM221075H0 = zqw0Var.m221075H0();
                if (jM221075H0 != 0) {
                    aVar2.m14063F0(jM221075H0);
                } else if (jM221067D0 != 0) {
                    aVar2.m14063F0(jM221067D0);
                }
                String strM221139u = zqw0Var.m221139u();
                if (upy0.m197192a() && mo15139a().m98452z(str, whs0.f189304x0) && strM221139u != null) {
                    aVar2.m14111h1(strM221139u);
                }
                zqw0Var.m221147y();
                aVar2.m14137w0((int) zqw0Var.m221071F0()).m14085U0(106000L).m14079Q0(zzb().currentTimeMillis()).m14126p0(true);
                this.f158066b.m15371y(aVar2.m14117k1(), aVar2);
                zzfy$zzj.C2389a c2389a2 = c2389a;
                c2389a2.m14667w(aVar2);
                zqw0 zqw0Var2 = zqw0Var;
                zqw0Var2.m221065C0(aVar2.m14135v0());
                zqw0Var2.m221148y0(aVar2.m14128q0());
                mo15194k().m168737X(zqw0Var2, false, false);
                mo15194k().m168752e1();
                mo15194k().m168748c1();
                try {
                    return mo15192i().m201887b0(((zzfy$zzj) ((AbstractC2372u0) c2389a2.mo14423H())).m14308g());
                } catch (IOException e2) {
                    zzj().m114558A().m153302c("Data loss. Failed to bundle and serialize. appId", d6x0.m114551p(str), e2);
                    return bArr;
                }
            } catch (SecurityException e3) {
                zzj().m114570z().m153301b("app instance id encryption failed", e3.getMessage());
                byte[] bArr5 = new byte[0];
                mo15194k().m168748c1();
                return bArr5;
            }
        } catch (Throwable th) {
            mo15194k().m168748c1();
            throw th;
        }
    }
}
