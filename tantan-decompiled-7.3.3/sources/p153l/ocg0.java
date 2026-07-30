package p153l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ocg0 implements kcg0 {

    /* JADX INFO: renamed from: a */
    public List<kcg0> f146704a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f146705b;

    public ocg0(kcg0... kcg0VarArr) {
        this.f146704a = new LinkedList(Arrays.asList(kcg0VarArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m167212c(Collection<kcg0> collection) {
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
    public void m167213a(kcg0 kcg0Var) {
        if (kcg0Var.isUnsubscribed()) {
            return;
        }
        if (!this.f146705b) {
            synchronized (this) {
                try {
                    if (!this.f146705b) {
                        List linkedList = this.f146704a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f146704a = linkedList;
                        }
                        linkedList.add(kcg0Var);
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
    public void m167214b(kcg0 kcg0Var) {
        if (this.f146705b) {
            return;
        }
        synchronized (this) {
            List<kcg0> list = this.f146704a;
            if (!this.f146705b && list != null) {
                boolean zRemove = list.remove(kcg0Var);
                if (zRemove) {
                    kcg0Var.unsubscribe();
                }
            }
        }
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f146705b;
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        if (this.f146705b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f146705b) {
                    return;
                }
                this.f146705b = true;
                List<kcg0> list = this.f146704a;
                this.f146704a = null;
                m167212c(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ocg0() {
    }

    public ocg0(kcg0 kcg0Var) {
        LinkedList linkedList = new LinkedList();
        this.f146704a = linkedList;
        linkedList.add(kcg0Var);
    }
}
