package p153l;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ols0 {

    /* JADX INFO: renamed from: a */
    public final bou0 f147868a;

    /* JADX INFO: renamed from: b */
    public final Executor f147869b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f147870c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f147871d = new AtomicReference();

    public ols0(bou0 bou0Var, Executor executor) {
        this.f147868a = bou0Var;
        this.f147869b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m168165a(e6s0 e6s0Var) {
        final AtomicReference atomicReference = this.f147871d;
        Objects.requireNonNull(atomicReference);
        e6s0Var.m119674g(new sfk0.InterfaceC20034b() { // from class: l.kbs0
            @Override // p153l.sfk0.InterfaceC20034b
            /* JADX INFO: renamed from: a */
            public final void mo98453a(vx5 vx5Var) {
                atomicReference.set(vx5Var);
            }
        }, new sfk0.InterfaceC20033a() { // from class: l.rcs0
            @Override // p153l.sfk0.InterfaceC20033a
            /* JADX INFO: renamed from: b */
            public final void mo140415b(m1j m1jVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(m1jVar.m156696a())));
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m168166b(sfk0.InterfaceC20034b interfaceC20034b, sfk0.InterfaceC20033a interfaceC20033a) {
        pot0.m173113a();
        eos0 eos0Var = (eos0) this.f147870c.get();
        if (eos0Var == null) {
            interfaceC20033a.mo140415b(new zzg(3, "No available form can be built.").zza());
        } else {
            ((tyr0) this.f147868a.zza()).mo110386a(eos0Var).zzb().zza().m119674g(interfaceC20034b, interfaceC20033a);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m168167c() {
        eos0 eos0Var = (eos0) this.f147870c.get();
        if (eos0Var == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final e6s0 e6s0VarZza = ((tyr0) this.f147868a.zza()).mo110386a(eos0Var).zzb().zza();
        e6s0VarZza.f92355l = true;
        pot0.f153428a.post(new Runnable() { // from class: l.das0
            @Override // java.lang.Runnable
            public final void run() {
                this.f85922a.m168165a(e6s0VarZza);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m168168d(eos0 eos0Var) {
        this.f147870c.set(eos0Var);
    }
}
