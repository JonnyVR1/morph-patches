package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
public final class KClassValue extends ConstantValue<Value> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final ConstantValue<?> m92840a(@NotNull KotlinType kotlinType) {
            kotlinType.getClass();
            if (KotlinTypeKt.m93535a(kotlinType)) {
                return null;
            }
            int i = 0;
            KotlinType type = kotlinType;
            while (KotlinBuiltIns.m89072d0(type)) {
                type = ((TypeProjection) CollectionsKt.single((List) type.mo92779E0())).getType();
                type.getClass();
                i++;
            }
            ClassifierDescriptor classifierDescriptorMo89207e = type.mo92781G0().mo89207e();
            if (classifierDescriptorMo89207e instanceof ClassDescriptor) {
                ClassId classIdM92872n = DescriptorUtilsKt.m92872n(classifierDescriptorMo89207e);
                return classIdM92872n == null ? new KClassValue(new Value.LocalClass(kotlinType)) : new KClassValue(classIdM92872n, i);
            }
            if (classifierDescriptorMo89207e instanceof TypeParameterDescriptor) {
                return new KClassValue(ClassId.Companion.m91936c(StandardNames.FqNames.f64556a.m91959m()), 0);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static abstract class Value {

        public static final class LocalClass extends Value {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final KotlinType f66536a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(@NotNull KotlinType kotlinType) {
                super(null);
                kotlinType.getClass();
                this.f66536a = kotlinType;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final KotlinType m92841a() {
                return this.f66536a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.m88377d(this.f66536a, ((LocalClass) obj).f66536a);
            }

            public int hashCode() {
                return this.f66536a.hashCode();
            }

            @NotNull
            public String toString() {
                return "LocalClass(type=" + this.f66536a + ')';
            }
        }

        public static final class NormalClass extends Value {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final ClassLiteralValue f66537a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(@NotNull ClassLiteralValue classLiteralValue) {
                super(null);
                classLiteralValue.getClass();
                this.f66537a = classLiteralValue;
            }

            /* JADX INFO: renamed from: a */
            public final int m92842a() {
                return this.f66537a.m92807c();
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final ClassId m92843b() {
                return this.f66537a.m92808d();
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public final ClassLiteralValue m92844c() {
                return this.f66537a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.m88377d(this.f66537a, ((NormalClass) obj).f66537a);
            }

            public int hashCode() {
                return this.f66537a.hashCode();
            }

            @NotNull
            public String toString() {
                return "NormalClass(value=" + this.f66537a + ')';
            }
        }

        public /* synthetic */ Value(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Value() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull ClassLiteralValue classLiteralValue) {
        this(new Value.NormalClass(classLiteralValue));
        classLiteralValue.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: a */
    public KotlinType mo92799a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        TypeAttributes typeAttributesM93600k = TypeAttributes.Companion.m93600k();
        ClassDescriptor classDescriptorM89100F = moduleDescriptor.mo89437f().m89100F();
        classDescriptorM89100F.getClass();
        return KotlinTypeFactory.m93522h(typeAttributesM93600k, classDescriptorM89100F, CollectionsKt.listOf(new TypeProjectionImpl(m92839c(moduleDescriptor))));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KotlinType m92839c(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        Value valueMo92809b = mo92809b();
        if (valueMo92809b instanceof Value.LocalClass) {
            return ((Value.LocalClass) mo92809b()).m92841a();
        }
        if (!(valueMo92809b instanceof Value.NormalClass)) {
            nbr.m162172a();
            return null;
        }
        ClassLiteralValue classLiteralValueM92844c = ((Value.NormalClass) mo92809b()).m92844c();
        ClassId classIdM92805a = classLiteralValueM92844c.m92805a();
        int iM92806b = classLiteralValueM92844c.m92806b();
        ClassDescriptor classDescriptorM89398b = FindClassInModuleKt.m89398b(moduleDescriptor, classIdM92805a);
        if (classDescriptorM89398b == null) {
            return ErrorUtils.m93893d(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, classIdM92805a.toString(), String.valueOf(iM92806b));
        }
        SimpleType simpleTypeMo89349o = classDescriptorM89398b.mo89349o();
        simpleTypeMo89349o.getClass();
        KotlinType kotlinTypeM93969D = TypeUtilsKt.m93969D(simpleTypeMo89349o);
        for (int i = 0; i < iM92806b; i++) {
            kotlinTypeM93969D = moduleDescriptor.mo89437f().m89127m(Variance.INVARIANT, kotlinTypeM93969D);
            kotlinTypeM93969D.getClass();
        }
        return kotlinTypeM93969D;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull Value value) {
        super(value);
        value.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull ClassId classId, int i) {
        this(new ClassLiteralValue(classId, i));
        classId.getClass();
    }
}
