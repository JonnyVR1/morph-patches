package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes7.dex */
public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {
    private final int maximumStackSize;
    private final MiddleOutStrategy middleOutStrategy;
    private final StackTraceTrimmingStrategy[] trimmingStrategies;

    public MiddleOutFallbackStrategy(int i, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.maximumStackSize = i;
        this.trimmingStrategies = stackTraceTrimmingStrategyArr;
        this.middleOutStrategy = new MiddleOutStrategy(i);
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.maximumStackSize) {
            return stackTraceElementArr;
        }
        StackTraceElement[] trimmedStackTrace = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.trimmingStrategies) {
            if (trimmedStackTrace.length <= this.maximumStackSize) {
                break;
            }
            trimmedStackTrace = stackTraceTrimmingStrategy.getTrimmedStackTrace(stackTraceElementArr);
        }
        return trimmedStackTrace.length > this.maximumStackSize ? this.middleOutStrategy.getTrimmedStackTrace(trimmedStackTrace) : trimmedStackTrace;
    }
}
