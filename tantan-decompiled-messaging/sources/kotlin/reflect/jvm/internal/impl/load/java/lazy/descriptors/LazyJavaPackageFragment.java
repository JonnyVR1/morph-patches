package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.n8r;
import p149l.o8r;
import p149l.p8r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f64894o = {Reflection.m87514i(new PropertyReference1Impl(LazyJavaPackageFragment.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), Reflection.m87514i(new PropertyReference1Impl(LazyJavaPackageFragment.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final JavaPackage f64895g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final LazyJavaResolverContext f64896h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MetadataVersion f64897i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final NotNullLazyValue f64898j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final JvmPackageScope f64899k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final NotNullLazyValue<List<FqName>> f64900l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Annotations f64901m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final NotNullLazyValue f64902n;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64903a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64903a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage) {
        super(lazyJavaResolverContext.m89620d(), javaPackage.mo89063d());
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        this.f64895g = javaPackage;
        LazyJavaResolverContext lazyJavaResolverContextM89574f = ContextKt.m89574f(lazyJavaResolverContext, this, null, 0, 6, null);
        this.f64896h = lazyJavaResolverContextM89574f;
        this.f64897i = lazyJavaResolverContext.m89617a().m89583b().m90307f().m92155g().mo92176f();
        this.f64898j = lazyJavaResolverContextM89574f.m89621e().mo92446e(new n8r(this));
        this.f64899k = new JvmPackageScope(lazyJavaResolverContextM89574f, javaPackage, this);
        this.f64900l = lazyJavaResolverContextM89574f.m89621e().mo92442a(new o8r(this), CollectionsKt.emptyList());
        this.f64901m = lazyJavaResolverContextM89574f.m89617a().m89590i().m89417a() ? Annotations.Companion.m88641b() : LazyJavaAnnotationsKt.m89612a(lazyJavaResolverContextM89574f, javaPackage);
        this.f64902n = lazyJavaResolverContextM89574f.m89621e().mo92446e(new p8r(this));
    }

    /* JADX INFO: renamed from: F0 */
    public static final Map m89758F0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        List<String> listMo90383a = lazyJavaPackageFragment.f64896h.m89617a().m89596o().mo90383a(lazyJavaPackageFragment.mo88562d().m91046a());
        ArrayList arrayList = new ArrayList();
        for (String str : listMo90383a) {
            ClassId.Companion companion = ClassId.Companion;
            FqName fqNameM92019e = JvmClassName.m92017d(str).m92019e();
            fqNameM92019e.getClass();
            KotlinJvmBinaryClass kotlinJvmBinaryClassM90367b = KotlinClassFinderKt.m90367b(lazyJavaPackageFragment.f64896h.m89617a().m89591j(), companion.m91045c(fqNameM92019e), lazyJavaPackageFragment.f64897i);
            Pair pairM87240a = kotlinJvmBinaryClassM90367b != null ? TuplesKt.m87240a(str, kotlinJvmBinaryClassM90367b) : null;
            if (pairM87240a != null) {
                arrayList.add(pairM87240a);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX INFO: renamed from: K0 */
    public static final HashMap m89759K0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        HashMap map = new HashMap();
        for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.m89762H0().entrySet()) {
            String key = entry.getKey();
            KotlinJvmBinaryClass value = entry.getValue();
            JvmClassName jvmClassNameM92017d = JvmClassName.m92017d(key);
            jvmClassNameM92017d.getClass();
            KotlinClassHeader kotlinClassHeaderMo88946b = value.mo88946b();
            int i = WhenMappings.f64903a[kotlinClassHeaderMo88946b.m90416c().ordinal()];
            if (i == 1) {
                String strM90418e = kotlinClassHeaderMo88946b.m90418e();
                if (strM90418e != null) {
                    map.put(jvmClassNameM92017d, JvmClassName.m92017d(strM90418e));
                }
            } else if (i == 2) {
                map.put(jvmClassNameM92017d, jvmClassNameM92017d);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: L0 */
    public static final List m89760L0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        Collection<JavaPackage> collectionMo89064n = lazyJavaPackageFragment.f64895g.mo89064n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89064n, 10));
        Iterator<T> it = collectionMo89064n.iterator();
        while (it.hasNext()) {
            arrayList.add(((JavaPackage) it.next()).mo89063d());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: G0 */
    public final ClassDescriptor m89761G0(@NotNull JavaClass javaClass) {
        javaClass.getClass();
        return this.f64899k.m89643i().m89770k0(javaClass);
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public final Map<String, KotlinJvmBinaryClass> m89762H0() {
        return (Map) StorageKt.m92484a(this.f64898j, this, f64894o[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public JvmPackageScope mo88425n() {
        return this.f64899k;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final List<FqName> m89764J0() {
        return this.f64900l.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f64901m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "Lazy Java package fragment: " + mo88562d() + " of module " + this.f64896h.m89617a().m89594m();
    }
}
