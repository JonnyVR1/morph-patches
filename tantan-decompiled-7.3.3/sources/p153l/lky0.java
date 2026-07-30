package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lky0<R extends Result> extends BaseImplementation.ApiMethodImpl<R, fry0> {
    public lky0(GoogleApiClient googleApiClient) {
        super(vd1.f183514f, googleApiClient);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo109502a(Context context, j3z0 j3z0Var) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        fry0 fry0Var = (fry0) anyClient;
        mo109502a(fry0Var.getContext(), (j3z0) fry0Var.getService());
    }
}
