package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.internal.p152authapi.zzt;
import com.google.android.gms.internal.p152authapi.zzz;

/* JADX INFO: loaded from: classes6.dex */
public final class t1z0 extends h4u0 implements j3z0 {
    public t1z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // p153l.j3z0
    /* JADX INFO: renamed from: A1 */
    public final void mo143375A1(h0z0 h0z0Var, zzz zzzVar) throws RemoteException {
        Parcel parcelM133595O = m133595O();
        uxv0.m198544b(parcelM133595O, h0z0Var);
        uxv0.m198545c(parcelM133595O, zzzVar);
        m133596P2(2, parcelM133595O);
    }

    @Override // p153l.j3z0
    /* JADX INFO: renamed from: C7 */
    public final void mo143376C7(h0z0 h0z0Var) throws RemoteException {
        Parcel parcelM133595O = m133595O();
        uxv0.m198544b(parcelM133595O, h0z0Var);
        m133596P2(4, parcelM133595O);
    }

    @Override // p153l.j3z0
    /* JADX INFO: renamed from: S0 */
    public final void mo143377S0(h0z0 h0z0Var, CredentialRequest credentialRequest) throws RemoteException {
        Parcel parcelM133595O = m133595O();
        uxv0.m198544b(parcelM133595O, h0z0Var);
        uxv0.m198545c(parcelM133595O, credentialRequest);
        m133596P2(1, parcelM133595O);
    }

    @Override // p153l.j3z0
    /* JADX INFO: renamed from: W7 */
    public final void mo143378W7(h0z0 h0z0Var, zzt zztVar) throws RemoteException {
        Parcel parcelM133595O = m133595O();
        uxv0.m198544b(parcelM133595O, h0z0Var);
        uxv0.m198545c(parcelM133595O, zztVar);
        m133596P2(3, parcelM133595O);
    }
}
