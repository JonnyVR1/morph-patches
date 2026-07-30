package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassDescriptorFactory {
    /* JADX INFO: renamed from: a */
    boolean mo88281a(@NotNull FqName fqName, @NotNull Name name);

    @Nullable
    /* JADX INFO: renamed from: b */
    ClassDescriptor mo88282b(@NotNull ClassId classId);

    @NotNull
    /* JADX INFO: renamed from: c */
    Collection<ClassDescriptor> mo88283c(@NotNull FqName fqName);
}
