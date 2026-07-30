package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmTypeExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmType {

    /* JADX INFO: renamed from: a */
    public int f65212a;

    /* JADX INFO: renamed from: b */
    public KmClassifier f65213b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeProjection> f65214c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmType f65215d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public KmType f65216e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public KmFlexibleTypeUpperBound f65217f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmTypeExtension> f65218g;

    public KmType(int i) {
        this.f65212a = i;
        this.f65214c = new ArrayList(0);
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM90174c, 10));
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo90160g());
        }
        this.f65218g = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmTypeProjection> m90061a() {
        return this.f65214c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KmClassifier m90062b() {
        KmClassifier kmClassifier = this.f65213b;
        if (kmClassifier != null) {
            return kmClassifier;
        }
        Intrinsics.m88391r("classifier");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmTypeExtension> m90063c() {
        return this.f65218g;
    }

    /* JADX INFO: renamed from: d */
    public final int m90064d() {
        return this.f65212a;
    }

    /* JADX INFO: renamed from: e */
    public final void m90065e(@Nullable KmType kmType) {
        this.f65215d = kmType;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m88377d(KmType.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        KmType kmType = (KmType) obj;
        return this.f65212a == kmType.f65212a && Intrinsics.m88377d(m90062b(), kmType.m90062b()) && Intrinsics.m88377d(this.f65214c, kmType.f65214c) && Intrinsics.m88377d(this.f65216e, kmType.f65216e) && Intrinsics.m88377d(this.f65215d, kmType.f65215d) && Intrinsics.m88377d(this.f65217f, kmType.f65217f) && Intrinsics.m88377d(this.f65218g, kmType.f65218g);
    }

    /* JADX INFO: renamed from: f */
    public final void m90066f(@NotNull KmClassifier kmClassifier) {
        kmClassifier.getClass();
        this.f65213b = kmClassifier;
    }

    /* JADX INFO: renamed from: g */
    public final void m90067g(int i) {
        this.f65212a = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m90068h(@Nullable KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound) {
        this.f65217f = kmFlexibleTypeUpperBound;
    }

    public int hashCode() {
        return (((this.f65212a * 31) + m90062b().hashCode()) * 31) + this.f65214c.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m90069i(@Nullable KmType kmType) {
        this.f65216e = kmType;
    }

    public KmType() {
        this(0);
    }
}
