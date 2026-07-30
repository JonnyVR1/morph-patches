package p149l;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class xav0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f191845a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final blu0 f191846b;

    public xav0(blu0 blu0Var) {
        this.f191846b = blu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final bqs0 m207683a(String str) {
        if (this.f191845a.containsKey(str)) {
            return (bqs0) this.f191845a.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m207684b(String str) {
        try {
            this.f191845a.put(str, this.f191846b.m102562b(str));
        } catch (RemoteException e) {
            x2t0.m206867e("Couldn't create RTB adapter : ", e);
        }
    }
}
