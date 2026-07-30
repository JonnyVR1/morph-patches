package p153l;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class sej {

    /* JADX INFO: renamed from: d */
    private static ConcurrentHashMap<String, CopyOnWriteArrayList<lej>> f167615d;

    /* JADX INFO: renamed from: e */
    private static sej f167616e = new sej();

    /* JADX INFO: renamed from: a */
    private boolean f167617a = false;

    /* JADX INFO: renamed from: b */
    private boolean f167618b = false;

    /* JADX INFO: renamed from: c */
    public boolean f167619c = false;

    private sej() {
        f167615d = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static sej m185545d() {
        return f167616e;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m185546a() {
        try {
            this.f167617a = true;
            for (CopyOnWriteArrayList<lej> copyOnWriteArrayList : f167615d.values()) {
                Iterator<lej> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().m153898e();
                }
                copyOnWriteArrayList.clear();
            }
            f167615d.clear();
            this.f167617a = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m185547b(lej lejVar) {
        if (this.f167617a) {
            return false;
        }
        CopyOnWriteArrayList<lej> copyOnWriteArrayList = f167615d.get(lejVar.m153900g() + "_" + lejVar.m153899f());
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(lejVar);
    }

    /* JADX INFO: renamed from: c */
    public synchronized lej m185548c(int i, int i2) {
        lej lejVar;
        if (!this.f167619c) {
            return new lej(i, i2);
        }
        String str = i + "_" + i2;
        CopyOnWriteArrayList<lej> copyOnWriteArrayList = f167615d.get(str);
        if (copyOnWriteArrayList == null) {
            CopyOnWriteArrayList<lej> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            lejVar = new lej(i, i2);
            copyOnWriteArrayList2.add(lejVar);
            f167615d.put(str, copyOnWriteArrayList2);
        } else {
            Iterator<lej> it = copyOnWriteArrayList.iterator();
            do {
                if (!it.hasNext()) {
                    lejVar = null;
                    break;
                }
                lejVar = it.next();
            } while (lejVar.f131752a);
            if (lejVar == null) {
                lejVar = new lej(i, i2);
                copyOnWriteArrayList.add(lejVar);
            }
        }
        return lejVar;
    }

    /* JADX INFO: renamed from: e */
    public boolean m185549e() {
        return this.f167618b;
    }

    /* JADX INFO: renamed from: f */
    public void m185550f(boolean z) {
        this.f167618b = z;
    }
}
