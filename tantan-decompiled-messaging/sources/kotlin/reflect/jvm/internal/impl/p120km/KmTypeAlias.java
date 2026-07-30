package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmTypeAliasExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmTypeAlias {

    /* JADX INFO: renamed from: a */
    public int f64545a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f64546b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeParameter> f64547c;

    /* JADX INFO: renamed from: d */
    public KmType f64548d;

    /* JADX INFO: renamed from: e */
    public KmType f64549e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmAnnotation> f64550f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmVersionRequirement> f64551g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<KmTypeAliasExtension> f64552h;

    public KmTypeAlias(int i, @NotNull String str) {
        str.getClass();
        this.f64545a = i;
        this.f64546b = str;
        this.f64547c = new ArrayList(0);
        this.f64550f = new ArrayList(0);
        this.f64551g = new ArrayList(0);
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            KmTypeAliasExtension kmTypeAliasExtensionMo89263a = ((MetadataExtensions) it.next()).mo89263a();
            if (kmTypeAliasExtensionMo89263a != null) {
                arrayList.add(kmTypeAliasExtensionMo89263a);
            }
        }
        this.f64552h = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89179a() {
        return this.f64550f;
    }

    /* JADX INFO: renamed from: b */
    public final int m89180b() {
        return this.f64545a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmTypeParameter> m89181c() {
        return this.f64547c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmVersionRequirement> m89182d() {
        return this.f64551g;
    }

    /* JADX INFO: renamed from: e */
    public final void m89183e(@NotNull KmType kmType) {
        kmType.getClass();
        this.f64549e = kmType;
    }

    /* JADX INFO: renamed from: f */
    public final void m89184f(int i) {
        this.f64545a = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m89185g(@NotNull KmType kmType) {
        kmType.getClass();
        this.f64548d = kmType;
    }
}
