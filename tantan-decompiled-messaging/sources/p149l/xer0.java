package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class xer0 extends qqr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListenerHolder f192619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LocationRequest f192620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xer0(rrr0 rrr0Var, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f192619a = listenerHolder;
        this.f192620b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zvt0) anyClient).m220479n(new opr0(this.f192619a), this.f192620b, rrr0.m180569a(this));
    }
}
