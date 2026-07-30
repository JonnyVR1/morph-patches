package p149l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class l7r0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f126739b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ons0 f126740c;

    public l7r0(mur0 mur0Var, Context context, ons0 ons0Var) {
        this.f126739b = context;
        this.f126740c = ons0Var;
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
        return n2t0Var.mo12235E0(s050.m181848Y2(this.f126739b), this.f126740c, 240304000);
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        try {
            return ((b1t0) a3t0.m94733b(this.f126739b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new z2t0() { // from class: l.a6r0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    return a1t0.m94574o8(obj);
                }
            })).mo99873s0(s050.m181848Y2(this.f126739b), this.f126740c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
