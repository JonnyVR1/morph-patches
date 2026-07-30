package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.f3f;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorModuleDescriptor implements ModuleDescriptor {

    @NotNull
    public static final ErrorModuleDescriptor INSTANCE = new ErrorModuleDescriptor();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Name f66994a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<ModuleDescriptor> f66995b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<ModuleDescriptor> f66996c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<ModuleDescriptor> f66997d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f66998e;

    static {
        Name nameM91972n = Name.m91972n(ErrorEntity.ERROR_MODULE.getDebugText());
        nameM91972n.getClass();
        f66994a = nameM91972n;
        f66995b = CollectionsKt.emptyList();
        f66996c = CollectionsKt.emptyList();
        f66997d = SetsKt.emptySet();
        f66998e = LazyKt__LazyJVMKt.m88118b(f3f.INSTANCE);
    }

    private ErrorModuleDescriptor() {
    }

    /* JADX INFO: renamed from: l0 */
    public static final DefaultBuiltIns m93880l0() {
        return DefaultBuiltIns.Companion.m89034a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: I */
    public PackageViewDescriptor mo89434I(@NotNull FqName fqName) {
        fqName.getClass();
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: L */
    public List<ModuleDescriptor> mo89435L() {
        return f66996c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    /* JADX INFO: renamed from: Q */
    public <T> T mo89436Q(@NotNull ModuleCapability<T> moduleCapability) {
        moduleCapability.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public DeclarationDescriptor mo89336a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo89437f() {
        return (KotlinBuiltIns) f66998e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.m89532b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return m93881m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: m */
    public Collection<FqName> mo89438m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public Name m93881m0() {
        return f66994a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    /* JADX INFO: renamed from: x */
    public boolean mo89439x(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return false;
    }
}
