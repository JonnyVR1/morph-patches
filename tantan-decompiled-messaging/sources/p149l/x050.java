package p149l;

import java.util.LinkedList;
import java.util.Queue;
import p149l.gjc0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x050<T extends gjc0> {

    /* JADX INFO: renamed from: a */
    public int f188929a;

    /* JADX INFO: renamed from: b */
    public Queue<T> f188930b = new LinkedList();

    public x050(int i) {
        this.f188929a = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo168665a();

    /* JADX INFO: renamed from: b */
    public T m206580b() {
        return this.f188930b.size() == 0 ? (T) mo168665a() : this.f188930b.poll();
    }

    /* JADX INFO: renamed from: c */
    public void m206581c(T t) {
        if (t == null || this.f188930b.size() >= this.f188929a) {
            return;
        }
        t.recycle();
        this.f188930b.offer(t);
    }
}
