package p153l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes7.dex */
public final class wuc0 {
    /* JADX INFO: renamed from: a */
    public static <T> T m207944a(Class<T> cls, InvocationHandler invocationHandler) {
        xn80.m212111p(invocationHandler);
        xn80.m212106k(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
