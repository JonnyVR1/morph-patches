package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import org.jetbrains.annotations.NotNull;
import p153l.go5;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {

    @NotNull
    public static final CliSealedClassInheritorsProvider INSTANCE = new CliSealedClassInheritorsProvider();

    private CliSealedClassInheritorsProvider() {
    }

    /* JADX INFO: renamed from: b */
    public static final void m92600b(ClassDescriptor classDescriptor, LinkedHashSet<ClassDescriptor> linkedHashSet, MemberScope memberScope, boolean z) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.m92958a(memberScope, DescriptorKindFilter.f66571s, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptorMo89488j = (ClassDescriptor) declarationDescriptor;
                if (classDescriptorMo89488j.mo89198n0()) {
                    Name name = classDescriptorMo89488j.getName();
                    name.getClass();
                    ClassifierDescriptor classifierDescriptorMo90533f = memberScope.mo90533f(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    classDescriptorMo89488j = classifierDescriptorMo90533f instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo90533f : classifierDescriptorMo90533f instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorMo90533f).mo89488j() : null;
                }
                if (classDescriptorMo89488j != null) {
                    if (DescriptorUtils.m92676z(classDescriptorMo89488j, classDescriptor)) {
                        linkedHashSet.add(classDescriptorMo89488j);
                    }
                    if (z) {
                        MemberScope memberScopeMo89345C = classDescriptorMo89488j.mo89345C();
                        memberScopeMo89345C.getClass();
                        m92600b(classDescriptor, linkedHashSet, memberScopeMo89345C, z);
                    }
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public Collection<ClassDescriptor> m92601a(@NotNull ClassDescriptor classDescriptor, boolean z) {
        DeclarationDescriptor next;
        DeclarationDescriptor declarationDescriptorMo89190b;
        classDescriptor.getClass();
        if (classDescriptor.mo89194i() != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.m92879u(classDescriptor).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof PackageFragmentDescriptor));
            declarationDescriptorMo89190b = next;
        } else {
            declarationDescriptorMo89190b = classDescriptor.mo89190b();
        }
        if (declarationDescriptorMo89190b instanceof PackageFragmentDescriptor) {
            m92600b(classDescriptor, linkedHashSet, ((PackageFragmentDescriptor) declarationDescriptorMo89190b).mo89316n(), z);
        }
        MemberScope memberScopeMo89345C = classDescriptor.mo89345C();
        memberScopeMo89345C.getClass();
        m92600b(classDescriptor, linkedHashSet, memberScopeMo89345C, true);
        return CollectionsKt.sortedWith(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return go5.m131087d(DescriptorUtilsKt.m92873o((ClassDescriptor) t).m91937a(), DescriptorUtilsKt.m92873o((ClassDescriptor) t2).m91937a());
            }
        });
    }
}
