package p149l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
class wjq0 implements tjq0 {

    /* JADX INFO: renamed from: a */
    private Context f186672a;

    /* JADX INFO: renamed from: b */
    private Class<?> f186673b;

    /* JADX INFO: renamed from: c */
    private Object f186674c;

    /* JADX INFO: renamed from: d */
    private Method f186675d = null;

    /* JADX INFO: renamed from: e */
    private Method f186676e = null;

    /* JADX INFO: renamed from: f */
    private Method f186677f = null;

    /* JADX INFO: renamed from: g */
    private Method f186678g = null;

    public wjq0(Context context) {
        this.f186672a = context;
        m203488c(context);
    }

    /* JADX INFO: renamed from: b */
    private String m203487b(Context context, Method method) {
        Object obj = this.f186674c;
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
            ilq0.m137042o("miui invoke error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m203488c(Context context) {
        try {
            Class<?> clsM161880c = nwq0.m161880c(context, "com.android.id.impl.IdProviderImpl");
            this.f186673b = clsM161880c;
            this.f186674c = clsM161880c.newInstance();
            this.f186676e = this.f186673b.getMethod("getOAID", Context.class);
        } catch (Exception e) {
            ilq0.m137042o("miui load class error", e);
        }
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public boolean mo97175a() {
        return (this.f186673b == null || this.f186674c == null) ? false : true;
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public String mo97174a() {
        return m203487b(this.f186672a, this.f186676e);
    }
}
