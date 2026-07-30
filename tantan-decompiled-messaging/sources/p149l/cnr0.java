package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class cnr0 extends tvr0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f81685b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mur0 f81686c;

    public cnr0(mur0 mur0Var, Context context) {
        this.f81685b = context;
        this.f81686c = mur0Var;
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96268a() {
        mur0.m156440q(this.f81685b, "mobile_ads_settings");
        return new fmv0();
    }

    @Override // p149l.tvr0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96269b(n2t0 n2t0Var) throws RemoteException {
        return n2t0Var.mo12248q0(s050.m181848Y2(this.f81685b), 240304000);
    }

    @Override // p149l.tvr0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96270c() throws RemoteException {
        m7s0.m153417a(this.f81685b);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132271ia)).booleanValue()) {
            return this.f81686c.f135837c.m149369a(this.f81685b);
        }
        try {
            IBinder iBinderM198389m4 = ((vgt0) a3t0.m94733b(this.f81685b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new z2t0() { // from class: l.zlr0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof vgt0 ? (vgt0) iInterfaceQueryLocalInterface : new vgt0(obj);
                }
            })).m198389m4(s050.m181848Y2(this.f81685b), 240304000);
            if (iBinderM198389m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM198389m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof gft0 ? (gft0) iInterfaceQueryLocalInterface : new rct0(iBinderM198389m4);
        } catch (RemoteException e) {
            e = e;
            this.f81686c.f135842h = qts0.m176477c(this.f81685b);
            this.f81686c.f135842h.mo176483b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (zzcef e2) {
            e = e2;
            this.f81686c.f135842h = qts0.m176477c(this.f81685b);
            this.f81686c.f135842h.mo176483b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.f81686c.f135842h = qts0.m176477c(this.f81685b);
            this.f81686c.f135842h.mo176483b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
