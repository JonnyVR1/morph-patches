package p153l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class iwr0 extends z4s0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f117291b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s3s0 f117292c;

    public iwr0(s3s0 s3s0Var, Context context) {
        this.f117291b = context;
        this.f117292c = s3s0Var;
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo96776a() {
        s3s0.m184296q(this.f117291b, "mobile_ads_settings");
        return new lvv0();
    }

    @Override // p153l.z4s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo96777b(tbt0 tbt0Var) throws RemoteException {
        return tbt0Var.mo12302q0(h950.m134038Y2(this.f117291b), 240304000);
    }

    @Override // p153l.z4s0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo96778c() throws RemoteException {
        sgs0.m185829a(this.f117291b);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168342ia)).booleanValue()) {
            return this.f117292c.f166030c.m182031a(this.f117291b);
        }
        try {
            IBinder iBinderM106008m4 = ((bqt0) gct0.m129904b(this.f117291b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new fct0() { // from class: l.fvr0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof bqt0 ? (bqt0) iInterfaceQueryLocalInterface : new bqt0(obj);
                }
            })).m106008m4(h950.m134038Y2(this.f117291b), 240304000);
            if (iBinderM106008m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM106008m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof mot0 ? (mot0) iInterfaceQueryLocalInterface : new xlt0(iBinderM106008m4);
        } catch (RemoteException e) {
            e = e;
            this.f117292c.f166035h = w2t0.m204592c(this.f117291b);
            this.f117292c.f166035h.mo204598b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (zzcef e2) {
            e = e2;
            this.f117292c.f166035h = w2t0.m204592c(this.f117291b);
            this.f117292c.f166035h.mo204598b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.f117292c.f166035h = w2t0.m204592c(this.f117291b);
            this.f117292c.f166035h.mo204598b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
