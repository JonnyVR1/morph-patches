package p153l;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.C2479e;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class iux0 extends evw0 {

    /* JADX INFO: renamed from: a */
    public final C2484j f116991a;

    /* JADX INFO: renamed from: b */
    public Boolean f116992b;

    /* JADX INFO: renamed from: c */
    public String f116993c;

    public iux0(C2484j c2484j, String str) {
        Preconditions.checkNotNull(c2484j);
        this.f116991a = c2484j;
        this.f116993c = null;
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: I0 */
    public final List<zzon> mo112704I0(String str, String str2, String str3, boolean z) {
        m142242m4(str, true);
        try {
            List<ymy0> list = (List) this.f116991a.zzl().m177837p(new hwx0(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ymy0 ymy0Var : list) {
                if (z || !hny0.m136293D0(ymy0Var.f200729c)) {
                    arrayList.add(new zzon(ymy0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f116991a.zzj().m114558A().m153302c("Failed to get user properties as. appId", d6x0.m114551p(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.f116991a.zzj().m114558A().m153302c("Failed to get user properties as. appId", d6x0.m114551p(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: J6 */
    public final void mo112705J6(zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        m142242m4(zzoVar.zza, false);
        m142244n8(new cxx0(this, zzoVar));
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: K6 */
    public final void mo112706K6(final Bundle bundle, zzo zzoVar) {
        m142241g7(zzoVar, false);
        final String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        m142244n8(new Runnable() { // from class: l.yux0
            @Override // java.lang.Runnable
            public final void run() {
                this.f201668a.m142240Y2(bundle, str);
            }
        });
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: L5 */
    public final zzaj mo112707L5(zzo zzoVar) {
        m142241g7(zzoVar, false);
        Preconditions.checkNotEmpty(zzoVar.zza);
        try {
            return (zzaj) this.f116991a.zzl().m177840u(new lxx0(this, zzoVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f116991a.zzj().m114558A().m153302c("Failed to get consent. appId", d6x0.m114551p(zzoVar.zza), e);
            return new zzaj(null);
        }
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: L6 */
    public final void mo112708L6(zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        m142239P3(new ywx0(this, zzoVar));
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m142238M6(Bundle bundle, String str) {
        boolean zIsEmpty = bundle.isEmpty();
        C2484j c2484j = this.f116991a;
        if (zIsEmpty) {
            c2484j.m15344g0().m168738X0(str);
        } else {
            c2484j.m15344g0().m168774z0(str, bundle);
            this.f116991a.m15344g0().m168721P(str, bundle);
        }
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: M7 */
    public final List<zzon> mo112709M7(String str, String str2, boolean z, zzo zzoVar) {
        m142241g7(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<ymy0> list = (List) this.f116991a.zzl().m177837p(new lwx0(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ymy0 ymy0Var : list) {
                if (z || !hny0.m136293D0(ymy0Var.f200729c)) {
                    arrayList.add(new zzon(ymy0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f116991a.zzj().m114558A().m153302c("Failed to query user properties. appId", d6x0.m114551p(zzoVar.zza), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.f116991a.zzj().m114558A().m153302c("Failed to query user properties. appId", d6x0.m114551p(zzoVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: P3 */
    public final void m142239P3(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f116991a.zzl().m177835D()) {
            runnable.run();
        } else {
            this.f116991a.zzl().m177834A(runnable);
        }
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: Q4 */
    public final void mo112710Q4(zzon zzonVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzonVar);
        m142241g7(zzoVar, false);
        m142244n8(new dyx0(this, zzonVar, zzoVar));
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: U6 */
    public final String mo112711U6(zzo zzoVar) {
        m142241g7(zzoVar, false);
        return this.f116991a.m15322Q(zzoVar);
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: U7 */
    public final void mo112712U7(final zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        m142239P3(new Runnable() { // from class: l.dvx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90983a.m142247q8(zzoVar);
            }
        });
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: V1 */
    public final List<zzno> mo112713V1(zzo zzoVar, Bundle bundle) {
        m142241g7(zzoVar, false);
        Preconditions.checkNotNull(zzoVar.zza);
        try {
            return (List) this.f116991a.zzl().m177837p(new ayx0(this, zzoVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f116991a.zzj().m114558A().m153302c("Failed to get trigger URIs. appId", d6x0.m114551p(zzoVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: V7 */
    public final byte[] mo112714V7(zzbf zzbfVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbfVar);
        m142242m4(str, true);
        this.f116991a.zzj().m114570z().m153301b("Log and bundle. event", this.f116991a.m15347i0().m208449c(zzbfVar.zza));
        long jNanoTime = this.f116991a.zzb().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f116991a.zzl().m177840u(new qxx0(this, zzbfVar, str)).get();
            if (bArr == null) {
                this.f116991a.zzj().m114558A().m153301b("Log and bundle returned null. appId", d6x0.m114551p(str));
                bArr = new byte[0];
            }
            this.f116991a.zzj().m114570z().m153303d("Log and bundle processed. event, size, time_ms", this.f116991a.m15347i0().m208449c(zzbfVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.f116991a.zzb().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            this.f116991a.zzj().m114558A().m153303d("Failed to log and bundle. appId, event, error", d6x0.m114551p(str), this.f116991a.m15347i0().m208449c(zzbfVar.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.f116991a.zzj().m114558A().m153303d("Failed to log and bundle. appId, event, error", d6x0.m114551p(str), this.f116991a.m15347i0().m208449c(zzbfVar.zza), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m142240Y2(Bundle bundle, String str) {
        boolean zM98440n = this.f116991a.m15339d0().m98440n(whs0.f189261f1);
        boolean zM98440n2 = this.f116991a.m15339d0().m98440n(whs0.f189267h1);
        if (bundle.isEmpty() && zM98440n && zM98440n2) {
            this.f116991a.m15344g0().m168738X0(str);
            return;
        }
        this.f116991a.m15344g0().m168774z0(str, bundle);
        if (zM98440n2 && this.f116991a.m15344g0().m168746b1(str)) {
            this.f116991a.m15344g0().m168721P(str, bundle);
        }
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: Z1 */
    public final List<zzon> mo141996Z1(zzo zzoVar, boolean z) {
        m142241g7(zzoVar, false);
        String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<ymy0> list = (List) this.f116991a.zzl().m177837p(new dzx0(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ymy0 ymy0Var : list) {
                if (z || !hny0.m136293D0(ymy0Var.f200729c)) {
                    arrayList.add(new zzon(ymy0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f116991a.zzj().m114558A().m153302c("Failed to get user properties. appId", d6x0.m114551p(zzoVar.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.f116991a.zzj().m114558A().m153302c("Failed to get user properties. appId", d6x0.m114551p(zzoVar.zza), e);
            return null;
        }
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: e7 */
    public final void mo112715e7(zzo zzoVar) {
        m142241g7(zzoVar, false);
        m142244n8(new uvx0(this, zzoVar));
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: g3 */
    public final void mo112716g3(zzae zzaeVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        m142241g7(zzoVar, false);
        zzae zzaeVar2 = new zzae(zzaeVar);
        zzaeVar2.zza = zzoVar.zza;
        m142244n8(new ewx0(this, zzaeVar2, zzoVar));
    }

    @BinderThread
    /* JADX INFO: renamed from: g7 */
    public final void m142241g7(zzo zzoVar, boolean z) {
        Preconditions.checkNotNull(zzoVar);
        Preconditions.checkNotEmpty(zzoVar.zza);
        m142242m4(zzoVar.zza, false);
        this.f116991a.m15362t0().m136352e0(zzoVar.zzb, zzoVar.zzp);
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: j1 */
    public final void mo112717j1(long j, String str, String str2, String str3) {
        m142244n8(new qvx0(this, str2, str3, str, j));
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: j8 */
    public final void mo112718j8(zzo zzoVar) {
        m142241g7(zzoVar, false);
        m142244n8(new mvx0(this, zzoVar));
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: m1 */
    public final List<zzae> mo112719m1(String str, String str2, String str3) {
        m142242m4(str, true);
        try {
            return (List) this.f116991a.zzl().m177837p(new pwx0(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f116991a.zzj().m114558A().m153301b("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    @BinderThread
    /* JADX INFO: renamed from: m4 */
    public final void m142242m4(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f116991a.zzj().m114558A().m153300a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f116992b == null) {
                    this.f116992b = Boolean.valueOf("com.google.android.gms".equals(this.f116993c) || UidVerifier.isGooglePlayServicesUid(this.f116991a.zza(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.f116991a.zza()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.f116992b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f116991a.zzj().m114558A().m153301b("Measurement Service called with invalid calling package. appId", d6x0.m114551p(str));
                throw e;
            }
        }
        if (this.f116993c == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f116991a.zza(), Binder.getCallingUid(), str)) {
            this.f116993c = str;
        }
        if (str.equals(this.f116993c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m5 */
    public final zzbf m142243m5(zzbf zzbfVar, zzo zzoVar) {
        zzbe zzbeVar;
        if (!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbfVar.zza) || (zzbeVar = zzbfVar.zzb) == null || zzbeVar.zza() == 0) {
            return zzbfVar;
        }
        String strM15381J = zzbfVar.zzb.m15381J("_cis");
        if (!"referrer broadcast".equals(strM15381J) && !"referrer API".equals(strM15381J)) {
            return zzbfVar;
        }
        this.f116991a.zzj().m114561D().m153301b("Event has been filtered ", zzbfVar.toString());
        return new zzbf("_cmpx", zzbfVar.zzb, zzbfVar.zzc, zzbfVar.zzd);
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: n7 */
    public final void mo112720n7(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        Preconditions.checkNotEmpty(zzaeVar.zza);
        m142242m4(zzaeVar.zza, true);
        m142244n8(new zvx0(this, new zzae(zzaeVar)));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n8 */
    public final void m142244n8(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f116991a.zzl().m177835D()) {
            runnable.run();
        } else {
            this.f116991a.zzl().m177841w(runnable);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final void m142245o8(zzbf zzbfVar, zzo zzoVar) {
        boolean zM129607d;
        if (!this.f116991a.m15350m0().m15181Q(zzoVar.zza)) {
            m142246p8(zzbfVar, zzoVar);
            return;
        }
        this.f116991a.zzj().m114562E().m153301b("EES config found for", zzoVar.zza);
        C2479e c2479eM15350m0 = this.f116991a.m15350m0();
        String str = zzoVar.zza;
        g9s0 g9s0VarM210954d = TextUtils.isEmpty(str) ? null : c2479eM15350m0.f10515j.m210954d(str);
        C2484j c2484j = this.f116991a;
        if (g9s0VarM210954d == null) {
            c2484j.zzj().m114562E().m153301b("EES not loaded for", zzoVar.zza);
            m142246p8(zzbfVar, zzoVar);
            return;
        }
        try {
            Map<String, Object> mapM201881J = c2484j.m15360s0().m201881J(zzbfVar.zzb.m15378F(), true);
            String strM128475a = g0y0.m128475a(zzbfVar.zza);
            if (strM128475a == null) {
                strM128475a = zzbfVar.zza;
            }
            zM129607d = g9s0VarM210954d.m129607d(new efr0(strM128475a, zzbfVar.zzd, mapM201881J));
        } catch (zzc unused) {
            this.f116991a.zzj().m114558A().m153302c("EES error. appId, eventName", zzoVar.zzb, zzbfVar.zza);
            zM129607d = false;
        }
        if (!zM129607d) {
            this.f116991a.zzj().m114562E().m153301b("EES was not applied to event", zzbfVar.zza);
            m142246p8(zzbfVar, zzoVar);
            return;
        }
        if (g9s0VarM210954d.m129610g()) {
            this.f116991a.zzj().m114562E().m153301b("EES edited event", zzbfVar.zza);
            m142246p8(this.f116991a.m15360s0().m201875A(g9s0VarM210954d.m129604a().m185506d()), zzoVar);
        } else {
            m142246p8(zzbfVar, zzoVar);
        }
        if (g9s0VarM210954d.m129609f()) {
            for (efr0 efr0Var : g9s0VarM210954d.m129604a().m185508f()) {
                this.f116991a.zzj().m114562E().m153301b("EES logging created event", efr0Var.m120713e());
                m142246p8(this.f116991a.m15360s0().m201875A(efr0Var), zzoVar);
            }
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final void m142246p8(zzbf zzbfVar, zzo zzoVar) {
        this.f116991a.m15364u0();
        this.f116991a.m15356q(zzbfVar, zzoVar);
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: q6 */
    public final void mo141997q6(final Bundle bundle, zzo zzoVar) {
        if (mjy0.m158647a() && this.f116991a.m15339d0().m98440n(whs0.f189267h1)) {
            m142241g7(zzoVar, false);
            final String str = zzoVar.zza;
            Preconditions.checkNotNull(str);
            m142244n8(new Runnable() { // from class: l.sux0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170770a.m142238M6(bundle, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m142247q8(zzo zzoVar) {
        this.f116991a.m15364u0();
        this.f116991a.m15345h0(zzoVar);
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: r4 */
    public final void mo112721r4(zzbf zzbfVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbfVar);
        m142241g7(zzoVar, false);
        m142244n8(new hxx0(this, zzbfVar, zzoVar));
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m142248r8(zzo zzoVar) {
        this.f116991a.m15364u0();
        this.f116991a.m15348j0(zzoVar);
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: t6 */
    public final void mo112722t6(zzo zzoVar) {
        m142241g7(zzoVar, false);
        m142244n8(new ivx0(this, zzoVar));
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: x7 */
    public final void mo112723x7(final zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        m142239P3(new Runnable() { // from class: l.wux0
            @Override // java.lang.Runnable
            public final void run() {
                this.f190894a.m142248r8(zzoVar);
            }
        });
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: y5 */
    public final void mo112724y5(zzbf zzbfVar, String str, String str2) {
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotEmpty(str);
        m142242m4(str, true);
        m142244n8(new vxx0(this, zzbfVar, str));
    }

    @Override // p153l.isw0
    @BinderThread
    /* JADX INFO: renamed from: z0 */
    public final List<zzae> mo112725z0(String str, String str2, zzo zzoVar) {
        m142241g7(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.f116991a.zzl().m177837p(new uwx0(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f116991a.zzj().m114558A().m153301b("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    public iux0(C2484j c2484j) {
        this(c2484j, null);
    }
}
