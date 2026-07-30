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
import p149l.fvd;
import p149l.gvd;
import p149l.hvd;
import p149l.ivd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorUtilsKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Name f65866a;

    static {
        Name nameM91079i = Name.m91079i("value");
        nameM91079i.getClass();
        f65866a = nameM91079i;
    }

    /* JADX INFO: renamed from: A */
    public static final Sequence m91966A(boolean z, CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return m91993z(callableMemberDescriptor, z);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public static final ClassDescriptor m91967B(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        moduleDescriptor.getClass();
        fqName.getClass();
        lookupLocation.getClass();
        fqName.m91048c();
        ClassifierDescriptor classifierDescriptorMo89642f = moduleDescriptor.mo88543I(fqName.m91049d()).mo88576n().mo89642f(fqName.m91051f(), lookupLocation);
        if (classifierDescriptorMo89642f instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo89642f;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final DeclarationDescriptor m91968a(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor.mo88299b();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m91973f(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        valueParameterDescriptor.getClass();
        Boolean boolM93189e = DFS.m93189e(CollectionsKt.listOf(valueParameterDescriptor), fvd.INSTANCE, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        boolM93189e.getClass();
        return boolM93189e.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final Iterable m91974g(ValueParameterDescriptor valueParameterDescriptor) {
        Collection<ValueParameterDescriptor> collectionMo88447e = valueParameterDescriptor.mo88447e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo88447e, 10));
        Iterator<T> it = collectionMo88447e.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).mo88445a());
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final CallableMemberDescriptor m91975h(@NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z, @NotNull final Function1<? super CallableMemberDescriptor, Boolean> function1) {
        callableMemberDescriptor.getClass();
        function1.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return (CallableMemberDescriptor) DFS.m93186b(CollectionsKt.listOf(callableMemberDescriptor), new hvd(z), new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo91994b(CallableMemberDescriptor callableMemberDescriptor2) {
                callableMemberDescriptor2.getClass();
                if (objectRef.element == null && function1.invoke(callableMemberDescriptor2).booleanValue()) {
                    objectRef.element = callableMemberDescriptor2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean mo87633a(CallableMemberDescriptor callableMemberDescriptor2) {
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
    public static /* synthetic */ CallableMemberDescriptor m91976i(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m91975h(callableMemberDescriptor, z, function1);
    }

    /* JADX INFO: renamed from: j */
    public static final Iterable m91977j(boolean z, CallableMemberDescriptor callableMemberDescriptor) {
        Collection<? extends CallableMemberDescriptor> collectionMo88447e;
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.mo88445a() : null;
        }
        return (callableMemberDescriptor == null || (collectionMo88447e = callableMemberDescriptor.mo88447e()) == null) ? CollectionsKt.emptyList() : collectionMo88447e;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final FqName m91978k(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqNameUnsafe fqNameUnsafeM91983p = m91983p(declarationDescriptor);
        if (!fqNameUnsafeM91983p.m91062f()) {
            fqNameUnsafeM91983p = null;
        }
        if (fqNameUnsafeM91983p != null) {
            return fqNameUnsafeM91983p.m91068m();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final ClassDescriptor m91979l(@NotNull AnnotationDescriptor annotationDescriptor) {
        annotationDescriptor.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = annotationDescriptor.getType().mo91890G0().mo88316e();
        if (classifierDescriptorMo88316e instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo88316e;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final KotlinBuiltIns m91980m(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return m91986s(declarationDescriptor).mo88546f();
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final ClassId m91981n(@Nullable ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor declarationDescriptorMo88299b;
        ClassId classIdM91981n;
        if (classifierDescriptor != null && (declarationDescriptorMo88299b = classifierDescriptor.mo88299b()) != null) {
            if (declarationDescriptorMo88299b instanceof PackageFragmentDescriptor) {
                FqName fqNameMo88562d = ((PackageFragmentDescriptor) declarationDescriptorMo88299b).mo88562d();
                Name name = classifierDescriptor.getName();
                name.getClass();
                return new ClassId(fqNameMo88562d, name);
            }
            if ((declarationDescriptorMo88299b instanceof ClassifierDescriptorWithTypeParameters) && (classIdM91981n = m91981n((ClassifierDescriptor) declarationDescriptorMo88299b)) != null) {
                Name name2 = classifierDescriptor.getName();
                name2.getClass();
                return classIdM91981n.m91036d(name2);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final FqName m91982o(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqName fqNameM91773n = DescriptorUtils.m91773n(declarationDescriptor);
        fqNameM91773n.getClass();
        return fqNameM91773n;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final FqNameUnsafe m91983p(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        FqNameUnsafe fqNameUnsafeM91772m = DescriptorUtils.m91772m(declarationDescriptor);
        fqNameUnsafeM91772m.getClass();
        return fqNameUnsafeM91772m;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final InlineClassRepresentation<SimpleType> m91984q(@Nullable ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationMo88300c0 = classDescriptor != null ? classDescriptor.mo88300c0() : null;
        if (valueClassRepresentationMo88300c0 instanceof InlineClassRepresentation) {
            return (InlineClassRepresentation) valueClassRepresentationMo88300c0;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final KotlinTypeRefiner m91985r(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.mo88545Q(KotlinTypeRefinerKt.m92915a());
        TypeRefinementSupport typeRefinementSupport = ref != null ? (TypeRefinementSupport) ref.m92946a() : null;
        return typeRefinementSupport instanceof TypeRefinementSupport.Enabled ? ((TypeRefinementSupport.Enabled) typeRefinementSupport).m92982b() : KotlinTypeRefiner.Default.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final ModuleDescriptor m91986s(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        ModuleDescriptor moduleDescriptorM91766g = DescriptorUtils.m91766g(declarationDescriptor);
        moduleDescriptorM91766g.getClass();
        return moduleDescriptorM91766g;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static final MultiFieldValueClassRepresentation<SimpleType> m91987t(@Nullable ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationMo88300c0 = classDescriptor != null ? classDescriptor.mo88300c0() : null;
        if (valueClassRepresentationMo88300c0 instanceof MultiFieldValueClassRepresentation) {
            return (MultiFieldValueClassRepresentation) valueClassRepresentationMo88300c0;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final Sequence<DeclarationDescriptor> m91988u(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return SequencesKt___SequencesKt.m93309z(m91989v(declarationDescriptor), 1);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final Sequence<DeclarationDescriptor> m91989v(@NotNull DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return SequencesKt__SequencesKt.m93274n(declarationDescriptor, gvd.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final CallableMemberDescriptor m91990w(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor propertyDescriptorMo88582d0 = ((PropertyAccessorDescriptor) callableMemberDescriptor).mo88582d0();
        propertyDescriptorMo88582d0.getClass();
        return propertyDescriptorMo88582d0;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static final ClassDescriptor m91991x(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        for (KotlinType kotlinType : classDescriptor.mo88458o().mo91890G0().mo88678c()) {
            if (!KotlinBuiltIns.m88179c0(kotlinType)) {
                ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
                if (DescriptorUtils.m91782w(classifierDescriptorMo88316e)) {
                    classifierDescriptorMo88316e.getClass();
                    return (ClassDescriptor) classifierDescriptorMo88316e;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m91992y(@NotNull ModuleDescriptor moduleDescriptor) {
        TypeRefinementSupport typeRefinementSupport;
        moduleDescriptor.getClass();
        kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.mo88545Q(KotlinTypeRefinerKt.m92915a());
        return (ref == null || (typeRefinementSupport = (TypeRefinementSupport) ref.m92946a()) == null || !typeRefinementSupport.m92981a()) ? false : true;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final Sequence<CallableMemberDescriptor> m91993z(@NotNull CallableMemberDescriptor callableMemberDescriptor, boolean z) {
        callableMemberDescriptor.getClass();
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor.mo88445a();
        }
        Sequence sequenceM93280t = SequencesKt__SequencesKt.m93280t(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> collectionMo88447e = callableMemberDescriptor.mo88447e();
        collectionMo88447e.getClass();
        return SequencesKt___SequencesKt.m93298R(sequenceM93280t, SequencesKt___SequencesKt.m93289I(CollectionsKt.asSequence(collectionMo88447e), new ivd(z)));
    }
}
