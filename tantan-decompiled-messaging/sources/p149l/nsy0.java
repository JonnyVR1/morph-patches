package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.internal.p148authapi.zzt;
import com.google.android.gms.internal.p148authapi.zzz;

/* JADX INFO: loaded from: classes6.dex */
public final class nsy0 extends bvt0 implements duy0 {
    public nsy0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // p149l.duy0
    /* JADX INFO: renamed from: A1 */
    public final void mo113753A1(bry0 bry0Var, zzz zzzVar) throws RemoteException {
        Parcel parcelM104076O = m104076O();
        oov0.m165284b(parcelM104076O, bry0Var);
        oov0.m165285c(parcelM104076O, zzzVar);
        m104077P2(2, parcelM104076O);
    }

    @Override // p149l.duy0
    /* JADX INFO: renamed from: C7 */
    public final void mo113754C7(bry0 bry0Var) throws RemoteException {
        Parcel parcelM104076O = m104076O();
        oov0.m165284b(parcelM104076O, bry0Var);
        m104077P2(4, parcelM104076O);
    }

    @Override // p149l.duy0
    /* JADX INFO: renamed from: S0 */
    public final void mo113755S0(bry0 bry0Var, CredentialRequest credentialRequest) throws RemoteException {
        Parcel parcelM104076O = m104076O();
        oov0.m165284b(parcelM104076O, bry0Var);
        oov0.m165285c(parcelM104076O, credentialRequest);
        m104077P2(1, parcelM104076O);
    }

    @Override // p149l.duy0
    /* JADX INFO: renamed from: W7 */
    public final void mo113756W7(bry0 bry0Var, zzt zztVar) throws RemoteException {
        Parcel parcelM104076O = m104076O();
        oov0.m165284b(parcelM104076O, bry0Var);
        oov0.m165285c(parcelM104076O, zztVar);
        m104077P2(3, parcelM104076O);
    }
}
