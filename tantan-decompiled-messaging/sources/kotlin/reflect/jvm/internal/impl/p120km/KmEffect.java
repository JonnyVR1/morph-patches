package kotlin.reflect.jvm.internal.impl.p120km;

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
    public KmEffectType f64486a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public KmEffectInvocationKind f64487b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmEffectExpression> f64488c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmEffectExpression f64489d;

    public KmEffect(@NotNull KmEffectType kmEffectType, @Nullable KmEffectInvocationKind kmEffectInvocationKind) {
        kmEffectType.getClass();
        this.f64486a = kmEffectType;
        this.f64487b = kmEffectInvocationKind;
        this.f64488c = new ArrayList(1);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmEffectExpression> m89128a() {
        return this.f64488c;
    }

    /* JADX INFO: renamed from: b */
    public final void m89129b(@Nullable KmEffectExpression kmEffectExpression) {
        this.f64489d = kmEffectExpression;
    }
}
