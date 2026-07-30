package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m88121d2 = {"Lcom/google/firebase/sessions/ProcessDetails;", "", "processName", "", "pid", "", "importance", "isDefaultProcess", "", "(Ljava/lang/String;IIZ)V", "getImportance", "()I", "()Z", "getPid", "getProcessName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final /* data */ class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;

    @NotNull
    private final String processName;

    public ProcessDetails(@NotNull String str, int i, int i2, boolean z) {
        str.getClass();
        this.processName = str;
        this.pid = i;
        this.importance = i2;
        this.isDefaultProcess = z;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = processDetails.processName;
        }
        if ((i3 & 2) != 0) {
            i = processDetails.pid;
        }
        if ((i3 & 4) != 0) {
            i2 = processDetails.importance;
        }
        if ((i3 & 8) != 0) {
            z = processDetails.isDefaultProcess;
        }
        return processDetails.copy(str, i, i2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDefaultProcess() {
        return this.isDefaultProcess;
    }

    @NotNull
    public final ProcessDetails copy(@NotNull String processName, int pid, int importance, boolean isDefaultProcess) {
        processName.getClass();
        return new ProcessDetails(processName, pid, importance, isDefaultProcess);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) other;
        return Intrinsics.m88377d(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((this.processName.hashCode() * 31) + Integer.hashCode(this.pid)) * 31) + Integer.hashCode(this.importance)) * 31;
        boolean z = this.isDefaultProcess;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    @NotNull
    public String toString() {
        return "ProcessDetails(processName=" + this.processName + ", pid=" + this.pid + ", importance=" + this.importance + ", isDefaultProcess=" + this.isDefaultProcess + ')';
    }
}
