package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CompanionObjectMappingUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m88139a(@NotNull CompanionObjectMapping companionObjectMapping, @NotNull ClassDescriptor classDescriptor) {
        companionObjectMapping.getClass();
        classDescriptor.getClass();
        if (!DescriptorUtils.m91783x(classDescriptor)) {
            return false;
        }
        Set<ClassId> setM88138b = companionObjectMapping.m88138b();
        ClassId classIdM91981n = DescriptorUtilsKt.m91981n(classDescriptor);
        return CollectionsKt.contains(setM88138b, classIdM91981n != null ? classIdM91981n.m91037e() : null);
    }
}
