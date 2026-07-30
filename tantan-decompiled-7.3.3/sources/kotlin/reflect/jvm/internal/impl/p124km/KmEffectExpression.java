package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.ArrayList;
import java.util.List;
import kotlin.contracts.ExperimentalContracts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalContracts
public final class KmEffectExpression {

    /* JADX INFO: renamed from: a */
    public int f65164a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Integer f65165b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public KmConstantValue f65166c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmType f65167d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmEffectExpression> f65168e = new ArrayList(0);

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmEffectExpression> f65169f = new ArrayList(0);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmEffectExpression> m90021a() {
        return this.f65168e;
    }

    /* JADX INFO: renamed from: b */
    public final int m90022b() {
        return this.f65164a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmEffectExpression> m90023c() {
        return this.f65169f;
    }

    /* JADX INFO: renamed from: d */
    public final void m90024d(@Nullable KmConstantValue kmConstantValue) {
        this.f65166c = kmConstantValue;
    }

    /* JADX INFO: renamed from: e */
    public final void m90025e(int i) {
        this.f65164a = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m90026f(@Nullable KmType kmType) {
        this.f65167d = kmType;
    }

    /* JADX INFO: renamed from: g */
    public final void m90027g(@Nullable Integer num) {
        this.f65165b = num;
    }
}
