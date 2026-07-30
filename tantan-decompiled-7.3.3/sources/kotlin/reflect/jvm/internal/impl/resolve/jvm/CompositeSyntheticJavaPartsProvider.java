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
    public final List<SyntheticJavaPartsProvider> f66543a;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(@NotNull List<? extends SyntheticJavaPartsProvider> list) {
        list.getClass();
        this.f66543a = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    /* JADX INFO: renamed from: a */
    public void mo92889a(@NotNull ClassDescriptor classDescriptor, @NotNull List<ClassConstructorDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        list.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f66543a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).mo92889a(classDescriptor, list, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    /* JADX INFO: renamed from: b */
    public PropertyDescriptorImpl mo92890b(@NotNull ClassDescriptor classDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptorImpl, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        propertyDescriptorImpl.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f66543a.iterator();
        while (it.hasNext()) {
            propertyDescriptorImpl = ((SyntheticJavaPartsProvider) it.next()).mo92890b(classDescriptor, propertyDescriptorImpl, lazyJavaResolverContext);
        }
        return propertyDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<Name> mo92891c(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        lazyJavaResolverContext.getClass();
        List<SyntheticJavaPartsProvider> list = this.f66543a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).mo92891c(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<Name> mo92892d(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        lazyJavaResolverContext.getClass();
        List<SyntheticJavaPartsProvider> list = this.f66543a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).mo92892d(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    /* JADX INFO: renamed from: e */
    public void mo92893e(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        name.getClass();
        collection.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f66543a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).mo92893e(classDescriptor, name, collection, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    /* JADX INFO: renamed from: f */
    public void mo92894f(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        name.getClass();
        collection.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f66543a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).mo92894f(classDescriptor, name, collection, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Name> mo92895g(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        lazyJavaResolverContext.getClass();
        List<SyntheticJavaPartsProvider> list = this.f66543a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((SyntheticJavaPartsProvider) it.next()).mo92895g(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    /* JADX INFO: renamed from: h */
    public void mo92896h(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        classDescriptor.getClass();
        name.getClass();
        list.getClass();
        lazyJavaResolverContext.getClass();
        Iterator<T> it = this.f66543a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).mo92896h(classDescriptor, name, list, lazyJavaResolverContext);
        }
    }
}
