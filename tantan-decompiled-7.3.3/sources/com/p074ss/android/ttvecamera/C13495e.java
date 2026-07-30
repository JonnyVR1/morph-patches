package com.p074ss.android.ttvecamera;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.e */
/* JADX INFO: loaded from: classes11.dex */
public class C13495e {

    /* JADX INFO: renamed from: a */
    private static WeakReference<a> f56343a;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.e$a */
    public interface a {
        void onException(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    public static void m81881a(Throwable th) {
        WeakReference<a> weakReference = f56343a;
        a aVar = weakReference == null ? null : weakReference.get();
        if (aVar != null) {
            aVar.onException(th);
        }
    }
}
