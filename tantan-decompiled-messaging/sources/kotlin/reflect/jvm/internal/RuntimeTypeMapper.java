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
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;
import p149l.nx50;
import p149l.uid0;
import p149l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010$\u001a\u0004\u0018\u00010!*\u0006\u0012\u0002\b\u00030\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "f", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "c", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "descriptor", "", "b", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Z", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class RuntimeTypeMapper {

    @NotNull
    public static final RuntimeTypeMapper INSTANCE = new RuntimeTypeMapper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ClassId JAVA_LANG_VOID = ClassId.Companion.m91045c(new FqName(com.meituan.robust.Constants.LANG_VOID));

    private RuntimeTypeMapper() {
    }

    /* JADX INFO: renamed from: a */
    public final PrimitiveType m88027a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m88028b(FunctionDescriptor descriptor) {
        if (DescriptorFactory.m91744p(descriptor) || DescriptorFactory.m91745q(descriptor)) {
            return true;
        }
        return Intrinsics.m87488d(descriptor.getName(), CloneableClassScope.Companion.m88339a()) && descriptor.mo88448g().isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ClassId m88029c(@NotNull Class<?> klass) {
        ClassId classIdM88355m;
        klass.getClass();
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            componentType.getClass();
            PrimitiveType primitiveTypeM88027a = m88027a(componentType);
            return primitiveTypeM88027a != null ? new ClassId(StandardNames.f63799A, primitiveTypeM88027a.getArrayTypeName()) : ClassId.Companion.m91045c(StandardNames.FqNames.f63896h.m91068m());
        }
        if (Intrinsics.m87488d(klass, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        PrimitiveType primitiveTypeM88027a2 = m88027a(klass);
        if (primitiveTypeM88027a2 != null) {
            return new ClassId(StandardNames.f63799A, primitiveTypeM88027a2.getTypeName());
        }
        ClassId classIdM88991e = ReflectClassUtilKt.m88991e(klass);
        return (classIdM88991e.m91041i() || (classIdM88355m = JavaToKotlinClassMap.INSTANCE.m88355m(classIdM88991e.m91034a())) == null) ? classIdM88991e : classIdM88355m;
    }

    /* JADX INFO: renamed from: d */
    public final JvmFunctionSignature.KotlinFunction m88030d(FunctionDescriptor descriptor) {
        return new JvmFunctionSignature.KotlinFunction(new JvmMemberSignature.Method(m88031e(descriptor), MethodSignatureMappingKt.m90378c(descriptor, false, false, 1, null)));
    }

    /* JADX INFO: renamed from: e */
    public final String m88031e(CallableMemberDescriptor descriptor) {
        String strM89467e = SpecialBuiltinMembers.m89467e(descriptor);
        if (strM89467e != null) {
            return strM89467e;
        }
        if (descriptor instanceof PropertyGetterDescriptor) {
            String strM91082b = DescriptorUtilsKt.m91990w(descriptor).getName().m91082b();
            strM91082b.getClass();
            return JvmAbi.m89431b(strM91082b);
        }
        if (descriptor instanceof PropertySetterDescriptor) {
            String strM91082b2 = DescriptorUtilsKt.m91990w(descriptor).getName().m91082b();
            strM91082b2.getClass();
            return JvmAbi.m89434e(strM91082b2);
        }
        String strM91082b3 = descriptor.getName().m91082b();
        strM91082b3.getClass();
        return strM91082b3;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final JvmPropertySignature m88032f(@NotNull PropertyDescriptor possiblyOverriddenProperty) {
        possiblyOverriddenProperty.getClass();
        PropertyDescriptor propertyDescriptorMo88445a = ((PropertyDescriptor) DescriptorUtils.m91758L(possiblyOverriddenProperty)).mo88445a();
        propertyDescriptorMo88445a.getClass();
        if (propertyDescriptorMo88445a instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) propertyDescriptorMo88445a;
            ProtoBuf.Property propertyM92423Z0 = deserializedPropertyDescriptor.mo92286G();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f65410d;
            generatedExtension.getClass();
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m90895a(propertyM92423Z0, generatedExtension);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature.KotlinProperty(propertyDescriptorMo88445a, propertyM92423Z0, jvmPropertySignature, deserializedPropertyDescriptor.mo92287W(), deserializedPropertyDescriptor.mo92292w());
            }
        } else if (propertyDescriptorMo88445a instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) propertyDescriptorMo88445a;
            SourceElement source = javaPropertyDescriptor.getSource();
            JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
            JavaElement javaElementMo88965c = javaSourceElement != null ? javaSourceElement.mo88965c() : null;
            if (javaElementMo88965c instanceof ReflectJavaField) {
                return new JvmPropertySignature.JavaField(((ReflectJavaField) javaElementMo88965c).mo89045J());
            }
            if (!(javaElementMo88965c instanceof ReflectJavaMethod)) {
                uid0.m193868a("Incorrect resolution sequence for Java field ", propertyDescriptorMo88445a, " (source = ", javaElementMo88965c);
                return null;
            }
            Method methodMo89045J = ((ReflectJavaMethod) javaElementMo88965c).mo89045J();
            PropertySetterDescriptor setter = javaPropertyDescriptor.getSetter();
            SourceElement source2 = setter != null ? setter.getSource() : null;
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElementMo88965c2 = javaSourceElement2 != null ? javaSourceElement2.mo88965c() : null;
            ReflectJavaMethod reflectJavaMethod = javaElementMo88965c2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElementMo88965c2 : null;
            return new JvmPropertySignature.JavaMethodProperty(methodMo89045J, reflectJavaMethod != null ? reflectJavaMethod.mo89045J() : null);
        }
        PropertyGetterDescriptor getter = propertyDescriptorMo88445a.getGetter();
        getter.getClass();
        JvmFunctionSignature.KotlinFunction kotlinFunctionM88030d = m88030d(getter);
        PropertySetterDescriptor setter2 = propertyDescriptorMo88445a.getSetter();
        return new JvmPropertySignature.MappedKotlinProperty(kotlinFunctionM88030d, setter2 != null ? m88030d(setter2) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JvmFunctionSignature m88033g(@NotNull FunctionDescriptor possiblySubstitutedFunction) {
        Method methodMo89045J;
        JvmMemberSignature.Method methodM91026b;
        JvmMemberSignature.Method methodM91028e;
        possiblySubstitutedFunction.getClass();
        FunctionDescriptor functionDescriptorMo88445a = ((FunctionDescriptor) DescriptorUtils.m91758L(possiblySubstitutedFunction)).mo88445a();
        functionDescriptorMo88445a.getClass();
        if (!(functionDescriptorMo88445a instanceof DeserializedCallableMemberDescriptor)) {
            if (functionDescriptorMo88445a instanceof JavaMethodDescriptor) {
                SourceElement source = ((JavaMethodDescriptor) functionDescriptorMo88445a).getSource();
                JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
                JavaElement javaElementMo88965c = javaSourceElement != null ? javaSourceElement.mo88965c() : null;
                ReflectJavaMethod reflectJavaMethod = javaElementMo88965c instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElementMo88965c : null;
                if (reflectJavaMethod != null && (methodMo89045J = reflectJavaMethod.mo89045J()) != null) {
                    return new JvmFunctionSignature.JavaMethod(methodMo89045J);
                }
                zwq.m220685a("Incorrect resolution sequence for Java method ", functionDescriptorMo88445a);
                return null;
            }
            if (!(functionDescriptorMo88445a instanceof JavaClassConstructorDescriptor)) {
                if (m88028b(functionDescriptorMo88445a)) {
                    return m88030d(functionDescriptorMo88445a);
                }
                StringBuilder sb = new StringBuilder("Unknown origin of ");
                sb.append(functionDescriptorMo88445a);
                Class<?> cls = functionDescriptorMo88445a.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
            SourceElement source2 = ((JavaClassConstructorDescriptor) functionDescriptorMo88445a).getSource();
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElementMo88965c2 = javaSourceElement2 != null ? javaSourceElement2.mo88965c() : null;
            if (javaElementMo88965c2 instanceof ReflectJavaConstructor) {
                return new JvmFunctionSignature.JavaConstructor(((ReflectJavaConstructor) javaElementMo88965c2).mo89045J());
            }
            if (javaElementMo88965c2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) javaElementMo88965c2;
                if (reflectJavaClass.mo89034l()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.getElement());
                }
            }
            uid0.m193868a("Incorrect resolution sequence for Java constructor ", functionDescriptorMo88445a, " (", javaElementMo88965c2);
            return null;
        }
        DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) functionDescriptorMo88445a;
        MessageLite messageLiteMo92286G = deserializedMemberDescriptor.mo92286G();
        if ((messageLiteMo92286G instanceof ProtoBuf.Function) && (methodM91028e = JvmProtoBufUtil.INSTANCE.m91028e((ProtoBuf.Function) messageLiteMo92286G, deserializedMemberDescriptor.mo92287W(), deserializedMemberDescriptor.mo92292w())) != null) {
            return new JvmFunctionSignature.KotlinFunction(methodM91028e);
        }
        if (!(messageLiteMo92286G instanceof ProtoBuf.Constructor) || (methodM91026b = JvmProtoBufUtil.INSTANCE.m91026b((ProtoBuf.Constructor) messageLiteMo92286G, deserializedMemberDescriptor.mo92287W(), deserializedMemberDescriptor.mo92292w())) == null) {
            return m88030d(functionDescriptorMo88445a);
        }
        DeclarationDescriptor declarationDescriptorMo88299b = possiblySubstitutedFunction.mo88299b();
        declarationDescriptorMo88299b.getClass();
        if (InlineClassesUtilsKt.m91787b(declarationDescriptorMo88299b)) {
            return new JvmFunctionSignature.KotlinFunction(methodM91026b);
        }
        DeclarationDescriptor declarationDescriptorMo88299b2 = possiblySubstitutedFunction.mo88299b();
        declarationDescriptorMo88299b2.getClass();
        if (!InlineClassesUtilsKt.m91789d(declarationDescriptorMo88299b2)) {
            return new JvmFunctionSignature.KotlinConstructor(methodM91026b);
        }
        ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) possiblySubstitutedFunction;
        if (constructorDescriptor.mo88463i0()) {
            if (!Intrinsics.m87488d(methodM91026b.m91016e(), "constructor-impl") || !C15386d.m93489w(methodM91026b.m91015d(), ")V", false, 2, null)) {
                nx50.m161932a("Invalid signature: ", methodM91026b);
                return null;
            }
        } else {
            if (!Intrinsics.m87488d(methodM91026b.m91016e(), "constructor-impl")) {
                nx50.m161932a("Invalid signature: ", methodM91026b);
                return null;
            }
            ClassDescriptor classDescriptorMo88462F = constructorDescriptor.mo88462F();
            classDescriptorMo88462F.getClass();
            String strM88128u = ValueClassAwareCallerKt.m88128u(classDescriptorMo88462F);
            if (C15386d.m93489w(methodM91026b.m91015d(), ")V", false, 2, null)) {
                methodM91026b = JvmMemberSignature.Method.m91013c(methodM91026b, null, StringsKt.m93458y0(methodM91026b.m91015d(), j6f.GPS_MEASUREMENT_INTERRUPTED) + strM88128u, 1, null);
            } else if (!C15386d.m93489w(methodM91026b.m91015d(), strM88128u, false, 2, null)) {
                nx50.m161932a("Invalid signature: ", methodM91026b);
                return null;
            }
        }
        return new JvmFunctionSignature.KotlinFunction(methodM91026b);
    }
}
