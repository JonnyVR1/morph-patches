package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class rys0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final fys0 m181711a(Context context, String str, ons0 ons0Var) {
        try {
            IBinder iBinderM143880m4 = ((jys0) a3t0.m94733b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new z2t0() { // from class: l.qys0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof jys0 ? (jys0) iInterfaceQueryLocalInterface : new jys0(obj);
                }
            })).m143880m4(s050.m181848Y2(context), str, ons0Var, 240304000);
            if (iBinderM143880m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM143880m4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof fys0 ? (fys0) iInterfaceQueryLocalInterface : new dys0(iBinderM143880m4);
        } catch (RemoteException e) {
            e = e;
            x2t0.m206871i("#007 Could not call remote method.", e);
            return null;
        } catch (zzcef e2) {
            e = e2;
            x2t0.m206871i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
