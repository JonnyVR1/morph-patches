package com.tencent.could.component.common.p084ai.log;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.tencent.could.component.common.p084ai.utils.ThreadPoolUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.b */
/* JADX INFO: loaded from: classes12.dex */
public class C14014b {

    /* JADX INFO: renamed from: a */
    public AiLogConfig f58107a;

    /* JADX INFO: renamed from: b */
    public int f58108b = Process.myPid();

    /* JADX INFO: renamed from: c */
    public String f58109c;

    /* JADX INFO: renamed from: d */
    public WeakReference<Context> f58110d;

    /* JADX INFO: renamed from: e */
    public HandlerC14015c f58111e;

    /* JADX INFO: renamed from: f */
    public HandlerThread f58112f;

    public C14014b(Context context, AiLogConfig aiLogConfig) {
        this.f58107a = aiLogConfig;
        this.f58109c = context.getPackageName();
        this.f58110d = new WeakReference<>(context);
        m83383a(context);
    }

    /* JADX INFO: renamed from: a */
    public void m83382a(int i, String str, String str2) {
        C14016d c14016dAcquire;
        if (this.f58107a.isOpen() && i >= this.f58107a.getMinLevel()) {
            if (this.f58107a.isLogCat()) {
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
            C14017e c14017e = C14017e.a.f58125a;
            c14017e.getClass();
            synchronized (C14017e.class) {
                c14016dAcquire = c14017e.f58124a.acquire();
            }
            if (c14016dAcquire == null) {
                c14016dAcquire = new C14016d(i, str, str2);
            } else {
                c14016dAcquire.f58119b = System.currentTimeMillis();
                c14016dAcquire.f58118a = i;
                c14016dAcquire.f58120c = str;
                c14016dAcquire.f58121d = str2;
            }
            long id = Thread.currentThread().getId();
            c14016dAcquire.f58122e = this.f58108b + "-" + id;
            c14016dAcquire.f58123f = this.f58109c;
            HandlerC14015c handlerC14015c = this.f58111e;
            if (handlerC14015c != null) {
                Message messageObtainMessage = handlerC14015c.obtainMessage();
                messageObtainMessage.what = 1;
                messageObtainMessage.obj = c14016dAcquire;
                handlerC14015c.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83383a(Context context) {
        HandlerThread handlerThread = new HandlerThread("FileLogThread");
        this.f58112f = handlerThread;
        handlerThread.start();
        this.f58111e = new HandlerC14015c(this.f58112f.getLooper(), this.f58107a, context);
        ThreadPoolUtil.getInstance().addWork(new RunnableC14013a(this, this.f58107a.getDirLog()));
    }
}
