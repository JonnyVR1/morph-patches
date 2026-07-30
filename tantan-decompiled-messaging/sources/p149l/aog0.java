package p149l;

import Sudchar.Sudfor;
import Sudchar.Sudtry;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class aog0 implements ofg0, rlg0 {
    @Override // p149l.rlg0
    /* JADX INFO: renamed from: a */
    public final long mo97895a(b8g0 b8g0Var) throws IOException {
        try {
            return b8g0Var.m100772b();
        } catch (IOException e) {
            b8g0Var.f74114d.m98118b(e);
            throw e;
        }
    }

    @Override // p149l.ofg0
    /* JADX INFO: renamed from: b */
    public final ncg0 mo97896b(b8g0 b8g0Var) throws IOException {
        apg0 apg0Var = b8g0Var.f74114d;
        while (true) {
            try {
                if (apg0Var.m98119c()) {
                    throw Sudfor.f210105Suddo;
                }
                return b8g0Var.m100773c();
            } catch (IOException e) {
                if (!(e instanceof Sudtry)) {
                    b8g0Var.f74114d.m98118b(e);
                    b8g0Var.f74114d.m98117a().f137525t.add(Integer.valueOf(b8g0Var.f74111a));
                    throw e;
                }
                b8g0Var.f74117g = 1;
                synchronized (b8g0Var) {
                    try {
                        if (b8g0Var.f74120j != null) {
                            jmg0 jmg0Var = b8g0Var.f74120j;
                            jmg0Var.f118634c = null;
                            exc0 exc0Var = jmg0Var.f118635d;
                            if (exc0Var != null) {
                                exc0Var.close();
                            }
                            jmg0Var.f118635d = null;
                            Objects.toString(b8g0Var.f74120j);
                            int i = b8g0Var.f74112b.f165190b;
                        }
                        b8g0Var.f74120j = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
