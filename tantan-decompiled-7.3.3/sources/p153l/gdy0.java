package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class gdy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f103753a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f103754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hcy0 f103755c;

    public gdy0(hcy0 hcy0Var, AtomicReference atomicReference, zzo zzoVar) {
        this.f103753a = atomicReference;
        this.f103754b = zzoVar;
        this.f103755c = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f103753a) {
            try {
                try {
                    boolean zM15412z = this.f103755c.mo15142d().m98510G().m15412z();
                    hcy0 hcy0Var = this.f103755c;
                    if (!zM15412z) {
                        hcy0Var.zzj().m114564G().m153300a("Analytics storage consent denied; will not get app instance id");
                        this.f103755c.mo15150l().m15249U0(null);
                        this.f103755c.mo15142d().f71902i.m105277b(null);
                        this.f103753a.set(null);
                        this.f103753a.notify();
                        return;
                    }
                    isw0 isw0Var = hcy0Var.f108759d;
                    if (isw0Var == null) {
                        this.f103755c.zzj().m114558A().m153300a("Failed to get app instance id");
                        this.f103753a.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.f103754b);
                    this.f103753a.set(isw0Var.mo112711U6(this.f103754b));
                    String str = (String) this.f103753a.get();
                    if (str != null) {
                        this.f103755c.mo15150l().m15249U0(str);
                        this.f103755c.mo15142d().f71902i.m105277b(str);
                    }
                    this.f103755c.m134527g0();
                    this.f103753a.notify();
                } catch (RemoteException e) {
                    this.f103755c.zzj().m114558A().m153301b("Failed to get app instance id", e);
                    this.f103753a.notify();
                }
            } catch (Throwable th) {
                this.f103753a.notify();
                throw th;
            }
        }
    }
}
