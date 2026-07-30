package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class xnr implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public List<g4m> f193726a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<g4m> f193727b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public g4m f193728c;

    public xnr(g4m g4mVar) {
        this.f193728c = g4mVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m210201b() {
        this.f193726a.removeAll(this.f193727b);
        this.f193727b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m210202c(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Iterator<g4m> it = this.f193726a.iterator();
            while (it.hasNext()) {
                method.invoke(it.next(), objArr);
            }
            m210201b();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m210203d(Object obj, Method method, Object[] objArr) {
        try {
            m210202c(obj, method, objArr);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m210204e(g4m g4mVar) {
        if (this.f193726a.contains(g4mVar)) {
            return;
        }
        this.f193726a.add(g4mVar);
    }

    /* JADX INFO: renamed from: f */
    public void m210205f(g4m g4mVar) {
        this.f193727b.add(g4mVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(final Object obj, final Method method, final Object[] objArr) throws Throwable {
        if (method.getName().equals("onEngineError")) {
            e51.m114748M(new Runnable() { // from class: l.vnr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182270a.m210203d(obj, method, objArr);
                }
            });
        } else {
            m210202c(obj, method, objArr);
        }
        return method.invoke(this.f193728c, objArr);
    }
}
