package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class pkr0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f150023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f150024c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ons0 f150025d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mur0 f150026e;

    public pkr0(mur0 mur0Var, Context context, String str, ons0 ons0Var) {
        this.f150023b = context;
        this.f150024c = str;
        this.f150025d = ons0Var;
        this.f150026e = mur0Var;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f150023b, "native_ad");
        return new hhv0();
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12238F1(s050.m181848Y2(this.f150023b), this.f150024c, this.f150025d, 240304000);
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        m7s0.m153417a(this.f150023b);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132271ia)).booleanValue()) {
            return this.f150026e.f135836b.m141917a(this.f150023b, this.f150024c, this.f150025d);
        }
        try {
            IBinder iBinderM150551m4 = ((lls0) a3t0.m94733b(this.f150023b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new z2t0() { // from class: l.ejr0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof lls0 ? (lls0) iInterfaceQueryLocalInterface : new lls0(obj);
                }
            })).m150551m4(s050.m181848Y2(this.f150023b), this.f150024c, this.f150025d, 240304000);
            if (iBinderM150551m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM150551m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof ujs0 ? (ujs0) iInterfaceQueryLocalInterface : new xhs0(iBinderM150551m4);
        } catch (RemoteException e) {
            e = e;
            this.f150026e.f135842h = qts0.m176477c(this.f150023b);
            this.f150026e.f135842h.mo176483b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (zzcef e2) {
            e = e2;
            this.f150026e.f135842h = qts0.m176477c(this.f150023b);
            this.f150026e.f135842h.mo176483b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.f150026e.f135842h = qts0.m176477c(this.f150023b);
            this.f150026e.f135842h.mo176483b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
