package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class AnnotationTypeQualifierResolver extends AbstractAnnotationTypeQualifierResolver<AnnotationDescriptor> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationTypeQualifierResolver(@NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        javaTypeEnhancementState.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterable<AnnotationDescriptor> mo89326m(@NotNull AnnotationDescriptor annotationDescriptor) {
        Annotations annotations;
        annotationDescriptor.getClass();
        ClassDescriptor classDescriptorM91979l = DescriptorUtilsKt.m91979l(annotationDescriptor);
        return (classDescriptorM91979l == null || (annotations = classDescriptorM91979l.getAnnotations()) == null) ? CollectionsKt.emptyList() : annotations;
    }

    /* JADX INFO: renamed from: B */
    public final List<String> m89338B(ConstantValue<?> constantValue) {
        if (!(constantValue instanceof ArrayValue)) {
            return constantValue instanceof EnumValue ? CollectionsKt.listOf(((EnumValue) constantValue).m91926c().m91084g()) : CollectionsKt.emptyList();
        }
        List<? extends ConstantValue<?>> listMo91918b = ((ArrayValue) constantValue).mo91918b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listMo91918b.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, m89338B((ConstantValue) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* JADX INFO: renamed from: o */
    public boolean mo89328o() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<String> mo89317c(@NotNull AnnotationDescriptor annotationDescriptor, boolean z) {
        annotationDescriptor.getClass();
        Map<Name, ConstantValue<?>> mapMo88630a = annotationDescriptor.mo88630a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Name, ConstantValue<?>> entry : mapMo88630a.entrySet()) {
            CollectionsKt.addAll(arrayList, (!z || Intrinsics.m87488d(entry.getKey(), JvmAnnotationNames.f64695c)) ? m89338B(entry.getValue()) : CollectionsKt.emptyList());
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @Nullable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public FqName mo89324k(@NotNull AnnotationDescriptor annotationDescriptor) {
        annotationDescriptor.getClass();
        return annotationDescriptor.mo88631d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object mo89325l(@NotNull AnnotationDescriptor annotationDescriptor) {
        annotationDescriptor.getClass();
        ClassDescriptor classDescriptorM91979l = DescriptorUtilsKt.m91979l(annotationDescriptor);
        classDescriptorM91979l.getClass();
        return classDescriptorM91979l;
    }
}
