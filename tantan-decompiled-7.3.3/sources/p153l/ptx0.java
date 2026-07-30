package p153l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes6.dex */
public final class ptx0 extends RemoteCreator {
    public ptx0() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ats0 m173787a(Context context, String str, uws0 uws0Var) {
        try {
            IBinder iBinderM183221m4 = ((rus0) getRemoteCreatorInstance(context)).m183221m4(h950.m134038Y2(context), str, uws0Var, 240304000);
            if (iBinderM183221m4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM183221m4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof ats0 ? (ats0) iInterfaceQueryLocalInterface : new drs0(iBinderM183221m4);
        } catch (RemoteException e) {
            e = e;
            dct0.m115299h("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            dct0.m115299h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof rus0 ? (rus0) iInterfaceQueryLocalInterface : new rus0(iBinder);
    }
}
