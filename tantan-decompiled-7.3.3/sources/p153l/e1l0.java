package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e1l0<T> {

    /* JADX INFO: renamed from: a */
    private final ex3 f91624a;

    /* JADX INFO: renamed from: b */
    private String f91625b;

    /* JADX INFO: renamed from: c */
    private String[] f91626c;

    /* JADX INFO: renamed from: d */
    public String f91627d;

    /* JADX INFO: renamed from: e */
    private Double f91628e;

    /* JADX INFO: renamed from: f */
    private T f91629f;

    /* JADX INFO: renamed from: g */
    private T f91630g;

    /* JADX INFO: renamed from: h */
    private String f91631h;

    /* JADX INFO: renamed from: i */
    private boolean f91632i;

    /* JADX INFO: renamed from: j */
    private final List<l1l0<T>> f91633j;

    /* JADX INFO: renamed from: k */
    private final List<l1l0<T>> f91634k;

    /* JADX INFO: renamed from: a */
    private void m118984a() {
        T t = this.f91630g;
        if (t instanceof String) {
            String str = (String) t;
            this.f91627d = str;
            m118985d(str);
            m118986e(this.f91628e);
            return;
        }
        if (t instanceof Number) {
            this.f91627d = "" + this.f91630g;
            this.f91628e = Double.valueOf(((Number) this.f91630g).doubleValue());
            m118986e((Number) this.f91630g);
            return;
        }
        if (t == null || (t instanceof Iterable) || (t instanceof Map)) {
            this.f91627d = null;
            this.f91628e = null;
        } else {
            this.f91627d = t.toString();
            this.f91628e = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m118985d(String str) {
        try {
            this.f91628e = Double.valueOf(str);
        } catch (NumberFormatException unused) {
            this.f91628e = null;
            T t = this.f91629f;
            if (t instanceof Number) {
                this.f91628e = Double.valueOf(((Number) t).doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m118986e(Number number) {
        if (number == null) {
            return;
        }
        T t = this.f91629f;
        if (t instanceof Byte) {
            this.f91630g = (T) Byte.valueOf(number.byteValue());
            return;
        }
        if (t instanceof Short) {
            this.f91630g = (T) Short.valueOf(number.shortValue());
            return;
        }
        if (t instanceof Integer) {
            this.f91630g = (T) Integer.valueOf(number.intValue());
            return;
        }
        if (t instanceof Long) {
            this.f91630g = (T) Long.valueOf(number.longValue());
            return;
        }
        if (t instanceof Float) {
            this.f91630g = (T) Float.valueOf(number.floatValue());
        } else if (t instanceof Double) {
            this.f91630g = (T) Double.valueOf(number.doubleValue());
        } else if (t instanceof Character) {
            this.f91630g = (T) Character.valueOf((char) number.intValue());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m118987h() {
        synchronized (this.f91633j) {
            try {
                for (l1l0<T> l1l0Var : this.f91633j) {
                    l1l0Var.m152506b(this);
                    Utils.m5983z(l1l0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m118988b() {
        this.f91632i = false;
    }

    /* JADX INFO: renamed from: c */
    public String m118989c() {
        return this.f91631h;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public String m118990f() {
        if ("file".equals(this.f91631h)) {
            return this.f91627d;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m118991g() {
        synchronized (this.f91634k) {
            try {
                for (l1l0<T> l1l0Var : this.f91634k) {
                    l1l0Var.m152506b(this);
                    Utils.m5983z(l1l0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m118992i() {
        T t = this.f91630g;
        T t2 = (T) this.f91624a.m123005f().m147885j(this.f91626c);
        this.f91630g = t2;
        if (t2 == null && t == null) {
            return;
        }
        if (t2 != null && t2.equals(t) && this.f91632i) {
            return;
        }
        m118984a();
        if (this.f91624a.m123009k().booleanValue()) {
            this.f91632i = true;
            m118987h();
            if ("file".equals(this.f91631h)) {
                this.f91624a.m123005f().m147884i(this);
            }
        }
    }

    @NonNull
    public String toString() {
        if (!"file".equals(this.f91631h)) {
            return "Var(" + this.f91625b + Constants.SEPARATOR_COMMA + this.f91630g + ")";
        }
        return "Var(" + this.f91625b + Constants.SEPARATOR_COMMA + this.f91624a.m123005f().m147883h(this.f91627d) + ")";
    }
}
