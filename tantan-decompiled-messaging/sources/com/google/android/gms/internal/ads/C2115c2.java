package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2115c2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f9873a;

    /* JADX INFO: renamed from: b */
    public Object f9874b = null;

    /* JADX INFO: renamed from: c */
    public Collection f9875c = null;

    /* JADX INFO: renamed from: d */
    public Iterator f9876d = zzgai.INSTANCE;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzfyt f9877e;

    public C2115c2(zzfyt zzfytVar) {
        this.f9877e = zzfytVar;
        this.f9873a = zzfytVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9873a.hasNext() || this.f9876d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f9876d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f9873a.next();
            this.f9874b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f9875c = collection;
            this.f9876d = collection.iterator();
        }
        return this.f9876d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9876d.remove();
        Collection collection = this.f9875c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f9873a.remove();
        }
        this.f9877e.zzb--;
    }
}
