package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

/* JADX INFO: loaded from: classes6.dex */
public final class ajr0 extends qqr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationListener f70136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajr0(rrr0 rrr0Var, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.f70136a = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220470e(ListenerHolders.createListenerKey(this.f70136a, LocationListener.class.getSimpleName()), true, rrr0.m180569a(this));
    }
}
