package com.tencent.could.component.common.p084ai.log;

import android.content.Context;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.f */
/* JADX INFO: loaded from: classes12.dex */
public class C14018f {

    /* JADX INFO: renamed from: a */
    public File f58126a;

    /* JADX INFO: renamed from: b */
    public volatile BufferedWriter f58127b;

    /* JADX INFO: renamed from: c */
    public WeakReference<Context> f58128c;

    public C14018f(Context context) {
        this.f58128c = new WeakReference<>(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m83387a() {
        try {
            if (this.f58127b != null) {
                this.f58127b.close();
            }
        } catch (Exception e) {
            Log.e("LogWriter", "close writer fail! e: " + e.getMessage());
        } finally {
            this.f58127b = null;
            this.f58126a = null;
        }
    }
}
