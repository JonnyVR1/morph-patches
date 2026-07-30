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
import p149l.l9r;
import p149l.ztq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "isGetter", "Lkotlin/reflect/jvm/internal/calls/Caller;", "b", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Z", "", "f", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class KPropertyImplKt {
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX INFO: renamed from: b */
    public static final Caller<?> m87958b(KPropertyImpl.Accessor<?, ?> accessor, boolean z) {
        JvmFunctionSignature.KotlinFunction kotlinFunctionM87701c;
        Method methodM87693c;
        Caller boundInstance;
        JvmProtoBuf.JvmMethodSignature setter;
        Caller boundStatic;
        Method methodM88120m;
        if (KDeclarationContainerImpl.INSTANCE.m87837a().matches(accessor.mo87608g().getCom.tencent.open.SocialOperation.GAME_SIGNATURE java.lang.String())) {
            return ThrowingCaller.INSTANCE;
        }
        JvmPropertySignature jvmPropertySignatureM88032f = RuntimeTypeMapper.INSTANCE.m88032f(accessor.mo87608g().mo87946Z());
        if (jvmPropertySignatureM88032f instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureM88032f;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignatureM87698f = kotlinProperty.getCom.tencent.open.SocialOperation.GAME_SIGNATURE java.lang.String();
            if (z) {
                if (jvmPropertySignatureM87698f.hasGetter()) {
                    setter = jvmPropertySignatureM87698f.getGetter();
                } else {
                    setter = null;
                }
            } else if (jvmPropertySignatureM87698f.hasSetter()) {
                setter = jvmPropertySignatureM87698f.getSetter();
            } else {
                setter = null;
            }
            Method methodM87835y = setter != null ? accessor.mo87608g().getContainer().m87835y(kotlinProperty.getNameResolver().getString(setter.getName()), kotlinProperty.getNameResolver().getString(setter.getDesc())) : null;
            if (methodM87835y != null) {
                if (!Modifier.isStatic(methodM87835y.getModifiers())) {
                    boundStatic = accessor.mo87739X() ? new CallerImpl.Method.BoundInstance(methodM87835y, m87962f(accessor)) : new CallerImpl.Method.Instance(methodM87835y);
                } else if (m87960d(accessor)) {
                    boundStatic = accessor.mo87739X() ? new CallerImpl.Method.BoundJvmStaticInObject(methodM87835y) : new CallerImpl.Method.JvmStaticInObject(methodM87835y);
                } else {
                    boundStatic = accessor.mo87739X() ? new CallerImpl.Method.BoundStatic(methodM87835y, false, m87962f(accessor)) : new CallerImpl.Method.Static(methodM87835y);
                }
                boundInstance = boundStatic;
            } else if (InlineClassesUtilsKt.m91790e(accessor.mo87608g().mo87946Z()) && Intrinsics.m87488d(accessor.mo87608g().mo87946Z().getVisibility(), DescriptorVisibilities.f64025d)) {
                Class<?> clsM88126s = ValueClassAwareCallerKt.m88126s(accessor.mo87608g().mo87946Z().mo88299b());
                if (clsM88126s == null || (methodM88120m = ValueClassAwareCallerKt.m88120m(clsM88126s, accessor.mo87608g().mo87946Z())) == null) {
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + accessor.mo87608g() + " should have a field");
                }
                boundInstance = accessor.mo87739X() ? new InternalUnderlyingValOfInlineClass.Bound(methodM88120m, m87962f(accessor)) : new InternalUnderlyingValOfInlineClass.Unbound(methodM88120m);
            } else {
                Field fieldM87944i0 = accessor.mo87608g().m87944i0();
                if (fieldM87944i0 == null) {
                    ztq.m220129a("No accessors or field is found for property ", accessor.mo87608g());
                    return null;
                }
                boundInstance = m87959c(accessor, z, fieldM87944i0);
            }
        } else if (jvmPropertySignatureM88032f instanceof JvmPropertySignature.JavaField) {
            boundInstance = m87959c(accessor, z, ((JvmPropertySignature.JavaField) jvmPropertySignatureM88032f).getField());
        } else {
            if (!(jvmPropertySignatureM88032f instanceof JvmPropertySignature.JavaMethodProperty)) {
                if (!(jvmPropertySignatureM88032f instanceof JvmPropertySignature.MappedKotlinProperty)) {
                    l9r.m149037a();
                    return null;
                }
                if (z) {
                    kotlinFunctionM87701c = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureM88032f).getGetterSignature();
                } else {
                    kotlinFunctionM87701c = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureM88032f).getSetterSignature();
                    if (kotlinFunctionM87701c == null) {
                        ztq.m220129a("No setter found for property ", accessor.mo87608g());
                        return null;
                    }
                }
                Method methodM87835y2 = accessor.mo87608g().getContainer().m87835y(kotlinFunctionM87701c.m87689c(), kotlinFunctionM87701c.m87688b());
                if (methodM87835y2 != null) {
                    Modifier.isStatic(methodM87835y2.getModifiers());
                    return accessor.mo87739X() ? new CallerImpl.Method.BoundInstance(methodM87835y2, m87962f(accessor)) : new CallerImpl.Method.Instance(methodM87835y2);
                }
                ztq.m220129a("No accessor found for property ", accessor.mo87608g());
                return null;
            }
            if (z) {
                methodM87693c = ((JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureM88032f).getGetterMethod();
            } else {
                JvmPropertySignature.JavaMethodProperty javaMethodProperty = (JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureM88032f;
                methodM87693c = javaMethodProperty.getSetterMethod();
                if (methodM87693c == null) {
                    ztq.m220129a("No source found for setter of Java method property: ", javaMethodProperty.getGetterMethod());
                    return null;
                }
            }
            boundInstance = accessor.mo87739X() ? new CallerImpl.Method.BoundInstance(methodM87693c, m87962f(accessor)) : new CallerImpl.Method.Instance(methodM87693c);
        }
        return ValueClassAwareCallerKt.m88117j(boundInstance, accessor.mo87946Z(), false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final CallerImpl<Field> m87959c(KPropertyImpl.Accessor<?, ?> accessor, boolean z, Field field) {
        if (m87963g(accessor.mo87608g().mo87946Z()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                return accessor.mo87739X() ? new CallerImpl.FieldGetter.BoundInstance(field, m87962f(accessor)) : new CallerImpl.FieldGetter.Instance(field);
            }
            return accessor.mo87739X() ? new CallerImpl.FieldSetter.BoundInstance(field, m87961e(accessor), m87962f(accessor)) : new CallerImpl.FieldSetter.Instance(field, m87961e(accessor));
        }
        if (!m87960d(accessor)) {
            return z ? new CallerImpl.FieldGetter.Static(field) : new CallerImpl.FieldSetter.Static(field, m87961e(accessor));
        }
        if (z) {
            return accessor.mo87739X() ? new CallerImpl.FieldGetter.BoundJvmStaticInObject(field) : new CallerImpl.FieldGetter.JvmStaticInObject(field);
        }
        return accessor.mo87739X() ? new CallerImpl.FieldSetter.BoundJvmStaticInObject(field, m87961e(accessor)) : new CallerImpl.FieldSetter.JvmStaticInObject(field, m87961e(accessor));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m87960d(KPropertyImpl.Accessor<?, ?> accessor) {
        return accessor.mo87608g().mo87946Z().getAnnotations().mo88639c0(UtilKt.m88047j());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m87961e(KPropertyImpl.Accessor<?, ?> accessor) {
        return !TypeUtils.m92801l(accessor.mo87608g().mo87946Z().getType());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Object m87962f(@NotNull KPropertyImpl.Accessor<?, ?> accessor) {
        accessor.getClass();
        return accessor.mo87608g().m87941e0();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m87963g(PropertyDescriptor propertyDescriptor) {
        DeclarationDescriptor declarationDescriptorMo88299b = propertyDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        if (!DescriptorUtils.m91783x(declarationDescriptorMo88299b)) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorMo88299b2 = declarationDescriptorMo88299b.mo88299b();
        if (DescriptorUtils.m91749C(declarationDescriptorMo88299b2) || DescriptorUtils.m91779t(declarationDescriptorMo88299b2)) {
            return (propertyDescriptor instanceof DeserializedPropertyDescriptor) && JvmProtoBufUtil.m91019f(((DeserializedPropertyDescriptor) propertyDescriptor).mo92286G());
        }
        return true;
    }
}
