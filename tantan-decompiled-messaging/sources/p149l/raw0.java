package p149l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzfrv;

/* JADX INFO: loaded from: classes6.dex */
public final class raw0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final uaw0 f158566a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final boolean f158567b;

    public raw0(uaw0 uaw0Var) {
        this.f158566a = uaw0Var;
        this.f158567b = uaw0Var != null;
    }

    /* JADX INFO: renamed from: b */
    public static raw0 m178538b(Context context, String str, String str2) {
        uaw0 saw0Var;
        try {
            try {
                try {
                    IBinder iBinderM12485d = DynamiteModule.m12476e(context, DynamiteModule.f9803b, ModuleDescriptor.MODULE_ID).m12485d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderM12485d == null) {
                        saw0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM12485d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        saw0Var = iInterfaceQueryLocalInterface instanceof uaw0 ? (uaw0) iInterfaceQueryLocalInterface : new saw0(iBinderM12485d);
                    }
                    saw0Var.mo183111B4(s050.m181848Y2(context), str, null);
                    return new raw0(saw0Var);
                } catch (RemoteException | zzfrv | NullPointerException | SecurityException unused) {
                    return new raw0(new vaw0());
                }
            } catch (Exception e) {
                throw new zzfrv(e);
            }
        } catch (Exception e2) {
            throw new zzfrv(e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static raw0 m178539c() {
        return new raw0(new vaw0());
    }

    /* JADX INFO: renamed from: a */
    public final qaw0 m178540a(byte[] bArr) {
        return new qaw0(this, bArr, null);
    }
}
