package p149l;

/* JADX INFO: loaded from: classes.dex */
public class kb80<T> implements ib80<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f122222a;

    /* JADX INFO: renamed from: b */
    public int f122223b;

    public kb80(int i) {
        if (i > 0) {
            this.f122222a = new Object[i];
        } else {
            ig3.m135964a("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // p149l.ib80
    /* JADX INFO: renamed from: a */
    public void mo135252a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f122223b;
            Object[] objArr = this.f122222a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f122223b = i3 + 1;
            }
        }
    }

    @Override // p149l.ib80
    public T acquire() {
        int i = this.f122223b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f122222a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f122223b = i - 1;
        return t;
    }

    @Override // p149l.ib80
    public boolean release(T t) {
        int i = this.f122223b;
        Object[] objArr = this.f122222a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f122223b = i + 1;
        return true;
    }
}
