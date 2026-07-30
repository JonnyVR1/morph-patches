package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class xpr implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<w6m> f195731a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b */
    public CopyOnWriteArrayList<w6m> f195732b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public w6m f195733c;

    public xpr(w6m w6mVar) {
        this.f195733c = w6mVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m212671b() {
        this.f195731a.removeAll(this.f195732b);
        this.f195732b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m212672c(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Iterator<w6m> it = this.f195731a.iterator();
            while (it.hasNext()) {
                method.invoke(it.next(), objArr);
            }
            m212671b();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m212673d(Object obj, Method method, Object[] objArr) {
        try {
            m212672c(obj, method, objArr);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m212674e(w6m w6mVar) {
        if (this.f195731a.contains(w6mVar)) {
            return;
        }
        this.f195731a.add(w6mVar);
    }

    /* JADX INFO: renamed from: f */
    public void m212675f(w6m w6mVar) {
        this.f195732b.add(w6mVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(final Object obj, final Method method, final Object[] objArr) throws Throwable {
        if (method.getName().equals("onEngineError")) {
            l51.m152893M(new Runnable() { // from class: l.vpr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185293a.m212673d(obj, method, objArr);
                }
            });
        } else {
            m212672c(obj, method, objArr);
        }
        return method.invoke(this.f195733c, objArr);
    }
}
