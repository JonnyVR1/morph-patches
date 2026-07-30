package p153l;

import android.util.SparseArray;
import com.google.android.gms.measurement.internal.C2481g;
import com.google.android.gms.measurement.internal.zzno;

/* JADX INFO: loaded from: classes6.dex */
public final class l4y0 implements mdj<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzno f130028a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f130029b;

    public l4y0(C2481g c2481g, zzno zznoVar) {
        this.f130028a = zznoVar;
        this.f130029b = c2481g;
    }

    /* JADX INFO: renamed from: a */
    public final void m152839a() {
        SparseArray<Long> sparseArrayM98508E = this.f130029b.mo15142d().m98508E();
        zzno zznoVar = this.f130028a;
        sparseArrayM98508E.put(zznoVar.zzc, Long.valueOf(zznoVar.zzb));
        this.f130029b.mo15142d().m98521p(sparseArrayM98508E);
    }

    @Override // p153l.mdj
    public final void onFailure(Throwable th) {
        this.f130029b.mo15146h();
        this.f130029b.f10530i = false;
        boolean zM98440n = this.f130029b.mo15139a().m98440n(whs0.f189221O0);
        C2481g c2481g = this.f130029b;
        if (!zM98440n) {
            c2481g.m15221B0();
            this.f130029b.zzj().m114558A().m153301b("registerTriggerAsync failed with throwable", th);
            return;
        }
        int iM15214w = (c2481g.mo15139a().m98440n(whs0.f189217M0) ? C2481g.m15214w(this.f130029b, th) : 2) - 1;
        if (iM15214w == 0) {
            this.f130029b.zzj().m114563F().m153302c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", d6x0.m114551p(this.f130029b.mo15148j().m15160z()), d6x0.m114551p(th.toString()));
            this.f130029b.f10531j = 1;
            this.f130029b.m15278u0().add(this.f130028a);
            return;
        }
        if (iM15214w != 1) {
            if (iM15214w != 2) {
                return;
            }
            this.f130029b.zzj().m114558A().m153302c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", d6x0.m114551p(this.f130029b.mo15148j().m15160z()), th);
            m152839a();
            this.f130029b.f10531j = 1;
            this.f130029b.m15221B0();
            return;
        }
        this.f130029b.m15278u0().add(this.f130028a);
        int i = this.f130029b.f10531j;
        C2481g c2481g2 = this.f130029b;
        if (i > 32) {
            c2481g2.f10531j = 1;
            this.f130029b.zzj().m114563F().m153302c("registerTriggerAsync failed. May try later. App ID, throwable", d6x0.m114551p(this.f130029b.mo15148j().m15160z()), d6x0.m114551p(th.toString()));
            return;
        }
        c2481g2.zzj().m114563F().m153303d("registerTriggerAsync failed. App ID, delay in seconds, throwable", d6x0.m114551p(this.f130029b.mo15148j().m15160z()), d6x0.m114551p(String.valueOf(this.f130029b.f10531j)), d6x0.m114551p(th.toString()));
        C2481g c2481g3 = this.f130029b;
        C2481g.m15204J0(c2481g3, c2481g3.f10531j);
        this.f130029b.f10531j <<= 1;
    }

    @Override // p153l.mdj
    public final void onSuccess(Object obj) {
        this.f130029b.mo15146h();
        if (!this.f130029b.mo15139a().m98440n(whs0.f189221O0)) {
            this.f130029b.f10530i = false;
            this.f130029b.m15221B0();
            this.f130029b.zzj().m114570z().m153301b("registerTriggerAsync ran. uri", this.f130028a.zza);
        } else {
            m152839a();
            this.f130029b.f10530i = false;
            this.f130029b.f10531j = 1;
            this.f130029b.zzj().m114570z().m153301b("Successfully registered trigger URI", this.f130028a.zza);
            this.f130029b.m15221B0();
        }
    }
}
