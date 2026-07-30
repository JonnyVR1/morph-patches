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
    public final LazyJavaResolverContext f64936k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final JavaTypeParameter f64937l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaTypeParameter javaTypeParameter, int i, @NotNull DeclarationDescriptor declarationDescriptor) {
        super(lazyJavaResolverContext.m89621e(), declarationDescriptor, new LazyJavaAnnotations(lazyJavaResolverContext, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i, SourceElement.f64063a, lazyJavaResolverContext.m89617a().m89603v());
        lazyJavaResolverContext.getClass();
        javaTypeParameter.getClass();
        declarationDescriptor.getClass();
        this.f64936k = lazyJavaResolverContext;
        this.f64937l = javaTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: B0 */
    public List<KotlinType> mo88682B0(@NotNull List<? extends KotlinType> list) {
        list.getClass();
        return this.f64936k.m89617a().m89599r().m90090r(this, list, this.f64936k);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: D0 */
    public void mo88683D0(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<KotlinType> mo88684E0() {
        return m89843F0();
    }

    /* JADX INFO: renamed from: F0 */
    public final List<KotlinType> m89843F0() {
        Collection<JavaClassifierType> upperBounds = this.f64937l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType simpleTypeM88232i = this.f64936k.m89620d().mo88546f().m88232i();
            simpleTypeM88232i.getClass();
            SimpleType simpleTypeM88214J = this.f64936k.m89620d().mo88546f().m88214J();
            simpleTypeM88214J.getClass();
            return CollectionsKt.listOf(KotlinTypeFactory.m92629e(simpleTypeM88232i, simpleTypeM88214J));
        }
        Collection<JavaClassifierType> collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = this;
            arrayList.add(this.f64936k.m89623g().m89874p((JavaClassifierType) it.next(), JavaTypeAttributesKt.m89858b(TypeUsage.COMMON, false, false, lazyJavaTypeParameterDescriptor, 3, null)));
            this = lazyJavaTypeParameterDescriptor;
        }
        return arrayList;
    }
}
