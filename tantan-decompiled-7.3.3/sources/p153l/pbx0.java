package p153l;

import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class pbx0 extends mow0 implements RandomAccess, orx0, bxx0 {

    /* JADX INFO: renamed from: d */
    public static final double[] f151442d;

    /* JADX INFO: renamed from: b */
    public double[] f151443b;

    /* JADX INFO: renamed from: c */
    public int f151444c;

    static {
        double[] dArr = new double[0];
        f151442d = dArr;
        new pbx0(dArr, 0, false);
    }

    public pbx0() {
        this(f151442d, 0, true);
    }

    /* JADX INFO: renamed from: h */
    public static int m171534h(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m159318a();
        if (i < 0 || i > (i2 = this.f151444c)) {
            kym.m151996a(m171538i(i));
            return;
        }
        int i3 = i + 1;
        double[] dArr = this.f151443b;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[m171534h(length)];
            System.arraycopy(this.f151443b, 0, dArr2, 0, i);
            System.arraycopy(this.f151443b, i, dArr2, i3, this.f151444c - i);
            this.f151443b = dArr2;
        }
        this.f151443b[i] = dDoubleValue;
        this.f151444c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.mow0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m159318a();
        Charset charset = srx0.f170385a;
        collection.getClass();
        if (!(collection instanceof pbx0)) {
            return super.addAll(collection);
        }
        pbx0 pbx0Var = (pbx0) collection;
        int i = pbx0Var.f151444c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f151444c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 < i) {
            jym.m147603a();
            return false;
        }
        int i3 = i2 + i;
        double[] dArr = this.f151443b;
        if (i3 > dArr.length) {
            this.f151443b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(pbx0Var.f151443b, 0, this.f151443b, this.f151444c, pbx0Var.f151444c);
        this.f151444c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final double m171535c(int i) {
        m171539j(i);
        return this.f151443b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbx0)) {
            return super.equals(obj);
        }
        pbx0 pbx0Var = (pbx0) obj;
        if (this.f151444c != pbx0Var.f151444c) {
            return false;
        }
        double[] dArr = pbx0Var.f151443b;
        for (int i = 0; i < this.f151444c; i++) {
            if (Double.doubleToLongBits(this.f151443b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m171536f(double d) {
        m159318a();
        int i = this.f151444c;
        int length = this.f151443b.length;
        if (i == length) {
            double[] dArr = new double[m171534h(length)];
            System.arraycopy(this.f151443b, 0, dArr, 0, this.f151444c);
            this.f151443b = dArr;
        }
        double[] dArr2 = this.f151443b;
        int i2 = this.f151444c;
        this.f151444c = i2 + 1;
        dArr2[i2] = d;
    }

    /* JADX INFO: renamed from: g */
    public final void m171537g(int i) {
        int length = this.f151443b.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f151443b = new double[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = m171534h(length);
        }
        this.f151443b = Arrays.copyOf(this.f151443b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m171539j(i);
        return Double.valueOf(this.f151443b[i]);
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f151444c; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f151443b[i2]);
            Charset charset = srx0.f170385a;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final String m171538i(int i) {
        return "Index:" + i + ", Size:" + this.f151444c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f151444c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f151443b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m171539j(int i) {
        if (i < 0 || i >= this.f151444c) {
            kym.m151996a(m171538i(i));
        }
    }

    @Override // p153l.mow0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m159318a();
        m171539j(i);
        double[] dArr = this.f151443b;
        double d = dArr[i];
        int i2 = this.f151444c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f151444c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m159318a();
        if (i2 < i) {
            kym.m151996a("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f151443b;
        System.arraycopy(dArr, i2, dArr, i, this.f151444c - i2);
        this.f151444c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m159318a();
        m171539j(i);
        double[] dArr = this.f151443b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f151444c;
    }

    @Override // p153l.orx0
    public final /* bridge */ /* synthetic */ orx0 zzd(int i) {
        if (i >= this.f151444c) {
            return new pbx0(i == 0 ? f151442d : Arrays.copyOf(this.f151443b, i), this.f151444c, true);
        }
        fig0.m125680a();
        return null;
    }

    public pbx0(double[] dArr, int i, boolean z) {
        super(z);
        this.f151443b = dArr;
        this.f151444c = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m171536f(((Double) obj).doubleValue());
        return true;
    }
}
