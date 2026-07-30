package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\n¨\u0006\u0016"}, m87232d2 = {"Ll/ysd;", "", "", "inAppId", "", "delay", "inAppData", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class ysd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String inAppId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String inAppData;

    public ysd(@NotNull String str, int i, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.inAppId = str;
        this.delay = i;
        this.inAppData = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInAppData() {
        return this.inAppData;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInAppId() {
        return this.inAppId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ysd)) {
            return false;
        }
        ysd ysdVar = (ysd) other;
        return Intrinsics.m87488d(this.inAppId, ysdVar.inAppId) && this.delay == ysdVar.delay && Intrinsics.m87488d(this.inAppData, ysdVar.inAppData);
    }

    public int hashCode() {
        return (((this.inAppId.hashCode() * 31) + Integer.hashCode(this.delay)) * 31) + this.inAppData.hashCode();
    }

    @NotNull
    public String toString() {
        return "DelayedLegacyInAppData(inAppId=" + this.inAppId + ", delay=" + this.delay + ", inAppData=" + this.inAppData + ')';
    }
}
