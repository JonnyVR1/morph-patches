package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmFunction {

    /* JADX INFO: renamed from: a */
    public int f64501a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f64502b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeParameter> f64503c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmType f64504d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmAnnotation> f64505e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmType> f64506f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmValueParameter> f64507g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<KmValueParameter> f64508h;

    /* JADX INFO: renamed from: i */
    public KmType f64509i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<KmVersionRequirement> f64510j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public KmContract f64511k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final List<KmAnnotation> f64512l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<KmFunctionExtension> f64513m;

    public KmFunction(int i, @NotNull String str) {
        str.getClass();
        this.f64501a = i;
        this.f64502b = str;
        this.f64503c = new ArrayList(0);
        this.f64505e = new ArrayList(0);
        this.f64506f = new ArrayList(0);
        this.f64507g = new ArrayList();
        this.f64508h = new ArrayList();
        this.f64510j = new ArrayList(0);
        this.f64512l = new ArrayList(0);
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89283c, 10));
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo89279q());
        }
        this.f64513m = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89138a() {
        return this.f64512l;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KmValueParameter> m89139b() {
        return this.f64508h;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmAnnotation> m89140c() {
        return this.f64505e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmFunctionExtension> m89141d() {
        return this.f64513m;
    }

    /* JADX INFO: renamed from: e */
    public final int m89142e() {
        return this.f64501a;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<KmTypeParameter> m89143f() {
        return this.f64503c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<KmValueParameter> m89144g() {
        return this.f64507g;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<KmVersionRequirement> m89145h() {
        return this.f64510j;
    }

    /* JADX INFO: renamed from: i */
    public final void m89146i(@Nullable KmContract kmContract) {
        this.f64511k = kmContract;
    }

    /* JADX INFO: renamed from: j */
    public final void m89147j(int i) {
        this.f64501a = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m89148k(@Nullable KmType kmType) {
        this.f64504d = kmType;
    }

    /* JADX INFO: renamed from: l */
    public final void m89149l(@NotNull KmType kmType) {
        kmType.getClass();
        this.f64509i = kmType;
    }
}
