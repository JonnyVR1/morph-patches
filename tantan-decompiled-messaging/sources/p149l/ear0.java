package p149l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class ear0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f90239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ons0 f90240c;

    public ear0(mur0 mur0Var, Context context, ons0 ons0Var) {
        this.f90239b = context;
        this.f90240c = ons0Var;
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        return null;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12249t1(s050.m181848Y2(this.f90239b), this.f90240c, 240304000);
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        try {
            return ((hss0) a3t0.m94733b(this.f90239b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new z2t0() { // from class: l.o8r0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    return gss0.m127838o8(obj);
                }
            })).mo122956s0(s050.m181848Y2(this.f90239b), this.f90240c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
