package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.vivo.push.PushClientConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b)\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u001a\u0004\b&\u0010\u000f\"\u0004\b*\u0010\u0019¨\u0006+"}, m87232d2 = {"Ll/o3g0;", "", "", PushClientConstants.TAG_CLASS_NAME, "methodName", "", "lineNumber", "", "totalTime", StudentVerRejectedReason.startTime, "describe", "stackInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJJLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setClassName", "(Ljava/lang/String;)V", "b", Constants.INAPP_DATA_TAG, "setMethodName", "c", "I", "setLineNumber", "(I)V", "J", "g", "()J", "h", "(J)V", "e", "f", "setStartTime", "setDescribe", "setStackInfo", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class o3g0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String className;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String methodName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int lineNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long totalTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String describe;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String stackInfo;

    public o3g0(@NotNull String str, @NotNull String str2, int i, long j, long j2, @NotNull String str3, @NotNull String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.className = str;
        this.methodName = str2;
        this.lineNumber = i;
        this.totalTime = j;
        this.startTime = j2;
        this.describe = str3;
        this.stackInfo = str4;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescribe() {
        return this.describe;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLineNumber() {
        return this.lineNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMethodName() {
        return this.methodName;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStackInfo() {
        return this.stackInfo;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o3g0)) {
            return false;
        }
        o3g0 o3g0Var = (o3g0) other;
        return Intrinsics.m87488d(this.className, o3g0Var.className) && Intrinsics.m87488d(this.methodName, o3g0Var.methodName) && this.lineNumber == o3g0Var.lineNumber && this.totalTime == o3g0Var.totalTime && this.startTime == o3g0Var.startTime && Intrinsics.m87488d(this.describe, o3g0Var.describe) && Intrinsics.m87488d(this.stackInfo, o3g0Var.stackInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTotalTime() {
        return this.totalTime;
    }

    /* JADX INFO: renamed from: h */
    public final void m162426h(long j) {
        this.totalTime = j;
    }

    public int hashCode() {
        return (((((((((((this.className.hashCode() * 31) + this.methodName.hashCode()) * 31) + Integer.hashCode(this.lineNumber)) * 31) + Long.hashCode(this.totalTime)) * 31) + Long.hashCode(this.startTime)) * 31) + this.describe.hashCode()) * 31) + this.stackInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubTraceBean(className=" + this.className + ", methodName=" + this.methodName + ", lineNumber=" + this.lineNumber + ", totalTime=" + this.totalTime + ", startTime=" + this.startTime + ", describe=" + this.describe + ", stackInfo=" + this.stackInfo + ")";
    }

    public /* synthetic */ o3g0(String str, String str2, int i, long j, long j2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, j, j2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4);
    }
}
