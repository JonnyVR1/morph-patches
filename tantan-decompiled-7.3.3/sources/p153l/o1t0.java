package p153l;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class o1t0 extends RemoteCreator {
    public o1t0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final r1t0 m165683a(Activity activity) {
        try {
            IBinder iBinderZze = ((u1t0) getRemoteCreatorInstance(activity)).zze(h950.m134038Y2(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof r1t0 ? (r1t0) iInterfaceQueryLocalInterface : new p1t0(iBinderZze);
        } catch (RemoteException e) {
            dct0.m115299h("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            dct0.m115299h("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof u1t0 ? (u1t0) iInterfaceQueryLocalInterface : new s1t0(iBinder);
    }
}
