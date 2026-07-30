package p153l;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class qfy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f157361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f157362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f157363c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f157364d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzo f157365e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f157366f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ hcy0 f157367g;

    public qfy0(hcy0 hcy0Var, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar, boolean z) {
        this.f157361a = atomicReference;
        this.f157362b = str;
        this.f157363c = str2;
        this.f157364d = str3;
        this.f157365e = zzoVar;
        this.f157366f = z;
        this.f157367g = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f157361a) {
            try {
                try {
                    isw0 isw0Var = this.f157367g.f108759d;
                    if (isw0Var == null) {
                        this.f157367g.zzj().m114558A().m153303d("(legacy) Failed to get user properties; not connected to service", d6x0.m114551p(this.f157362b), this.f157363c, this.f157364d);
                        this.f157361a.set(Collections.EMPTY_LIST);
                        this.f157361a.notify();
                    } else {
                        if (TextUtils.isEmpty(this.f157362b)) {
                            Preconditions.checkNotNull(this.f157365e);
                            this.f157361a.set(isw0Var.mo112709M7(this.f157363c, this.f157364d, this.f157366f, this.f157365e));
                        } else {
                            this.f157361a.set(isw0Var.mo112704I0(this.f157362b, this.f157363c, this.f157364d, this.f157366f));
                        }
                        this.f157367g.m134527g0();
                        this.f157361a.notify();
                    }
                } catch (RemoteException e) {
                    this.f157367g.zzj().m114558A().m153303d("(legacy) Failed to get user properties; remote exception", d6x0.m114551p(this.f157362b), this.f157363c, e);
                    this.f157361a.set(Collections.EMPTY_LIST);
                    this.f157361a.notify();
                }
            } catch (Throwable th) {
                this.f157361a.notify();
                throw th;
            }
        }
    }
}
