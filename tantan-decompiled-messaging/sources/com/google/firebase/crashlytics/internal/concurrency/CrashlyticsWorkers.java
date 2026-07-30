package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m87232d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers;", "", "backgroundExecutorService", "Ljava/util/concurrent/ExecutorService;", "blockingExecutorService", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "common", "Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorker;", "dataCollect", "diskWrite", "network", "Companion", "com.google.firebase-firebase-crashlytics"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class CrashlyticsWorkers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enforcement;

    @JvmField
    @NotNull
    public final CrashlyticsWorker common;

    @JvmField
    @NotNull
    public final CrashlyticsWorker dataCollect;

    @JvmField
    @NotNull
    public final CrashlyticsWorker diskWrite;

    @JvmField
    @NotNull
    public final CrashlyticsWorker network;

    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0010H\u0007J$\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m87232d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers$Companion;", "", "()V", "enforcement", "", "getEnforcement$annotations", "getEnforcement", "()Z", "setEnforcement", "(Z)V", "threadName", "", "kotlin.jvm.PlatformType", "getThreadName", "()Ljava/lang/String;", "checkBackgroundThread", "", "checkBlockingThread", "checkNotMainThread", "checkThread", "isCorrectThread", "Lkotlin/Function0;", "failureMessage", "isBackgroundThread", "isBlockingThread", "isNotMainThread", "com.google.firebase-firebase-crashlytics"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void checkThread(Function0<Boolean> isCorrectThread, Function0<String> failureMessage) {
            if (isCorrectThread.invoke().booleanValue()) {
                return;
            }
            Logger.getLogger().m16721d(failureMessage.invoke());
            getEnforcement();
        }

        @JvmStatic
        public static /* synthetic */ void getEnforcement$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getThreadName() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBackgroundThread() {
            String threadName = getThreadName();
            threadName.getClass();
            return StringsKt.m93412P(threadName, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBlockingThread() {
            String threadName = getThreadName();
            threadName.getClass();
            return StringsKt.m93412P(threadName, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNotMainThread() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        @JvmStatic
        public final void checkBackgroundThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), new Function0<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Must be called on a background thread, was called on " + CrashlyticsWorkers.INSTANCE.getThreadName() + '.';
                }
            });
        }

        @JvmStatic
        public final void checkBlockingThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBlockingThread$1(this), new Function0<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Must be called on a blocking thread, was called on " + CrashlyticsWorkers.INSTANCE.getThreadName() + '.';
                }
            });
        }

        @JvmStatic
        public final void checkNotMainThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkNotMainThread$1(this), new Function0<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Must not be called on a main thread, was called on " + CrashlyticsWorkers.INSTANCE.getThreadName() + '.';
                }
            });
        }

        public final boolean getEnforcement() {
            return CrashlyticsWorkers.enforcement;
        }

        public final void setEnforcement(boolean z) {
            CrashlyticsWorkers.enforcement = z;
        }

        private Companion() {
        }
    }

    public CrashlyticsWorkers(@NotNull ExecutorService executorService, @NotNull ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.common = new CrashlyticsWorker(executorService);
        this.diskWrite = new CrashlyticsWorker(executorService);
        this.dataCollect = new CrashlyticsWorker(executorService);
        this.network = new CrashlyticsWorker(executorService2);
    }

    @JvmStatic
    public static final void checkBackgroundThread() {
        INSTANCE.checkBackgroundThread();
    }

    @JvmStatic
    public static final void checkBlockingThread() {
        INSTANCE.checkBlockingThread();
    }

    @JvmStatic
    public static final void checkNotMainThread() {
        INSTANCE.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return INSTANCE.getEnforcement();
    }

    public static final void setEnforcement(boolean z) {
        INSTANCE.setEnforcement(z);
    }
}
