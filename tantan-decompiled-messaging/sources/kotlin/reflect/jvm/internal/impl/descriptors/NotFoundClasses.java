package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.lfj0;
import p149l.vo40;
import p149l.wo40;

/* JADX INFO: loaded from: classes2.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final StorageManager f64045a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f64046b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> f64047c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final MemoizedFunctionToNotNull<C15196a, ClassDescriptor> f64048d;

    @SourceDebugExtension
    public static final class MockClassDescriptor extends ClassDescriptorBase {

        /* JADX INFO: renamed from: h */
        public final boolean f64049h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final List<TypeParameterDescriptor> f64050i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final ClassTypeConstructorImpl f64051j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, boolean z, int i) {
            super(storageManager, declarationDescriptor, name, SourceElement.f64063a, false);
            storageManager.getClass();
            declarationDescriptor.getClass();
            name.getClass();
            this.f64049h = z;
            IntRange intRangeM87605k = C15167a.m87605k(0, i);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM87605k, 10));
            Iterator<Integer> it = intRangeM87605k.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(TypeParameterDescriptorImpl.m88918K0(this, Annotations.Companion.m88641b(), false, Variance.INVARIANT, Name.m91079i(j6f.GPS_DIRECTION_TRUE + iNextInt), iNextInt, storageManager));
            }
            this.f64050i = arrayList;
            this.f64051j = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.m88609g(this), SetsKt.setOf(DescriptorUtilsKt.m91986s(this).mo88546f().m88232i()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* JADX INFO: renamed from: C0 */
        public boolean mo88290C0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public MemberScope.Empty mo88308o0() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        @NotNull
        /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
        public ClassTypeConstructorImpl mo88305l() {
            return this.f64051j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        @NotNull
        /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
        public MemberScope.Empty mo88306l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return MemberScope.Empty.INSTANCE;
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
        public Collection<ClassConstructorDescriptor> getConstructors() {
            return SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public ClassKind getKind() {
            return ClassKind.CLASS;
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
            return Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        /* JADX INFO: renamed from: n0 */
        public boolean mo88307n0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        @NotNull
        /* JADX INFO: renamed from: p */
        public List<TypeParameterDescriptor> mo88309p() {
            return this.f64050i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* JADX INFO: renamed from: p0 */
        public ClassDescriptor mo88310p0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* JADX INFO: renamed from: q */
        public boolean mo88311q() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        /* JADX INFO: renamed from: t */
        public boolean mo88312t() {
            return this.f64049h;
        }

        @NotNull
        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* JADX INFO: renamed from: v */
        public ClassConstructorDescriptor mo88313v() {
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$a */
    public static final class C15196a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ClassId f64052a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final List<Integer> f64053b;

        public C15196a(@NotNull ClassId classId, @NotNull List<Integer> list) {
            classId.getClass();
            list.getClass();
            this.f64052a = classId;
            this.f64053b = list;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m88560a() {
            return this.f64052a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<Integer> m88561b() {
            return this.f64053b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15196a)) {
                return false;
            }
            C15196a c15196a = (C15196a) obj;
            return Intrinsics.m87488d(this.f64052a, c15196a.f64052a) && Intrinsics.m87488d(this.f64053b, c15196a.f64053b);
        }

        public int hashCode() {
            return (this.f64052a.hashCode() * 31) + this.f64053b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ClassRequest(classId=" + this.f64052a + ", typeParametersCount=" + this.f64053b + ')';
        }
    }

    public NotFoundClasses(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.f64045a = storageManager;
        this.f64046b = moduleDescriptor;
        this.f64047c = storageManager.mo92450i(new vo40(this));
        this.f64048d = storageManager.mo92450i(new wo40(this));
    }

    /* JADX INFO: renamed from: c */
    public static final ClassDescriptor m88554c(NotFoundClasses notFoundClasses, C15196a c15196a) {
        PackageFragmentDescriptor packageFragmentDescriptorInvoke;
        c15196a.getClass();
        ClassId classIdM88560a = c15196a.m88560a();
        List<Integer> listM88561b = c15196a.m88561b();
        if (classIdM88560a.m91041i()) {
            lfj0.m149710a("Unresolved local class: ", classIdM88560a);
            return null;
        }
        ClassId classIdM91037e = classIdM88560a.m91037e();
        if (classIdM91037e == null || (packageFragmentDescriptorInvoke = notFoundClasses.m88556d(classIdM91037e, CollectionsKt.drop(listM88561b, 1))) == null) {
            packageFragmentDescriptorInvoke = notFoundClasses.f64047c.invoke(classIdM88560a.m91038f());
        }
        DeclarationDescriptor declarationDescriptor = packageFragmentDescriptorInvoke;
        boolean zM91042j = classIdM88560a.m91042j();
        StorageManager storageManager = notFoundClasses.f64045a;
        Name nameM91040h = classIdM88560a.m91040h();
        Integer num = (Integer) CollectionsKt.firstOrNull((List) listM88561b);
        return new MockClassDescriptor(storageManager, declarationDescriptor, nameM91040h, zM91042j, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final PackageFragmentDescriptor m88555e(NotFoundClasses notFoundClasses, FqName fqName) {
        fqName.getClass();
        return new EmptyPackageFragmentDescriptor(notFoundClasses.f64046b, fqName);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ClassDescriptor m88556d(@NotNull ClassId classId, @NotNull List<Integer> list) {
        classId.getClass();
        list.getClass();
        return this.f64048d.invoke(new C15196a(classId, list));
    }
}
