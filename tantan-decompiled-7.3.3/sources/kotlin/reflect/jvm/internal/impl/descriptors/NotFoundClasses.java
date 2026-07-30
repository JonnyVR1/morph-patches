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
import kotlin.ranges.C15274a;
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
import p153l.jx40;
import p153l.kx40;
import p153l.p7f;
import p153l.poj0;

/* JADX INFO: loaded from: classes2.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final StorageManager f64719a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ModuleDescriptor f64720b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> f64721c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final MemoizedFunctionToNotNull<C15303a, ClassDescriptor> f64722d;

    @SourceDebugExtension
    public static final class MockClassDescriptor extends ClassDescriptorBase {

        /* JADX INFO: renamed from: h */
        public final boolean f64723h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final List<TypeParameterDescriptor> f64724i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final ClassTypeConstructorImpl f64725j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, boolean z, int i) {
            super(storageManager, declarationDescriptor, name, SourceElement.f64737a, false);
            storageManager.getClass();
            declarationDescriptor.getClass();
            name.getClass();
            this.f64723h = z;
            IntRange intRangeM88496l = C15274a.m88496l(0, i);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM88496l, 10));
            Iterator<Integer> it = intRangeM88496l.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(TypeParameterDescriptorImpl.m89809K0(this, Annotations.Companion.m89532b(), false, Variance.INVARIANT, Name.m91970i(p7f.GPS_DIRECTION_TRUE + iNextInt), iNextInt, storageManager));
            }
            this.f64724i = arrayList;
            this.f64725j = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.m89500g(this), SetsKt.setOf(DescriptorUtilsKt.m92877s(this).mo89437f().m89123i()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* JADX INFO: renamed from: C0 */
        public boolean mo89181C0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public MemberScope.Empty mo89199o0() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        @NotNull
        /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
        public ClassTypeConstructorImpl mo89196l() {
            return this.f64725j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        @NotNull
        /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
        public MemberScope.Empty mo89197l0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return MemberScope.Empty.INSTANCE;
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
        public boolean mo89195j0() {
            return false;
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
            return this.f64724i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* JADX INFO: renamed from: p0 */
        public ClassDescriptor mo89201p0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* JADX INFO: renamed from: q */
        public boolean mo89202q() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        /* JADX INFO: renamed from: t */
        public boolean mo89203t() {
            return this.f64723h;
        }

        @NotNull
        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* JADX INFO: renamed from: v */
        public ClassConstructorDescriptor mo89204v() {
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$a */
    public static final class C15303a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final ClassId f64726a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final List<Integer> f64727b;

        public C15303a(@NotNull ClassId classId, @NotNull List<Integer> list) {
            classId.getClass();
            list.getClass();
            this.f64726a = classId;
            this.f64727b = list;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m89451a() {
            return this.f64726a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<Integer> m89452b() {
            return this.f64727b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15303a)) {
                return false;
            }
            C15303a c15303a = (C15303a) obj;
            return Intrinsics.m88377d(this.f64726a, c15303a.f64726a) && Intrinsics.m88377d(this.f64727b, c15303a.f64727b);
        }

        public int hashCode() {
            return (this.f64726a.hashCode() * 31) + this.f64727b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ClassRequest(classId=" + this.f64726a + ", typeParametersCount=" + this.f64727b + ')';
        }
    }

    public NotFoundClasses(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.f64719a = storageManager;
        this.f64720b = moduleDescriptor;
        this.f64721c = storageManager.mo93341i(new jx40(this));
        this.f64722d = storageManager.mo93341i(new kx40(this));
    }

    /* JADX INFO: renamed from: c */
    public static final ClassDescriptor m89445c(NotFoundClasses notFoundClasses, C15303a c15303a) {
        PackageFragmentDescriptor packageFragmentDescriptorInvoke;
        c15303a.getClass();
        ClassId classIdM89451a = c15303a.m89451a();
        List<Integer> listM89452b = c15303a.m89452b();
        if (classIdM89451a.m91932i()) {
            poj0.m173108a("Unresolved local class: ", classIdM89451a);
            return null;
        }
        ClassId classIdM91928e = classIdM89451a.m91928e();
        if (classIdM91928e == null || (packageFragmentDescriptorInvoke = notFoundClasses.m89447d(classIdM91928e, CollectionsKt.drop(listM89452b, 1))) == null) {
            packageFragmentDescriptorInvoke = notFoundClasses.f64721c.invoke(classIdM89451a.m91929f());
        }
        DeclarationDescriptor declarationDescriptor = packageFragmentDescriptorInvoke;
        boolean zM91933j = classIdM89451a.m91933j();
        StorageManager storageManager = notFoundClasses.f64719a;
        Name nameM91931h = classIdM89451a.m91931h();
        Integer num = (Integer) CollectionsKt.firstOrNull((List) listM89452b);
        return new MockClassDescriptor(storageManager, declarationDescriptor, nameM91931h, zM91933j, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final PackageFragmentDescriptor m89446e(NotFoundClasses notFoundClasses, FqName fqName) {
        fqName.getClass();
        return new EmptyPackageFragmentDescriptor(notFoundClasses.f64720b, fqName);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ClassDescriptor m89447d(@NotNull ClassId classId, @NotNull List<Integer> list) {
        classId.getClass();
        list.getClass();
        return this.f64722d.invoke(new C15303a(classId, list));
    }
}
