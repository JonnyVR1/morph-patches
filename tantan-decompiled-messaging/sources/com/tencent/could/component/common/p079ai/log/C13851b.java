package com.tencent.could.component.common.p079ai.log;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.tencent.could.component.common.p079ai.utils.ThreadPoolUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13851b {

    /* JADX INFO: renamed from: a */
    public AiLogConfig f57259a;

    /* JADX INFO: renamed from: b */
    public int f57260b = Process.myPid();

    /* JADX INFO: renamed from: c */
    public String f57261c;

    /* JADX INFO: renamed from: d */
    public WeakReference<Context> f57262d;

    /* JADX INFO: renamed from: e */
    public HandlerC13852c f57263e;

    /* JADX INFO: renamed from: f */
    public HandlerThread f57264f;

    public C13851b(Context context, AiLogConfig aiLogConfig) {
        this.f57259a = aiLogConfig;
        this.f57261c = context.getPackageName();
        this.f57262d = new WeakReference<>(context);
        m82200a(context);
    }

    /* JADX INFO: renamed from: a */
    public void m82199a(int i, String str, String str2) {
        C13853d c13853dAcquire;
        if (this.f57259a.isOpen() && i >= this.f57259a.getMinLevel()) {
            if (this.f57259a.isLogCat()) {
                switch (i) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        break;
                    case 6:
                        Log.e(str, str2);
                        break;
                    case 7:
                        Log.wtf(str, str2);
                        break;
                    default:
                        Log.e(str, "do not know logLevel ！ msg: " + str2);
                        break;
                }
            }
            C13854e c13854e = C13854e.a.f57277a;
            c13854e.getClass();
            synchronized (C13854e.class) {
                c13853dAcquire = c13854e.f57276a.acquire();
            }
            if (c13853dAcquire == null) {
                c13853dAcquire = new C13853d(i, str, str2);
            } else {
                c13853dAcquire.f57271b = System.currentTimeMillis();
                c13853dAcquire.f57270a = i;
                c13853dAcquire.f57272c = str;
                c13853dAcquire.f57273d = str2;
            }
            long id = Thread.currentThread().getId();
            c13853dAcquire.f57274e = this.f57260b + "-" + id;
            c13853dAcquire.f57275f = this.f57261c;
            HandlerC13852c handlerC13852c = this.f57263e;
            if (handlerC13852c != null) {
                Message messageObtainMessage = handlerC13852c.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = c13853dAcquire;
                handlerC13852c.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82200a(Context context) {
        HandlerThread handlerThread = new HandlerThread("FileLogThread");
        this.f57264f = handlerThread;
        handlerThread.start();
        this.f57263e = new HandlerC13852c(this.f57264f.getLooper(), this.f57259a, context);
        ThreadPoolUtil.getInstance().addWork(new RunnableC13850a(this, this.f57259a.getDirLog()));
    }
}
