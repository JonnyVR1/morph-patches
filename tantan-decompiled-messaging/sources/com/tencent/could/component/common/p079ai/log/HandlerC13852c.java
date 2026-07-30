package com.tencent.could.component.common.p079ai.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.could.component.common.p079ai.utils.C13868a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.c */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC13852c extends Handler {

    /* JADX INFO: renamed from: a */
    public SimpleDateFormat f57265a;

    /* JADX INFO: renamed from: b */
    public Date f57266b;

    /* JADX INFO: renamed from: c */
    public AiLogConfig f57267c;

    /* JADX INFO: renamed from: d */
    public C13855f f57268d;

    /* JADX INFO: renamed from: e */
    public WeakReference<Context> f57269e;

    public HandlerC13852c(Looper looper, AiLogConfig aiLogConfig, Context context) {
        super(looper);
        this.f57267c = aiLogConfig;
        this.f57269e = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m82202a(String str) {
        File file;
        File file2;
        WeakReference<Context> weakReference = this.f57269e;
        Context context = weakReference == null ? null : weakReference.get();
        if (context == null) {
            Log.e("FileWriteHandler", "current context is null!");
            return;
        }
        if (this.f57268d == null) {
            this.f57268d = new C13855f(context);
        }
        C13855f c13855f = this.f57268d;
        if (c13855f == null) {
            Log.e("FileWriteHandler", "writer is null!");
            return;
        }
        if (c13855f.f57279b == null || (file2 = c13855f.f57278a) == null || !file2.exists()) {
            C13855f c13855f2 = this.f57268d;
            boolean zIsUseExternalFile = this.f57267c.isUseExternalFile();
            String dirLog = this.f57267c.getDirLog();
            String logName = this.f57267c.getLogName();
            boolean zIsUseOriginFileName = this.f57267c.isUseOriginFileName();
            WeakReference<Context> weakReference2 = c13855f2.f57280c;
            if (weakReference2 == null) {
                Log.e("LogWriter", "contextReference is null");
            } else if (!zIsUseExternalFile || C13868a.m82210a(weakReference2.get())) {
                if (!zIsUseOriginFileName) {
                    logName = logName + "-" + new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())) + ".ailog";
                }
                File file3 = new File(dirLog, logName);
                c13855f2.f57278a = file3;
                if (!file3.exists()) {
                    try {
                        File file4 = new File(dirLog);
                        if (!file4.exists() && !file4.mkdirs()) {
                            Log.e("LogWriter", "create log dir error! dir: " + dirLog);
                        }
                        c13855f2.f57278a.createNewFile();
                    } catch (Exception e) {
                        Log.e("LogWriter", "create log file error! e: " + e.getMessage());
                        c13855f2.m82204a();
                    }
                }
                try {
                    c13855f2.f57279b = new BufferedWriter(new FileWriter(c13855f2.f57278a, true));
                } catch (Exception e2) {
                    Log.e("LogWriter", "create writer error! e: " + e2.getMessage());
                    c13855f2.m82204a();
                }
            } else {
                Log.e("LogWriter", "no write file permission! ");
            }
            Log.e("FileWriteHandler", "writer open is fail! can not write : " + str);
            return;
        }
        C13855f c13855f3 = this.f57268d;
        if (c13855f3 == null || c13855f3.f57279b == null || (file = c13855f3.f57278a) == null || !file.exists()) {
            return;
        }
        C13855f c13855f4 = this.f57268d;
        if (c13855f4.f57279b == null) {
            Log.e("LogWriter", "writer is null!");
            return;
        }
        try {
            c13855f4.f57279b.write(str);
            c13855f4.f57279b.newLine();
            c13855f4.f57279b.flush();
        } catch (Exception e3) {
            Log.e("LogWriter", "writer not work e: " + e3.getMessage());
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        C13853d c13853d;
        if (message == null) {
            Log.e("FileWriteHandler", "msg is null!");
            return;
        }
        if (message.what != 1) {
            return;
        }
        Object obj = message.obj;
        if (!(obj instanceof C13853d)) {
            return;
        }
        C13853d c13853d2 = null;
        try {
            try {
                c13853d = (C13853d) obj;
                try {
                    m82202a(m82201a(c13853d));
                } catch (Exception e) {
                    e = e;
                    c13853d2 = c13853d;
                    Log.e("FileWriteHandler", "deal with logInfo string error! e: " + e.getMessage());
                    if (c13853d2 == null) {
                        return;
                    } else {
                        c13853d = c13853d2;
                    }
                } catch (Throwable th) {
                    th = th;
                    c13853d2 = c13853d;
                    if (c13853d2 != null) {
                        C13854e.a.f57277a.m82203a(c13853d2);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            C13854e.a.f57277a.m82203a(c13853d);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m82201a(C13853d c13853d) {
        if (this.f57267c.isRecordLogContentOnly()) {
            return c13853d.f57273d;
        }
        long j = c13853d.f57271b;
        if (this.f57265a == null) {
            this.f57265a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
        if (this.f57266b == null) {
            this.f57266b = new Date();
        }
        this.f57266b.setTime(j);
        StringBuilder sb = new StringBuilder(this.f57265a.format(this.f57266b));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(c13853d.f57274e);
        sb.append("/");
        sb.append(c13853d.f57275f);
        int i = c13853d.f57270a;
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
        sb.append(c13853d.f57272c);
        sb.append(": ");
        sb.append(c13853d.f57273d);
        return sb.toString();
    }
}
