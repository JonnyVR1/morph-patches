package p149l;

import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class cg3<T> {

    /* JADX INFO: renamed from: a */
    public final SparseArray<C16125a<T>> f80693a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public C16125a<T> f80694b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public C16125a<T> f80695c;

    /* JADX INFO: renamed from: l.cg3$a */
    @VisibleForTesting
    public static class C16125a<I> {

        /* JADX INFO: renamed from: a */
        public C16125a<I> f80696a;

        /* JADX INFO: renamed from: b */
        public int f80697b;

        /* JADX INFO: renamed from: c */
        public LinkedList<I> f80698c;

        /* JADX INFO: renamed from: d */
        public C16125a<I> f80699d;

        public C16125a(C16125a<I> c16125a, int i, LinkedList<I> linkedList, C16125a<I> c16125a2) {
            this.f80696a = c16125a;
            this.f80697b = i;
            this.f80698c = linkedList;
            this.f80699d = c16125a2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.f80697b + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized T m106652a(int i) {
        C16125a<T> c16125a = this.f80693a.get(i);
        if (c16125a == null) {
            return null;
        }
        T tPollFirst = c16125a.f80698c.pollFirst();
        m106654c(c16125a);
        return tPollFirst;
    }

    /* JADX INFO: renamed from: b */
    public final void m106653b(C16125a<T> c16125a) {
        if (c16125a == null || !c16125a.f80698c.isEmpty()) {
            return;
        }
        m106655d(c16125a);
        this.f80693a.remove(c16125a.f80697b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m106654c(C16125a<T> c16125a) {
        if (this.f80694b == c16125a) {
            return;
        }
        m106655d(c16125a);
        C16125a<T> c16125a2 = this.f80694b;
        if (c16125a2 == 0) {
            this.f80694b = c16125a;
            this.f80695c = c16125a;
        } else {
            c16125a.f80699d = c16125a2;
            c16125a2.f80696a = c16125a;
            this.f80694b = c16125a;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m106655d(C16125a<T> c16125a) {
        try {
            C16125a c16125a2 = (C16125a<T>) c16125a.f80696a;
            C16125a c16125a3 = (C16125a<T>) c16125a.f80699d;
            if (c16125a2 != null) {
                c16125a2.f80699d = c16125a3;
            }
            if (c16125a3 != null) {
                c16125a3.f80696a = c16125a2;
            }
            c16125a.f80696a = null;
            c16125a.f80699d = null;
            if (c16125a == this.f80694b) {
                this.f80694b = c16125a3;
            }
            if (c16125a == this.f80695c) {
                this.f80695c = c16125a2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m106656e(int i, T t) {
        try {
            C16125a<T> c16125a = this.f80693a.get(i);
            if (c16125a == null) {
                C16125a<T> c16125a2 = new C16125a<>(null, i, new LinkedList(), null);
                this.f80693a.put(i, c16125a2);
                c16125a = c16125a2;
            }
            c16125a.f80698c.addLast(t);
            m106654c(c16125a);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized T m106657f() {
        C16125a<T> c16125a = this.f80695c;
        if (c16125a == null) {
            return null;
        }
        T tPollLast = c16125a.f80698c.pollLast();
        m106653b(c16125a);
        return tPollLast;
    }
}
