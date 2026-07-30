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
import p149l.a2f;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorModuleDescriptor implements ModuleDescriptor {

    @NotNull
    public static final ErrorModuleDescriptor INSTANCE = new ErrorModuleDescriptor();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Name f66320a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<ModuleDescriptor> f66321b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<ModuleDescriptor> f66322c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<ModuleDescriptor> f66323d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f66324e;

    static {
        Name nameM91081n = Name.m91081n(ErrorEntity.ERROR_MODULE.getDebugText());
        nameM91081n.getClass();
        f66320a = nameM91081n;
        f66321b = CollectionsKt.emptyList();
        f66322c = CollectionsKt.emptyList();
        f66323d = SetsKt.emptySet();
        f66324e = LazyKt__LazyJVMKt.m87229b(a2f.INSTANCE);
    }

    private ErrorModuleDescriptor() {
    }

    /* JADX INFO: renamed from: l0 */
    public static final DefaultBuiltIns m92989l0() {
        return DefaultBuiltIns.Companion.m88143a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: I */
    public PackageViewDescriptor mo88543I(@NotNull FqName fqName) {
        fqName.getClass();
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: L */
    public List<ModuleDescriptor> mo88544L() {
        return f66322c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    /* JADX INFO: renamed from: Q */
    public <T> T mo88545Q(@NotNull ModuleCapability<T> moduleCapability) {
        moduleCapability.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public DeclarationDescriptor mo88445a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo88299b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: f */
    public KotlinBuiltIns mo88546f() {
        return (KotlinBuiltIns) f66324e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.m88641b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return m92990m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    /* JADX INFO: renamed from: m */
    public Collection<FqName> mo88547m(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public Name m92990m0() {
        return f66320a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    /* JADX INFO: renamed from: x */
    public boolean mo88548x(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return false;
    }
}
