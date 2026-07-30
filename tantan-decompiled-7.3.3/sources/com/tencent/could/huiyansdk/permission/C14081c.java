package com.tencent.could.huiyansdk.permission;

import android.app.Activity;
import android.app.Dialog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.permission.c */
/* JADX INFO: loaded from: classes12.dex */
public class C14081c {

    /* JADX INFO: renamed from: a */
    public Dialog f58323a;

    /* JADX INFO: renamed from: b */
    public InterfaceC14079a f58324b;

    /* JADX INFO: renamed from: c */
    public WeakReference<Activity> f58325c;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.permission.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14081c f58326a = new C14081c();
    }

    /* JADX INFO: renamed from: a */
    public final void m83558a() {
        WeakReference<Activity> weakReference;
        if (this.f58323a == null || (weakReference = this.f58325c) == null || weakReference.get() == null || this.f58325c.get().isFinishing()) {
            return;
        }
        this.f58323a.cancel();
        this.f58323a = null;
    }

    /* JADX INFO: renamed from: b */
    public void m83559b() {
        if (this.f58324b != null) {
            this.f58324b = null;
        }
    }
}
