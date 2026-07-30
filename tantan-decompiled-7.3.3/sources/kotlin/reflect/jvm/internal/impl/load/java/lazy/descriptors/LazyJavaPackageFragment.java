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
import p153l.par;
import p153l.qar;
import p153l.rar;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f65568o = {Reflection.m88403i(new PropertyReference1Impl(LazyJavaPackageFragment.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), Reflection.m88403i(new PropertyReference1Impl(LazyJavaPackageFragment.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final JavaPackage f65569g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final LazyJavaResolverContext f65570h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final MetadataVersion f65571i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final NotNullLazyValue f65572j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final JvmPackageScope f65573k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final NotNullLazyValue<List<FqName>> f65574l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Annotations f65575m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final NotNullLazyValue f65576n;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65577a;

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
            f65577a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage) {
        super(lazyJavaResolverContext.m90511d(), javaPackage.mo89954d());
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        this.f65569g = javaPackage;
        LazyJavaResolverContext lazyJavaResolverContextM90465f = ContextKt.m90465f(lazyJavaResolverContext, this, null, 0, 6, null);
        this.f65570h = lazyJavaResolverContextM90465f;
        this.f65571i = lazyJavaResolverContext.m90508a().m90474b().m91198f().m93046g().mo93067f();
        this.f65572j = lazyJavaResolverContextM90465f.m90512e().mo93337e(new par(this));
        this.f65573k = new JvmPackageScope(lazyJavaResolverContextM90465f, javaPackage, this);
        this.f65574l = lazyJavaResolverContextM90465f.m90512e().mo93333a(new qar(this), CollectionsKt.emptyList());
        this.f65575m = lazyJavaResolverContextM90465f.m90508a().m90481i().m90308a() ? Annotations.Companion.m89532b() : LazyJavaAnnotationsKt.m90503a(lazyJavaResolverContextM90465f, javaPackage);
        this.f65576n = lazyJavaResolverContextM90465f.m90512e().mo93337e(new rar(this));
    }

    /* JADX INFO: renamed from: F0 */
    public static final Map m90649F0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        List<String> listMo91274a = lazyJavaPackageFragment.f65570h.m90508a().m90487o().mo91274a(lazyJavaPackageFragment.mo89453d().m91937a());
        ArrayList arrayList = new ArrayList();
        for (String str : listMo91274a) {
            ClassId.Companion companion = ClassId.Companion;
            FqName fqNameM92910e = JvmClassName.m92908d(str).m92910e();
            fqNameM92910e.getClass();
            KotlinJvmBinaryClass kotlinJvmBinaryClassM91258b = KotlinClassFinderKt.m91258b(lazyJavaPackageFragment.f65570h.m90508a().m90482j(), companion.m91936c(fqNameM92910e), lazyJavaPackageFragment.f65571i);
            Pair pairM88129a = kotlinJvmBinaryClassM91258b != null ? TuplesKt.m88129a(str, kotlinJvmBinaryClassM91258b) : null;
            if (pairM88129a != null) {
                arrayList.add(pairM88129a);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX INFO: renamed from: K0 */
    public static final HashMap m90650K0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        HashMap map = new HashMap();
        for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.m90653H0().entrySet()) {
            String key = entry.getKey();
            KotlinJvmBinaryClass value = entry.getValue();
            JvmClassName jvmClassNameM92908d = JvmClassName.m92908d(key);
            jvmClassNameM92908d.getClass();
            KotlinClassHeader kotlinClassHeaderMo89837b = value.mo89837b();
            int i = WhenMappings.f65577a[kotlinClassHeaderMo89837b.m91307c().ordinal()];
            if (i == 1) {
                String strM91309e = kotlinClassHeaderMo89837b.m91309e();
                if (strM91309e != null) {
                    map.put(jvmClassNameM92908d, JvmClassName.m92908d(strM91309e));
                }
            } else if (i == 2) {
                map.put(jvmClassNameM92908d, jvmClassNameM92908d);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: L0 */
    public static final List m90651L0(LazyJavaPackageFragment lazyJavaPackageFragment) {
        Collection<JavaPackage> collectionMo89955n = lazyJavaPackageFragment.f65569g.mo89955n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89955n, 10));
        Iterator<T> it = collectionMo89955n.iterator();
        while (it.hasNext()) {
            arrayList.add(((JavaPackage) it.next()).mo89954d());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: G0 */
    public final ClassDescriptor m90652G0(@NotNull JavaClass javaClass) {
        javaClass.getClass();
        return this.f65573k.m90534i().m90661k0(javaClass);
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public final Map<String, KotlinJvmBinaryClass> m90653H0() {
        return (Map) StorageKt.m93375a(this.f65572j, this, f65568o[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public JvmPackageScope mo89316n() {
        return this.f65573k;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final List<FqName> m90655J0() {
        return this.f65574l.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f65575m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "Lazy Java package fragment: " + mo89453d() + " of module " + this.f65570h.m90508a().m90485m();
    }
}
