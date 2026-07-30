package p149l;

import java.util.Formatter;

/* JADX INFO: loaded from: classes7.dex */
public class zwd {

    /* JADX INFO: renamed from: a */
    public final ne3 f205170a;

    /* JADX INFO: renamed from: b */
    public final wb5[] f205171b;

    public zwd(ne3 ne3Var) {
        this.f205170a = new ne3(ne3Var);
        this.f205171b = new wb5[(ne3Var.m159095e() - ne3Var.m159097g()) + 1];
    }

    /* JADX INFO: renamed from: a */
    public final ne3 m220582a() {
        return this.f205170a;
    }

    /* JADX INFO: renamed from: b */
    public final wb5 m220583b(int i) {
        return this.f205171b[m220586e(i)];
    }

    /* JADX INFO: renamed from: c */
    public final wb5 m220584c(int i) {
        wb5 wb5Var;
        wb5 wb5Var2;
        wb5 wb5VarM220583b = m220583b(i);
        if (wb5VarM220583b != null) {
            return wb5VarM220583b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iM220586e = m220586e(i) - i2;
            if (iM220586e >= 0 && (wb5Var2 = this.f205171b[iM220586e]) != null) {
                return wb5Var2;
            }
            int iM220586e2 = m220586e(i) + i2;
            wb5[] wb5VarArr = this.f205171b;
            if (iM220586e2 < wb5VarArr.length && (wb5Var = wb5VarArr[iM220586e2]) != null) {
                return wb5Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final wb5[] m220585d() {
        return this.f205171b;
    }

    /* JADX INFO: renamed from: e */
    public final int m220586e(int i) {
        return i - this.f205170a.m159097g();
    }

    /* JADX INFO: renamed from: f */
    public final void m220587f(int i, wb5 wb5Var) {
        this.f205171b[m220586e(i)] = wb5Var;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (wb5 wb5Var : this.f205171b) {
                if (wb5Var == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(wb5Var.m202515c()), Integer.valueOf(wb5Var.m202517e()));
                    i++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
