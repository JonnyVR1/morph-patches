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
    public static final ClassId f64617m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final ClassId f64618n;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final StorageManager f64619e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final PackageFragmentDescriptor f64620f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final FunctionTypeKind f64621g;

    /* JADX INFO: renamed from: h */
    public final int f64622h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final C15288a f64623i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final FunctionClassScope f64624j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<TypeParameterDescriptor> f64625k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final FunctionClassKind f64626l;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor$a */
    @SourceDebugExtension
    public final class C15288a extends AbstractClassTypeConstructor {
        public C15288a() {
            super(FunctionClassDescriptor.this.f64619e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public FunctionClassDescriptor mo89207e() {
            return FunctionClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: g */
        public boolean mo89208g() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.f64625k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: s */
        public Collection<KotlinType> mo89209s() {
            List listListOf;
            FunctionTypeKind functionTypeKindM89186N0 = FunctionClassDescriptor.this.m89186N0();
            FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
            if (Intrinsics.m88377d(functionTypeKindM89186N0, function)) {
                listListOf = CollectionsKt.listOf(FunctionClassDescriptor.f64617m);
            } else if (Intrinsics.m88377d(functionTypeKindM89186N0, FunctionTypeKind.KFunction.INSTANCE)) {
                listListOf = CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.f64618n, new ClassId(StandardNames.f64473A, function.m89220c(FunctionClassDescriptor.this.m89182J0()))});
            } else {
                FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
                if (Intrinsics.m88377d(functionTypeKindM89186N0, suspendFunction)) {
                    listListOf = CollectionsKt.listOf(FunctionClassDescriptor.f64617m);
                } else {
                    if (!Intrinsics.m88377d(functionTypeKindM89186N0, FunctionTypeKind.KSuspendFunction.INSTANCE)) {
                        AddToStdlibKt.m94125b(null, 1, null);
                        throw new KotlinNothingValueException();
                    }
                    listListOf = CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.f64618n, new ClassId(StandardNames.f64500r, suspendFunction.m89220c(FunctionClassDescriptor.this.m89182J0()))});
                }
            }
            ModuleDescriptor moduleDescriptorMo89190b = FunctionClassDescriptor.this.f64620f.mo89190b();
            List<ClassId> list = listListOf;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ClassId classId : list) {
                ClassDescriptor classDescriptorM89398b = FindClassInModuleKt.m89398b(moduleDescriptorMo89190b, classId);
                if (classDescriptorM89398b == null) {
                    throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
                List listTakeLast = CollectionsKt.takeLast(getParameters(), classDescriptorM89398b.mo89196l().getParameters().size());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTakeLast, 10));
                Iterator it = listTakeLast.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).mo89349o()));
                }
                arrayList.add(KotlinTypeFactory.m93522h(TypeAttributes.Companion.m93600k(), classDescriptorM89398b, arrayList2));
            }
            return CollectionsKt.toList(arrayList);
        }

        @NotNull
        public String toString() {
            return mo89207e().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        /* JADX INFO: renamed from: w */
        public SupertypeLoopChecker mo89210w() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }
    }

    static {
        FqName fqName = StandardNames.f64473A;
        Name nameM91970i = Name.m91970i("Function");
        nameM91970i.getClass();
        f64617m = new ClassId(fqName, nameM91970i);
        FqName fqName2 = StandardNames.f64506x;
        Name nameM91970i2 = Name.m91970i("KFunction");
        nameM91970i2.getClass();
        f64618n = new ClassId(fqName2, nameM91970i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(@NotNull StorageManager storageManager, @NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull FunctionTypeKind functionTypeKind, int i) {
        super(storageManager, functionTypeKind.m89220c(i));
        storageManager.getClass();
        packageFragmentDescriptor.getClass();
        functionTypeKind.getClass();
        this.f64619e = storageManager;
        this.f64620f = packageFragmentDescriptor;
        this.f64621g = functionTypeKind;
        this.f64622h = i;
        this.f64623i = new C15288a();
        this.f64624j = new FunctionClassScope(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            m89175D0(arrayList, this, Variance.IN_VARIANCE, "P" + iNextInt);
            arrayList2.add(Unit.INSTANCE);
        }
        m89175D0(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.f64625k = CollectionsKt.toList(arrayList);
        this.f64626l = FunctionClassKind.Companion.m89211a(this.f64621g);
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m89175D0(ArrayList<TypeParameterDescriptor> arrayList, FunctionClassDescriptor functionClassDescriptor, Variance variance, String str) {
        arrayList.add(TypeParameterDescriptorImpl.m89809K0(functionClassDescriptor, Annotations.Companion.m89532b(), false, variance, Name.m91970i(str), arrayList.size(), functionClassDescriptor.f64619e));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: C0 */
    public boolean mo89181C0() {
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public final int m89182J0() {
        return this.f64622h;
    }

    @Nullable
    /* JADX INFO: renamed from: K0 */
    public Void m89183K0() {
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
    public PackageFragmentDescriptor mo89190b() {
        return this.f64620f;
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public final FunctionTypeKind m89186N0() {
        return this.f64621g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public MemberScope.Empty mo89199o0() {
        return MemberScope.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public FunctionClassScope mo89197l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this.f64624j;
    }

    @Nullable
    /* JADX INFO: renamed from: Q0 */
    public Void m89189Q0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public ValueClassRepresentation<SimpleType> mo89191c0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: e0 */
    public boolean mo89192e0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.m89532b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.f64737a;
        sourceElement.getClass();
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f64700e;
        descriptorVisibility.getClass();
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: h0 */
    public boolean mo89193h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    /* JADX INFO: renamed from: i */
    public Modality mo89194i() {
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
    public boolean mo89195j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo89196l() {
        return this.f64623i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* JADX INFO: renamed from: n0 */
    public boolean mo89198n0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<TypeParameterDescriptor> mo89200p() {
        return this.f64625k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: p0 */
    public /* bridge */ /* synthetic */ ClassDescriptor mo89201p0() {
        return (ClassDescriptor) m89183K0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: q */
    public boolean mo89202q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    /* JADX INFO: renamed from: t */
    public boolean mo89203t() {
        return false;
    }

    @NotNull
    public String toString() {
        String strM91973b = getName().m91973b();
        strM91973b.getClass();
        return strM91973b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: v */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor mo89204v() {
        return (ClassConstructorDescriptor) m89189Q0();
    }
}
