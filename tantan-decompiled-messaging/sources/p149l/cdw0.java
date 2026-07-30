package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class cdw0 {

    /* JADX INFO: renamed from: a */
    public long[] f80414a;

    /* JADX INFO: renamed from: b */
    public Object[] f80415b;

    /* JADX INFO: renamed from: c */
    public int f80416c;

    /* JADX INFO: renamed from: d */
    public int f80417d;

    public cdw0(int i) {
        this.f80414a = new long[10];
        this.f80415b = new Object[10];
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m106296a() {
        return this.f80417d;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final synchronized Object m106297b() {
        if (this.f80417d == 0) {
            return null;
        }
        return m106301f();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized Object m106298c(long j) {
        Object objM106301f;
        objM106301f = null;
        while (this.f80417d > 0 && j - this.f80414a[this.f80416c] >= 0) {
            objM106301f = m106301f();
        }
        return objM106301f;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m106299d(long j, Object obj) {
        try {
            int i = this.f80417d;
            if (i > 0) {
                if (j <= this.f80414a[((this.f80416c + i) - 1) % this.f80415b.length]) {
                    m106300e();
                }
            }
            int length = this.f80415b.length;
            if (this.f80417d >= length) {
                int i2 = length + length;
                long[] jArr = new long[i2];
                Object[] objArr = new Object[i2];
                int i3 = this.f80416c;
                int i4 = length - i3;
                System.arraycopy(this.f80414a, i3, jArr, 0, i4);
                System.arraycopy(this.f80415b, this.f80416c, objArr, 0, i4);
                int i5 = this.f80416c;
                if (i5 > 0) {
                    System.arraycopy(this.f80414a, 0, jArr, i4, i5);
                    System.arraycopy(this.f80415b, 0, objArr, i4, this.f80416c);
                }
                this.f80414a = jArr;
                this.f80415b = objArr;
                this.f80416c = 0;
            }
            int i6 = this.f80416c;
            int i7 = this.f80417d;
            Object[] objArr2 = this.f80415b;
            int length2 = (i6 + i7) % objArr2.length;
            this.f80414a[length2] = j;
            objArr2[length2] = obj;
            this.f80417d = i7 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m106300e() {
        this.f80416c = 0;
        this.f80417d = 0;
        Arrays.fill(this.f80415b, (Object) null);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m106301f() {
        f5v0.m119535f(this.f80417d > 0);
        Object[] objArr = this.f80415b;
        int i = this.f80416c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f80416c = (i + 1) % objArr.length;
        this.f80417d--;
        return obj;
    }

    public cdw0() {
        this(10);
    }
}
