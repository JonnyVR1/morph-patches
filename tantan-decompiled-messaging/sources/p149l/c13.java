package p149l;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class c13 {

    /* JADX INFO: renamed from: a */
    public static isu0 f78197a;

    /* JADX INFO: renamed from: a */
    public static b13 m104787a(Bitmap bitmap) {
        try {
            return new b13(m104790d().mo138091h7(bitmap));
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b13 m104788b(int i) {
        try {
            return new b13(m104790d().zza(i));
        } catch (RemoteException e) {
            d4k.m109990a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m104789c(isu0 isu0Var) {
        if (f78197a != null) {
            return;
        }
        f78197a = (isu0) Preconditions.checkNotNull(isu0Var);
    }

    /* JADX INFO: renamed from: d */
    public static isu0 m104790d() {
        return (isu0) Preconditions.checkNotNull(f78197a, "IBitmapDescriptorFactory is not initialized");
    }
}
