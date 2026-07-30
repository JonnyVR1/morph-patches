package kotlin.reflect.jvm.internal.impl.p124km.jvm.internal;

import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.p124km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p124km.KmClass;
import kotlin.reflect.jvm.internal.impl.p124km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p124km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.p124km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p124km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p124km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.p124km.KmType;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.p124km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.p124km.internal.ReadContext;
import kotlin.reflect.jvm.internal.impl.p124km.internal.ReadUtilsKt;
import kotlin.reflect.jvm.internal.impl.p124km.internal.ReadersKt;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmEnumEntryExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmTypeAliasExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmTypeExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmTypeParameterExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.KmValueParameterExtension;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.p124km.jvm.JvmMemberSignatureKt;
import kotlin.reflect.jvm.internal.impl.p124km.jvm.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmMetadataExtensions implements MetadataExtensions {
    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @Nullable
    /* JADX INFO: renamed from: a */
    public KmTypeAliasExtension mo90154a() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @Nullable
    /* JADX INFO: renamed from: b */
    public KmEnumEntryExtension mo90155b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: c */
    public void mo90156c(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter typeParameter, @NotNull ReadContext readContext) {
        kmTypeParameter.getClass();
        typeParameter.getClass();
        readContext.getClass();
        JvmTypeParameterExtension jvmTypeParameterExtensionM90193f = JvmExtensionNodesKt.m90193f(kmTypeParameter);
        for (ProtoBuf.Annotation annotation : (List) typeParameter.getExtension(JvmProtoBuf.f66088h)) {
            List<KmAnnotation> listM90204a = jvmTypeParameterExtensionM90193f.m90204a();
            annotation.getClass();
            listM90204a.add(ReadUtilsKt.m90123b(annotation, readContext.m90117e()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: d */
    public KmClassExtension mo90157d() {
        return new JvmClassExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: e */
    public KmConstructorExtension mo90158e() {
        return new JvmConstructorExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: f */
    public void mo90159f(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property property, @NotNull ReadContext readContext) {
        kmProperty.getClass();
        property.getClass();
        readContext.getClass();
        JvmPropertyExtension jvmPropertyExtensionM90191d = JvmExtensionNodesKt.m90191d(kmProperty);
        List<ProtoBuf.Annotation> annotationList = property.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM90041a = kmProperty.m90041a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM90041a.add(ReadUtilsKt.m90123b(annotation, readContext.m90117e()));
        }
        List<ProtoBuf.Annotation> getterAnnotationList = property.getGetterAnnotationList();
        getterAnnotationList.getClass();
        List<KmAnnotation> listM90058a = kmProperty.m90048h().m90058a();
        for (ProtoBuf.Annotation annotation2 : getterAnnotationList) {
            annotation2.getClass();
            listM90058a.add(ReadUtilsKt.m90123b(annotation2, readContext.m90117e()));
        }
        KmPropertyAccessorAttributes kmPropertyAccessorAttributesM90049i = kmProperty.m90049i();
        if (kmPropertyAccessorAttributesM90049i != null) {
            List<ProtoBuf.Annotation> setterAnnotationList = property.getSetterAnnotationList();
            setterAnnotationList.getClass();
            List<KmAnnotation> listM90058a2 = kmPropertyAccessorAttributesM90049i.m90058a();
            for (ProtoBuf.Annotation annotation3 : setterAnnotationList) {
                annotation3.getClass();
                listM90058a2.add(ReadUtilsKt.m90123b(annotation3, readContext.m90117e()));
            }
        }
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList = property.getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList.getClass();
        List<KmAnnotation> listM90045e = kmProperty.m90045e();
        for (ProtoBuf.Annotation annotation4 : extensionReceiverAnnotationList) {
            annotation4.getClass();
            listM90045e.add(ReadUtilsKt.m90123b(annotation4, readContext.m90117e()));
        }
        List<ProtoBuf.Annotation> backingFieldAnnotationList = property.getBackingFieldAnnotationList();
        backingFieldAnnotationList.getClass();
        List<KmAnnotation> listM90042b = kmProperty.m90042b();
        for (ProtoBuf.Annotation annotation5 : backingFieldAnnotationList) {
            annotation5.getClass();
            listM90042b.add(ReadUtilsKt.m90123b(annotation5, readContext.m90117e()));
        }
        List<ProtoBuf.Annotation> delegateFieldAnnotationList = property.getDelegateFieldAnnotationList();
        delegateFieldAnnotationList.getClass();
        List<KmAnnotation> listM90044d = kmProperty.m90044d();
        for (ProtoBuf.Annotation annotation6 : delegateFieldAnnotationList) {
            annotation6.getClass();
            listM90044d.add(ReadUtilsKt.m90123b(annotation6, readContext.m90117e()));
        }
        JvmMemberSignature.Field fieldM91909d = JvmProtoBufUtil.m91909d(JvmProtoBufUtil.INSTANCE, property, readContext.m90117e(), readContext.m90119g(), false, 8, null);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f66084d;
        generatedExtension.getClass();
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m91786a(property, generatedExtension);
        JvmProtoBuf.JvmMethodSignature getter = (jvmPropertySignature == null || !jvmPropertySignature.hasGetter()) ? null : jvmPropertySignature.getGetter();
        JvmProtoBuf.JvmMethodSignature setter = (jvmPropertySignature == null || !jvmPropertySignature.hasSetter()) ? null : jvmPropertySignature.getSetter();
        Object extension = property.getExtension(JvmProtoBuf.f66085e);
        extension.getClass();
        jvmPropertyExtensionM90191d.m90198c(((Number) extension).intValue());
        jvmPropertyExtensionM90191d.m90196a(fieldM91909d != null ? JvmMemberSignatureKt.m90177a(fieldM91909d) : null);
        jvmPropertyExtensionM90191d.m90197b(getter != null ? new JvmMethodSignature(readContext.m90114b(getter.getName()), readContext.m90114b(getter.getDesc())) : null);
        jvmPropertyExtensionM90191d.m90199d(setter != null ? new JvmMethodSignature(readContext.m90114b(setter.getName()), readContext.m90114b(setter.getDesc())) : null);
        JvmProtoBuf.JvmMethodSignature syntheticMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasSyntheticMethod()) ? null : jvmPropertySignature.getSyntheticMethod();
        jvmPropertyExtensionM90191d.m90200e(syntheticMethod != null ? new JvmMethodSignature(readContext.m90114b(syntheticMethod.getName()), readContext.m90114b(syntheticMethod.getDesc())) : null);
        JvmProtoBuf.JvmMethodSignature delegateMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasDelegateMethod()) ? null : jvmPropertySignature.getDelegateMethod();
        jvmPropertyExtensionM90191d.m90201f(delegateMethod != null ? new JvmMethodSignature(readContext.m90114b(delegateMethod.getName()), readContext.m90114b(delegateMethod.getDesc())) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: g */
    public KmTypeExtension mo90160g() {
        return new JvmTypeExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: h */
    public KmTypeParameterExtension mo90161h() {
        return new JvmTypeParameterExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @Nullable
    /* JADX INFO: renamed from: i */
    public KmValueParameterExtension mo90162i() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: j */
    public void mo90163j(@NotNull KmTypeAlias kmTypeAlias, @NotNull ProtoBuf.TypeAlias typeAlias, @NotNull ReadContext readContext) {
        kmTypeAlias.getClass();
        typeAlias.getClass();
        readContext.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: k */
    public void mo90164k(@NotNull KmEnumEntry kmEnumEntry, @NotNull ProtoBuf.EnumEntry enumEntry, @NotNull ReadContext readContext) {
        kmEnumEntry.getClass();
        enumEntry.getClass();
        readContext.getClass();
        for (ProtoBuf.Annotation annotation : enumEntry.getAnnotationList()) {
            List<KmAnnotation> listM90028a = kmEnumEntry.m90028a();
            annotation.getClass();
            listM90028a.add(ReadUtilsKt.m90123b(annotation, readContext.m90117e()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: l */
    public void mo90165l(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor constructor, @NotNull ReadContext readContext) {
        kmConstructor.getClass();
        constructor.getClass();
        readContext.getClass();
        JvmConstructorExtension jvmConstructorExtensionM90189b = JvmExtensionNodesKt.m90189b(kmConstructor);
        List<ProtoBuf.Annotation> annotationList = constructor.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM90012a = kmConstructor.m90012a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM90012a.add(ReadUtilsKt.m90123b(annotation, readContext.m90117e()));
        }
        JvmMemberSignature.Method methodM91917b = JvmProtoBufUtil.INSTANCE.m91917b(constructor, readContext.m90117e(), readContext.m90119g());
        jvmConstructorExtensionM90189b.m90187a(methodM91917b != null ? JvmMemberSignatureKt.m90178b(methodM91917b) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: m */
    public KmPropertyExtension mo90166m() {
        return new JvmPropertyExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: n */
    public void mo90167n(@NotNull KmType kmType, @NotNull ProtoBuf.Type type, @NotNull ReadContext readContext) {
        kmType.getClass();
        type.getClass();
        readContext.getClass();
        JvmTypeExtension jvmTypeExtensionM90192e = JvmExtensionNodesKt.m90192e(kmType);
        Object extension = type.getExtension(JvmProtoBuf.f66087g);
        extension.getClass();
        jvmTypeExtensionM90192e.m90203b(((Boolean) extension).booleanValue());
        for (ProtoBuf.Annotation annotation : (List) type.getExtension(JvmProtoBuf.f66086f)) {
            List<KmAnnotation> listM90202a = jvmTypeExtensionM90192e.m90202a();
            annotation.getClass();
            listM90202a.add(ReadUtilsKt.m90123b(annotation, readContext.m90117e()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: o */
    public void mo90168o(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class r5, @NotNull ReadContext readContext) {
        String strM90114b;
        kmClass.getClass();
        r5.getClass();
        readContext.getClass();
        JvmClassExtension jvmClassExtensionM90188a = JvmExtensionNodesKt.m90188a(kmClass);
        List<ProtoBuf.Annotation> annotationList = r5.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM89993d = kmClass.m89993d();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM89993d.add(ReadUtilsKt.m90123b(annotation, readContext.m90117e()));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension = JvmProtoBuf.f66091k;
        generatedExtension.getClass();
        Integer num = (Integer) ProtoBufUtilKt.m91786a(r5, generatedExtension);
        if (num != null) {
            jvmClassExtensionM90188a.m90183c(readContext.m90114b(num.intValue()));
        }
        for (ProtoBuf.Property property : (List) r5.getExtension(JvmProtoBuf.f66090j)) {
            List<KmProperty> listM90182b = jvmClassExtensionM90188a.m90182b();
            property.getClass();
            listM90182b.add(ReadersKt.m90141q(property, readContext));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension2 = JvmProtoBuf.f66089i;
        generatedExtension2.getClass();
        Integer num2 = (Integer) ProtoBufUtilKt.m91786a(r5, generatedExtension2);
        if (num2 == null || (strM90114b = readContext.m90114b(num2.intValue())) == null) {
            strM90114b = BLiveTraceServerLocation.main;
        }
        jvmClassExtensionM90188a.m90185e(strM90114b);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension3 = JvmProtoBuf.f66092l;
        generatedExtension3.getClass();
        Integer num3 = (Integer) ProtoBufUtilKt.m91786a(r5, generatedExtension3);
        if (num3 != null) {
            jvmClassExtensionM90188a.m90184d(num3.intValue());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: p */
    public void mo90169p(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter valueParameter, @NotNull ReadContext readContext) {
        kmValueParameter.getClass();
        valueParameter.getClass();
        readContext.getClass();
        List<ProtoBuf.Annotation> annotationList = valueParameter.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM90081a = kmValueParameter.m90081a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM90081a.add(ReadUtilsKt.m90123b(annotation, readContext.m90117e()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: q */
    public KmFunctionExtension mo90170q() {
        return new JvmFunctionExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: r */
    public void mo90171r(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function function, @NotNull ReadContext readContext) {
        kmFunction.getClass();
        function.getClass();
        readContext.getClass();
        JvmFunctionExtension jvmFunctionExtensionM90190c = JvmExtensionNodesKt.m90190c(kmFunction);
        List<ProtoBuf.Annotation> annotationList = function.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM90029a = kmFunction.m90029a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM90029a.add(ReadUtilsKt.m90123b(annotation, readContext.m90117e()));
        }
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList = function.getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList.getClass();
        List<KmAnnotation> listM90031c = kmFunction.m90031c();
        for (ProtoBuf.Annotation annotation2 : extensionReceiverAnnotationList) {
            annotation2.getClass();
            listM90031c.add(ReadUtilsKt.m90123b(annotation2, readContext.m90117e()));
        }
        JvmMemberSignature.Method methodM91919e = JvmProtoBufUtil.INSTANCE.m91919e(function, readContext.m90117e(), readContext.m90119g());
        jvmFunctionExtensionM90190c.m90195b(methodM91919e != null ? JvmMemberSignatureKt.m90178b(methodM91919e) : null);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> generatedExtension = JvmProtoBuf.f66083c;
        generatedExtension.getClass();
        Integer num = (Integer) ProtoBufUtilKt.m91786a(function, generatedExtension);
        if (num != null) {
            jvmFunctionExtensionM90190c.m90194a(readContext.m90114b(num.intValue()));
        }
    }
}
