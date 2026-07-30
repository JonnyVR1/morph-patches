package com.google.android.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p153l.bmk0;
import p153l.c3j;
import p153l.g6y;
import p153l.n8f0;
import p153l.r70;

/* JADX INFO: renamed from: com.google.android.exoplayer2.v */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2080v extends AbstractC1820a {

    /* JADX INFO: renamed from: i */
    public final int f9600i;

    /* JADX INFO: renamed from: j */
    public final int f9601j;

    /* JADX INFO: renamed from: k */
    public final int[] f9602k;

    /* JADX INFO: renamed from: l */
    public final int[] f9603l;

    /* JADX INFO: renamed from: m */
    public final AbstractC1857c0[] f9604m;

    /* JADX INFO: renamed from: n */
    public final Object[] f9605n;

    /* JADX INFO: renamed from: o */
    public final HashMap<Object, Integer> f9606o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.v$a */
    public class a extends c3j {

        /* JADX INFO: renamed from: g */
        public final AbstractC1857c0.d f9607g;

        public a(AbstractC1857c0 abstractC1857c0) {
            super(abstractC1857c0);
            this.f9607g = new AbstractC1857c0.d();
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
            AbstractC1857c0.b bVarMo9453k = super.mo9453k(i, bVar, z);
            if (super.m9774r(bVarMo9453k.f7339c, this.f9607g).m9808h()) {
                bVarMo9453k.m9800w(bVar.f7337a, bVar.f7338b, bVar.f7339c, bVar.f7340d, bVar.f7341e, r70.f161545g, true);
                return bVarMo9453k;
            }
            bVarMo9453k.f7342f = true;
            return bVarMo9453k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2080v(AbstractC1857c0[] abstractC1857c0Arr, Object[] objArr, n8f0 n8f0Var) {
        super(false, n8f0Var);
        int i = 0;
        int length = abstractC1857c0Arr.length;
        this.f9604m = abstractC1857c0Arr;
        this.f9602k = new int[length];
        this.f9603l = new int[length];
        this.f9605n = objArr;
        this.f9606o = new HashMap<>();
        int length2 = abstractC1857c0Arr.length;
        int iMo9775t = 0;
        int iMo9771m = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC1857c0 abstractC1857c0 = abstractC1857c0Arr[i];
            this.f9604m[i2] = abstractC1857c0;
            this.f9603l[i2] = iMo9775t;
            this.f9602k[i2] = iMo9771m;
            iMo9775t += abstractC1857c0.mo9775t();
            iMo9771m += this.f9604m[i2].mo9771m();
            this.f9606o.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f9600i = iMo9775t;
        this.f9601j = iMo9771m;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC1857c0[] m12227K(Collection<? extends g6y> collection) {
        AbstractC1857c0[] abstractC1857c0Arr = new AbstractC1857c0[collection.size()];
        Iterator<? extends g6y> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            abstractC1857c0Arr[i] = it.next().mo10189b();
            i++;
        }
        return abstractC1857c0Arr;
    }

    /* JADX INFO: renamed from: L */
    public static Object[] m12228L(Collection<? extends g6y> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends g6y> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().mo10188a();
            i++;
        }
        return objArr;
    }

    @Override // com.google.android.exoplayer2.AbstractC1820a
    /* JADX INFO: renamed from: B */
    public Object mo9443B(int i) {
        return this.f9605n[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC1820a
    /* JADX INFO: renamed from: D */
    public int mo9444D(int i) {
        return this.f9602k[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC1820a
    /* JADX INFO: renamed from: E */
    public int mo9445E(int i) {
        return this.f9603l[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC1820a
    /* JADX INFO: renamed from: H */
    public AbstractC1857c0 mo9448H(int i) {
        return this.f9604m[i];
    }

    /* JADX INFO: renamed from: I */
    public C2080v m12229I(n8f0 n8f0Var) {
        AbstractC1857c0[] abstractC1857c0Arr = new AbstractC1857c0[this.f9604m.length];
        int i = 0;
        while (true) {
            AbstractC1857c0[] abstractC1857c0Arr2 = this.f9604m;
            if (i >= abstractC1857c0Arr2.length) {
                return new C2080v(abstractC1857c0Arr, this.f9605n, n8f0Var);
            }
            abstractC1857c0Arr[i] = new a(abstractC1857c0Arr2[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: J */
    public List<AbstractC1857c0> m12230J() {
        return Arrays.asList(this.f9604m);
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: m */
    public int mo9771m() {
        return this.f9601j;
    }

    @Override // com.google.android.exoplayer2.AbstractC1857c0
    /* JADX INFO: renamed from: t */
    public int mo9775t() {
        return this.f9600i;
    }

    @Override // com.google.android.exoplayer2.AbstractC1820a
    /* JADX INFO: renamed from: w */
    public int mo9458w(Object obj) {
        Integer num = this.f9606o.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractC1820a
    /* JADX INFO: renamed from: x */
    public int mo9459x(int i) {
        return bmk0.m105138h(this.f9602k, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC1820a
    /* JADX INFO: renamed from: y */
    public int mo9460y(int i) {
        return bmk0.m105138h(this.f9603l, i + 1, false, false);
    }

    public C2080v(Collection<? extends g6y> collection, n8f0 n8f0Var) {
        this(m12227K(collection), m12228L(collection), n8f0Var);
    }
}
