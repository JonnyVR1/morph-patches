package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p149l.as5;
import p149l.bm10;
import p149l.h0j;
import p149l.l7j0;
import p149l.mmd;
import p149l.p11;
import p149l.sj0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class MergingMediaSource extends AbstractC1936c<Integer> {

    /* JADX INFO: renamed from: o */
    public static final C1921n f8269o = new C1921n.c().m10635c("MergingMediaSource").m10633a();

    /* JADX INFO: renamed from: d */
    public final boolean f8270d;

    /* JADX INFO: renamed from: e */
    public final boolean f8271e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1965i[] f8272f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1834c0[] f8273g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<InterfaceC1965i> f8274h;

    /* JADX INFO: renamed from: i */
    public final as5 f8275i;

    /* JADX INFO: renamed from: j */
    public final Map<Object, Long> f8276j;

    /* JADX INFO: renamed from: k */
    public final bm10<Object, C1935b> f8277k;

    /* JADX INFO: renamed from: l */
    public int f8278l;

    /* JADX INFO: renamed from: m */
    public long[][] f8279m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public IllegalMergeException f8280n;

    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.MergingMediaSource$a */
    public static final class C1933a extends h0j {

        /* JADX INFO: renamed from: g */
        public final long[] f8281g;

        /* JADX INFO: renamed from: h */
        public final long[] f8282h;

        public C1933a(AbstractC1834c0 abstractC1834c0, Map<Object, Long> map) {
            super(abstractC1834c0);
            int iMo9721t = abstractC1834c0.mo9721t();
            this.f8282h = new long[abstractC1834c0.mo9721t()];
            AbstractC1834c0.d dVar = new AbstractC1834c0.d();
            for (int i = 0; i < iMo9721t; i++) {
                this.f8282h[i] = abstractC1834c0.m9720r(i, dVar).f7341n;
            }
            int iMo9717m = abstractC1834c0.mo9717m();
            this.f8281g = new long[iMo9717m];
            AbstractC1834c0.b bVar = new AbstractC1834c0.b();
            for (int i2 = 0; i2 < iMo9717m; i2++) {
                abstractC1834c0.mo9399k(i2, bVar, true);
                long jLongValue = ((Long) p11.m167011e(map.get(bVar.f7301b))).longValue();
                long[] jArr = this.f8281g;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f7303d : jLongValue;
                jArr[i2] = jLongValue;
                long j = bVar.f7303d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.f8282h;
                    int i3 = bVar.f7302c;
                    jArr2[i3] = jArr2[i3] - (j - jLongValue);
                }
            }
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
            super.mo9399k(i, bVar, z);
            bVar.f7303d = this.f8281g[i];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
            long jMin;
            super.mo9403s(i, dVar, j);
            long j2 = this.f8282h[i];
            dVar.f7341n = j2;
            if (j2 != -9223372036854775807L) {
                long j3 = dVar.f7340m;
                if (j3 == -9223372036854775807L) {
                    jMin = dVar.f7340m;
                } else {
                    jMin = Math.min(j3, j2);
                }
            } else {
                jMin = dVar.f7340m;
            }
            dVar.f7340m = jMin;
            return dVar;
        }
    }

    public MergingMediaSource(boolean z, boolean z2, as5 as5Var, InterfaceC1965i... interfaceC1965iArr) {
        this.f8270d = z;
        this.f8271e = z2;
        this.f8272f = interfaceC1965iArr;
        this.f8275i = as5Var;
        this.f8274h = new ArrayList<>(Arrays.asList(interfaceC1965iArr));
        this.f8278l = -1;
        this.f8273g = new AbstractC1834c0[interfaceC1965iArr.length];
        this.f8279m = new long[0][];
        this.f8276j = new HashMap();
        this.f8277k = MultimapBuilder.m16068a().m16074a().mo16073e();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public InterfaceC1953h createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        int length = this.f8272f.length;
        InterfaceC1953h[] interfaceC1953hArr = new InterfaceC1953h[length];
        int iMo9396f = this.f8273g[0].mo9396f(bVar.f114355a);
        for (int i = 0; i < length; i++) {
            interfaceC1953hArr[i] = this.f8272f[i].createPeriod(bVar.m11269c(this.f8273g[i].mo9402q(iMo9396f)), sj0Var, j - this.f8279m[iMo9396f][i]);
        }
        C1968l c1968l = new C1968l(this.f8275i, this.f8279m[iMo9396f], interfaceC1953hArr);
        if (!this.f8271e) {
            return c1968l;
        }
        C1935b c1935b = new C1935b(c1968l, true, 0L, ((Long) p11.m167011e(this.f8276j.get(bVar.f114355a))).longValue());
        this.f8277k.put(bVar.f114355a, c1935b);
        return c1935b;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public C1921n getMediaItem() {
        InterfaceC1965i[] interfaceC1965iArr = this.f8272f;
        return interfaceC1965iArr.length > 0 ? interfaceC1965iArr[0].getMediaItem() : f8269o;
    }

    /* JADX INFO: renamed from: h */
    public final void m10917h() {
        AbstractC1834c0.b bVar = new AbstractC1834c0.b();
        for (int i = 0; i < this.f8278l; i++) {
            long j = -this.f8273g[0].m9716j(i, bVar).m9740q();
            int i2 = 1;
            while (true) {
                AbstractC1834c0[] abstractC1834c0Arr = this.f8273g;
                if (i2 < abstractC1834c0Arr.length) {
                    this.f8279m[i][i2] = j - (-abstractC1834c0Arr[i2].m9716j(i, bVar).m9740q());
                    i2++;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC1965i.b mo10915c(Integer num, InterfaceC1965i.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo10916f(Integer num, InterfaceC1965i interfaceC1965i, AbstractC1834c0 abstractC1834c0) {
        if (this.f8280n != null) {
            return;
        }
        if (this.f8278l == -1) {
            this.f8278l = abstractC1834c0.mo9717m();
        } else if (abstractC1834c0.mo9717m() != this.f8278l) {
            this.f8280n = new IllegalMergeException(0);
            return;
        }
        if (this.f8279m.length == 0) {
            this.f8279m = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f8278l, this.f8273g.length);
        }
        this.f8274h.remove(interfaceC1965i);
        this.f8273g[num.intValue()] = abstractC1834c0;
        if (this.f8274h.isEmpty()) {
            if (this.f8270d) {
                m10917h();
            }
            AbstractC1834c0 c1933a = this.f8273g[0];
            if (this.f8271e) {
                m10920k();
                c1933a = new C1933a(c1933a, this.f8276j);
            }
            refreshSourceInfo(c1933a);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10920k() {
        AbstractC1834c0[] abstractC1834c0Arr;
        AbstractC1834c0.b bVar = new AbstractC1834c0.b();
        for (int i = 0; i < this.f8278l; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                abstractC1834c0Arr = this.f8273g;
                if (i2 >= abstractC1834c0Arr.length) {
                    break;
                }
                long jM9736m = abstractC1834c0Arr[i2].m9716j(i, bVar).m9736m();
                if (jM9736m != -9223372036854775807L) {
                    long j2 = jM9736m + this.f8279m[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object objMo9402q = abstractC1834c0Arr[0].mo9402q(i);
            this.f8276j.put(objMo9402q, Long.valueOf(j));
            Iterator<C1935b> it = this.f8277k.get(objMo9402q).iterator();
            while (it.hasNext()) {
                it.next().m10938v(0L, j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c, com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.f8280n;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c, com.google.android.exoplayer2.source.AbstractC1934a
    public void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        super.prepareSourceInternal(l7j0Var);
        for (int i = 0; i < this.f8272f.length; i++) {
            m10947g(Integer.valueOf(i), this.f8272f[i]);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        if (this.f8271e) {
            C1935b c1935b = (C1935b) interfaceC1953h;
            for (Map.Entry<Object, C1935b> entry : this.f8277k.entries()) {
                if (entry.getValue().equals(c1935b)) {
                    this.f8277k.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            interfaceC1953h = c1935b.f8283a;
        }
        C1968l c1968l = (C1968l) interfaceC1953h;
        int i = 0;
        while (true) {
            InterfaceC1965i[] interfaceC1965iArr = this.f8272f;
            if (i >= interfaceC1965iArr.length) {
                return;
            }
            interfaceC1965iArr[i].releasePeriod(c1968l.m11298b(i));
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c, com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f8273g, (Object) null);
        this.f8278l = -1;
        this.f8280n = null;
        this.f8274h.clear();
        Collections.addAll(this.f8274h, this.f8272f);
    }

    public MergingMediaSource(boolean z, InterfaceC1965i... interfaceC1965iArr) {
        this(z, false, interfaceC1965iArr);
    }

    public MergingMediaSource(boolean z, boolean z2, InterfaceC1965i... interfaceC1965iArr) {
        this(z, z2, new mmd(), interfaceC1965iArr);
    }

    public MergingMediaSource(InterfaceC1965i... interfaceC1965iArr) {
        this(false, interfaceC1965iArr);
    }
}
