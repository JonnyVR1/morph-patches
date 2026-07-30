package p153l;

/* JADX INFO: loaded from: classes.dex */
public class qj80<T> implements oj80<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f157943a;

    /* JADX INFO: renamed from: b */
    public int f157944b;

    public qj80(int i) {
        if (i > 0) {
            this.f157943a = new Object[i];
        } else {
            wg3.m206174a("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // p153l.oj80
    /* JADX INFO: renamed from: a */
    public void mo167844a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f157944b;
            Object[] objArr = this.f157943a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f157944b = i3 + 1;
            }
        }
    }

    @Override // p153l.oj80
    public T acquire() {
        int i = this.f157944b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f157943a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f157944b = i - 1;
        return t;
    }

    @Override // p153l.oj80
    public boolean release(T t) {
        int i = this.f157944b;
        Object[] objArr = this.f157943a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f157944b = i + 1;
        return true;
    }
}
