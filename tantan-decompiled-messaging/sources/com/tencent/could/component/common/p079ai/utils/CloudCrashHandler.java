package com.tencent.could.component.common.p079ai.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.could.component.common.p079ai.callback.CrashListener;
import com.tencent.could.component.common.p079ai.eventreport.api.EventReporter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CloudCrashHandler implements Thread.UncaughtExceptionHandler {
    public static String TAG;
    public static CloudCrashHandler crashHandler;
    public static Date curDate;
    public static SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
    public static String str;
    public WeakReference<Context> contextWeakReference;
    public List<CrashListener> crashListeners;
    public Thread.UncaughtExceptionHandler defaultHandler;
    public Map<String, String> infos = new HashMap();
    public String crashInfoTag = "crash";
    public boolean isFilter = false;
    public String filterString = "";
    public boolean isReleaseType = false;
    public volatile boolean isWriterCrash = false;

    static {
        Date date = new Date(System.currentTimeMillis());
        curDate = date;
        str = formatter.format(date);
        TAG = "CloudCrashHandler";
    }

    private void collectDeviceInfo(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 == null) {
                    str2 = "null";
                }
                String str3 = packageInfo.versionCode + "";
                this.infos.put("versionName", str2);
                this.infos.put("versionCode", str3);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "an error occured when collect package info", e);
        }
    }

    private Context getContext() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private Thread.UncaughtExceptionHandler getUncaughtDefaultHandler() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
        if (uncaughtExceptionHandler == null) {
            return null;
        }
        return uncaughtExceptionHandler;
    }

    private boolean handleException(Throwable th) {
        Context context;
        if (th == null || (context = getContext()) == null || this.isWriterCrash) {
            return false;
        }
        this.isWriterCrash = true;
        collectDeviceInfo(context);
        saveCrashInfo2File(context, th);
        return false;
    }

    public static CloudCrashHandler instance() {
        if (crashHandler == null) {
            crashHandler = new CloudCrashHandler();
        }
        return crashHandler;
    }

    private String saveCrashInfo2File(Context context, Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : this.infos.entrySet()) {
            stringBuffer.append(entry.getKey() + "=" + entry.getValue() + SignParameters.NEW_LINE);
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            String string = stringWriter.toString();
            stringWriter.close();
            String string2 = "";
            if (TextUtils.isEmpty(string)) {
                return "";
            }
            if (this.isFilter && !string.contains(this.filterString)) {
                return "";
            }
            sendCrashCallBack(string);
            stringBuffer.append(string);
            String string3 = stringBuffer.toString();
            EventReporter.getInstance().doReportErrorInfo("Crash", string3, "");
            if (this.isReleaseType) {
                return "";
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(externalCacheDir);
                String str2 = File.separator;
                sb.append(str2);
                sb.append(this.crashInfoTag);
                sb.append(str2);
                string2 = sb.toString();
            }
            if (TextUtils.isEmpty(string2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(context.getCacheDir().getAbsolutePath());
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(this.crashInfoTag);
                sb2.append(str3);
                string2 = sb2.toString();
            }
            String str4 = "crash-" + str + "-" + System.currentTimeMillis() + ".log";
            File file = new File(string2);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(string2 + str4);
            fileOutputStream.write(string3.getBytes());
            fileOutputStream.close();
            return str4;
        } catch (Exception e) {
            Log.e(TAG, "an error occured while writing file...", e);
            return null;
        }
    }

    private void sendCrashCallBack(String str2) {
        List<CrashListener> list = this.crashListeners;
        if (list == null) {
            return;
        }
        Iterator<CrashListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().onCrash(str2);
        }
    }

    public void addCrashListener(CrashListener crashListener) {
        if (this.crashListeners == null) {
            this.crashListeners = new ArrayList();
        }
        this.crashListeners.add(crashListener);
    }

    public void init(Context context, String str2, boolean z, String str3, boolean z2) {
        this.contextWeakReference = new WeakReference<>(context);
        this.crashInfoTag = str2;
        this.isReleaseType = z2;
        this.isFilter = z;
        this.filterString = str3;
        this.isWriterCrash = false;
        this.defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        handleException(th);
        Thread.UncaughtExceptionHandler uncaughtDefaultHandler = getUncaughtDefaultHandler();
        if (uncaughtDefaultHandler != null) {
            uncaughtDefaultHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            Log.e(TAG, "error : ", e);
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
