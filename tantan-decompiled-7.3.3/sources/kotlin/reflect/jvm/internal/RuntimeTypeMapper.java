package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p153l.azq;
import p153l.p7f;
import p153l.t560;
import p153l.xqd0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010$\u001a\u0004\u0018\u00010!*\u0006\u0012\u0002\b\u00030\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "f", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "c", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "descriptor", "", "b", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Z", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class RuntimeTypeMapper {

    @NotNull
    public static final RuntimeTypeMapper INSTANCE = new RuntimeTypeMapper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ClassId JAVA_LANG_VOID = ClassId.Companion.m91936c(new FqName(com.meituan.robust.Constants.LANG_VOID));

    private RuntimeTypeMapper() {
    }

    /* JADX INFO: renamed from: a */
    public final PrimitiveType m88918a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m88919b(FunctionDescriptor descriptor) {
        if (DescriptorFactory.m92635p(descriptor) || DescriptorFactory.m92636q(descriptor)) {
            return true;
        }
        return Intrinsics.m88377d(descriptor.getName(), CloneableClassScope.Companion.m89230a()) && descriptor.mo89339g().isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ClassId m88920c(@NotNull Class<?> klass) {
        ClassId classIdM89246m;
        klass.getClass();
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            componentType.getClass();
            PrimitiveType primitiveTypeM88918a = m88918a(componentType);
            return primitiveTypeM88918a != null ? new ClassId(StandardNames.f64473A, primitiveTypeM88918a.getArrayTypeName()) : ClassId.Companion.m91936c(StandardNames.FqNames.f64570h.m91959m());
        }
        if (Intrinsics.m88377d(klass, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        PrimitiveType primitiveTypeM88918a2 = m88918a(klass);
        if (primitiveTypeM88918a2 != null) {
            return new ClassId(StandardNames.f64473A, primitiveTypeM88918a2.getTypeName());
        }
        ClassId classIdM89882e = ReflectClassUtilKt.m89882e(klass);
        return (classIdM89882e.m91932i() || (classIdM89246m = JavaToKotlinClassMap.INSTANCE.m89246m(classIdM89882e.m91925a())) == null) ? classIdM89882e : classIdM89246m;
    }

    /* JADX INFO: renamed from: d */
    public final JvmFunctionSignature.KotlinFunction m88921d(FunctionDescriptor descriptor) {
        return new JvmFunctionSignature.KotlinFunction(new JvmMemberSignature.Method(m88922e(descriptor), MethodSignatureMappingKt.m91269c(descriptor, false, false, 1, null)));
    }

    /* JADX INFO: renamed from: e */
    public final String m88922e(CallableMemberDescriptor descriptor) {
        String strM90358e = SpecialBuiltinMembers.m90358e(descriptor);
        if (strM90358e != null) {
            return strM90358e;
        }
        if (descriptor instanceof PropertyGetterDescriptor) {
            String strM91973b = DescriptorUtilsKt.m92881w(descriptor).getName().m91973b();
            strM91973b.getClass();
            return JvmAbi.m90322b(strM91973b);
        }
        if (descriptor instanceof PropertySetterDescriptor) {
            String strM91973b2 = DescriptorUtilsKt.m92881w(descriptor).getName().m91973b();
            strM91973b2.getClass();
            return JvmAbi.m90325e(strM91973b2);
        }
        String strM91973b3 = descriptor.getName().m91973b();
        strM91973b3.getClass();
        return strM91973b3;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final JvmPropertySignature m88923f(@NotNull PropertyDescriptor possiblyOverriddenProperty) {
        possiblyOverriddenProperty.getClass();
        PropertyDescriptor propertyDescriptorMo89336a = ((PropertyDescriptor) DescriptorUtils.m92649L(possiblyOverriddenProperty)).mo89336a();
        propertyDescriptorMo89336a.getClass();
        if (propertyDescriptorMo89336a instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) propertyDescriptorMo89336a;
            ProtoBuf.Property propertyM93314Z0 = deserializedPropertyDescriptor.mo93177G();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f66084d;
            generatedExtension.getClass();
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m91786a(propertyM93314Z0, generatedExtension);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature.KotlinProperty(propertyDescriptorMo89336a, propertyM93314Z0, jvmPropertySignature, deserializedPropertyDescriptor.mo93178W(), deserializedPropertyDescriptor.mo93183w());
            }
        } else if (propertyDescriptorMo89336a instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) propertyDescriptorMo89336a;
            SourceElement source = javaPropertyDescriptor.getSource();
            JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
            JavaElement javaElementMo89856c = javaSourceElement != null ? javaSourceElement.mo89856c() : null;
            if (javaElementMo89856c instanceof ReflectJavaField) {
                return new JvmPropertySignature.JavaField(((ReflectJavaField) javaElementMo89856c).mo89936J());
            }
            if (!(javaElementMo89856c instanceof ReflectJavaMethod)) {
                xqd0.m212728a("Incorrect resolution sequence for Java field ", propertyDescriptorMo89336a, " (source = ", javaElementMo89856c);
                return null;
            }
            Method methodMo89936J = ((ReflectJavaMethod) javaElementMo89856c).mo89936J();
            PropertySetterDescriptor setter = javaPropertyDescriptor.getSetter();
            SourceElement source2 = setter != null ? setter.getSource() : null;
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElementMo89856c2 = javaSourceElement2 != null ? javaSourceElement2.mo89856c() : null;
            ReflectJavaMethod reflectJavaMethod = javaElementMo89856c2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElementMo89856c2 : null;
            return new JvmPropertySignature.JavaMethodProperty(methodMo89936J, reflectJavaMethod != null ? reflectJavaMethod.mo89936J() : null);
        }
        PropertyGetterDescriptor getter = propertyDescriptorMo89336a.getGetter();
        getter.getClass();
        JvmFunctionSignature.KotlinFunction kotlinFunctionM88921d = m88921d(getter);
        PropertySetterDescriptor setter2 = propertyDescriptorMo89336a.getSetter();
        return new JvmPropertySignature.MappedKotlinProperty(kotlinFunctionM88921d, setter2 != null ? m88921d(setter2) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JvmFunctionSignature m88924g(@NotNull FunctionDescriptor possiblySubstitutedFunction) {
        Method methodMo89936J;
        JvmMemberSignature.Method methodM91917b;
        JvmMemberSignature.Method methodM91919e;
        possiblySubstitutedFunction.getClass();
        FunctionDescriptor functionDescriptorMo89336a = ((FunctionDescriptor) DescriptorUtils.m92649L(possiblySubstitutedFunction)).mo89336a();
        functionDescriptorMo89336a.getClass();
        if (!(functionDescriptorMo89336a instanceof DeserializedCallableMemberDescriptor)) {
            if (functionDescriptorMo89336a instanceof JavaMethodDescriptor) {
                SourceElement source = ((JavaMethodDescriptor) functionDescriptorMo89336a).getSource();
                JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
                JavaElement javaElementMo89856c = javaSourceElement != null ? javaSourceElement.mo89856c() : null;
                ReflectJavaMethod reflectJavaMethod = javaElementMo89856c instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElementMo89856c : null;
                if (reflectJavaMethod != null && (methodMo89936J = reflectJavaMethod.mo89936J()) != null) {
                    return new JvmFunctionSignature.JavaMethod(methodMo89936J);
                }
                azq.m101080a("Incorrect resolution sequence for Java method ", functionDescriptorMo89336a);
                return null;
            }
            if (!(functionDescriptorMo89336a instanceof JavaClassConstructorDescriptor)) {
                if (m88919b(functionDescriptorMo89336a)) {
                    return m88921d(functionDescriptorMo89336a);
                }
                StringBuilder sb = new StringBuilder("Unknown origin of ");
                sb.append(functionDescriptorMo89336a);
                Class<?> cls = functionDescriptorMo89336a.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
            SourceElement source2 = ((JavaClassConstructorDescriptor) functionDescriptorMo89336a).getSource();
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElementMo89856c2 = javaSourceElement2 != null ? javaSourceElement2.mo89856c() : null;
            if (javaElementMo89856c2 instanceof ReflectJavaConstructor) {
                return new JvmFunctionSignature.JavaConstructor(((ReflectJavaConstructor) javaElementMo89856c2).mo89936J());
            }
            if (javaElementMo89856c2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) javaElementMo89856c2;
                if (reflectJavaClass.mo89925l()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.getElement());
                }
            }
            xqd0.m212728a("Incorrect resolution sequence for Java constructor ", functionDescriptorMo89336a, " (", javaElementMo89856c2);
            return null;
        }
        DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) functionDescriptorMo89336a;
        MessageLite messageLiteMo93177G = deserializedMemberDescriptor.mo93177G();
        if ((messageLiteMo93177G instanceof ProtoBuf.Function) && (methodM91919e = JvmProtoBufUtil.INSTANCE.m91919e((ProtoBuf.Function) messageLiteMo93177G, deserializedMemberDescriptor.mo93178W(), deserializedMemberDescriptor.mo93183w())) != null) {
            return new JvmFunctionSignature.KotlinFunction(methodM91919e);
        }
        if (!(messageLiteMo93177G instanceof ProtoBuf.Constructor) || (methodM91917b = JvmProtoBufUtil.INSTANCE.m91917b((ProtoBuf.Constructor) messageLiteMo93177G, deserializedMemberDescriptor.mo93178W(), deserializedMemberDescriptor.mo93183w())) == null) {
            return m88921d(functionDescriptorMo89336a);
        }
        DeclarationDescriptor declarationDescriptorMo89190b = possiblySubstitutedFunction.mo89190b();
        declarationDescriptorMo89190b.getClass();
        if (InlineClassesUtilsKt.m92678b(declarationDescriptorMo89190b)) {
            return new JvmFunctionSignature.KotlinFunction(methodM91917b);
        }
        DeclarationDescriptor declarationDescriptorMo89190b2 = possiblySubstitutedFunction.mo89190b();
        declarationDescriptorMo89190b2.getClass();
        if (!InlineClassesUtilsKt.m92680d(declarationDescriptorMo89190b2)) {
            return new JvmFunctionSignature.KotlinConstructor(methodM91917b);
        }
        ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) possiblySubstitutedFunction;
        if (constructorDescriptor.mo89354i0()) {
            if (!Intrinsics.m88377d(methodM91917b.m91907e(), "constructor-impl") || !C15493d.m94380w(methodM91917b.m91906d(), ")V", false, 2, null)) {
                t560.m189376a("Invalid signature: ", methodM91917b);
                return null;
            }
        } else {
            if (!Intrinsics.m88377d(methodM91917b.m91907e(), "constructor-impl")) {
                t560.m189376a("Invalid signature: ", methodM91917b);
                return null;
            }
            ClassDescriptor classDescriptorMo89353F = constructorDescriptor.mo89353F();
            classDescriptorMo89353F.getClass();
            String strM89019u = ValueClassAwareCallerKt.m89019u(classDescriptorMo89353F);
            if (C15493d.m94380w(methodM91917b.m91906d(), ")V", false, 2, null)) {
                methodM91917b = JvmMemberSignature.Method.m91904c(methodM91917b, null, StringsKt.m94349y0(methodM91917b.m91906d(), p7f.GPS_MEASUREMENT_INTERRUPTED) + strM89019u, 1, null);
            } else if (!C15493d.m94380w(methodM91917b.m91906d(), strM89019u, false, 2, null)) {
                t560.m189376a("Invalid signature: ", methodM91917b);
                return null;
            }
        }
        return new JvmFunctionSignature.KotlinFunction(methodM91917b);
    }
}
