package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ddy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f87972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f87973b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f87974c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hcy0 f87975d;

    public ddy0(hcy0 hcy0Var, AtomicReference atomicReference, zzo zzoVar, Bundle bundle) {
        this.f87972a = atomicReference;
        this.f87973b = zzoVar;
        this.f87974c = bundle;
        this.f87975d = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f87972a) {
            try {
                try {
                    isw0 isw0Var = this.f87975d.f108759d;
                    if (isw0Var == null) {
                        this.f87975d.zzj().m114558A().m153300a("Failed to get trigger URIs; not connected to service");
                        this.f87972a.notify();
                    } else {
                        Preconditions.checkNotNull(this.f87973b);
                        this.f87972a.set(isw0Var.mo112713V1(this.f87973b, this.f87974c));
                        this.f87975d.m134527g0();
                        this.f87972a.notify();
                    }
                } catch (RemoteException e) {
                    this.f87975d.zzj().m114558A().m153301b("Failed to get trigger URIs; remote exception", e);
                    this.f87972a.notify();
                }
            } catch (Throwable th) {
                this.f87972a.notify();
                throw th;
            }
        }
    }
}
