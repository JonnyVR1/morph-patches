package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class imw0 {

    /* JADX INFO: renamed from: a */
    public long[] f115840a;

    /* JADX INFO: renamed from: b */
    public Object[] f115841b;

    /* JADX INFO: renamed from: c */
    public int f115842c;

    /* JADX INFO: renamed from: d */
    public int f115843d;

    public imw0(int i) {
        this.f115840a = new long[10];
        this.f115841b = new Object[10];
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m140992a() {
        return this.f115843d;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final synchronized Object m140993b() {
        if (this.f115843d == 0) {
            return null;
        }
        return m140997f();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized Object m140994c(long j) {
        Object objM140997f;
        objM140997f = null;
        while (this.f115843d > 0 && j - this.f115840a[this.f115842c] >= 0) {
            objM140997f = m140997f();
        }
        return objM140997f;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m140995d(long j, Object obj) {
        try {
            int i = this.f115843d;
            if (i > 0) {
                if (j <= this.f115840a[((this.f115842c + i) - 1) % this.f115841b.length]) {
                    m140996e();
                }
            }
            int length = this.f115841b.length;
            if (this.f115843d >= length) {
                int i2 = length + length;
                long[] jArr = new long[i2];
                Object[] objArr = new Object[i2];
                int i3 = this.f115842c;
                int i4 = length - i3;
                System.arraycopy(this.f115840a, i3, jArr, 0, i4);
                System.arraycopy(this.f115841b, this.f115842c, objArr, 0, i4);
                int i5 = this.f115842c;
                if (i5 > 0) {
                    System.arraycopy(this.f115840a, 0, jArr, i4, i5);
                    System.arraycopy(this.f115841b, 0, objArr, i4, this.f115842c);
                }
                this.f115840a = jArr;
                this.f115841b = objArr;
                this.f115842c = 0;
            }
            int i6 = this.f115842c;
            int i7 = this.f115843d;
            Object[] objArr2 = this.f115841b;
            int length2 = (i6 + i7) % objArr2.length;
            this.f115840a[length2] = j;
            objArr2[length2] = obj;
            this.f115843d = i7 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m140996e() {
        this.f115842c = 0;
        this.f115843d = 0;
        Arrays.fill(this.f115841b, (Object) null);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m140997f() {
        lev0.m153958f(this.f115843d > 0);
        Object[] objArr = this.f115841b;
        int i = this.f115842c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f115842c = (i + 1) % objArr.length;
        this.f115843d--;
        return obj;
    }

    public imw0() {
        this(10);
    }
}
