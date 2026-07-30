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
    public static final List<ValueParameterDescriptor> m89567a(@NotNull Collection<? extends KotlinType> collection, @NotNull Collection<? extends ValueParameterDescriptor> collection2, @NotNull CallableDescriptor callableDescriptor) {
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
            boolean zMo88615M = valueParameterDescriptor.mo88615M();
            boolean zMo88617t0 = valueParameterDescriptor.mo88617t0();
            boolean zMo88616r0 = valueParameterDescriptor.mo88616r0();
            KotlinType kotlinTypeM88234k = valueParameterDescriptor.mo88618w0() != null ? DescriptorUtilsKt.m91986s(callableDescriptor).mo88546f().m88234k(kotlinType) : null;
            SourceElement source = valueParameterDescriptor.getSource();
            source.getClass();
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor, null, index, annotations, name, kotlinType, zMo88615M, zMo88617t0, zMo88616r0, kotlinTypeM88234k, source));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final LazyJavaStaticClassScope m89568b(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        ClassDescriptor classDescriptorM91991x = DescriptorUtilsKt.m91991x(classDescriptor);
        if (classDescriptorM91991x == null) {
            return null;
        }
        MemberScope memberScopeMo88308o0 = classDescriptorM91991x.mo88308o0();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = memberScopeMo88308o0 instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) memberScopeMo88308o0 : null;
        return lazyJavaStaticClassScope == null ? m89568b(classDescriptorM91991x) : lazyJavaStaticClassScope;
    }
}
