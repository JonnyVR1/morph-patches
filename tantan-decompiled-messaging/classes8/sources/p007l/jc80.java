package p007l;

import java.util.PriorityQueue;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class jc80 {

    /* JADX INFO: renamed from: a */
    public String f2972a;

    /* JADX INFO: renamed from: b */
    public kc80 f2973b = null;

    /* JADX INFO: renamed from: c */
    public long f2974c = -1;

    /* JADX INFO: renamed from: d */
    public PriorityQueue<kc80> f2975d = new PriorityQueue<>();

    public jc80(String str) {
        this.f2972a = str;
    }

    /* JADX INFO: renamed from: a */
    public long m9514a() {
        return this.f2974c;
    }

    /* JADX INFO: renamed from: b */
    public void m9515b() {
        this.f2974c = -1L;
    }

    /* JADX INFO: renamed from: c */
    public void m9516c(kc80 kc80Var) {
        this.f2973b = kc80Var;
    }

    /* JADX INFO: renamed from: d */
    public void m9517d(long j) {
        this.f2974c = j;
    }
}
