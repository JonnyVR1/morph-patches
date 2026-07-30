package p149l;

import com.google.common.collect.C2973l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class k050<K> extends C2973l<K> {

    /* JADX INFO: renamed from: i */
    public transient long[] f120452i;

    /* JADX INFO: renamed from: j */
    public transient int f120453j;

    /* JADX INFO: renamed from: k */
    public transient int f120454k;

    public k050(int i) {
        this(i, 1.0f);
    }

    /* JADX INFO: renamed from: E */
    public final int m143988E(int i) {
        return (int) (this.f120452i[i] >>> 32);
    }

    /* JADX INFO: renamed from: F */
    public final int m143989F(int i) {
        return (int) this.f120452i[i];
    }

    /* JADX INFO: renamed from: G */
    public final void m143990G(int i, int i2) {
        long[] jArr = this.f120452i;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX INFO: renamed from: H */
    public final void m143991H(int i, int i2) {
        if (i == -2) {
            this.f120453j = i2;
        } else {
            m143992I(i, i2);
        }
        if (i2 == -2) {
            this.f120454k = i;
        } else {
            m143990G(i2, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m143992I(int i, int i2) {
        long[] jArr = this.f120452i;
        jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
    }

    @Override // com.google.common.collect.C2973l
    /* JADX INFO: renamed from: a */
    public void mo16274a() {
        super.mo16274a();
        this.f120453j = -2;
        this.f120454k = -2;
    }

    @Override // com.google.common.collect.C2973l
    /* JADX INFO: renamed from: e */
    public int mo16276e() {
        int i = this.f120453j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.C2973l
    /* JADX INFO: renamed from: n */
    public void mo16283n(int i, float f) {
        super.mo16283n(i, f);
        this.f120453j = -2;
        this.f120454k = -2;
        long[] jArr = new long[i];
        this.f120452i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.C2973l
    /* JADX INFO: renamed from: o */
    public void mo16284o(int i, K k, int i2, int i3) {
        super.mo16284o(i, k, i2, i3);
        m143991H(this.f120454k, i);
        m143991H(i, -2);
    }

    @Override // com.google.common.collect.C2973l
    /* JADX INFO: renamed from: p */
    public void mo16285p(int i) {
        int iM16273C = m16273C() - 1;
        m143991H(m143988E(i), m143989F(i));
        if (i < iM16273C) {
            m143991H(m143988E(iM16273C), i);
            m143991H(i, m143989F(iM16273C));
        }
        super.mo16285p(i);
    }

    @Override // com.google.common.collect.C2973l
    /* JADX INFO: renamed from: s */
    public int mo16286s(int i) {
        int iM143989F = m143989F(i);
        if (iM143989F == -2) {
            return -1;
        }
        return iM143989F;
    }

    @Override // com.google.common.collect.C2973l
    /* JADX INFO: renamed from: t */
    public int mo16287t(int i, int i2) {
        return i == m16273C() ? i2 : i;
    }

    @Override // com.google.common.collect.C2973l
    /* JADX INFO: renamed from: y */
    public void mo16292y(int i) {
        super.mo16292y(i);
        long[] jArr = this.f120452i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.f120452i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public k050(int i, float f) {
        super(i, f);
    }
}
