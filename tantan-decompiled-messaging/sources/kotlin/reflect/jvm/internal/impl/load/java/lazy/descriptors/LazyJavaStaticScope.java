package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyJavaStaticScope extends LazyJavaScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyJavaStaticScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, null, 2, 0 == true ? 1 : 0);
        lazyJavaResolverContext.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: C */
    public void mo89703C(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        name.getClass();
        collection.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @Nullable
    /* JADX INFO: renamed from: O */
    public ReceiverParameterDescriptor mo89715O() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    /* JADX INFO: renamed from: Y */
    public LazyJavaScope.MethodSignatureData mo89727Y(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2) {
        javaMethod.getClass();
        list.getClass();
        kotlinType.getClass();
        list2.getClass();
        return new LazyJavaScope.MethodSignatureData(kotlinType, null, list2, list, false, CollectionsKt.emptyList());
    }
}
