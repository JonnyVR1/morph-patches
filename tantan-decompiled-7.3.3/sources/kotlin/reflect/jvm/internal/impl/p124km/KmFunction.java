package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmFunction {

    /* JADX INFO: renamed from: a */
    public int f65175a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f65176b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeParameter> f65177c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmType f65178d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmAnnotation> f65179e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmType> f65180f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmValueParameter> f65181g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<KmValueParameter> f65182h;

    /* JADX INFO: renamed from: i */
    public KmType f65183i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<KmVersionRequirement> f65184j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public KmContract f65185k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final List<KmAnnotation> f65186l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<KmFunctionExtension> f65187m;

    public KmFunction(int i, @NotNull String str) {
        str.getClass();
        this.f65175a = i;
        this.f65176b = str;
        this.f65177c = new ArrayList(0);
        this.f65179e = new ArrayList(0);
        this.f65180f = new ArrayList(0);
        this.f65181g = new ArrayList();
        this.f65182h = new ArrayList();
        this.f65184j = new ArrayList(0);
        this.f65186l = new ArrayList(0);
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM90174c, 10));
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo90170q());
        }
        this.f65187m = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90029a() {
        return this.f65186l;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KmValueParameter> m90030b() {
        return this.f65182h;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmAnnotation> m90031c() {
        return this.f65179e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmFunctionExtension> m90032d() {
        return this.f65187m;
    }

    /* JADX INFO: renamed from: e */
    public final int m90033e() {
        return this.f65175a;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<KmTypeParameter> m90034f() {
        return this.f65177c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<KmValueParameter> m90035g() {
        return this.f65181g;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<KmVersionRequirement> m90036h() {
        return this.f65184j;
    }

    /* JADX INFO: renamed from: i */
    public final void m90037i(@Nullable KmContract kmContract) {
        this.f65185k = kmContract;
    }

    /* JADX INFO: renamed from: j */
    public final void m90038j(int i) {
        this.f65175a = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m90039k(@Nullable KmType kmType) {
        this.f65178d = kmType;
    }

    /* JADX INFO: renamed from: l */
    public final void m90040l(@NotNull KmType kmType) {
        kmType.getClass();
        this.f65183i = kmType;
    }
}
