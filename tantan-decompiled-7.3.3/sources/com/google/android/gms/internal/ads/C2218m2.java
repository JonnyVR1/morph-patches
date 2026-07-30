package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2218m2 extends C2202k2 implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2226n2 f10025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2218m2(C2226n2 c2226n2, int i) {
        super(c2226n2, ((List) c2226n2.f10006b).listIterator(i));
        this.f10025d = c2226n2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f10025d.isEmpty();
        m12873a();
        ((ListIterator) this.f9990a).add(obj);
        this.f10025d.f10034f.zzb++;
        if (zIsEmpty) {
            this.f10025d.m12918a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m12873a();
        return ((ListIterator) this.f9990a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m12873a();
        return ((ListIterator) this.f9990a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m12873a();
        return ((ListIterator) this.f9990a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m12873a();
        return ((ListIterator) this.f9990a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m12873a();
        ((ListIterator) this.f9990a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2218m2(C2226n2 c2226n2) {
        super(c2226n2);
        this.f10025d = c2226n2;
    }
}
