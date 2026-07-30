package p153l;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ieg0 {

    /* JADX INFO: renamed from: a */
    public int f114578a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f114579b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f114580c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f114581d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f114582e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f114583f;

    /* JADX INFO: renamed from: g */
    public volatile ThreadPoolExecutor f114584g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f114585h;

    /* JADX INFO: renamed from: i */
    public ehg0 f114586i;

    public ieg0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f114578a = 5;
        this.f114583f = new AtomicInteger();
        this.f114585h = new AtomicInteger();
        this.f114579b = arrayList;
        this.f114580c = arrayList2;
        this.f114581d = arrayList3;
        this.f114582e = arrayList4;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ExecutorService m139602a() {
        try {
            if (this.f114584g == null) {
                this.f114584g = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new vng0("OkDownload Download"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f114584g;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m139603b(ArrayList arrayList, ArrayList arrayList2) {
        try {
            arrayList2.size();
            int i = 0;
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    xzg0 xzg0Var = (xzg0) obj;
                    if (!xzg0Var.m213755g()) {
                        arrayList.remove(xzg0Var);
                    }
                }
            }
            arrayList.size();
            if (!arrayList.isEmpty()) {
                if (arrayList.size() <= 1) {
                    jwg0.m147162a().f122920b.f84561a.m169861d(((xzg0) arrayList.get(0)).f196866b, 3, null);
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList3.add(((xzg0) obj2).f196866b);
                }
                d0h0 d0h0Var = jwg0.m147162a().f122920b;
                if (arrayList3.size() > 0) {
                    arrayList3.size();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        aug0 aug0Var = (aug0) it.next();
                        if (!aug0Var.f73505n) {
                            aug0Var.f73507p.m181856i(aug0Var, 3, null);
                            it.remove();
                        }
                    }
                    d0h0Var.f84562b.post(new ejg0(arrayList3));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m139604c(aug0 aug0Var) {
        xzg0 xzg0Var = new xzg0(aug0Var, this.f114586i);
        if (this.f114580c.size() - this.f114583f.get() >= this.f114578a) {
            this.f114579b.add(xzg0Var);
        } else {
            this.f114580c.add(xzg0Var);
            ((ThreadPoolExecutor) m139602a()).execute(xzg0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m139605d(aug0 aug0Var, ArrayList arrayList, ArrayList arrayList2) {
        try {
            Iterator it = this.f114579b.iterator();
            while (it.hasNext()) {
                xzg0 xzg0Var = (xzg0) it.next();
                aug0 aug0Var2 = xzg0Var.f196866b;
                if (aug0Var2 != aug0Var && aug0Var2.f73493b != aug0Var.f73493b) {
                }
                if (!xzg0Var.f196870f && !xzg0Var.f196871g) {
                    it.remove();
                    arrayList.add(xzg0Var);
                    return;
                }
            }
            ArrayList arrayList3 = this.f114580c;
            int size = arrayList3.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                xzg0 xzg0Var2 = (xzg0) obj;
                aug0 aug0Var3 = xzg0Var2.f196866b;
                if (aug0Var3 == aug0Var || aug0Var3.f73493b == aug0Var.f73493b) {
                    arrayList.add(xzg0Var2);
                    arrayList2.add(xzg0Var2);
                    return;
                }
            }
            ArrayList arrayList4 = this.f114581d;
            int size2 = arrayList4.size();
            while (i < size2) {
                Object obj2 = arrayList4.get(i);
                i++;
                xzg0 xzg0Var3 = (xzg0) obj2;
                aug0 aug0Var4 = xzg0Var3.f196866b;
                if (aug0Var4 == aug0Var || aug0Var4.f73493b == aug0Var.f73493b) {
                    arrayList.add(xzg0Var3);
                    arrayList2.add(xzg0Var3);
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m139606e(xzg0 xzg0Var) {
        int i = xzg0Var.f196866b.f73493b;
        if (xzg0Var.f196867c) {
            this.f114583f.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m139607f(int i) {
        ArrayList arrayList = this.f114579b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (i == ((xzg0) obj).f196866b.f73493b) {
                return true;
            }
        }
        ArrayList arrayList2 = this.f114580c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            if (i == ((xzg0) obj2).f196866b.f73493b) {
                return true;
            }
        }
        ArrayList arrayList3 = this.f114581d;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList3.get(i4);
            i4++;
            if (i == ((xzg0) obj3).f196866b.f73493b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m139608g(aug0 aug0Var, Collection collection) {
        d0h0 d0h0Var = jwg0.m147162a().f122920b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xzg0 xzg0Var = (xzg0) it.next();
            if (!xzg0Var.f196870f) {
                if (xzg0Var.f196866b.equals(aug0Var)) {
                    if (!xzg0Var.f196871g) {
                        d0h0Var.f84561a.m169861d(aug0Var, 5, null);
                        return true;
                    }
                    int i = aug0Var.f73493b;
                    this.f114582e.add(xzg0Var);
                    it.remove();
                    return false;
                }
                File fileM100397j = xzg0Var.f196866b.m100397j();
                File fileM100397j2 = aug0Var.m100397j();
                if (fileM100397j != null && fileM100397j2 != null && fileM100397j.equals(fileM100397j2)) {
                    d0h0Var.f84561a.m169861d(aug0Var, 4, null);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m139609h() {
        try {
            if (this.f114585h.get() <= 0 && this.f114580c.size() - this.f114583f.get() < this.f114578a && !this.f114579b.isEmpty()) {
                Iterator it = this.f114579b.iterator();
                while (it.hasNext()) {
                    xzg0 xzg0Var = (xzg0) it.next();
                    it.remove();
                    aug0 aug0Var = xzg0Var.f196866b;
                    if (m139610i(aug0Var)) {
                        jwg0.m147162a().f122920b.f84561a.m169861d(aug0Var, 4, null);
                    } else {
                        this.f114580c.add(xzg0Var);
                        ((ThreadPoolExecutor) m139602a()).execute(xzg0Var);
                        if (this.f114580c.size() - this.f114583f.get() >= this.f114578a) {
                            break;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m139610i(aug0 aug0Var) {
        aug0 aug0Var2;
        File fileM100397j;
        aug0 aug0Var3;
        File fileM100397j2;
        int i = aug0Var.f73493b;
        File fileM100397j3 = aug0Var.m100397j();
        if (fileM100397j3 == null) {
            return false;
        }
        ArrayList arrayList = this.f114581d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xzg0 xzg0Var = (xzg0) obj;
            if (!xzg0Var.f196870f && (aug0Var3 = xzg0Var.f196866b) != aug0Var && (fileM100397j2 = aug0Var3.m100397j()) != null && fileM100397j3.equals(fileM100397j2)) {
                return true;
            }
        }
        ArrayList arrayList2 = this.f114580c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            xzg0 xzg0Var2 = (xzg0) obj2;
            if (!xzg0Var2.f196870f && (aug0Var2 = xzg0Var2.f196866b) != aug0Var && (fileM100397j = aug0Var2.m100397j()) != null && fileM100397j3.equals(fileM100397j)) {
                return true;
            }
        }
        return false;
    }
}
