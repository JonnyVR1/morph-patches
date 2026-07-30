package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_LogResponse extends LogResponse {
    private final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long j) {
        this.nextRequestWaitMillis = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.nextRequestWaitMillis == ((LogResponse) obj).getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public int hashCode() {
        long j = this.nextRequestWaitMillis;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.nextRequestWaitMillis + "}";
    }
}
