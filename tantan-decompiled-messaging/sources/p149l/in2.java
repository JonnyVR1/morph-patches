package p149l;

import java.util.Queue;
import p149l.xa80;

/* JADX INFO: loaded from: classes.dex */
abstract class in2<T extends xa80> {

    /* JADX INFO: renamed from: a */
    private final Queue<T> f113987a = sck0.m183406f(20);

    /* JADX INFO: renamed from: a */
    public abstract T mo137120a();

    /* JADX INFO: renamed from: b */
    public T m137121b() {
        T tPoll = this.f113987a.poll();
        return tPoll == null ? (T) mo137120a() : tPoll;
    }

    /* JADX INFO: renamed from: c */
    public void m137122c(T t) {
        if (this.f113987a.size() < 20) {
            this.f113987a.offer(t);
        }
    }
}
