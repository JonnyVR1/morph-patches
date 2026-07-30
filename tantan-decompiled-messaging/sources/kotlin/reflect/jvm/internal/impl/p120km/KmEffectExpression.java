package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.ArrayList;
import java.util.List;
import kotlin.contracts.ExperimentalContracts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalContracts
public final class KmEffectExpression {

    /* JADX INFO: renamed from: a */
    public int f64490a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Integer f64491b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public KmConstantValue f64492c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public KmType f64493d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<KmEffectExpression> f64494e = new ArrayList(0);

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<KmEffectExpression> f64495f = new ArrayList(0);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KmEffectExpression> m89130a() {
        return this.f64494e;
    }

    /* JADX INFO: renamed from: b */
    public final int m89131b() {
        return this.f64490a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<KmEffectExpression> m89132c() {
        return this.f64495f;
    }

    /* JADX INFO: renamed from: d */
    public final void m89133d(@Nullable KmConstantValue kmConstantValue) {
        this.f64492c = kmConstantValue;
    }

    /* JADX INFO: renamed from: e */
    public final void m89134e(int i) {
        this.f64490a = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m89135f(@Nullable KmType kmType) {
        this.f64493d = kmType;
    }

    /* JADX INFO: renamed from: g */
    public final void m89136g(@Nullable Integer num) {
        this.f64491b = num;
    }
}
