package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    @NotNull
    /* JADX INFO: renamed from: C */
    MemberScope mo88454C();

    /* JADX INFO: renamed from: C0 */
    boolean mo88290C0();

    @NotNull
    /* JADX INFO: renamed from: D */
    MemberScope mo88455D();

    @NotNull
    /* JADX INFO: renamed from: R */
    ReceiverParameterDescriptor mo88456R();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    ClassDescriptor mo88445a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    DeclarationDescriptor mo88299b();

    @Nullable
    /* JADX INFO: renamed from: c0 */
    ValueClassRepresentation<SimpleType> mo88300c0();

    @NotNull
    /* JADX INFO: renamed from: f0 */
    List<ReceiverParameterDescriptor> mo88457f0();

    @NotNull
    Collection<ClassConstructorDescriptor> getConstructors();

    @NotNull
    ClassKind getKind();

    @NotNull
    DescriptorVisibility getVisibility();

    /* JADX INFO: renamed from: h0 */
    boolean mo88302h0();

    @NotNull
    /* JADX INFO: renamed from: i */
    Modality mo88303i();

    boolean isInline();

    /* JADX INFO: renamed from: j0 */
    boolean mo88304j0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    SimpleType mo88458o();

    @NotNull
    /* JADX INFO: renamed from: o0 */
    MemberScope mo88308o0();

    @NotNull
    /* JADX INFO: renamed from: p */
    List<TypeParameterDescriptor> mo88309p();

    @Nullable
    /* JADX INFO: renamed from: p0 */
    ClassDescriptor mo88310p0();

    /* JADX INFO: renamed from: q */
    boolean mo88311q();

    @NotNull
    /* JADX INFO: renamed from: s0 */
    MemberScope mo88459s0(@NotNull TypeSubstitution typeSubstitution);

    @Nullable
    /* JADX INFO: renamed from: v */
    ClassConstructorDescriptor mo88313v();
}
