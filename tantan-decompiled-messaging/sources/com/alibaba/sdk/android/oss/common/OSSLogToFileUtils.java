package com.alibaba.sdk.android.oss.common;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.MediaStore;
import com.alibaba.sdk.android.oss.ClientConfiguration;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class OSSLogToFileUtils {
    private static final String LOG_DIR_NAME = "OSSLog";
    private static OSSLogToFileUtils instance;
    private static Context sContext;
    private static File sLogFile;
    private static Uri sLogUri;
    private boolean useSdCard = true;
    private static LogThreadPoolManager logService = LogThreadPoolManager.newInstance();
    private static SimpleDateFormat sLogSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static long LOG_MAX_SIZE = 5242880;

    public static class WriteCall implements Runnable {
        private Object mStr;

        public WriteCall(Object obj) {
            this.mStr = obj;
        }

        private PrintWriter printEx(PrintWriter printWriter) {
            printWriter.println("crash_time：" + OSSLogToFileUtils.sLogSDF.format(new Date()));
            ((Throwable) this.mStr).printStackTrace(printWriter);
            return printWriter;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OSSLogToFileUtils.sLogFile != null) {
                OSSLogToFileUtils.getInstance();
                if (OSSLogToFileUtils.getLogFileSize(OSSLogToFileUtils.sLogFile) > OSSLogToFileUtils.LOG_MAX_SIZE) {
                    OSSLogToFileUtils.getInstance().resetLogFile();
                }
                try {
                    PrintWriter printWriter = new PrintWriter((Writer) new FileWriter(OSSLogToFileUtils.sLogFile, true), true);
                    if (this.mStr instanceof Throwable) {
                        printEx(printWriter);
                    } else {
                        printWriter.println(OSSLogToFileUtils.getInstance().getFunctionInfo(null) + " - " + this.mStr.toString());
                    }
                    printWriter.println("------>end of log");
                    printWriter.println();
                    printWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private OSSLogToFileUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getFunctionInfo(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null) {
            return null;
        }
        return "[" + sLogSDF.format(new Date()) + Constants.AES_SUFFIX;
    }

    public static OSSLogToFileUtils getInstance() {
        if (instance == null) {
            synchronized (OSSLogToFileUtils.class) {
                try {
                    if (instance == null) {
                        instance = new OSSLogToFileUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public static long getLocalLogFileSize() {
        return getLogFileSize(sLogFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getLogFile() {
        File file;
        boolean z = false;
        File file2 = null;
        try {
            boolean z2 = true;
            if (this.useSdCard && Environment.getExternalStorageState().equals("mounted") && Build.VERSION.SDK_INT < 29) {
                if (readSDCardSpace() <= LOG_MAX_SIZE / 1024) {
                    z2 = false;
                }
                file = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + LOG_DIR_NAME);
            } else {
                if (readSystemSpace() <= LOG_MAX_SIZE / 1024) {
                    z2 = false;
                }
                file = new File(sContext.getFilesDir().getPath() + File.separator + LOG_DIR_NAME);
            }
            z = z2;
        } catch (Exception unused) {
            file = null;
        }
        if (z) {
            if (!file.exists()) {
                file.mkdirs();
            }
            file2 = new File(file.getPath() + "/logs.csv");
            if (!file2.exists()) {
                createNewFile(file2);
            }
        }
        return file2;
    }

    public static long getLogFileSize(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        return file.length();
    }

    private Uri getLogUri() {
        ContentResolver contentResolver = sContext.getContentResolver();
        Uri uriQueryLogUri = queryLogUri();
        if (uriQueryLogUri != null) {
            return uriQueryLogUri;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", "logs.csv");
        contentValues.put("mime_type", "file/csv");
        contentValues.put("title", "logs.csv");
        contentValues.put("relative_path", "Documents/OSSLog");
        Uri uriInsert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
        try {
            contentResolver.openFileDescriptor(uriInsert, "w");
            return uriInsert;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void init(Context context, ClientConfiguration clientConfiguration) {
        File file;
        OSSLog.logDebug("init ...", false);
        if (clientConfiguration != null) {
            LOG_MAX_SIZE = clientConfiguration.getMaxLogSize();
        }
        if (sContext != null && instance != null && (file = sLogFile) != null && file.exists()) {
            OSSLog.logDebug("LogToFileUtils has been init ...", false);
            return;
        }
        sContext = context.getApplicationContext();
        instance = getInstance();
        logService.addExecuteTask(new Runnable() { // from class: com.alibaba.sdk.android.oss.common.OSSLogToFileUtils.1
            @Override // java.lang.Runnable
            public void run() {
                File unused = OSSLogToFileUtils.sLogFile = OSSLogToFileUtils.instance.getLogFile();
                if (OSSLogToFileUtils.sLogFile != null) {
                    OSSLog.logInfo("LogFilePath is: " + OSSLogToFileUtils.sLogFile.getPath(), false);
                    if (OSSLogToFileUtils.LOG_MAX_SIZE < OSSLogToFileUtils.getLogFileSize(OSSLogToFileUtils.sLogFile)) {
                        OSSLog.logInfo("init reset log file", false);
                        OSSLogToFileUtils.instance.resetLogFile();
                    }
                }
            }
        });
    }

    private Uri queryLogUri() {
        ContentResolver contentResolver = sContext.getContentResolver();
        Uri contentUri = MediaStore.Files.getContentUri("external");
        Cursor cursorQuery = contentResolver.query(contentUri, new String[]{"_id"}, "relative_path like ? AND _display_name=?", new String[]{"Documents/OSSLog%", "logs.csv"}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return null;
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(contentUri, cursorQuery.getLong(0));
        cursorQuery.close();
        return uriWithAppendedId;
    }

    private long readSDCardSpace() {
        long availableBlocksLong = 0;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableBlocksLong = statFs.getAvailableBlocksLong() * ((long) statFs.getBlockSize());
            } catch (Exception unused) {
            }
        }
        OSSLog.logDebug("sd卡存储空间:" + String.valueOf(availableBlocksLong) + "kb", false);
        return availableBlocksLong;
    }

    private long readSystemSpace() {
        long availableBlocksLong;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocksLong = (statFs.getAvailableBlocksLong() * ((long) statFs.getBlockSize())) / 1024;
        } catch (Exception unused) {
            availableBlocksLong = 0;
        }
        OSSLog.logDebug("内部存储空间:" + String.valueOf(availableBlocksLong) + "kb", false);
        return availableBlocksLong;
    }

    public static void reset() {
        sContext = null;
        instance = null;
        sLogFile = null;
    }

    public void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) {
            OSSLog.logError("Create log file failure !!! " + e.toString(), false);
        }
    }

    public void deleteLogFile() {
        File file = new File(sLogFile.getParent() + "/logs.csv");
        if (file.exists()) {
            OSSLog.logDebug("delete Log File ... ", false);
            file.delete();
        }
    }

    public void deleteLogFileDir() {
        deleteLogFile();
        File file = new File(sLogFile.getParent());
        if (file.exists()) {
            OSSLog.logDebug("delete Log FileDir ... ", false);
            file.delete();
        }
    }

    public void resetLogFile() {
        OSSLog.logDebug("Reset Log File ... ", false);
        if (!sLogFile.getParentFile().exists()) {
            OSSLog.logDebug("Reset Log make File dir ... ", false);
            sLogFile.getParentFile().mkdir();
        }
        File file = new File(sLogFile.getParent() + "/logs.csv");
        if (file.exists()) {
            file.delete();
        }
        createNewFile(file);
    }

    public void setUseSdCard(boolean z) {
        this.useSdCard = z;
    }

    public synchronized void write(Object obj) {
        File file;
        try {
            if (OSSLog.isEnableLog()) {
                if (sContext != null && instance != null && (file = sLogFile) != null) {
                    if (!file.exists()) {
                        resetLogFile();
                    }
                    logService.addExecuteTask(new WriteCall(obj));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
