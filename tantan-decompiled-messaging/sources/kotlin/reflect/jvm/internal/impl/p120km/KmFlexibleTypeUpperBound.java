package kotlin.reflect.jvm.internal.impl.p120km;

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
    public KmType f64499a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f64500b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public KmFlexibleTypeUpperBound(@NotNull KmType kmType, @Nullable String str) {
        kmType.getClass();
        this.f64499a = kmType;
        this.f64500b = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmFlexibleTypeUpperBound)) {
            return false;
        }
        KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = (KmFlexibleTypeUpperBound) obj;
        return Intrinsics.m87488d(this.f64499a, kmFlexibleTypeUpperBound.f64499a) && Intrinsics.m87488d(this.f64500b, kmFlexibleTypeUpperBound.f64500b);
    }

    public int hashCode() {
        int iHashCode = this.f64499a.hashCode() * 31;
        String str = this.f64500b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "KmFlexibleTypeUpperBound(type=" + this.f64499a + ", typeFlexibilityId=" + this.f64500b + ')';
    }
}
