package p149l;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes6.dex */
public final class lkr0 extends qqr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PendingIntent f128597a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkr0(rrr0 rrr0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f128597a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220471f(this.f128597a, rrr0.m180569a(this), null);
    }
}
