package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<SyntheticJavaPartsProvider> f65869a;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(@NotNull List<? extends SyntheticJavaPartsProvider> list) {
        list.getClass();
        this.f65869a = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    /* JADX INFO: renamed from: a */
    public void mo91998a(@NotNull ClassDescriptor classDescriptor, @NotNull List<ClassConstructorDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        list.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f65869a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).mo91998a(classDescriptor, list, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    /* JADX INFO: renamed from: b */
    public PropertyDescriptorImpl mo91999b(@NotNull ClassDescriptor classDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptorImpl, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        propertyDescriptorImpl.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f65869a.iterator();
        while (it.hasNext()) {
            propertyDescriptorImpl = ((SyntheticJavaPartsProvider) it.next()).mo91999b(classDescriptor, propertyDescriptorImpl, lazyJavaResolverContext);
        }
        return propertyDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<Name> mo92000c(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        lazyJavaResolverContext.getClass();
        List<SyntheticJavaPartsProvider> list = this.f65869a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).mo92000c(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<Name> mo92001d(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        lazyJavaResolverContext.getClass();
        List<SyntheticJavaPartsProvider> list = this.f65869a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).mo92001d(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    /* JADX INFO: renamed from: e */
    public void mo92002e(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        name.getClass();
        collection.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f65869a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).mo92002e(classDescriptor, name, collection, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    /* JADX INFO: renamed from: f */
    public void mo92003f(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        name.getClass();
        collection.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f65869a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).mo92003f(classDescriptor, name, collection, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Name> mo92004g(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        lazyJavaResolverContext.getClass();
        List<SyntheticJavaPartsProvider> list = this.f65869a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).mo92004g(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    /* JADX INFO: renamed from: h */
    public void mo92005h(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        name.getClass();
        list.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f65869a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).mo92005h(classDescriptor, name, list, lazyJavaResolverContext);
        }
    }
}
