package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes6.dex */
public final class dwr0 extends wzr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f91040a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwr0(x0s0 x0s0Var, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.f91040a = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124232c(this.f91040a, x0s0.m208892a(this));
    }
}
