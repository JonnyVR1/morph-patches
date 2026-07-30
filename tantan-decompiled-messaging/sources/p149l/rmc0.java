package p149l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes7.dex */
public final class rmc0 {
    /* JADX INFO: renamed from: a */
    public static <T> T m179975a(Class<T> cls, InvocationHandler invocationHandler) {
        sf80.m183894p(invocationHandler);
        sf80.m183889k(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
