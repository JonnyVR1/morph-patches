package p149l;

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
public final class a6g0 {

    /* JADX INFO: renamed from: a */
    public int f67759a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f67760b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f67761c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f67762d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f67763e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f67764f;

    /* JADX INFO: renamed from: g */
    public volatile ThreadPoolExecutor f67765g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f67766h;

    /* JADX INFO: renamed from: i */
    public w8g0 f67767i;

    public a6g0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f67759a = 5;
        this.f67764f = new AtomicInteger();
        this.f67766h = new AtomicInteger();
        this.f67760b = arrayList;
        this.f67761c = arrayList2;
        this.f67762d = arrayList3;
        this.f67763e = arrayList4;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ExecutorService m95127a() {
        try {
            if (this.f67765g == null) {
                this.f67765g = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new nfg0("OkDownload Download"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f67765g;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m95128b(ArrayList arrayList, ArrayList arrayList2) {
        try {
            arrayList2.size();
            int i = 0;
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    prg0 prg0Var = (prg0) obj;
                    if (!prg0Var.m171021g()) {
                        arrayList.remove(prg0Var);
                    }
                }
            }
            arrayList.size();
            if (!arrayList.isEmpty()) {
                if (arrayList.size() <= 1) {
                    bog0.m102944a().f76516b.f182721a.m127589d(((prg0) arrayList.get(0)).f150902b, 3, null);
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList3.add(((prg0) obj2).f150902b);
                }
                vrg0 vrg0Var = bog0.m102944a().f76516b;
                if (arrayList3.size() > 0) {
                    arrayList3.size();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        slg0 slg0Var = (slg0) it.next();
                        if (!slg0Var.f165202n) {
                            slg0Var.f165204p.m140924i(slg0Var, 3, null);
                            it.remove();
                        }
                    }
                    vrg0Var.f182722b.post(new wag0(arrayList3));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m95129c(slg0 slg0Var) {
        prg0 prg0Var = new prg0(slg0Var, this.f67767i);
        if (this.f67761c.size() - this.f67764f.get() >= this.f67759a) {
            this.f67760b.add(prg0Var);
        } else {
            this.f67761c.add(prg0Var);
            ((ThreadPoolExecutor) m95127a()).execute(prg0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m95130d(slg0 slg0Var, ArrayList arrayList, ArrayList arrayList2) {
        try {
            Iterator it = this.f67760b.iterator();
            while (it.hasNext()) {
                prg0 prg0Var = (prg0) it.next();
                slg0 slg0Var2 = prg0Var.f150902b;
                if (slg0Var2 != slg0Var && slg0Var2.f165190b != slg0Var.f165190b) {
                }
                if (!prg0Var.f150906f && !prg0Var.f150907g) {
                    it.remove();
                    arrayList.add(prg0Var);
                    return;
                }
            }
            ArrayList arrayList3 = this.f67761c;
            int size = arrayList3.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                prg0 prg0Var2 = (prg0) obj;
                slg0 slg0Var3 = prg0Var2.f150902b;
                if (slg0Var3 == slg0Var || slg0Var3.f165190b == slg0Var.f165190b) {
                    arrayList.add(prg0Var2);
                    arrayList2.add(prg0Var2);
                    return;
                }
            }
            ArrayList arrayList4 = this.f67762d;
            int size2 = arrayList4.size();
            while (i < size2) {
                Object obj2 = arrayList4.get(i);
                i++;
                prg0 prg0Var3 = (prg0) obj2;
                slg0 slg0Var4 = prg0Var3.f150902b;
                if (slg0Var4 == slg0Var || slg0Var4.f165190b == slg0Var.f165190b) {
                    arrayList.add(prg0Var3);
                    arrayList2.add(prg0Var3);
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m95131e(prg0 prg0Var) {
        int i = prg0Var.f150902b.f165190b;
        if (prg0Var.f150903c) {
            this.f67764f.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m95132f(int i) {
        ArrayList arrayList = this.f67760b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (i == ((prg0) obj).f150902b.f165190b) {
                return true;
            }
        }
        ArrayList arrayList2 = this.f67761c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            if (i == ((prg0) obj2).f150902b.f165190b) {
                return true;
            }
        }
        ArrayList arrayList3 = this.f67762d;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList3.get(i4);
            i4++;
            if (i == ((prg0) obj3).f150902b.f165190b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m95133g(slg0 slg0Var, Collection collection) {
        vrg0 vrg0Var = bog0.m102944a().f76516b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            prg0 prg0Var = (prg0) it.next();
            if (!prg0Var.f150906f) {
                if (prg0Var.f150902b.equals(slg0Var)) {
                    if (!prg0Var.f150907g) {
                        vrg0Var.f182721a.m127589d(slg0Var, 5, null);
                        return true;
                    }
                    int i = slg0Var.f165190b;
                    this.f67763e.add(prg0Var);
                    it.remove();
                    return false;
                }
                File fileM184802j = prg0Var.f150902b.m184802j();
                File fileM184802j2 = slg0Var.m184802j();
                if (fileM184802j != null && fileM184802j2 != null && fileM184802j.equals(fileM184802j2)) {
                    vrg0Var.f182721a.m127589d(slg0Var, 4, null);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m95134h() {
        try {
            if (this.f67766h.get() <= 0 && this.f67761c.size() - this.f67764f.get() < this.f67759a && !this.f67760b.isEmpty()) {
                Iterator it = this.f67760b.iterator();
                while (it.hasNext()) {
                    prg0 prg0Var = (prg0) it.next();
                    it.remove();
                    slg0 slg0Var = prg0Var.f150902b;
                    if (m95135i(slg0Var)) {
                        bog0.m102944a().f76516b.f182721a.m127589d(slg0Var, 4, null);
                    } else {
                        this.f67761c.add(prg0Var);
                        ((ThreadPoolExecutor) m95127a()).execute(prg0Var);
                        if (this.f67761c.size() - this.f67764f.get() >= this.f67759a) {
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
    public final synchronized boolean m95135i(slg0 slg0Var) {
        slg0 slg0Var2;
        File fileM184802j;
        slg0 slg0Var3;
        File fileM184802j2;
        int i = slg0Var.f165190b;
        File fileM184802j3 = slg0Var.m184802j();
        if (fileM184802j3 == null) {
            return false;
        }
        ArrayList arrayList = this.f67762d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            prg0 prg0Var = (prg0) obj;
            if (!prg0Var.f150906f && (slg0Var3 = prg0Var.f150902b) != slg0Var && (fileM184802j2 = slg0Var3.m184802j()) != null && fileM184802j3.equals(fileM184802j2)) {
                return true;
            }
        }
        ArrayList arrayList2 = this.f67761c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            prg0 prg0Var2 = (prg0) obj2;
            if (!prg0Var2.f150906f && (slg0Var2 = prg0Var2.f150902b) != slg0Var && (fileM184802j = slg0Var2.m184802j()) != null && fileM184802j3.equals(fileM184802j)) {
                return true;
            }
        }
        return false;
    }
}
