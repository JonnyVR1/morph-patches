package p153l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class vtr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f185738b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f185739c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uws0 f185740d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s3s0 f185741e;

    public vtr0(s3s0 s3s0Var, Context context, String str, uws0 uws0Var) {
        this.f185738b = context;
        this.f185739c = str;
        this.f185740d = uws0Var;
        this.f185741e = s3s0Var;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f185738b, "native_ad");
        return new nqv0();
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12292F1(h950.m134038Y2(this.f185738b), this.f185739c, this.f185740d, 240304000);
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        sgs0.m185829a(this.f185738b);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168342ia)).booleanValue()) {
            return this.f185741e.f166029b.m173787a(this.f185738b, this.f185739c, this.f185740d);
        }
        try {
            IBinder iBinderM183221m4 = ((rus0) gct0.m129904b(this.f185738b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new fct0() { // from class: l.ksr0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof rus0 ? (rus0) iInterfaceQueryLocalInterface : new rus0(obj);
                }
            })).m183221m4(h950.m134038Y2(this.f185738b), this.f185739c, this.f185740d, 240304000);
            if (iBinderM183221m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM183221m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof ats0 ? (ats0) iInterfaceQueryLocalInterface : new drs0(iBinderM183221m4);
        } catch (RemoteException e) {
            e = e;
            this.f185741e.f166035h = w2t0.m204592c(this.f185738b);
            this.f185741e.f166035h.mo204598b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (zzcef e2) {
            e = e2;
            this.f185741e.f166035h = w2t0.m204592c(this.f185738b);
            this.f185741e.f166035h.mo204598b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.f185741e.f166035h = w2t0.m204592c(this.f185738b);
            this.f185741e.f166035h.mo204598b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
