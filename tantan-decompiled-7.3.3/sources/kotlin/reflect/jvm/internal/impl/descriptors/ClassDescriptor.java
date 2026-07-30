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
    MemberScope mo89345C();

    /* JADX INFO: renamed from: C0 */
    boolean mo89181C0();

    @NotNull
    /* JADX INFO: renamed from: D */
    MemberScope mo89346D();

    @NotNull
    /* JADX INFO: renamed from: R */
    ReceiverParameterDescriptor mo89347R();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    ClassDescriptor mo89336a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    DeclarationDescriptor mo89190b();

    @Nullable
    /* JADX INFO: renamed from: c0 */
    ValueClassRepresentation<SimpleType> mo89191c0();

    @NotNull
    /* JADX INFO: renamed from: f0 */
    List<ReceiverParameterDescriptor> mo89348f0();

    @NotNull
    Collection<ClassConstructorDescriptor> getConstructors();

    @NotNull
    ClassKind getKind();

    @NotNull
    DescriptorVisibility getVisibility();

    /* JADX INFO: renamed from: h0 */
    boolean mo89193h0();

    @NotNull
    /* JADX INFO: renamed from: i */
    Modality mo89194i();

    boolean isInline();

    /* JADX INFO: renamed from: j0 */
    boolean mo89195j0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    SimpleType mo89349o();

    @NotNull
    /* JADX INFO: renamed from: o0 */
    MemberScope mo89199o0();

    @NotNull
    /* JADX INFO: renamed from: p */
    List<TypeParameterDescriptor> mo89200p();

    @Nullable
    /* JADX INFO: renamed from: p0 */
    ClassDescriptor mo89201p0();

    /* JADX INFO: renamed from: q */
    boolean mo89202q();

    @NotNull
    /* JADX INFO: renamed from: s0 */
    MemberScope mo89350s0(@NotNull TypeSubstitution typeSubstitution);

    @Nullable
    /* JADX INFO: renamed from: v */
    ClassConstructorDescriptor mo89204v();
}
