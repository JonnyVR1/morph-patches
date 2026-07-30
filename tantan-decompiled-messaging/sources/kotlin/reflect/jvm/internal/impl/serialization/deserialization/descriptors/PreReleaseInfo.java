package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class PreReleaseInfo {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final PreReleaseInfo f66158c = new PreReleaseInfo(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a */
    public final boolean f66159a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<String> f66160b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PreReleaseInfo(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreReleaseInfo)) {
            return false;
        }
        PreReleaseInfo preReleaseInfo = (PreReleaseInfo) obj;
        return this.f66159a == preReleaseInfo.f66159a && Intrinsics.m87488d(this.f66160b, preReleaseInfo.f66160b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f66159a) * 31) + this.f66160b.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f66159a + ", poisoningFeatures=" + this.f66160b + ')';
    }

    public PreReleaseInfo(boolean z, @NotNull List<String> list) {
        list.getClass();
        this.f66159a = z;
        this.f66160b = list;
    }
}
