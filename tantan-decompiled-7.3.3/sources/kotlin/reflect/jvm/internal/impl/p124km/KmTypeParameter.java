package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmTypeParameterExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmTypeParameter {

    /* JADX INFO: renamed from: a */
    public int f65227a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f65228b;

    /* JADX INFO: renamed from: c */
    public int f65229c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public KmVariance f65230d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmType> f65231e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmTypeParameterExtension> f65232f;

    public KmTypeParameter(int i, @NotNull String str, int i2, @NotNull KmVariance kmVariance) {
        str.getClass();
        kmVariance.getClass();
        this.f65227a = i;
        this.f65228b = str;
        this.f65229c = i2;
        this.f65230d = kmVariance;
        this.f65231e = new ArrayList(1);
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM90174c, 10));
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo90161h());
        }
        this.f65232f = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmTypeParameterExtension> m90077a() {
        return this.f65232f;
    }

    /* JADX INFO: renamed from: b */
    public final int m90078b() {
        return this.f65227a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmType> m90079c() {
        return this.f65231e;
    }

    /* JADX INFO: renamed from: d */
    public final void m90080d(int i) {
        this.f65227a = i;
    }
}
