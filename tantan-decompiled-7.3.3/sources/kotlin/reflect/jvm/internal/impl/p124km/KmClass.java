package kotlin.reflect.jvm.internal.impl.p124km;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmClass implements KmDeclarationContainer {

    /* JADX INFO: renamed from: a */
    public int f65131a;

    /* JADX INFO: renamed from: b */
    public String f65132b;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f65139i;

    /* JADX INFO: renamed from: n */
    @Nullable
    public String f65144n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public KmType f65145o;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final List<KmClassExtension> f65149s;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeParameter> f65133c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<KmType> f65134d = new ArrayList(1);

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmFunction> f65135e = new ArrayList();

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmProperty> f65136f = new ArrayList();

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmTypeAlias> f65137g = new ArrayList(0);

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<KmConstructor> f65138h = new ArrayList(1);

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<String> f65140j = new ArrayList(0);

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<String> f65141k = new ArrayList(0);

    /* JADX INFO: renamed from: l */
    @NotNull
    public final List<KmEnumEntry> f65142l = new ArrayList(0);

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<String> f65143m = new ArrayList(0);

    /* JADX INFO: renamed from: p */
    @NotNull
    public final List<KmAnnotation> f65146p = new ArrayList(0);

    /* JADX INFO: renamed from: q */
    @NotNull
    public final List<KmType> f65147q = new ArrayList(0);

    /* JADX INFO: renamed from: r */
    @NotNull
    public final List<KmVersionRequirement> f65148r = new ArrayList(0);

    public KmClass() {
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM90174c, 10));
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo90157d());
        }
        this.f65149s = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<KmProperty> mo89990a() {
        return this.f65136f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<KmTypeAlias> mo89991b() {
        return this.f65137g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<KmFunction> mo89992c() {
        return this.f65135e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmAnnotation> m89993d() {
        return this.f65146p;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<KmConstructor> m89994e() {
        return this.f65138h;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<KmType> m89995f() {
        return this.f65147q;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<String> m89996g() {
        return this.f65141k;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<KmClassExtension> m89997h() {
        return this.f65149s;
    }

    /* JADX INFO: renamed from: i */
    public final int m89998i() {
        return this.f65131a;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final KmType m89999j() {
        return this.f65145o;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<KmEnumEntry> m90000k() {
        return this.f65142l;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final String m90001l() {
        String str = this.f65132b;
        if (str != null) {
            return str;
        }
        Intrinsics.m88391r(AuthenticationTokenClaims.JSON_KEY_NAME);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<String> m90002m() {
        return this.f65140j;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<String> m90003n() {
        return this.f65143m;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<KmType> m90004o() {
        return this.f65134d;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<KmTypeParameter> m90005p() {
        return this.f65133c;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final List<KmVersionRequirement> m90006q() {
        return this.f65148r;
    }

    /* JADX INFO: renamed from: r */
    public final void m90007r(@Nullable String str) {
        this.f65139i = str;
    }

    /* JADX INFO: renamed from: s */
    public final void m90008s(int i) {
        this.f65131a = i;
    }

    /* JADX INFO: renamed from: t */
    public final void m90009t(@Nullable String str) {
        this.f65144n = str;
    }

    /* JADX INFO: renamed from: u */
    public final void m90010u(@Nullable KmType kmType) {
        this.f65145o = kmType;
    }

    /* JADX INFO: renamed from: v */
    public final void m90011v(@NotNull String str) {
        str.getClass();
        this.f65132b = str;
    }
}
