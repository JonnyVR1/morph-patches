package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FunctionClassDescriptor extends AbstractClassDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final ClassId f63943m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final ClassId f63944n;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final StorageManager f63945e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final PackageFragmentDescriptor f63946f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final FunctionTypeKind f63947g;

    /* JADX INFO: renamed from: h */
    public final int f63948h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final C15181a f63949i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final FunctionClassScope f63950j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<TypeParameterDescriptor> f63951k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final FunctionClassKind f63952l;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor$a */
    @SourceDebugExtension
    public final class C15181a extends AbstractClassTypeConstructor {
        public C15181a() {
            super(FunctionClassDescriptor.this.f63945e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public FunctionClassDescriptor mo88316e() {
            return FunctionClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo88317g() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.f63951k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: s */
        public Collection<KotlinType> mo88318s() {
            List listListOf;
            FunctionTypeKind functionTypeKindM88295N0 = FunctionClassDescriptor.this.m88295N0();
            FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
            if (Intrinsics.m87488d(functionTypeKindM88295N0, function)) {
                listListOf = CollectionsKt.listOf(FunctionClassDescriptor.f63943m);
            } else if (Intrinsics.m87488d(functionTypeKindM88295N0, FunctionTypeKind.KFunction.INSTANCE)) {
                listListOf = CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.f63944n, new ClassId(StandardNames.f63799A, function.m88329c(FunctionClassDescriptor.this.m88291J0()))});
            } else {
                FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
                if (Intrinsics.m87488d(functionTypeKindM88295N0, suspendFunction)) {
                    listListOf = CollectionsKt.listOf(FunctionClassDescriptor.f63943m);
                } else {
                    if (!Intrinsics.m87488d(functionTypeKindM88295N0, FunctionTypeKind.KSuspendFunction.INSTANCE)) {
                        AddToStdlibKt.m93234b(null, 1, null);
                        throw new KotlinNothingValueException();
                    }
                    listListOf = CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.f63944n, new ClassId(StandardNames.f63826r, suspendFunction.m88329c(FunctionClassDescriptor.this.m88291J0()))});
                }
            }
            ModuleDescriptor moduleDescriptorMo88299b = FunctionClassDescriptor.this.f63946f.mo88299b();
            List<ClassId> list = listListOf;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ClassId classId : list) {
                ClassDescriptor classDescriptorM88507b = FindClassInModuleKt.m88507b(moduleDescriptorMo88299b, classId);
                if (classDescriptorM88507b == null) {
                    throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
                List listTakeLast = CollectionsKt.takeLast(getParameters(), classDescriptorM88507b.mo88305l().getParameters().size());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTakeLast, 10));
                Iterator it = listTakeLast.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).mo88458o()));
                }
                arrayList.add(KotlinTypeFactory.m92631h(TypeAttributes.Companion.m92709k(), classDescriptorM88507b, arrayList2));
            }
            return CollectionsKt.toList(arrayList);
        }

        @NotNull
        public String toString() {
            return mo88316e().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: w */
        public SupertypeLoopChecker mo88319w() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }
    }

    static {
        FqName fqName = StandardNames.f63799A;
        Name nameM91079i = Name.m91079i("Function");
        nameM91079i.getClass();
        f63943m = new ClassId(fqName, nameM91079i);
        FqName fqName2 = StandardNames.f63832x;
        Name nameM91079i2 = Name.m91079i("KFunction");
        nameM91079i2.getClass();
        f63944n = new ClassId(fqName2, nameM91079i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(@NotNull StorageManager storageManager, @NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull FunctionTypeKind functionTypeKind, int i) {
        super(storageManager, functionTypeKind.m88329c(i));
        storageManager.getClass();
        packageFragmentDescriptor.getClass();
        functionTypeKind.getClass();
        this.f63945e = storageManager;
        this.f63946f = packageFragmentDescriptor;
        this.f63947g = functionTypeKind;
        this.f63948h = i;
        this.f63949i = new C15181a();
        this.f63950j = new FunctionClassScope(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            m88284D0(arrayList, this, Variance.IN_VARIANCE, "P" + iNextInt);
            arrayList2.add(Unit.INSTANCE);
        }
        m88284D0(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.f63951k = CollectionsKt.toList(arrayList);
        this.f63952l = FunctionClassKind.Companion.m88320a(this.f63947g);
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m88284D0(ArrayList<TypeParameterDescriptor> arrayList, FunctionClassDescriptor functionClassDescriptor, Variance variance, String str) {
        arrayList.add(TypeParameterDescriptorImpl.m88918K0(functionClassDescriptor, Annotations.Companion.m88641b(), false, variance, Name.m91079i(str), arrayList.size(), functionClassDescriptor.f63945e));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo88290C0() {
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m88291J0() {
        return this.f63948h;
    }

    @Nullable
    /* JADX INFO: renamed from: K0 */
    public Void m88292K0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List<ClassConstructorDescriptor> getConstructors() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public PackageFragmentDescriptor mo88299b() {
        return this.f63946f;
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public final FunctionTypeKind m88295N0() {
        return this.f63947g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public MemberScope.Empty mo88308o0() {
        return MemberScope.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public FunctionClassScope mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this.f63950j;
    }

    @Nullable
    /* JADX INFO: renamed from: Q0 */
    public Void m88298Q0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo88300c0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo88301e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.m88641b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.f64063a;
        sourceElement.getClass();
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64026e;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo88302h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo88303i() {
        return Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: j0 */
    public boolean mo88304j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo88305l() {
        return this.f63949i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo88307n0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo88309p() {
        return this.f63951k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: p0 */
    public /* bridge */ /* synthetic */ ClassDescriptor mo88310p0() {
        return (ClassDescriptor) m88292K0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo88311q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo88312t() {
        return false;
    }

    @NotNull
    public String toString() {
        String strM91082b = getName().m91082b();
        strM91082b.getClass();
        return strM91082b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: v */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor mo88313v() {
        return (ClassConstructorDescriptor) m88298Q0();
    }
}
