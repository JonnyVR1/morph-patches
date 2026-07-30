package p149l;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ors0 extends e520.AbstractC16542a {

    /* JADX INFO: renamed from: a */
    public final List f145350a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public String f145351b;

    public ors0(nbs0 nbs0Var) {
        try {
            this.f145351b = nbs0Var.zzg();
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
            this.f145351b = "";
        }
        try {
            for (Object obj : nbs0Var.zzh()) {
                ubs0 ubs0VarM187903o8 = obj instanceof IBinder ? tbs0.m187903o8((IBinder) obj) : null;
                if (ubs0VarM187903o8 != null) {
                    this.f145350a.add(new zrs0(ubs0VarM187903o8));
                }
            }
        } catch (RemoteException e2) {
            x2t0.m206867e("", e2);
        }
    }
}
