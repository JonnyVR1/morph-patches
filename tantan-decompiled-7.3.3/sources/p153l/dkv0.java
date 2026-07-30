package p153l;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class dkv0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f89472a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final huu0 f89473b;

    public dkv0(huu0 huu0Var) {
        this.f89473b = huu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final hzs0 m116686a(String str) {
        if (this.f89472a.containsKey(str)) {
            return (hzs0) this.f89472a.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m116687b(String str) {
        try {
            this.f89472a.put(str, this.f89473b.m137254b(str));
        } catch (RemoteException e) {
            dct0.m115296e("Couldn't create RTB adapter : ", e);
        }
    }
}
