package p149l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g4g0 implements c4g0 {

    /* JADX INFO: renamed from: a */
    public List<c4g0> f100564a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f100565b;

    public g4g0(c4g0... c4g0VarArr) {
        this.f100564a = new LinkedList(Arrays.asList(c4g0VarArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m124366c(Collection<c4g0> collection) {
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
        f5f.m119490d(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m124367a(c4g0 c4g0Var) {
        if (c4g0Var.isUnsubscribed()) {
            return;
        }
        if (!this.f100565b) {
            synchronized (this) {
                try {
                    if (!this.f100565b) {
                        List linkedList = this.f100564a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f100564a = linkedList;
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
    public void m124368b(c4g0 c4g0Var) {
        if (this.f100565b) {
            return;
        }
        synchronized (this) {
            List<c4g0> list = this.f100564a;
            if (!this.f100565b && list != null) {
                boolean zRemove = list.remove(c4g0Var);
                if (zRemove) {
                    c4g0Var.unsubscribe();
                }
            }
        }
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.f100565b;
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        if (this.f100565b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f100565b) {
                    return;
                }
                this.f100565b = true;
                List<c4g0> list = this.f100564a;
                this.f100564a = null;
                m124366c(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public g4g0() {
    }

    public g4g0(c4g0 c4g0Var) {
        LinkedList linkedList = new LinkedList();
        this.f100564a = linkedList;
        linkedList.add(c4g0Var);
    }
}
