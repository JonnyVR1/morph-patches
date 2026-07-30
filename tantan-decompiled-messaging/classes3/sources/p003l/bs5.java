package p003l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class bs5 implements c4g0 {

    /* JADX INFO: renamed from: a */
    public Set<c4g0> f2482a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f2483b;

    public bs5(c4g0... c4g0VarArr) {
        this.f2482a = new HashSet(Arrays.asList(c4g0VarArr));
    }

    /* JADX INFO: renamed from: e */
    private static void m3163e(Collection<c4g0> collection) {
        if (collection == null) {
            return;
        }
        Iterator<c4g0> it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        f5f.m3963d(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m3164a(c4g0 c4g0Var) {
        if (c4g0Var.isUnsubscribed()) {
            return;
        }
        if (!this.f2483b) {
            synchronized (this) {
                try {
                    if (!this.f2483b) {
                        if (this.f2482a == null) {
                            this.f2482a = new HashSet(4);
                        }
                        this.f2482a.add(c4g0Var);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public void m3165b(c4g0... c4g0VarArr) {
        int i = 0;
        if (!this.f2483b) {
            synchronized (this) {
                try {
                    if (!this.f2483b) {
                        if (this.f2482a == null) {
                            this.f2482a = new HashSet(c4g0VarArr.length);
                        }
                        int length = c4g0VarArr.length;
                        while (i < length) {
                            c4g0 c4g0Var = c4g0VarArr[i];
                            if (!c4g0Var.isUnsubscribed()) {
                                this.f2482a.add(c4g0Var);
                            }
                            i++;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int length2 = c4g0VarArr.length;
        while (i < length2) {
            c4g0VarArr[i].unsubscribe();
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3166c() {
        Set<c4g0> set;
        if (this.f2483b) {
            return;
        }
        synchronized (this) {
            if (!this.f2483b && (set = this.f2482a) != null) {
                this.f2482a = null;
                m3163e(set);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3167d(c4g0 c4g0Var) {
        Set<c4g0> set;
        if (this.f2483b) {
            return;
        }
        synchronized (this) {
            if (!this.f2483b && (set = this.f2482a) != null) {
                boolean zRemove = set.remove(c4g0Var);
                if (zRemove) {
                    c4g0Var.unsubscribe();
                }
            }
        }
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f2483b;
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        if (this.f2483b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f2483b) {
                    return;
                }
                this.f2483b = true;
                Set<c4g0> set = this.f2482a;
                this.f2482a = null;
                m3163e(set);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bs5() {
    }
}
