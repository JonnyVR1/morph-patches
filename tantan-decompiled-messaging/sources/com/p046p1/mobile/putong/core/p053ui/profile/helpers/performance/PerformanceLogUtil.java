package com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance;

import androidx.annotation.WorkerThread;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.gson.Gson;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Closeable;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okio.Buffer;
import okio.Okio;
import okio.Sink;
import p149l.e30;
import p149l.mkd0;
import p149l.rhi;

/* JADX INFO: loaded from: classes4.dex */
public class PerformanceLogUtil {
    private static final PerformanceLogUtil instance = new PerformanceLogUtil();
    private static final String logDirName = "profilePerformances";
    private static final String suffix = ".json";
    private String preFix = "profile_frag_";
    private final Gson gson = new Gson();
    private final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    public volatile int tranceHash = UUID.randomUUID().hashCode();
    private final List<LogEntity<? extends LogName>> logs = new ArrayList(1024);
    private final HashMap<Integer, LogEntity<?>> beginLogs = new HashMap<>();

    public interface FindCall<T> {
        boolean isFind(T t);
    }

    private PerformanceLogUtil() {
        if (needBlockCall()) {
            return;
        }
        this.preFix += "R_";
        Act.globalLifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.fj60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97760a.lambda$new$3((HashMap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m51439c(ProfileLogEntity profileLogEntity, LogEntity logEntity) {
        return logEntity.traceHash == profileLogEntity.traceHash;
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m51440d(ProfileLogEntity.ProfileLogName profileLogName, long j, LogEntity.LogType logType, int i, int i2, String str) {
        PerformanceLogUtil performanceLogUtilInstance = instance();
        final ProfileLogEntity profileLogEntity = (ProfileLogEntity) ProfileLogEntity.builder().logName(profileLogName).logTime(j).type(logType).tranceHash(i).bindHash(i2).logDescription(str).build();
        if (!performanceLogUtilInstance.logs.isEmpty()) {
            List<LogEntity<? extends LogName>> list = performanceLogUtilInstance.logs;
            j = list.get(list.size() - 1).logTime;
        }
        profileLogEntity.durationLast = profileLogEntity.logTime - j;
        LogEntity logEntity = (LogEntity) find(performanceLogUtilInstance.logs, new FindCall() { // from class: com.p1.mobile.putong.core.ui.profile.helpers.performance.a
            @Override // com.p1.mobile.putong.core.ui.profile.helpers.performance.PerformanceLogUtil.FindCall
            public final boolean isFind(Object obj) {
                return PerformanceLogUtil.m51439c(profileLogEntity, (LogEntity) obj);
            }
        });
        if (logEntity != null) {
            profileLogEntity.durationTrace = profileLogEntity.logTime - logEntity.logTime;
        }
        LogEntity.LogType logType2 = profileLogEntity.type;
        if (logType2 == LogEntity.LogType.BEGIN) {
            performanceLogUtilInstance.beginLogs.put(Integer.valueOf(profileLogEntity.bindHash), profileLogEntity);
        } else if (logType2 == LogEntity.LogType.END) {
            LogEntity<?> logEntityRemove = performanceLogUtilInstance.beginLogs.remove(Integer.valueOf(profileLogEntity.bindHash));
            if (logEntityRemove != null) {
                profileLogEntity.durationBegin = profileLogEntity.durationTime(logEntityRemove.logTime);
            }
        } else if (logType2 == LogEntity.LogType.SINGLE) {
            profileLogEntity.durationBegin = 0L;
        }
        instance().logEntity(profileLogEntity);
    }

    private static <T> T find(List<T> list, FindCall<T> findCall) {
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                for (T t : list) {
                    if (findCall.isFind(t)) {
                        return t;
                    }
                }
            }
        }
        return null;
    }

    private File getLogDir() {
        return new File(rhi.m179378v(), logDirName);
    }

    public static PerformanceLogUtil instance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(HashMap map) {
        if (Act.foreground_() != null) {
            return;
        }
        this.singleThreadExecutor.submit(new Runnable() { // from class: l.dj60
            @Override // java.lang.Runnable
            public final void run() {
                this.f86505a.lambda$new$2();
            }
        });
    }

    public static void logBegin(int i, ProfileLogEntity.ProfileLogName profileLogName) {
        if (needBlockCall()) {
            return;
        }
        logPerformance(i, profileLogName, LogEntity.LogType.BEGIN, null);
    }

    public static void logEnd(int i, ProfileLogEntity.ProfileLogName profileLogName) {
        if (needBlockCall()) {
            return;
        }
        logPerformance(i, profileLogName, LogEntity.LogType.END, null);
    }

    @WorkerThread
    private synchronized <T extends LogEntity<? extends LogName>> void logEntity(T t) {
        this.logs.add(t);
    }

    private static void logPerformance(final int i, final ProfileLogEntity.ProfileLogName profileLogName, final LogEntity.LogType logType, final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int i2 = instance.tranceHash;
        instance().singleThreadExecutor.execute(new Runnable() { // from class: l.ej60
            @Override // java.lang.Runnable
            public final void run() {
                PerformanceLogUtil.m51440d(profileLogName, jCurrentTimeMillis, logType, i2, i, str);
            }
        });
    }

    public static void logSingle(String str) {
        if (needBlockCall()) {
            return;
        }
        logPerformance(str.hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, LogEntity.LogType.SINGLE, str);
    }

    public static boolean needBlockCall() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeLogFile, reason: merged with bridge method [inline-methods] */
    public void lambda$new$2() {
        if (needBlockCall()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        File logDir = getLogDir();
        if (!logDir.exists()) {
            logDir.mkdir();
        }
        Calendar calendar = Calendar.getInstance();
        File file = new File(logDir, this.preFix + calendar.get(1) + "" + (calendar.get(2) + 1) + "" + calendar.get(5) + suffix);
        Sink sink = null;
        try {
            sink = Okio.sink(file, true);
            Buffer buffer = new Buffer();
            arrayList.addAll(this.logs);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                buffer.writeString(this.gson.toJson((LogEntity) it.next()), StandardCharsets.UTF_8);
                buffer.write(SignParameters.NEW_LINE.getBytes());
            }
            sink.write(buffer, buffer.size());
            sink.flush();
            this.logs.clear();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        } finally {
            closeQuietly(sink);
        }
    }

    public void beginTrance() {
        if (needBlockCall()) {
            return;
        }
        this.tranceHash = UUID.randomUUID().hashCode();
    }

    public void endTrance() {
        if (needBlockCall()) {
            return;
        }
        this.tranceHash = UUID.randomUUID().hashCode();
    }

    public static void logBegin(int i, ProfileLogEntity.ProfileLogName profileLogName, String str) {
        if (needBlockCall()) {
            return;
        }
        logPerformance(i, profileLogName, LogEntity.LogType.BEGIN, str);
    }

    public static void logEnd(int i, ProfileLogEntity.ProfileLogName profileLogName, String str) {
        if (needBlockCall()) {
            return;
        }
        logPerformance(i, profileLogName, LogEntity.LogType.END, str);
    }
}
