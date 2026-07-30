package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p153l.c3j;
import p153l.et5;
import p153l.ju10;
import p153l.oj0;
import p153l.pgj0;
import p153l.snd;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class MergingMediaSource extends AbstractC1959c<Integer> {

    /* JADX INFO: renamed from: o */
    public static final C1944n f8306o = new C1944n.c().m10689c("MergingMediaSource").m10687a();

    /* JADX INFO: renamed from: d */
    public final boolean f8307d;

    /* JADX INFO: renamed from: e */
    public final boolean f8308e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1988i[] f8309f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1857c0[] f8310g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<InterfaceC1988i> f8311h;

    /* JADX INFO: renamed from: i */
    public final et5 f8312i;

    /* JADX INFO: renamed from: j */
    public final Map<Object, Long> f8313j;

    /* JADX INFO: renamed from: k */
    public final ju10<Object, C1958b> f8314k;

    /* JADX INFO: renamed from: l */
    public int f8315l;

    /* JADX INFO: renamed from: m */
    public long[][] f8316m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public IllegalMergeException f8317n;

    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.MergingMediaSource$a */
    public static final class C1956a extends c3j {

        /* JADX INFO: renamed from: g */
        public final long[] f8318g;

        /* JADX INFO: renamed from: h */
        public final long[] f8319h;

        public C1956a(AbstractC1857c0 abstractC1857c0, Map<Object, Long> map) {
            super(abstractC1857c0);
            int iMo9775t = abstractC1857c0.mo9775t();
            this.f8319h = new long[abstractC1857c0.mo9775t()];
            AbstractC1857c0.d dVar = new AbstractC1857c0.d();
            for (int i = 0; i < iMo9775t; i++) {
                this.f8319h[i] = abstractC1857c0.m9774r(i, dVar).f7378n;
            }
            int iMo9771m = abstractC1857c0.mo9771m();
            this.f8318g = new long[iMo9771m];
            AbstractC1857c0.b bVar = new AbstractC1857c0.b();
            for (int i2 = 0; i2 < iMo9771m; i2++) {
                abstractC1857c0.mo9453k(i2, bVar, true);
                long jLongValue = ((Long) w11.m204369e(map.get(bVar.f7338b))).longValue();
                long[] jArr = this.f8318g;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f7340d : jLongValue;
                jArr[i2] = jLongValue;
                long j = bVar.f7340d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.f8319h;
                    int i3 = bVar.f7339c;
                    jArr2[i3] = jArr2[i3] - (j - jLongValue);
                }
            }
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
            super.mo9453k(i, bVar, z);
            bVar.f7340d = this.f8318g[i];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
            long jMin;
            super.mo9457s(i, dVar, j);
            long j2 = this.f8319h[i];
            dVar.f7378n = j2;
            if (j2 != -9223372036854775807L) {
                long j3 = dVar.f7377m;
                if (j3 == -9223372036854775807L) {
                    jMin = dVar.f7377m;
                } else {
                    jMin = Math.min(j3, j2);
                }
            } else {
                jMin = dVar.f7377m;
            }
            dVar.f7377m = jMin;
            return dVar;
        }
    }

    public MergingMediaSource(boolean z, boolean z2, et5 et5Var, InterfaceC1988i... interfaceC1988iArr) {
        this.f8307d = z;
        this.f8308e = z2;
        this.f8309f = interfaceC1988iArr;
        this.f8312i = et5Var;
        this.f8311h = new ArrayList<>(Arrays.asList(interfaceC1988iArr));
        this.f8315l = -1;
        this.f8310g = new AbstractC1857c0[interfaceC1988iArr.length];
        this.f8316m = new long[0][];
        this.f8313j = new HashMap();
        this.f8314k = MultimapBuilder.m16122a().m16128a().mo16127e();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public InterfaceC1976h createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        int length = this.f8309f.length;
        InterfaceC1976h[] interfaceC1976hArr = new InterfaceC1976h[length];
        int iMo9450f = this.f8310g[0].mo9450f(bVar.f101422a);
        for (int i = 0; i < length; i++) {
            interfaceC1976hArr[i] = this.f8309f[i].createPeriod(bVar.m11323c(this.f8310g[i].mo9456q(iMo9450f)), oj0Var, j - this.f8316m[iMo9450f][i]);
        }
        C1991l c1991l = new C1991l(this.f8312i, this.f8316m[iMo9450f], interfaceC1976hArr);
        if (!this.f8308e) {
            return c1991l;
        }
        C1958b c1958b = new C1958b(c1991l, true, 0L, ((Long) w11.m204369e(this.f8313j.get(bVar.f101422a))).longValue());
        this.f8314k.put(bVar.f101422a, c1958b);
        return c1958b;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public C1944n getMediaItem() {
        InterfaceC1988i[] interfaceC1988iArr = this.f8309f;
        return interfaceC1988iArr.length > 0 ? interfaceC1988iArr[0].getMediaItem() : f8306o;
    }

    /* JADX INFO: renamed from: h */
    public final void m10971h() {
        AbstractC1857c0.b bVar = new AbstractC1857c0.b();
        for (int i = 0; i < this.f8315l; i++) {
            long j = -this.f8310g[0].m9770j(i, bVar).m9794q();
            int i2 = 1;
            while (true) {
                AbstractC1857c0[] abstractC1857c0Arr = this.f8310g;
                if (i2 < abstractC1857c0Arr.length) {
                    this.f8316m[i][i2] = j - (-abstractC1857c0Arr[i2].m9770j(i, bVar).m9794q());
                    i2++;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c
    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC1988i.b mo10969c(Integer num, InterfaceC1988i.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo10970f(Integer num, InterfaceC1988i interfaceC1988i, AbstractC1857c0 abstractC1857c0) {
        if (this.f8317n != null) {
            return;
        }
        if (this.f8315l == -1) {
            this.f8315l = abstractC1857c0.mo9771m();
        } else if (abstractC1857c0.mo9771m() != this.f8315l) {
            this.f8317n = new IllegalMergeException(0);
            return;
        }
        if (this.f8316m.length == 0) {
            this.f8316m = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f8315l, this.f8310g.length);
        }
        this.f8311h.remove(interfaceC1988i);
        this.f8310g[num.intValue()] = abstractC1857c0;
        if (this.f8311h.isEmpty()) {
            if (this.f8307d) {
                m10971h();
            }
            AbstractC1857c0 c1956a = this.f8310g[0];
            if (this.f8308e) {
                m10974k();
                c1956a = new C1956a(c1956a, this.f8313j);
            }
            refreshSourceInfo(c1956a);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10974k() {
        AbstractC1857c0[] abstractC1857c0Arr;
        AbstractC1857c0.b bVar = new AbstractC1857c0.b();
        for (int i = 0; i < this.f8315l; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                abstractC1857c0Arr = this.f8310g;
                if (i2 >= abstractC1857c0Arr.length) {
                    break;
                }
                long jM9790m = abstractC1857c0Arr[i2].m9770j(i, bVar).m9790m();
                if (jM9790m != -9223372036854775807L) {
                    long j2 = jM9790m + this.f8316m[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object objMo9456q = abstractC1857c0Arr[0].mo9456q(i);
            this.f8313j.put(objMo9456q, Long.valueOf(j));
            Iterator<C1958b> it = this.f8314k.get(objMo9456q).iterator();
            while (it.hasNext()) {
                it.next().m10992v(0L, j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c, com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.f8317n;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c, com.google.android.exoplayer2.source.AbstractC1957a
    public void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        super.prepareSourceInternal(pgj0Var);
        for (int i = 0; i < this.f8309f.length; i++) {
            m11001g(Integer.valueOf(i), this.f8309f[i]);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        if (this.f8308e) {
            C1958b c1958b = (C1958b) interfaceC1976h;
            for (Map.Entry<Object, C1958b> entry : this.f8314k.entries()) {
                if (entry.getValue().equals(c1958b)) {
                    this.f8314k.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            interfaceC1976h = c1958b.f8320a;
        }
        C1991l c1991l = (C1991l) interfaceC1976h;
        int i = 0;
        while (true) {
            InterfaceC1988i[] interfaceC1988iArr = this.f8309f;
            if (i >= interfaceC1988iArr.length) {
                return;
            }
            interfaceC1988iArr[i].releasePeriod(c1991l.m11352b(i));
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c, com.google.android.exoplayer2.source.AbstractC1957a
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f8310g, (Object) null);
        this.f8315l = -1;
        this.f8317n = null;
        this.f8311h.clear();
        Collections.addAll(this.f8311h, this.f8309f);
    }

    public MergingMediaSource(boolean z, InterfaceC1988i... interfaceC1988iArr) {
        this(z, false, interfaceC1988iArr);
    }

    public MergingMediaSource(boolean z, boolean z2, InterfaceC1988i... interfaceC1988iArr) {
        this(z, z2, new snd(), interfaceC1988iArr);
    }

    public MergingMediaSource(InterfaceC1988i... interfaceC1988iArr) {
        this(false, interfaceC1988iArr);
    }
}
