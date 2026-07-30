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
    public static final PreReleaseInfo f66832c = new PreReleaseInfo(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a */
    public final boolean f66833a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<String> f66834b;

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
        return this.f66833a == preReleaseInfo.f66833a && Intrinsics.m88377d(this.f66834b, preReleaseInfo.f66834b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f66833a) * 31) + this.f66834b.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f66833a + ", poisoningFeatures=" + this.f66834b + ')';
    }

    public PreReleaseInfo(boolean z, @NotNull List<String> list) {
        list.getClass();
        this.f66833a = z;
        this.f66834b = list;
    }
}
