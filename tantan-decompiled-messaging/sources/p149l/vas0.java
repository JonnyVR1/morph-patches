package p149l;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class vas0 {

    /* JADX INFO: renamed from: a */
    public final Context f180780a;

    public vas0(Context context) {
        this.f180780a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m197649a(eus0 eus0Var) {
        try {
            ((was0) a3t0.m94733b(this.f180780a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new z2t0() { // from class: l.uas0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p149l.z2t0
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof was0 ? (was0) iInterfaceQueryLocalInterface : new was0(obj);
                }
            })).m202462m4(eus0Var);
        } catch (RemoteException e) {
            x2t0.m206869g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (zzcef e2) {
            x2t0.m206869g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
