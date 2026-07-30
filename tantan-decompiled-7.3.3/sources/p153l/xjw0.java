package p153l;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzfrv;

/* JADX INFO: loaded from: classes6.dex */
public final class xjw0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final akw0 f194654a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final boolean f194655b;

    public xjw0(akw0 akw0Var) {
        this.f194654a = akw0Var;
        this.f194655b = akw0Var != null;
    }

    /* JADX INFO: renamed from: b */
    public static xjw0 m211270b(Context context, String str, String str2) {
        akw0 yjw0Var;
        try {
            try {
                try {
                    IBinder iBinderM12539d = DynamiteModule.m12530e(context, DynamiteModule.f9840b, ModuleDescriptor.MODULE_ID).m12539d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderM12539d == null) {
                        yjw0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM12539d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        yjw0Var = iInterfaceQueryLocalInterface instanceof akw0 ? (akw0) iInterfaceQueryLocalInterface : new yjw0(iBinderM12539d);
                    }
                    yjw0Var.mo98628B4(h950.m134038Y2(context), str, null);
                    return new xjw0(yjw0Var);
                } catch (RemoteException | zzfrv | NullPointerException | SecurityException unused) {
                    return new xjw0(new bkw0());
                }
            } catch (Exception e) {
                throw new zzfrv(e);
            }
        } catch (Exception e2) {
            throw new zzfrv(e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static xjw0 m211271c() {
        return new xjw0(new bkw0());
    }

    /* JADX INFO: renamed from: a */
    public final wjw0 m211272a(byte[] bArr) {
        return new wjw0(this, bArr, null);
    }
}
