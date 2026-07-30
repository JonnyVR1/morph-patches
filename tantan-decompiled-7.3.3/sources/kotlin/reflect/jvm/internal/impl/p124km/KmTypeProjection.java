package kotlin.reflect.jvm.internal.impl.p124km;

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
    public static final KmTypeProjection f65233c = new KmTypeProjection(null, null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public KmVariance f65234a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public KmType f65235b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public KmTypeProjection(@Nullable KmVariance kmVariance, @Nullable KmType kmType) {
        this.f65234a = kmVariance;
        this.f65235b = kmType;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmTypeProjection)) {
            return false;
        }
        KmTypeProjection kmTypeProjection = (KmTypeProjection) obj;
        return this.f65234a == kmTypeProjection.f65234a && Intrinsics.m88377d(this.f65235b, kmTypeProjection.f65235b);
    }

    public int hashCode() {
        KmVariance kmVariance = this.f65234a;
        int iHashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        KmType kmType = this.f65235b;
        return iHashCode + (kmType != null ? kmType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KmTypeProjection(variance=" + this.f65234a + ", type=" + this.f65235b + ')';
    }
}
