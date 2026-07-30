package kotlin.reflect.jvm.internal.impl.p120km.internal;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FlagImpl {

    /* JADX INFO: renamed from: a */
    public final int f64585a;

    /* JADX INFO: renamed from: b */
    public final int f64586b;

    /* JADX INFO: renamed from: c */
    public final int f64587c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(@NotNull Flags.FlagField<?> flagField, int i) {
        this(flagField.f65385a, flagField.f65386b, i);
        flagField.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final int m89218a() {
        return this.f64586b;
    }

    /* JADX INFO: renamed from: b */
    public final int m89219b() {
        return this.f64585a;
    }

    /* JADX INFO: renamed from: c */
    public final int m89220c() {
        return this.f64587c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89221d(int i) {
        return ((i >>> this.f64585a) & ((1 << this.f64586b) - 1)) == this.f64587c;
    }

    public FlagImpl(int i, int i2, int i3) {
        this.f64585a = i;
        this.f64586b = i2;
        this.f64587c = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(@NotNull Flags.BooleanFlagField booleanFlagField) {
        this(booleanFlagField, 1);
        booleanFlagField.getClass();
    }
}
