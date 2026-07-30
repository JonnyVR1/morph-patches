package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.sei0;

/* JADX INFO: loaded from: classes7.dex */
final class ReportQueue {
    private static final int MAX_DELAY_MS = 3600000;
    private static final int MS_PER_MINUTE = 60000;
    private static final int MS_PER_SECOND = 1000;
    private static final int STARTUP_DURATION_MS = 2000;
    private final double base;
    private long lastUpdatedMs;
    private final OnDemandCounter onDemandCounter;
    private final BlockingQueue<Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final Transport<CrashlyticsReport> transport;

    public final class ReportRunnable implements Runnable {
        private final CrashlyticsReportWithSessionId reportWithSessionId;
        private final sei0<CrashlyticsReportWithSessionId> tcs;

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, sei0<CrashlyticsReportWithSessionId> sei0Var) {
            this.reportWithSessionId = crashlyticsReportWithSessionId;
            this.tcs = sei0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReportQueue.this.sendReport(this.reportWithSessionId, this.tcs);
            ReportQueue.this.onDemandCounter.resetDroppedOnDemandExceptions();
            double dCalcDelay = ReportQueue.this.calcDelay();
            Logger.getLogger().m16721d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dCalcDelay / 1000.0d)) + " s for report: " + this.reportWithSessionId.getSessionId());
            ReportQueue.sleep(dCalcDelay);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ReportQueue(double d, double d2, long j, Transport<CrashlyticsReport> transport, OnDemandCounter onDemandCounter) {
        this.ratePerMinute = d;
        this.base = d2;
        this.stepDurationMs = j;
        this.transport = transport;
        this.onDemandCounter = onDemandCounter;
        this.startTimeMs = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.queueCapacity = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.queue = arrayBlockingQueue;
        this.singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16778a(ReportQueue reportQueue, sei0 sei0Var, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        reportQueue.getClass();
        if (exc != null) {
            sei0Var.m183660d(exc);
            return;
        }
        if (z) {
            reportQueue.flushScheduledReportsIfAble();
        }
        sei0Var.m183661e(crashlyticsReportWithSessionId);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16779b(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        reportQueue.getClass();
        try {
            ForcedSender.sendBlocking(reportQueue.transport, Priority.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double calcDelay() {
        return Math.min(3600000.0d, (60000.0d / this.ratePerMinute) * Math.pow(this.base, calcStep()));
    }

    private int calcStep() {
        if (this.lastUpdatedMs == 0) {
            this.lastUpdatedMs = now();
        }
        int iNow = (int) ((now() - this.lastUpdatedMs) / this.stepDurationMs);
        boolean zIsQueueFull = isQueueFull();
        int i = this.step;
        int iMin = zIsQueueFull ? Math.min(100, i + iNow) : Math.max(0, i - iNow);
        if (this.step != iMin) {
            this.step = iMin;
            this.lastUpdatedMs = now();
        }
        return iMin;
    }

    private boolean isQueueAvailable() {
        return this.queue.size() < this.queueCapacity;
    }

    private boolean isQueueFull() {
        return this.queue.size() == this.queueCapacity;
    }

    private long now() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReport(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final sei0<CrashlyticsReportWithSessionId> sei0Var) {
        Logger.getLogger().m16721d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        final boolean z = SystemClock.elapsedRealtime() - this.startTimeMs < 2000;
        this.transport.schedule(Event.ofUrgent(crashlyticsReportWithSessionId.getReport()), new TransportScheduleCallback() { // from class: com.google.firebase.crashlytics.internal.send.b
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                ReportQueue.m16778a(this.f11453a, sei0Var, z, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    public sei0<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.queue) {
            try {
                sei0<CrashlyticsReportWithSessionId> sei0Var = new sei0<>();
                if (!z) {
                    sendReport(crashlyticsReportWithSessionId, sei0Var);
                    return sei0Var;
                }
                this.onDemandCounter.incrementRecordedOnDemandExceptions();
                if (!isQueueAvailable()) {
                    calcStep();
                    Logger.getLogger().m16721d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                    this.onDemandCounter.incrementDroppedOnDemandExceptions();
                    sei0Var.m183661e(crashlyticsReportWithSessionId);
                    return sei0Var;
                }
                Logger.getLogger().m16721d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                Logger.getLogger().m16721d("Queue size: " + this.queue.size());
                this.singleThreadExecutor.execute(new ReportRunnable(crashlyticsReportWithSessionId, sei0Var));
                Logger.getLogger().m16721d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                sei0Var.m183661e(crashlyticsReportWithSessionId);
                return sei0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void flushScheduledReportsIfAble() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.a
            @Override // java.lang.Runnable
            public final void run() {
                ReportQueue.m16779b(this.f11451a, countDownLatch);
            }
        }).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public ReportQueue(Transport<CrashlyticsReport> transport, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, ((long) settings.onDemandBackoffStepDurationSeconds) * 1000, transport, onDemandCounter);
    }
}
