package p149l;

import Sudchar.Sudfor;
import Sudchar.Sudtry;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class mbg0 implements ofg0, rlg0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f133021a = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    @Override // p149l.rlg0
    /* JADX INFO: renamed from: a */
    public final long mo97895a(b8g0 b8g0Var) throws IOException {
        long j = b8g0Var.f74119i;
        int i = b8g0Var.f74111a;
        boolean z = j != -1;
        n7g0 n7g0VarM98117a = b8g0Var.f74114d.m98117a();
        boolean z2 = z;
        long j2 = 0;
        while (true) {
            try {
                if (b8g0Var.f74118h == b8g0Var.f74116f.size()) {
                    b8g0Var.f74118h--;
                }
                long jM100772b = b8g0Var.m100772b();
                if (jM100772b == -1) {
                    break;
                }
                j2 += jM100772b;
            } catch (Throwable th) {
                long j3 = b8g0Var.f74121k;
                if (j3 != 0) {
                    b8g0Var.f74123m.f182721a.m127587b(b8g0Var.f74112b, b8g0Var.f74111a, j3);
                    b8g0Var.f74121k = 0L;
                }
                if (!b8g0Var.f74114d.f71040d) {
                    n7g0VarM98117a.m158134h(i);
                }
                throw th;
            }
        }
        long j4 = b8g0Var.f74121k;
        if (j4 != 0) {
            b8g0Var.f74123m.f182721a.m127587b(b8g0Var.f74112b, b8g0Var.f74111a, j4);
            b8g0Var.f74121k = 0L;
        }
        if (!b8g0Var.f74114d.f71040d) {
            n7g0VarM98117a.m158134h(i);
        }
        if (z2) {
            sbg0 sbg0Var = (sbg0) n7g0VarM98117a.f137514i.f169981g.get(i);
            if (sbg0Var.f163536c.get() != sbg0Var.f163535b) {
                throw new IOException("The current offset on block-info isn't update correct, " + sbg0Var.f163536c.get() + " != " + sbg0Var.f163535b + " on " + i);
            }
            if (j2 != j) {
                z9g0.m217667a("Fetch-length isn't equal to the response content-length, ", j2, "!= ", j);
                return 0L;
            }
        }
        return j2;
    }

    @Override // p149l.ofg0
    /* JADX INFO: renamed from: b */
    public final ncg0 mo97896b(b8g0 b8g0Var) throws IOException {
        ncg0 ncg0VarM100773c = b8g0Var.m100773c();
        tfg0 tfg0Var = b8g0Var.f74113c;
        if (b8g0Var.f74114d.m98119c()) {
            throw Sudfor.f210105Suddo;
        }
        if (tfg0Var.f169981g.size() == 1 && !tfg0Var.f169983i) {
            jmg0 jmg0Var = (jmg0) ncg0VarM100773c;
            String strM142182a = jmg0Var.m142182a("Content-Range");
            long j = -1;
            if (!qlg0.m175481d(strM142182a)) {
                Matcher matcher = f133021a.matcher(strM142182a);
                long j2 = matcher.find() ? Long.parseLong(matcher.group(1)) : -1L;
                if (j2 > 0) {
                    j = 1 + j2;
                }
            }
            if (j < 0) {
                String strM142182a2 = jmg0Var.m142182a("Content-Length");
                if (!qlg0.m175481d(strM142182a2)) {
                    j = Long.parseLong(strM142182a2);
                }
            }
            long j3 = j;
            long jM188707c = tfg0Var.m188707c();
            if (j3 > 0 && j3 != jM188707c) {
                sbg0 sbg0Var = (sbg0) tfg0Var.f169981g.get(0);
                boolean z = sbg0Var.f163536c.get() + sbg0Var.f163534a != 0;
                sbg0 sbg0Var2 = new sbg0(0L, j3, 0L);
                tfg0Var.f169981g.clear();
                tfg0Var.f169981g.add(sbg0Var2);
                if (z) {
                    throw new Sudtry();
                }
                bog0.m102944a().f76516b.f182721a.m127592g(b8g0Var.f74112b, tfg0Var, 8);
            }
        }
        try {
            if (b8g0Var.f74124n.mo98391b(tfg0Var)) {
                return ncg0VarM100773c;
            }
            throw new IOException("Update store failed!");
        } catch (Exception e) {
            throw new IOException("Update store failed!", e);
        }
    }
}
