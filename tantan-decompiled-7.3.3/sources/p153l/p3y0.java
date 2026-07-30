package p153l;

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
public final class p3y0 extends RemoteCreator {

    /* JADX INFO: renamed from: a */
    public y2t0 f150478a;

    @VisibleForTesting
    public p3y0() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final oys0 m170508a(Context context, zzq zzqVar, String str, uws0 uws0Var, int i) {
        sgs0.m185829a(context);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168342ia)).booleanValue()) {
            try {
                IBinder iBinderM174620m4 = ((pzs0) getRemoteCreatorInstance(context)).m174620m4(h950.m134038Y2(context), zzqVar, str, uws0Var, 240304000, i);
                if (iBinderM174620m4 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderM174620m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof oys0 ? (oys0) iInterfaceQueryLocalInterface : new yvs0(iBinderM174620m4);
            } catch (RemoteException e) {
                e = e;
                dct0.m115294c("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e2) {
                e = e2;
                dct0.m115294c("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderM174620m5 = ((pzs0) gct0.m129904b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new fct0() { // from class: l.vyx0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof pzs0 ? (pzs0) iInterfaceQueryLocalInterface2 : new pzs0(obj);
                }
            })).m174620m4(h950.m134038Y2(context), zzqVar, str, uws0Var, 240304000, i);
            if (iBinderM174620m5 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderM174620m5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof oys0 ? (oys0) iInterfaceQueryLocalInterface2 : new yvs0(iBinderM174620m5);
        } catch (RemoteException e3) {
            e = e3;
            Throwable th = e;
            y2t0 y2t0VarM204592c = w2t0.m204592c(context);
            this.f150478a = y2t0VarM204592c;
            y2t0VarM204592c.mo204598b(th, "AdManagerCreator.newAdManagerByDynamiteLoader");
            dct0.m115300i("#007 Could not call remote method.", th);
            return null;
        } catch (zzcef e4) {
            e = e4;
            Throwable th2 = e;
            y2t0 y2t0VarM204592c2 = w2t0.m204592c(context);
            this.f150478a = y2t0VarM204592c2;
            y2t0VarM204592c2.mo204598b(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            dct0.m115300i("#007 Could not call remote method.", th2);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            Throwable th3 = e;
            y2t0 y2t0VarM204592c3 = w2t0.m204592c(context);
            this.f150478a = y2t0VarM204592c3;
            y2t0VarM204592c3.mo204598b(th3, "AdManagerCreator.newAdManagerByDynamiteLoader");
            dct0.m115300i("#007 Could not call remote method.", th3);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof pzs0 ? (pzs0) iInterfaceQueryLocalInterface : new pzs0(iBinder);
    }
}
