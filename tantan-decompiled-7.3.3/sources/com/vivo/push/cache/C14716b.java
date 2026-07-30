package com.vivo.push.cache;

import android.content.Context;
import com.vivo.push.util.C14795p;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.vivo.push.cache.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14716b {

    /* JADX INFO: renamed from: a */
    private static volatile C14716b f61808a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14718d f61809b;

    private C14716b() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC14718d m85977a(Context context) {
        InterfaceC14718d interfaceC14718d = this.f61809b;
        if (interfaceC14718d != null) {
            return interfaceC14718d;
        }
        try {
            Method method = ClientConfigManagerImpl.class.getMethod("getInstance", Context.class);
            C14795p.m86192d("ConfigManagerFactory", "createConfig success is ".concat("com.vivo.push.cache.ClientConfigManagerImpl"));
            InterfaceC14718d interfaceC14718d2 = (InterfaceC14718d) method.invoke(null, context);
            this.f61809b = interfaceC14718d2;
            return interfaceC14718d2;
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86187b("ConfigManagerFactory", "createConfig error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14716b m85976a() {
        try {
            if (f61808a == null) {
                f61808a = new C14716b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61808a;
    }
}
