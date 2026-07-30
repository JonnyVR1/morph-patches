package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.p120km.internal.BooleanFlagDelegate;
import kotlin.reflect.jvm.internal.impl.p120km.internal.FlagDelegatesImplKt;
import kotlin.reflect.jvm.internal.impl.p120km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmProperty {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ KProperty<Object>[] f64517s = {Reflection.m87510e(new MutablePropertyReference1Impl(KmProperty.class, "_hasSetter", "get_hasSetter()Z", 0)), Reflection.m87510e(new MutablePropertyReference1Impl(KmProperty.class, "_hasGetter", "get_hasGetter()Z", 0))};

    /* JADX INFO: renamed from: a */
    public int f64518a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f64519b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BooleanFlagDelegate f64520c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final BooleanFlagDelegate f64521d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final KmPropertyAccessorAttributes f64522e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public KmPropertyAccessorAttributes f64523f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final List<KmTypeParameter> f64524g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public KmType f64525h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<KmAnnotation> f64526i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<KmType> f64527j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<KmValueParameter> f64528k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public KmValueParameter f64529l;

    /* JADX INFO: renamed from: m */
    public KmType f64530m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final List<KmVersionRequirement> f64531n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final List<KmAnnotation> f64532o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final List<KmAnnotation> f64533p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final List<KmAnnotation> f64534q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final List<KmPropertyExtension> f64535r;

    public KmProperty(int i, @NotNull String str, int i2, int i3) {
        str.getClass();
        this.f64518a = i;
        this.f64519b = str;
        Flags.BooleanFlagField booleanFlagField = Flags.f65342C;
        booleanFlagField.getClass();
        this.f64520c = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField));
        Flags.BooleanFlagField booleanFlagField2 = Flags.f65341B;
        booleanFlagField2.getClass();
        this.f64521d = FlagDelegatesImplKt.m89213g(new FlagImpl(booleanFlagField2));
        KmPropertyAccessorAttributes kmPropertyAccessorAttributes = new KmPropertyAccessorAttributes(i2);
        m89166q(true);
        this.f64522e = kmPropertyAccessorAttributes;
        this.f64523f = m89161l() ? new KmPropertyAccessorAttributes(i3) : null;
        this.f64524g = new ArrayList(0);
        this.f64526i = new ArrayList(0);
        this.f64527j = new ArrayList(0);
        this.f64528k = new ArrayList();
        this.f64531n = new ArrayList(0);
        this.f64532o = new ArrayList(0);
        this.f64533p = new ArrayList(0);
        this.f64534q = new ArrayList(0);
        List<MetadataExtensions> listM89283c = MetadataExtensions.Companion.m89283c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89283c, 10));
        Iterator<T> it = listM89283c.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).mo89275m());
        }
        this.f64535r = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmAnnotation> m89150a() {
        return this.f64532o;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KmAnnotation> m89151b() {
        return this.f64533p;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmValueParameter> m89152c() {
        return this.f64528k;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<KmAnnotation> m89153d() {
        return this.f64534q;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<KmAnnotation> m89154e() {
        return this.f64526i;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<KmPropertyExtension> m89155f() {
        return this.f64535r;
    }

    /* JADX INFO: renamed from: g */
    public final int m89156g() {
        return this.f64518a;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final KmPropertyAccessorAttributes m89157h() {
        return this.f64522e;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final KmPropertyAccessorAttributes m89158i() {
        return this.f64523f;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<KmTypeParameter> m89159j() {
        return this.f64524g;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<KmVersionRequirement> m89160k() {
        return this.f64531n;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m89161l() {
        return this.f64520c.m89204a(this, f64517s[0]);
    }

    /* JADX INFO: renamed from: m */
    public final void m89162m(int i) {
        this.f64518a = i;
    }

    /* JADX INFO: renamed from: n */
    public final void m89163n(@Nullable KmType kmType) {
        this.f64525h = kmType;
    }

    /* JADX INFO: renamed from: o */
    public final void m89164o(@NotNull KmType kmType) {
        kmType.getClass();
        this.f64530m = kmType;
    }

    /* JADX INFO: renamed from: p */
    public final void m89165p(@Nullable KmValueParameter kmValueParameter) {
        this.f64529l = kmValueParameter;
    }

    /* JADX INFO: renamed from: q */
    public final void m89166q(boolean z) {
        this.f64521d.m89205b(this, f64517s[1], z);
    }
}
