package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class lyy0 extends h4u0 implements e0z0 {
    public lyy0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // p153l.e0z0
    /* JADX INFO: renamed from: O4 */
    public final void mo118927O4(vwy0 vwy0Var, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelM133595O = m133595O();
        uxv0.m198544b(parcelM133595O, vwy0Var);
        uxv0.m198545c(parcelM133595O, googleSignInOptions);
        m133596P2(103, parcelM133595O);
    }

    @Override // p153l.e0z0
    /* JADX INFO: renamed from: x4 */
    public final void mo118928x4(vwy0 vwy0Var, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelM133595O = m133595O();
        uxv0.m198544b(parcelM133595O, vwy0Var);
        uxv0.m198545c(parcelM133595O, googleSignInOptions);
        m133596P2(102, parcelM133595O);
    }
}
