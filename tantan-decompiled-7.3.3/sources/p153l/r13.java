package p153l;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class r13 {

    /* JADX INFO: renamed from: a */
    public static o1v0 f160752a;

    /* JADX INFO: renamed from: a */
    public static q13 m179323a(Bitmap bitmap) {
        try {
            return new q13(m179326d().mo165684h7(bitmap));
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static q13 m179324b(int i) {
        try {
            return new q13(m179326d().zza(i));
        } catch (RemoteException e) {
            v6k.m200076a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m179325c(o1v0 o1v0Var) {
        if (f160752a != null) {
            return;
        }
        f160752a = (o1v0) Preconditions.checkNotNull(o1v0Var);
    }

    /* JADX INFO: renamed from: d */
    public static o1v0 m179326d() {
        return (o1v0) Preconditions.checkNotNull(f160752a, "IBitmapDescriptorFactory is not initialized");
    }
}
