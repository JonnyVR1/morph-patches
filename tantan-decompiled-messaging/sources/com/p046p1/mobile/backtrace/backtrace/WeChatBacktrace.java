package com.p046p1.mobile.backtrace.backtrace;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.backtrace.MatrixLog;
import com.p046p1.mobile.backtrace.xlog.XLogNative;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public class WeChatBacktrace {
    private static final String BACKTRACE_LIBRARY_NAME = "wechatbacktrace";
    public static final String ISOLATE_PROCESS_SUFFIX = ":backtrace__";
    private static final String SYSTEM_BOOT_OAT_PATH = "/system/framework/arm/";
    private static final String SYSTEM_BOOT_OAT_PATH_64 = "/system/framework/arm64/";
    private static final String SYSTEM_LIBRARY_PATH = "/system/lib/";
    private static final String SYSTEM_LIBRARY_PATH_64 = "/system/lib64/";
    private static final String SYSTEM_LIBRARY_PATH_Q = "/apex/com.android.runtime/lib/";
    private static final String SYSTEM_LIBRARY_PATH_Q_64 = "/apex/com.android.runtime/lib64/";
    private static final String TAG = "Matrix.Backtrace";
    private static boolean sLibraryLoaded = false;
    private volatile Configuration mConfiguration;
    private volatile boolean mConfigured;
    private volatile boolean mInitialized;
    private WarmUpDelegate mWarmUpDelegate = new WarmUpDelegate();
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mScheduleQutGenerationRequestsRunning = false;

    /* JADX INFO: renamed from: com.p1.mobile.backtrace.backtrace.WeChatBacktrace$2 */
    public static /* synthetic */ class C43872 {

        /* JADX INFO: renamed from: $SwitchMap$com$p1$mobile$backtrace$backtrace$WeChatBacktrace$Mode */
        static final /* synthetic */ int[] f15923xf4ed677d;

        static {
            int[] iArr = new int[Mode.values().length];
            f15923xf4ed677d = iArr;
            try {
                iArr[Mode.Fp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15923xf4ed677d[Mode.Quicken.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15923xf4ed677d[Mode.Dwarf.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15923xf4ed677d[Mode.FpUntilQuickenWarmedUp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15923xf4ed677d[Mode.DwarfUntilQuickenWarmedUp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class Configuration {
        Mode mBacktraceMode;
        private boolean mCommitted;
        Context mContext;
        boolean mCoolDown;
        boolean mCoolDownIfApkUpdated;
        boolean mEnableIsolateProcessLog;
        boolean mEnableLog;
        boolean mIsWarmUpProcess;
        LibraryLoader mLibraryLoader;
        String mPathOfXLogSo;
        boolean mQuickenAlwaysOn;
        String mSavingPath;
        long mWarmUpDelay;
        HashSet<String> mWarmUpDirectoriesList;
        boolean mWarmUpInIsolateProcess;
        WarmUpTiming mWarmUpTiming;
        private WeChatBacktrace mWeChatBacktrace;

        public Configuration(Context context, WeChatBacktrace weChatBacktrace) {
            HashSet<String> hashSet = new HashSet<>();
            this.mWarmUpDirectoriesList = hashSet;
            this.mBacktraceMode = Mode.Quicken;
            this.mLibraryLoader = null;
            this.mCoolDown = false;
            this.mQuickenAlwaysOn = false;
            this.mCoolDownIfApkUpdated = true;
            this.mIsWarmUpProcess = false;
            this.mWarmUpInIsolateProcess = true;
            this.mWarmUpTiming = WarmUpTiming.WhileScreenOff;
            this.mWarmUpDelay = 3000L;
            this.mEnableLog = false;
            this.mEnableIsolateProcessLog = false;
            this.mPathOfXLogSo = null;
            this.mCommitted = false;
            this.mContext = context;
            this.mWeChatBacktrace = weChatBacktrace;
            hashSet.add(context.getApplicationInfo().nativeLibraryDir);
            this.mWarmUpDirectoriesList.add(WeChatBacktrace.getSystemLibraryPath());
            this.mWarmUpDirectoriesList.add(WeChatBacktrace.getBaseODEXPath(context));
            this.mIsWarmUpProcess = ProcessUtil.isMainProcess(this.mContext);
        }

        public Configuration clearWarmUpDirectorySet() {
            if (this.mCommitted) {
                return this;
            }
            this.mWarmUpDirectoriesList.clear();
            return this;
        }

        public void commit() throws Throwable {
            if (this.mCommitted) {
                return;
            }
            this.mCommitted = true;
            this.mWeChatBacktrace.configure(this);
        }

        public Configuration coolDown(boolean z) {
            if (this.mCommitted) {
                return this;
            }
            this.mCoolDown = z;
            return this;
        }

        public Configuration coolDownIfApkUpdated(boolean z) {
            if (this.mCommitted) {
                return this;
            }
            this.mCoolDownIfApkUpdated = z;
            return this;
        }

        public Configuration directoryToWarmUp(String str) {
            if (this.mCommitted) {
                return this;
            }
            this.mWarmUpDirectoriesList.add(str);
            return this;
        }

        public Configuration enableIsolateProcessLogger(boolean z) {
            if (this.mCommitted) {
                return this;
            }
            this.mEnableIsolateProcessLog = z;
            return this;
        }

        public Configuration enableOtherProcessLogger(boolean z) {
            if (this.mCommitted) {
                return this;
            }
            this.mEnableLog = z;
            return this;
        }

        public Configuration isWarmUpProcess(boolean z) {
            if (this.mCommitted) {
                return this;
            }
            this.mIsWarmUpProcess = z;
            return this;
        }

        public Configuration savingPath(String str) {
            if (this.mCommitted) {
                return this;
            }
            this.mSavingPath = str;
            return this;
        }

        public Configuration setBacktraceMode(Mode mode) {
            if (!this.mCommitted && mode != null) {
                this.mBacktraceMode = mode;
            }
            return this;
        }

        public Configuration setLibraryLoader(LibraryLoader libraryLoader) {
            if (this.mCommitted) {
                return this;
            }
            this.mLibraryLoader = libraryLoader;
            return this;
        }

        public Configuration setQuickenAlwaysOn() {
            if (this.mCommitted) {
                return this;
            }
            this.mQuickenAlwaysOn = true;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("\nWeChat backtrace configurations: \n>>> Backtrace Mode: ");
            sb.append(this.mBacktraceMode);
            sb.append("\n>>> Quicken always on: ");
            sb.append(this.mQuickenAlwaysOn);
            sb.append("\n>>> Saving Path: ");
            String strDefaultSavingPath = this.mSavingPath;
            if (strDefaultSavingPath == null) {
                strDefaultSavingPath = WarmUpUtility.defaultSavingPath(this);
            }
            sb.append(strDefaultSavingPath);
            sb.append("\n>>> Custom Library Loader: ");
            sb.append(this.mLibraryLoader != null);
            sb.append("\n>>> Directories to Warm-up: ");
            sb.append(this.mWarmUpDirectoriesList.toString());
            sb.append("\n>>> Is Warm-up Process: ");
            sb.append(this.mIsWarmUpProcess);
            sb.append("\n>>> Warm-up Timing: ");
            sb.append(this.mWarmUpTiming);
            sb.append("\n>>> Warm-up Delay: ");
            sb.append(this.mWarmUpDelay);
            sb.append("ms\n>>> Warm-up in isolate process: ");
            sb.append(this.mWarmUpInIsolateProcess);
            sb.append("\n>>> Enable logger: ");
            sb.append(this.mEnableLog);
            sb.append("\n>>> Enable Isolate Process logger: ");
            sb.append(this.mEnableIsolateProcessLog);
            sb.append("\n>>> Path of XLog: ");
            sb.append(this.mPathOfXLogSo);
            sb.append("\n>>> Cool-down: ");
            sb.append(this.mCoolDown);
            sb.append("\n>>> Cool-down if Apk Updated: ");
            sb.append(this.mCoolDownIfApkUpdated);
            sb.append(SignParameters.NEW_LINE);
            return sb.toString();
        }

        public Configuration warmUpInIsolateProcess(boolean z) {
            if (this.mCommitted) {
                return this;
            }
            this.mWarmUpInIsolateProcess = z;
            return this;
        }

        public Configuration warmUpSettings(WarmUpTiming warmUpTiming, long j) {
            if (this.mCommitted) {
                return this;
            }
            this.mWarmUpTiming = warmUpTiming;
            this.mWarmUpDelay = j;
            return this;
        }

        public Configuration xLoggerPath(String str) {
            if (this.mCommitted) {
                return this;
            }
            this.mPathOfXLogSo = str;
            return this;
        }
    }

    public static final class ConfigurationException extends RuntimeException {
        public ConfigurationException(String str) {
            super(str);
        }
    }

    public interface LibraryLoader {
        void load(String str);
    }

    public enum Mode {
        Fp(0),
        Quicken(1),
        Dwarf(2),
        FpUntilQuickenWarmedUp(3),
        DwarfUntilQuickenWarmedUp(4);

        int value;

        Mode(int i) {
            this.value = i;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = C43872.f15923xf4ed677d[ordinal()];
            if (i == 1) {
                return "FramePointer-based.";
            }
            if (i == 2) {
                return "WeChat QuickenUnwindTable-based.";
            }
            if (i == 3) {
                return "Dwarf-based.";
            }
            if (i != 4) {
                return i != 5 ? "Unreachable." : "Use dwarf-based backtrace before quicken has warmed up.";
            }
            return "Use fp-based backtrace before quicken has warmed up.";
        }
    }

    public static final class Singleton {
        public static final WeChatBacktrace INSTANCE = new WeChatBacktrace();

        private Singleton() {
        }
    }

    public enum WarmUpTiming {
        WhileScreenOff,
        WhileCharging,
        PostStartup
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    public void configure(Configuration configuration) throws Throwable {
        if (runningInIsolateProcess(configuration)) {
            MatrixLog.m21186i(TAG, "Isolate process does not need any configuration.", new Object[0]);
            return;
        }
        if (configuration.mWarmUpInIsolateProcess && configuration.mLibraryLoader != null) {
            throw new ConfigurationException("Custom library loader is not supported in isolate process warm-up mode.");
        }
        loadLibrary(configuration.mLibraryLoader);
        XLogNative.setXLogger(configuration.mPathOfXLogSo);
        enableLogger(configuration.mEnableLog);
        MatrixLog.m21186i(TAG, configuration.toString(), new Object[0]);
        Mode mode = configuration.mBacktraceMode;
        Mode mode2 = Mode.Fp;
        if (mode == mode2 || mode == Mode.Dwarf) {
            WeChatBacktraceNative.setBacktraceMode(mode.value);
        }
        Mode mode3 = configuration.mBacktraceMode;
        Mode mode4 = Mode.Quicken;
        if (mode3 == mode4 || mode3 == Mode.FpUntilQuickenWarmedUp || mode3 == Mode.DwarfUntilQuickenWarmedUp || configuration.mQuickenAlwaysOn) {
            String strValidateSavingPath = WarmUpUtility.validateSavingPath(configuration);
            MatrixLog.m21186i(TAG, "Set saving path: %s", strValidateSavingPath);
            new File(strValidateSavingPath).mkdirs();
            String str = File.separator;
            if (!strValidateSavingPath.endsWith(str)) {
                strValidateSavingPath = strValidateSavingPath + str;
            }
            this.mWarmUpDelegate.setSavingPath(strValidateSavingPath);
            dealWithCoolDown(configuration);
            this.mWarmUpDelegate.prepare(configuration);
            boolean zHasWarmedUp = WarmUpUtility.hasWarmedUp(configuration.mContext);
            Mode mode5 = configuration.mBacktraceMode;
            if (mode5 == mode4 || !configuration.mQuickenAlwaysOn) {
                if (zHasWarmedUp) {
                    mode2 = mode4;
                } else if (mode5 != Mode.FpUntilQuickenWarmedUp) {
                    if (mode5 == Mode.DwarfUntilQuickenWarmedUp) {
                        mode2 = Mode.Dwarf;
                    } else {
                        mode2 = mode4;
                    }
                }
                WeChatBacktraceNative.setBacktraceMode(mode2.value);
            }
            MatrixLog.m21186i(TAG, "Has warmed up: %s", Boolean.valueOf(zHasWarmedUp));
            WeChatBacktraceNative.setWarmedUp(zHasWarmedUp);
            startScheduleQutGenerationRequests();
            if (!configuration.mIsWarmUpProcess) {
                this.mWarmUpDelegate.registerWarmedUpReceiver(configuration, configuration.mBacktraceMode);
            }
        }
        this.mConfigured = true;
    }

    private void dealWithCoolDown(Configuration configuration) throws Throwable {
        if (configuration.mIsWarmUpProcess) {
            File fileWarmUpMarkedFile = WarmUpUtility.warmUpMarkedFile(configuration.mContext);
            if (configuration.mCoolDownIfApkUpdated && fileWarmUpMarkedFile.exists()) {
                String fileContent = WarmUpUtility.readFileContent(fileWarmUpMarkedFile, 4096);
                if (fileContent == null) {
                    configuration.mCoolDown = true;
                } else if (!fileContent.split(SignParameters.NEW_LINE)[0].equalsIgnoreCase(configuration.mContext.getApplicationInfo().nativeLibraryDir)) {
                    MatrixLog.m21186i(TAG, "Apk updated, remove warmed-up file.", new Object[0]);
                    configuration.mCoolDown = true;
                }
            }
            if (configuration.mCoolDown) {
                fileWarmUpMarkedFile.delete();
                WarmUpUtility.unfinishedFile(configuration.mContext).delete();
            }
        }
    }

    public static int[] doStatistic(String str) {
        return WeChatBacktraceNative.statistic(str);
    }

    public static void enableLogger(boolean z) {
        WeChatBacktraceNative.enableLogger(z);
    }

    public static String getBaseODEXPath(Context context) {
        String str = !is64BitRuntime() ? "arm" : "arm64";
        return new File(new File(context.getApplicationInfo().nativeLibraryDir).getParentFile().getParentFile(), "/oat/" + str + "/base.odex").getAbsolutePath();
    }

    public static String getSystemFrameworkOATPath() {
        return !is64BitRuntime() ? SYSTEM_BOOT_OAT_PATH : SYSTEM_BOOT_OAT_PATH_64;
    }

    public static String getSystemLibraryPath() {
        if (Build.VERSION.SDK_INT >= 29) {
            return !is64BitRuntime() ? SYSTEM_LIBRARY_PATH_Q : SYSTEM_LIBRARY_PATH_Q_64;
        }
        return !is64BitRuntime() ? SYSTEM_LIBRARY_PATH : SYSTEM_LIBRARY_PATH_64;
    }

    public static boolean hasWarmedUp(Context context) {
        return WarmUpUtility.hasWarmedUp(context);
    }

    public static WeChatBacktrace instance() {
        return Singleton.INSTANCE;
    }

    public static boolean is64BitRuntime() {
        String str = Build.CPU_ABI;
        return "arm64-v8a".equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str) || "mips64".equalsIgnoreCase(str);
    }

    public static void loadLibrary(LibraryLoader libraryLoader) {
        if (sLibraryLoaded) {
            return;
        }
        if (libraryLoader == null) {
            loadLibrary();
        } else {
            MatrixLog.m21186i(TAG, "Using custom library loader: %s.", libraryLoader);
            libraryLoader.load(BACKTRACE_LIBRARY_NAME);
        }
        sLibraryLoaded = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestQutGenerate() {
        if (this.mInitialized && this.mConfigured) {
            this.mWarmUpDelegate.requestConsuming();
        }
    }

    private boolean runningInIsolateProcess(Configuration configuration) {
        String processNameByPid = ProcessUtil.getProcessNameByPid(configuration.mContext);
        return processNameByPid != null && processNameByPid.endsWith(ISOLATE_PROCESS_SUFFIX);
    }

    public static void setReporter(WarmUpReporter warmUpReporter) {
        WarmUpDelegate.sReporter = warmUpReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScheduleQutGenerationRequests() {
        if (this.mScheduleQutGenerationRequestsRunning) {
            return;
        }
        this.mScheduleQutGenerationRequestsRunning = false;
        this.mHandler.postDelayed(new Runnable() { // from class: com.p1.mobile.backtrace.backtrace.WeChatBacktrace.1
            @Override // java.lang.Runnable
            public void run() {
                WeChatBacktrace.this.requestQutGenerate();
                WeChatBacktrace.this.mScheduleQutGenerationRequestsRunning = false;
                WeChatBacktrace.this.startScheduleQutGenerationRequests();
            }
        }, 21600000L);
    }

    public String getSavingPath() {
        return this.mWarmUpDelegate.mSavingPath;
    }

    public boolean isBacktraceThreadBlocked() {
        return this.mWarmUpDelegate.isBacktraceThreadBlocked();
    }

    public static void loadLibrary() {
        System.loadLibrary(BACKTRACE_LIBRARY_NAME);
    }

    public synchronized Configuration configure(Context context) {
        if (this.mConfiguration != null) {
            return this.mConfiguration;
        }
        this.mConfiguration = new Configuration(context, this);
        this.mInitialized = true;
        return this.mConfiguration;
    }
}
