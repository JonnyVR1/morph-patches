package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class q6t0 extends z7t0 {

    /* JADX INFO: renamed from: a */
    public Object[] f152957a;

    /* JADX INFO: renamed from: b */
    public int f152958b;

    /* JADX INFO: renamed from: c */
    public boolean f152959c;

    public q6t0(int i) {
        vrs0.m199751a(i, "initialCapacity");
        this.f152957a = new Object[i];
        this.f152958b = 0;
    }

    /* JADX INFO: renamed from: b */
    public final q6t0 m173172b(Object obj) {
        obj.getClass();
        m173174d(1);
        Object[] objArr = this.f152957a;
        int i = this.f152958b;
        this.f152958b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m173173c(Object[] objArr, int i) {
        wzt0.m206303b(objArr, i);
        m173174d(i);
        System.arraycopy(objArr, 0, this.f152957a, this.f152958b, i);
        this.f152958b += i;
    }

    /* JADX INFO: renamed from: d */
    public final void m173174d(int i) {
        int length = this.f152957a.length;
        int iM217505a = z7t0.m217505a(length, this.f152958b + i);
        if (iM217505a > length || this.f152959c) {
            this.f152957a = Arrays.copyOf(this.f152957a, iM217505a);
            this.f152959c = false;
        }
    }
}
