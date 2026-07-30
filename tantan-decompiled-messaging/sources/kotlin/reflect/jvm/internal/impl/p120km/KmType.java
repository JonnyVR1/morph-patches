package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmTypeExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmType {

    /* JADX INFO: renamed from: a */
    public int f64538a;

    /* JADX INFO: renamed from: b */
    public KmClassifier f64539b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeProjection> f64540c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmType f64541d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public KmType f64542e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public KmFlexibleTypeUpperBound f64543f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmTypeExtension> f64544g;

    public KmType(int i) {
        this.f64538a = i;
        this.f64540c = new ArrayList(0);
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89283c, 10));
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo89269g());
        }
        this.f64544g = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmTypeProjection> m89170a() {
        return this.f64540c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KmClassifier m89171b() {
        KmClassifier kmClassifier = this.f64539b;
        if (kmClassifier != null) {
            return kmClassifier;
        }
        Intrinsics.m87502r("classifier");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmTypeExtension> m89172c() {
        return this.f64544g;
    }

    /* JADX INFO: renamed from: d */
    public final int m89173d() {
        return this.f64538a;
    }

    /* JADX INFO: renamed from: e */
    public final void m89174e(@Nullable KmType kmType) {
        this.f64541d = kmType;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m87488d(KmType.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        KmType kmType = (KmType) obj;
        return this.f64538a == kmType.f64538a && Intrinsics.m87488d(m89171b(), kmType.m89171b()) && Intrinsics.m87488d(this.f64540c, kmType.f64540c) && Intrinsics.m87488d(this.f64542e, kmType.f64542e) && Intrinsics.m87488d(this.f64541d, kmType.f64541d) && Intrinsics.m87488d(this.f64543f, kmType.f64543f) && Intrinsics.m87488d(this.f64544g, kmType.f64544g);
    }

    /* JADX INFO: renamed from: f */
    public final void m89175f(@NotNull KmClassifier kmClassifier) {
        kmClassifier.getClass();
        this.f64539b = kmClassifier;
    }

    /* JADX INFO: renamed from: g */
    public final void m89176g(int i) {
        this.f64538a = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m89177h(@Nullable KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound) {
        this.f64543f = kmFlexibleTypeUpperBound;
    }

    public int hashCode() {
        return (((this.f64538a * 31) + m89171b().hashCode()) * 31) + this.f64540c.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m89178i(@Nullable KmType kmType) {
        this.f64542e = kmType;
    }

    public KmType() {
        this(0);
    }
}
