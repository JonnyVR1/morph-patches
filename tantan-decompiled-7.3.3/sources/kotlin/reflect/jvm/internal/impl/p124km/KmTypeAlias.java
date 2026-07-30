package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmTypeAliasExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmTypeAlias {

    /* JADX INFO: renamed from: a */
    public int f65219a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f65220b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeParameter> f65221c;

    /* JADX INFO: renamed from: d */
    public KmType f65222d;

    /* JADX INFO: renamed from: e */
    public KmType f65223e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmAnnotation> f65224f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmVersionRequirement> f65225g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<KmTypeAliasExtension> f65226h;

    public KmTypeAlias(int i, @NotNull String str) {
        str.getClass();
        this.f65219a = i;
        this.f65220b = str;
        this.f65221c = new ArrayList(0);
        this.f65224f = new ArrayList(0);
        this.f65225g = new ArrayList(0);
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            KmTypeAliasExtension kmTypeAliasExtensionMo90154a = ((MetadataExtensions) it.next()).mo90154a();
            if (kmTypeAliasExtensionMo90154a != null) {
                arrayList.add(kmTypeAliasExtensionMo90154a);
            }
        }
        this.f65226h = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90070a() {
        return this.f65224f;
    }

    /* JADX INFO: renamed from: b */
    public final int m90071b() {
        return this.f65219a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmTypeParameter> m90072c() {
        return this.f65221c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmVersionRequirement> m90073d() {
        return this.f65225g;
    }

    /* JADX INFO: renamed from: e */
    public final void m90074e(@NotNull KmType kmType) {
        kmType.getClass();
        this.f65223e = kmType;
    }

    /* JADX INFO: renamed from: f */
    public final void m90075f(int i) {
        this.f65219a = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m90076g(@NotNull KmType kmType) {
        kmType.getClass();
        this.f65222d = kmType;
    }
}
