package com.vivo.push.p112c;

import android.content.Context;
import com.vivo.push.util.ContextDelegate;

/* JADX INFO: renamed from: com.vivo.push.c.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14565d {

    /* JADX INFO: renamed from: d */
    private static volatile C14565d f60952d;

    /* JADX INFO: renamed from: a */
    private InterfaceC14563b f60953a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14564c f60954b;

    /* JADX INFO: renamed from: c */
    private Context f60955c;

    private C14565d(Context context) {
        if (this.f60953a == null) {
            this.f60955c = ContextDelegate.getContext(context.getApplicationContext());
            this.f60953a = new C14566e(this.f60955c);
        }
        if (this.f60954b == null) {
            this.f60954b = new C14562a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14565d m84793a(Context context) {
        if (f60952d == null) {
            synchronized (C14565d.class) {
                try {
                    if (f60952d == null && context != null) {
                        f60952d = new C14565d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f60952d;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC14563b m84794a() {
        return this.f60953a;
    }
}
