package p153l;

import com.google.common.collect.C2996l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class z850<K> extends C2996l<K> {

    /* JADX INFO: renamed from: i */
    public transient long[] f203315i;

    /* JADX INFO: renamed from: j */
    public transient int f203316j;

    /* JADX INFO: renamed from: k */
    public transient int f203317k;

    public z850(int i) {
        this(i, 1.0f);
    }

    /* JADX INFO: renamed from: E */
    public final int m218939E(int i) {
        return (int) (this.f203315i[i] >>> 32);
    }

    /* JADX INFO: renamed from: F */
    public final int m218940F(int i) {
        return (int) this.f203315i[i];
    }

    /* JADX INFO: renamed from: G */
    public final void m218941G(int i, int i2) {
        long[] jArr = this.f203315i;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX INFO: renamed from: H */
    public final void m218942H(int i, int i2) {
        if (i == -2) {
            this.f203316j = i2;
        } else {
            m218943I(i, i2);
        }
        if (i2 == -2) {
            this.f203317k = i;
        } else {
            m218941G(i2, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m218943I(int i, int i2) {
        long[] jArr = this.f203315i;
        jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
    }

    @Override // com.google.common.collect.C2996l
    /* JADX INFO: renamed from: a */
    public void mo16328a() {
        super.mo16328a();
        this.f203316j = -2;
        this.f203317k = -2;
    }

    @Override // com.google.common.collect.C2996l
    /* JADX INFO: renamed from: e */
    public int mo16330e() {
        int i = this.f203316j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.C2996l
    /* JADX INFO: renamed from: n */
    public void mo16337n(int i, float f) {
        super.mo16337n(i, f);
        this.f203316j = -2;
        this.f203317k = -2;
        long[] jArr = new long[i];
        this.f203315i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.C2996l
    /* JADX INFO: renamed from: o */
    public void mo16338o(int i, K k, int i2, int i3) {
        super.mo16338o(i, k, i2, i3);
        m218942H(this.f203317k, i);
        m218942H(i, -2);
    }

    @Override // com.google.common.collect.C2996l
    /* JADX INFO: renamed from: p */
    public void mo16339p(int i) {
        int iM16327C = m16327C() - 1;
        m218942H(m218939E(i), m218940F(i));
        if (i < iM16327C) {
            m218942H(m218939E(iM16327C), i);
            m218942H(i, m218940F(iM16327C));
        }
        super.mo16339p(i);
    }

    @Override // com.google.common.collect.C2996l
    /* JADX INFO: renamed from: s */
    public int mo16340s(int i) {
        int iM218940F = m218940F(i);
        if (iM218940F == -2) {
            return -1;
        }
        return iM218940F;
    }

    @Override // com.google.common.collect.C2996l
    /* JADX INFO: renamed from: t */
    public int mo16341t(int i, int i2) {
        return i == m16327C() ? i2 : i;
    }

    @Override // com.google.common.collect.C2996l
    /* JADX INFO: renamed from: y */
    public void mo16346y(int i) {
        super.mo16346y(i);
        long[] jArr = this.f203315i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.f203315i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public z850(int i, float f) {
        super(i, f);
    }
}
