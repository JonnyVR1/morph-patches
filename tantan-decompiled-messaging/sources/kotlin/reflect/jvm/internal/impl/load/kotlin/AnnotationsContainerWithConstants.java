package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Map<MemberSignature, List<A>> f65006a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<MemberSignature, C> f65007b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<MemberSignature, C> f65008c;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsContainerWithConstants(@NotNull Map<MemberSignature, ? extends List<? extends A>> map, @NotNull Map<MemberSignature, ? extends C> map2, @NotNull Map<MemberSignature, ? extends C> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.f65006a = map;
        this.f65007b = map2;
        this.f65008c = map3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<MemberSignature, List<A>> mo90166a() {
        return this.f65006a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<MemberSignature, C> m90170b() {
        return this.f65008c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<MemberSignature, C> m90171c() {
        return this.f65007b;
    }
}
