package p153l;

import java.util.Formatter;

/* JADX INFO: loaded from: classes7.dex */
public class nyd {

    /* JADX INFO: renamed from: a */
    public final cf3 f144300a;

    /* JADX INFO: renamed from: b */
    public final wc5[] f144301b;

    public nyd(cf3 cf3Var) {
        this.f144300a = new cf3(cf3Var);
        this.f144301b = new wc5[(cf3Var.m109518e() - cf3Var.m109520g()) + 1];
    }

    /* JADX INFO: renamed from: a */
    public final cf3 m165318a() {
        return this.f144300a;
    }

    /* JADX INFO: renamed from: b */
    public final wc5 m165319b(int i) {
        return this.f144301b[m165322e(i)];
    }

    /* JADX INFO: renamed from: c */
    public final wc5 m165320c(int i) {
        wc5 wc5Var;
        wc5 wc5Var2;
        wc5 wc5VarM165319b = m165319b(i);
        if (wc5VarM165319b != null) {
            return wc5VarM165319b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iM165322e = m165322e(i) - i2;
            if (iM165322e >= 0 && (wc5Var2 = this.f144301b[iM165322e]) != null) {
                return wc5Var2;
            }
            int iM165322e2 = m165322e(i) + i2;
            wc5[] wc5VarArr = this.f144301b;
            if (iM165322e2 < wc5VarArr.length && (wc5Var = wc5VarArr[iM165322e2]) != null) {
                return wc5Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final wc5[] m165321d() {
        return this.f144301b;
    }

    /* JADX INFO: renamed from: e */
    public final int m165322e(int i) {
        return i - this.f144300a.m109520g();
    }

    /* JADX INFO: renamed from: f */
    public final void m165323f(int i, wc5 wc5Var) {
        this.f144301b[m165322e(i)] = wc5Var;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (wc5 wc5Var : this.f144301b) {
                if (wc5Var == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(wc5Var.m205785c()), Integer.valueOf(wc5Var.m205787e()));
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
