package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class UtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<ValueParameterDescriptor> m90458a(@NotNull Collection<? extends KotlinType> collection, @NotNull Collection<? extends ValueParameterDescriptor> collection2, @NotNull CallableDescriptor callableDescriptor) {
        collection.getClass();
        collection2.getClass();
        callableDescriptor.getClass();
        collection.size();
        collection2.size();
        List<Pair> listZip = CollectionsKt.zip(collection, collection2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (Pair pair : listZip) {
            KotlinType kotlinType = (KotlinType) pair.component1();
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.component2();
            int index = valueParameterDescriptor.getIndex();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            name.getClass();
            boolean zMo89506M = valueParameterDescriptor.mo89506M();
            boolean zMo89508t0 = valueParameterDescriptor.mo89508t0();
            boolean zMo89507r0 = valueParameterDescriptor.mo89507r0();
            KotlinType kotlinTypeM89125k = valueParameterDescriptor.mo89509w0() != null ? DescriptorUtilsKt.m92877s(callableDescriptor).mo89437f().m89125k(kotlinType) : null;
            SourceElement source = valueParameterDescriptor.getSource();
            source.getClass();
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor, null, index, annotations, name, kotlinType, zMo89506M, zMo89508t0, zMo89507r0, kotlinTypeM89125k, source));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final LazyJavaStaticClassScope m90459b(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        ClassDescriptor classDescriptorM92882x = DescriptorUtilsKt.m92882x(classDescriptor);
        if (classDescriptorM92882x == null) {
            return null;
        }
        MemberScope memberScopeMo89199o0 = classDescriptorM92882x.mo89199o0();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = memberScopeMo89199o0 instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) memberScopeMo89199o0 : null;
        return lazyJavaStaticClassScope == null ? m90459b(classDescriptorM92882x) : lazyJavaStaticClassScope;
    }
}
