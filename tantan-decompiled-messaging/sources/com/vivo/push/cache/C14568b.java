package com.vivo.push.cache;

import android.content.Context;
import com.vivo.push.util.C14647p;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.vivo.push.cache.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14568b {

    /* JADX INFO: renamed from: a */
    private static volatile C14568b f60961a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14570d f60962b;

    private C14568b() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC14570d m84806a(Context context) {
        InterfaceC14570d interfaceC14570d = this.f60962b;
        if (interfaceC14570d != null) {
            return interfaceC14570d;
        }
        try {
            Method method = ClientConfigManagerImpl.class.getMethod("getInstance", Context.class);
            C14647p.m85021d("ConfigManagerFactory", "createConfig success is ".concat("com.vivo.push.cache.ClientConfigManagerImpl"));
            InterfaceC14570d interfaceC14570d2 = (InterfaceC14570d) method.invoke(null, context);
            this.f60962b = interfaceC14570d2;
            return interfaceC14570d2;
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85016b("ConfigManagerFactory", "createConfig error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14568b m84805a() {
        try {
            if (f60961a == null) {
                f60961a = new C14568b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60961a;
    }
}
