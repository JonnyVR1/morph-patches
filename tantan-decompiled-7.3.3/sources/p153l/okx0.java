package p153l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class okx0 extends bgx0 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final okx0 f147796d = new okx0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public Object[] f147797b;

    /* JADX INFO: renamed from: c */
    public int f147798c;

    public okx0(Object[] objArr, int i, boolean z) {
        super(z);
        this.f147797b = objArr;
        this.f147798c = i;
    }

    /* JADX INFO: renamed from: c */
    public static okx0 m168062c() {
        return f147796d;
    }

    /* JADX INFO: renamed from: f */
    private final String m168063f(int i) {
        return "Index:" + i + ", Size:" + this.f147798c;
    }

    /* JADX INFO: renamed from: g */
    private final void m168064g(int i) {
        if (i < 0 || i >= this.f147798c) {
            kym.m151996a(m168063f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m104285a();
        if (i < 0 || i > (i2 = this.f147798c)) {
            kym.m151996a(m168063f(i));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f147797b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f147797b, i, objArr2, i3, this.f147798c - i);
            this.f147797b = objArr2;
        }
        this.f147797b[i] = obj;
        this.f147798c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m168064g(i);
        return this.f147797b[i];
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m104285a();
        m168064g(i);
        Object[] objArr = this.f147797b;
        Object obj = objArr[i];
        int i2 = this.f147798c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f147798c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m104285a();
        m168064g(i);
        Object[] objArr = this.f147797b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f147798c;
    }

    @Override // p153l.fjx0
    public final /* bridge */ /* synthetic */ fjx0 zzd(int i) {
        if (i >= this.f147798c) {
            return new okx0(Arrays.copyOf(this.f147797b, i), this.f147798c, true);
        }
        fig0.m125680a();
        return null;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m104285a();
        int i = this.f147798c;
        Object[] objArr = this.f147797b;
        if (i == objArr.length) {
            this.f147797b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f147797b;
        int i2 = this.f147798c;
        this.f147798c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
