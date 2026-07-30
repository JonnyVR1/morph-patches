package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.l710;
import p153l.z0l0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: f */
    public final int f64979f;

    /* JADX INFO: renamed from: g */
    public final boolean f64980g;

    /* JADX INFO: renamed from: h */
    public final boolean f64981h;

    /* JADX INFO: renamed from: i */
    public final boolean f64982i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final KotlinType f64983j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ValueParameterDescriptor f64984k;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ValueParameterDescriptorImpl m89821a(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement, @Nullable Function0<? extends List<? extends VariableDescriptor>> function0) {
            callableDescriptor.getClass();
            annotations.getClass();
            name.getClass();
            kotlinType.getClass();
            sourceElement.getClass();
            return function0 == null ? new ValueParameterDescriptorImpl(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement) : new WithDestructuringDeclaration(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement, function0);
        }

        private Companion() {
        }
    }

    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        /* JADX INFO: renamed from: l */
        @NotNull
        public final Lazy f64985l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement, @NotNull Function0<? extends List<? extends VariableDescriptor>> function0) {
            super(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement);
            callableDescriptor.getClass();
            annotations.getClass();
            name.getClass();
            kotlinType.getClass();
            sourceElement.getClass();
            function0.getClass();
            this.f64985l = LazyKt__LazyJVMKt.m88118b(function0);
        }

        /* JADX INFO: renamed from: I0 */
        public static final List m89823I0(WithDestructuringDeclaration withDestructuringDeclaration) {
            return withDestructuringDeclaration.m89824J0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        @NotNull
        /* JADX INFO: renamed from: E */
        public ValueParameterDescriptor mo89505E(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i) {
            callableDescriptor.getClass();
            name.getClass();
            Annotations annotations = getAnnotations();
            annotations.getClass();
            KotlinType type = getType();
            type.getClass();
            boolean zMo89506M = mo89506M();
            boolean zMo89508t0 = mo89508t0();
            boolean zMo89507r0 = mo89507r0();
            KotlinType kotlinTypeMo89509w0 = mo89509w0();
            SourceElement sourceElement = SourceElement.f64737a;
            sourceElement.getClass();
            return new WithDestructuringDeclaration(callableDescriptor, null, i, annotations, name, type, zMo89506M, zMo89508t0, zMo89507r0, kotlinTypeMo89509w0, sourceElement, new z0l0(this));
        }

        @NotNull
        /* JADX INFO: renamed from: J0 */
        public final List<VariableDescriptor> m89824J0() {
            return (List) this.f64985l.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement) {
        super(callableDescriptor, annotations, name, kotlinType, sourceElement);
        callableDescriptor.getClass();
        annotations.getClass();
        name.getClass();
        kotlinType.getClass();
        sourceElement.getClass();
        this.f64979f = i;
        this.f64980g = z;
        this.f64981h = z2;
        this.f64982i = z3;
        this.f64983j = kotlinType2;
        this.f64984k = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public static final ValueParameterDescriptorImpl m89818E0(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement, @Nullable Function0<? extends List<? extends VariableDescriptor>> function0) {
        return Companion.m89821a(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: E */
    public ValueParameterDescriptor mo89505E(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i) {
        callableDescriptor.getClass();
        name.getClass();
        Annotations annotations = getAnnotations();
        annotations.getClass();
        KotlinType type = getType();
        type.getClass();
        boolean zMo89506M = mo89506M();
        boolean zMo89508t0 = mo89508t0();
        boolean zMo89507r0 = mo89507r0();
        KotlinType kotlinTypeMo89509w0 = mo89509w0();
        SourceElement sourceElement = SourceElement.f64737a;
        sourceElement.getClass();
        return new ValueParameterDescriptorImpl(callableDescriptor, null, i, annotations, name, type, zMo89506M, zMo89508t0, zMo89507r0, kotlinTypeMo89509w0, sourceElement);
    }

    @Nullable
    /* JADX INFO: renamed from: F0 */
    public Void m89819F0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public ValueParameterDescriptor mo89344c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        if (typeSubstitutor.m93670l()) {
            return this;
        }
        l710.m153113a();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: M */
    public boolean mo89506M() {
        if (!this.f64980g) {
            return false;
        }
        CallableDescriptor callableDescriptorMo89190b = mo89190b();
        callableDescriptorMo89190b.getClass();
        return ((CallableMemberDescriptor) callableDescriptorMo89190b).getKind().isReal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.mo89359e(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public ValueParameterDescriptor mo89336a() {
        ValueParameterDescriptor valueParameterDescriptor = this.f64984k;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.mo89336a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public CallableDescriptor mo89190b() {
        DeclarationDescriptor declarationDescriptorMo89190b = super.mo89190b();
        declarationDescriptorMo89190b.getClass();
        return (CallableDescriptor) declarationDescriptorMo89190b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<ValueParameterDescriptor> mo89338e() {
        Collection<? extends CallableDescriptor> collectionMo89338e = mo89190b().mo89338e();
        collectionMo89338e.getClass();
        Collection<? extends CallableDescriptor> collection = collectionMo89338e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallableDescriptor) it.next()).mo89339g().get(getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.f64979f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64701f;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: q0 */
    public /* bridge */ /* synthetic */ ConstantValue mo89510q0() {
        return (ConstantValue) m89819F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: r0 */
    public boolean mo89507r0() {
        return this.f64982i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: t0 */
    public boolean mo89508t0() {
        return this.f64981h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @Nullable
    /* JADX INFO: renamed from: w0 */
    public KotlinType mo89509w0() {
        return this.f64983j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y */
    public boolean mo89511y() {
        return false;
    }
}
