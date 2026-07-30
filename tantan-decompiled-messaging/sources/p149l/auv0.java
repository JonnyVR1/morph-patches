package p149l;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class auv0 {
    /* JADX INFO: renamed from: a */
    public static void m99090a(AtomicReference atomicReference, ztv0 ztv0Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            ztv0Var.zza(obj);
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            x2t0.m206870h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
