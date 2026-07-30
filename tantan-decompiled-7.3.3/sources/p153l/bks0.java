package p153l;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class bks0 {

    /* JADX INFO: renamed from: a */
    public final Context f77114a;

    public bks0(Context context) {
        this.f77114a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m104844a(k3t0 k3t0Var) {
        try {
            ((cks0) gct0.m129904b(this.f77114a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new fct0() { // from class: l.aks0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p153l.fct0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof cks0 ? (cks0) iInterfaceQueryLocalInterface : new cks0(obj);
                }
            })).m110387m4(k3t0Var);
        } catch (RemoteException e) {
            dct0.m115298g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (zzcef e2) {
            dct0.m115298g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
