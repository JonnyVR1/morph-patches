package p149l;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ics0 {

    /* JADX INFO: renamed from: a */
    public final veu0 f112482a;

    /* JADX INFO: renamed from: b */
    public final Executor f112483b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f112484c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f112485d = new AtomicReference();

    public ics0(veu0 veu0Var, Executor executor) {
        this.f112482a = veu0Var;
        this.f112483b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m135365a(ywr0 ywr0Var) {
        final AtomicReference atomicReference = this.f112485d;
        Objects.requireNonNull(atomicReference);
        ywr0Var.m216417g(new m6k0.InterfaceC18404b() { // from class: l.e2s0
            @Override // p149l.m6k0.InterfaceC18404b
            /* JADX INFO: renamed from: a */
            public final void mo114527a(qw5 qw5Var) {
                atomicReference.set(qw5Var);
            }
        }, new m6k0.InterfaceC18403a() { // from class: l.l3s0
            @Override // p149l.m6k0.InterfaceC18403a
            /* JADX INFO: renamed from: b */
            public final void mo106024b(ryi ryiVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(ryiVar.m181664a())));
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m135366b(m6k0.InterfaceC18404b interfaceC18404b, m6k0.InterfaceC18403a interfaceC18403a) {
        jft0.m141214a();
        yes0 yes0Var = (yes0) this.f112484c.get();
        if (yes0Var == null) {
            interfaceC18403a.mo106024b(new zzg(3, "No available form can be built.").zza());
        } else {
            ((npr0) this.f112482a.zza()).mo160538a(yes0Var).zzb().zza().m216417g(interfaceC18404b, interfaceC18403a);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m135367c() {
        yes0 yes0Var = (yes0) this.f112484c.get();
        if (yes0Var == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final ywr0 ywr0VarZza = ((npr0) this.f112482a.zza()).mo160538a(yes0Var).zzb().zza();
        ywr0VarZza.f200536l = true;
        jft0.f117689a.post(new Runnable() { // from class: l.x0s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f188993a.m135365a(ywr0VarZza);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m135368d(yes0 yes0Var) {
        this.f112484c.set(yes0Var);
    }
}
