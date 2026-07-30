package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmTypeParameterExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmTypeParameter {

    /* JADX INFO: renamed from: a */
    public int f64553a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f64554b;

    /* JADX INFO: renamed from: c */
    public int f64555c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public KmVariance f64556d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmType> f64557e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmTypeParameterExtension> f64558f;

    public KmTypeParameter(int i, @NotNull String str, int i2, @NotNull KmVariance kmVariance) {
        str.getClass();
        kmVariance.getClass();
        this.f64553a = i;
        this.f64554b = str;
        this.f64555c = i2;
        this.f64556d = kmVariance;
        this.f64557e = new ArrayList(1);
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89283c, 10));
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo89270h());
        }
        this.f64558f = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmTypeParameterExtension> m89186a() {
        return this.f64558f;
    }

    /* JADX INFO: renamed from: b */
    public final int m89187b() {
        return this.f64553a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmType> m89188c() {
        return this.f64557e;
    }

    /* JADX INFO: renamed from: d */
    public final void m89189d(int i) {
        this.f64553a = i;
    }
}
