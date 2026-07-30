package p153l;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class dsq0 {

    /* JADX INFO: renamed from: c */
    private static volatile dsq0 f90510c;

    /* JADX INFO: renamed from: a */
    private uuq0 f90511a;

    /* JADX INFO: renamed from: b */
    private SQLiteDatabase f90512b;

    private dsq0() {
    }

    /* JADX INFO: renamed from: a */
    public static dsq0 m117772a() {
        if (f90510c == null) {
            synchronized (dsq0.class) {
                try {
                    if (f90510c == null) {
                        f90510c = new dsq0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f90510c;
    }

    /* JADX INFO: renamed from: e */
    private void m117773e() {
        if (this.f90511a == null) {
            m117774b(n0r0.m161022i());
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m117774b(Context context) {
        try {
            this.f90512b = new tuq0(context).getWritableDatabase();
        } catch (Throwable th) {
            q5r0.m175517g(th);
        }
        this.f90511a = new uuq0();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m117775c(esq0 esq0Var) {
        m117773e();
        uuq0 uuq0Var = this.f90511a;
        if (uuq0Var != null) {
            uuq0Var.m198213f(this.f90512b, esq0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m117776d(String str) {
        m117773e();
        uuq0 uuq0Var = this.f90511a;
        if (uuq0Var == null) {
            return false;
        }
        return uuq0Var.m198214g(this.f90512b, str);
    }
}
