package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class PossiblyInnerType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassifierDescriptorWithTypeParameters f64729a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<TypeProjection> f64730b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PossiblyInnerType f64731c;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, @NotNull List<? extends TypeProjection> list, @Nullable PossiblyInnerType possiblyInnerType) {
        classifierDescriptorWithTypeParameters.getClass();
        list.getClass();
        this.f64729a = classifierDescriptorWithTypeParameters;
        this.f64730b = list;
        this.f64731c = possiblyInnerType;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<TypeProjection> m89469a() {
        return this.f64730b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ClassifierDescriptorWithTypeParameters m89470b() {
        return this.f64729a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final PossiblyInnerType m89471c() {
        return this.f64731c;
    }
}
