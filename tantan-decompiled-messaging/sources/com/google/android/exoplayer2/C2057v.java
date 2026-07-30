package com.google.android.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p149l.g0f0;
import p149l.h0j;
import p149l.jxx;
import p149l.v70;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.v */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2057v extends AbstractC1797a {

    /* JADX INFO: renamed from: i */
    public final int f9563i;

    /* JADX INFO: renamed from: j */
    public final int f9564j;

    /* JADX INFO: renamed from: k */
    public final int[] f9565k;

    /* JADX INFO: renamed from: l */
    public final int[] f9566l;

    /* JADX INFO: renamed from: m */
    public final AbstractC1834c0[] f9567m;

    /* JADX INFO: renamed from: n */
    public final Object[] f9568n;

    /* JADX INFO: renamed from: o */
    public final HashMap<Object, Integer> f9569o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.v$a */
    public class a extends h0j {

        /* JADX INFO: renamed from: g */
        public final AbstractC1834c0.d f9570g;

        public a(AbstractC1834c0 abstractC1834c0) {
            super(abstractC1834c0);
            this.f9570g = new AbstractC1834c0.d();
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
            AbstractC1834c0.b bVarMo9399k = super.mo9399k(i, bVar, z);
            if (super.m9720r(bVarMo9399k.f7302c, this.f9570g).m9754h()) {
                bVarMo9399k.m9746w(bVar.f7300a, bVar.f7301b, bVar.f7302c, bVar.f7303d, bVar.f7304e, v70.f180250g, true);
                return bVarMo9399k;
            }
            bVarMo9399k.f7305f = true;
            return bVarMo9399k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2057v(AbstractC1834c0[] abstractC1834c0Arr, Object[] objArr, g0f0 g0f0Var) {
        super(false, g0f0Var);
        int i = 0;
        int length = abstractC1834c0Arr.length;
        this.f9567m = abstractC1834c0Arr;
        this.f9565k = new int[length];
        this.f9566l = new int[length];
        this.f9568n = objArr;
        this.f9569o = new HashMap<>();
        int length2 = abstractC1834c0Arr.length;
        int iMo9721t = 0;
        int iMo9717m = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC1834c0 abstractC1834c0 = abstractC1834c0Arr[i];
            this.f9567m[i2] = abstractC1834c0;
            this.f9566l[i2] = iMo9721t;
            this.f9565k[i2] = iMo9717m;
            iMo9721t += abstractC1834c0.mo9721t();
            iMo9717m += this.f9567m[i2].mo9717m();
            this.f9569o.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f9563i = iMo9721t;
        this.f9564j = iMo9717m;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC1834c0[] m12173K(Collection<? extends jxx> collection) {
        AbstractC1834c0[] abstractC1834c0Arr = new AbstractC1834c0[collection.size()];
        Iterator<? extends jxx> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            abstractC1834c0Arr[i] = it.next().mo10135b();
            i++;
        }
        return abstractC1834c0Arr;
    }

    /* JADX INFO: renamed from: L */
    public static Object[] m12174L(Collection<? extends jxx> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends jxx> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().mo10134a();
            i++;
        }
        return objArr;
    }

    @Override // com.google.android.exoplayer2.AbstractC1797a
    /* JADX INFO: renamed from: B */
    public Object mo9389B(int i) {
        return this.f9568n[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC1797a
    /* JADX INFO: renamed from: D */
    public int mo9390D(int i) {
        return this.f9565k[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC1797a
    /* JADX INFO: renamed from: E */
    public int mo9391E(int i) {
        return this.f9566l[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC1797a
    /* JADX INFO: renamed from: H */
    public AbstractC1834c0 mo9394H(int i) {
        return this.f9567m[i];
    }

    /* JADX INFO: renamed from: I */
    public C2057v m12175I(g0f0 g0f0Var) {
        AbstractC1834c0[] abstractC1834c0Arr = new AbstractC1834c0[this.f9567m.length];
        int i = 0;
        while (true) {
            AbstractC1834c0[] abstractC1834c0Arr2 = this.f9567m;
            if (i >= abstractC1834c0Arr2.length) {
                return new C2057v(abstractC1834c0Arr, this.f9568n, g0f0Var);
            }
            abstractC1834c0Arr[i] = new a(abstractC1834c0Arr2[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: J */
    public List<AbstractC1834c0> m12176J() {
        return Arrays.asList(this.f9567m);
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: m */
    public int mo9717m() {
        return this.f9564j;
    }

    @Override // com.google.android.exoplayer2.AbstractC1834c0
    /* JADX INFO: renamed from: t */
    public int mo9721t() {
        return this.f9563i;
    }

    @Override // com.google.android.exoplayer2.AbstractC1797a
    /* JADX INFO: renamed from: w */
    public int mo9404w(Object obj) {
        Integer num = this.f9569o.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractC1797a
    /* JADX INFO: renamed from: x */
    public int mo9405x(int i) {
        return vck0.m197860h(this.f9565k, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC1797a
    /* JADX INFO: renamed from: y */
    public int mo9406y(int i) {
        return vck0.m197860h(this.f9566l, i + 1, false, false);
    }

    public C2057v(Collection<? extends jxx> collection, g0f0 g0f0Var) {
        this(m12173K(collection), m12174L(collection), g0f0Var);
    }
}
