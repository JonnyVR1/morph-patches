package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.vivo.push.PushClientConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b)\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u001a\u0004\b&\u0010\u000f\"\u0004\b*\u0010\u0019¨\u0006+"}, m88121d2 = {"Ll/vbg0;", "", "", PushClientConstants.TAG_CLASS_NAME, "methodName", "", "lineNumber", "", "totalTime", StudentVerRejectedReason.startTime, "describe", "stackInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJJLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setClassName", "(Ljava/lang/String;)V", "b", Constants.INAPP_DATA_TAG, "setMethodName", "c", "I", "setLineNumber", "(I)V", "J", "g", "()J", "h", "(J)V", "e", "f", "setStartTime", "setDescribe", "setStackInfo", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class vbg0 {

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

    public vbg0(@NotNull String str, @NotNull String str2, int i, long j, long j2, @NotNull String str3, @NotNull String str4) {
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
        if (!(other instanceof vbg0)) {
            return false;
        }
        vbg0 vbg0Var = (vbg0) other;
        return Intrinsics.m88377d(this.className, vbg0Var.className) && Intrinsics.m88377d(this.methodName, vbg0Var.methodName) && this.lineNumber == vbg0Var.lineNumber && this.totalTime == vbg0Var.totalTime && this.startTime == vbg0Var.startTime && Intrinsics.m88377d(this.describe, vbg0Var.describe) && Intrinsics.m88377d(this.stackInfo, vbg0Var.stackInfo);
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
    public final void m200707h(long j) {
        this.totalTime = j;
    }

    public int hashCode() {
        return (((((((((((this.className.hashCode() * 31) + this.methodName.hashCode()) * 31) + Integer.hashCode(this.lineNumber)) * 31) + Long.hashCode(this.totalTime)) * 31) + Long.hashCode(this.startTime)) * 31) + this.describe.hashCode()) * 31) + this.stackInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubTraceBean(className=" + this.className + ", methodName=" + this.methodName + ", lineNumber=" + this.lineNumber + ", totalTime=" + this.totalTime + ", startTime=" + this.startTime + ", describe=" + this.describe + ", stackInfo=" + this.stackInfo + ")";
    }

    public /* synthetic */ vbg0(String str, String str2, int i, long j, long j2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, j, j2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4);
    }
}
