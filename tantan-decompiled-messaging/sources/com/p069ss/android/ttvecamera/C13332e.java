package com.p069ss.android.ttvecamera;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.e */
/* JADX INFO: loaded from: classes11.dex */
public class C13332e {

    /* JADX INFO: renamed from: a */
    private static WeakReference<a> f55495a;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.e$a */
    public interface a {
        void onException(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    public static void m80698a(Throwable th) {
        WeakReference<a> weakReference = f55495a;
        a aVar = weakReference == null ? null : weakReference.get();
        if (aVar != null) {
            aVar.onException(th);
        }
    }
}
