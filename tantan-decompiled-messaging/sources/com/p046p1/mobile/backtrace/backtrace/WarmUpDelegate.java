package com.p046p1.mobile.backtrace.backtrace;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.OperationCanceledException;
import android.os.Process;
import android.system.Os;
import android.system.StructStat;
import android.util.Pair;
import com.p046p1.mobile.backtrace.MatrixLog;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
class WarmUpDelegate {
    private static final String ACTION_WARMED_UP = "action.backtrace.warmed-up";
    private static final String PERMISSION_WARMED_UP = ".backtrace.warmed_up";
    private static final String TAG = "Matrix.WarmUpDelegate";
    private static final String TASK_TAG_CLEAN_UP = "clean-up";
    private static final String TASK_TAG_COMPUTE_DISK_USAGE = "compute-disk-usage";
    private static final String TASK_TAG_CONSUMING_UP = "consuming-up";
    private static final String TASK_TAG_WARM_UP = "warm-up";
    static volatile WarmUpReporter sReporter;
    private WeChatBacktrace.Configuration mConfiguration;
    private boolean mIsolateRemote = false;
    private final boolean[] mPrepared = {false};
    String mSavingPath;
    private ThreadTaskExecutor mThreadTaskExecutor;
    private WarmUpScheduler mWarmUpScheduler;
    private WarmedUpReceiver mWarmedUpReceiver;

    public static final class LocalWarmUpInvoker implements WarmUpInvoker {
        private LocalWarmUpInvoker() {
        }

        @Override // com.p046p1.mobile.backtrace.backtrace.WarmUpInvoker
        public boolean warmUp(String str, int i) {
            return WarmUpDelegate.internalWarmUpSoPath(str, i, false);
        }
    }

    public static final class RemoteWarmUpInvoker implements WarmUpInvoker, WarmUpService.RemoteConnection {
        private Bundle mArgs;
        private Context mContext;
        WarmUpService.RemoteInvokerImpl mImpl = new WarmUpService.RemoteInvokerImpl();
        private final String mSavingPath;

        public RemoteWarmUpInvoker(String str) {
            this.mSavingPath = str;
        }

        @Override // com.p1.mobile.backtrace.backtrace.WarmUpService.RemoteConnection
        public boolean connect(Context context, Bundle bundle) {
            this.mContext = context;
            this.mArgs = bundle;
            return this.mImpl.connect(context, bundle);
        }

        @Override // com.p1.mobile.backtrace.backtrace.WarmUpService.RemoteConnection
        public void disconnect(Context context) {
            this.mImpl.disconnect(context);
        }

        @Override // com.p1.mobile.backtrace.backtrace.WarmUpService.RemoteConnection
        public boolean isConnected() {
            return this.mImpl.isConnected();
        }

        @Override // com.p046p1.mobile.backtrace.backtrace.WarmUpInvoker
        public boolean warmUp(String str, int i) {
            if (!isConnected() && !connect(this.mContext, this.mArgs)) {
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("saving-path", this.mSavingPath);
            bundle.putString("path-of-elf", str);
            bundle.putInt("elf-start-offset", i);
            Bundle bundleCall = this.mImpl.call(100, bundle);
            int i2 = bundleCall != null ? bundleCall.getInt("warm-up-result") : -100;
            boolean z = i2 == 0;
            if (z) {
                WeChatBacktraceNative.notifyWarmedUp(str, i);
            }
            MatrixLog.m21186i(WarmUpDelegate.TAG, "Warm-up %s:%s - retCode %s", str, Integer.valueOf(i), Integer.valueOf(i2));
            return z;
        }
    }

    public static final class ThreadTaskExecutor implements Runnable, Handler.Callback {
        private static final long BLOCKED_CHECK_INTERVAL = 300000;
        private static final int MSG_BLOCKED_CHECK = 1;
        private Thread mThreadExecutor;
        private String mThreadName;
        private HashMap<String, Runnable> mRunnableTasks = new HashMap<>();
        private Queue<String> mTaskQueue = new LinkedList();
        private Handler mBlockedChecker = new Handler(Looper.getMainLooper(), this);
        private boolean mThreadBlocked = false;
        long[] mTaskStartTS = {0};

