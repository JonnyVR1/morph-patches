package com.p046p1.mobile.backtrace.backtrace;

/* JADX INFO: loaded from: classes8.dex */
public interface WarmUpReporter {

    public enum ReportEvent {
        WarmedUp,
        CleanedUp,
        WarmUpThreadBlocked,
        WarmUpFailed,
        WarmUpDuration,
        ConsumeRequestDuration,
        DiskUsage
    }

    void onReport(ReportEvent reportEvent, Object... objArr);
}
