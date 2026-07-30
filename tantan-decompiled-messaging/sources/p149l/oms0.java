package p149l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes6.dex */
public final class oms0 extends cps0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PendingIntent f144686a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oms0(nqs0 nqs0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f144686a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220481p(this.f144686a, nqs0.m160694a(this));
    }
}
