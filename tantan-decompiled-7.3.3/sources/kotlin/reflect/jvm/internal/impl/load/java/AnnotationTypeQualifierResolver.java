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
    public Iterable<AnnotationDescriptor> mo90217m(@NotNull AnnotationDescriptor annotationDescriptor) {
        Annotations annotations;
        annotationDescriptor.getClass();
        ClassDescriptor classDescriptorM92870l = DescriptorUtilsKt.m92870l(annotationDescriptor);
        return (classDescriptorM92870l == null || (annotations = classDescriptorM92870l.getAnnotations()) == null) ? CollectionsKt.emptyList() : annotations;
    }

    /* JADX INFO: renamed from: B */
    public final List<String> m90229B(ConstantValue<?> constantValue) {
        if (!(constantValue instanceof ArrayValue)) {
            return constantValue instanceof EnumValue ? CollectionsKt.listOf(((EnumValue) constantValue).m92817c().m91975g()) : CollectionsKt.emptyList();
        }
        List<? extends ConstantValue<?>> listMo92809b = ((ArrayValue) constantValue).mo92809b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listMo92809b.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, m90229B((ConstantValue) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* JADX INFO: renamed from: o */
    public boolean mo90219o() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<String> mo90208c(@NotNull AnnotationDescriptor annotationDescriptor, boolean z) {
        annotationDescriptor.getClass();
        Map<Name, ConstantValue<?>> mapMo89521a = annotationDescriptor.mo89521a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Name, ConstantValue<?>> entry : mapMo89521a.entrySet()) {
            CollectionsKt.addAll(arrayList, (!z || Intrinsics.m88377d(entry.getKey(), JvmAnnotationNames.f65369c)) ? m90229B(entry.getValue()) : CollectionsKt.emptyList());
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @Nullable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public FqName mo90215k(@NotNull AnnotationDescriptor annotationDescriptor) {
        annotationDescriptor.getClass();
        return annotationDescriptor.mo89522d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object mo90216l(@NotNull AnnotationDescriptor annotationDescriptor) {
        annotationDescriptor.getClass();
        ClassDescriptor classDescriptorM92870l = DescriptorUtilsKt.m92870l(annotationDescriptor);
        classDescriptorM92870l.getClass();
        return classDescriptorM92870l;
    }
}
