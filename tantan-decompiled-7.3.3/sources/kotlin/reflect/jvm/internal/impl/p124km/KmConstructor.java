package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmConstructor {

    /* JADX INFO: renamed from: a */
    public int f65154a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmValueParameter> f65155b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmVersionRequirement> f65156c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<KmAnnotation> f65157d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmConstructorExtension> f65158e;

    public KmConstructor(int i) {
        this.f65154a = i;
        this.f65155b = new ArrayList();
        this.f65156c = new ArrayList(0);
        this.f65157d = new ArrayList(0);
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM90174c, 10));
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo90158e());
        }
        this.f65158e = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90012a() {
        return this.f65157d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KmConstructorExtension> m90013b() {
        return this.f65158e;
    }

    /* JADX INFO: renamed from: c */
    public final int m90014c() {
        return this.f65154a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmValueParameter> m90015d() {
        return this.f65155b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<KmVersionRequirement> m90016e() {
        return this.f65156c;
    }

    /* JADX INFO: renamed from: f */
    public final void m90017f(int i) {
        this.f65154a = i;
    }

    public KmConstructor() {
        this(0);
    }
}
