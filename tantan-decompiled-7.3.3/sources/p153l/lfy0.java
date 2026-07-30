package p153l;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class lfy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f131917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f131918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f131919c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f131920d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzo f131921e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hcy0 f131922f;

    public lfy0(hcy0 hcy0Var, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar) {
        this.f131917a = atomicReference;
        this.f131918b = str;
        this.f131919c = str2;
        this.f131920d = str3;
        this.f131921e = zzoVar;
        this.f131922f = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f131917a) {
            try {
                try {
                    isw0 isw0Var = this.f131922f.f108759d;
                    if (isw0Var == null) {
                        this.f131922f.zzj().m114558A().m153303d("(legacy) Failed to get conditional properties; not connected to service", d6x0.m114551p(this.f131918b), this.f131919c, this.f131920d);
                        this.f131917a.set(Collections.EMPTY_LIST);
                        this.f131917a.notify();
                    } else {
                        if (TextUtils.isEmpty(this.f131918b)) {
                            Preconditions.checkNotNull(this.f131921e);
                            this.f131917a.set(isw0Var.mo112725z0(this.f131919c, this.f131920d, this.f131921e));
                        } else {
                            this.f131917a.set(isw0Var.mo112719m1(this.f131918b, this.f131919c, this.f131920d));
                        }
                        this.f131922f.m134527g0();
                        this.f131917a.notify();
                    }
                } catch (RemoteException e) {
                    this.f131922f.zzj().m114558A().m153303d("(legacy) Failed to get conditional properties; remote exception", d6x0.m114551p(this.f131918b), this.f131919c, e);
                    this.f131917a.set(Collections.EMPTY_LIST);
                    this.f131917a.notify();
                }
            } catch (Throwable th) {
                this.f131917a.notify();
                throw th;
            }
        }
    }
}
