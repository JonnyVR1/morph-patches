package p153l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
class ctq0 implements zsq0 {

    /* JADX INFO: renamed from: a */
    private Context f83750a;

    /* JADX INFO: renamed from: b */
    private Class<?> f83751b;

    /* JADX INFO: renamed from: c */
    private Object f83752c;

    /* JADX INFO: renamed from: d */
    private Method f83753d = null;

    /* JADX INFO: renamed from: e */
    private Method f83754e = null;

    /* JADX INFO: renamed from: f */
    private Method f83755f = null;

    /* JADX INFO: renamed from: g */
    private Method f83756g = null;

    public ctq0(Context context) {
        this.f83750a = context;
        m112548c(context);
    }

    /* JADX INFO: renamed from: b */
    private String m112547b(Context context, Method method) {
        Object obj = this.f83752c;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e) {
            ouq0.m169395o("miui invoke error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m112548c(Context context) {
        try {
            Class<?> clsM189419c = t5r0.m189419c(context, "com.android.id.impl.IdProviderImpl");
            this.f83751b = clsM189419c;
            this.f83752c = clsM189419c.newInstance();
            this.f83754e = this.f83751b.getMethod("getOAID", Context.class);
        } catch (Exception e) {
            ouq0.m169395o("miui load class error", e);
        }
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public boolean mo100237a() {
        return (this.f83751b == null || this.f83752c == null) ? false : true;
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public String mo100236a() {
        return m112547b(this.f83750a, this.f83754e);
    }
}
