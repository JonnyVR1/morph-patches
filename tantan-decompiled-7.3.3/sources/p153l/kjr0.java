package p153l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class kjr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f127136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uws0 f127137c;

    public kjr0(s3s0 s3s0Var, Context context, uws0 uws0Var) {
        this.f127136b = context;
        this.f127137c = uws0Var;
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        return null;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12303t1(h950.m134038Y2(this.f127136b), this.f127137c, 240304000);
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        try {
            return ((n1t0) gct0.m129904b(this.f127136b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new fct0() { // from class: l.uhr0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    return m1t0.m156719o8(obj);
                }
            })).mo152511s0(h950.m134038Y2(this.f127136b), this.f127137c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
