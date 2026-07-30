package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dvc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectionTypes {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NotFoundClasses f64462a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f64463b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C15287a f64464c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C15287a f64465d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final C15287a f64466e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final C15287a f64467f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final C15287a f64468g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final C15287a f64469h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final C15287a f64470i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final C15287a f64471j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f64461k = {Reflection.m88403i(new PropertyReference1Impl(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m88403i(new PropertyReference1Impl(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m88403i(new PropertyReference1Impl(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m88403i(new PropertyReference1Impl(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m88403i(new PropertyReference1Impl(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m88403i(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m88403i(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m88403i(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final KotlinType m89152a(@NotNull ModuleDescriptor moduleDescriptor) {
            moduleDescriptor.getClass();
            ClassDescriptor classDescriptorM89398b = FindClassInModuleKt.m89398b(moduleDescriptor, StandardNames.FqNames.f64599v0);
            if (classDescriptorM89398b == null) {
                return null;
            }
            TypeAttributes typeAttributesM93600k = TypeAttributes.Companion.m93600k();
            List<TypeParameterDescriptor> parameters = classDescriptorM89398b.mo89196l().getParameters();
            parameters.getClass();
            Object objSingle = CollectionsKt.single((List<? extends Object>) parameters);
            objSingle.getClass();
            return KotlinTypeFactory.m93522h(typeAttributesM93600k, classDescriptorM89398b, CollectionsKt.listOf(new StarProjectionImpl((TypeParameterDescriptor) objSingle)));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$a */
    public static final class C15287a {

        /* JADX INFO: renamed from: a */
        public final int f64472a;

        public C15287a(int i) {
            this.f64472a = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassDescriptor m89153a(@NotNull ReflectionTypes reflectionTypes, @NotNull KProperty<?> kProperty) {
            reflectionTypes.getClass();
            kProperty.getClass();
            return reflectionTypes.m89149c(CapitalizeDecapitalizeKt.m94061a(kProperty.getName()), this.f64472a);
        }
    }

    public ReflectionTypes(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        this.f64462a = notFoundClasses;
        this.f64463b = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new dvc0(moduleDescriptor));
        this.f64464c = new C15287a(1);
        this.f64465d = new C15287a(1);
        this.f64466e = new C15287a(1);
        this.f64467f = new C15287a(2);
        this.f64468g = new C15287a(3);
        this.f64469h = new C15287a(1);
        this.f64470i = new C15287a(2);
        this.f64471j = new C15287a(3);
    }

    /* JADX INFO: renamed from: f */
    public static final MemberScope m89148f(ModuleDescriptor moduleDescriptor) {
        return moduleDescriptor.mo89434I(StandardNames.f64506x).mo89467n();
    }

    /* JADX INFO: renamed from: c */
    public final ClassDescriptor m89149c(String str, int i) {
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        ClassifierDescriptor classifierDescriptorMo90533f = m89151e().mo90533f(nameM91970i, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = classifierDescriptorMo90533f instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo90533f : null;
        return classDescriptor == null ? this.f64462a.m89447d(new ClassId(StandardNames.f64506x, nameM91970i), CollectionsKt.listOf(Integer.valueOf(i))) : classDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ClassDescriptor m89150d() {
        return this.f64464c.m89153a(this, f64461k[0]);
    }

    /* JADX INFO: renamed from: e */
    public final MemberScope m89151e() {
        return (MemberScope) this.f64463b.getValue();
    }
}
