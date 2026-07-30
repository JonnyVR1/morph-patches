package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class jkx0 extends RemoteCreator {
    public jkx0() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ujs0 m141917a(Context context, String str, ons0 ons0Var) {
        try {
            IBinder iBinderM150551m4 = ((lls0) getRemoteCreatorInstance(context)).m150551m4(s050.m181848Y2(context), str, ons0Var, 240304000);
            if (iBinderM150551m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM150551m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof ujs0 ? (ujs0) iInterfaceQueryLocalInterface : new xhs0(iBinderM150551m4);
        } catch (RemoteException e) {
            e = e;
            x2t0.m206870h("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            x2t0.m206870h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof lls0 ? (lls0) iInterfaceQueryLocalInterface : new lls0(iBinder);
    }
}
