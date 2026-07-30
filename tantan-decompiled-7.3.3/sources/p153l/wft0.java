package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class wft0 extends fht0 {

    /* JADX INFO: renamed from: a */
    public Object[] f188886a;

    /* JADX INFO: renamed from: b */
    public int f188887b;

    /* JADX INFO: renamed from: c */
    public boolean f188888c;

    public wft0(int i) {
        b1t0.m101503a(i, "initialCapacity");
        this.f188886a = new Object[i];
        this.f188887b = 0;
    }

    /* JADX INFO: renamed from: b */
    public final wft0 m206163b(Object obj) {
        obj.getClass();
        m206165d(1);
        Object[] objArr = this.f188886a;
        int i = this.f188887b;
        this.f188887b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m206164c(Object[] objArr, int i) {
        c9u0.m108459b(objArr, i);
        m206165d(i);
        System.arraycopy(objArr, 0, this.f188886a, this.f188887b, i);
        this.f188887b += i;
    }

    /* JADX INFO: renamed from: d */
    public final void m206165d(int i) {
        int length = this.f188886a.length;
        int iM125603a = fht0.m125603a(length, this.f188887b + i);
        if (iM125603a > length || this.f188888c) {
            this.f188886a = Arrays.copyOf(this.f188886a, iM125603a);
            this.f188888c = false;
        }
    }
}
