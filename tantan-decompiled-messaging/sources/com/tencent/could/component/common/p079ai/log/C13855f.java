package com.tencent.could.component.common.p079ai.log;

import android.content.Context;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.f */
/* JADX INFO: loaded from: classes2.dex */
public class C13855f {

    /* JADX INFO: renamed from: a */
    public File f57278a;

    /* JADX INFO: renamed from: b */
    public volatile BufferedWriter f57279b;

    /* JADX INFO: renamed from: c */
    public WeakReference<Context> f57280c;

    public C13855f(Context context) {
        this.f57280c = new WeakReference<>(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m82204a() {
        try {
            if (this.f57279b != null) {
                this.f57279b.close();
            }
        } catch (Exception e) {
            Log.e("LogWriter", "close writer fail! e: " + e.getMessage());
        } finally {
            this.f57279b = null;
            this.f57278a = null;
        }
    }
}
