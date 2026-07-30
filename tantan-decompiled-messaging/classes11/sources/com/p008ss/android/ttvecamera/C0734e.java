package com.p008ss.android.ttvecamera;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0734e {

    /* JADX INFO: renamed from: a */
    private static WeakReference<a> f9101a;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.e$a */
    public interface a {
        void onException(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    public static void m11049a(Throwable th) {
        WeakReference<a> weakReference = f9101a;
        a aVar = weakReference == null ? null : weakReference.get();
        if (aVar != null) {
            aVar.onException(th);
        }
    }
}
