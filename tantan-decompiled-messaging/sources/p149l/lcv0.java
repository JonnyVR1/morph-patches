package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class lcv0 extends RemoteCreator {
    public lcv0() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final gft0 m149369a(Context context) {
        try {
            IBinder iBinderM198389m4 = ((vgt0) getRemoteCreatorInstance(context)).m198389m4(s050.m181848Y2(context), 240304000);
            if (iBinderM198389m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM198389m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof gft0 ? (gft0) iInterfaceQueryLocalInterface : new rct0(iBinderM198389m4);
        } catch (RemoteException e) {
            e = e;
            x2t0.m206870h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            x2t0.m206870h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof vgt0 ? (vgt0) iInterfaceQueryLocalInterface : new vgt0(iBinder);
    }
}
