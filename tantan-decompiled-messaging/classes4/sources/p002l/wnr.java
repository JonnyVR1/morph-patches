package p002l;

import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.e51;
import l.g4m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wnr implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<g4m> f21883a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b */
    public CopyOnWriteArrayList<g4m> f21884b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public g4m f21885c;

    public wnr(g4m g4mVar) {
        this.f21885c = g4mVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m25257b() {
        this.f21883a.removeAll(this.f21884b);
        this.f21884b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m25258c(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Iterator<g4m> it = this.f21883a.iterator();
            while (it.hasNext()) {
                method.invoke(it.next(), objArr);
            }
            m25257b();
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m25259d(Object obj, Method method, Object[] objArr) {
        try {
            m25258c(obj, method, objArr);
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m25260e(g4m g4mVar) {
        if (this.f21883a.contains(g4mVar)) {
            return;
        }
        this.f21883a.add(g4mVar);
    }

    /* JADX INFO: renamed from: f */
    public void m25261f(g4m g4mVar) {
        this.f21884b.add(g4mVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(final Object obj, final Method method, final Object[] objArr) throws Throwable {
        if (method.getName().equals("onEngineError")) {
            e51.M(new Runnable() { // from class: l.unr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20733a.m25259d(obj, method, objArr);
                }
            });
        } else {
            m25258c(obj, method, objArr);
        }
        return method.invoke(this.f21885c, objArr);
    }
}
