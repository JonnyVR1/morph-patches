package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class uyk<T> {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, nj80<T>> f181630a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final int f181631b;

    public uyk(int i) {
        this.f181631b = i;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m198662a(nj80 nj80Var) {
        Object objAcquire = nj80Var.acquire();
        while (objAcquire != null) {
            objAcquire = nj80Var.acquire();
        }
    }

    /* JADX INFO: renamed from: b */
    public T m198663b(String str) {
        if (this.f181630a.get(str) == null) {
            this.f181630a.put(str, new pj80(this.f181631b));
        }
        return this.f181630a.get(str).acquire();
    }

    /* JADX INFO: renamed from: c */
    public void m198664c() {
        if (!this.f181630a.values().isEmpty()) {
            jyb.m147537z(this.f181630a.values(), new y20() { // from class: l.tyk
                @Override // p153l.y20
                public final void call(Object obj) {
                    uyk.m198662a((nj80) obj);
                }
            });
        }
        this.f181630a.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m198665d(String str, T t) {
        nj80<T> nj80Var = this.f181630a.get(str);
        if (nj80Var != null) {
            try {
                nj80Var.release(t);
                return true;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        return false;
    }
}
