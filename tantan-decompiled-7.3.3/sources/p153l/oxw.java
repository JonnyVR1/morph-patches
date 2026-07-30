package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class oxw {

    /* JADX INFO: renamed from: a */
    public static boolean f149691a = false;

    /* JADX INFO: renamed from: a */
    public static synchronized int m169737a(Context context) {
        Preconditions.checkNotNull(context, "Context is null");
        if (f149691a) {
            return 0;
        }
        try {
            t1v0 t1v0VarM148296c = k4t0.m148296c(context);
            try {
                zc4.m219231b(t1v0VarM148296c.zze());
                r13.m179325c(t1v0VarM148296c.zzf());
                f149691a = true;
                return 0;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (GooglePlayServicesNotAvailableException e2) {
            return e2.errorCode;
        }
    }
}
