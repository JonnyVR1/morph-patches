package p153l;

import java.util.LinkedList;
import java.util.Queue;
import p153l.nrc0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m950<T extends nrc0> {

    /* JADX INFO: renamed from: a */
    public int f135351a;

    /* JADX INFO: renamed from: b */
    public Queue<T> f135352b = new LinkedList();

    public m950(int i) {
        this.f135351a = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo157560a();

    /* JADX INFO: renamed from: b */
    public T m157561b() {
        return this.f135352b.size() == 0 ? (T) mo157560a() : this.f135352b.poll();
    }

    /* JADX INFO: renamed from: c */
    public void m157562c(T t) {
        if (t == null || this.f135352b.size() >= this.f135351a) {
            return;
        }
        t.recycle();
        this.f135352b.offer(t);
    }
}
