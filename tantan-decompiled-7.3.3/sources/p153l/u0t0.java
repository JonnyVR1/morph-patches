package p153l;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class u0t0 extends md20.AbstractC18589a {

    /* JADX INFO: renamed from: a */
    public final List f176935a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public String f176936b;

    public u0t0(tks0 tks0Var) {
        try {
            this.f176936b = tks0Var.zzg();
        } catch (RemoteException e) {
            dct0.m115296e("", e);
            this.f176936b = "";
        }
        try {
            for (Object obj : tks0Var.zzh()) {
                als0 als0VarM220161o8 = obj instanceof IBinder ? zks0.m220161o8((IBinder) obj) : null;
                if (als0VarM220161o8 != null) {
                    this.f176935a.add(new f1t0(als0VarM220161o8));
                }
            }
        } catch (RemoteException e2) {
            dct0.m115296e("", e2);
        }
    }
}
