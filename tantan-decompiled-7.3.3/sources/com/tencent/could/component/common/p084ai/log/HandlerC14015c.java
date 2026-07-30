package com.tencent.could.component.common.p084ai.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.could.component.common.p084ai.utils.C14031a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.c */
/* JADX INFO: loaded from: classes12.dex */
public class HandlerC14015c extends Handler {

    /* JADX INFO: renamed from: a */
    public SimpleDateFormat f58113a;

    /* JADX INFO: renamed from: b */
    public Date f58114b;

    /* JADX INFO: renamed from: c */
    public AiLogConfig f58115c;

    /* JADX INFO: renamed from: d */
    public C14018f f58116d;

    /* JADX INFO: renamed from: e */
    public WeakReference<Context> f58117e;

    public HandlerC14015c(Looper looper, AiLogConfig aiLogConfig, Context context) {
        super(looper);
        this.f58115c = aiLogConfig;
        this.f58117e = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m83385a(String str) {
        File file;
        File file2;
        WeakReference<Context> weakReference = this.f58117e;
        Context context = weakReference == null ? null : weakReference.get();
        if (context == null) {
            Log.e("FileWriteHandler", "current context is null!");
            return;
        }
        if (this.f58116d == null) {
            this.f58116d = new C14018f(context);
        }
        C14018f c14018f = this.f58116d;
        if (c14018f == null) {
            Log.e("FileWriteHandler", "writer is null!");
            return;
        }
        if (c14018f.f58127b == null || (file2 = c14018f.f58126a) == null || !file2.exists()) {
            C14018f c14018f2 = this.f58116d;
            boolean zIsUseExternalFile = this.f58115c.isUseExternalFile();
            String dirLog = this.f58115c.getDirLog();
            String logName = this.f58115c.getLogName();
            boolean zIsUseOriginFileName = this.f58115c.isUseOriginFileName();
            WeakReference<Context> weakReference2 = c14018f2.f58128c;
            if (weakReference2 == null) {
                Log.e("LogWriter", "contextReference is null");
            } else if (!zIsUseExternalFile || C14031a.m83393a(weakReference2.get())) {
                if (!zIsUseOriginFileName) {
                    logName = logName + "-" + new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())) + ".ailog";
                }
                File file3 = new File(dirLog, logName);
                c14018f2.f58126a = file3;
                if (!file3.exists()) {
                    try {
                        File file4 = new File(dirLog);
                        if (!file4.exists() && !file4.mkdirs()) {
                            Log.e("LogWriter", "create log dir error! dir: " + dirLog);
                        }
                        c14018f2.f58126a.createNewFile();
                    } catch (Exception e) {
                        Log.e("LogWriter", "create log file error! e: " + e.getMessage());
                        c14018f2.m83387a();
                    }
                }
                try {
                    c14018f2.f58127b = new BufferedWriter(new FileWriter(c14018f2.f58126a, true));
                } catch (Exception e2) {
                    Log.e("LogWriter", "create writer error! e: " + e2.getMessage());
                    c14018f2.m83387a();
                }
            } else {
                Log.e("LogWriter", "no write file permission! ");
            }
            Log.e("FileWriteHandler", "writer open is fail! can not write : " + str);
            return;
        }
        C14018f c14018f3 = this.f58116d;
        if (c14018f3 == null || c14018f3.f58127b == null || (file = c14018f3.f58126a) == null || !file.exists()) {
            return;
        }
        C14018f c14018f4 = this.f58116d;
        if (c14018f4.f58127b == null) {
            Log.e("LogWriter", "writer is null!");
            return;
        }
        try {
            c14018f4.f58127b.write(str);
            c14018f4.f58127b.newLine();
            c14018f4.f58127b.flush();
        } catch (Exception e3) {
            Log.e("LogWriter", "writer not work e: " + e3.getMessage());
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        C14016d c14016d;
        if (message == null) {
            Log.e("FileWriteHandler", "msg is null!");
            return;
        }
        if (message.what != 1) {
            return;
        }
        Object obj = message.obj;
        if (!(obj instanceof C14016d)) {
            return;
        }
        C14016d c14016d2 = null;
        try {
            try {
                c14016d = (C14016d) obj;
                try {
                    m83385a(m83384a(c14016d));
                } catch (Exception e) {
                    e = e;
                    c14016d2 = c14016d;
                    Log.e("FileWriteHandler", "deal with logInfo string error! e: " + e.getMessage());
                    if (c14016d2 == null) {
                        return;
                    } else {
                        c14016d = c14016d2;
                    }
                } catch (Throwable th) {
                    th = th;
                    c14016d2 = c14016d;
                    if (c14016d2 != null) {
                        C14017e.a.f58125a.m83386a(c14016d2);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            C14017e.a.f58125a.m83386a(c14016d);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m83384a(C14016d c14016d) {
        if (this.f58115c.isRecordLogContentOnly()) {
            return c14016d.f58121d;
        }
        long j = c14016d.f58119b;
        if (this.f58113a == null) {
            this.f58113a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
        if (this.f58114b == null) {
            this.f58114b = new Date();
        }
        this.f58114b.setTime(j);
        StringBuilder sb = new StringBuilder(this.f58113a.format(this.f58114b));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(c14016d.f58122e);
        sb.append("/");
        sb.append(c14016d.f58123f);
        int i = c14016d.f58118a;
        StringBuilder sb2 = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        switch (i) {
            case 2:
                sb2.append("VERBOSE");
                break;
            case 3:
                sb2.append("DEBUG");
                break;
            case 4:
                sb2.append("INFO");
                break;
            case 5:
                sb2.append("WARN");
                break;
            case 6:
                sb2.append("ERROR");
                break;
            case 7:
                sb2.append("ASSERT");
                break;
            default:
                sb2.append("null");
                break;
        }
        sb.append(sb2.toString());
        sb.append("/");
        sb.append(c14016d.f58120c);
        sb.append(": ");
        sb.append(c14016d.f58121d);
        return sb.toString();
    }
}
