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
import p149l.j75;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ClassicBuiltinSpecialProperties {

    @NotNull
    public static final ClassicBuiltinSpecialProperties INSTANCE = new ClassicBuiltinSpecialProperties();

    private ClassicBuiltinSpecialProperties() {
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m89364c(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return INSTANCE.m89366d(callableMemberDescriptor);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m89365b(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        callableMemberDescriptor.getClass();
        KotlinBuiltIns.m88186h0(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorM91976i = DescriptorUtilsKt.m91976i(DescriptorUtilsKt.m91990w(callableMemberDescriptor), false, j75.INSTANCE, 1, null);
        if (callableMemberDescriptorM91976i == null || (name = BuiltinSpecialProperties.INSTANCE.m89355a().get(DescriptorUtilsKt.m91982o(callableMemberDescriptorM91976i))) == null) {
            return null;
        }
        return name.m91082b();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89366d(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        if (BuiltinSpecialProperties.INSTANCE.m89358d().contains(callableMemberDescriptor.getName())) {
            return m89367e(callableMemberDescriptor);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m89367e(CallableMemberDescriptor callableMemberDescriptor) {
        if (CollectionsKt.contains(BuiltinSpecialProperties.INSTANCE.m89357c(), DescriptorUtilsKt.m91978k(callableMemberDescriptor)) && callableMemberDescriptor.mo88448g().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.m88186h0(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> collectionMo88447e = callableMemberDescriptor.mo88447e();
        collectionMo88447e.getClass();
        Collection<? extends CallableMemberDescriptor> collection = collectionMo88447e;
        if (collection.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
            callableMemberDescriptor2.getClass();
            if (classicBuiltinSpecialProperties.m89366d(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }
}
