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
    public static final boolean m89030a(@NotNull CompanionObjectMapping companionObjectMapping, @NotNull ClassDescriptor classDescriptor) {
        companionObjectMapping.getClass();
        classDescriptor.getClass();
        if (!DescriptorUtils.m92674x(classDescriptor)) {
            return false;
        }
        Set<ClassId> setM89029b = companionObjectMapping.m89029b();
        ClassId classIdM92872n = DescriptorUtilsKt.m92872n(classDescriptor);
        return CollectionsKt.contains(setM89029b, classIdM92872n != null ? classIdM92872n.m91928e() : null);
    }
}
