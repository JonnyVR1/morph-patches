package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: k */
    @NotNull
    public final LazyJavaResolverContext f65610k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final JavaTypeParameter f65611l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaTypeParameter javaTypeParameter, int i, @NotNull DeclarationDescriptor declarationDescriptor) {
        super(lazyJavaResolverContext.m90512e(), declarationDescriptor, new LazyJavaAnnotations(lazyJavaResolverContext, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i, SourceElement.f64737a, lazyJavaResolverContext.m90508a().m90494v());
        lazyJavaResolverContext.getClass();
        javaTypeParameter.getClass();
        declarationDescriptor.getClass();
        this.f65610k = lazyJavaResolverContext;
        this.f65611l = javaTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: B0 */
    public List<KotlinType> mo89573B0(@NotNull List<? extends KotlinType> list) {
        list.getClass();
        return this.f65610k.m90508a().m90490r().m90981r(this, list, this.f65610k);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: D0 */
    public void mo89574D0(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<KotlinType> mo89575E0() {
        return m90734F0();
    }

    /* JADX INFO: renamed from: F0 */
    public final List<KotlinType> m90734F0() {
        Collection<JavaClassifierType> upperBounds = this.f65611l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType simpleTypeM89123i = this.f65610k.m90511d().mo89437f().m89123i();
            simpleTypeM89123i.getClass();
            SimpleType simpleTypeM89105J = this.f65610k.m90511d().mo89437f().m89105J();
            simpleTypeM89105J.getClass();
            return CollectionsKt.listOf(KotlinTypeFactory.m93520e(simpleTypeM89123i, simpleTypeM89105J));
        }
        Collection<JavaClassifierType> collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = this;
            arrayList.add(this.f65610k.m90514g().m90765p((JavaClassifierType) it.next(), JavaTypeAttributesKt.m90749b(TypeUsage.COMMON, false, false, lazyJavaTypeParameterDescriptor, 3, null)));
            this = lazyJavaTypeParameterDescriptor;
        }
        return arrayList;
    }
}
