package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qyr0 {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public int f156949b;

    /* JADX INFO: renamed from: a */
    public final Object f156948a = new Object();

    /* JADX INFO: renamed from: c */
    public final List f156950c = new LinkedList();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final pyr0 m177058a(boolean z) {
        synchronized (this.f156948a) {
            try {
                pyr0 pyr0Var = null;
                if (this.f156950c.isEmpty()) {
                    x2t0.m206864b("Queue empty");
                    return null;
                }
                int size = this.f156950c.size();
                List<pyr0> list = this.f156950c;
                int i = 0;
                if (size < 2) {
                    pyr0 pyr0Var2 = (pyr0) list.get(0);
                    if (z) {
                        this.f156950c.remove(0);
                    } else {
                        pyr0Var2.m172157i();
                    }
                    return pyr0Var2;
                }
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (pyr0 pyr0Var3 : list) {
                    int iM172150b = pyr0Var3.m172150b();
                    if (iM172150b > i2) {
                        i = i3;
                    }
                    int i4 = iM172150b > i2 ? iM172150b : i2;
                    if (iM172150b > i2) {
                        pyr0Var = pyr0Var3;
                    }
                    i3++;
                    i2 = i4;
                }
                this.f156950c.remove(i);
                return pyr0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m177059b(pyr0 pyr0Var) {
        synchronized (this.f156948a) {
            try {
                if (this.f156950c.size() >= 10) {
                    x2t0.m206864b("Queue is full, current size = " + this.f156950c.size());
                    this.f156950c.remove(0);
                }
                int i = this.f156949b;
                this.f156949b = i + 1;
                pyr0Var.m172158j(i);
                pyr0Var.m172162n();
                this.f156950c.add(pyr0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m177060c(pyr0 pyr0Var) {
        synchronized (this.f156948a) {
            try {
                Iterator it = this.f156950c.iterator();
                while (it.hasNext()) {
                    pyr0 pyr0Var2 = (pyr0) it.next();
                    if (vny0.m199079q().m212279i().zzN()) {
                        if (!vny0.m199079q().m212279i().zzO() && !pyr0Var.equals(pyr0Var2) && pyr0Var2.m172154f().equals(pyr0Var.m172154f())) {
                            it.remove();
                            return true;
                        }
                    } else if (!pyr0Var.equals(pyr0Var2) && pyr0Var2.m172152d().equals(pyr0Var.m172152d())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m177061d(pyr0 pyr0Var) {
        synchronized (this.f156948a) {
            try {
                return this.f156950c.contains(pyr0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
