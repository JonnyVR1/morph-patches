package p149l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class chx0 implements ogx0 {

    /* JADX INFO: renamed from: c */
    public static final ogx0 f81018c = pgx0.m168925a(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: a */
    public final List f81019a;

    /* JADX INFO: renamed from: b */
    public final List f81020b;

    public /* synthetic */ chx0(List list, List list2, ahx0 ahx0Var) {
        this.f81019a = list;
        this.f81020b = list2;
    }

    /* JADX INFO: renamed from: a */
    public static bhx0 m107025a(int i, int i2) {
        return new bhx0(i, i2, null);
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.f81019a.size();
        ArrayList arrayList = new ArrayList(this.f81020b.size());
        int size2 = this.f81020b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((xgx0) this.f81020b.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetM149799a = lgx0.m149799a(size);
        int size3 = this.f81019a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objZzb = ((xgx0) this.f81019a.get(i2)).zzb();
            objZzb.getClass();
            hashSetM149799a.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSetM149799a.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetM149799a);
    }
}
