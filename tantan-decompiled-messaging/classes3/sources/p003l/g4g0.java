package p003l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class g4g0 implements c4g0 {

    /* JADX INFO: renamed from: a */
    public List<c4g0> f3799a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f3800b;

    public g4g0(c4g0... c4g0VarArr) {
        this.f3799a = new LinkedList(Arrays.asList(c4g0VarArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m4516c(Collection<c4g0> collection) {
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
    public void m4517a(c4g0 c4g0Var) {
        if (c4g0Var.isUnsubscribed()) {
            return;
        }
        if (!this.f3800b) {
            synchronized (this) {
                try {
                    if (!this.f3800b) {
                        List linkedList = this.f3799a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f3799a = linkedList;
                        }
                        linkedList.add(c4g0Var);
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
    public void m4518b(c4g0 c4g0Var) {
        if (this.f3800b) {
            return;
        }
        synchronized (this) {
            List<c4g0> list = this.f3799a;
            if (!this.f3800b && list != null) {
                boolean zRemove = list.remove(c4g0Var);
                if (zRemove) {
                    c4g0Var.unsubscribe();
                }
            }
        }
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f3800b;
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        if (this.f3800b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f3800b) {
                    return;
                }
                this.f3800b = true;
                List<c4g0> list = this.f3799a;
                this.f3799a = null;
                m4516c(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public g4g0() {
    }

    public g4g0(c4g0 c4g0Var) {
        LinkedList linkedList = new LinkedList();
        this.f3799a = linkedList;
        linkedList.add(c4g0Var);
    }
}
