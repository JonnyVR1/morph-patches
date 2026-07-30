package com.tencent.could.huiyansdk.permission;

import android.app.Activity;
import android.app.Dialog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.permission.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13918c {

    /* JADX INFO: renamed from: a */
    public Dialog f57475a;

    /* JADX INFO: renamed from: b */
    public InterfaceC13916a f57476b;

    /* JADX INFO: renamed from: c */
    public WeakReference<Activity> f57477c;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.permission.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13918c f57478a = new C13918c();
    }

    /* JADX INFO: renamed from: a */
    public final void m82375a() {
        WeakReference<Activity> weakReference;
        if (this.f57475a == null || (weakReference = this.f57477c) == null || weakReference.get() == null || this.f57477c.get().isFinishing()) {
            return;
        }
        this.f57475a.cancel();
        this.f57475a = null;
    }

    /* JADX INFO: renamed from: b */
    public void m82376b() {
        if (this.f57476b != null) {
            this.f57476b = null;
        }
    }
}
