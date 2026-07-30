package p149l;

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
import com.google.android.gms.measurement.internal.C2456e;
import com.google.android.gms.measurement.internal.C2461j;
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
public final class clx0 extends ylw0 {

    /* JADX INFO: renamed from: a */
    public final C2461j f81477a;

    /* JADX INFO: renamed from: b */
    public Boolean f81478b;

    /* JADX INFO: renamed from: c */
    public String f81479c;

    public clx0(C2461j c2461j, String str) {
        Preconditions.checkNotNull(c2461j);
        this.f81477a = c2461j;
        this.f81479c = null;
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: I0 */
    public final List<zzon> mo107259I0(String str, String str2, String str3, boolean z) {
        m107586m4(str, true);
        try {
            List<sdy0> list = (List) this.f81477a.zzl().m146301p(new bnx0(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (sdy0 sdy0Var : list) {
                if (z || !bey0.m101426D0(sdy0Var.f163922c)) {
                    arrayList.add(new zzon(sdy0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f81477a.zzj().m211412A().m123938c("Failed to get user properties as. appId", xww0.m211405p(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.f81477a.zzj().m211412A().m123938c("Failed to get user properties as. appId", xww0.m211405p(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: J6 */
    public final void mo107260J6(zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        m107586m4(zzoVar.zza, false);
        m107588n8(new wnx0(this, zzoVar));
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: K6 */
    public final void mo107261K6(final Bundle bundle, zzo zzoVar) {
        m107585g7(zzoVar, false);
        final String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        m107588n8(new Runnable() { // from class: l.slx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f165307a.m107584Y2(bundle, str);
            }
        });
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: L5 */
    public final zzaj mo107262L5(zzo zzoVar) {
        m107585g7(zzoVar, false);
        Preconditions.checkNotEmpty(zzoVar.zza);
        try {
            return (zzaj) this.f81477a.zzl().m146304u(new fox0(this, zzoVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f81477a.zzj().m211412A().m123938c("Failed to get consent. appId", xww0.m211405p(zzoVar.zza), e);
            return new zzaj(null);
        }
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: L6 */
    public final void mo107263L6(zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        m107583P3(new snx0(this, zzoVar));
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m107582M6(Bundle bundle, String str) {
        boolean zIsEmpty = bundle.isEmpty();
        C2461j c2461j = this.f81477a;
        if (zIsEmpty) {
            c2461j.m15290g0().m136139X0(str);
        } else {
            c2461j.m15290g0().m136175z0(str, bundle);
            this.f81477a.m15290g0().m136122P(str, bundle);
        }
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: M7 */
    public final List<zzon> mo107264M7(String str, String str2, boolean z, zzo zzoVar) {
        m107585g7(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<sdy0> list = (List) this.f81477a.zzl().m146301p(new fnx0(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (sdy0 sdy0Var : list) {
                if (z || !bey0.m101426D0(sdy0Var.f163922c)) {
                    arrayList.add(new zzon(sdy0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f81477a.zzj().m211412A().m123938c("Failed to query user properties. appId", xww0.m211405p(zzoVar.zza), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.f81477a.zzj().m211412A().m123938c("Failed to query user properties. appId", xww0.m211405p(zzoVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: P3 */
    public final void m107583P3(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f81477a.zzl().m146299D()) {
            runnable.run();
        } else {
            this.f81477a.zzl().m146298A(runnable);
        }
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: Q4 */
    public final void mo107265Q4(zzon zzonVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzonVar);
        m107585g7(zzoVar, false);
        m107588n8(new xox0(this, zzonVar, zzoVar));
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: U6 */
    public final String mo107266U6(zzo zzoVar) {
        m107585g7(zzoVar, false);
        return this.f81477a.m15268Q(zzoVar);
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: U7 */
    public final void mo107267U7(final zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        m107583P3(new Runnable() { // from class: l.xlx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193506a.m107591q8(zzoVar);
            }
        });
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: V1 */
    public final List<zzno> mo107268V1(zzo zzoVar, Bundle bundle) {
        m107585g7(zzoVar, false);
        Preconditions.checkNotNull(zzoVar.zza);
        try {
            return (List) this.f81477a.zzl().m146301p(new uox0(this, zzoVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f81477a.zzj().m211412A().m123938c("Failed to get trigger URIs. appId", xww0.m211405p(zzoVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: V7 */
    public final byte[] mo107269V7(zzbf zzbfVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbfVar);
        m107586m4(str, true);
        this.f81477a.zzj().m211424z().m123937b("Log and bundle. event", this.f81477a.m15293i0().m175776c(zzbfVar.zza));
        long jNanoTime = this.f81477a.zzb().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f81477a.zzl().m146304u(new kox0(this, zzbfVar, str)).get();
            if (bArr == null) {
                this.f81477a.zzj().m211412A().m123937b("Log and bundle returned null. appId", xww0.m211405p(str));
                bArr = new byte[0];
            }
            this.f81477a.zzj().m211424z().m123939d("Log and bundle processed. event, size, time_ms", this.f81477a.m15293i0().m175776c(zzbfVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.f81477a.zzb().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            this.f81477a.zzj().m211412A().m123939d("Failed to log and bundle. appId, event, error", xww0.m211405p(str), this.f81477a.m15293i0().m175776c(zzbfVar.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.f81477a.zzj().m211412A().m123939d("Failed to log and bundle. appId, event, error", xww0.m211405p(str), this.f81477a.m15293i0().m175776c(zzbfVar.zza), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m107584Y2(Bundle bundle, String str) {
        boolean zM192648n = this.f81477a.m15285d0().m192648n(q8s0.f153285f1);
        boolean zM192648n2 = this.f81477a.m15285d0().m192648n(q8s0.f153291h1);
        if (bundle.isEmpty() && zM192648n && zM192648n2) {
            this.f81477a.m15290g0().m136139X0(str);
            return;
        }
        this.f81477a.m15290g0().m136175z0(str, bundle);
        if (zM192648n2 && this.f81477a.m15290g0().m136147b1(str)) {
            this.f81477a.m15290g0().m136122P(str, bundle);
        }
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: Z1 */
    public final List<zzon> mo107270Z1(zzo zzoVar, boolean z) {
        m107585g7(zzoVar, false);
        String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<sdy0> list = (List) this.f81477a.zzl().m146301p(new xpx0(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (sdy0 sdy0Var : list) {
                if (z || !bey0.m101426D0(sdy0Var.f163922c)) {
                    arrayList.add(new zzon(sdy0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f81477a.zzj().m211412A().m123938c("Failed to get user properties. appId", xww0.m211405p(zzoVar.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.f81477a.zzj().m211412A().m123938c("Failed to get user properties. appId", xww0.m211405p(zzoVar.zza), e);
            return null;
        }
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: e7 */
    public final void mo107271e7(zzo zzoVar) {
        m107585g7(zzoVar, false);
        m107588n8(new omx0(this, zzoVar));
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: g3 */
    public final void mo107272g3(zzae zzaeVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        m107585g7(zzoVar, false);
        zzae zzaeVar2 = new zzae(zzaeVar);
        zzaeVar2.zza = zzoVar.zza;
        m107588n8(new ymx0(this, zzaeVar2, zzoVar));
    }

    @BinderThread
    /* JADX INFO: renamed from: g7 */
    public final void m107585g7(zzo zzoVar, boolean z) {
        Preconditions.checkNotNull(zzoVar);
        Preconditions.checkNotEmpty(zzoVar.zza);
        m107586m4(zzoVar.zza, false);
        this.f81477a.m15308t0().m101485e0(zzoVar.zzb, zzoVar.zzp);
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: j1 */
    public final void mo107273j1(long j, String str, String str2, String str3) {
        m107588n8(new kmx0(this, str2, str3, str, j));
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: j8 */
    public final void mo107274j8(zzo zzoVar) {
        m107585g7(zzoVar, false);
        m107588n8(new gmx0(this, zzoVar));
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: m1 */
    public final List<zzae> mo107275m1(String str, String str2, String str3) {
        m107586m4(str, true);
        try {
            return (List) this.f81477a.zzl().m146301p(new jnx0(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f81477a.zzj().m211412A().m123937b("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    @BinderThread
    /* JADX INFO: renamed from: m4 */
    public final void m107586m4(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f81477a.zzj().m211412A().m123936a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f81478b == null) {
                    this.f81478b = Boolean.valueOf("com.google.android.gms".equals(this.f81479c) || UidVerifier.isGooglePlayServicesUid(this.f81477a.zza(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.f81477a.zza()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.f81478b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f81477a.zzj().m211412A().m123937b("Measurement Service called with invalid calling package. appId", xww0.m211405p(str));
                throw e;
            }
        }
        if (this.f81479c == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f81477a.zza(), Binder.getCallingUid(), str)) {
            this.f81479c = str;
        }
        if (str.equals(this.f81479c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m5 */
    public final zzbf m107587m5(zzbf zzbfVar, zzo zzoVar) {
        zzbe zzbeVar;
        if (!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbfVar.zza) || (zzbeVar = zzbfVar.zzb) == null || zzbeVar.zza() == 0) {
            return zzbfVar;
        }
        String strM15327J = zzbfVar.zzb.m15327J("_cis");
        if (!"referrer broadcast".equals(strM15327J) && !"referrer API".equals(strM15327J)) {
            return zzbfVar;
        }
        this.f81477a.zzj().m211415D().m123937b("Event has been filtered ", zzbfVar.toString());
        return new zzbf("_cmpx", zzbfVar.zzb, zzbfVar.zzc, zzbfVar.zzd);
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: n7 */
    public final void mo107276n7(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        Preconditions.checkNotEmpty(zzaeVar.zza);
        m107586m4(zzaeVar.zza, true);
        m107588n8(new tmx0(this, new zzae(zzaeVar)));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n8 */
    public final void m107588n8(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f81477a.zzl().m146299D()) {
            runnable.run();
        } else {
            this.f81477a.zzl().m146305w(runnable);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final void m107589o8(zzbf zzbfVar, zzo zzoVar) {
        boolean zM94480d;
        if (!this.f81477a.m15296m0().m15127Q(zzoVar.zza)) {
            m107590p8(zzbfVar, zzoVar);
            return;
        }
        this.f81477a.zzj().m211416E().m123937b("EES config found for", zzoVar.zza);
        C2456e c2456eM15296m0 = this.f81477a.m15296m0();
        String str = zzoVar.zza;
        a0s0 a0s0VarM218420d = TextUtils.isEmpty(str) ? null : c2456eM15296m0.f10478j.m218420d(str);
        C2461j c2461j = this.f81477a;
        if (a0s0VarM218420d == null) {
            c2461j.zzj().m211416E().m123937b("EES not loaded for", zzoVar.zza);
            m107590p8(zzbfVar, zzoVar);
            return;
        }
        try {
            Map<String, Object> mapM168476J = c2461j.m15306s0().m168476J(zzbfVar.zzb.m15324F(), true);
            String strM98575a = arx0.m98575a(zzbfVar.zza);
            if (strM98575a == null) {
                strM98575a = zzbfVar.zza;
            }
            zM94480d = a0s0VarM218420d.m94480d(new y5r0(strM98575a, zzbfVar.zzd, mapM168476J));
        } catch (zzc unused) {
            this.f81477a.zzj().m211412A().m123938c("EES error. appId, eventName", zzoVar.zzb, zzbfVar.zza);
            zM94480d = false;
        }
        if (!zM94480d) {
            this.f81477a.zzj().m211416E().m123937b("EES was not applied to event", zzbfVar.zza);
            m107590p8(zzbfVar, zzoVar);
            return;
        }
        if (a0s0VarM218420d.m94483g()) {
            this.f81477a.zzj().m211416E().m123937b("EES edited event", zzbfVar.zza);
            m107590p8(this.f81477a.m15306s0().m168470A(a0s0VarM218420d.m94477a().m153094d()), zzoVar);
        } else {
            m107590p8(zzbfVar, zzoVar);
        }
        if (a0s0VarM218420d.m94482f()) {
            for (y5r0 y5r0Var : a0s0VarM218420d.m94477a().m153096f()) {
                this.f81477a.zzj().m211416E().m123937b("EES logging created event", y5r0Var.m213014e());
                m107590p8(this.f81477a.m15306s0().m168470A(y5r0Var), zzoVar);
            }
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final void m107590p8(zzbf zzbfVar, zzo zzoVar) {
        this.f81477a.m15310u0();
        this.f81477a.m15302q(zzbfVar, zzoVar);
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: q6 */
    public final void mo107277q6(final Bundle bundle, zzo zzoVar) {
        if (gay0.m125042a() && this.f81477a.m15285d0().m192648n(q8s0.f153291h1)) {
            m107585g7(zzoVar, false);
            final String str = zzoVar.zza;
            Preconditions.checkNotNull(str);
            m107588n8(new Runnable() { // from class: l.mlx0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134536a.m107582M6(bundle, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m107591q8(zzo zzoVar) {
        this.f81477a.m15310u0();
        this.f81477a.m15291h0(zzoVar);
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: r4 */
    public final void mo107278r4(zzbf zzbfVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbfVar);
        m107585g7(zzoVar, false);
        m107588n8(new box0(this, zzbfVar, zzoVar));
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m107592r8(zzo zzoVar) {
        this.f81477a.m15310u0();
        this.f81477a.m15294j0(zzoVar);
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: t6 */
    public final void mo107279t6(zzo zzoVar) {
        m107585g7(zzoVar, false);
        m107588n8(new cmx0(this, zzoVar));
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: x7 */
    public final void mo107280x7(final zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        m107583P3(new Runnable() { // from class: l.qlx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155266a.m107592r8(zzoVar);
            }
        });
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: y5 */
    public final void mo107281y5(zzbf zzbfVar, String str, String str2) {
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotEmpty(str);
        m107586m4(str, true);
        m107588n8(new pox0(this, zzbfVar, str));
    }

    @Override // p149l.cjw0
    @BinderThread
    /* JADX INFO: renamed from: z0 */
    public final List<zzae> mo107282z0(String str, String str2, zzo zzoVar) {
        m107585g7(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.f81477a.zzl().m146301p(new onx0(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f81477a.zzj().m211412A().m123937b("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    public clx0(C2461j c2461j) {
        this(c2461j, null);
    }
}
