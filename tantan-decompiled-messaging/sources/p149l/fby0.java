package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fby0<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zhy0> {
    public fby0(GoogleApiClient googleApiClient) {
        super(od1.f143146f, googleApiClient);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo97221a(Context context, duy0 duy0Var) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zhy0 zhy0Var = (zhy0) anyClient;
        mo97221a(zhy0Var.getContext(), (duy0) zhy0Var.getService());
    }
}
