package kotlin.reflect.jvm.internal.impl.p124km.internal;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FlagImpl {

    /* JADX INFO: renamed from: a */
    public final int f65259a;

    /* JADX INFO: renamed from: b */
    public final int f65260b;

    /* JADX INFO: renamed from: c */
    public final int f65261c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(@NotNull Flags.FlagField<?> flagField, int i) {
        this(flagField.f66059a, flagField.f66060b, i);
        flagField.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final int m90109a() {
        return this.f65260b;
    }

    /* JADX INFO: renamed from: b */
    public final int m90110b() {
        return this.f65259a;
    }

    /* JADX INFO: renamed from: c */
    public final int m90111c() {
        return this.f65261c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90112d(int i) {
        return ((i >>> this.f65259a) & ((1 << this.f65260b) - 1)) == this.f65261c;
    }

    public FlagImpl(int i, int i2, int i3) {
        this.f65259a = i;
        this.f65260b = i2;
        this.f65261c = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(@NotNull Flags.BooleanFlagField booleanFlagField) {
        this(booleanFlagField, 1);
        booleanFlagField.getClass();
    }
}
