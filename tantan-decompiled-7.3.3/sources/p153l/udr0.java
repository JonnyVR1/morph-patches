package p153l;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class udr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f178586b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uws0 f178587c;

    public udr0(s3s0 s3s0Var, Context context, uws0 uws0Var) {
        this.f178586b = context;
        this.f178587c = uws0Var;
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f178586b, "out_of_context_tester");
        return null;
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        Context context = this.f178586b;
        p1m p1mVarM134038Y2 = h950.m134038Y2(context);
        sgs0.m185829a(context);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168393m9)).booleanValue()) {
            return tbt0Var.mo12301o6(p1mVarM134038Y2, this.f178587c, 240304000);
        }
        return null;
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        Context context = this.f178586b;
        p1m p1mVarM134038Y2 = h950.m134038Y2(context);
        sgs0.m185829a(context);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168393m9)).booleanValue()) {
            try {
                return ((aiu0) gct0.m129904b(this.f178586b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new fct0() { // from class: l.kcr0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p153l.fct0
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        return iInterfaceQueryLocalInterface instanceof aiu0 ? (aiu0) iInterfaceQueryLocalInterface : new aiu0(obj);
                    }
                })).m98026m4(p1mVarM134038Y2, this.f178587c, 240304000);
            } catch (RemoteException | zzcef | NullPointerException e) {
                w2t0.m204592c(this.f178586b).mo204598b(e, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}
