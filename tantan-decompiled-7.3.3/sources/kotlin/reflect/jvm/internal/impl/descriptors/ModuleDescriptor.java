package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {

    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static <R, D> R m89440a(@NotNull ModuleDescriptor moduleDescriptor, @NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            declarationDescriptorVisitor.getClass();
            return declarationDescriptorVisitor.mo89365m(moduleDescriptor, d);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static DeclarationDescriptor m89441b(@NotNull ModuleDescriptor moduleDescriptor) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    PackageViewDescriptor mo89434I(@NotNull FqName fqName);

    @NotNull
    /* JADX INFO: renamed from: L */
    List<ModuleDescriptor> mo89435L();

    @Nullable
    /* JADX INFO: renamed from: Q */
    <T> T mo89436Q(@NotNull ModuleCapability<T> moduleCapability);

    @NotNull
    /* JADX INFO: renamed from: f */
    KotlinBuiltIns mo89437f();

    @NotNull
    /* JADX INFO: renamed from: m */
    Collection<FqName> mo89438m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1);

    /* JADX INFO: renamed from: x */
    boolean mo89439x(@NotNull ModuleDescriptor moduleDescriptor);
}
