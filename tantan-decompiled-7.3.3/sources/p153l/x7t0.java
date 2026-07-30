package p153l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class x7t0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final l7t0 m209651a(Context context, String str, uws0 uws0Var) {
        try {
            IBinder iBinderM171168m4 = ((p7t0) gct0.m129904b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new fct0() { // from class: l.w7t0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof p7t0 ? (p7t0) iInterfaceQueryLocalInterface : new p7t0(obj);
                }
            })).m171168m4(h950.m134038Y2(context), str, uws0Var, 240304000);
            if (iBinderM171168m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM171168m4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof l7t0 ? (l7t0) iInterfaceQueryLocalInterface : new j7t0(iBinderM171168m4);
        } catch (RemoteException e) {
            e = e;
            dct0.m115300i("#007 Could not call remote method.", e);
            return null;
        } catch (zzcef e2) {
            e = e2;
            dct0.m115300i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
