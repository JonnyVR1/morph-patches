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
import p149l.cn5;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {

    @NotNull
    public static final CliSealedClassInheritorsProvider INSTANCE = new CliSealedClassInheritorsProvider();

    private CliSealedClassInheritorsProvider() {
    }

    /* JADX INFO: renamed from: b */
    public static final void m91709b(ClassDescriptor classDescriptor, LinkedHashSet<ClassDescriptor> linkedHashSet, MemberScope memberScope, boolean z) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.m92067a(memberScope, DescriptorKindFilter.f65897s, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptorMo88597j = (ClassDescriptor) declarationDescriptor;
                if (classDescriptorMo88597j.mo88307n0()) {
                    Name name = classDescriptorMo88597j.getName();
                    name.getClass();
                    ClassifierDescriptor classifierDescriptorMo89642f = memberScope.mo89642f(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    classDescriptorMo88597j = classifierDescriptorMo89642f instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89642f : classifierDescriptorMo89642f instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorMo89642f).mo88597j() : null;
                }
                if (classDescriptorMo88597j != null) {
                    if (DescriptorUtils.m91785z(classDescriptorMo88597j, classDescriptor)) {
                        linkedHashSet.add(classDescriptorMo88597j);
                    }
                    if (z) {
                        MemberScope memberScopeMo88454C = classDescriptorMo88597j.mo88454C();
                        memberScopeMo88454C.getClass();
                        m91709b(classDescriptor, linkedHashSet, memberScopeMo88454C, z);
                    }
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public Collection<ClassDescriptor> m91710a(@NotNull ClassDescriptor classDescriptor, boolean z) {
        DeclarationDescriptor next;
        DeclarationDescriptor declarationDescriptorMo88299b;
        classDescriptor.getClass();
        if (classDescriptor.mo88303i() != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.m91988u(classDescriptor).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof PackageFragmentDescriptor));
            declarationDescriptorMo88299b = next;
        } else {
            declarationDescriptorMo88299b = classDescriptor.mo88299b();
        }
        if (declarationDescriptorMo88299b instanceof PackageFragmentDescriptor) {
            m91709b(classDescriptor, linkedHashSet, ((PackageFragmentDescriptor) declarationDescriptorMo88299b).mo88425n(), z);
        }
        MemberScope memberScopeMo88454C = classDescriptor.mo88454C();
        memberScopeMo88454C.getClass();
        m91709b(classDescriptor, linkedHashSet, memberScopeMo88454C, true);
        return CollectionsKt.sortedWith(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return cn5.m107733d(DescriptorUtilsKt.m91982o((ClassDescriptor) t).m91046a(), DescriptorUtilsKt.m91982o((ClassDescriptor) t2).m91046a());
            }
        });
    }
}
