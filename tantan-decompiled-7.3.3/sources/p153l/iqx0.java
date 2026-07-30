package p153l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class iqx0 implements upx0 {

    /* JADX INFO: renamed from: c */
    public static final upx0 f116475c = vpx0.m202347a(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: a */
    public final List f116476a;

    /* JADX INFO: renamed from: b */
    public final List f116477b;

    public /* synthetic */ iqx0(List list, List list2, gqx0 gqx0Var) {
        this.f116476a = list;
        this.f116477b = list2;
    }

    /* JADX INFO: renamed from: a */
    public static hqx0 m141731a(int i, int i2) {
        return new hqx0(i, i2, null);
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.f116476a.size();
        ArrayList arrayList = new ArrayList(this.f116477b.size());
        int size2 = this.f116477b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((dqx0) this.f116477b.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetM182552a = rpx0.m182552a(size);
        int size3 = this.f116476a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objZzb = ((dqx0) this.f116476a.get(i2)).zzb();
            objZzb.getClass();
            hashSetM182552a.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSetM182552a.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetM182552a);
    }
}
