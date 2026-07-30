package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.twd;
import p153l.uwd;
import p153l.vwd;
import p153l.wwd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorUtilsKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Name f66540a;

    static {
        Name nameM91970i = Name.m91970i("value");
        nameM91970i.getClass();
        f66540a = nameM91970i;
    }

    /* JADX INFO: renamed from: A */
    public static final Sequence m92857A(boolean z, CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return m92884z(callableMemberDescriptor, z);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public static final ClassDescriptor m92858B(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        moduleDescriptor.getClass();
        fqName.getClass();
        lookupLocation.getClass();
        fqName.m91939c();
        ClassifierDescriptor classifierDescriptorMo90533f = moduleDescriptor.mo89434I(fqName.m91940d()).mo89467n().mo90533f(fqName.m91942f(), lookupLocation);
        if (classifierDescriptorMo90533f instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo90533f;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final DeclarationDescriptor m92859a(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor.mo89190b();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m92864f(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        valueParameterDescriptor.getClass();
        Boolean boolM94080e = DFS.m94080e(CollectionsKt.listOf(valueParameterDescriptor), twd.INSTANCE, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        boolM94080e.getClass();
        return boolM94080e.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final Iterable m92865g(ValueParameterDescriptor valueParameterDescriptor) {
        Collection<ValueParameterDescriptor> collectionMo89338e = valueParameterDescriptor.mo89338e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo89338e, 10));
        Iterator<T> it = collectionMo89338e.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).mo89336a());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final CallableMemberDescriptor m92866h(@NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z, @NotNull final Function1<? super CallableMemberDescriptor, Boolean> function1) {
        callableMemberDescriptor.getClass();
        function1.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return (CallableMemberDescriptor) DFS.m94077b(CollectionsKt.listOf(callableMemberDescriptor), new vwd(z), new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo92885b(CallableMemberDescriptor callableMemberDescriptor2) {
                callableMemberDescriptor2.getClass();
                if (objectRef.element == null && function1.invoke(callableMemberDescriptor2).booleanValue()) {
                    objectRef.element = callableMemberDescriptor2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean mo88524a(CallableMemberDescriptor callableMemberDescriptor2) {
                callableMemberDescriptor2.getClass();
                return objectRef.element == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public CallableMemberDescriptor result() {
                return objectRef.element;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CallableMemberDescriptor m92867i(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m92866h(callableMemberDescriptor, z, function1);
    }

    /* JADX INFO: renamed from: j */
    public static final Iterable m92868j(boolean z, CallableMemberDescriptor callableMemberDescriptor) {
        Collection<? extends CallableMemberDescriptor> collectionMo89338e;
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.mo89336a() : null;
        }
        return (callableMemberDescriptor == null || (collectionMo89338e = callableMemberDescriptor.mo89338e()) == null) ? CollectionsKt.emptyList() : collectionMo89338e;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final FqName m92869k(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqNameUnsafe fqNameUnsafeM92874p = m92874p(declarationDescriptor);
        if (!fqNameUnsafeM92874p.m91953f()) {
            fqNameUnsafeM92874p = null;
        }
        if (fqNameUnsafeM92874p != null) {
            return fqNameUnsafeM92874p.m91959m();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final ClassDescriptor m92870l(@NotNull AnnotationDescriptor annotationDescriptor) {
        annotationDescriptor.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = annotationDescriptor.getType().mo92781G0().mo89207e();
        if (classifierDescriptorMo89207e instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo89207e;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final KotlinBuiltIns m92871m(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return m92877s(declarationDescriptor).mo89437f();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final ClassId m92872n(@Nullable ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor declarationDescriptorMo89190b;
        ClassId classIdM92872n;
        if (classifierDescriptor != null && (declarationDescriptorMo89190b = classifierDescriptor.mo89190b()) != null) {
            if (declarationDescriptorMo89190b instanceof PackageFragmentDescriptor) {
                FqName fqNameMo89453d = ((PackageFragmentDescriptor) declarationDescriptorMo89190b).mo89453d();
                Name name = classifierDescriptor.getName();
                name.getClass();
                return new ClassId(fqNameMo89453d, name);
            }
            if ((declarationDescriptorMo89190b instanceof ClassifierDescriptorWithTypeParameters) && (classIdM92872n = m92872n((ClassifierDescriptor) declarationDescriptorMo89190b)) != null) {
                Name name2 = classifierDescriptor.getName();
                name2.getClass();
                return classIdM92872n.m91927d(name2);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final FqName m92873o(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqName fqNameM92664n = DescriptorUtils.m92664n(declarationDescriptor);
        fqNameM92664n.getClass();
        return fqNameM92664n;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final FqNameUnsafe m92874p(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqNameUnsafe fqNameUnsafeM92663m = DescriptorUtils.m92663m(declarationDescriptor);
        fqNameUnsafeM92663m.getClass();
        return fqNameUnsafeM92663m;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final InlineClassRepresentation<SimpleType> m92875q(@Nullable ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationMo89191c0 = classDescriptor != null ? classDescriptor.mo89191c0() : null;
        if (valueClassRepresentationMo89191c0 instanceof InlineClassRepresentation) {
            return (InlineClassRepresentation) valueClassRepresentationMo89191c0;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final KotlinTypeRefiner m92876r(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.mo89436Q(KotlinTypeRefinerKt.m93806a());
        TypeRefinementSupport typeRefinementSupport = ref != null ? (TypeRefinementSupport) ref.m93837a() : null;
        return typeRefinementSupport instanceof TypeRefinementSupport.Enabled ? ((TypeRefinementSupport.Enabled) typeRefinementSupport).m93873b() : KotlinTypeRefiner.Default.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final ModuleDescriptor m92877s(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        ModuleDescriptor moduleDescriptorM92657g = DescriptorUtils.m92657g(declarationDescriptor);
        moduleDescriptorM92657g.getClass();
        return moduleDescriptorM92657g;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static final MultiFieldValueClassRepresentation<SimpleType> m92878t(@Nullable ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationMo89191c0 = classDescriptor != null ? classDescriptor.mo89191c0() : null;
        if (valueClassRepresentationMo89191c0 instanceof MultiFieldValueClassRepresentation) {
            return (MultiFieldValueClassRepresentation) valueClassRepresentationMo89191c0;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final Sequence<DeclarationDescriptor> m92879u(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return SequencesKt___SequencesKt.m94200z(m92880v(declarationDescriptor), 1);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final Sequence<DeclarationDescriptor> m92880v(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return SequencesKt__SequencesKt.m94165n(declarationDescriptor, uwd.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final CallableMemberDescriptor m92881w(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor propertyDescriptorMo89473d0 = ((PropertyAccessorDescriptor) callableMemberDescriptor).mo89473d0();
        propertyDescriptorMo89473d0.getClass();
        return propertyDescriptorMo89473d0;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static final ClassDescriptor m92882x(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        for (KotlinType kotlinType : classDescriptor.mo89349o().mo92781G0().mo89569c()) {
            if (!KotlinBuiltIns.m89070c0(kotlinType)) {
                ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
                if (DescriptorUtils.m92673w(classifierDescriptorMo89207e)) {
                    classifierDescriptorMo89207e.getClass();
                    return (ClassDescriptor) classifierDescriptorMo89207e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m92883y(@NotNull ModuleDescriptor moduleDescriptor) {
        TypeRefinementSupport typeRefinementSupport;
        moduleDescriptor.getClass();
        kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.mo89436Q(KotlinTypeRefinerKt.m93806a());
        return (ref == null || (typeRefinementSupport = (TypeRefinementSupport) ref.m93837a()) == null || !typeRefinementSupport.m93872a()) ? false : true;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final Sequence<CallableMemberDescriptor> m92884z(@NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        callableMemberDescriptor.getClass();
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor.mo89336a();
        }
        Sequence sequenceM94171t = SequencesKt__SequencesKt.m94171t(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> collectionMo89338e = callableMemberDescriptor.mo89338e();
        collectionMo89338e.getClass();
        return SequencesKt___SequencesKt.m94189R(sequenceM94171t, SequencesKt___SequencesKt.m94180I(CollectionsKt.asSequence(collectionMo89338e), new wwd(z)));
    }
}
