package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class nnr0 implements rmr0 {

    /* JADX INFO: renamed from: a */
    public final Map f139776a = new HashMap();

    /* JADX INFO: renamed from: b */
    @Nullable
    public final hmr0 f139777b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final BlockingQueue f139778c;

    /* JADX INFO: renamed from: d */
    public final lmr0 f139779d;

    public nnr0(@NonNull hmr0 hmr0Var, @NonNull BlockingQueue blockingQueue, lmr0 lmr0Var) {
        this.f139779d = lmr0Var;
        this.f139777b = hmr0Var;
        this.f139778c = blockingQueue;
    }

    @Override // p149l.rmr0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo160365a(dnr0 dnr0Var) {
        try {
            Map map = this.f139776a;
            String strM112663n = dnr0Var.m112663n();
            List list = (List) map.remove(strM112663n);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (mnr0.f134787b) {
                mnr0.m155560d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strM112663n);
            }
            dnr0 dnr0Var2 = (dnr0) list.remove(0);
            this.f139776a.put(strM112663n, list);
            dnr0Var2.m112674y(this);
            try {
                this.f139778c.put(dnr0Var2);
            } catch (InterruptedException e) {
                mnr0.m155558b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f139777b.m131755b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.rmr0
    /* JADX INFO: renamed from: b */
    public final void mo160366b(dnr0 dnr0Var, jnr0 jnr0Var) {
        List list;
        emr0 emr0Var = jnr0Var.f118882b;
        if (emr0Var == null || emr0Var.m117225a(System.currentTimeMillis())) {
            mo160365a(dnr0Var);
            return;
        }
        String strM112663n = dnr0Var.m112663n();
        synchronized (this) {
            list = (List) this.f139776a.remove(strM112663n);
        }
        if (list != null) {
            if (mnr0.f134787b) {
                mnr0.m155560d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strM112663n);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f139779d.m150603b((dnr0) it.next(), jnr0Var, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m160367c(dnr0 dnr0Var) {
        try {
            Map map = this.f139776a;
            String strM112663n = dnr0Var.m112663n();
            boolean zContainsKey = map.containsKey(strM112663n);
            Map map2 = this.f139776a;
            if (!zContainsKey) {
                map2.put(strM112663n, null);
                dnr0Var.m112674y(this);
                if (mnr0.f134787b) {
                    mnr0.m155557a("new request, sending to network %s", strM112663n);
                }
                return false;
            }
            List arrayList = (List) map2.get(strM112663n);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            dnr0Var.m112666q("waiting-for-response");
            arrayList.add(dnr0Var);
            this.f139776a.put(strM112663n, arrayList);
            if (mnr0.f134787b) {
                mnr0.m155557a("Request for cacheKey=%s is in flight, putting on hold.", strM112663n);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
