package p149l;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class iss0 extends RemoteCreator {
    public iss0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final lss0 m138090a(Activity activity) {
        try {
            IBinder iBinderZze = ((oss0) getRemoteCreatorInstance(activity)).zze(s050.m181848Y2(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof lss0 ? (lss0) iInterfaceQueryLocalInterface : new jss0(iBinderZze);
        } catch (RemoteException e) {
            x2t0.m206870h("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            x2t0.m206870h("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof oss0 ? (oss0) iInterfaceQueryLocalInterface : new mss0(iBinder);
    }
}
