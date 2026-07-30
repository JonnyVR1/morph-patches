package p153l;

import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class qg3<T> {

    /* JADX INFO: renamed from: a */
    public final SparseArray<C19570a<T>> f157373a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public C19570a<T> f157374b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public C19570a<T> f157375c;

    /* JADX INFO: renamed from: l.qg3$a */
    @VisibleForTesting
    public static class C19570a<I> {

        /* JADX INFO: renamed from: a */
        public C19570a<I> f157376a;

        /* JADX INFO: renamed from: b */
        public int f157377b;

        /* JADX INFO: renamed from: c */
        public LinkedList<I> f157378c;

        /* JADX INFO: renamed from: d */
        public C19570a<I> f157379d;

        public C19570a(C19570a<I> c19570a, int i, LinkedList<I> linkedList, C19570a<I> c19570a2) {
            this.f157376a = c19570a;
            this.f157377b = i;
            this.f157378c = linkedList;
            this.f157379d = c19570a2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.f157377b + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized T m176431a(int i) {
        C19570a<T> c19570a = this.f157373a.get(i);
        if (c19570a == null) {
            return null;
        }
        T tPollFirst = c19570a.f157378c.pollFirst();
        m176433c(c19570a);
        return tPollFirst;
    }

    /* JADX INFO: renamed from: b */
    public final void m176432b(C19570a<T> c19570a) {
        if (c19570a == null || !c19570a.f157378c.isEmpty()) {
            return;
        }
        m176434d(c19570a);
        this.f157373a.remove(c19570a.f157377b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m176433c(C19570a<T> c19570a) {
        if (this.f157374b == c19570a) {
            return;
        }
        m176434d(c19570a);
        C19570a<T> c19570a2 = this.f157374b;
        if (c19570a2 == 0) {
            this.f157374b = c19570a;
            this.f157375c = c19570a;
        } else {
            c19570a.f157379d = c19570a2;
            c19570a2.f157376a = c19570a;
            this.f157374b = c19570a;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m176434d(C19570a<T> c19570a) {
        try {
            C19570a c19570a2 = (C19570a<T>) c19570a.f157376a;
            C19570a c19570a3 = (C19570a<T>) c19570a.f157379d;
            if (c19570a2 != null) {
                c19570a2.f157379d = c19570a3;
            }
            if (c19570a3 != null) {
                c19570a3.f157376a = c19570a2;
            }
            c19570a.f157376a = null;
            c19570a.f157379d = null;
            if (c19570a == this.f157374b) {
                this.f157374b = c19570a3;
            }
            if (c19570a == this.f157375c) {
                this.f157375c = c19570a2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m176435e(int i, T t) {
        try {
            C19570a<T> c19570a = this.f157373a.get(i);
            if (c19570a == null) {
                C19570a<T> c19570a2 = new C19570a<>(null, i, new LinkedList(), null);
                this.f157373a.put(i, c19570a2);
                c19570a = c19570a2;
            }
            c19570a.f157378c.addLast(t);
            m176433c(c19570a);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized T m176436f() {
        C19570a<T> c19570a = this.f157375c;
        if (c19570a == null) {
            return null;
        }
        T tPollLast = c19570a.f157378c.pollLast();
        m176432b(c19570a);
        return tPollLast;
    }
}
