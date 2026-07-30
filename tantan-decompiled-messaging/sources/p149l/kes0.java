package p149l;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class kes0 extends RemoteCreator {
    @VisibleForTesting
    public kes0() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof fcs0 ? (fcs0) iInterfaceQueryLocalInterface : new ecs0(iBinder);
    }
}
