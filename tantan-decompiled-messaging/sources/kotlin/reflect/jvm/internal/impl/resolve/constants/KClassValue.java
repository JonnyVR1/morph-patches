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
import p149l.l9r;

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
        public final ConstantValue<?> m91949a(@NotNull KotlinType kotlinType) {
            kotlinType.getClass();
            if (KotlinTypeKt.m92644a(kotlinType)) {
                return null;
            }
            int i = 0;
            KotlinType type = kotlinType;
            while (KotlinBuiltIns.m88181d0(type)) {
                type = ((TypeProjection) CollectionsKt.single((List) type.mo91888E0())).getType();
                type.getClass();
                i++;
            }
            ClassifierDescriptor classifierDescriptorMo88316e = type.mo91890G0().mo88316e();
            if (classifierDescriptorMo88316e instanceof ClassDescriptor) {
                ClassId classIdM91981n = DescriptorUtilsKt.m91981n(classifierDescriptorMo88316e);
                return classIdM91981n == null ? new KClassValue(new Value.LocalClass(kotlinType)) : new KClassValue(classIdM91981n, i);
            }
            if (classifierDescriptorMo88316e instanceof TypeParameterDescriptor) {
                return new KClassValue(ClassId.Companion.m91045c(StandardNames.FqNames.f63882a.m91068m()), 0);
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
            public final KotlinType f65862a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(@NotNull KotlinType kotlinType) {
                super(null);
                kotlinType.getClass();
                this.f65862a = kotlinType;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final KotlinType m91950a() {
                return this.f65862a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.m87488d(this.f65862a, ((LocalClass) obj).f65862a);
            }

            public int hashCode() {
                return this.f65862a.hashCode();
            }

            @NotNull
            public String toString() {
                return "LocalClass(type=" + this.f65862a + ')';
            }
        }

        public static final class NormalClass extends Value {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final ClassLiteralValue f65863a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(@NotNull ClassLiteralValue classLiteralValue) {
                super(null);
                classLiteralValue.getClass();
                this.f65863a = classLiteralValue;
            }

            /* JADX INFO: renamed from: a */
            public final int m91951a() {
                return this.f65863a.m91916c();
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final ClassId m91952b() {
                return this.f65863a.m91917d();
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public final ClassLiteralValue m91953c() {
                return this.f65863a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.m87488d(this.f65863a, ((NormalClass) obj).f65863a);
            }

            public int hashCode() {
                return this.f65863a.hashCode();
            }

            @NotNull
            public String toString() {
                return "NormalClass(value=" + this.f65863a + ')';
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
    public KotlinType mo91908a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        TypeAttributes typeAttributesM92709k = TypeAttributes.Companion.m92709k();
        ClassDescriptor classDescriptorM88209F = moduleDescriptor.mo88546f().m88209F();
        classDescriptorM88209F.getClass();
        return KotlinTypeFactory.m92631h(typeAttributesM92709k, classDescriptorM88209F, CollectionsKt.listOf(new TypeProjectionImpl(m91948c(moduleDescriptor))));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KotlinType m91948c(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        Value valueMo91918b = mo91918b();
        if (valueMo91918b instanceof Value.LocalClass) {
            return ((Value.LocalClass) mo91918b()).m91950a();
        }
        if (!(valueMo91918b instanceof Value.NormalClass)) {
            l9r.m149037a();
            return null;
        }
        ClassLiteralValue classLiteralValueM91953c = ((Value.NormalClass) mo91918b()).m91953c();
        ClassId classIdM91914a = classLiteralValueM91953c.m91914a();
        int iM91915b = classLiteralValueM91953c.m91915b();
        ClassDescriptor classDescriptorM88507b = FindClassInModuleKt.m88507b(moduleDescriptor, classIdM91914a);
        if (classDescriptorM88507b == null) {
            return ErrorUtils.m93002d(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, classIdM91914a.toString(), String.valueOf(iM91915b));
        }
        SimpleType simpleTypeMo88458o = classDescriptorM88507b.mo88458o();
        simpleTypeMo88458o.getClass();
        KotlinType kotlinTypeM93078D = TypeUtilsKt.m93078D(simpleTypeMo88458o);
        for (int i = 0; i < iM91915b; i++) {
            kotlinTypeM93078D = moduleDescriptor.mo88546f().m88236m(Variance.INVARIANT, kotlinTypeM93078D);
            kotlinTypeM93078D.getClass();
        }
        return kotlinTypeM93078D;
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
