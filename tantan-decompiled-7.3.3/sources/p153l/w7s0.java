package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class w7s0 {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public int f187787b;

    /* JADX INFO: renamed from: a */
    public final Object f187786a = new Object();

    /* JADX INFO: renamed from: c */
    public final List f187788c = new LinkedList();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final v7s0 m205384a(boolean z) {
        synchronized (this.f187786a) {
            try {
                v7s0 v7s0Var = null;
                if (this.f187788c.isEmpty()) {
                    dct0.m115293b("Queue empty");
                    return null;
                }
                int size = this.f187788c.size();
                List<v7s0> list = this.f187788c;
                int i = 0;
                if (size < 2) {
                    v7s0 v7s0Var2 = (v7s0) list.get(0);
                    if (z) {
                        this.f187788c.remove(0);
                    } else {
                        v7s0Var2.m200265i();
                    }
                    return v7s0Var2;
                }
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (v7s0 v7s0Var3 : list) {
                    int iM200258b = v7s0Var3.m200258b();
                    if (iM200258b > i2) {
                        i = i3;
                    }
                    int i4 = iM200258b > i2 ? iM200258b : i2;
                    if (iM200258b > i2) {
                        v7s0Var = v7s0Var3;
                    }
                    i3++;
                    i2 = i4;
                }
                this.f187788c.remove(i);
                return v7s0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m205385b(v7s0 v7s0Var) {
        synchronized (this.f187786a) {
            try {
                if (this.f187788c.size() >= 10) {
                    dct0.m115293b("Queue is full, current size = " + this.f187788c.size());
                    this.f187788c.remove(0);
                }
                int i = this.f187787b;
                this.f187787b = i + 1;
                v7s0Var.m200266j(i);
                v7s0Var.m200270n();
                this.f187788c.add(v7s0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m205386c(v7s0 v7s0Var) {
        synchronized (this.f187786a) {
            try {
                Iterator it = this.f187788c.iterator();
                while (it.hasNext()) {
                    v7s0 v7s0Var2 = (v7s0) it.next();
                    if (bxy0.m106933q().m120264i().zzN()) {
                        if (!bxy0.m106933q().m120264i().zzO() && !v7s0Var.equals(v7s0Var2) && v7s0Var2.m200262f().equals(v7s0Var.m200262f())) {
                            it.remove();
                            return true;
                        }
                    } else if (!v7s0Var.equals(v7s0Var2) && v7s0Var2.m200260d().equals(v7s0Var.m200260d())) {
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
    public final boolean m205387d(v7s0 v7s0Var) {
        synchronized (this.f187786a) {
            try {
                return this.f187788c.contains(v7s0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
