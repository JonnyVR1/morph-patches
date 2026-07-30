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
import p153l.aqg0;

/* JADX INFO: loaded from: classes12.dex */
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
    public static /* synthetic */ class C138361 {

        /* JADX INFO: renamed from: $SwitchMap$com$tantanapp$media$ttmediautils$log$Log4Android$LOG_LEVEL */
        static final /* synthetic */ int[] f57016x908f593;

        static {
            int[] iArr = new int[LOG_LEVEL.values().length];
            f57016x908f593 = iArr;
            try {
                iArr[LOG_LEVEL.LOG_DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57016x908f593[LOG_LEVEL.LOG_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57016x908f593[LOG_LEVEL.LOG_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57016x908f593[LOG_LEVEL.LOG_VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57016x908f593[LOG_LEVEL.LOG_WARNING.ordinal()] = 5;
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
            aqg0.m99478a();
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
    public void m82580d(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msgPrefix);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.msgPostfix);
        SLog.m82589d(str, sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public void m82581e(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msgPrefix);
        sb.append(str2 != null ? str2.toString() : "null");
        sb.append(this.msgPostfix);
        SLog.m82596e(str, th, "%s", sb.toString());
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
    public void m82585i(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msgPrefix);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.msgPostfix);
        SLog.m82598i(str, sb.toString());
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public long log4Cast(String str, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.isDebug) {
            return jCurrentTimeMillis;
        }
        m82579d(str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + (jCurrentTimeMillis - j));
        return jCurrentTimeMillis;
    }

    public void longInfo(String str) {
        if (str.length() <= 4000) {
            m82584i(str);
        } else {
            m82584i(str.substring(0, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED));
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
        int i = C138361.f57016x908f593[log_level.ordinal()];
        if (i == 1) {
            if (this.isDebug) {
                SLog.m82589d(str, str2);
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
                    SLog.m82592e(str, str2);
                } else {
                    SLog.m82594e(str, str2, th);
                }
            }
        } else if (i == 3) {
            if (this.isDebug) {
                SLog.m82598i(str, str2);
            }
            if (z) {
                sb.append(str2);
            }
        } else if (i != 4) {
            if (i == 5) {
                if (this.isDebug) {
                    SLog.m82603w(str, str2);
                }
                if (z) {
                    sb.append(str2);
                }
            }
        } else if (this.isDebug) {
            SLog.m82601v(str, str2);
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
    public void m82587w(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.msgPrefix);
        sb.append(obj != null ? obj.toString() : "null");
        sb.append(this.msgPostfix);
        SLog.m82603w(str, sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public void m82579d(Object obj) {
        m82580d(this.tag, obj);
    }

    /* JADX INFO: renamed from: i */
    public void m82584i(Object obj) {
        m82585i(this.tag, obj);
    }

    /* JADX INFO: renamed from: w */
    public void m82586w(Object obj) {
        m82587w(this.tag, obj);
    }

    public static void formatErrorStack(Appendable appendable, Throwable th) {
        formatErrorStack(appendable, "", th);
    }

    /* JADX INFO: renamed from: e */
    public void m82582e(String str, Throwable th) {
        m82581e(this.tag, str, th);
    }

    /* JADX INFO: renamed from: e */
    public void m82583e(Throwable th) {
        m82582e(this.tag, th);
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
            SLog.m82598i(str, str2);
        }
    }

    public void printLog(String str, Throwable th, LOG_LEVEL log_level) {
        printLog(null, str, th, log_level);
    }

    public static void printLog(String str) {
        if (AppContext.DEBUGGABLE) {
            SLog.m82598i("ttmedia", "TTMedia==** " + str);
        }
    }
}
