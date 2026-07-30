package p149l;

import com.google.android.gms.internal.ads.zzbcn;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class x9x0 extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final List f191665a;

    /* JADX INFO: renamed from: b */
    public final w9x0 f191666b;

    public x9x0(List list, w9x0 w9x0Var) {
        this.f191665a = list;
        this.f191666b = w9x0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzbcn zzbcnVarZzb = zzbcn.zzb(((Integer) this.f191665a.get(i)).intValue());
        return zzbcnVarZzb == null ? zzbcn.AD_FORMAT_TYPE_UNSPECIFIED : zzbcnVarZzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f191665a.size();
    }
}
