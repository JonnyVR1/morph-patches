package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class yrk0<T> {

    /* JADX INFO: renamed from: a */
    private final fw3 f199676a;

    /* JADX INFO: renamed from: b */
    private String f199677b;

    /* JADX INFO: renamed from: c */
    private String[] f199678c;

    /* JADX INFO: renamed from: d */
    public String f199679d;

    /* JADX INFO: renamed from: e */
    private Double f199680e;

    /* JADX INFO: renamed from: f */
    private T f199681f;

    /* JADX INFO: renamed from: g */
    private T f199682g;

    /* JADX INFO: renamed from: h */
    private String f199683h;

    /* JADX INFO: renamed from: i */
    private boolean f199684i;

    /* JADX INFO: renamed from: j */
    private final List<fsk0<T>> f199685j;

    /* JADX INFO: renamed from: k */
    private final List<fsk0<T>> f199686k;

    /* JADX INFO: renamed from: a */
    private void m215839a() {
        T t = this.f199682g;
        if (t instanceof String) {
            String str = (String) t;
            this.f199679d = str;
            m215840d(str);
            m215841e(this.f199680e);
            return;
        }
        if (t instanceof Number) {
            this.f199679d = "" + this.f199682g;
            this.f199680e = Double.valueOf(((Number) this.f199682g).doubleValue());
            m215841e((Number) this.f199682g);
            return;
        }
        if (t == null || (t instanceof Iterable) || (t instanceof Map)) {
            this.f199679d = null;
            this.f199680e = null;
        } else {
            this.f199679d = t.toString();
            this.f199680e = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m215840d(String str) {
        try {
            this.f199680e = Double.valueOf(str);
        } catch (NumberFormatException unused) {
            this.f199680e = null;
            T t = this.f199681f;
            if (t instanceof Number) {
                this.f199680e = Double.valueOf(((Number) t).doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m215841e(Number number) {
        if (number == null) {
            return;
        }
        T t = this.f199681f;
        if (t instanceof Byte) {
            this.f199682g = (T) Byte.valueOf(number.byteValue());
            return;
        }
        if (t instanceof Short) {
            this.f199682g = (T) Short.valueOf(number.shortValue());
            return;
        }
        if (t instanceof Integer) {
            this.f199682g = (T) Integer.valueOf(number.intValue());
            return;
        }
        if (t instanceof Long) {
            this.f199682g = (T) Long.valueOf(number.longValue());
            return;
        }
        if (t instanceof Float) {
            this.f199682g = (T) Float.valueOf(number.floatValue());
        } else if (t instanceof Double) {
            this.f199682g = (T) Double.valueOf(number.doubleValue());
        } else if (t instanceof Character) {
            this.f199682g = (T) Character.valueOf((char) number.intValue());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m215842h() {
        synchronized (this.f199685j) {
            try {
                for (fsk0<T> fsk0Var : this.f199685j) {
                    fsk0Var.m122955b(this);
                    Utils.m5929z(fsk0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m215843b() {
        this.f199684i = false;
    }

    /* JADX INFO: renamed from: c */
    public String m215844c() {
        return this.f199683h;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public String m215845f() {
        if ("file".equals(this.f199683h)) {
            return this.f199679d;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m215846g() {
        synchronized (this.f199686k) {
            try {
                for (fsk0<T> fsk0Var : this.f199686k) {
                    fsk0Var.m122955b(this);
                    Utils.m5929z(fsk0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m215847i() {
        T t = this.f199682g;
        T t2 = (T) this.f199676a.m123504f().m117933j(this.f199678c);
        this.f199682g = t2;
        if (t2 == null && t == null) {
            return;
        }
        if (t2 != null && t2.equals(t) && this.f199684i) {
            return;
        }
        m215839a();
        if (this.f199676a.m123508k().booleanValue()) {
            this.f199684i = true;
            m215842h();
            if ("file".equals(this.f199683h)) {
                this.f199676a.m123504f().m117932i(this);
            }
        }
    }

    @NonNull
    public String toString() {
        if (!"file".equals(this.f199683h)) {
            return "Var(" + this.f199677b + Constants.SEPARATOR_COMMA + this.f199682g + ")";
        }
        return "Var(" + this.f199677b + Constants.SEPARATOR_COMMA + this.f199676a.m123504f().m117931h(this.f199679d) + ")";
    }
}
