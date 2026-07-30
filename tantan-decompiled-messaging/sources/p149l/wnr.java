package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class wnr implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<g4m> f187337a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b */
    public CopyOnWriteArrayList<g4m> f187338b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public g4m f187339c;

    public wnr(g4m g4mVar) {
        this.f187339c = g4mVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m204762b() {
        this.f187337a.removeAll(this.f187338b);
        this.f187338b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m204763c(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Iterator<g4m> it = this.f187337a.iterator();
            while (it.hasNext()) {
                method.invoke(it.next(), objArr);
            }
            m204762b();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m204764d(Object obj, Method method, Object[] objArr) {
        try {
            m204763c(obj, method, objArr);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m204765e(g4m g4mVar) {
        if (this.f187337a.contains(g4mVar)) {
            return;
        }
        this.f187337a.add(g4mVar);
    }

    /* JADX INFO: renamed from: f */
    public void m204766f(g4m g4mVar) {
        this.f187338b.add(g4mVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(final Object obj, final Method method, final Object[] objArr) throws Throwable {
        if (method.getName().equals("onEngineError")) {
            e51.m114748M(new Runnable() { // from class: l.unr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177425a.m204764d(obj, method, objArr);
                }
            });
        } else {
            m204763c(obj, method, objArr);
        }
        return method.invoke(this.f187339c, objArr);
    }
}
