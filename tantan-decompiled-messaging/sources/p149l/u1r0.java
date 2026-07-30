package p149l;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class u1r0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f173043b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mur0 f173044c;

    public u1r0(mur0 mur0Var, Activity activity) {
        this.f173043b = activity;
        this.f173044c = mur0Var;
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f173043b, "ad_overlay");
        return null;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12246g0(s050.m181848Y2(this.f173043b));
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        m7s0.m153417a(this.f173043b);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132271ia)).booleanValue()) {
            mur0 mur0Var = this.f173044c;
            return mur0Var.f135840f.m138090a(this.f173043b);
        }
        try {
            return kss0.m147103o8(((oss0) a3t0.m94733b(this.f173043b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new z2t0() { // from class: l.kxy0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    return nss0.m160792o8(obj);
                }
            })).zze(s050.m181848Y2(this.f173043b)));
        } catch (RemoteException | zzcef | NullPointerException e) {
            this.f173044c.f135842h = qts0.m176477c(this.f173043b.getApplicationContext());
            this.f173044c.f135842h.mo176483b(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
