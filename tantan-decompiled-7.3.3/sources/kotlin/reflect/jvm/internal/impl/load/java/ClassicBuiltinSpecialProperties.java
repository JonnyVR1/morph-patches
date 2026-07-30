package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.k85;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ClassicBuiltinSpecialProperties {

    @NotNull
    public static final ClassicBuiltinSpecialProperties INSTANCE = new ClassicBuiltinSpecialProperties();

    private ClassicBuiltinSpecialProperties() {
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m90255c(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return INSTANCE.m90257d(callableMemberDescriptor);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m90256b(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        callableMemberDescriptor.getClass();
        KotlinBuiltIns.m89077h0(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorM92867i = DescriptorUtilsKt.m92867i(DescriptorUtilsKt.m92881w(callableMemberDescriptor), false, k85.INSTANCE, 1, null);
        if (callableMemberDescriptorM92867i == null || (name = BuiltinSpecialProperties.INSTANCE.m90246a().get(DescriptorUtilsKt.m92873o(callableMemberDescriptorM92867i))) == null) {
            return null;
        }
        return name.m91973b();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90257d(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        if (BuiltinSpecialProperties.INSTANCE.m90249d().contains(callableMemberDescriptor.getName())) {
            return m90258e(callableMemberDescriptor);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m90258e(CallableMemberDescriptor callableMemberDescriptor) {
        if (CollectionsKt.contains(BuiltinSpecialProperties.INSTANCE.m90248c(), DescriptorUtilsKt.m92869k(callableMemberDescriptor)) && callableMemberDescriptor.mo89339g().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.m89077h0(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> collectionMo89338e = callableMemberDescriptor.mo89338e();
        collectionMo89338e.getClass();
        Collection<? extends CallableMemberDescriptor> collection = collectionMo89338e;
        if (collection.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
            callableMemberDescriptor2.getClass();
            if (classicBuiltinSpecialProperties.m90257d(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }
}
