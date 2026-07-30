package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class obs0 extends f520 {

    /* JADX INFO: renamed from: a */
    public final nbs0 f142973a;

    /* JADX INFO: renamed from: b */
    public final List f142974b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public String f142975c;

    public obs0(nbs0 nbs0Var) {
        ubs0 sbs0Var;
        this.f142973a = nbs0Var;
        try {
            this.f142975c = nbs0Var.zzg();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            this.f142975c = "";
        }
        try {
            for (Object obj : nbs0Var.zzh()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    sbs0Var = iInterfaceQueryLocalInterface instanceof ubs0 ? (ubs0) iInterfaceQueryLocalInterface : new sbs0(iBinder);
                } else {
                    sbs0Var = null;
                }
                if (sbs0Var != null) {
                    this.f142974b.add(new vbs0(sbs0Var));
                }
            }
        } catch (RemoteException e2) {
            x2t0.m206867e("", e2);
        }
    }
}
