package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2195m2 extends C2179k2 implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2203n2 f9988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2195m2(C2203n2 c2203n2, int i) {
        super(c2203n2, ((List) c2203n2.f9969b).listIterator(i));
        this.f9988d = c2203n2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f9988d.isEmpty();
        m12819a();
        ((ListIterator) this.f9953a).add(obj);
        this.f9988d.f9997f.zzb++;
        if (zIsEmpty) {
            this.f9988d.m12864a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m12819a();
        return ((ListIterator) this.f9953a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m12819a();
        return ((ListIterator) this.f9953a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m12819a();
        return ((ListIterator) this.f9953a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m12819a();
        return ((ListIterator) this.f9953a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m12819a();
        ((ListIterator) this.f9953a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2195m2(C2203n2 c2203n2) {
        super(c2203n2);
        this.f9988d = c2203n2;
    }
}
