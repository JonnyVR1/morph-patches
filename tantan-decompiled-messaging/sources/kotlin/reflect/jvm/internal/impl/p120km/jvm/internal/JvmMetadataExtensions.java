package kotlin.reflect.jvm.internal.impl.p120km.jvm.internal;

import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.p120km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p120km.KmClass;
import kotlin.reflect.jvm.internal.impl.p120km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p120km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.p120km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p120km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p120km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.p120km.KmType;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.p120km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.p120km.internal.ReadContext;
import kotlin.reflect.jvm.internal.impl.p120km.internal.ReadUtilsKt;
import kotlin.reflect.jvm.internal.impl.p120km.internal.ReadersKt;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmConstructorExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmEnumEntryExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmTypeAliasExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmTypeExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmTypeParameterExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.KmValueParameterExtension;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.p120km.jvm.JvmMemberSignatureKt;
import kotlin.reflect.jvm.internal.impl.p120km.jvm.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmMetadataExtensions implements MetadataExtensions {
    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @Nullable
    /* JADX INFO: renamed from: a */
    public KmTypeAliasExtension mo89263a() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @Nullable
    /* JADX INFO: renamed from: b */
    public KmEnumEntryExtension mo89264b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: c */
    public void mo89265c(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter typeParameter, @NotNull ReadContext readContext) {
        kmTypeParameter.getClass();
        typeParameter.getClass();
        readContext.getClass();
        JvmTypeParameterExtension jvmTypeParameterExtensionM89302f = JvmExtensionNodesKt.m89302f(kmTypeParameter);
        for (ProtoBuf.Annotation annotation : (List) typeParameter.getExtension(JvmProtoBuf.f65414h)) {
            List<KmAnnotation> listM89313a = jvmTypeParameterExtensionM89302f.m89313a();
            annotation.getClass();
            listM89313a.add(ReadUtilsKt.m89232b(annotation, readContext.m89226e()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: d */
    public KmClassExtension mo89266d() {
        return new JvmClassExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: e */
    public KmConstructorExtension mo89267e() {
        return new JvmConstructorExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: f */
    public void mo89268f(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property property, @NotNull ReadContext readContext) {
        kmProperty.getClass();
        property.getClass();
        readContext.getClass();
        JvmPropertyExtension jvmPropertyExtensionM89300d = JvmExtensionNodesKt.m89300d(kmProperty);
        List<ProtoBuf.Annotation> annotationList = property.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM89150a = kmProperty.m89150a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM89150a.add(ReadUtilsKt.m89232b(annotation, readContext.m89226e()));
        }
        List<ProtoBuf.Annotation> getterAnnotationList = property.getGetterAnnotationList();
        getterAnnotationList.getClass();
        List<KmAnnotation> listM89167a = kmProperty.m89157h().m89167a();
        for (ProtoBuf.Annotation annotation2 : getterAnnotationList) {
            annotation2.getClass();
            listM89167a.add(ReadUtilsKt.m89232b(annotation2, readContext.m89226e()));
        }
        KmPropertyAccessorAttributes kmPropertyAccessorAttributesM89158i = kmProperty.m89158i();
        if (kmPropertyAccessorAttributesM89158i != null) {
            List<ProtoBuf.Annotation> setterAnnotationList = property.getSetterAnnotationList();
            setterAnnotationList.getClass();
            List<KmAnnotation> listM89167a2 = kmPropertyAccessorAttributesM89158i.m89167a();
            for (ProtoBuf.Annotation annotation3 : setterAnnotationList) {
                annotation3.getClass();
                listM89167a2.add(ReadUtilsKt.m89232b(annotation3, readContext.m89226e()));
            }
        }
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList = property.getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList.getClass();
        List<KmAnnotation> listM89154e = kmProperty.m89154e();
        for (ProtoBuf.Annotation annotation4 : extensionReceiverAnnotationList) {
            annotation4.getClass();
            listM89154e.add(ReadUtilsKt.m89232b(annotation4, readContext.m89226e()));
        }
        List<ProtoBuf.Annotation> backingFieldAnnotationList = property.getBackingFieldAnnotationList();
        backingFieldAnnotationList.getClass();
        List<KmAnnotation> listM89151b = kmProperty.m89151b();
        for (ProtoBuf.Annotation annotation5 : backingFieldAnnotationList) {
            annotation5.getClass();
            listM89151b.add(ReadUtilsKt.m89232b(annotation5, readContext.m89226e()));
        }
        List<ProtoBuf.Annotation> delegateFieldAnnotationList = property.getDelegateFieldAnnotationList();
        delegateFieldAnnotationList.getClass();
        List<KmAnnotation> listM89153d = kmProperty.m89153d();
        for (ProtoBuf.Annotation annotation6 : delegateFieldAnnotationList) {
            annotation6.getClass();
            listM89153d.add(ReadUtilsKt.m89232b(annotation6, readContext.m89226e()));
        }
        JvmMemberSignature.Field fieldM91018d = JvmProtoBufUtil.m91018d(JvmProtoBufUtil.INSTANCE, property, readContext.m89226e(), readContext.m89228g(), false, 8, null);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f65410d;
        generatedExtension.getClass();
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m90895a(property, generatedExtension);
        JvmProtoBuf.JvmMethodSignature getter = (jvmPropertySignature == null || !jvmPropertySignature.hasGetter()) ? null : jvmPropertySignature.getGetter();
        JvmProtoBuf.JvmMethodSignature setter = (jvmPropertySignature == null || !jvmPropertySignature.hasSetter()) ? null : jvmPropertySignature.getSetter();
        Object extension = property.getExtension(JvmProtoBuf.f65411e);
        extension.getClass();
        jvmPropertyExtensionM89300d.m89307c(((Number) extension).intValue());
        jvmPropertyExtensionM89300d.m89305a(fieldM91018d != null ? JvmMemberSignatureKt.m89286a(fieldM91018d) : null);
        jvmPropertyExtensionM89300d.m89306b(getter != null ? new JvmMethodSignature(readContext.m89223b(getter.getName()), readContext.m89223b(getter.getDesc())) : null);
        jvmPropertyExtensionM89300d.m89308d(setter != null ? new JvmMethodSignature(readContext.m89223b(setter.getName()), readContext.m89223b(setter.getDesc())) : null);
        JvmProtoBuf.JvmMethodSignature syntheticMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasSyntheticMethod()) ? null : jvmPropertySignature.getSyntheticMethod();
        jvmPropertyExtensionM89300d.m89309e(syntheticMethod != null ? new JvmMethodSignature(readContext.m89223b(syntheticMethod.getName()), readContext.m89223b(syntheticMethod.getDesc())) : null);
        JvmProtoBuf.JvmMethodSignature delegateMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasDelegateMethod()) ? null : jvmPropertySignature.getDelegateMethod();
        jvmPropertyExtensionM89300d.m89310f(delegateMethod != null ? new JvmMethodSignature(readContext.m89223b(delegateMethod.getName()), readContext.m89223b(delegateMethod.getDesc())) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: g */
    public KmTypeExtension mo89269g() {
        return new JvmTypeExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: h */
    public KmTypeParameterExtension mo89270h() {
        return new JvmTypeParameterExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @Nullable
    /* JADX INFO: renamed from: i */
    public KmValueParameterExtension mo89271i() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: j */
    public void mo89272j(@NotNull KmTypeAlias kmTypeAlias, @NotNull ProtoBuf.TypeAlias typeAlias, @NotNull ReadContext readContext) {
        kmTypeAlias.getClass();
        typeAlias.getClass();
        readContext.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: k */
    public void mo89273k(@NotNull KmEnumEntry kmEnumEntry, @NotNull ProtoBuf.EnumEntry enumEntry, @NotNull ReadContext readContext) {
        kmEnumEntry.getClass();
        enumEntry.getClass();
        readContext.getClass();
        for (ProtoBuf.Annotation annotation : enumEntry.getAnnotationList()) {
            List<KmAnnotation> listM89137a = kmEnumEntry.m89137a();
            annotation.getClass();
            listM89137a.add(ReadUtilsKt.m89232b(annotation, readContext.m89226e()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: l */
    public void mo89274l(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor constructor, @NotNull ReadContext readContext) {
        kmConstructor.getClass();
        constructor.getClass();
        readContext.getClass();
        JvmConstructorExtension jvmConstructorExtensionM89298b = JvmExtensionNodesKt.m89298b(kmConstructor);
        List<ProtoBuf.Annotation> annotationList = constructor.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM89121a = kmConstructor.m89121a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM89121a.add(ReadUtilsKt.m89232b(annotation, readContext.m89226e()));
        }
        JvmMemberSignature.Method methodM91026b = JvmProtoBufUtil.INSTANCE.m91026b(constructor, readContext.m89226e(), readContext.m89228g());
        jvmConstructorExtensionM89298b.m89296a(methodM91026b != null ? JvmMemberSignatureKt.m89287b(methodM91026b) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: m */
    public KmPropertyExtension mo89275m() {
        return new JvmPropertyExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: n */
    public void mo89276n(@NotNull KmType kmType, @NotNull ProtoBuf.Type type, @NotNull ReadContext readContext) {
        kmType.getClass();
        type.getClass();
        readContext.getClass();
        JvmTypeExtension jvmTypeExtensionM89301e = JvmExtensionNodesKt.m89301e(kmType);
        Object extension = type.getExtension(JvmProtoBuf.f65413g);
        extension.getClass();
        jvmTypeExtensionM89301e.m89312b(((Boolean) extension).booleanValue());
        for (ProtoBuf.Annotation annotation : (List) type.getExtension(JvmProtoBuf.f65412f)) {
            List<KmAnnotation> listM89311a = jvmTypeExtensionM89301e.m89311a();
            annotation.getClass();
            listM89311a.add(ReadUtilsKt.m89232b(annotation, readContext.m89226e()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: o */
    public void mo89277o(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class r5, @NotNull ReadContext readContext) {
        String strM89223b;
        kmClass.getClass();
        r5.getClass();
        readContext.getClass();
        JvmClassExtension jvmClassExtensionM89297a = JvmExtensionNodesKt.m89297a(kmClass);
        List<ProtoBuf.Annotation> annotationList = r5.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM89102d = kmClass.m89102d();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM89102d.add(ReadUtilsKt.m89232b(annotation, readContext.m89226e()));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension = JvmProtoBuf.f65417k;
        generatedExtension.getClass();
        Integer num = (Integer) ProtoBufUtilKt.m90895a(r5, generatedExtension);
        if (num != null) {
            jvmClassExtensionM89297a.m89292c(readContext.m89223b(num.intValue()));
        }
        for (ProtoBuf.Property property : (List) r5.getExtension(JvmProtoBuf.f65416j)) {
            List<KmProperty> listM89291b = jvmClassExtensionM89297a.m89291b();
            property.getClass();
            listM89291b.add(ReadersKt.m89250q(property, readContext));
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension2 = JvmProtoBuf.f65415i;
        generatedExtension2.getClass();
        Integer num2 = (Integer) ProtoBufUtilKt.m90895a(r5, generatedExtension2);
        if (num2 == null || (strM89223b = readContext.m89223b(num2.intValue())) == null) {
            strM89223b = BLiveTraceServerLocation.main;
        }
        jvmClassExtensionM89297a.m89294e(strM89223b);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension3 = JvmProtoBuf.f65418l;
        generatedExtension3.getClass();
        Integer num3 = (Integer) ProtoBufUtilKt.m90895a(r5, generatedExtension3);
        if (num3 != null) {
            jvmClassExtensionM89297a.m89293d(num3.intValue());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: p */
    public void mo89278p(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter valueParameter, @NotNull ReadContext readContext) {
        kmValueParameter.getClass();
        valueParameter.getClass();
        readContext.getClass();
        List<ProtoBuf.Annotation> annotationList = valueParameter.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM89190a = kmValueParameter.m89190a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM89190a.add(ReadUtilsKt.m89232b(annotation, readContext.m89226e()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    @NotNull
    /* JADX INFO: renamed from: q */
    public KmFunctionExtension mo89279q() {
        return new JvmFunctionExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions
    /* JADX INFO: renamed from: r */
    public void mo89280r(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function function, @NotNull ReadContext readContext) {
        kmFunction.getClass();
        function.getClass();
        readContext.getClass();
        JvmFunctionExtension jvmFunctionExtensionM89299c = JvmExtensionNodesKt.m89299c(kmFunction);
        List<ProtoBuf.Annotation> annotationList = function.getAnnotationList();
        annotationList.getClass();
        List<KmAnnotation> listM89138a = kmFunction.m89138a();
        for (ProtoBuf.Annotation annotation : annotationList) {
            annotation.getClass();
            listM89138a.add(ReadUtilsKt.m89232b(annotation, readContext.m89226e()));
        }
        List<ProtoBuf.Annotation> extensionReceiverAnnotationList = function.getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList.getClass();
        List<KmAnnotation> listM89140c = kmFunction.m89140c();
        for (ProtoBuf.Annotation annotation2 : extensionReceiverAnnotationList) {
            annotation2.getClass();
            listM89140c.add(ReadUtilsKt.m89232b(annotation2, readContext.m89226e()));
        }
        JvmMemberSignature.Method methodM91028e = JvmProtoBufUtil.INSTANCE.m91028e(function, readContext.m89226e(), readContext.m89228g());
        jvmFunctionExtensionM89299c.m89304b(methodM91028e != null ? JvmMemberSignatureKt.m89287b(methodM91028e) : null);
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> generatedExtension = JvmProtoBuf.f65409c;
        generatedExtension.getClass();
        Integer num = (Integer) ProtoBufUtilKt.m90895a(function, generatedExtension);
        if (num != null) {
            jvmFunctionExtensionM89299c.m89303a(readContext.m89223b(num.intValue()));
        }
    }
}
