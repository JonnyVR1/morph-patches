package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmConstructor {

    /* JADX INFO: renamed from: a */
    public int f64480a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmValueParameter> f64481b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmVersionRequirement> f64482c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<KmAnnotation> f64483d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmConstructorExtension> f64484e;

    public KmConstructor(int i) {
        this.f64480a = i;
        this.f64481b = new ArrayList();
        this.f64482c = new ArrayList(0);
        this.f64483d = new ArrayList(0);
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89283c, 10));
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo89267e());
        }
        this.f64484e = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89121a() {
        return this.f64483d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KmConstructorExtension> m89122b() {
        return this.f64484e;
    }

    /* JADX INFO: renamed from: c */
    public final int m89123c() {
        return this.f64480a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmValueParameter> m89124d() {
        return this.f64481b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<KmVersionRequirement> m89125e() {
        return this.f64482c;
    }

    /* JADX INFO: renamed from: f */
    public final void m89126f(int i) {
        this.f64480a = i;
    }

    public KmConstructor() {
        this(0);
    }
}
