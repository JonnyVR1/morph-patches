package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class jux0 extends RemoteCreator {

    /* JADX INFO: renamed from: a */
    public sts0 f119823a;

    @VisibleForTesting
    public jux0() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ips0 m143346a(Context context, zzq zzqVar, String str, ons0 ons0Var, int i) {
        m7s0.m153417a(context);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132271ia)).booleanValue()) {
            try {
                IBinder iBinderM142851m4 = ((jqs0) getRemoteCreatorInstance(context)).m142851m4(s050.m181848Y2(context), zzqVar, str, ons0Var, 240304000, i);
                if (iBinderM142851m4 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderM142851m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof ips0 ? (ips0) iInterfaceQueryLocalInterface : new sms0(iBinderM142851m4);
            } catch (RemoteException e) {
                e = e;
                x2t0.m206865c("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e2) {
                e = e2;
                x2t0.m206865c("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderM142851m5 = ((jqs0) a3t0.m94733b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new z2t0() { // from class: l.ppx0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof jqs0 ? (jqs0) iInterfaceQueryLocalInterface2 : new jqs0(obj);
                }
            })).m142851m4(s050.m181848Y2(context), zzqVar, str, ons0Var, 240304000, i);
            if (iBinderM142851m5 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderM142851m5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof ips0 ? (ips0) iInterfaceQueryLocalInterface2 : new sms0(iBinderM142851m5);
        } catch (RemoteException e3) {
            e = e3;
            Throwable th = e;
            sts0 sts0VarM176477c = qts0.m176477c(context);
            this.f119823a = sts0VarM176477c;
            sts0VarM176477c.mo176483b(th, "AdManagerCreator.newAdManagerByDynamiteLoader");
            x2t0.m206871i("#007 Could not call remote method.", th);
            return null;
        } catch (zzcef e4) {
            e = e4;
            Throwable th2 = e;
            sts0 sts0VarM176477c2 = qts0.m176477c(context);
            this.f119823a = sts0VarM176477c2;
            sts0VarM176477c2.mo176483b(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            x2t0.m206871i("#007 Could not call remote method.", th2);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            Throwable th3 = e;
            sts0 sts0VarM176477c3 = qts0.m176477c(context);
            this.f119823a = sts0VarM176477c3;
            sts0VarM176477c3.mo176483b(th3, "AdManagerCreator.newAdManagerByDynamiteLoader");
            x2t0.m206871i("#007 Could not call remote method.", th3);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof jqs0 ? (jqs0) iInterfaceQueryLocalInterface : new jqs0(iBinder);
    }
}
