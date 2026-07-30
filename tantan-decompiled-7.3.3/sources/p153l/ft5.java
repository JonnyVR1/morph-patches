package p153l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ft5 implements kcg0 {

    /* JADX INFO: renamed from: a */
    public Set<kcg0> f100716a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f100717b;

    public ft5(kcg0... kcg0VarArr) {
        this.f100716a = new HashSet(Arrays.asList(kcg0VarArr));
    }

    /* JADX INFO: renamed from: e */
    private static void m127296e(Collection<kcg0> collection) {
        if (collection == null) {
            return;
        }
        Iterator<kcg0> it = collection.iterator();
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
        j6f.m143662d(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m127297a(kcg0 kcg0Var) {
        if (kcg0Var.isUnsubscribed()) {
            return;
        }
        if (!this.f100717b) {
            synchronized (this) {
                try {
                    if (!this.f100717b) {
                        if (this.f100716a == null) {
                            this.f100716a = new HashSet(4);
                        }
                        this.f100716a.add(kcg0Var);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        kcg0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public void m127298b(kcg0... kcg0VarArr) {
        int i = 0;
        if (!this.f100717b) {
            synchronized (this) {
                try {
                    if (!this.f100717b) {
                        if (this.f100716a == null) {
                            this.f100716a = new HashSet(kcg0VarArr.length);
                        }
                        int length = kcg0VarArr.length;
                        while (i < length) {
                            kcg0 kcg0Var = kcg0VarArr[i];
                            if (!kcg0Var.isUnsubscribed()) {
                                this.f100716a.add(kcg0Var);
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
        int length2 = kcg0VarArr.length;
        while (i < length2) {
            kcg0VarArr[i].unsubscribe();
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m127299c() {
        Set<kcg0> set;
        if (this.f100717b) {
            return;
        }
        synchronized (this) {
            if (!this.f100717b && (set = this.f100716a) != null) {
                this.f100716a = null;
                m127296e(set);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m127300d(kcg0 kcg0Var) {
        Set<kcg0> set;
        if (this.f100717b) {
            return;
        }
        synchronized (this) {
            if (!this.f100717b && (set = this.f100716a) != null) {
                boolean zRemove = set.remove(kcg0Var);
                if (zRemove) {
                    kcg0Var.unsubscribe();
                }
            }
        }
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f100717b;
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        if (this.f100717b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f100717b) {
                    return;
                }
                this.f100717b = true;
                Set<kcg0> set = this.f100716a;
                this.f100716a = null;
                m127296e(set);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ft5() {
    }
}
