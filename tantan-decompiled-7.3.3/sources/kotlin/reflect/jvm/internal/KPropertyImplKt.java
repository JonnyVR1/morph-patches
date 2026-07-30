package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass;
import kotlin.reflect.jvm.internal.calls.ThrowingCaller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.awq;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "isGetter", "Lkotlin/reflect/jvm/internal/calls/Caller;", "b", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Z", "", "f", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class KPropertyImplKt {
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX INFO: renamed from: b */
    public static final Caller<?> m88849b(KPropertyImpl.Accessor<?, ?> accessor, boolean z) {
        JvmFunctionSignature.KotlinFunction kotlinFunctionM88592c;
        Method methodM88584c;
        Caller boundInstance;
        JvmProtoBuf.JvmMethodSignature setter;
        Caller boundStatic;
        Method methodM89011m;
        if (KDeclarationContainerImpl.INSTANCE.m88728a().matches(accessor.mo88499g().getCom.tencent.open.SocialOperation.GAME_SIGNATURE java.lang.String())) {
            return ThrowingCaller.INSTANCE;
        }
        JvmPropertySignature jvmPropertySignatureM88923f = RuntimeTypeMapper.INSTANCE.m88923f(accessor.mo88499g().mo88837Z());
        if (jvmPropertySignatureM88923f instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureM88923f;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignatureM88589f = kotlinProperty.getCom.tencent.open.SocialOperation.GAME_SIGNATURE java.lang.String();
            if (z) {
                if (jvmPropertySignatureM88589f.hasGetter()) {
                    setter = jvmPropertySignatureM88589f.getGetter();
                } else {
                    setter = null;
                }
            } else if (jvmPropertySignatureM88589f.hasSetter()) {
                setter = jvmPropertySignatureM88589f.getSetter();
            } else {
                setter = null;
            }
            Method methodM88726y = setter != null ? accessor.mo88499g().getContainer().m88726y(kotlinProperty.getNameResolver().getString(setter.getName()), kotlinProperty.getNameResolver().getString(setter.getDesc())) : null;
            if (methodM88726y != null) {
                if (!Modifier.isStatic(methodM88726y.getModifiers())) {
                    boundStatic = accessor.mo88630X() ? new CallerImpl.Method.BoundInstance(methodM88726y, m88853f(accessor)) : new CallerImpl.Method.Instance(methodM88726y);
                } else if (m88851d(accessor)) {
                    boundStatic = accessor.mo88630X() ? new CallerImpl.Method.BoundJvmStaticInObject(methodM88726y) : new CallerImpl.Method.JvmStaticInObject(methodM88726y);
                } else {
                    boundStatic = accessor.mo88630X() ? new CallerImpl.Method.BoundStatic(methodM88726y, false, m88853f(accessor)) : new CallerImpl.Method.Static(methodM88726y);
                }
                boundInstance = boundStatic;
            } else if (InlineClassesUtilsKt.m92681e(accessor.mo88499g().mo88837Z()) && Intrinsics.m88377d(accessor.mo88499g().mo88837Z().getVisibility(), DescriptorVisibilities.f64699d)) {
                Class<?> clsM89017s = ValueClassAwareCallerKt.m89017s(accessor.mo88499g().mo88837Z().mo89190b());
                if (clsM89017s == null || (methodM89011m = ValueClassAwareCallerKt.m89011m(clsM89017s, accessor.mo88499g().mo88837Z())) == null) {
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + accessor.mo88499g() + " should have a field");
                }
                boundInstance = accessor.mo88630X() ? new InternalUnderlyingValOfInlineClass.Bound(methodM89011m, m88853f(accessor)) : new InternalUnderlyingValOfInlineClass.Unbound(methodM89011m);
            } else {
                Field fieldM88835i0 = accessor.mo88499g().m88835i0();
                if (fieldM88835i0 == null) {
                    awq.m100706a("No accessors or field is found for property ", accessor.mo88499g());
                    return null;
                }
                boundInstance = m88850c(accessor, z, fieldM88835i0);
            }
        } else if (jvmPropertySignatureM88923f instanceof JvmPropertySignature.JavaField) {
            boundInstance = m88850c(accessor, z, ((JvmPropertySignature.JavaField) jvmPropertySignatureM88923f).getField());
        } else {
            if (!(jvmPropertySignatureM88923f instanceof JvmPropertySignature.JavaMethodProperty)) {
                if (!(jvmPropertySignatureM88923f instanceof JvmPropertySignature.MappedKotlinProperty)) {
                    nbr.m162172a();
                    return null;
                }
                if (z) {
                    kotlinFunctionM88592c = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureM88923f).getGetterSignature();
                } else {
                    kotlinFunctionM88592c = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureM88923f).getSetterSignature();
                    if (kotlinFunctionM88592c == null) {
                        awq.m100706a("No setter found for property ", accessor.mo88499g());
                        return null;
                    }
                }
                Method methodM88726y2 = accessor.mo88499g().getContainer().m88726y(kotlinFunctionM88592c.m88580c(), kotlinFunctionM88592c.m88579b());
                if (methodM88726y2 != null) {
                    Modifier.isStatic(methodM88726y2.getModifiers());
                    return accessor.mo88630X() ? new CallerImpl.Method.BoundInstance(methodM88726y2, m88853f(accessor)) : new CallerImpl.Method.Instance(methodM88726y2);
                }
                awq.m100706a("No accessor found for property ", accessor.mo88499g());
                return null;
            }
            if (z) {
                methodM88584c = ((JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureM88923f).getGetterMethod();
            } else {
                JvmPropertySignature.JavaMethodProperty javaMethodProperty = (JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureM88923f;
                methodM88584c = javaMethodProperty.getSetterMethod();
                if (methodM88584c == null) {
                    awq.m100706a("No source found for setter of Java method property: ", javaMethodProperty.getGetterMethod());
                    return null;
                }
            }
            boundInstance = accessor.mo88630X() ? new CallerImpl.Method.BoundInstance(methodM88584c, m88853f(accessor)) : new CallerImpl.Method.Instance(methodM88584c);
        }
        return ValueClassAwareCallerKt.m89008j(boundInstance, accessor.mo88837Z(), false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final CallerImpl<Field> m88850c(KPropertyImpl.Accessor<?, ?> accessor, boolean z, Field field) {
        if (m88854g(accessor.mo88499g().mo88837Z()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                return accessor.mo88630X() ? new CallerImpl.FieldGetter.BoundInstance(field, m88853f(accessor)) : new CallerImpl.FieldGetter.Instance(field);
            }
            return accessor.mo88630X() ? new CallerImpl.FieldSetter.BoundInstance(field, m88852e(accessor), m88853f(accessor)) : new CallerImpl.FieldSetter.Instance(field, m88852e(accessor));
        }
        if (!m88851d(accessor)) {
            return z ? new CallerImpl.FieldGetter.Static(field) : new CallerImpl.FieldSetter.Static(field, m88852e(accessor));
        }
        if (z) {
            return accessor.mo88630X() ? new CallerImpl.FieldGetter.BoundJvmStaticInObject(field) : new CallerImpl.FieldGetter.JvmStaticInObject(field);
        }
        return accessor.mo88630X() ? new CallerImpl.FieldSetter.BoundJvmStaticInObject(field, m88852e(accessor)) : new CallerImpl.FieldSetter.JvmStaticInObject(field, m88852e(accessor));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m88851d(KPropertyImpl.Accessor<?, ?> accessor) {
        return accessor.mo88499g().mo88837Z().getAnnotations().mo89530d0(UtilKt.m88938j());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m88852e(KPropertyImpl.Accessor<?, ?> accessor) {
        return !TypeUtils.m93692l(accessor.mo88499g().mo88837Z().getType());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Object m88853f(@NotNull KPropertyImpl.Accessor<?, ?> accessor) {
        accessor.getClass();
        return accessor.mo88499g().m88832e0();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m88854g(PropertyDescriptor propertyDescriptor) {
        DeclarationDescriptor declarationDescriptorMo89190b = propertyDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        if (!DescriptorUtils.m92674x(declarationDescriptorMo89190b)) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo89190b2 = declarationDescriptorMo89190b.mo89190b();
        if (DescriptorUtils.m92640C(declarationDescriptorMo89190b2) || DescriptorUtils.m92670t(declarationDescriptorMo89190b2)) {
            return (propertyDescriptor instanceof DeserializedPropertyDescriptor) && JvmProtoBufUtil.m91910f(((DeserializedPropertyDescriptor) propertyDescriptor).mo93177G());
        }
        return true;
    }
}
