package p149l;

import android.util.SparseArray;
import com.google.android.gms.measurement.internal.C2458g;
import com.google.android.gms.measurement.internal.zzno;

/* JADX INFO: loaded from: classes6.dex */
public final class fvx0 implements saj<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzno f99483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f99484b;

    public fvx0(C2458g c2458g, zzno zznoVar) {
        this.f99483a = zznoVar;
        this.f99484b = c2458g;
    }

    /* JADX INFO: renamed from: a */
    public final void m123373a() {
        SparseArray<Long> sparseArrayM192693E = this.f99484b.mo15088d().m192693E();
        zzno zznoVar = this.f99483a;
        sparseArrayM192693E.put(zznoVar.zzc, Long.valueOf(zznoVar.zzb));
        this.f99484b.mo15088d().m192704p(sparseArrayM192693E);
    }

    @Override // p149l.saj
    public final void onFailure(Throwable th) {
        this.f99484b.mo15092h();
        this.f99484b.f10493i = false;
        boolean zM192648n = this.f99484b.mo15085a().m192648n(q8s0.f153245O0);
        C2458g c2458g = this.f99484b;
        if (!zM192648n) {
            c2458g.m15167B0();
            this.f99484b.zzj().m211412A().m123937b("registerTriggerAsync failed with throwable", th);
            return;
        }
        int iM15160w = (c2458g.mo15085a().m192648n(q8s0.f153241M0) ? C2458g.m15160w(this.f99484b, th) : 2) - 1;
        if (iM15160w == 0) {
            this.f99484b.zzj().m211417F().m123938c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", xww0.m211405p(this.f99484b.mo15094j().m15106z()), xww0.m211405p(th.toString()));
            this.f99484b.f10494j = 1;
            this.f99484b.m15224u0().add(this.f99483a);
            return;
        }
        if (iM15160w != 1) {
            if (iM15160w != 2) {
                return;
            }
            this.f99484b.zzj().m211412A().m123938c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", xww0.m211405p(this.f99484b.mo15094j().m15106z()), th);
            m123373a();
            this.f99484b.f10494j = 1;
            this.f99484b.m15167B0();
            return;
        }
        this.f99484b.m15224u0().add(this.f99483a);
        int i = this.f99484b.f10494j;
        C2458g c2458g2 = this.f99484b;
        if (i > 32) {
            c2458g2.f10494j = 1;
            this.f99484b.zzj().m211417F().m123938c("registerTriggerAsync failed. May try later. App ID, throwable", xww0.m211405p(this.f99484b.mo15094j().m15106z()), xww0.m211405p(th.toString()));
            return;
        }
        c2458g2.zzj().m211417F().m123939d("registerTriggerAsync failed. App ID, delay in seconds, throwable", xww0.m211405p(this.f99484b.mo15094j().m15106z()), xww0.m211405p(String.valueOf(this.f99484b.f10494j)), xww0.m211405p(th.toString()));
        C2458g c2458g3 = this.f99484b;
        C2458g.m15150J0(c2458g3, c2458g3.f10494j);
        this.f99484b.f10494j <<= 1;
    }

    @Override // p149l.saj
    public final void onSuccess(Object obj) {
        this.f99484b.mo15092h();
        if (!this.f99484b.mo15085a().m192648n(q8s0.f153245O0)) {
            this.f99484b.f10493i = false;
            this.f99484b.m15167B0();
            this.f99484b.zzj().m211424z().m123937b("registerTriggerAsync ran. uri", this.f99483a.zza);
        } else {
            m123373a();
            this.f99484b.f10493i = false;
            this.f99484b.f10494j = 1;
            this.f99484b.zzj().m211424z().m123937b("Successfully registered trigger URI", this.f99483a.zza);
            this.f99484b.m15167B0();
        }
    }
}
