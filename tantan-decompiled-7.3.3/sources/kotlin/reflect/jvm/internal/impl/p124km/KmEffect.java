package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.List;
import kotlin.contracts.ExperimentalContracts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalContracts
public final class KmEffect {

    /* JADX INFO: renamed from: a */
    @NotNull
    public KmEffectType f65160a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public KmEffectInvocationKind f65161b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmEffectExpression> f65162c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmEffectExpression f65163d;

    public KmEffect(@NotNull KmEffectType kmEffectType, @Nullable KmEffectInvocationKind kmEffectInvocationKind) {
        kmEffectType.getClass();
        this.f65160a = kmEffectType;
        this.f65161b = kmEffectInvocationKind;
        this.f65162c = new ArrayList(1);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmEffectExpression> m90019a() {
        return this.f65162c;
    }

    /* JADX INFO: renamed from: b */
    public final void m90020b(@Nullable KmEffectExpression kmEffectExpression) {
        this.f65163d = kmEffectExpression;
    }
}
