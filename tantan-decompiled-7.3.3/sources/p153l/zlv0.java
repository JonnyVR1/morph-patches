package p153l;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class zlv0 implements n9u0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f205010a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final void m220303a(ycu0 ycu0Var) {
        this.f205010a.set(ycu0Var);
    }

    @Override // p153l.n9u0
    /* JADX INFO: renamed from: b */
    public final void mo162050b(final zzs zzsVar) {
        g3w0.m128762a(this.f205010a, new f3w0() { // from class: l.ylv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((ycu0) obj).mo153539F3(zzsVar);
            }
        });
    }
}
