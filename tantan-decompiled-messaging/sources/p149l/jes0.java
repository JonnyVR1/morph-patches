package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class jes0 extends RemoteCreator {
    @VisibleForTesting
    public jes0() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ybs0 m141161a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderMo101123i1 = ((bcs0) getRemoteCreatorInstance(context)).mo101123i1(s050.m181848Y2(context), s050.m181848Y2(frameLayout), s050.m181848Y2(frameLayout2), 240304000);
            if (iBinderMo101123i1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo101123i1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof ybs0 ? (ybs0) iInterfaceQueryLocalInterface : new wbs0(iBinderMo101123i1);
        } catch (RemoteException e) {
            e = e;
            x2t0.m206870h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            x2t0.m206870h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof bcs0 ? (bcs0) iInterfaceQueryLocalInterface : new zbs0(iBinder);
    }
}
