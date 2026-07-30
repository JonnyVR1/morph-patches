package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<MemberSignature, List<A>> f65680a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<MemberSignature, C> f65681b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<MemberSignature, C> f65682c;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsContainerWithConstants(@NotNull Map<MemberSignature, ? extends List<? extends A>> map, @NotNull Map<MemberSignature, ? extends C> map2, @NotNull Map<MemberSignature, ? extends C> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.f65680a = map;
        this.f65681b = map2;
        this.f65682c = map3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<MemberSignature, List<A>> mo91057a() {
        return this.f65680a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<MemberSignature, C> m91061b() {
        return this.f65682c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<MemberSignature, C> m91062c() {
        return this.f65681b;
    }
}
