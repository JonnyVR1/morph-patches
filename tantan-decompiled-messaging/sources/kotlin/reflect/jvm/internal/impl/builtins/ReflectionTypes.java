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
import p149l.ymc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectionTypes {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NotFoundClasses f63788a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f63789b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C15180a f63790c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C15180a f63791d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final C15180a f63792e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final C15180a f63793f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final C15180a f63794g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final C15180a f63795h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final C15180a f63796i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final C15180a f63797j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f63787k = {Reflection.m87514i(new PropertyReference1Impl(ReflectionTypes.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(ReflectionTypes.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(ReflectionTypes.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(ReflectionTypes.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(ReflectionTypes.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(ReflectionTypes.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final KotlinType m88261a(@NotNull ModuleDescriptor moduleDescriptor) {
            moduleDescriptor.getClass();
            ClassDescriptor classDescriptorM88507b = FindClassInModuleKt.m88507b(moduleDescriptor, StandardNames.FqNames.f63925v0);
            if (classDescriptorM88507b == null) {
                return null;
            }
            TypeAttributes typeAttributesM92709k = TypeAttributes.Companion.m92709k();
            List<TypeParameterDescriptor> parameters = classDescriptorM88507b.mo88305l().getParameters();
            parameters.getClass();
            Object objSingle = CollectionsKt.single((List<? extends Object>) parameters);
            objSingle.getClass();
            return KotlinTypeFactory.m92631h(typeAttributesM92709k, classDescriptorM88507b, CollectionsKt.listOf(new StarProjectionImpl((TypeParameterDescriptor) objSingle)));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$a */
    public static final class C15180a {

        /* JADX INFO: renamed from: a */
        public final int f63798a;

        public C15180a(int i) {
            this.f63798a = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassDescriptor m88262a(@NotNull ReflectionTypes reflectionTypes, @NotNull KProperty<?> kProperty) {
            reflectionTypes.getClass();
            kProperty.getClass();
            return reflectionTypes.m88258c(CapitalizeDecapitalizeKt.m93170a(kProperty.getName()), this.f63798a);
        }
    }

    public ReflectionTypes(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        this.f63788a = notFoundClasses;
        this.f63789b = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new ymc0(moduleDescriptor));
        this.f63790c = new C15180a(1);
        this.f63791d = new C15180a(1);
        this.f63792e = new C15180a(1);
        this.f63793f = new C15180a(2);
        this.f63794g = new C15180a(3);
        this.f63795h = new C15180a(1);
        this.f63796i = new C15180a(2);
        this.f63797j = new C15180a(3);
    }

    /* JADX INFO: renamed from: f */
    public static final MemberScope m88257f(ModuleDescriptor moduleDescriptor) {
        return moduleDescriptor.mo88543I(StandardNames.f63832x).mo88576n();
    }

    /* JADX INFO: renamed from: c */
    public final ClassDescriptor m88258c(String str, int i) {
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        ClassifierDescriptor classifierDescriptorMo89642f = m88260e().mo89642f(nameM91079i, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = classifierDescriptorMo89642f instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89642f : null;
        return classDescriptor == null ? this.f63788a.m88556d(new ClassId(StandardNames.f63832x, nameM91079i), CollectionsKt.listOf(Integer.valueOf(i))) : classDescriptor;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ClassDescriptor m88259d() {
        return this.f63790c.m88262a(this, f63787k[0]);
    }

    /* JADX INFO: renamed from: e */
    public final MemberScope m88260e() {
        return (MemberScope) this.f63789b.getValue();
    }
}
