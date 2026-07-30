package p153l;

import java.util.Queue;
import p153l.dj80;

/* JADX INFO: loaded from: classes.dex */
abstract class pn2<T extends dj80> {

    /* JADX INFO: renamed from: a */
    private final Queue<T> f153245a = ylk0.m216582f(20);

    /* JADX INFO: renamed from: a */
    public abstract T mo131794a();

    /* JADX INFO: renamed from: b */
    public T m173000b() {
        T tPoll = this.f153245a.poll();
        return tPoll == null ? (T) mo131794a() : tPoll;
    }

    /* JADX INFO: renamed from: c */
    public void m173001c(T t) {
        if (this.f153245a.size() < 20) {
            this.f153245a.offer(t);
        }
    }
}
