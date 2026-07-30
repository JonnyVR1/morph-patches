package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeSystemContextKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66345a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66345a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TypeVariance m93074a(@NotNull Variance variance) {
        variance.getClass();
        int i = WhenMappings.f66345a[variance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        l9r.m149037a();
        return null;
    }
}
