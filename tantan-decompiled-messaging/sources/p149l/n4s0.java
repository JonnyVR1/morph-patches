package p149l;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class n4s0 implements Iterator<String> {

    /* JADX INFO: renamed from: a */
    public Iterator<String> f137121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbe f137122b;

    public n4s0(zzbe zzbeVar) {
        this.f137122b = zzbeVar;
        this.f137121a = zzbeVar.zza.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f137121a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f137121a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
