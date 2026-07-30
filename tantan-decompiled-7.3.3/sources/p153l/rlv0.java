package p153l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class rlv0 extends RemoteCreator {
    public rlv0() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final mot0 m182031a(Context context) {
        try {
            IBinder iBinderM106008m4 = ((bqt0) getRemoteCreatorInstance(context)).m106008m4(h950.m134038Y2(context), 240304000);
            if (iBinderM106008m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM106008m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof mot0 ? (mot0) iInterfaceQueryLocalInterface : new xlt0(iBinderM106008m4);
        } catch (RemoteException e) {
            e = e;
            dct0.m115299h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            dct0.m115299h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof bqt0 ? (bqt0) iInterfaceQueryLocalInterface : new bqt0(iBinder);
    }
}
