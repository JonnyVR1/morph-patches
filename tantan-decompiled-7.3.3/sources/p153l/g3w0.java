package p153l;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class g3w0 {
    /* JADX INFO: renamed from: a */
    public static void m128762a(AtomicReference atomicReference, f3w0 f3w0Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            f3w0Var.zza(obj);
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            dct0.m115299h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
