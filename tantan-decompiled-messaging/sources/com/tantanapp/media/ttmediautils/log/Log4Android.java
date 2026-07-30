package com.tantanapp.media.ttmediautils.log;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tantanapp.media.ttmediautils.app.AppContext;
import com.tencent.liteav.TXLiteAVCode;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import p149l.shg0;

/* JADX INFO: loaded from: classes13.dex */
public class Log4Android {
    private static final String TAG = "momo";
    public static boolean enableSaveLog = false;
    private static Log4Android instance;
    private boolean isDebug;
    private String msgPostfix;
    private String msgPrefix;
    private String processName;
    private File saveFile;
    private String tag;
    private BufferedWriter writer;

    /* JADX INFO: renamed from: com.tantanapp.media.ttmediautils.log.Log4Android$1 */
    public static /* synthetic */ class C136731 {

        /* JADX INFO: renamed from: $SwitchMap$com$tantanapp$media$ttmediautils$log$Log4Android$LOG_LEVEL */
        static final /* synthetic */ int[] f56168x908f593;

        static {
            int[] iArr = new int[LOG_LEVEL.values().length];
            f56168x908f593 = iArr;
            try {
                iArr[LOG_LEVEL.LOG_DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56168x908f593[LOG_LEVEL.LOG_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56168x908f593[LOG_LEVEL.LOG_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56168x908f593[LOG_LEVEL.LOG_VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56168x908f593[LOG_LEVEL.LOG_WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum LOG_LEVEL {
        LOG_INFO,
        LOG_DEBUG,
        LOG_ERROR,
        LOG_WARNING,
        LOG_VERBOSE
    }

    private Log4Android(File file) {
        this.tag = "momo";
        this.msgPrefix = "";
        this.msgPostfix = "";
        this.saveFile = null;
        this.writer = null;
        this.isDebug = AppContext.DEBUGGABLE;
        if (file != null) {
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.isDirectory()) {
                String str = "auto_create_" + System.currentTimeMillis() + ".log";
                printLog("Warning: saveFile is a directory, path = ‘" + file.getAbsolutePath() + "’. create a new file ‘" + str + "’");
                File file2 = new File(file, str);
                try {
                    file2.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                file = file2;
            }
            this.saveFile = file;
        }
    }

    public static void formatErrorStack(Appendable appendable, String str, Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter(512);
            PrintWriter printWriter = new PrintWriter(stringWriter);
            while (th != null) {
                th.printStackTrace(printWriter);
                th = th.getCause();
            }
            String string = stringWriter.toString();
            printWriter.close();
            appendable.append(string);
        } catch (Exception unused) {
            shg0.m184191a();
        }
    }

    public static Log4Android getInstance() {
        if (instance == null) {
            synchronized (Log4Android.class) {
                try {
                    if (instance == null) {
                        instance = new Log4Android();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private void saveLog(CharSequence charSequence) {
        File file = this.saveFile;
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (this.writer == null) {
                this.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.saveFile)));
            }
            this.writer.append(charSequence);
            this.writer.flush();
        } catch (Exception unused) {
        }
    }

    public static void writeToFile(File file, CharSequence charSequence) throws Throwable {
        FileWriter fileWriter = null;
        try {
            try {
                FileWriter fileWriter2 = new FileWriter(file, true);
                try {
                    fileWriter2.append(charSequence);
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (Exception unused) {
                    fileWriter = fileWriter2;
                    if (fileWriter == null) {
                    } else {
                        fileWriter.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void close() {
        try {
            this.saveFile = null;
            BufferedWriter bufferedWriter = this.writer;
            if (bufferedWriter != null) {
                bufferedWriter.close();
                this.writer = null;
            }
        } catch (IOException unused) {
        }
    }

    public Log4Android closeDebug() {
        this.isDebug = false;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m81397d(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msgPrefix);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.msgPostfix);
        SLog.m81406d(str, sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public void m81398e(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msgPrefix);
        sb.append(str2 != null ? str2.toString() : "null");
        sb.append(this.msgPostfix);
        SLog.m81413e(str, th, "%s", sb.toString());
    }

    public String getMsgPostfix() {
        return this.msgPostfix;
    }

    public String getMsgPrefix() {
        return this.msgPrefix;
    }

    public File getSaveFile() {
        return this.saveFile;
    }

    public String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: i */
    public void m81402i(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msgPrefix);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.msgPostfix);
        SLog.m81415i(str, sb.toString());
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public long log4Cast(String str, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.isDebug) {
            return jCurrentTimeMillis;
        }
        m81396d(str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + (jCurrentTimeMillis - j));
        return jCurrentTimeMillis;
    }

    public void longInfo(String str) {
        if (str.length() <= 4000) {
            m81401i(str);
        } else {
            m81401i(str.substring(0, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED));
            longInfo(str.substring(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED));
        }
    }

    public Log4Android openDebug() {
        this.isDebug = true;
        return this;
    }

    public void printLog(String str, String str2, Throwable th, LOG_LEVEL log_level) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            str = this.tag;
        }
        boolean z = this.saveFile != null && enableSaveLog;
        if (z) {
            if (this.processName == null) {
                this.processName = AppContext.getCurrentProcessName();
            }
            if (TextUtils.isEmpty(this.processName)) {
                this.processName = "unknown";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
            sb = new StringBuilder();
            sb.append(simpleDateFormat.format(new Date()));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(this.processName);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(log_level.name() + "/" + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        } else {
            sb = null;
        }
        int i = C136731.f56168x908f593[log_level.ordinal()];
        if (i == 1) {
            if (this.isDebug) {
                SLog.m81406d(str, str2);
            }
            if (z) {
                sb.append(str2);
            }
        } else if (i == 2) {
            if (z) {
                formatErrorStack(sb, th);
            }
            if (this.isDebug) {
                if (th == null) {
                    SLog.m81409e(str, str2);
                } else {
                    SLog.m81411e(str, str2, th);
                }
            }
        } else if (i == 3) {
            if (this.isDebug) {
                SLog.m81415i(str, str2);
            }
            if (z) {
                sb.append(str2);
            }
        } else if (i != 4) {
            if (i == 5) {
                if (this.isDebug) {
                    SLog.m81420w(str, str2);
                }
                if (z) {
                    sb.append(str2);
                }
            }
        } else if (this.isDebug) {
            SLog.m81418v(str, str2);
        }
        if (z) {
            sb.append(SignParameters.NEW_LINE);
            if (z) {
                saveLog(sb);
            }
        }
    }

    public void setMsgPostfix(String str) {
        this.msgPostfix = str;
    }

    public void setMsgPrefix(String str) {
        this.msgPrefix = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    /* JADX INFO: renamed from: w */
    public void m81404w(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msgPrefix);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.msgPostfix);
        SLog.m81420w(str, sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public void m81396d(Object obj) {
        m81397d(this.tag, obj);
    }

    /* JADX INFO: renamed from: i */
    public void m81401i(Object obj) {
        m81402i(this.tag, obj);
    }

    /* JADX INFO: renamed from: w */
    public void m81403w(Object obj) {
        m81404w(this.tag, obj);
    }

    public static void formatErrorStack(Appendable appendable, Throwable th) {
        formatErrorStack(appendable, "", th);
    }

    /* JADX INFO: renamed from: e */
    public void m81399e(String str, Throwable th) {
        m81398e(this.tag, str, th);
    }

    /* JADX INFO: renamed from: e */
    public void m81400e(Throwable th) {
        m81399e(this.tag, th);
    }

    public static void saveLog(Throwable th, String str, File file) throws Throwable {
        StringBuilder sb = new StringBuilder();
        if (th != null) {
            formatErrorStack(sb, th);
        }
        saveLog(sb.toString(), str, LOG_LEVEL.LOG_ERROR, file);
    }

    public static void saveLog(StringBuilder sb, Throwable th, String str, File file) throws Throwable {
        if (th != null) {
            formatErrorStack(sb, th);
        }
        saveLog(sb.toString(), str, LOG_LEVEL.LOG_ERROR, file);
    }

    public void saveLog(File file) {
        this.saveFile = file;
    }

    public static void saveLog(String str, String str2, LOG_LEVEL log_level, File file) throws Throwable {
        writeToFile(file, str);
    }

    @Deprecated
    public Log4Android(String str) {
        this.tag = "momo";
        this.msgPrefix = "";
        this.msgPostfix = "";
        this.saveFile = null;
        this.writer = null;
        this.isDebug = AppContext.DEBUGGABLE;
        setTag(str);
    }

    @Deprecated
    public Log4Android(Object obj) {
        this(obj.getClass().getSimpleName());
    }

    public Log4Android(String str, File file) {
        this(file);
        setTag(str);
    }

    @Deprecated
    public Log4Android() {
        this.tag = "momo";
        this.msgPrefix = "";
        this.msgPostfix = "";
        this.saveFile = null;
        this.writer = null;
        this.isDebug = AppContext.DEBUGGABLE;
    }

    public static void printLog(String str, String str2) {
        if (AppContext.DEBUGGABLE) {
            SLog.m81415i(str, str2);
        }
    }

    public void printLog(String str, Throwable th, LOG_LEVEL log_level) {
        printLog(null, str, th, log_level);
    }

    public static void printLog(String str) {
        if (AppContext.DEBUGGABLE) {
            SLog.m81415i("ttmedia", "TTMedia==** " + str);
        }
    }
}
