package p153l;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class tds0 implements Iterator<String> {

    /* JADX INFO: renamed from: a */
    public Iterator<String> f173381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbe f173382b;

    public tds0(zzbe zzbeVar) {
        this.f173382b = zzbeVar;
        this.f173381a = zzbeVar.zza.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f173381a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f173381a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
