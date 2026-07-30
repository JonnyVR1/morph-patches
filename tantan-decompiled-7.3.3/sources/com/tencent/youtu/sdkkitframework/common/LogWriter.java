package com.tencent.youtu.sdkkitframework.common;

import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class LogWriter {
    public static final String LOGFILE_TAG_NAME = "logfile";
    public static final String LOG_CONFIGFILE_NAME = "log.properties";
    public static LogWriter logWriter;

    /* JADX INFO: renamed from: a */
    public final String f61398a;

    /* JADX INFO: renamed from: b */
    public PrintWriter f61399b;

    /* JADX INFO: renamed from: c */
    public String f61400c;

    /* JADX INFO: renamed from: d */
    public String f61401d;

    public LogWriter(String str, String str2) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str3 = File.separator;
        sb.append(str3);
        sb.append("NativeLog");
        sb.append(str3);
        sb.append("default.log");
        this.f61398a = sb.toString();
        this.f61401d = str2;
        this.f61400c = str;
        m85805a();
    }

    public static synchronized LogWriter getLogWriter() {
        try {
            if (logWriter == null) {
                logWriter = new LogWriter();
            }
        } catch (Throwable th) {
            throw th;
        }
        return logWriter;
    }

    public static void main(String[] strArr) {
        try {
            LogWriter logWriter2 = getLogWriter("./workspace/temp/logger.log", "./workspace");
            logWriter2.log("First log!");
            logWriter2.log("第二个日志信息");
            logWriter2.log("Third log");
            logWriter2.log("第四个日志信息");
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 1000000; i++) {
                stringBuffer.append("tableaA|device_number|13701010");
                stringBuffer.append(i);
                stringBuffer.append(";\n");
            }
            String string = stringBuffer.toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            logWriter2.log(string);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            System.out.println("总消耗时间：" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
            logWriter2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m85805a() throws Exception {
        String property;
        YtLogger.m85808d("LogWriter", "init()");
        File file = new File(this.f61401d);
        if (!file.exists()) {
            file.mkdir();
        }
        if (this.f61400c == null) {
            try {
                Properties properties = new Properties();
                InputStream resourceAsStream = getClass().getResourceAsStream(LOG_CONFIGFILE_NAME);
                if (resourceAsStream != null) {
                    properties.load(resourceAsStream);
                    resourceAsStream.close();
                    property = properties.getProperty(LOGFILE_TAG_NAME);
                } else {
                    System.err.println("无法打开属性配置文件: log.properties");
                    property = null;
                }
            } catch (IOException unused) {
                System.err.println("无法打开属性配置文件: log.properties");
            }
            this.f61400c = property;
            if (property == null) {
                this.f61400c = this.f61398a;
            }
        }
        YtLogger.m85808d("LogWriter", "logFileName: " + this.f61400c);
        File file2 = new File(this.f61400c);
        try {
            this.f61399b = new PrintWriter((Writer) new FileWriter(file2, false), true);
            System.out.println("日志文件的位置：" + file2.getAbsolutePath());
        } catch (IOException e) {
            throw new Exception("无法打开日志文件:" + file2.getAbsolutePath(), e);
        }
    }

    public void close() {
        logWriter = null;
        PrintWriter printWriter = this.f61399b;
        if (printWriter != null) {
            printWriter.close();
        }
    }

    public synchronized void log(Exception exc) {
        this.f61399b.println(new Date() + ": ");
        exc.printStackTrace(this.f61399b);
    }

    public static synchronized LogWriter getLogWriter(String str, String str2) {
        try {
            if (logWriter == null) {
                logWriter = new LogWriter(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return logWriter;
    }

    public synchronized void log(String str) {
        this.f61399b.println(new Date() + ": " + str);
    }

    public LogWriter() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb.append(str);
        sb.append("NativeLog");
        sb.append(str);
        sb.append("default.log");
        this.f61398a = sb.toString();
        m85805a();
    }
}
