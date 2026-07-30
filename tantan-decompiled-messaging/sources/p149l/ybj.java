package p149l;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ybj {

    /* JADX INFO: renamed from: d */
    private static ConcurrentHashMap<String, CopyOnWriteArrayList<rbj>> f197339d;

    /* JADX INFO: renamed from: e */
    private static ybj f197340e = new ybj();

    /* JADX INFO: renamed from: a */
    private boolean f197341a = false;

    /* JADX INFO: renamed from: b */
    private boolean f197342b = false;

    /* JADX INFO: renamed from: c */
    public boolean f197343c = false;

    private ybj() {
        f197339d = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static ybj m213953d() {
        return f197340e;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m213954a() {
        try {
            this.f197341a = true;
            for (CopyOnWriteArrayList<rbj> copyOnWriteArrayList : f197339d.values()) {
                Iterator<rbj> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().m178606e();
                }
                copyOnWriteArrayList.clear();
            }
            f197339d.clear();
            this.f197341a = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m213955b(rbj rbjVar) {
        if (this.f197341a) {
            return false;
        }
        CopyOnWriteArrayList<rbj> copyOnWriteArrayList = f197339d.get(rbjVar.m178608g() + "_" + rbjVar.m178607f());
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(rbjVar);
    }

    /* JADX INFO: renamed from: c */
    public synchronized rbj m213956c(int i, int i2) {
        rbj rbjVar;
        if (!this.f197343c) {
            return new rbj(i, i2);
        }
        String str = i + "_" + i2;
        CopyOnWriteArrayList<rbj> copyOnWriteArrayList = f197339d.get(str);
        if (copyOnWriteArrayList == null) {
            CopyOnWriteArrayList<rbj> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            rbjVar = new rbj(i, i2);
            copyOnWriteArrayList2.add(rbjVar);
            f197339d.put(str, copyOnWriteArrayList2);
        } else {
            Iterator<rbj> it = copyOnWriteArrayList.iterator();
            do {
                if (!it.hasNext()) {
                    rbjVar = null;
                    break;
                }
                rbjVar = it.next();
            } while (rbjVar.f158615a);
            if (rbjVar == null) {
                rbjVar = new rbj(i, i2);
                copyOnWriteArrayList.add(rbjVar);
            }
        }
        return rbjVar;
    }

    /* JADX INFO: renamed from: e */
    public boolean m213957e() {
        return this.f197342b;
    }

    /* JADX INFO: renamed from: f */
    public void m213958f(boolean z) {
        this.f197342b = z;
    }
}
