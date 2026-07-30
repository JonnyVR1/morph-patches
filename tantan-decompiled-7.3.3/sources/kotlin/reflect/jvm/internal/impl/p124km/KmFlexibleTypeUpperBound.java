package kotlin.reflect.jvm.internal.impl.p124km;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KmFlexibleTypeUpperBound {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public KmType f65173a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f65174b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public KmFlexibleTypeUpperBound(@NotNull KmType kmType, @Nullable String str) {
        kmType.getClass();
        this.f65173a = kmType;
        this.f65174b = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmFlexibleTypeUpperBound)) {
            return false;
        }
        KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = (KmFlexibleTypeUpperBound) obj;
        return Intrinsics.m88377d(this.f65173a, kmFlexibleTypeUpperBound.f65173a) && Intrinsics.m88377d(this.f65174b, kmFlexibleTypeUpperBound.f65174b);
    }

    public int hashCode() {
        int iHashCode = this.f65173a.hashCode() * 31;
        String str = this.f65174b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KmFlexibleTypeUpperBound(type=" + this.f65173a + ", typeFlexibilityId=" + this.f65174b + ')';
    }
}
