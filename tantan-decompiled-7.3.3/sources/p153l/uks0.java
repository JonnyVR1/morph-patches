package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class uks0 extends nd20 {

    /* JADX INFO: renamed from: a */
    public final tks0 f179453a;

    /* JADX INFO: renamed from: b */
    public final List f179454b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public String f179455c;

    public uks0(tks0 tks0Var) {
        als0 yks0Var;
        this.f179453a = tks0Var;
        try {
            this.f179455c = tks0Var.zzg();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            this.f179455c = "";
        }
        try {
            for (Object obj : tks0Var.zzh()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    yks0Var = iInterfaceQueryLocalInterface instanceof als0 ? (als0) iInterfaceQueryLocalInterface : new yks0(iBinder);
                } else {
                    yks0Var = null;
                }
                if (yks0Var != null) {
                    this.f179454b.add(new bls0(yks0Var));
                }
            }
        } catch (RemoteException e2) {
            dct0.m115296e("", e2);
        }
    }
}
