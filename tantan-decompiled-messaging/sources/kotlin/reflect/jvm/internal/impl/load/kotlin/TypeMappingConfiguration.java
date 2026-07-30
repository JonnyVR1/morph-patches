package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeMappingConfiguration<T> {
    @Nullable
    /* JADX INFO: renamed from: a */
    T mo90397a(@NotNull ClassDescriptor classDescriptor);

    @Nullable
    /* JADX INFO: renamed from: b */
    String mo90398b(@NotNull ClassDescriptor classDescriptor);

    @Nullable
    /* JADX INFO: renamed from: c */
    KotlinType mo90399c(@NotNull KotlinType kotlinType);

    @Nullable
    /* JADX INFO: renamed from: d */
    String mo90400d(@NotNull ClassDescriptor classDescriptor);

    /* JADX INFO: renamed from: e */
    void mo90401e(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor classDescriptor);

    @Nullable
    /* JADX INFO: renamed from: f */
    KotlinBuiltIns mo90402f();

    @NotNull
    /* JADX INFO: renamed from: g */
    KotlinType mo90403g(@NotNull Collection<KotlinType> collection);
}
