package p149l;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class tcv0 implements h0u0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f169479a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final void m188059a(s3u0 s3u0Var) {
        this.f169479a.set(s3u0Var);
    }

    @Override // p149l.h0u0
    /* JADX INFO: renamed from: b */
    public final void mo128978b(final zzs zzsVar) {
        auv0.m99090a(this.f169479a, new ztv0() { // from class: l.scv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((s3u0) obj).mo119144F3(zzsVar);
            }
        });
    }
}
