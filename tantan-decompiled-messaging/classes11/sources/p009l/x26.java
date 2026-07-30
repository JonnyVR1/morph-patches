package p009l;

import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class x26 implements c36 {

    /* JADX INFO: renamed from: a */
    public int f22408a;

    /* JADX INFO: renamed from: b */
    public int f22409b;

    public x26(int i, int i2) {
        this.f22408a = i;
        this.f22409b = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m24679b(int i) {
        this.f22408a += i;
        this.f22409b += i;
    }

    @Override // p009l.c36
    public final j760<Integer, Integer> getIndex(String str) {
        return new j760<>(Integer.valueOf(this.f22408a), Integer.valueOf(this.f22409b));
    }
}
