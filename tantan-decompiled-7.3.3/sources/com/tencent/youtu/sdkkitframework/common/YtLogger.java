package com.tencent.youtu.sdkkitframework.common;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class YtLogger {
    public static final int DEBUG_LEVEL = 4;
    public static final int ERROR_LEVEL = 0;
    public static final int INFO_LEVEL = 2;
    public static final int ONLINE_LEVEL = -1000;
    public static final int VERB_LEVEL = 5;
    public static final int WARN_LEVEL = 1;
    public static String localLogPath;

    @SuppressLint({"SimpleDateFormat"})
    public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS");
    public static IYtLoggerListener loggerListener = null;
    public static boolean needLogFile = false;
    public static String keywords = null;
    public static File localFile = null;
    public static int currentLogLevel = 0;
    public static String lastLogMessage = "";
    public static ExecutorService mExecutorService = Executors.newSingleThreadExecutor();

    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    public static void buildMessageForLocalLogFile(int i, String str, String str2) {
        int i2;
        if (i == 0 || i == 1 || (i2 = currentLogLevel) == 4 || ((i2 == 2 && i != 4) || (i2 == -1000 && i == -1000))) {
            StringBuffer stringBuffer = new StringBuffer();
            if (i == -1000) {
                stringBuffer.append("[ONLINE]");
            } else if (i == 0) {
                stringBuffer.append("[ERROR]");
            } else if (i == 1) {
                stringBuffer.append("[WARN]");
            } else if (i == 2) {
                stringBuffer.append("[INFO]");
            } else if (i == 4) {
                stringBuffer.append("[DEBUG]");
            } else if (i == 5) {
                stringBuffer.append("[VERB]");
            }
            stringBuffer.append(dateFormat.format(new Date()));
            stringBuffer.append("        ");
            stringBuffer.append(str);
            stringBuffer.append("    ");
            stringBuffer.append(str2);
            save2File(stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m85808d(String str, Object obj) {
        if (currentLogLevel >= 4) {
            showLog(4, str, "[YTLog]-[DEBUG]-" + obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m85809e(String str, String str2, Throwable th) {
        int i = currentLogLevel;
        if (i >= 0 || i == -1000) {
            showLog(0, str, "[YTLog]-[ERROR]-" + str2, th);
        }
    }

    public static File getLogFile(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file.getPath() + File.separator + (dateFormat.format(new Date()) + ".log"));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file2;
    }

    /* JADX INFO: renamed from: i */
    public static void m85810i(String str, String str2) {
        if (currentLogLevel >= 2) {
            showLog(2, str, "[YTLog]-[INFO]-" + str2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m85811o(String str, Object obj) {
        int i = currentLogLevel;
        if (i == -1000 || i == 4) {
            showLog(-1000, str, "[YTLog]-[ONLINE]-" + System.currentTimeMillis() + "-" + obj);
        }
    }

    public static void save2File(String str) {
        File file = localFile;
        if (file != null) {
            writeFile(file, str);
        }
    }

    public static void setLogLevel(int i) {
        currentLogLevel = i != -1000 ? Math.min(i, Math.max(i, 0)) : -1000;
    }

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static void setNeedLogFile(boolean z, String str, String str2) {
        if (TextUtils.isEmpty(localLogPath)) {
            needLogFile = false;
            m85813w("YTLog", "file saved must put path", null);
            return;
        }
        needLogFile = z;
        if (z) {
            keywords = str2;
            localLogPath = str;
            localFile = getLogFile(str);
        }
    }

    public static void showLog(int i, String str, String str2, Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        if (th != null) {
            stringBuffer.append(Log.getStackTraceString(th));
        }
        String string = stringBuffer.toString();
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, string);
        }
        String str3 = localLogPath;
        if (str3 != null && !"".equals(str3) && needLogFile) {
            buildMessageForLocalLogFile(i, str, string);
        }
        Log.e(str, string);
    }

    /* JADX INFO: renamed from: v */
    public static void m85812v(String str, Object obj) {
        if (currentLogLevel >= 5) {
            showLog(5, str, "[YTLog]-[VERB]-" + obj);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m85813w(String str, String str2, Throwable th) {
        int i = currentLogLevel;
        if (i >= 1 || i == -1000) {
            showLog(1, str, "[YTLog]-[WARN]-" + str2, th);
        }
    }

    public static void writeFile(final File file, final String str) {
        if (TextUtils.isEmpty(keywords) || !str.contains(keywords)) {
            return;
        }
        mExecutorService.submit(new Runnable() { // from class: com.tencent.youtu.sdkkitframework.common.YtLogger.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                PrintWriter printWriter = null;
                try {
                    try {
                        PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
                        try {
                            printWriter2.println(str);
                            printWriter2.flush();
                            printWriter2.close();
                        } catch (Exception e) {
                            e = e;
                            printWriter = printWriter2;
                            e.printStackTrace();
                            if (printWriter != null) {
                                printWriter.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            printWriter = printWriter2;
                            if (printWriter != null) {
                                printWriter.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        });
    }

    public static void setNeedLogFile(boolean z, String str) {
        setNeedLogFile(z, str, null);
    }

    public static void showLog(int i, String str, String str2) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
        String str3 = localLogPath;
        if (str3 != null && !"".equals(str3) && needLogFile) {
            buildMessageForLocalLogFile(i, str, str2);
        }
        if (lastLogMessage.equals(str2)) {
            return;
        }
        lastLogMessage = str2;
    }
}
