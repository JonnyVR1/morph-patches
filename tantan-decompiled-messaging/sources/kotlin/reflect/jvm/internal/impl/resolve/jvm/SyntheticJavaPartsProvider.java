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
    public static final Companion Companion = Companion.f65874a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f65874a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final CompositeSyntheticJavaPartsProvider f65875b = new CompositeSyntheticJavaPartsProvider(CollectionsKt.emptyList());

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final CompositeSyntheticJavaPartsProvider m92022a() {
            return f65875b;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo91998a(@NotNull ClassDescriptor classDescriptor, @NotNull List<ClassConstructorDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    /* JADX INFO: renamed from: b */
    PropertyDescriptorImpl mo91999b(@NotNull ClassDescriptor classDescriptor, @NotNull PropertyDescriptorImpl propertyDescriptorImpl, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    /* JADX INFO: renamed from: c */
    List<Name> mo92000c(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    /* JADX INFO: renamed from: d */
    List<Name> mo92001d(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    /* JADX INFO: renamed from: e */
    void mo92002e(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    /* JADX INFO: renamed from: f */
    void mo92003f(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    @NotNull
    /* JADX INFO: renamed from: g */
    List<Name> mo92004g(@NotNull ClassDescriptor classDescriptor, @NotNull LazyJavaResolverContext lazyJavaResolverContext);

    /* JADX INFO: renamed from: h */
    void mo92005h(@NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext);
}
