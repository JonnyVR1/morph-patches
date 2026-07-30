package p003l;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ybj {

    /* JADX INFO: renamed from: d */
    private static ConcurrentHashMap<String, CopyOnWriteArrayList<rbj>> f9047d;

    /* JADX INFO: renamed from: e */
    private static ybj f9048e = new ybj();

    /* JADX INFO: renamed from: a */
    private boolean f9049a = false;

    /* JADX INFO: renamed from: b */
    private boolean f9050b = false;

    /* JADX INFO: renamed from: c */
    public boolean f9051c = false;

    private ybj() {
        f9047d = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static ybj m9172d() {
        return f9048e;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m9173a() {
        try {
            this.f9049a = true;
            for (CopyOnWriteArrayList<rbj> copyOnWriteArrayList : f9047d.values()) {
                Iterator<rbj> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().m7169e();
                }
                copyOnWriteArrayList.clear();
            }
            f9047d.clear();
            this.f9049a = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m9174b(rbj rbjVar) {
        if (this.f9049a) {
            return false;
        }
        CopyOnWriteArrayList<rbj> copyOnWriteArrayList = f9047d.get(rbjVar.m7171g() + "_" + rbjVar.m7170f());
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(rbjVar);
    }

    /* JADX INFO: renamed from: c */
    public synchronized rbj m9175c(int i, int i2) {
        rbj rbjVar;
        if (!this.f9051c) {
            return new rbj(i, i2);
        }
        String str = i + "_" + i2;
        CopyOnWriteArrayList<rbj> copyOnWriteArrayList = f9047d.get(str);
        if (copyOnWriteArrayList == null) {
            CopyOnWriteArrayList<rbj> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            rbjVar = new rbj(i, i2);
            copyOnWriteArrayList2.add(rbjVar);
            f9047d.put(str, copyOnWriteArrayList2);
        } else {
            Iterator<rbj> it = copyOnWriteArrayList.iterator();
            do {
                if (!it.hasNext()) {
                    rbjVar = null;
                    break;
                }
                rbjVar = it.next();
            } while (rbjVar.f6829a);
            if (rbjVar == null) {
                rbjVar = new rbj(i, i2);
                copyOnWriteArrayList.add(rbjVar);
            }
        }
        return rbjVar;
    }

    /* JADX INFO: renamed from: e */
    public boolean m9176e() {
        return this.f9050b;
    }

    /* JADX INFO: renamed from: f */
    public void m9177f(boolean z) {
        this.f9050b = z;
    }
}
