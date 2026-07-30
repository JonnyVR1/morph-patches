package p153l;

import com.google.android.gms.internal.ads.zzbcn;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class djx0 extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final List f88953a;

    /* JADX INFO: renamed from: b */
    public final cjx0 f88954b;

    public djx0(List list, cjx0 cjx0Var) {
        this.f88953a = list;
        this.f88954b = cjx0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzbcn zzbcnVarZzb = zzbcn.zzb(((Integer) this.f88953a.get(i)).intValue());
        return zzbcnVarZzb == null ? zzbcn.AD_FORMAT_TYPE_UNSPECIFIED : zzbcnVarZzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f88953a.size();
    }
}
