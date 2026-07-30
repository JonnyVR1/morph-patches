package p153l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class rgr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f163038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uws0 f163039c;

    public rgr0(s3s0 s3s0Var, Context context, uws0 uws0Var) {
        this.f163038b = context;
        this.f163039c = uws0Var;
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
        return tbt0Var.mo12289E0(h950.m134038Y2(this.f163038b), this.f163039c, 240304000);
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        try {
            return ((hat0) gct0.m129904b(this.f163038b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new fct0() { // from class: l.gfr0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    return gat0.m129745o8(obj);
                }
            })).mo124770s0(h950.m134038Y2(this.f163038b), this.f163039c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
