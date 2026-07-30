package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class PossiblyInnerType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassifierDescriptorWithTypeParameters f64055a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<TypeProjection> f64056b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PossiblyInnerType f64057c;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, @NotNull List<? extends TypeProjection> list, @Nullable PossiblyInnerType possiblyInnerType) {
        classifierDescriptorWithTypeParameters.getClass();
        list.getClass();
        this.f64055a = classifierDescriptorWithTypeParameters;
        this.f64056b = list;
        this.f64057c = possiblyInnerType;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<TypeProjection> m88578a() {
        return this.f64056b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ClassifierDescriptorWithTypeParameters m88579b() {
        return this.f64055a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final PossiblyInnerType m88580c() {
        return this.f64057c;
    }
}
