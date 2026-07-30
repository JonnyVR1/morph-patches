package p153l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes6.dex */
public final class rtr0 extends wzr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PendingIntent f164858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtr0(x0s0 x0s0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f164858a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f5u0) anyClient).m124235f(this.f164858a, x0s0.m208892a(this), null);
    }
}
