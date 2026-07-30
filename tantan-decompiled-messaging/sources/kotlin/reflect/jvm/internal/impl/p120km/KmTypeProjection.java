package kotlin.reflect.jvm.internal.impl.p120km;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KmTypeProjection {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final KmTypeProjection f64559c = new KmTypeProjection(null, null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public KmVariance f64560a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public KmType f64561b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public KmTypeProjection(@Nullable KmVariance kmVariance, @Nullable KmType kmType) {
        this.f64560a = kmVariance;
        this.f64561b = kmType;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmTypeProjection)) {
            return false;
        }
        KmTypeProjection kmTypeProjection = (KmTypeProjection) obj;
        return this.f64560a == kmTypeProjection.f64560a && Intrinsics.m87488d(this.f64561b, kmTypeProjection.f64561b);
    }

    public int hashCode() {
        KmVariance kmVariance = this.f64560a;
        int iHashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        KmType kmType = this.f64561b;
        return iHashCode + (kmType != null ? kmType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KmTypeProjection(variance=" + this.f64560a + ", type=" + this.f64561b + ')';
    }
}
