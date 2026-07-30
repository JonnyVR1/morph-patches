package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class puw {

    /* JADX INFO: renamed from: a */
    public static boolean f151363a = false;

    /* JADX INFO: renamed from: a */
    public static synchronized int m171483a(Context context) {
        Preconditions.checkNotNull(context, "Context is null");
        if (f151363a) {
            return 0;
        }
        try {
            nsu0 nsu0VarM118318c = evs0.m118318c(context);
            try {
                ac4.m95714b(nsu0VarM118318c.zze());
                c13.m104789c(nsu0VarM118318c.zzf());
                f151363a = true;
                return 0;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (GooglePlayServicesNotAvailableException e2) {
            return e2.errorCode;
        }
    }
}
