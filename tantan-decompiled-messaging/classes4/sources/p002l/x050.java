package p002l;

import java.util.LinkedList;
import java.util.Queue;
import p002l.gjc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class x050<T extends gjc0> {

    /* JADX INFO: renamed from: a */
    public int f22063a;

    /* JADX INFO: renamed from: b */
    public Queue<T> f22064b = new LinkedList();

    public x050(int i) {
        this.f22063a = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo20238a();

    /* JADX INFO: renamed from: b */
    public T m25575b() {
        return this.f22064b.size() == 0 ? (T) mo20238a() : this.f22064b.poll();
    }

    /* JADX INFO: renamed from: c */
    public void m25576c(T t) {
        if (t == null || this.f22064b.size() >= this.f22063a) {
            return;
        }
        t.recycle();
        this.f22064b.offer(t);
    }
}
