package p149l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class yiq0 {

    /* JADX INFO: renamed from: c */
    private static volatile yiq0 f198539c;

    /* JADX INFO: renamed from: a */
    private olq0 f198540a;

    /* JADX INFO: renamed from: b */
    private SQLiteDatabase f198541b;

    private yiq0() {
    }

    /* JADX INFO: renamed from: a */
    public static yiq0 m215005a() {
        if (f198539c == null) {
            synchronized (yiq0.class) {
                try {
                    if (f198539c == null) {
                        f198539c = new yiq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f198539c;
    }

    /* JADX INFO: renamed from: e */
    private void m215006e() {
        if (this.f198540a == null) {
            m215007b(hrq0.m132700i());
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m215007b(Context context) {
        try {
            this.f198541b = new nlq0(context).getWritableDatabase();
        } catch (Throwable th) {
            kwq0.m147634g(th);
        }
        this.f198540a = new olq0();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m215008c(ziq0 ziq0Var) {
        m215006e();
        olq0 olq0Var = this.f198540a;
        if (olq0Var != null) {
            olq0Var.m164986f(this.f198541b, ziq0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m215009d(String str) {
        m215006e();
        olq0 olq0Var = this.f198540a;
        if (olq0Var == null) {
            return false;
        }
        return olq0Var.m164987g(this.f198541b, str);
    }
}
