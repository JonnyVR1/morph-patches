package kotlin.reflect.jvm.internal.impl.p120km;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmClass implements KmDeclarationContainer {

    /* JADX INFO: renamed from: a */
    public int f64457a;

    /* JADX INFO: renamed from: b */
    public String f64458b;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f64465i;

    /* JADX INFO: renamed from: n */
    @Nullable
    public String f64470n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public KmType f64471o;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final List<KmClassExtension> f64475s;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeParameter> f64459c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<KmType> f64460d = new ArrayList(1);

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmFunction> f64461e = new ArrayList();

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmProperty> f64462f = new ArrayList();

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmTypeAlias> f64463g = new ArrayList(0);

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<KmConstructor> f64464h = new ArrayList(1);

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<String> f64466j = new ArrayList(0);

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<String> f64467k = new ArrayList(0);

    /* JADX INFO: renamed from: l */
    @NotNull
    public final List<KmEnumEntry> f64468l = new ArrayList(0);

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<String> f64469m = new ArrayList(0);

    /* JADX INFO: renamed from: p */
    @NotNull
    public final List<KmAnnotation> f64472p = new ArrayList(0);

    /* JADX INFO: renamed from: q */
    @NotNull
    public final List<KmType> f64473q = new ArrayList(0);

    /* JADX INFO: renamed from: r */
    @NotNull
    public final List<KmVersionRequirement> f64474r = new ArrayList(0);

    public KmClass() {
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89283c, 10));
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo89266d());
        }
        this.f64475s = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<KmProperty> mo89099a() {
        return this.f64462f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<KmTypeAlias> mo89100b() {
        return this.f64463g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<KmFunction> mo89101c() {
        return this.f64461e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmAnnotation> m89102d() {
        return this.f64472p;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<KmConstructor> m89103e() {
        return this.f64464h;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<KmType> m89104f() {
        return this.f64473q;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<String> m89105g() {
        return this.f64467k;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<KmClassExtension> m89106h() {
        return this.f64475s;
    }

    /* JADX INFO: renamed from: i */
    public final int m89107i() {
        return this.f64457a;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final KmType m89108j() {
        return this.f64471o;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<KmEnumEntry> m89109k() {
        return this.f64468l;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final String m89110l() {
        String str = this.f64458b;
        if (str != null) {
            return str;
        }
        Intrinsics.m87502r(AuthenticationTokenClaims.JSON_KEY_NAME);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<String> m89111m() {
        return this.f64466j;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<String> m89112n() {
        return this.f64469m;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<KmType> m89113o() {
        return this.f64460d;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<KmTypeParameter> m89114p() {
        return this.f64459c;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final List<KmVersionRequirement> m89115q() {
        return this.f64474r;
    }

    /* JADX INFO: renamed from: r */
    public final void m89116r(@Nullable String str) {
        this.f64465i = str;
    }

    /* JADX INFO: renamed from: s */
    public final void m89117s(int i) {
        this.f64457a = i;
    }

    /* JADX INFO: renamed from: t */
    public final void m89118t(@Nullable String str) {
        this.f64470n = str;
    }

    /* JADX INFO: renamed from: u */
    public final void m89119u(@Nullable KmType kmType) {
        this.f64471o = kmType;
    }

    /* JADX INFO: renamed from: v */
    public final void m89120v(@NotNull String str) {
        str.getClass();
        this.f64458b = str;
    }
}
