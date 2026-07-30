package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class fpy0 extends bvt0 implements yqy0 {
    public fpy0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // p149l.yqy0
    /* JADX INFO: renamed from: O4 */
    public final void mo122683O4(pny0 pny0Var, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelM104076O = m104076O();
        oov0.m165284b(parcelM104076O, pny0Var);
        oov0.m165285c(parcelM104076O, googleSignInOptions);
        m104077P2(103, parcelM104076O);
    }

    @Override // p149l.yqy0
    /* JADX INFO: renamed from: x4 */
    public final void mo122684x4(pny0 pny0Var, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelM104076O = m104076O();
        oov0.m165284b(parcelM104076O, pny0Var);
        oov0.m165285c(parcelM104076O, googleSignInOptions);
        m104077P2(102, parcelM104076O);
    }
}
