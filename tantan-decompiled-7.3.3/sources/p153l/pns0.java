package p153l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class pns0 extends RemoteCreator {
    @VisibleForTesting
    public pns0() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final els0 m173082a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderMo126168i1 = ((hls0) getRemoteCreatorInstance(context)).mo126168i1(h950.m134038Y2(context), h950.m134038Y2(frameLayout), h950.m134038Y2(frameLayout2), 240304000);
            if (iBinderMo126168i1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo126168i1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof els0 ? (els0) iInterfaceQueryLocalInterface : new cls0(iBinderMo126168i1);
        } catch (RemoteException e) {
            e = e;
            dct0.m115299h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            dct0.m115299h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof hls0 ? (hls0) iInterfaceQueryLocalInterface : new fls0(iBinder);
    }
}
