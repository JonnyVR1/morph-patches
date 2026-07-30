package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.p124km.internal.BooleanFlagDelegate;
import kotlin.reflect.jvm.internal.impl.p124km.internal.FlagDelegatesImplKt;
import kotlin.reflect.jvm.internal.impl.p124km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmProperty {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ KProperty<Object>[] f65191s = {Reflection.m88399e(new MutablePropertyReference1Impl(KmProperty.class, "_hasSetter", "get_hasSetter()Z", 0)), Reflection.m88399e(new MutablePropertyReference1Impl(KmProperty.class, "_hasGetter", "get_hasGetter()Z", 0))};

    /* JADX INFO: renamed from: a */
    public int f65192a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f65193b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BooleanFlagDelegate f65194c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final BooleanFlagDelegate f65195d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final KmPropertyAccessorAttributes f65196e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public KmPropertyAccessorAttributes f65197f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmTypeParameter> f65198g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public KmType f65199h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<KmAnnotation> f65200i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<KmType> f65201j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<KmValueParameter> f65202k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public KmValueParameter f65203l;

    /* JADX INFO: renamed from: m */
    public KmType f65204m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final List<KmVersionRequirement> f65205n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final List<KmAnnotation> f65206o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final List<KmAnnotation> f65207p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final List<KmAnnotation> f65208q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final List<KmPropertyExtension> f65209r;

    public KmProperty(int i, @NotNull String str, int i2, int i3) {
        str.getClass();
        this.f65192a = i;
        this.f65193b = str;
        Flags.BooleanFlagField booleanFlagField = Flags.f66016C;
        booleanFlagField.getClass();
        this.f65194c = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField));
        Flags.BooleanFlagField booleanFlagField2 = Flags.f66015B;
        booleanFlagField2.getClass();
        this.f65195d = FlagDelegatesImplKt.m90104g(new FlagImpl(booleanFlagField2));
        KmPropertyAccessorAttributes kmPropertyAccessorAttributes = new KmPropertyAccessorAttributes(i2);
        m90057q(true);
        this.f65196e = kmPropertyAccessorAttributes;
        this.f65197f = m90052l() ? new KmPropertyAccessorAttributes(i3) : null;
        this.f65198g = new ArrayList(0);
        this.f65200i = new ArrayList(0);
        this.f65201j = new ArrayList(0);
        this.f65202k = new ArrayList();
        this.f65205n = new ArrayList(0);
        this.f65206o = new ArrayList(0);
        this.f65207p = new ArrayList(0);
        this.f65208q = new ArrayList(0);
        List<MetadataExtensions> listM90174c = MetadataExtensions.Companion.m90174c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM90174c, 10));
        Iterator<T> it = listM90174c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo90166m());
        }
        this.f65209r = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m90041a() {
        return this.f65206o;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KmAnnotation> m90042b() {
        return this.f65207p;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmValueParameter> m90043c() {
        return this.f65202k;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmAnnotation> m90044d() {
        return this.f65208q;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<KmAnnotation> m90045e() {
        return this.f65200i;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<KmPropertyExtension> m90046f() {
        return this.f65209r;
    }

    /* JADX INFO: renamed from: g */
    public final int m90047g() {
        return this.f65192a;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final KmPropertyAccessorAttributes m90048h() {
        return this.f65196e;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final KmPropertyAccessorAttributes m90049i() {
        return this.f65197f;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<KmTypeParameter> m90050j() {
        return this.f65198g;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<KmVersionRequirement> m90051k() {
        return this.f65205n;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m90052l() {
        return this.f65194c.m90095a(this, f65191s[0]);
    }

    /* JADX INFO: renamed from: m */
    public final void m90053m(int i) {
        this.f65192a = i;
    }

    /* JADX INFO: renamed from: n */
    public final void m90054n(@Nullable KmType kmType) {
        this.f65199h = kmType;
    }

    /* JADX INFO: renamed from: o */
    public final void m90055o(@NotNull KmType kmType) {
        kmType.getClass();
        this.f65204m = kmType;
    }

    /* JADX INFO: renamed from: p */
    public final void m90056p(@Nullable KmValueParameter kmValueParameter) {
        this.f65203l = kmValueParameter;
    }

    /* JADX INFO: renamed from: q */
    public final void m90057q(boolean z) {
        this.f65195d.m90096b(this, f65191s[1], z);
    }
}
