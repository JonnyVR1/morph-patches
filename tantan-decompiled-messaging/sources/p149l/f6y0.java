package p149l;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class f6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f96177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f96178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f96179c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f96180d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzo f96181e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ b3y0 f96182f;

    public f6y0(b3y0 b3y0Var, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar) {
        this.f96177a = atomicReference;
        this.f96178b = str;
        this.f96179c = str2;
        this.f96180d = str3;
        this.f96181e = zzoVar;
        this.f96182f = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f96177a) {
            try {
                try {
                    cjw0 cjw0Var = this.f96182f.f73268d;
                    if (cjw0Var == null) {
                        this.f96182f.zzj().m211412A().m123939d("(legacy) Failed to get conditional properties; not connected to service", xww0.m211405p(this.f96178b), this.f96179c, this.f96180d);
                        this.f96177a.set(Collections.EMPTY_LIST);
                        this.f96177a.notify();
                    } else {
                        if (TextUtils.isEmpty(this.f96178b)) {
                            Preconditions.checkNotNull(this.f96181e);
                            this.f96177a.set(cjw0Var.mo107282z0(this.f96179c, this.f96180d, this.f96181e));
                        } else {
                            this.f96177a.set(cjw0Var.mo107275m1(this.f96178b, this.f96179c, this.f96180d));
                        }
                        this.f96182f.m100127g0();
                        this.f96177a.notify();
                    }
                } catch (RemoteException e) {
                    this.f96182f.zzj().m211412A().m123939d("(legacy) Failed to get conditional properties; remote exception", xww0.m211405p(this.f96178b), this.f96179c, e);
                    this.f96177a.set(Collections.EMPTY_LIST);
                    this.f96177a.notify();
                }
            } catch (Throwable th) {
                this.f96177a.notify();
                throw th;
            }
        }
    }
}
