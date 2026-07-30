package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2138c2 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f9910a;

    /* JADX INFO: renamed from: b */
    public Object f9911b = null;

    /* JADX INFO: renamed from: c */
    public Collection f9912c = null;

    /* JADX INFO: renamed from: d */
    public Iterator f9913d = zzgai.INSTANCE;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzfyt f9914e;

    public C2138c2(zzfyt zzfytVar) {
        this.f9914e = zzfytVar;
        this.f9910a = zzfytVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9910a.hasNext() || this.f9913d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f9913d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f9910a.next();
            this.f9911b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f9912c = collection;
            this.f9913d = collection.iterator();
        }
        return this.f9913d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9913d.remove();
        Collection collection = this.f9912c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f9910a.remove();
        }
        this.f9914e.zzb--;
    }
}
