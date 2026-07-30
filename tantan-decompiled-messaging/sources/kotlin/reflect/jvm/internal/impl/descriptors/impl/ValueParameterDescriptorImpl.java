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
import p149l.bz00;
import p149l.trk0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: f */
    public final int f64305f;

    /* JADX INFO: renamed from: g */
    public final boolean f64306g;

    /* JADX INFO: renamed from: h */
    public final boolean f64307h;

    /* JADX INFO: renamed from: i */
    public final boolean f64308i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final KotlinType f64309j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ValueParameterDescriptor f64310k;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ValueParameterDescriptorImpl m88930a(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement, @Nullable Function0<? extends List<? extends VariableDescriptor>> function0) {
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
        public final Lazy f64311l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement, @NotNull Function0<? extends List<? extends VariableDescriptor>> function0) {
            super(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement);
            callableDescriptor.getClass();
            annotations.getClass();
            name.getClass();
            kotlinType.getClass();
            sourceElement.getClass();
            function0.getClass();
            this.f64311l = LazyKt__LazyJVMKt.m87229b(function0);
        }

        /* JADX INFO: renamed from: I0 */
        public static final List m88932I0(WithDestructuringDeclaration withDestructuringDeclaration) {
            return withDestructuringDeclaration.m88933J0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        @NotNull
        /* JADX INFO: renamed from: E */
        public ValueParameterDescriptor mo88614E(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i) {
            callableDescriptor.getClass();
            name.getClass();
            Annotations annotations = getAnnotations();
            annotations.getClass();
            KotlinType type = getType();
            type.getClass();
            boolean zMo88615M = mo88615M();
            boolean zMo88617t0 = mo88617t0();
            boolean zMo88616r0 = mo88616r0();
            KotlinType kotlinTypeMo88618w0 = mo88618w0();
            SourceElement sourceElement = SourceElement.f64063a;
            sourceElement.getClass();
            return new WithDestructuringDeclaration(callableDescriptor, null, i, annotations, name, type, zMo88615M, zMo88617t0, zMo88616r0, kotlinTypeMo88618w0, sourceElement, new trk0(this));
        }

        @NotNull
        /* JADX INFO: renamed from: J0 */
        public final List<VariableDescriptor> m88933J0() {
            return (List) this.f64311l.getValue();
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
        this.f64305f = i;
        this.f64306g = z;
        this.f64307h = z2;
        this.f64308i = z3;
        this.f64309j = kotlinType2;
        this.f64310k = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public static final ValueParameterDescriptorImpl m88927E0(@NotNull CallableDescriptor callableDescriptor, @Nullable ValueParameterDescriptor valueParameterDescriptor, int i, @NotNull Annotations annotations, @NotNull Name name, @NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3, @Nullable KotlinType kotlinType2, @NotNull SourceElement sourceElement, @Nullable Function0<? extends List<? extends VariableDescriptor>> function0) {
        return Companion.m88930a(callableDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z, z2, z3, kotlinType2, sourceElement, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: E */
    public ValueParameterDescriptor mo88614E(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i) {
        callableDescriptor.getClass();
        name.getClass();
        Annotations annotations = getAnnotations();
        annotations.getClass();
        KotlinType type = getType();
        type.getClass();
        boolean zMo88615M = mo88615M();
        boolean zMo88617t0 = mo88617t0();
        boolean zMo88616r0 = mo88616r0();
        KotlinType kotlinTypeMo88618w0 = mo88618w0();
        SourceElement sourceElement = SourceElement.f64063a;
        sourceElement.getClass();
        return new ValueParameterDescriptorImpl(callableDescriptor, null, i, annotations, name, type, zMo88615M, zMo88617t0, zMo88616r0, kotlinTypeMo88618w0, sourceElement);
    }

    @Nullable
    /* JADX INFO: renamed from: F0 */
    public Void m88928F0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public ValueParameterDescriptor mo88453c(@NotNull TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        if (typeSubstitutor.m92779l()) {
            return this;
        }
        bz00.m104536a();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: M */
    public boolean mo88615M() {
        if (!this.f64306g) {
            return false;
        }
        CallableDescriptor callableDescriptorMo88299b = mo88299b();
        callableDescriptorMo88299b.getClass();
        return ((CallableMemberDescriptor) callableDescriptorMo88299b).getKind().isReal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        declarationDescriptorVisitor.getClass();
        return declarationDescriptorVisitor.mo88468e(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    /* JADX INFO: renamed from: a */
    public ValueParameterDescriptor mo88445a() {
        ValueParameterDescriptor valueParameterDescriptor = this.f64310k;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.mo88445a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public CallableDescriptor mo88299b() {
        DeclarationDescriptor declarationDescriptorMo88299b = super.mo88299b();
        declarationDescriptorMo88299b.getClass();
        return (CallableDescriptor) declarationDescriptorMo88299b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* JADX INFO: renamed from: e */
    public Collection<ValueParameterDescriptor> mo88447e() {
        Collection<? extends CallableDescriptor> collectionMo88447e = mo88299b().mo88447e();
        collectionMo88447e.getClass();
        Collection<? extends CallableDescriptor> collection = collectionMo88447e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallableDescriptor) it.next()).mo88448g().get(getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.f64305f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64027f;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: q0 */
    public /* bridge */ /* synthetic */ ConstantValue mo88619q0() {
        return (ConstantValue) m88928F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: r0 */
    public boolean mo88616r0() {
        return this.f64308i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: t0 */
    public boolean mo88617t0() {
        return this.f64307h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @Nullable
    /* JADX INFO: renamed from: w0 */
    public KotlinType mo88618w0() {
        return this.f64309j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: y */
    public boolean mo88620y() {
        return false;
    }
}
