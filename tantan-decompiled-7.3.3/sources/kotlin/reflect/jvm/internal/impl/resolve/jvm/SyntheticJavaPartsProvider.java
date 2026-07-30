package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SyntheticJavaPartsProvider {

    @NotNull
    public static final Companion Companion = Companion.f66548a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f66548a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final CompositeSyntheticJavaPartsProvider f66549b = new CompositeSyntheticJavaPartsProvider(CollectionsKt.emptyList());

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final CompositeSyntheticJavaPartsProvider m92913a() {
            return f66549b;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo92889a(@NotNull ClassDescriptor classDescriptor, @NotNull List<ClassConstructorDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    /* JADX INFO: renamed from: b */
    PropertyDescriptorImpl mo92890b(@NotNull ClassDescriptor classDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptorImpl, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    /* JADX INFO: renamed from: c */
    List<Name> mo92891c(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    /* JADX INFO: renamed from: d */
    List<Name> mo92892d(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    /* JADX INFO: renamed from: e */
    void mo92893e(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    /* JADX INFO: renamed from: f */
    void mo92894f(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    /* JADX INFO: renamed from: g */
    List<Name> mo92895g(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    /* JADX INFO: renamed from: h */
    void mo92896h(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext);
}
