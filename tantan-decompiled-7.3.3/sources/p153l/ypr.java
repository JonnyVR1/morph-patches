package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ypr implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public List<w6m> f201082a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<w6m> f201083b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public w6m f201084c;

    public ypr(w6m w6mVar) {
        this.f201084c = w6mVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m217027b() {
        this.f201082a.removeAll(this.f201083b);
        this.f201083b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m217028c(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Iterator<w6m> it = this.f201082a.iterator();
            while (it.hasNext()) {
                method.invoke(it.next(), objArr);
            }
            m217027b();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m217029d(Object obj, Method method, Object[] objArr) {
        try {
            m217028c(obj, method, objArr);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m217030e(w6m w6mVar) {
        if (this.f201082a.contains(w6mVar)) {
            return;
        }
        this.f201082a.add(w6mVar);
    }

    /* JADX INFO: renamed from: f */
    public void m217031f(w6m w6mVar) {
        this.f201083b.add(w6mVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(final Object obj, final Method method, final Object[] objArr) throws Throwable {
        if (method.getName().equals("onEngineError")) {
            l51.m152893M(new Runnable() { // from class: l.wpr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190335a.m217029d(obj, method, objArr);
                }
            });
        } else {
            m217028c(obj, method, objArr);
        }
        return method.invoke(this.f201084c, objArr);
    }
}