        public ThreadTaskExecutor(String str) {
            this.mThreadName = str;
        }

        public void arrangeTask(Runnable runnable, String str) {
            synchronized (this.mTaskQueue) {
                try {
                    if (this.mTaskQueue.contains(str)) {
                        return;
                    }
                    this.mTaskQueue.add(str);
                    this.mRunnableTasks.put(str, runnable);
                    synchronized (this) {
                        try {
                            Thread thread = this.mThreadExecutor;
                            if (thread == null || !thread.isAlive()) {
                                Thread thread2 = new Thread(this, this.mThreadName);
                                this.mThreadExecutor = thread2;
                                thread2.start();
                                this.mBlockedChecker.removeMessages(1);
                                this.mBlockedChecker.sendEmptyMessageDelayed(1, 300000L);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                synchronized (this.mTaskStartTS) {
                    try {
                        if (this.mTaskStartTS[0] == 0) {
                            return false;
                        }
                        this.mThreadBlocked = true;
                        WarmUpReporter warmUpReporter = WarmUpDelegate.sReporter;
                        if (warmUpReporter != null) {
                            warmUpReporter.onReport(WarmUpReporter.ReportEvent.WarmUpThreadBlocked, new Object[0]);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return false;
        }

        public boolean isThreadBlocked() {
            return this.mThreadBlocked;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mThreadBlocked = false;
            synchronized (this.mTaskStartTS) {
                this.mTaskStartTS[0] = System.currentTimeMillis();
            }
            Runnable runnable = null;
            String strPoll = null;
            while (true) {
                if (runnable != null) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        MatrixLog.m21186i(WarmUpDelegate.TAG, "Before '%s' task execution..", strPoll);
                        runnable.run();
                        MatrixLog.m21186i(WarmUpDelegate.TAG, "After '%s' task execution..", strPoll);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        WarmUpReporter warmUpReporter = WarmUpDelegate.sReporter;
                        if (warmUpReporter != null) {
                            if (WarmUpDelegate.TASK_TAG_WARM_UP.equalsIgnoreCase(strPoll)) {
                                warmUpReporter.onReport(WarmUpReporter.ReportEvent.WarmUpDuration, Long.valueOf(jCurrentTimeMillis2));
                            } else if (WarmUpDelegate.TASK_TAG_CONSUMING_UP.equalsIgnoreCase(strPoll)) {
                                warmUpReporter.onReport(WarmUpReporter.ReportEvent.ConsumeRequestDuration, Long.valueOf(jCurrentTimeMillis2));
                            }
                        }
                    } catch (Throwable th) {
                        synchronized (this.mTaskStartTS) {
                            this.mTaskStartTS[0] = 0;
                            this.mBlockedChecker.removeMessages(1);
                            throw th;
                        }
                    }
                }
                synchronized (this.mTaskQueue) {
                    strPoll = this.mTaskQueue.poll();
                    if (strPoll == null) {
                        synchronized (this.mTaskStartTS) {
                            this.mTaskStartTS[0] = 0;
                            break;
                        }
                    } else {
                        Runnable runnableRemove = this.mRunnableTasks.remove(strPoll);
                        if (runnableRemove == null) {
                            synchronized (this.mTaskStartTS) {
                                this.mTaskStartTS[0] = 0;
                            }
                            break;
                        }
                        runnable = runnableRemove;
                    }
                }
            }
            this.mBlockedChecker.removeMessages(1);
        }
    }

    public static final class WarmedUpReceiver extends BroadcastReceiver {
        private WeChatBacktrace.Mode mCurrentBacktraceMode;

        public WarmedUpReceiver(WeChatBacktrace.Mode mode) {
            this.mCurrentBacktraceMode = mode;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MatrixLog.m21186i(WarmUpDelegate.TAG, "Warm-up received.", new Object[0]);
            String action = intent.getAction();
            if (action != null && action.equals(WarmUpDelegate.ACTION_WARMED_UP)) {
                WeChatBacktraceNative.setWarmedUp(true);
                WarmUpDelegate.updateBacktraceMode(this.mCurrentBacktraceMode);
                try {
                    context.unregisterReceiver(this);
                } catch (Throwable th) {
                    MatrixLog.printErrStackTrace(WarmUpDelegate.TAG, th, "Unregister receiver twice.", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WarmUpInvoker acquireWarmUpInvoker() {
        if (!this.mIsolateRemote) {
            return new LocalWarmUpInvoker();
        }
        RemoteWarmUpInvoker remoteWarmUpInvoker = new RemoteWarmUpInvoker(this.mSavingPath);
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable-logger", this.mConfiguration.mEnableIsolateProcessLog);
        bundle.putString("path-of-xlog-so", this.mConfiguration.mPathOfXLogSo);
        if (remoteWarmUpInvoker.connect(this.mConfiguration.mContext, bundle)) {
            return remoteWarmUpInvoker;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void broadcastWarmedUp(Context context) {
        try {
            File fileWarmUpMarkedFile = WarmUpUtility.warmUpMarkedFile(context);
            fileWarmUpMarkedFile.createNewFile();
            WarmUpUtility.writeContentToFile(fileWarmUpMarkedFile, context.getApplicationInfo().nativeLibraryDir);
        } catch (IOException e) {
            MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        WeChatBacktraceNative.setWarmedUp(true);
        updateBacktraceMode(this.mConfiguration.mBacktraceMode);
        MatrixLog.m21186i(TAG, "Broadcast warmed up message to other processes.", new Object[0]);
        Intent intent = new Intent(ACTION_WARMED_UP);
        intent.putExtra("pid", Process.myPid());
        context.sendBroadcast(intent, context.getPackageName() + PERMISSION_WARMED_UP);
        WarmUpReporter warmUpReporter = sReporter;
        if (warmUpReporter != null) {
            warmUpReporter.onReport(WarmUpReporter.ReportEvent.WarmedUp, new Object[0]);
        }
    }

    public static boolean internalWarmUpSoPath(String str, int i, boolean z) {
        return WeChatBacktraceNative.warmUp(str, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseWarmUpInvoker(WarmUpInvoker warmUpInvoker) {
        if (this.mIsolateRemote) {
            ((RemoteWarmUpInvoker) warmUpInvoker).disconnect(this.mConfiguration.mContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateBacktraceMode(WeChatBacktrace.Mode mode) {
        if (mode == WeChatBacktrace.Mode.FpUntilQuickenWarmedUp || mode == WeChatBacktrace.Mode.DwarfUntilQuickenWarmedUp) {
            WeChatBacktraceNative.setBacktraceMode(WeChatBacktrace.Mode.Quicken.value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean warmUpBlocked(String str, int i) {
        boolean zCheck = WarmUpUtility.UnfinishedManagement.check(this.mConfiguration.mContext, str, i);
        boolean z = !zCheck;
        if (!zCheck) {
            MatrixLog.m21188w(TAG, "Elf file %s:%s has blocked and will not do warm-up.", str, Integer.valueOf(i));
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void warmUpFailed(String str, int i) {
        WarmUpReporter warmUpReporter = sReporter;
        if (warmUpReporter != null) {
            warmUpReporter.onReport(WarmUpReporter.ReportEvent.WarmUpFailed, str, Integer.valueOf(i));
        }
    }

    public void cleaningUp(final CancellationSignal cancellationSignal) {
        this.mThreadTaskExecutor.arrangeTask(new Runnable() { // from class: com.p1.mobile.backtrace.backtrace.WarmUpDelegate.2
            @Override // java.lang.Runnable
            public void run() {
                File file = new File(WarmUpUtility.validateSavingPath(WarmUpDelegate.this.mConfiguration));
                MatrixLog.m21186i(WarmUpDelegate.TAG, "Going to clean up saving path(%s)..", file.getAbsoluteFile());
                if (!file.isDirectory()) {
                    WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.CleanUp);
                    return;
                }
                final HashMap map = new HashMap();
                try {
                    WarmUpUtility.iterateTargetDirectory(file, cancellationSignal, new FileFilter() { // from class: com.p1.mobile.backtrace.backtrace.WarmUpDelegate.2.1
                        @Override // java.io.FileFilter
                        public boolean accept(File file2) {
                            try {
                                String name = file2.getName();
                                String absolutePath = file2.getAbsolutePath();
                                if (!name.contains("_malformed_") && !name.contains("_temp_")) {
                                    StructStat structStatLstat = Os.lstat(absolutePath);
                                    long jMax = Math.max(structStatLstat.st_atime, structStatLstat.st_mtime) * 1000;
                                    MatrixLog.m21186i(WarmUpDelegate.TAG, "File(%s) last access time %s", absolutePath, Long.valueOf(jMax));
                                    if (System.currentTimeMillis() - jMax > 5184000000L) {
                                        file2.delete();
                                        MatrixLog.m21186i(WarmUpDelegate.TAG, "Delete long time no access file(%s)", absolutePath);
                                    } else if (jMax < System.currentTimeMillis()) {
                                        int iLastIndexOf = name.lastIndexOf(46);
                                        if (iLastIndexOf == -1) {
                                            return false;
                                        }
                                        String strSubstring = name.substring(0, iLastIndexOf);
                                        if (name.endsWith(".hash")) {
                                            return false;
                                        }
                                        Pair pair = (Pair) map.get(strSubstring);
                                        if (pair == null) {
                                            map.put(strSubstring, new Pair(file2, Long.valueOf(jMax)));
                                        } else if (jMax > ((Long) pair.second).longValue()) {
                                            if (System.currentTimeMillis() - ((Long) pair.second).longValue() >= 259200000) {
                                                ((File) pair.first).delete();
                                                MatrixLog.m21186i(WarmUpDelegate.TAG, "Delete file(%s) cause %s is newer(%s vs %s).", ((File) pair.first).getName(), name, pair.second, Long.valueOf(jMax));
                                            }
                                            map.put(strSubstring, new Pair(file2, Long.valueOf(jMax)));
                                        } else if (System.currentTimeMillis() - jMax >= 259200000) {
                                            file2.delete();
                                            MatrixLog.m21186i(WarmUpDelegate.TAG, "Delete file(%s) cause %s is newer(%s vs %s).", name, ((File) pair.first).getName(), Long.valueOf(jMax), pair.second);
                                        }
                                    } else if (jMax - System.currentTimeMillis() >= 2592000000L) {
                                        file2.delete();
                                        MatrixLog.m21186i(WarmUpDelegate.TAG, "Delete future file(%s)", absolutePath);
                                    }
                                } else if (System.currentTimeMillis() - file2.lastModified() >= 259200000) {
                                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Delete malformed and temp file %s", absolutePath);
                                    file2.delete();
                                }
                            } catch (Throwable th) {
                                MatrixLog.printErrStackTrace(WarmUpDelegate.TAG, th, "", new Object[0]);
                            }
                            return false;
                        }
                    });
                } catch (OperationCanceledException unused) {
                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Clean up saving path(%s) cancelled.", file.getAbsoluteFile());
                    return;
                } catch (Throwable th) {
                    MatrixLog.printErrStackTrace(WarmUpDelegate.TAG, th, "", new Object[0]);
                }
                WarmUpUtility.markCleanUpTimestamp(WarmUpDelegate.this.mConfiguration.mContext);
                WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.CleanUp);
                MatrixLog.m21186i(WarmUpDelegate.TAG, "Clean up saving path(%s) done.", file.getAbsoluteFile());
                WarmUpReporter warmUpReporter = WarmUpDelegate.sReporter;
                if (warmUpReporter != null) {
                    warmUpReporter.onReport(WarmUpReporter.ReportEvent.CleanedUp, new Object[0]);
                }
            }
        }, TASK_TAG_CLEAN_UP);
    }

    public void computeDiskUsage(final CancellationSignal cancellationSignal) {
        this.mThreadTaskExecutor.arrangeTask(new Runnable() { // from class: com.p1.mobile.backtrace.backtrace.WarmUpDelegate.4
            @Override // java.lang.Runnable
            public void run() {
                File file = new File(WarmUpDelegate.this.mSavingPath);
                if (!file.isDirectory()) {
                    WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.DiskUsage);
                    return;
                }
                final long[] jArr = new long[2];
                try {
                    WarmUpUtility.iterateTargetDirectory(file, cancellationSignal, new FileFilter() { // from class: com.p1.mobile.backtrace.backtrace.WarmUpDelegate.4.1
                        @Override // java.io.FileFilter
                        public boolean accept(File file2) {
                            long[] jArr2 = jArr;
                            jArr2[0] = jArr2[0] + 1;
                            jArr2[1] = jArr2[1] + (file2.isFile() ? file2.length() : 0L);
                            return false;
                        }
                    });
                    WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.DiskUsage);
                    WarmUpUtility.markComputeDiskUsageTimestamp(WarmUpDelegate.this.mConfiguration.mContext);
                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
                    WarmUpReporter warmUpReporter = WarmUpDelegate.sReporter;
                    if (warmUpReporter != null) {
                        warmUpReporter.onReport(WarmUpReporter.ReportEvent.DiskUsage, Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
                    }
                } catch (OperationCanceledException | CancellationException unused) {
                    WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.DiskUsage);
                    WarmUpUtility.markComputeDiskUsageTimestamp(WarmUpDelegate.this.mConfiguration.mContext);
                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
                } catch (Throwable th) {
                    WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.DiskUsage);
                    WarmUpUtility.markComputeDiskUsageTimestamp(WarmUpDelegate.this.mConfiguration.mContext);
                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
                    throw th;
                }
            }
        }, TASK_TAG_COMPUTE_DISK_USAGE);
    }

    public void consumingRequestedQut(final CancellationSignal cancellationSignal) {
        this.mThreadTaskExecutor.arrangeTask(new Runnable() { // from class: com.p1.mobile.backtrace.backtrace.WarmUpDelegate.3
            @Override // java.lang.Runnable
            public void run() {
                String strSubstring;
                int iIntValue;
                boolean zWarmUp;
                MatrixLog.m21186i(WarmUpDelegate.TAG, "Going to consume requested QUT.", new Object[0]);
                String[] strArrConsumeRequestedQut = WeChatBacktraceNative.consumeRequestedQut();
                WarmUpInvoker warmUpInvokerAcquireWarmUpInvoker = WarmUpDelegate.this.acquireWarmUpInvoker();
                if (warmUpInvokerAcquireWarmUpInvoker == null) {
                    WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.RequestConsuming);
                    MatrixLog.m21188w(WarmUpDelegate.TAG, "Failed to acquire warm-up invoker.", new Object[0]);
                    return;
                }
                try {
                    for (String str : strArrConsumeRequestedQut) {
                        int iLastIndexOf = str.lastIndexOf(58);
                        if (iLastIndexOf != -1) {
                            try {
                                strSubstring = str.substring(0, iLastIndexOf);
                                try {
                                    iIntValue = Integer.valueOf(str.substring(iLastIndexOf + 1)).intValue();
                                } catch (Throwable unused) {
                                    iIntValue = 0;
                                }
                            } catch (Throwable unused2) {
                                strSubstring = str;
                            }
                        } else {
                            iIntValue = 0;
                            strSubstring = str;
                        }
                        if (WarmUpDelegate.this.warmUpBlocked(strSubstring, iIntValue)) {
                            zWarmUp = false;
                        } else {
                            zWarmUp = warmUpInvokerAcquireWarmUpInvoker.warmUp(strSubstring, iIntValue);
                            if (!zWarmUp) {
                                WarmUpDelegate.this.warmUpFailed(strSubstring, iIntValue);
                            }
                        }
                        MatrixLog.m21186i(WarmUpDelegate.TAG, "Consumed requested QUT -> %s, ret = %s.", str, Boolean.valueOf(zWarmUp));
                        CancellationSignal cancellationSignal2 = cancellationSignal;
                        if (cancellationSignal2 != null && cancellationSignal2.isCanceled()) {
                            MatrixLog.m21186i(WarmUpDelegate.TAG, "Consume requested QUT canceled.", new Object[0]);
                            break;
                        }
                    }
                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Consume requested QUT done.", new Object[0]);
                } finally {
                    WarmUpDelegate.this.releaseWarmUpInvoker(warmUpInvokerAcquireWarmUpInvoker);
                    WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.RequestConsuming);
                }
            }
        }, TASK_TAG_CONSUMING_UP);
    }

    public boolean isBacktraceThreadBlocked() {
        ThreadTaskExecutor threadTaskExecutor = this.mThreadTaskExecutor;
        if (threadTaskExecutor != null) {
            return threadTaskExecutor.isThreadBlocked();
        }
        return true;
    }

    public void prepare(WeChatBacktrace.Configuration configuration) {
        synchronized (this.mPrepared) {
            try {
                boolean[] zArr = this.mPrepared;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                this.mConfiguration = configuration;
                this.mIsolateRemote = configuration.mWarmUpInIsolateProcess;
                this.mThreadTaskExecutor = new ThreadTaskExecutor("WeChatBacktraceTask");
                this.mWarmUpScheduler = new WarmUpScheduler(this, configuration.mContext, configuration.mWarmUpTiming, configuration.mWarmUpDelay);
                if (configuration.mIsWarmUpProcess) {
                    Context context = configuration.mContext;
                    if (!WarmUpUtility.hasWarmedUp(context)) {
                        MatrixLog.m21186i(TAG, "Has not been warmed up", new Object[0]);
                        this.mWarmUpScheduler.scheduleTask(WarmUpScheduler.TaskType.WarmUp);
                    }
                    if (WarmUpUtility.needCleanUp(context)) {
                        MatrixLog.m21186i(TAG, "Need clean up", new Object[0]);
                        this.mWarmUpScheduler.scheduleTask(WarmUpScheduler.TaskType.CleanUp);
                    }
                    if (WarmUpUtility.shouldComputeDiskUsage(context)) {
                        MatrixLog.m21186i(TAG, "Should schedule disk usage task.", new Object[0]);
                        this.mWarmUpScheduler.scheduleTask(WarmUpScheduler.TaskType.DiskUsage);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void registerWarmedUpReceiver(WeChatBacktrace.Configuration configuration, WeChatBacktrace.Mode mode) {
        if (WarmUpUtility.hasWarmedUp(configuration.mContext)) {
            return;
        }
        if (this.mWarmedUpReceiver == null) {
            this.mWarmedUpReceiver = new WarmedUpReceiver(mode);
            MatrixLog.m21186i(TAG, "Register warm-up receiver.", new Object[0]);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ACTION_WARMED_UP);
            configuration.mContext.registerReceiver(this.mWarmedUpReceiver, intentFilter, configuration.mContext.getPackageName() + PERMISSION_WARMED_UP, null);
        }
    }

    public void requestConsuming() {
        if (WarmUpUtility.hasWarmedUp(this.mConfiguration.mContext)) {
            this.mWarmUpScheduler.scheduleTask(WarmUpScheduler.TaskType.RequestConsuming);
        }
    }

    public void setSavingPath(String str) {
        this.mSavingPath = str;
        WeChatBacktraceNative.setSavingPath(str);
    }

    public void warmingUp(final CancellationSignal cancellationSignal) {
        this.mThreadTaskExecutor.arrangeTask(new Runnable() { // from class: com.p1.mobile.backtrace.backtrace.WarmUpDelegate.1
            @Override // java.lang.Runnable
            public void run() {
                MatrixLog.m21186i(WarmUpDelegate.TAG, "Going to warm up.", new Object[0]);
                final WarmUpInvoker warmUpInvokerAcquireWarmUpInvoker = null;
                try {
                    if (!new File(WarmUpUtility.validateSavingPath(WarmUpDelegate.this.mConfiguration)).isDirectory()) {
                        MatrixLog.m21188w(WarmUpDelegate.TAG, "Saving path is not a directory.", new Object[0]);
                        WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.WarmUp);
                        return;
                    }
                    warmUpInvokerAcquireWarmUpInvoker = WarmUpDelegate.this.acquireWarmUpInvoker();
                    if (warmUpInvokerAcquireWarmUpInvoker == null) {
                        MatrixLog.m21188w(WarmUpDelegate.TAG, "Failed to acquire warm-up invoker", new Object[0]);
                        if (warmUpInvokerAcquireWarmUpInvoker != null) {
                            WarmUpDelegate.this.releaseWarmUpInvoker(warmUpInvokerAcquireWarmUpInvoker);
                            return;
                        }
                        return;
                    }
                    Iterator<String> it = WarmUpDelegate.this.mConfiguration.mWarmUpDirectoriesList.iterator();
                    while (it.hasNext()) {
                        WarmUpUtility.iterateTargetDirectory(new File(it.next()), cancellationSignal, new FileFilter() { // from class: com.p1.mobile.backtrace.backtrace.WarmUpDelegate.1.1
                            @Override // java.io.FileFilter
                            public boolean accept(File file) {
                                String absolutePath = file.getAbsolutePath();
                                if (file.exists() && !WarmUpDelegate.this.warmUpBlocked(absolutePath, 0) && (absolutePath.endsWith(".so") || absolutePath.endsWith(ShareConstants.ODEX_SUFFIX) || absolutePath.endsWith(".oat") || absolutePath.endsWith(ShareConstants.DEX_SUFFIX))) {
                                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Warming up so %s", absolutePath);
                                    if (!warmUpInvokerAcquireWarmUpInvoker.warmUp(absolutePath, 0)) {
                                        WarmUpDelegate.this.warmUpFailed(absolutePath, 0);
                                    }
                                }
                                return false;
                            }
                        });
                    }
                    WarmUpDelegate.this.releaseWarmUpInvoker(warmUpInvokerAcquireWarmUpInvoker);
                    WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.WarmUp);
                    WarmUpDelegate warmUpDelegate = WarmUpDelegate.this;
                    warmUpDelegate.broadcastWarmedUp(warmUpDelegate.mConfiguration.mContext);
                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Warm-up done.", new Object[0]);
                } catch (OperationCanceledException unused) {
                    if (0 != 0) {
                        WarmUpDelegate.this.releaseWarmUpInvoker(null);
                    }
                    MatrixLog.m21186i(WarmUpDelegate.TAG, "Warm-up cancelled.", new Object[0]);
                } catch (Throwable th) {
                    try {
                        MatrixLog.printErrStackTrace(WarmUpDelegate.TAG, th, "", new Object[0]);
                        if (0 != 0) {
                        }
                        WarmUpDelegate.this.mWarmUpScheduler.taskFinished(WarmUpScheduler.TaskType.WarmUp);
                        WarmUpDelegate warmUpDelegate2 = WarmUpDelegate.this;
                        warmUpDelegate2.broadcastWarmedUp(warmUpDelegate2.mConfiguration.mContext);
                        MatrixLog.m21186i(WarmUpDelegate.TAG, "Warm-up done.", new Object[0]);
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            WarmUpDelegate.this.releaseWarmUpInvoker(null);
                        }
                        throw th2;
                    }
                }
            }
        }, TASK_TAG_WARM_UP);
    }
}
