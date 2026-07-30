package p153l;

import Sudchar.Sudfor;
import Sudchar.Sudtry;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public final class ujg0 implements wng0, ztg0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f179219a = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    @Override // p153l.ztg0
    /* JADX INFO: renamed from: a */
    public final long mo126924a(jgg0 jgg0Var) throws IOException {
        long j = jgg0Var.f120721i;
        int i = jgg0Var.f120713a;
        boolean z = j != -1;
        vfg0 vfg0VarM142518a = jgg0Var.f120716d.m142518a();
        boolean z2 = z;
        long j2 = 0;
        while (true) {
            try {
                if (jgg0Var.f120720h == jgg0Var.f120718f.size()) {
                    jgg0Var.f120720h--;
                }
                long jM144774b = jgg0Var.m144774b();
                if (jM144774b == -1) {
                    break;
                }
                j2 += jM144774b;
            } catch (Throwable th) {
                long j3 = jgg0Var.f120723k;
                if (j3 != 0) {
                    jgg0Var.f120725m.f84561a.m169859b(jgg0Var.f120714b, jgg0Var.f120713a, j3);
                    jgg0Var.f120723k = 0L;
                }
                if (!jgg0Var.f120716d.f117402d) {
                    vfg0VarM142518a.m201124h(i);
                }
                throw th;
            }
        }
        long j4 = jgg0Var.f120723k;
        if (j4 != 0) {
            jgg0Var.f120725m.f84561a.m169859b(jgg0Var.f120714b, jgg0Var.f120713a, j4);
            jgg0Var.f120723k = 0L;
        }
        if (!jgg0Var.f120716d.f117402d) {
            vfg0VarM142518a.m201124h(i);
        }
        if (z2) {
            akg0 akg0Var = (akg0) vfg0VarM142518a.f183909i.f77680g.get(i);
            if (akg0Var.f72005c.get() != akg0Var.f72004b) {
                throw new IOException("The current offset on block-info isn't update correct, " + akg0Var.f72005c.get() + " != " + akg0Var.f72004b + " on " + i);
            }
            if (j2 != j) {
                hig0.m135122a("Fetch-length isn't equal to the response content-length, ", j2, "!= ", j);
                return 0L;
            }
        }
        return j2;
    }

    @Override // p153l.wng0
    /* JADX INFO: renamed from: b */
    public final vkg0 mo110337b(jgg0 jgg0Var) throws IOException {
        vkg0 vkg0VarM144775c = jgg0Var.m144775c();
        bog0 bog0Var = jgg0Var.f120715c;
        if (jgg0Var.f120716d.m142520c()) {
            throw Sudfor.f211027Suddo;
        }
        if (bog0Var.f77680g.size() == 1 && !bog0Var.f77682i) {
            rug0 rug0Var = (rug0) vkg0VarM144775c;
            String strM183191a = rug0Var.m183191a(HttpHeaders.CONTENT_RANGE);
            long j = -1;
            if (!ytg0.m217312d(strM183191a)) {
                Matcher matcher = f179219a.matcher(strM183191a);
                long j2 = matcher.find() ? Long.parseLong(matcher.group(1)) : -1L;
                if (j2 > 0) {
                    j = 1 + j2;
                }
            }
            if (j < 0) {
                String strM183191a2 = rug0Var.m183191a("Content-Length");
                if (!ytg0.m217312d(strM183191a2)) {
                    j = Long.parseLong(strM183191a2);
                }
            }
            long j3 = j;
            long jM105679c = bog0Var.m105679c();
            if (j3 > 0 && j3 != jM105679c) {
                akg0 akg0Var = (akg0) bog0Var.f77680g.get(0);
                boolean z = akg0Var.f72005c.get() + akg0Var.f72003a != 0;
                akg0 akg0Var2 = new akg0(0L, j3, 0L);
                bog0Var.f77680g.clear();
                bog0Var.f77680g.add(akg0Var2);
                if (z) {
                    throw new Sudtry();
                }
                jwg0.m147162a().f122920b.f84561a.m169864g(jgg0Var.f120714b, bog0Var, 8);
            }
        }
        try {
            if (jgg0Var.f120726n.mo97630b(bog0Var)) {
                return vkg0VarM144775c;
            }
            throw new IOException("Update store failed!");
        } catch (Exception e) {
            throw new IOException("Update store failed!", e);
        }
    }
}
