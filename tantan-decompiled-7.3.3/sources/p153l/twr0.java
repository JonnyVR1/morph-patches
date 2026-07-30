package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class twr0 implements xvr0 {

    /* JADX INFO: renamed from: a */
    public final Map f176421a = new HashMap();

    /* JADX INFO: renamed from: b */
    @Nullable
    public final nvr0 f176422b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final BlockingQueue f176423c;

    /* JADX INFO: renamed from: d */
    public final rvr0 f176424d;

    public twr0(@NonNull nvr0 nvr0Var, @NonNull BlockingQueue blockingQueue, rvr0 rvr0Var) {
        this.f176424d = rvr0Var;
        this.f176422b = nvr0Var;
        this.f176423c = blockingQueue;
    }

    @Override // p153l.xvr0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo193366a(jwr0 jwr0Var) {
        try {
            Map map = this.f176421a;
            String strM147201n = jwr0Var.m147201n();
            List list = (List) map.remove(strM147201n);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (swr0.f171002b) {
                swr0.m188360d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strM147201n);
            }
            jwr0 jwr0Var2 = (jwr0) list.remove(0);
            this.f176421a.put(strM147201n, list);
            jwr0Var2.m147212y(this);
            try {
                this.f176423c.put(jwr0Var2);
            } catch (InterruptedException e) {
                swr0.m188358b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f176422b.m164926b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.xvr0
    /* JADX INFO: renamed from: b */
    public final void mo193367b(jwr0 jwr0Var, pwr0 pwr0Var) {
        List list;
        kvr0 kvr0Var = pwr0Var.f154434b;
        if (kvr0Var == null || kvr0Var.m151677a(System.currentTimeMillis())) {
            mo193366a(jwr0Var);
            return;
        }
        String strM147201n = jwr0Var.m147201n();
        synchronized (this) {
            list = (List) this.f176421a.remove(strM147201n);
        }
        if (list != null) {
            if (swr0.f171002b) {
                swr0.m188360d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strM147201n);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f176424d.m183311b((jwr0) it.next(), pwr0Var, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m193368c(jwr0 jwr0Var) {
        try {
            Map map = this.f176421a;
            String strM147201n = jwr0Var.m147201n();
            boolean zContainsKey = map.containsKey(strM147201n);
            Map map2 = this.f176421a;
            if (!zContainsKey) {
                map2.put(strM147201n, null);
                jwr0Var.m147212y(this);
                if (swr0.f171002b) {
                    swr0.m188357a("new request, sending to network %s", strM147201n);
                }
                return false;
            }
            List arrayList = (List) map2.get(strM147201n);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            jwr0Var.m147204q("waiting-for-response");
            arrayList.add(jwr0Var);
            this.f176421a.put(strM147201n, arrayList);
            if (swr0.f171002b) {
                swr0.m188357a("Request for cacheKey=%s is in flight, putting on hold.", strM147201n);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
