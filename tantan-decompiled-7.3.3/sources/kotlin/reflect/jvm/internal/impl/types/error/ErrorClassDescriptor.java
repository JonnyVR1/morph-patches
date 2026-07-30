package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorClassDescriptor extends ClassDescriptorImpl {
    /* JADX WARN: Illegal instructions before constructor call */
    public ErrorClassDescriptor(@NotNull Name name) {
        name.getClass();
        ErrorUtils errorUtils = ErrorUtils.INSTANCE;
        ModuleDescriptor moduleDescriptorM93901i = errorUtils.m93901i();
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        List listEmptyList = CollectionsKt.emptyList();
        SourceElement sourceElement = SourceElement.f64737a;
        super(moduleDescriptorM93901i, name, modality, classKind, listEmptyList, sourceElement, false, LockBasedStorageManager.f66839e);
        ClassConstructorDescriptorImpl classConstructorDescriptorImplM89585g1 = ClassConstructorDescriptorImpl.m89585g1(this, Annotations.Companion.m89532b(), true, sourceElement);
        classConstructorDescriptorImplM89585g1.m89592j1(CollectionsKt.emptyList(), DescriptorVisibilities.f64700e);
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String string = classConstructorDescriptorImplM89585g1.getName().toString();
        string.getClass();
        MemberScope memberScopeM93892b = ErrorUtils.m93892b(errorScopeKind, string, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        classConstructorDescriptorImplM89585g1.m89648Z0(new ErrorType(errorUtils.m93897e(errorTypeKind, new String[0]), memberScopeM93892b, errorTypeKind, null, false, new String[0], 24, null));
        m89596D0(memberScopeM93892b, SetsKt.setOf(classConstructorDescriptorImplM89585g1), classConstructorDescriptorImplM89585g1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: B0 */
    public ClassDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: P */
    public MemberScope mo89547P(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        typeSubstitution.getClass();
        kotlinTypeRefiner.getClass();
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String string = getName().toString();
        string.getClass();
        return ErrorUtils.m93892b(errorScopeKind, string, typeSubstitution.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
    @NotNull
    public String toString() {
        String strM91973b = getName().m91973b();
        strM91973b.getClass();
        return strM91973b;
    }
}
