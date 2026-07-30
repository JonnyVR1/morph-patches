package com.vivo.push.p117c;

import android.content.Context;
import com.vivo.push.util.ContextDelegate;

/* JADX INFO: renamed from: com.vivo.push.c.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14713d {

    /* JADX INFO: renamed from: d */
    private static volatile C14713d f61799d;

    /* JADX INFO: renamed from: a */
    private InterfaceC14711b f61800a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14712c f61801b;

    /* JADX INFO: renamed from: c */
    private Context f61802c;

    private C14713d(Context context) {
        if (this.f61800a == null) {
            this.f61802c = ContextDelegate.getContext(context.getApplicationContext());
            this.f61800a = new C14714e(this.f61802c);
        }
        if (this.f61801b == null) {
            this.f61801b = new C14710a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14713d m85964a(Context context) {
        if (f61799d == null) {
            synchronized (C14713d.class) {
                try {
                    if (f61799d == null && context != null) {
                        f61799d = new C14713d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f61799d;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC14711b m85965a() {
        return this.f61800a;
    }
}
